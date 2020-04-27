package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import o.C3533kb;
import o.jE;
import o.jH;
import o.jI;
import o.jY;
import o.jZ;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;

public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    final Http2Connection connection;
    ErrorCode errorCode = null;
    private boolean hasResponseHeaders;
    /* access modifiers changed from: private */
    public Header.Listener headersListener;
    /* access modifiers changed from: private */
    public final Deque<Headers> headersQueue = new ArrayDeque();
    final int id;
    final StreamTimeout readTimeout = new StreamTimeout();
    final FramingSink sink;
    private final FramingSource source;
    long unacknowledgedBytesRead = 0;
    final StreamTimeout writeTimeout = new StreamTimeout();

    Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        if (http2Connection != null) {
            this.id = i;
            this.connection = http2Connection;
            this.bytesLeftInWriteWindow = (long) http2Connection.peerSettings.getInitialWindowSize();
            this.source = new FramingSource((long) http2Connection.okHttpSettings.getInitialWindowSize());
            this.sink = new FramingSink();
            this.source.finished = z2;
            this.sink.finished = z;
            if (headers != null) {
                this.headersQueue.add(headers);
            }
            if (isLocallyInitiated() && headers != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!isLocallyInitiated() && headers == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    public final int getId() {
        return this.id;
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.finished || this.source.closed) && ((this.sink.finished || this.sink.closed) && this.hasResponseHeaders)) {
            return false;
        }
        return true;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.client == ((this.id & 1) == 1);
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r2.readTimeout.exitAndThrowIfTimedOut();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.Headers takeHeaders() {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch:{ all -> 0x003c }
            r0.enter()     // Catch:{ all -> 0x003c }
        L_0x0006:
            java.util.Deque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0016
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0016
            r2.waitForIo()     // Catch:{ all -> 0x0035 }
            goto L_0x0006
        L_0x0016:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch:{ all -> 0x003c }
            r0.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x003c }
            java.util.Deque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x003c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x003c }
            okhttp3.Headers r0 = (okhttp3.Headers) r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)
            return r0
        L_0x002d:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x003c }
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch:{ all -> 0x003c }
            r0.<init>(r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r0 = move-exception
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch:{ all -> 0x003c }
            r1.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.takeHeaders():okhttp3.Headers");
    }

    public final synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final void writeHeaders(List<Header> list, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (list != null) {
            synchronized (this) {
                z2 = true;
                this.hasResponseHeaders = true;
                if (!z) {
                    this.sink.finished = true;
                    z3 = true;
                    z4 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
            }
            if (!z3) {
                synchronized (this.connection) {
                    if (this.connection.bytesLeftInWriteWindow != 0) {
                        z2 = false;
                    }
                }
                z3 = z2;
            }
            this.connection.writeSynReply(this.id, z4, list);
            if (z3) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public final C3533kb readTimeout() {
        return this.readTimeout;
    }

    public final C3533kb writeTimeout() {
        return this.writeTimeout;
    }

    public final jY getSource() {
        return this.source;
    }

    public final jZ getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders) {
                if (!isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.sink;
    }

    public final void close(ErrorCode errorCode2) {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynReset(this.id, errorCode2);
        }
    }

    public final void closeLater(ErrorCode errorCode2) {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynResetLater(this.id, errorCode2);
        }
    }

    private boolean closeInternal(ErrorCode errorCode2) {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode2;
            notifyAll();
            this.connection.removeStream(this.id);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void receiveHeaders(List<Header> list) {
        boolean isOpen;
        synchronized (this) {
            this.hasResponseHeaders = true;
            this.headersQueue.add(Util.toHeaders(list));
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.id);
        }
    }

    /* access modifiers changed from: package-private */
    public final void receiveData(jI jIVar, int i) {
        this.source.receive(jIVar, (long) i);
    }

    /* access modifiers changed from: package-private */
    public final void receiveFin() {
        boolean isOpen;
        synchronized (this) {
            this.source.finished = true;
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.id);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void receiveRstStream(ErrorCode errorCode2) {
        if (this.errorCode == null) {
            this.errorCode = errorCode2;
            notifyAll();
        }
    }

    public final synchronized void setHeadersListener(Header.Listener listener) {
        this.headersListener = listener;
        if (!this.headersQueue.isEmpty() && listener != null) {
            notifyAll();
        }
    }

    final class FramingSource implements jY {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private final jH readBuffer = new jH();
        private final jH receiveBuffer = new jH();

        static {
            Class<Http2Stream> cls = Http2Stream.class;
        }

        FramingSource(long j) {
            this.maxByteCount = j;
        }

        public final long read(jH jHVar, long j) {
            ErrorCode errorCode;
            long j2;
            Header.Listener listener;
            Headers headers;
            long j3 = j;
            if (j3 >= 0) {
                while (true) {
                    synchronized (Http2Stream.this) {
                        Http2Stream.this.readTimeout.enter();
                        try {
                            errorCode = Http2Stream.this.errorCode != null ? Http2Stream.this.errorCode : null;
                            if (!this.closed) {
                                if (Http2Stream.this.headersQueue.isEmpty() || Http2Stream.this.headersListener == null) {
                                    if (this.readBuffer.f2411 > 0) {
                                        j2 = this.readBuffer.read(jHVar, Math.min(j3, this.readBuffer.f2411));
                                        Http2Stream.this.unacknowledgedBytesRead += j2;
                                        if (errorCode == null && Http2Stream.this.unacknowledgedBytesRead >= ((long) (Http2Stream.this.connection.okHttpSettings.getInitialWindowSize() / 2))) {
                                            Http2Stream.this.connection.writeWindowUpdateLater(Http2Stream.this.id, Http2Stream.this.unacknowledgedBytesRead);
                                            Http2Stream.this.unacknowledgedBytesRead = 0;
                                        }
                                    } else {
                                        jH jHVar2 = jHVar;
                                        if (this.finished || errorCode != null) {
                                            j2 = -1;
                                        } else {
                                            Http2Stream.this.waitForIo();
                                        }
                                    }
                                    headers = null;
                                    listener = null;
                                } else {
                                    headers = (Headers) Http2Stream.this.headersQueue.removeFirst();
                                    listener = Http2Stream.this.headersListener;
                                    jH jHVar3 = jHVar;
                                    j2 = -1;
                                }
                                Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                                if (headers != null && listener != null) {
                                    listener.onHeaders(headers);
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                        }
                    }
                }
                if (j2 != -1) {
                    updateConnectionFlowControl(j2);
                    return j2;
                } else if (errorCode == null) {
                    return -1;
                } else {
                    throw new StreamResetException(errorCode);
                }
            } else {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
        }

        private void updateConnectionFlowControl(long j) {
            Http2Stream.this.connection.updateConnectionFlowControl(j);
        }

        /* access modifiers changed from: package-private */
        public final void receive(jI jIVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    z2 = true;
                    z3 = this.readBuffer.f2411 + j > this.maxByteCount;
                }
                if (z3) {
                    jIVar.m2928(j);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    jIVar.m2928(j);
                    return;
                } else {
                    long read = jIVar.read(this.receiveBuffer, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (Http2Stream.this) {
                            if (this.readBuffer.f2411 != 0) {
                                z2 = false;
                            }
                            this.readBuffer.m2875((jY) this.receiveBuffer);
                            if (z2) {
                                Http2Stream.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public final C3533kb timeout() {
            return Http2Stream.this.readTimeout;
        }

        public final void close() {
            long j;
            ArrayList<Headers> arrayList;
            Header.Listener listener;
            synchronized (Http2Stream.this) {
                this.closed = true;
                j = this.readBuffer.f2411;
                jH jHVar = this.readBuffer;
                try {
                    jHVar.m2896(jHVar.f2411);
                    arrayList = null;
                    if (Http2Stream.this.headersQueue.isEmpty() || Http2Stream.this.headersListener == null) {
                        listener = null;
                    } else {
                        arrayList = new ArrayList<>(Http2Stream.this.headersQueue);
                        Http2Stream.this.headersQueue.clear();
                        listener = Http2Stream.this.headersListener;
                    }
                    Http2Stream.this.notifyAll();
                } catch (EOFException e) {
                    throw new AssertionError(e);
                }
            }
            if (j > 0) {
                updateConnectionFlowControl(j);
            }
            Http2Stream.this.cancelStreamIfNecessary();
            if (listener != null) {
                for (Headers onHeaders : arrayList) {
                    listener.onHeaders(onHeaders);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void cancelStreamIfNecessary() {
        boolean z;
        boolean isOpen;
        synchronized (this) {
            z = !this.source.finished && this.source.closed && (this.sink.finished || this.sink.closed);
            isOpen = isOpen();
        }
        if (z) {
            close(ErrorCode.CANCEL);
        } else if (!isOpen) {
            this.connection.removeStream(this.id);
        }
    }

    final class FramingSink implements jZ {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        boolean closed;
        boolean finished;
        private final jH sendBuffer = new jH();

        static {
            Class<Http2Stream> cls = Http2Stream.class;
        }

        FramingSink() {
        }

        public final void write(jH jHVar, long j) {
            this.sendBuffer.write(jHVar, j);
            while (this.sendBuffer.f2411 >= EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }

        /* JADX INFO: finally extract failed */
        private void emitFrame(boolean z) {
            long min;
            synchronized (Http2Stream.this) {
                Http2Stream.this.writeTimeout.enter();
                while (Http2Stream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                    try {
                        Http2Stream.this.waitForIo();
                    } catch (Throwable th) {
                        Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed();
                min = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.f2411);
                Http2Stream.this.bytesLeftInWriteWindow -= min;
            }
            Http2Stream.this.writeTimeout.enter();
            try {
                Http2Stream.this.connection.writeData(Http2Stream.this.id, z && min == this.sendBuffer.f2411, this.sendBuffer, min);
            } finally {
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
            }
        }

        public final void flush() {
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.f2411 > 0) {
                emitFrame(false);
                Http2Stream.this.connection.flush();
            }
        }

        public final C3533kb timeout() {
            return Http2Stream.this.writeTimeout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r8.sendBuffer.f2411 <= 0) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            if (r8.sendBuffer.f2411 <= 0) goto L_0x0038;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            emitFrame(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            r8.this$0.connection.writeData(r8.this$0.id, true, (o.jH) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
            r0 = r8.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.closed = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
            r8.this$0.connection.flush();
            r8.this$0.cancelStreamIfNecessary();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.this$0.sink.finished != false) goto L_0x0038;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
                r8 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                boolean r1 = r8.closed     // Catch:{ all -> 0x004e }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x004e }
                return
            L_0x0009:
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.sink
                boolean r0 = r0.finished
                r1 = 1
                if (r0 != 0) goto L_0x0038
                o.jH r0 = r8.sendBuffer
                long r2 = r0.f2411
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0029
            L_0x001d:
                o.jH r0 = r8.sendBuffer
                long r2 = r0.f2411
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0038
                r8.emitFrame(r1)
                goto L_0x001d
            L_0x0029:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r2 = r0.connection
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                int r3 = r0.id
                r4 = 1
                r5 = 0
                r6 = 0
                r2.writeData(r3, r4, r5, r6)
            L_0x0038:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                r8.closed = r1     // Catch:{ all -> 0x004b }
                monitor-exit(r0)     // Catch:{ all -> 0x004b }
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.connection
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                r0.cancelStreamIfNecessary()
                return
            L_0x004b:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x004e:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
        }
    }

    /* access modifiers changed from: package-private */
    public final void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public final void checkOutNotClosed() {
        if (this.sink.closed) {
            throw new IOException("stream closed");
        } else if (!this.sink.finished) {
            ErrorCode errorCode2 = this.errorCode;
            if (errorCode2 != null) {
                throw new StreamResetException(errorCode2);
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    /* access modifiers changed from: package-private */
    public final void waitForIo() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    class StreamTimeout extends jE {
        StreamTimeout() {
        }

        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
        }

        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void exitAndThrowIfTimedOut() {
            if (exit()) {
                throw newTimeoutException((IOException) null);
            }
        }
    }
}
