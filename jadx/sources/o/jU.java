package o;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

final class jU implements jK {

    /* renamed from: ı  reason: contains not printable characters */
    public final jH f2454 = new jH();

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f2455;

    /* renamed from: ι  reason: contains not printable characters */
    private jZ f2456;

    jU(jZ jZVar) {
        if (jZVar != null) {
            this.f2456 = jZVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final jH m3012() {
        return this.f2454;
    }

    public final void write(jH jHVar, long j) {
        if (!this.f2455) {
            this.f2454.write(jHVar, j);
            m3004();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final jK m3005(jM jMVar) {
        if (!this.f2455) {
            jH jHVar = this.f2454;
            if (jMVar != null) {
                jMVar.m2958(jHVar);
                return m3004();
            }
            throw new IllegalArgumentException("byteString == null");
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final jK m3013(String str) {
        if (!this.f2455) {
            this.f2454.m2863(str);
            return m3004();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final jK m3014(String str, int i, int i2) {
        if (!this.f2455) {
            this.f2454.m2880(str, i, i2);
            return m3004();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final jK m3006(byte[] bArr) {
        if (!this.f2455) {
            jH jHVar = this.f2454;
            if (bArr != null) {
                jHVar.m2840(bArr, 0, bArr.length);
                return m3004();
            }
            throw new IllegalArgumentException("source == null");
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final jK m3003(byte[] bArr, int i, int i2) {
        if (!this.f2455) {
            this.f2454.m2840(bArr, i, i2);
            return m3004();
        }
        throw new IllegalStateException("closed");
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.f2455) {
            int write = this.f2454.write(byteBuffer);
            m3004();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final long m3011(jY jYVar) {
        if (jYVar != null) {
            long j = 0;
            while (true) {
                long read = jYVar.read(this.f2454, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
                m3004();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final jK m3016(int i) {
        if (!this.f2455) {
            this.f2454.m2899(i);
            return m3004();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: і  reason: contains not printable characters */
    public final jK m3015(int i) {
        if (!this.f2455) {
            this.f2454.m2895(i);
            return m3004();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final jK m3010(int i) {
        if (!this.f2455) {
            this.f2454.m2869(i);
            return m3004();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final jK m3007(long j) {
        if (!this.f2455) {
            this.f2454.m2855(j);
            return m3004();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final jK m3009(long j) {
        if (!this.f2455) {
            this.f2454.m2866(j);
            return m3004();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: ſ  reason: contains not printable characters */
    public final jK m3004() {
        if (!this.f2455) {
            long r0 = this.f2454.m2894();
            if (r0 > 0) {
                this.f2456.write(this.f2454, r0);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final jK m3008() {
        if (!this.f2455) {
            long j = this.f2454.f2411;
            if (j > 0) {
                this.f2456.write(this.f2454, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final OutputStream m3002() {
        return new OutputStream() {
            public final void write(int i) {
                if (!jU.this.f2455) {
                    jU.this.f2454.m2899((int) (byte) i);
                    jU.this.m3004();
                    return;
                }
                throw new IOException("closed");
            }

            public final void write(byte[] bArr, int i, int i2) {
                if (!jU.this.f2455) {
                    jU.this.f2454.m2840(bArr, i, i2);
                    jU.this.m3004();
                    return;
                }
                throw new IOException("closed");
            }

            public final void flush() {
                if (!jU.this.f2455) {
                    jU.this.flush();
                }
            }

            public final void close() {
                jU.this.close();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(jU.this);
                sb.append(".outputStream()");
                return sb.toString();
            }
        };
    }

    public final void flush() {
        if (!this.f2455) {
            if (this.f2454.f2411 > 0) {
                jZ jZVar = this.f2456;
                jH jHVar = this.f2454;
                jZVar.write(jHVar, jHVar.f2411);
            }
            this.f2456.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.f2455;
    }

    public final void close() {
        if (!this.f2455) {
            Throwable th = null;
            try {
                if (this.f2454.f2411 > 0) {
                    this.f2456.write(this.f2454, this.f2454.f2411);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f2456.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f2455 = true;
            if (th != null) {
                jX.m3050(th);
            }
        }
    }

    public final C3533kb timeout() {
        return this.f2456.timeout();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.f2456);
        sb.append(")");
        return sb.toString();
    }
}
