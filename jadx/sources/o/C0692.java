package o;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o.Ɨɺ  reason: contains not printable characters */
public abstract class C0692 extends C0513 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Logger f4861 = Logger.getLogger(C0692.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public static final boolean f4862 = C2509.m13297();

    /* renamed from: ı  reason: contains not printable characters */
    C0734 f4863;

    /* renamed from: ı  reason: contains not printable characters */
    public static int m5633(float f) {
        return 4;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C0692 m5637(byte[] bArr) {
        return new C0693(bArr, 0, bArr.length);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static int m5639(int i) {
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

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m5642(long j) {
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

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m5645(boolean z) {
        return 1;
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    private static int m5646(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static int m5656(long j) {
        return 8;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m5657(double d) {
        return 8;
    }

    /* renamed from: І  reason: contains not printable characters */
    public static int m5670(int i) {
        return 4;
    }

    /* renamed from: І  reason: contains not printable characters */
    public static int m5673(long j) {
        return 8;
    }

    /* renamed from: і  reason: contains not printable characters */
    public static int m5674(int i) {
        return 4;
    }

    /* renamed from: і  reason: contains not printable characters */
    private static long m5677(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m5683(int i);

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m5684(int i, int i2);

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m5685(int i, C0510 r2);

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m5686(String str);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m5689(int i);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m5692(int i, long j);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m5693(int i, C0510 r2);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m5696(int i, int i2);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m5697(int i, long j);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m5698(int i, C1637 r2);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m5699(long j);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m5700(C1637 r1);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m5701(byte b);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m5703(int i, int i2);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m5704(int i, String str);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m5705(int i, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m5707(byte[] bArr, int i, int i2);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract int m5708();

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m5710(int i);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m5711(int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m5713(int i, C1637 r2, C1990 r3);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m5714(long j);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m5715(C0510 r1);

    /* renamed from: o.Ɨɺ$if  reason: invalid class name */
    public static class Cif extends IOException {
        Cif() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        Cif(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        Cif(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0692.Cif.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private C0692() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5691(int i, int i2) {
        m5711(i, m5646(i2));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5712(int i, long j) {
        m5697(i, m5677(j));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5690(int i, float f) {
        m5703(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5695(int i, double d) {
        m5692(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5702(int i) {
        m5710(m5646(i));
    }

    /* renamed from: o.Ɨɺ$ǃ  reason: contains not printable characters */
    static class C0693 extends C0692 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final int f4864;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final byte[] f4865;

        /* renamed from: Ι  reason: contains not printable characters */
        private int f4866;

        /* renamed from: ι  reason: contains not printable characters */
        private final int f4867;

        C0693(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.f4865 = bArr;
                    this.f4867 = 0;
                    this.f4866 = 0;
                    this.f4864 = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m5718(int i, int i2) {
            m5710((i << 3) | i2);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m5725(int i, int i2) {
            m5684(i, 0);
            m5683(i2);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m5737(int i, int i2) {
            m5684(i, 0);
            m5710(i2);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m5731(int i, int i2) {
            m5684(i, 5);
            m5689(i2);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m5726(int i, long j) {
            m5684(i, 0);
            m5714(j);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m5722(int i, long j) {
            m5684(i, 1);
            m5699(j);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m5733(int i, boolean z) {
            m5684(i, 0);
            m5701(z ? (byte) 1 : 0);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m5732(int i, String str) {
            m5684(i, 2);
            m5686(str);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m5723(int i, C0510 r3) {
            m5684(i, 2);
            m5715(r3);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m5740(C0510 r2) {
            m5710(r2.m4967());
            r2.m4966((C0513) this);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m5734(byte[] bArr, int i, int i2) {
            m5710(i2);
            m5716(bArr, 0, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m5738(int i, C1637 r4, C1990 r5) {
            m5684(i, 2);
            C0457 r3 = (C0457) r4;
            int r0 = r3.m4784();
            if (r0 == -1) {
                r0 = r5.m10786(r3);
                r3.m4783(r0);
            }
            m5710(r0);
            r5.m10783(r4, this.f4863);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m5727(int i, C1637 r5) {
            m5684(1, 3);
            m5711(2, i);
            m5684(3, 2);
            m5700(r5);
            m5684(1, 4);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m5719(int i, C0510 r5) {
            m5684(1, 3);
            m5711(2, i);
            m5693(3, r5);
            m5684(1, 4);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m5729(C1637 r2) {
            m5710(r2.m9436());
            r2.m9439(this);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m5730(byte b) {
            try {
                byte[] bArr = this.f4865;
                int i = this.f4866;
                this.f4866 = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new Cif(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f4866), Integer.valueOf(this.f4864), 1}), e);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m5717(int i) {
            if (i >= 0) {
                m5710(i);
            } else {
                m5714((long) i);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m5736(int i) {
            if (!C0692.f4862 || C0517.m4978() || m5708() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f4865;
                    int i2 = this.f4866;
                    this.f4866 = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f4865;
                    int i3 = this.f4866;
                    this.f4866 = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new Cif(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f4866), Integer.valueOf(this.f4864), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f4865;
                int i4 = this.f4866;
                this.f4866 = i4 + 1;
                C2509.m13267(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f4865;
                int i5 = this.f4866;
                this.f4866 = i5 + 1;
                C2509.m13267(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f4865;
                    int i7 = this.f4866;
                    this.f4866 = i7 + 1;
                    C2509.m13267(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f4865;
                int i8 = this.f4866;
                this.f4866 = i8 + 1;
                C2509.m13267(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f4865;
                    int i10 = this.f4866;
                    this.f4866 = i10 + 1;
                    C2509.m13267(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f4865;
                int i11 = this.f4866;
                this.f4866 = i11 + 1;
                C2509.m13267(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f4865;
                    int i13 = this.f4866;
                    this.f4866 = i13 + 1;
                    C2509.m13267(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f4865;
                int i14 = this.f4866;
                this.f4866 = i14 + 1;
                C2509.m13267(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f4865;
                int i15 = this.f4866;
                this.f4866 = i15 + 1;
                C2509.m13267(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m5721(int i) {
            try {
                byte[] bArr = this.f4865;
                int i2 = this.f4866;
                this.f4866 = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f4865;
                int i3 = this.f4866;
                this.f4866 = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f4865;
                int i4 = this.f4866;
                this.f4866 = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f4865;
                int i5 = this.f4866;
                this.f4866 = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new Cif(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f4866), Integer.valueOf(this.f4864), 1}), e);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m5739(long j) {
            if (!C0692.f4862 || m5708() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f4865;
                    int i = this.f4866;
                    this.f4866 = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f4865;
                    int i2 = this.f4866;
                    this.f4866 = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new Cif(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f4866), Integer.valueOf(this.f4864), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f4865;
                    int i3 = this.f4866;
                    this.f4866 = i3 + 1;
                    C2509.m13267(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f4865;
                int i4 = this.f4866;
                this.f4866 = i4 + 1;
                C2509.m13267(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m5728(long j) {
            try {
                byte[] bArr = this.f4865;
                int i = this.f4866;
                this.f4866 = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f4865;
                int i2 = this.f4866;
                this.f4866 = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f4865;
                int i3 = this.f4866;
                this.f4866 = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f4865;
                int i4 = this.f4866;
                this.f4866 = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f4865;
                int i5 = this.f4866;
                this.f4866 = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f4865;
                int i6 = this.f4866;
                this.f4866 = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f4865;
                int i7 = this.f4866;
                this.f4866 = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f4865;
                int i8 = this.f4866;
                this.f4866 = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new Cif(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f4866), Integer.valueOf(this.f4864), 1}), e);
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private final void m5716(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f4865, this.f4866, i2);
                this.f4866 += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new Cif(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f4866), Integer.valueOf(this.f4864), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m5724(byte[] bArr, int i, int i2) {
            m5716(bArr, i, i2);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m5720(String str) {
            int i = this.f4866;
            try {
                int r1 = m5639(str.length() * 3);
                int r2 = m5639(str.length());
                if (r2 == r1) {
                    this.f4866 = i + r2;
                    int r12 = C2530.m13541(str, this.f4865, this.f4866, m5708());
                    this.f4866 = i;
                    m5710((r12 - i) - r2);
                    this.f4866 = r12;
                    return;
                }
                m5710(C2530.m13542((CharSequence) str));
                this.f4866 = C2530.m13541(str, this.f4865, this.f4866, m5708());
            } catch (C2726 e) {
                this.f4866 = i;
                m5694(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new Cif(e2);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final int m5735() {
            return this.f4864 - this.f4866;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5706(long j) {
        m5714(m5677(j));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5709(float f) {
        m5689(Float.floatToRawIntBits(f));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5682(double d) {
        m5699(Double.doubleToRawLongBits(d));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5687(boolean z) {
        m5701(z ? (byte) 1 : 0);
    }

    /* renamed from: І  reason: contains not printable characters */
    public static int m5671(int i, int i2) {
        return m5647(i) + m5654(i2);
    }

    /* renamed from: і  reason: contains not printable characters */
    public static int m5675(int i, int i2) {
        return m5647(i) + m5639(i2);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static int m5655(int i, int i2) {
        return m5647(i) + m5639(m5646(i2));
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static int m5679(int i, int i2) {
        return m5647(i) + 4;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static int m5640(int i, int i2) {
        return m5647(i) + 4;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m5634(int i, long j) {
        return m5647(i) + m5642(j);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m5658(int i, long j) {
        return m5647(i) + m5642(j);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static int m5680(int i, long j) {
        return m5647(i) + m5642(m5677(j));
    }

    /* renamed from: І  reason: contains not printable characters */
    public static int m5672(int i, long j) {
        return m5647(i) + 8;
    }

    /* renamed from: і  reason: contains not printable characters */
    public static int m5676(int i, long j) {
        return m5647(i) + 8;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m5662(int i, float f) {
        return m5647(i) + 4;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m5661(int i, double d) {
        return m5647(i) + 8;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m5666(int i, boolean z) {
        return m5647(i) + 1;
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public static int m5653(int i, int i2) {
        return m5647(i) + m5654(i2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m5663(int i, String str) {
        return m5647(i) + m5643(str);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m5648(int i, C0510 r2) {
        int r1 = m5647(i);
        int r22 = r2.m4967();
        return r1 + m5639(r22) + r22;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m5649(int i, C1259 r2) {
        int r1 = m5647(i);
        int r22 = r2.m8094();
        return r1 + m5639(r22) + r22;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static int m5635(int i, C1637 r1, C1990 r2) {
        return m5647(i) + m5644(r1, r2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m5665(int i, C1637 r3) {
        return (m5647(1) << 1) + m5675(2, i) + m5647(3) + m5668(r3);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m5659(int i, C0510 r3) {
        return (m5647(1) << 1) + m5675(2, i) + m5648(3, r3);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m5664(int i, C1259 r3) {
        return (m5647(1) << 1) + m5675(2, i) + m5649(3, r3);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m5647(int i) {
        return m5639(i << 3);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static int m5654(int i) {
        if (i >= 0) {
            return m5639(i);
        }
        return 10;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static int m5678(int i) {
        return m5639(m5646(i));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m5636(long j) {
        return m5642(j);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static int m5641(long j) {
        return m5642(m5677(j));
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public static int m5681(int i) {
        return m5654(i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m5643(String str) {
        int i;
        try {
            i = C2530.m13542((CharSequence) str);
        } catch (C2726 unused) {
            i = str.getBytes(C0936.f5914).length;
        }
        return m5639(i) + i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m5667(C1259 r1) {
        int r12 = r1.m8094();
        return m5639(r12) + r12;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m5651(C0510 r1) {
        int r12 = r1.m4967();
        return m5639(r12) + r12;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m5669(byte[] bArr) {
        int length = bArr.length;
        return m5639(length) + length;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m5668(C1637 r1) {
        int r12 = r1.m9436();
        return m5639(r12) + r12;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m5644(C1637 r2, C1990 r3) {
        C0457 r22 = (C0457) r2;
        int r0 = r22.m4784();
        if (r0 == -1) {
            r0 = r3.m10786(r22);
            r22.m4783(r0);
        }
        return m5639(r0) + r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5688() {
        if (m5708() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5694(String str, C2726 r8) {
        f4861.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", r8);
        byte[] bytes = str.getBytes(C0936.f5914);
        try {
            m5710(bytes.length);
            m4975(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new Cif(e);
        } catch (Cif e2) {
            throw e2;
        }
    }

    @Deprecated
    /* renamed from: ɩ  reason: contains not printable characters */
    static int m5650(int i, C1637 r3, C1990 r4) {
        int r2 = m5647(i) << 1;
        C0457 r32 = (C0457) r3;
        int r0 = r32.m4784();
        if (r0 == -1) {
            r0 = r4.m10786(r32);
            r32.m4783(r0);
        }
        return r2 + r0;
    }

    @Deprecated
    /* renamed from: Ι  reason: contains not printable characters */
    public static int m5660(C1637 r0) {
        return r0.m9436();
    }

    @Deprecated
    /* renamed from: ɪ  reason: contains not printable characters */
    public static int m5652(int i) {
        return m5639(i);
    }
}
