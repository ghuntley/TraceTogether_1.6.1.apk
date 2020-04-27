package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.nio.charset.Charset;
import o.jK;
import o.jM;
import o.jP;
import o.jY;
import okhttp3.internal.Util;

public abstract class RequestBody {
    public long contentLength() {
        return -1;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(jK jKVar);

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            StringBuilder sb = new StringBuilder();
            sb.append(mediaType);
            sb.append("; charset=utf-8");
            mediaType = MediaType.parse(sb.toString());
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(final MediaType mediaType, final jM jMVar) {
        return new RequestBody() {
            public MediaType contentType() {
                return MediaType.this;
            }

            public long contentLength() {
                return (long) jMVar.m2967();
            }

            public void writeTo(jK jKVar) {
                jKVar.m2934(jMVar);
            }
        };
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            return new RequestBody() {
                public MediaType contentType() {
                    return MediaType.this;
                }

                public long contentLength() {
                    return (long) i2;
                }

                public void writeTo(jK jKVar) {
                    jKVar.m2932(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() {
                public MediaType contentType() {
                    return MediaType.this;
                }

                public long contentLength() {
                    return file.length();
                }

                public void writeTo(jK jKVar) {
                    jY jYVar = null;
                    try {
                        jYVar = jP.m2973(file);
                        jKVar.m2940(jYVar);
                    } finally {
                        Util.closeQuietly((Closeable) jYVar);
                    }
                }
            };
        }
        throw new NullPointerException("file == null");
    }
}
