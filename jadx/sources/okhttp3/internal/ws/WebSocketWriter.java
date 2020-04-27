package okhttp3.internal.ws;

import java.io.IOException;
import java.util.Random;
import o.C3533kb;
import o.jH;
import o.jK;
import o.jM;
import o.jZ;

final class WebSocketWriter {
    boolean activeWriter;
    final jH buffer = new jH();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    private final jH.Cif maskCursor;
    private final byte[] maskKey;
    final Random random;
    final jK sink;
    final jH sinkBuffer;
    boolean writerClosed;

    WebSocketWriter(boolean z, jK jKVar, Random random2) {
        if (jKVar == null) {
            throw new NullPointerException("sink == null");
        } else if (random2 != null) {
            this.isClient = z;
            this.sink = jKVar;
            this.sinkBuffer = jKVar.m2941();
            this.random = random2;
            jH.Cif ifVar = null;
            this.maskKey = z ? new byte[4] : null;
            this.maskCursor = z ? new jH.Cif() : ifVar;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    /* access modifiers changed from: package-private */
    public final void writePing(jM jMVar) {
        writeControlFrame(9, jMVar);
    }

    /* access modifiers changed from: package-private */
    public final void writePong(jM jMVar) {
        writeControlFrame(10, jMVar);
    }

    /* access modifiers changed from: package-private */
    public final void writeClose(int i, jM jMVar) {
        jM jMVar2;
        jM jMVar3 = jM.f2423;
        if (i == 0 && jMVar == null) {
            jMVar2 = jMVar3;
        } else {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            jH jHVar = new jH();
            jHVar.m2895(i);
            if (jMVar != null) {
                jMVar.m2958(jHVar);
            }
            jMVar2 = new jM(jHVar.m2893());
        }
        try {
            writeControlFrame(8, jMVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    private void writeControlFrame(int i, jM jMVar) {
        if (!this.writerClosed) {
            int r0 = jMVar.m2967();
            if (((long) r0) <= 125) {
                this.sinkBuffer.m2899(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.m2899(r0 | 128);
                    this.random.nextBytes(this.maskKey);
                    jH jHVar = this.sinkBuffer;
                    byte[] bArr = this.maskKey;
                    if (bArr != null) {
                        jHVar.m2840(bArr, 0, bArr.length);
                        if (r0 > 0) {
                            long j = this.sinkBuffer.f2411;
                            jMVar.m2958(this.sinkBuffer);
                            jH jHVar2 = this.sinkBuffer;
                            jH.Cif ifVar = this.maskCursor;
                            if (ifVar.f2420 == null) {
                                ifVar.f2420 = jHVar2;
                                ifVar.f2419 = true;
                                this.maskCursor.m2901(j);
                                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                                this.maskCursor.close();
                            } else {
                                throw new IllegalStateException("already attached to a buffer");
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("source == null");
                    }
                } else {
                    this.sinkBuffer.m2899(r0);
                    jMVar.m2958(this.sinkBuffer);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    /* access modifiers changed from: package-private */
    public final jZ newMessageSink(int i, long j) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            FrameSink frameSink2 = this.frameSink;
            frameSink2.formatOpcode = i;
            frameSink2.contentLength = j;
            frameSink2.isFirstFrame = true;
            frameSink2.closed = false;
            return frameSink2;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    /* access modifiers changed from: package-private */
    public final void writeMessageFrame(int i, long j, boolean z, boolean z2) {
        if (!this.writerClosed) {
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.sinkBuffer.m2899(i);
            int i2 = this.isClient ? 128 : 0;
            if (j <= 125) {
                this.sinkBuffer.m2899(i2 | ((int) j));
            } else if (j <= 65535) {
                this.sinkBuffer.m2899(i2 | 126);
                this.sinkBuffer.m2895((int) j);
            } else {
                this.sinkBuffer.m2899(i2 | 127);
                this.sinkBuffer.m2891(j);
            }
            if (this.isClient) {
                this.random.nextBytes(this.maskKey);
                jH jHVar = this.sinkBuffer;
                byte[] bArr = this.maskKey;
                if (bArr != null) {
                    jHVar.m2840(bArr, 0, bArr.length);
                    if (j > 0) {
                        long j2 = this.sinkBuffer.f2411;
                        this.sinkBuffer.write(this.buffer, j);
                        jH jHVar2 = this.sinkBuffer;
                        jH.Cif ifVar = this.maskCursor;
                        if (ifVar.f2420 == null) {
                            ifVar.f2420 = jHVar2;
                            ifVar.f2419 = true;
                            this.maskCursor.m2901(j2);
                            WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                            this.maskCursor.close();
                        } else {
                            throw new IllegalStateException("already attached to a buffer");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("source == null");
                }
            } else {
                this.sinkBuffer.write(this.buffer, j);
            }
            this.sink.m2937();
            return;
        }
        throw new IOException("closed");
    }

    final class FrameSink implements jZ {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        FrameSink() {
        }

        public final void write(jH jHVar, long j) {
            if (!this.closed) {
                WebSocketWriter.this.buffer.write(jHVar, j);
                boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.f2411 > this.contentLength - 8192;
                long r2 = WebSocketWriter.this.buffer.m2894();
                if (r2 > 0 && !z) {
                    WebSocketWriter.this.writeMessageFrame(this.formatOpcode, r2, this.isFirstFrame, false);
                    this.isFirstFrame = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        public final void flush() {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.f2411, this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException("closed");
        }

        public final C3533kb timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        public final void close() {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.f2411, this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.activeWriter = false;
                return;
            }
            throw new IOException("closed");
        }
    }
}
