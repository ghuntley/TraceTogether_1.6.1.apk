package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.jH;
import o.jK;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final jH hpackBuffer = new jH();
    final Hpack.Writer hpackWriter = new Hpack.Writer(this.hpackBuffer);
    private int maxFrameSize = 16384;
    private final jK sink;

    Http2Writer(jK jKVar, boolean z) {
        this.sink = jKVar;
        this.client = z;
    }

    public final synchronized void connectionPreface() {
        if (this.closed) {
            throw new IOException("closed");
        } else if (this.client) {
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.m2965()));
            }
            this.sink.m2935(Http2.CONNECTION_PREFACE.m2960());
            this.sink.flush();
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) {
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, (byte) 4, (byte) 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void pushPromise(int i, int i2, List<Header> list) {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long j = this.hpackBuffer.f2411;
            int min = (int) Math.min((long) (this.maxFrameSize - 4), j);
            long j2 = (long) min;
            int i3 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            frameHeader(i, min + 4, (byte) 5, i3 == 0 ? (byte) 4 : 0);
            this.sink.m2939(i2 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j2);
            if (i3 > 0) {
                writeContinuationFrames(i, j - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void synStream(boolean z, int i, int i2, List<Header> list) {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void synReply(boolean z, int i, List<Header> list) {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void headers(int i, List<Header> list) {
        if (!this.closed) {
            headers(false, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void rstStream(int i, ErrorCode errorCode) {
        if (this.closed) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            frameHeader(i, 4, (byte) 3, (byte) 0);
            this.sink.m2939(errorCode.httpCode);
            this.sink.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void data(boolean z, int i, jH jHVar, int i2) {
        if (!this.closed) {
            dataFrame(i, z ? (byte) 1 : 0, jHVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public final void dataFrame(int i, byte b, jH jHVar, int i2) {
        frameHeader(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.sink.write(jHVar, (long) i2);
        }
    }

    public final synchronized void settings(Settings settings) {
        if (!this.closed) {
            int i = 0;
            frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (settings.isSet(i)) {
                    this.sink.m2944(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.sink.m2939(settings.get(i));
                }
                i++;
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void ping(boolean z, int i, int i2) {
        if (!this.closed) {
            frameHeader(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.sink.m2939(i);
            this.sink.m2939(i2);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) {
        if (this.closed) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.sink.m2939(i);
            this.sink.m2939(errorCode.httpCode);
            if (bArr.length > 0) {
                this.sink.m2935(bArr);
            }
            this.sink.flush();
        } else {
            throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public final synchronized void windowUpdate(int i, long j) {
        if (this.closed) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            frameHeader(i, 4, (byte) 8, (byte) 0);
            this.sink.m2939((int) j);
            this.sink.flush();
        }
    }

    public final void frameHeader(int i, int i2, byte b, byte b2) {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.frameLog(false, i, i2, b, b2));
        }
        int i3 = this.maxFrameSize;
        if (i2 > i3) {
            throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            writeMedium(this.sink, i2);
            this.sink.m2945(b & 255);
            this.sink.m2945(b2 & 255);
            this.sink.m2939(i & Integer.MAX_VALUE);
        } else {
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    public final synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    private static void writeMedium(jK jKVar, int i) {
        jKVar.m2945((i >>> 16) & 255);
        jKVar.m2945((i >>> 8) & 255);
        jKVar.m2945(i & 255);
    }

    private void writeContinuationFrames(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.maxFrameSize, j);
            long j2 = (long) min;
            j -= j2;
            frameHeader(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.sink.write(this.hpackBuffer, j2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void headers(boolean z, int i, List<Header> list) {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long j = this.hpackBuffer.f2411;
            int min = (int) Math.min((long) this.maxFrameSize, j);
            long j2 = (long) min;
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            byte b = i2 == 0 ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            frameHeader(i, min, (byte) 1, b);
            this.sink.write(this.hpackBuffer, j2);
            if (i2 > 0) {
                writeContinuationFrames(i, j - j2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
