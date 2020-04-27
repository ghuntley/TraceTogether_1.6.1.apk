package okhttp3.internal.ws;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o.jH;
import o.jI;
import o.jM;

final class WebSocketReader {
    boolean closed;
    private final jH controlFrameBuffer = new jH();
    final FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final jH.Cif maskCursor;
    private final byte[] maskKey;
    private final jH messageFrameBuffer = new jH();
    int opcode;
    final jI source;

    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(String str);

        void onReadMessage(jM jMVar);

        void onReadPing(jM jMVar);

        void onReadPong(jM jMVar);
    }

    WebSocketReader(boolean z, jI jIVar, FrameCallback frameCallback2) {
        if (jIVar == null) {
            throw new NullPointerException("source == null");
        } else if (frameCallback2 != null) {
            this.isClient = z;
            this.source = jIVar;
            this.frameCallback = frameCallback2;
            jH.Cif ifVar = null;
            this.maskKey = z ? null : new byte[4];
            this.maskCursor = !z ? new jH.Cif() : ifVar;
        } else {
            throw new NullPointerException("frameCallback == null");
        }
    }

    /* access modifiers changed from: package-private */
    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }

    /* JADX INFO: finally extract failed */
    private void readHeader() {
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                byte r2 = this.source.m2915() & 255;
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.opcode = r2 & 15;
                boolean z = true;
                this.isFinalFrame = (r2 & 128) != 0;
                this.isControlFrame = (r2 & 8) != 0;
                if (!this.isControlFrame || this.isFinalFrame) {
                    boolean z2 = (r2 & 64) != 0;
                    boolean z3 = (r2 & 32) != 0;
                    boolean z4 = (r2 & 16) != 0;
                    if (z2 || z3 || z4) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    byte r0 = this.source.m2915() & 255;
                    if ((r0 & 128) == 0) {
                        z = false;
                    }
                    boolean z5 = this.isClient;
                    if (z == z5) {
                        throw new ProtocolException(z5 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    this.frameLength = (long) (r0 & Byte.MAX_VALUE);
                    long j = this.frameLength;
                    if (j == 126) {
                        this.frameLength = ((long) this.source.m2926()) & 65535;
                    } else if (j == 127) {
                        this.frameLength = this.source.m2909();
                        if (this.frameLength < 0) {
                            StringBuilder sb = new StringBuilder("Frame length 0x");
                            sb.append(Long.toHexString(this.frameLength));
                            sb.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z) {
                        this.source.m2924(this.maskKey);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    private void readControlFrame() {
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.m2923(this.controlFrameBuffer, j);
            if (!this.isClient) {
                jH jHVar = this.controlFrameBuffer;
                jH.Cif ifVar = this.maskCursor;
                if (ifVar.f2420 == null) {
                    ifVar.f2420 = jHVar;
                    ifVar.f2419 = true;
                    this.maskCursor.m2901(0);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                } else {
                    throw new IllegalStateException("already attached to a buffer");
                }
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long j2 = this.controlFrameBuffer.f2411;
                if (j2 != 1) {
                    if (j2 != 0) {
                        s = this.controlFrameBuffer.m2892();
                        str = this.controlFrameBuffer.m2873();
                        String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        str = "";
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(new jM(this.controlFrameBuffer.m2893()));
                return;
            case 10:
                this.frameCallback.onReadPong(new jM(this.controlFrameBuffer.m2893()));
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown control opcode: ");
                sb.append(Integer.toHexString(this.opcode));
                throw new ProtocolException(sb.toString());
        }
    }

    private void readMessageFrame() {
        int i = this.opcode;
        if (i == 1 || i == 2) {
            readMessage();
            if (i == 1) {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.m2873());
            } else {
                this.frameCallback.onReadMessage(new jM(this.messageFrameBuffer.m2893()));
            }
        } else {
            StringBuilder sb = new StringBuilder("Unknown opcode: ");
            sb.append(Integer.toHexString(i));
            throw new ProtocolException(sb.toString());
        }
    }

    private void readUntilNonControlFrame() {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    private void readMessage() {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.m2923(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    jH jHVar = this.messageFrameBuffer;
                    jH.Cif ifVar = this.maskCursor;
                    if (ifVar.f2420 == null) {
                        ifVar.f2420 = jHVar;
                        ifVar.f2419 = true;
                        this.maskCursor.m2901(this.messageFrameBuffer.f2411 - this.frameLength);
                        WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    } else {
                        throw new IllegalStateException("already attached to a buffer");
                    }
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    StringBuilder sb = new StringBuilder("Expected continuation opcode. Got: ");
                    sb.append(Integer.toHexString(this.opcode));
                    throw new ProtocolException(sb.toString());
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }
}
