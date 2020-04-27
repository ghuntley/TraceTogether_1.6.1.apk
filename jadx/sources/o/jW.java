package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

final class jW implements jI {

    /* renamed from: ı  reason: contains not printable characters */
    public final jY f2460;

    /* renamed from: ǃ  reason: contains not printable characters */
    boolean f2461;

    /* renamed from: ι  reason: contains not printable characters */
    public final jH f2462 = new jH();

    jW(jY jYVar) {
        if (jYVar != null) {
            this.f2460 = jYVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final jH m3037() {
        return this.f2462;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final jH m3026() {
        return this.f2462;
    }

    public final long read(jH jHVar, long j) {
        if (jHVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.f2461) {
            throw new IllegalStateException("closed");
        } else if (this.f2462.f2411 == 0 && this.f2460.read(this.f2462, 8192) == -1) {
            return -1;
        } else {
            return this.f2462.read(jHVar, Math.min(j, this.f2462.f2411));
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m3043() {
        if (!this.f2461) {
            return ((this.f2462.f2411 > 0 ? 1 : (this.f2462.f2411 == 0 ? 0 : -1)) == 0) && this.f2460.read(this.f2462, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3021(long j) {
        if (!m3038(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m3038(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (!this.f2461) {
            while (this.f2462.f2411 < j) {
                if (this.f2460.read(this.f2462, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m3029(jN jNVar) {
        if (!this.f2461) {
            do {
                int r0 = this.f2462.m2848(jNVar, true);
                if (r0 == -1) {
                    return -1;
                }
                if (r0 != -2) {
                    this.f2462.m2896((long) jNVar.f2428[r0].m2967());
                    return r0;
                }
            } while (this.f2460.read(this.f2462, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: г  reason: contains not printable characters */
    public final byte[] m3045() {
        this.f2462.m2875(this.f2460);
        return this.f2462.m2893();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3042(byte[] bArr) {
        try {
            if (m3038((long) bArr.length)) {
                this.f2462.m2889(bArr);
                return;
            }
            throw new EOFException();
        } catch (EOFException e) {
            int i = 0;
            while (this.f2462.f2411 > 0) {
                jH jHVar = this.f2462;
                int r2 = jHVar.m2858(bArr, i, (int) jHVar.f2411);
                if (r2 != -1) {
                    i += r2;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public final int read(ByteBuffer byteBuffer) {
        if (this.f2462.f2411 == 0 && this.f2460.read(this.f2462, 8192) == -1) {
            return -1;
        }
        return this.f2462.read(byteBuffer);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m3025(jZ jZVar) {
        long j = 0;
        while (this.f2460.read(this.f2462, 8192) != -1) {
            long r4 = this.f2462.m2894();
            if (r4 > 0) {
                j += r4;
                jZVar.write(this.f2462, r4);
            }
        }
        if (this.f2462.f2411 <= 0) {
            return j;
        }
        long j2 = j + this.f2462.f2411;
        jH jHVar = this.f2462;
        jZVar.write(jHVar, jHVar.f2411);
        return j2;
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    public final String m3036() {
        this.f2462.m2875(this.f2460);
        return this.f2462.m2873();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m3031(Charset charset) {
        if (charset != null) {
            this.f2462.m2875(this.f2460);
            return this.f2462.m2861(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* renamed from: ł  reason: contains not printable characters */
    public final String m3023() {
        return m3030(Long.MAX_VALUE);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m3030(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long r6 = m3019((byte) 10, 0, j2);
            if (r6 != -1) {
                return this.f2462.m2898(r6);
            }
            if (j2 < Long.MAX_VALUE && m3038(j2) && this.f2462.m2847(j2 - 1) == 13 && m3038(1 + j2) && this.f2462.m2847(j2) == 10) {
                return this.f2462.m2898(j2);
            }
            jH jHVar = new jH();
            jH jHVar2 = this.f2462;
            jHVar2.m2864(jHVar, 0, Math.min(32, jHVar2.f2411));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(this.f2462.f2411, j));
            sb.append(" content=");
            sb.append(new jM(jHVar.m2893()).m2965());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m3046(long j) {
        if (!this.f2461) {
            while (j > 0) {
                if (this.f2462.f2411 == 0 && this.f2460.read(this.f2462, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f2462.f2411);
                this.f2462.m2896(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    public final long m3022() {
        return m3019((byte) 0, 0, Long.MAX_VALUE);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private long m3019(byte b, long j, long j2) {
        if (this.f2461) {
            throw new IllegalStateException("closed");
        } else if (j2 >= 0) {
            while (j < j2) {
                long r2 = this.f2462.m2883(b, j, j2);
                if (r2 == -1) {
                    long j3 = this.f2462.f2411;
                    if (j3 >= j2 || this.f2460.read(this.f2462, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return r2;
                }
            }
            return -1;
        } else {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{0L, Long.valueOf(j2)}));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m3039(jM jMVar) {
        int r0 = jMVar.m2967();
        if (this.f2461) {
            throw new IllegalStateException("closed");
        } else if (r0 < 0 || jMVar.m2967() < r0) {
            return false;
        } else {
            for (int i = 0; i < r0; i++) {
                long j = ((long) i) + 0;
                if (!m3038(1 + j) || this.f2462.m2847(j) != jMVar.m2956(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final InputStream m3024() {
        return new InputStream() {
            public final int read() {
                if (jW.this.f2461) {
                    throw new IOException("closed");
                } else if (jW.this.f2462.f2411 == 0 && jW.this.f2460.read(jW.this.f2462, 8192) == -1) {
                    return -1;
                } else {
                    return jW.this.f2462.m2868() & 255;
                }
            }

            public final int read(byte[] bArr, int i, int i2) {
                if (!jW.this.f2461) {
                    jX.m3051((long) bArr.length, (long) i, (long) i2);
                    if (jW.this.f2462.f2411 == 0 && jW.this.f2460.read(jW.this.f2462, 8192) == -1) {
                        return -1;
                    }
                    return jW.this.f2462.m2858(bArr, i, i2);
                }
                throw new IOException("closed");
            }

            public final int available() {
                if (!jW.this.f2461) {
                    return (int) Math.min(jW.this.f2462.f2411, 2147483647L);
                }
                throw new IOException("closed");
            }

            public final void close() {
                jW.this.close();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(jW.this);
                sb.append(".inputStream()");
                return sb.toString();
            }
        };
    }

    public final boolean isOpen() {
        return !this.f2461;
    }

    public final void close() {
        if (!this.f2461) {
            this.f2461 = true;
            this.f2460.close();
            jH jHVar = this.f2462;
            try {
                jHVar.m2896(jHVar.f2411);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final C3533kb timeout() {
        return this.f2460.timeout();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.f2460);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final byte m3033() {
        if (m3038(1)) {
            return this.f2462.m2868();
        }
        throw new EOFException();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final jM m3040(long j) {
        if (m3038(j)) {
            return this.f2462.m2887(j);
        }
        throw new EOFException();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final byte[] m3034(long j) {
        if (m3038(j)) {
            return this.f2462.m2870(j);
        }
        throw new EOFException();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3041(jH jHVar, long j) {
        try {
            if (m3038(j)) {
                this.f2462.m2888(jHVar, j);
                return;
            }
            throw new EOFException();
        } catch (EOFException e) {
            jHVar.m2875((jY) this.f2462);
            throw e;
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    public final short m3044() {
        if (m3038(2)) {
            return this.f2462.m2892();
        }
        throw new EOFException();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final short m3032() {
        if (m3038(2)) {
            return this.f2462.m2867();
        }
        throw new EOFException();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final int m3047() {
        if (m3038(4)) {
            return this.f2462.m2897();
        }
        throw new EOFException();
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public final int m3028() {
        if (m3038(4)) {
            return this.f2462.m2856();
        }
        throw new EOFException();
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final long m3027() {
        if (m3038(8)) {
            return this.f2462.m2854();
        }
        throw new EOFException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* renamed from: ɾ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m3035() {
        /*
            r6 = this;
            r0 = 1
            boolean r0 = r6.m3038((long) r0)
            if (r0 == 0) goto L_0x004a
            r0 = 0
            r1 = 0
        L_0x000a:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.m3038((long) r3)
            if (r3 == 0) goto L_0x0043
            o.jH r3 = r6.f2462
            long r4 = (long) r1
            byte r3 = r3.m2847((long) r4)
            r4 = 48
            if (r3 < r4) goto L_0x0022
            r4 = 57
            if (r3 <= r4) goto L_0x0029
        L_0x0022:
            if (r1 != 0) goto L_0x002b
            r4 = 45
            if (r3 == r4) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r1 = r2
            goto L_0x000a
        L_0x002b:
            if (r1 == 0) goto L_0x002e
            goto L_0x0043
        L_0x002e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0043:
            o.jH r0 = r6.f2462
            long r0 = r0.m2871()
            return r0
        L_0x004a:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jW.m3035():long");
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final long m3048() {
        if (m3038(1)) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!m3038((long) i2)) {
                    break;
                }
                byte r3 = this.f2462.m2847((long) i);
                if ((r3 >= 48 && r3 <= 57) || ((r3 >= 97 && r3 <= 102) || (r3 >= 65 && r3 <= 70))) {
                    i = i2;
                } else if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(r3)}));
                }
            }
            return this.f2462.m2900();
        }
        throw new EOFException();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final long m3020(jM jMVar) {
        if (!this.f2461) {
            long j = 0;
            while (true) {
                long r2 = this.f2462.m2859(jMVar, j);
                if (r2 != -1) {
                    return r2;
                }
                long j2 = this.f2462.f2411;
                if (this.f2460.read(this.f2462, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }
}
