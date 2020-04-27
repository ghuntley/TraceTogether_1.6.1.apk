package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C3533kb;
import o.jH;
import o.jI;
import o.jM;
import o.jY;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

final class Http2Reader implements Closeable {
    static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private final ContinuationSource continuation = new ContinuationSource(this.source);
    final Hpack.Reader hpackReader = new Hpack.Reader(C0872.f5653, this.continuation);
    private final jI source;

    interface Handler {
        void ackSettings();

        void alternateService(int i, String str, jM jMVar, String str2, int i2, long j);

        void data(boolean z, int i, jI jIVar, int i2);

        void goAway(int i, ErrorCode errorCode, jM jMVar);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list);

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    Http2Reader(jI jIVar, boolean z) {
        this.source = jIVar;
        this.client = z;
    }

    public final void readConnectionPreface(Handler handler) {
        if (!this.client) {
            jM r6 = this.source.m2922((long) Http2.CONNECTION_PREFACE.m2967());
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Util.format("<< CONNECTION %s", r6.m2965()));
            }
            if (!Http2.CONNECTION_PREFACE.equals(r6)) {
                throw Http2.ioException("Expected a connection header but was %s", r6.m2961());
            }
        } else if (!nextFrame(true, handler)) {
            throw Http2.ioException("Required SETTINGS preface not received", new Object[0]);
        }
    }

    public final boolean nextFrame(boolean z, Handler handler) {
        try {
            this.source.m2903(9);
            int readMedium = readMedium(this.source);
            if (readMedium < 0 || readMedium > 16384) {
                throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(readMedium));
            }
            byte r3 = (byte) this.source.m2915();
            if (!z || r3 == 4) {
                byte r7 = (byte) this.source.m2915();
                int r0 = this.source.m2929() & Integer.MAX_VALUE;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Http2.frameLog(true, r0, readMedium, r3, r7));
                }
                switch (r3) {
                    case 0:
                        readData(handler, readMedium, r7, r0);
                        break;
                    case 1:
                        readHeaders(handler, readMedium, r7, r0);
                        break;
                    case 2:
                        readPriority(handler, readMedium, r7, r0);
                        break;
                    case 3:
                        readRstStream(handler, readMedium, r7, r0);
                        break;
                    case 4:
                        readSettings(handler, readMedium, r7, r0);
                        break;
                    case 5:
                        readPushPromise(handler, readMedium, r7, r0);
                        break;
                    case 6:
                        readPing(handler, readMedium, r7, r0);
                        break;
                    case 7:
                        readGoAway(handler, readMedium, r7, r0);
                        break;
                    case 8:
                        readWindowUpdate(handler, readMedium, r7, r0);
                        break;
                    default:
                        this.source.m2928((long) readMedium);
                        break;
                }
                return true;
            }
            throw Http2.ioException("Expected a SETTINGS frame but was %s", Byte.valueOf(r3));
        } catch (IOException unused) {
            return false;
        }
    }

    private void readHeaders(Handler handler, int i, byte b, int i2) {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.source.m2915() & 255);
            }
            if ((b & 32) != 0) {
                readPriority(handler, i2);
                i -= 5;
            }
            handler.headers(z, i2, -1, readHeaderBlock(lengthWithoutPadding(i, b, s), s, b, i2));
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    private List<Header> readHeaderBlock(int i, short s, byte b, int i2) {
        ContinuationSource continuationSource = this.continuation;
        continuationSource.left = i;
        continuationSource.length = i;
        continuationSource.padding = s;
        continuationSource.flags = b;
        continuationSource.streamId = i2;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private void readData(Handler handler, int i, byte b, int i2) {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.source.m2915() & 255);
                }
                handler.data(z2, i2, this.source, lengthWithoutPadding(i, b, s));
                this.source.m2928((long) s);
                return;
            }
            throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    private void readPriority(Handler handler, int i, byte b, int i2) {
        if (i != 5) {
            throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        } else if (i2 != 0) {
            readPriority(handler, i2);
        } else {
            throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
    }

    private void readPriority(Handler handler, int i) {
        int r0 = this.source.m2929();
        handler.priority(i, r0 & Integer.MAX_VALUE, (this.source.m2915() & 255) + 1, (Integer.MIN_VALUE & r0) != 0);
    }

    private void readRstStream(Handler handler, int i, byte b, int i2) {
        if (i != 4) {
            throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        } else if (i2 != 0) {
            int r4 = this.source.m2929();
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(r4);
            if (fromHttp2 != null) {
                handler.rstStream(i2, fromHttp2);
            } else {
                throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(r4));
            }
        } else {
            throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
    }

    private void readSettings(Handler handler, int i, byte b, int i2) {
        if (i2 != 0) {
            throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b & 1) != 0) {
            if (i == 0) {
                handler.ackSettings();
                return;
            }
            throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        } else if (i % 6 == 0) {
            Settings settings = new Settings();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short r2 = this.source.m2926() & 65535;
                int r3 = this.source.m2929();
                if (r2 != 1) {
                    if (r2 != 2) {
                        if (r2 == 3) {
                            r2 = 4;
                        } else if (r2 == 4) {
                            r2 = 7;
                            if (r3 < 0) {
                                throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                        } else if (r2 == 5 && (r3 < 16384 || r3 > 16777215)) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(r3));
                        }
                    } else if (!(r3 == 0 || r3 == 1)) {
                        throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    }
                }
                settings.set(r2, r3);
            }
            handler.settings(false, settings);
        } else {
            throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
    }

    private void readPushPromise(Handler handler, int i, byte b, int i2) {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.source.m2915() & 255);
            }
            handler.pushPromise(i2, this.source.m2929() & Integer.MAX_VALUE, readHeaderBlock(lengthWithoutPadding(i - 4, b, s), s, b, i2));
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    private void readPing(Handler handler, int i, byte b, int i2) {
        boolean z = false;
        if (i != 8) {
            throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int r5 = this.source.m2929();
            int r7 = this.source.m2929();
            if ((b & 1) != 0) {
                z = true;
            }
            handler.ping(z, r5, r7);
        } else {
            throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
        }
    }

    private void readGoAway(Handler handler, int i, byte b, int i2) {
        if (i < 8) {
            throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int r7 = this.source.m2929();
            int r2 = this.source.m2929();
            int i3 = i - 8;
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(r2);
            if (fromHttp2 != null) {
                jM jMVar = jM.f2423;
                if (i3 > 0) {
                    jMVar = this.source.m2922((long) i3);
                }
                handler.goAway(r7, fromHttp2, jMVar);
                return;
            }
            throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(r2));
        } else {
            throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
    }

    private void readWindowUpdate(Handler handler, int i, byte b, int i2) {
        if (i == 4) {
            long r1 = ((long) this.source.m2929()) & 2147483647L;
            if (r1 != 0) {
                handler.windowUpdate(i2, r1);
            } else {
                throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(r1));
            }
        } else {
            throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
    }

    public final void close() {
        this.source.close();
    }

    static final class ContinuationSource implements jY {
        byte flags;
        int left;
        int length;
        short padding;
        private final jI source;
        int streamId;

        public final void close() {
        }

        ContinuationSource(jI jIVar) {
            this.source = jIVar;
        }

        public final long read(jH jHVar, long j) {
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.m2928((long) this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(jHVar, Math.min(j, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.left = (int) (((long) this.left) - read);
                    return read;
                }
            }
        }

        public final C3533kb timeout() {
            return this.source.timeout();
        }

        private void readContinuationHeader() {
            int i = this.streamId;
            int readMedium = Http2Reader.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            byte r1 = (byte) this.source.m2915();
            this.flags = (byte) this.source.m2915();
            if (Http2Reader.logger.isLoggable(Level.FINE)) {
                Http2Reader.logger.fine(Http2.frameLog(true, this.streamId, this.length, r1, this.flags));
            }
            this.streamId = this.source.m2929() & Integer.MAX_VALUE;
            if (r1 != 9) {
                throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(r1));
            } else if (this.streamId != i) {
                throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
    }

    static int readMedium(jI jIVar) {
        return (jIVar.m2915() & 255) | ((jIVar.m2915() & 255) << 16) | ((jIVar.m2915() & 255) << 8);
    }

    static int lengthWithoutPadding(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }
}
