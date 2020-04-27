package o;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C3113;

/* renamed from: o.В  reason: contains not printable characters */
public abstract class C2346 extends C1703 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Logger f10855 = Logger.getLogger(C2346.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final long f10856 = C3073.m15673();
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public static final boolean f10857 = C3073.m15669();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m12241(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: і  reason: contains not printable characters */
    public static int m12249(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m12250(int i, int i2);

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m12251(int i, long j);

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m12252(int i, C2993 r2);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m12253(int i, String str);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract int m12254();

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m12255(int i);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m12256(int i, C1767 r2);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m12257(int i, int i2);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m12259(boolean z);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m12260(int i, int i2);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m12261(int i, long j);

    /* synthetic */ C2346(byte b) {
        this();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C2346 m12247(byte[] bArr) {
        return new Cif(bArr, bArr.length);
    }

    private C2346() {
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static int m12236(int i) {
        return m12249(i << 3);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m12234(String str) {
        int i;
        try {
            i = C3113.m15781(str);
        } catch (C3113.C3114 unused) {
            i = str.getBytes(C2702.f12516).length;
        }
        return m12249(i) + i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m12235(C1767 r1) {
        int r12 = r1.m9861();
        return m12249(r12) + r12;
    }

    /* renamed from: o.В$ɩ  reason: contains not printable characters */
    public static class C2347 extends IOException {
        C2347() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        C2347(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        C2347(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m12258(String str, C3113.C3114 r5) {
        f10855.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", r5);
        byte[] bytes = str.getBytes(C2702.f12516);
        try {
            m12255(bytes.length);
            m9674(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C2347(e);
        } catch (C2347 e2) {
            throw e2;
        }
    }

    /* renamed from: o.В$if  reason: invalid class name */
    static class Cif extends C2346 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final int f10858;

        /* renamed from: ɩ  reason: contains not printable characters */
        private int f10859;

        /* renamed from: Ι  reason: contains not printable characters */
        private final byte[] f10860;

        Cif(byte[] bArr, int i) {
            super((byte) 0);
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i | 0 | (bArr.length - i)) >= 0) {
                this.f10860 = bArr;
                this.f10859 = 0;
                this.f10858 = i;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)}));
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m12272(int i, int i2) {
            m12255((i << 3) | i2);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m12268(int i) {
            if (!C2346.f10857 || this.f10858 - this.f10859 < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f10860;
                    int i2 = this.f10859;
                    this.f10859 = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f10860;
                    int i3 = this.f10859;
                    this.f10859 = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C2347(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10859), Integer.valueOf(this.f10858), 1}), e);
                }
            } else {
                long r2 = C2346.f10856 + ((long) this.f10859);
                while ((i & -128) != 0) {
                    C3073.m15675(this.f10860, r2, (byte) ((i & 127) | 128));
                    this.f10859++;
                    i >>>= 7;
                    r2 = 1 + r2;
                }
                C3073.m15675(this.f10860, r2, (byte) i);
                this.f10859++;
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        private void m12262(long j) {
            if (!C2346.f10857 || this.f10858 - this.f10859 < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f10860;
                    int i = this.f10859;
                    this.f10859 = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f10860;
                    int i2 = this.f10859;
                    this.f10859 = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C2347(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10859), Integer.valueOf(this.f10858), 1}), e);
                }
            } else {
                long r7 = C2346.f10856 + ((long) this.f10859);
                while ((j & -128) != 0) {
                    C3073.m15675(this.f10860, r7, (byte) ((((int) j) & 127) | 128));
                    this.f10859++;
                    j >>>= 7;
                    r7 = 1 + r7;
                }
                C3073.m15675(this.f10860, r7, (byte) ((int) j));
                this.f10859++;
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m12267() {
            return this.f10858 - this.f10859;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12270(int i, int i2) {
            m12255(i << 3);
            if (i2 >= 0) {
                m12255(i2);
            } else {
                m12262((long) i2);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m12263(int i, int i2) {
            m12255((i << 3) | 5);
            try {
                byte[] bArr = this.f10860;
                int i3 = this.f10859;
                this.f10859 = i3 + 1;
                bArr[i3] = (byte) i2;
                byte[] bArr2 = this.f10860;
                int i4 = this.f10859;
                this.f10859 = i4 + 1;
                bArr2[i4] = (byte) (i2 >> 8);
                byte[] bArr3 = this.f10860;
                int i5 = this.f10859;
                this.f10859 = i5 + 1;
                bArr3[i5] = (byte) (i2 >> 16);
                byte[] bArr4 = this.f10860;
                int i6 = this.f10859;
                this.f10859 = i6 + 1;
                bArr4[i6] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C2347(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10859), Integer.valueOf(this.f10858), 1}), e);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m12264(int i, long j) {
            m12255(i << 3);
            m12262(j);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m12273(int i, long j) {
            m12255((i << 3) | 1);
            try {
                byte[] bArr = this.f10860;
                int i2 = this.f10859;
                this.f10859 = i2 + 1;
                bArr[i2] = (byte) ((int) j);
                byte[] bArr2 = this.f10860;
                int i3 = this.f10859;
                this.f10859 = i3 + 1;
                bArr2[i3] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f10860;
                int i4 = this.f10859;
                this.f10859 = i4 + 1;
                bArr3[i4] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f10860;
                int i5 = this.f10859;
                this.f10859 = i5 + 1;
                bArr4[i5] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f10860;
                int i6 = this.f10859;
                this.f10859 = i6 + 1;
                bArr5[i6] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f10860;
                int i7 = this.f10859;
                this.f10859 = i7 + 1;
                bArr6[i7] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f10860;
                int i8 = this.f10859;
                this.f10859 = i8 + 1;
                bArr7[i8] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f10860;
                int i9 = this.f10859;
                this.f10859 = i9 + 1;
                bArr8[i9] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C2347(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10859), Integer.valueOf(this.f10858), 1}), e);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12271(boolean z) {
            m12255(16);
            byte b = z ? (byte) 1 : 0;
            try {
                byte[] bArr = this.f10860;
                int i = this.f10859;
                this.f10859 = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C2347(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10859), Integer.valueOf(this.f10858), 1}), e);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m12266(int i, String str) {
            m12255((i << 3) | 2);
            int i2 = this.f10859;
            try {
                int r0 = m12249(str.length() * 3);
                int r1 = m12249(str.length());
                if (r1 == r0) {
                    this.f10859 = i2 + r1;
                    int r02 = C3113.m15777(str, this.f10860, this.f10859, this.f10858 - this.f10859);
                    this.f10859 = i2;
                    m12255((r02 - i2) - r1);
                    this.f10859 = r02;
                    return;
                }
                m12255(C3113.m15781(str));
                this.f10859 = C3113.m15777(str, this.f10860, this.f10859, this.f10858 - this.f10859);
            } catch (C3113.C3114 e) {
                this.f10859 = i2;
                m12258(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C2347(e2);
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m12269(int i, C1767 r2) {
            m12255((i << 3) | 2);
            m12255(r2.m9861());
            r2.m9862(this);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m12265(int i, C2993 r2) {
            m12255((i << 3) | 2);
            m12255(r2.I_());
            r2.m15339(this);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m12274(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f10860, this.f10859, i2);
                this.f10859 += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C2347(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10859), Integer.valueOf(this.f10858), Integer.valueOf(i2)}), e);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m12232(int i) {
        return m12249(8) + (i >= 0 ? m12249(i) : 10);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m12237(int i) {
        return m12249(i << 3) + 4;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m12239(int i, long j) {
        return m12249(i << 3) + m12241(j);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m12244(int i, long j) {
        return m12249(i << 3) + m12241(j);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m12245(int i) {
        return m12249(i << 3) + 8;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m12242() {
        return m12249(16) + 1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m12243(int i) {
        return m12249(96) + (i >= 0 ? m12249(i) : 10);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m12233(int i, String str) {
        return m12249(i << 3) + m12234(str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m12246(int i, C1767 r2) {
        int r1 = m12249(i << 3);
        int r22 = r2.m9861();
        return r1 + m12249(r22) + r22;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m12240(int i, C2993 r2) {
        int r1 = m12249(i << 3);
        int I_ = r2.I_();
        return r1 + m12249(I_) + I_;
    }
}
