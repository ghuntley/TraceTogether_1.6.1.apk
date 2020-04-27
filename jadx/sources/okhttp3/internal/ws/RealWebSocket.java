package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.jI;
import o.jK;
import o.jM;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.ws.WebSocketReader;

public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<jM> pongQueue = new ArrayDeque<>();
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode = -1;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random2, long j) {
        if ("GET".equals(request.method())) {
            this.originalRequest = request;
            this.listener = webSocketListener;
            this.random = random2;
            this.pingIntervalMillis = j;
            byte[] bArr = new byte[16];
            random2.nextBytes(bArr);
            this.key = jM.m2947(bArr).m2957();
            this.writerRunnable = new Runnable() {
                public void run() {
                    do {
                        try {
                        } catch (IOException e) {
                            RealWebSocket.this.failWebSocket(e, (Response) null);
                            return;
                        }
                    } while (RealWebSocket.this.writeOneFrame());
                }
            };
            return;
        }
        StringBuilder sb = new StringBuilder("Request must be GET: ");
        sb.append(request.method());
        throw new IllegalArgumentException(sb.toString());
    }

    public final Request request() {
        return this.originalRequest;
    }

    public final synchronized long queueSize() {
        return this.queueSize;
    }

    public final void cancel() {
        this.call.cancel();
    }

    public final void connect(OkHttpClient okHttpClient) {
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        this.call = Internal.instance.newWebSocketCall(build, build2);
        this.call.timeout().clearTimeout();
        this.call.enqueue(new Callback() {
            public void onResponse(Call call, Response response) {
                try {
                    RealWebSocket.this.checkResponse(response);
                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        RealWebSocket.this.listener.onOpen(RealWebSocket.this, response);
                        StringBuilder sb = new StringBuilder("OkHttp WebSocket ");
                        sb.append(build2.url().redact());
                        RealWebSocket.this.initReaderAndWriter(sb.toString(), newWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        RealWebSocket.this.failWebSocket(e, (Response) null);
                    }
                } catch (ProtocolException e2) {
                    RealWebSocket.this.failWebSocket(e2, response);
                    Util.closeQuietly((Closeable) response);
                }
            }

            public void onFailure(Call call, IOException iOException) {
                RealWebSocket.this.failWebSocket(iOException, (Response) null);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void checkResponse(Response response) {
        if (response.code() == 101) {
            String header = response.header("Connection");
            if ("Upgrade".equalsIgnoreCase(header)) {
                String header2 = response.header("Upgrade");
                if ("websocket".equalsIgnoreCase(header2)) {
                    String header3 = response.header("Sec-WebSocket-Accept");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.key);
                    sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                    String r0 = jM.m2946(sb.toString()).m2959().m2957();
                    if (!r0.equals(header3)) {
                        StringBuilder sb2 = new StringBuilder("Expected 'Sec-WebSocket-Accept' header value '");
                        sb2.append(r0);
                        sb2.append("' but was '");
                        sb2.append(header3);
                        sb2.append("'");
                        throw new ProtocolException(sb2.toString());
                    }
                    return;
                }
                StringBuilder sb3 = new StringBuilder("Expected 'Upgrade' header value 'websocket' but was '");
                sb3.append(header2);
                sb3.append("'");
                throw new ProtocolException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder("Expected 'Connection' header value 'Upgrade' but was '");
            sb4.append(header);
            sb4.append("'");
            throw new ProtocolException(sb4.toString());
        }
        StringBuilder sb5 = new StringBuilder("Expected HTTP 101 response but was '");
        sb5.append(response.code());
        sb5.append(" ");
        sb5.append(response.message());
        sb5.append("'");
        throw new ProtocolException(sb5.toString());
    }

    public final void initReaderAndWriter(String str, Streams streams2) {
        synchronized (this) {
            this.streams = streams2;
            this.writer = new WebSocketWriter(streams2.client, streams2.sink, this.random);
            this.executor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            if (this.pingIntervalMillis != 0) {
                this.executor.scheduleAtFixedRate(new PingRunnable(), this.pingIntervalMillis, this.pingIntervalMillis, TimeUnit.MILLISECONDS);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        this.reader = new WebSocketReader(streams2.client, streams2.source, this);
    }

    public final void loopReader() {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean processNextFrame() {
        try {
            this.reader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            failWebSocket(e, (Response) null);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void awaitTermination(int i, TimeUnit timeUnit) {
        this.executor.awaitTermination((long) i, timeUnit);
    }

    /* access modifiers changed from: package-private */
    public final void tearDown() {
        ScheduledFuture<?> scheduledFuture = this.cancelFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.executor.shutdown();
        this.executor.awaitTermination(10, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    /* access modifiers changed from: package-private */
    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    /* access modifiers changed from: package-private */
    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    public final void onReadMessage(String str) {
        this.listener.onMessage((WebSocket) this, str);
    }

    public final void onReadMessage(jM jMVar) {
        this.listener.onMessage((WebSocket) this, jMVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onReadPing(o.jM r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.failed     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.enqueuedClose     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.util.ArrayDeque<o.jM> r0 = r1.pongQueue     // Catch:{ all -> 0x0024 }
            r0.add(r2)     // Catch:{ all -> 0x0024 }
            r1.runWriter()     // Catch:{ all -> 0x0024 }
            int r2 = r1.receivedPingCount     // Catch:{ all -> 0x0024 }
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.onReadPing(o.jM):void");
    }

    public final synchronized void onReadPong(jM jMVar) {
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final void onReadClose(int i, String str) {
        Streams streams2;
        if (i != -1) {
            synchronized (this) {
                if (this.receivedCloseCode == -1) {
                    this.receivedCloseCode = i;
                    this.receivedCloseReason = str;
                    if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                        streams2 = null;
                    } else {
                        streams2 = this.streams;
                        this.streams = null;
                        if (this.cancelFuture != null) {
                            this.cancelFuture.cancel(false);
                        }
                        this.executor.shutdown();
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                this.listener.onClosing(this, i, str);
                if (streams2 != null) {
                    this.listener.onClosed(this, i, str);
                }
            } finally {
                Util.closeQuietly((Closeable) streams2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final boolean send(String str) {
        if (str != null) {
            return send(jM.m2946(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    public final boolean send(jM jMVar) {
        if (jMVar != null) {
            return send(jMVar, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean send(o.jM r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.enqueuedClose     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r0 = r7.m2967()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r2 = r7.m2967()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch:{ all -> 0x003e }
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.runWriter()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.send(o.jM, int):boolean");
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean pong(jM jMVar) {
        if (!this.failed) {
            if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                this.pongQueue.add(jMVar);
                runWriter();
                return true;
            }
        }
        return false;
    }

    public final boolean close(int i, String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean close(int i, String str, long j) {
        WebSocketProtocol.validateCloseCode(i);
        jM jMVar = null;
        if (str != null) {
            jMVar = jM.m2946(str);
            if (((long) jMVar.m2967()) > 123) {
                throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
            }
        }
        if (!this.failed) {
            if (!this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i, jMVar, j));
                runWriter();
                return true;
            }
        }
        return false;
    }

    private void runWriter() {
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.writerRunnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r2 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.writePong(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if ((r4 instanceof okhttp3.internal.ws.RealWebSocket.Message) == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r1 = ((okhttp3.internal.ws.RealWebSocket.Message) r4).data;
        r0 = o.jP.m2979(r0.newMessageSink(((okhttp3.internal.ws.RealWebSocket.Message) r4).formatOpcode, (long) r1.m2967()));
        r0.m2934(r1);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r11.queueSize -= (long) r1.m2967();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if ((r4 instanceof okhttp3.internal.ws.RealWebSocket.Close) == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        r4 = (okhttp3.internal.ws.RealWebSocket.Close) r4;
        r0.writeClose(r4.code, r4.reason);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        if (r3 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        r11.listener.onClosed(r11, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a3, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean writeOneFrame() {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.failed     // Catch:{ all -> 0x00a9 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r11)     // Catch:{ all -> 0x00a9 }
            return r1
        L_0x0008:
            okhttp3.internal.ws.WebSocketWriter r0 = r11.writer     // Catch:{ all -> 0x00a9 }
            java.util.ArrayDeque<o.jM> r2 = r11.pongQueue     // Catch:{ all -> 0x00a9 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00a9 }
            o.jM r2 = (o.jM) r2     // Catch:{ all -> 0x00a9 }
            r3 = 0
            if (r2 != 0) goto L_0x004c
            java.util.ArrayDeque<java.lang.Object> r4 = r11.messageAndCloseQueue     // Catch:{ all -> 0x00a9 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x00a9 }
            boolean r5 = r4 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch:{ all -> 0x00a9 }
            if (r5 == 0) goto L_0x0046
            int r1 = r11.receivedCloseCode     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = r11.receivedCloseReason     // Catch:{ all -> 0x00a9 }
            r6 = -1
            if (r1 == r6) goto L_0x0031
            okhttp3.internal.ws.RealWebSocket$Streams r6 = r11.streams     // Catch:{ all -> 0x00a9 }
            r11.streams = r3     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.ScheduledExecutorService r3 = r11.executor     // Catch:{ all -> 0x00a9 }
            r3.shutdown()     // Catch:{ all -> 0x00a9 }
            r3 = r6
            goto L_0x004e
        L_0x0031:
            java.util.concurrent.ScheduledExecutorService r6 = r11.executor     // Catch:{ all -> 0x00a9 }
            okhttp3.internal.ws.RealWebSocket$CancelRunnable r7 = new okhttp3.internal.ws.RealWebSocket$CancelRunnable     // Catch:{ all -> 0x00a9 }
            r7.<init>()     // Catch:{ all -> 0x00a9 }
            r8 = r4
            okhttp3.internal.ws.RealWebSocket$Close r8 = (okhttp3.internal.ws.RealWebSocket.Close) r8     // Catch:{ all -> 0x00a9 }
            long r8 = r8.cancelAfterCloseMillis     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.ScheduledFuture r6 = r6.schedule(r7, r8, r10)     // Catch:{ all -> 0x00a9 }
            r11.cancelFuture = r6     // Catch:{ all -> 0x00a9 }
            goto L_0x004e
        L_0x0046:
            if (r4 != 0) goto L_0x004a
            monitor-exit(r11)     // Catch:{ all -> 0x00a9 }
            return r1
        L_0x004a:
            r5 = r3
            goto L_0x004e
        L_0x004c:
            r4 = r3
            r5 = r4
        L_0x004e:
            monitor-exit(r11)
            if (r2 == 0) goto L_0x0055
            r0.writePong(r2)     // Catch:{ all -> 0x00a4 }
            goto L_0x0099
        L_0x0055:
            boolean r2 = r4 instanceof okhttp3.internal.ws.RealWebSocket.Message     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0085
            r1 = r4
            okhttp3.internal.ws.RealWebSocket$Message r1 = (okhttp3.internal.ws.RealWebSocket.Message) r1     // Catch:{ all -> 0x00a4 }
            o.jM r1 = r1.data     // Catch:{ all -> 0x00a4 }
            okhttp3.internal.ws.RealWebSocket$Message r4 = (okhttp3.internal.ws.RealWebSocket.Message) r4     // Catch:{ all -> 0x00a4 }
            int r2 = r4.formatOpcode     // Catch:{ all -> 0x00a4 }
            int r4 = r1.m2967()     // Catch:{ all -> 0x00a4 }
            long r4 = (long) r4     // Catch:{ all -> 0x00a4 }
            o.jZ r0 = r0.newMessageSink(r2, r4)     // Catch:{ all -> 0x00a4 }
            o.jK r0 = o.jP.m2979((o.jZ) r0)     // Catch:{ all -> 0x00a4 }
            r0.m2934((o.jM) r1)     // Catch:{ all -> 0x00a4 }
            r0.close()     // Catch:{ all -> 0x00a4 }
            monitor-enter(r11)     // Catch:{ all -> 0x00a4 }
            long r4 = r11.queueSize     // Catch:{ all -> 0x0082 }
            int r0 = r1.m2967()     // Catch:{ all -> 0x0082 }
            long r0 = (long) r0     // Catch:{ all -> 0x0082 }
            long r4 = r4 - r0
            r11.queueSize = r4     // Catch:{ all -> 0x0082 }
            monitor-exit(r11)     // Catch:{ all -> 0x0082 }
            goto L_0x0099
        L_0x0082:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x0085:
            boolean r2 = r4 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x009e
            okhttp3.internal.ws.RealWebSocket$Close r4 = (okhttp3.internal.ws.RealWebSocket.Close) r4     // Catch:{ all -> 0x00a4 }
            int r2 = r4.code     // Catch:{ all -> 0x00a4 }
            o.jM r4 = r4.reason     // Catch:{ all -> 0x00a4 }
            r0.writeClose(r2, r4)     // Catch:{ all -> 0x00a4 }
            if (r3 == 0) goto L_0x0099
            okhttp3.WebSocketListener r0 = r11.listener     // Catch:{ all -> 0x00a4 }
            r0.onClosed(r11, r1, r5)     // Catch:{ all -> 0x00a4 }
        L_0x0099:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
            r0 = 1
            return r0
        L_0x009e:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00a4 }
            r0.<init>()     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
            throw r0
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.writeOneFrame():boolean");
    }

    final class PingRunnable implements Runnable {
        PingRunnable() {
        }

        public final void run() {
            RealWebSocket.this.writePingFrame();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r1 == -1) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r2 = new java.lang.StringBuilder("sent ping but didn't receive pong within ");
        r2.append(r7.pingIntervalMillis);
        r2.append("ms (after ");
        r2.append(r1 - 1);
        r2.append(" successful ping/pongs)");
        failWebSocket(new java.net.SocketTimeoutException(r2.toString()), (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.writePing(o.jM.f2423);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        failWebSocket(r0, (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writePingFrame() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.failed     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)     // Catch:{ all -> 0x0050 }
            return
        L_0x0007:
            okhttp3.internal.ws.WebSocketWriter r0 = r7.writer     // Catch:{ all -> 0x0050 }
            boolean r1 = r7.awaitingPong     // Catch:{ all -> 0x0050 }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r7.sentPingCount     // Catch:{ all -> 0x0050 }
            goto L_0x0012
        L_0x0011:
            r1 = -1
        L_0x0012:
            int r3 = r7.sentPingCount     // Catch:{ all -> 0x0050 }
            r4 = 1
            int r3 = r3 + r4
            r7.sentPingCount = r3     // Catch:{ all -> 0x0050 }
            r7.awaitingPong = r4     // Catch:{ all -> 0x0050 }
            monitor-exit(r7)     // Catch:{ all -> 0x0050 }
            r3 = 0
            if (r1 == r2) goto L_0x0045
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.<init>(r5)
            long r5 = r7.pingIntervalMillis
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.failWebSocket(r0, r3)
            return
        L_0x0045:
            o.jM r1 = o.jM.f2423     // Catch:{ IOException -> 0x004b }
            r0.writePing(r1)     // Catch:{ IOException -> 0x004b }
            return
        L_0x004b:
            r0 = move-exception
            r7.failWebSocket(r0, r3)
            return
        L_0x0050:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.writePingFrame():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.listener.onFailure(r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void failWebSocket(java.lang.Exception r4, okhttp3.Response r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.failed     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0007:
            r0 = 1
            r3.failed = r0     // Catch:{ all -> 0x0031 }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r3.streams     // Catch:{ all -> 0x0031 }
            r1 = 0
            r3.streams = r1     // Catch:{ all -> 0x0031 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.cancelFuture     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0019
            java.util.concurrent.ScheduledFuture<?> r1 = r3.cancelFuture     // Catch:{ all -> 0x0031 }
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0031 }
        L_0x0019:
            java.util.concurrent.ScheduledExecutorService r1 = r3.executor     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0022
            java.util.concurrent.ScheduledExecutorService r1 = r3.executor     // Catch:{ all -> 0x0031 }
            r1.shutdown()     // Catch:{ all -> 0x0031 }
        L_0x0022:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            okhttp3.WebSocketListener r1 = r3.listener     // Catch:{ all -> 0x002c }
            r1.onFailure(r3, r4, r5)     // Catch:{ all -> 0x002c }
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
            return
        L_0x002c:
            r4 = move-exception
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
            throw r4
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.failWebSocket(java.lang.Exception, okhttp3.Response):void");
    }

    static final class Message {
        final jM data;
        final int formatOpcode;

        Message(int i, jM jMVar) {
            this.formatOpcode = i;
            this.data = jMVar;
        }
    }

    static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final jM reason;

        Close(int i, jM jMVar, long j) {
            this.code = i;
            this.reason = jMVar;
            this.cancelAfterCloseMillis = j;
        }
    }

    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final jK sink;
        public final jI source;

        public Streams(boolean z, jI jIVar, jK jKVar) {
            this.client = z;
            this.source = jIVar;
            this.sink = jKVar;
        }
    }

    final class CancelRunnable implements Runnable {
        CancelRunnable() {
        }

        public final void run() {
            RealWebSocket.this.cancel();
        }
    }
}
