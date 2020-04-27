package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o.C3533kb;
import o.jH;
import o.jI;
import o.jK;
import o.jP;
import o.jQ;
import o.jY;
import o.jZ;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

public final class Http1Codec implements HttpCodec {
    private static final int HEADER_LIMIT = 262144;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    final OkHttpClient client;
    private long headerLimit = 262144;
    final jK sink;
    final jI source;
    int state = 0;
    final StreamAllocation streamAllocation;

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation2, jI jIVar, jK jKVar) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation2;
        this.source = jIVar;
        this.sink = jKVar;
    }

    public final jZ createRequestBody(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public final void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    public final void writeRequestHeaders(Request request) {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }

    public final ResponseBody openResponseBody(Response response) {
        this.streamAllocation.eventListener.responseBodyStart(this.streamAllocation.call);
        String header = response.header("Content-Type");
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(header, 0, jP.m2972(newFixedLengthSource(0)));
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return new RealResponseBody(header, -1, jP.m2972(newChunkedSource(response.request().url())));
        }
        long contentLength = HttpHeaders.contentLength(response);
        if (contentLength != -1) {
            return new RealResponseBody(header, contentLength, jP.m2972(newFixedLengthSource(contentLength)));
        }
        return new RealResponseBody(header, -1, jP.m2972(newUnknownLengthSource()));
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    public final void flushRequest() {
        this.sink.flush();
    }

    public final void finishRequest() {
        this.sink.flush();
    }

    public final void writeRequest(Headers headers, String str) {
        if (this.state == 0) {
            this.sink.m2942(str).m2942("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.m2942(headers.name(i)).m2942(": ").m2942(headers.value(i)).m2942("\r\n");
            }
            this.sink.m2942("\r\n");
            this.state = 1;
            return;
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final Response.Builder readResponseHeaders(boolean z) {
        int i = this.state;
        if (i == 1 || i == 3) {
            try {
                StatusLine parse = StatusLine.parse(readHeaderLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                StringBuilder sb = new StringBuilder("unexpected end of stream on ");
                sb.append(this.streamAllocation);
                IOException iOException = new IOException(sb.toString());
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.state);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private String readHeaderLine() {
        String r0 = this.source.m2912(this.headerLimit);
        this.headerLimit -= (long) r0.length();
        return r0;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readHeaderLine = readHeaderLine();
            if (readHeaderLine.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, readHeaderLine);
        }
    }

    public final jZ newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final jZ newFixedLengthSink(long j) {
        if (this.state == 1) {
            this.state = 2;
            return new FixedLengthSink(j);
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final jY newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final jY newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public final jY newUnknownLengthSource() {
        if (this.state == 4) {
            StreamAllocation streamAllocation2 = this.streamAllocation;
            if (streamAllocation2 != null) {
                this.state = 5;
                streamAllocation2.noNewStreams();
                return new UnknownLengthSource();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    final class FixedLengthSink implements jZ {
        private long bytesRemaining;
        private boolean closed;
        private final jQ timeout = new jQ(Http1Codec.this.sink.timeout());

        FixedLengthSink(long j) {
            this.bytesRemaining = j;
        }

        public final C3533kb timeout() {
            return this.timeout;
        }

        public final void write(jH jHVar, long j) {
            if (!this.closed) {
                Util.checkOffsetAndCount(jHVar.f2411, 0, j);
                if (j <= this.bytesRemaining) {
                    Http1Codec.this.sink.write(jHVar, j);
                    this.bytesRemaining -= j;
                    return;
                }
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.bytesRemaining);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
            throw new IllegalStateException("closed");
        }

        public final void flush() {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        public final void close() {
            if (!this.closed) {
                this.closed = true;
                if (this.bytesRemaining <= 0) {
                    Http1Codec.this.detachTimeout(this.timeout);
                    Http1Codec.this.state = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    final class ChunkedSink implements jZ {
        private boolean closed;
        private final jQ timeout = new jQ(Http1Codec.this.sink.timeout());

        ChunkedSink() {
        }

        public final C3533kb timeout() {
            return this.timeout;
        }

        public final void write(jH jHVar, long j) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                Http1Codec.this.sink.m2938(j);
                Http1Codec.this.sink.m2942("\r\n");
                Http1Codec.this.sink.write(jHVar, j);
                Http1Codec.this.sink.m2942("\r\n");
            }
        }

        public final synchronized void flush() {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        public final synchronized void close() {
            if (!this.closed) {
                this.closed = true;
                Http1Codec.this.sink.m2942("0\r\n\r\n");
                Http1Codec.this.detachTimeout(this.timeout);
                Http1Codec.this.state = 3;
            }
        }
    }

    abstract class AbstractSource implements jY {
        protected long bytesRead;
        protected boolean closed;
        protected final jQ timeout;

        private AbstractSource() {
            this.timeout = new jQ(Http1Codec.this.source.timeout());
            this.bytesRead = 0;
        }

        public C3533kb timeout() {
            return this.timeout;
        }

        public long read(jH jHVar, long j) {
            try {
                long read = Http1Codec.this.source.read(jHVar, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e) {
                endOfInput(false, e);
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        public final void endOfInput(boolean z, IOException iOException) {
            if (Http1Codec.this.state != 6) {
                if (Http1Codec.this.state == 5) {
                    Http1Codec.this.detachTimeout(this.timeout);
                    Http1Codec http1Codec = Http1Codec.this;
                    http1Codec.state = 6;
                    if (http1Codec.streamAllocation != null) {
                        Http1Codec.this.streamAllocation.streamFinished(!z, Http1Codec.this, this.bytesRead, iOException);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(Http1Codec.this.state);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (this.bytesRemaining == 0) {
                endOfInput(true, (IOException) null);
            }
        }

        public long read(jH jHVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (!this.closed) {
                long j2 = this.bytesRemaining;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(jHVar, Math.min(j2, j));
                if (read != -1) {
                    this.bytesRemaining -= read;
                    if (this.bytesRemaining == 0) {
                        endOfInput(true, (IOException) null);
                    }
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!this.closed) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, (IOException) null);
                }
                this.closed = true;
            }
        }
    }

    class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk = -1;
        private boolean hasMoreChunks = true;
        private final HttpUrl url;

        ChunkedSource(HttpUrl httpUrl) {
            super();
            this.url = httpUrl;
        }

        public long read(jH jHVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (!this.hasMoreChunks) {
                return -1;
            } else {
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == -1) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return -1;
                    }
                }
                long read = super.read(jHVar, Math.min(j, this.bytesRemainingInChunk));
                if (read != -1) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            }
        }

        private void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                Http1Codec.this.source.m2905();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.m2930();
                String trim = Http1Codec.this.source.m2905().trim();
                if (this.bytesRemainingInChunk < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    StringBuilder sb = new StringBuilder("expected chunk size and optional extensions but was \"");
                    sb.append(this.bytesRemainingInChunk);
                    sb.append(trim);
                    sb.append("\"");
                    throw new ProtocolException(sb.toString());
                } else if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true, (IOException) null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() {
            if (!this.closed) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, (IOException) null);
                }
                this.closed = true;
            }
        }
    }

    class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        UnknownLengthSource() {
            super();
        }

        public long read(jH jHVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = super.read(jHVar, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                endOfInput(true, (IOException) null);
                return -1;
            }
        }

        public void close() {
            if (!this.closed) {
                if (!this.inputExhausted) {
                    endOfInput(false, (IOException) null);
                }
                this.closed = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void detachTimeout(jQ jQVar) {
        C3533kb kbVar = jQVar.f2440;
        C3533kb kbVar2 = C3533kb.NONE;
        if (kbVar2 != null) {
            jQVar.f2440 = kbVar2;
            kbVar.clearDeadline();
            kbVar.clearTimeout();
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
