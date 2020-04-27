package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import o.jH;
import o.jI;
import o.jM;
import okhttp3.internal.Util;

public abstract class ResponseBody implements Closeable {
    private Reader reader;

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract jI source();

    public final InputStream byteStream() {
        return source().m2906();
    }

    /* JADX INFO: finally extract failed */
    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            jI source = source();
            try {
                byte[] r3 = source.m2927();
                Util.closeQuietly((Closeable) source);
                if (contentLength == -1 || contentLength == ((long) r3.length)) {
                    return r3;
                }
                StringBuilder sb = new StringBuilder("Content-Length (");
                sb.append(contentLength);
                sb.append(") and stream length (");
                sb.append(r3.length);
                sb.append(") disagree");
                throw new IOException(sb.toString());
            } catch (Throwable th) {
                Util.closeQuietly((Closeable) source);
                throw th;
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(contentLength)));
        }
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public final String string() {
        jI source = source();
        try {
            return source.m2913(Util.bomAwareCharset(source, charset()));
        } finally {
            Util.closeQuietly((Closeable) source);
        }
    }

    private Charset charset() {
        MediaType contentType = contentType();
        return contentType != null ? contentType.charset(Util.UTF_8) : Util.UTF_8;
    }

    public void close() {
        Util.closeQuietly((Closeable) source());
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            StringBuilder sb = new StringBuilder();
            sb.append(mediaType);
            sb.append("; charset=utf-8");
            mediaType = MediaType.parse(sb.toString());
        }
        jH r5 = new jH().m2878(str, 0, str.length(), charset);
        return create(mediaType, r5.f2411, r5);
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        jH jHVar = new jH();
        if (bArr != null) {
            return create(mediaType, (long) bArr.length, jHVar.m2840(bArr, 0, bArr.length));
        }
        throw new IllegalArgumentException("source == null");
    }

    public static ResponseBody create(MediaType mediaType, jM jMVar) {
        jH jHVar = new jH();
        if (jMVar != null) {
            jMVar.m2958(jHVar);
            return create(mediaType, (long) jMVar.m2967(), jHVar);
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public static ResponseBody create(final MediaType mediaType, final long j, final jI jIVar) {
        if (jIVar != null) {
            return new ResponseBody() {
                public MediaType contentType() {
                    return MediaType.this;
                }

                public long contentLength() {
                    return j;
                }

                public jI source() {
                    return jIVar;
                }
            };
        }
        throw new NullPointerException("source == null");
    }

    static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final jI source;

        BomAwareReader(jI jIVar, Charset charset2) {
            this.source = jIVar;
            this.charset = charset2;
        }

        public final int read(char[] cArr, int i, int i2) {
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.source.m2906(), Util.bomAwareCharset(this.source, this.charset));
                    this.delegate = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }

        public final void close() {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }
    }
}
