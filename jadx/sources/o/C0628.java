package o;

import java.util.Arrays;

/* renamed from: o.ƒǃ  reason: contains not printable characters */
final class C0628 extends C0598 {

    /* renamed from: ı  reason: contains not printable characters */
    private final byte[] f4608;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f4609;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f4610;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f4611;

    /* renamed from: ι  reason: contains not printable characters */
    private final boolean f4612;

    /* renamed from: І  reason: contains not printable characters */
    private int f4613;

    /* renamed from: і  reason: contains not printable characters */
    private int f4614;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f4615;

    private C0628(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f4610 = Integer.MAX_VALUE;
        this.f4608 = bArr;
        this.f4615 = i2 + i;
        this.f4609 = i;
        this.f4611 = this.f4609;
        this.f4612 = z;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m5363() {
        if (m5276()) {
            this.f4613 = 0;
            return 0;
        }
        this.f4613 = m5345();
        int i = this.f4613;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw C1124.m7561();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5364(int i) {
        if (this.f4613 != i) {
            throw C1124.m7557();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m5356(int i) {
        int r0;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f4615 - this.f4609 >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f4608;
                    int i4 = this.f4609;
                    this.f4609 = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw C1124.m7562();
            }
            while (i3 < 10) {
                if (m5346() < 0) {
                    i3++;
                }
            }
            throw C1124.m7562();
            return true;
        } else if (i2 == 1) {
            m5341(8);
            return true;
        } else if (i2 == 2) {
            m5341(m5345());
            return true;
        } else if (i2 == 3) {
            do {
                r0 = m5289();
                if (r0 == 0 || !m5282(r0)) {
                    m5290(((i >>> 3) << 3) | 4);
                }
                r0 = m5289();
                break;
            } while (!m5282(r0));
            m5290(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                m5341(4);
                return true;
            }
            throw C1124.m7560();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final double m5352() {
        return Double.longBitsToDouble(m5340());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final float m5347() {
        return Float.intBitsToFloat(m5343());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final long m5355() {
        return m5342();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final long m5366() {
        return m5342();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final int m5351() {
        return m5345();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final long m5358() {
        return m5340();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final int m5370() {
        return m5343();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final boolean m5369() {
        return m5342() != 0;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final String m5367() {
        int r0 = m5345();
        if (r0 > 0) {
            int i = this.f4615;
            int i2 = this.f4609;
            if (r0 <= i - i2) {
                String str = new String(this.f4608, i2, r0, C0936.f5914);
                this.f4609 += r0;
                return str;
            }
        }
        if (r0 == 0) {
            return "";
        }
        if (r0 < 0) {
            throw C1124.m7559();
        }
        throw C1124.m7558();
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final String m5359() {
        int r0 = m5345();
        if (r0 > 0) {
            int i = this.f4615;
            int i2 = this.f4609;
            if (r0 <= i - i2) {
                String r1 = C2530.m13533(this.f4608, i2, r0);
                this.f4609 += r0;
                return r1;
            }
        }
        if (r0 == 0) {
            return "";
        }
        if (r0 <= 0) {
            throw C1124.m7559();
        }
        throw C1124.m7558();
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public final C0510 m5354() {
        byte[] bArr;
        int r0 = m5345();
        if (r0 > 0) {
            int i = this.f4615;
            int i2 = this.f4609;
            if (r0 <= i - i2) {
                C0510 r1 = C0510.m4957(this.f4608, i2, r0);
                this.f4609 += r0;
                return r1;
            }
        }
        if (r0 == 0) {
            return C0510.f4250;
        }
        if (r0 > 0) {
            int i3 = this.f4615;
            int i4 = this.f4609;
            if (r0 <= i3 - i4) {
                this.f4609 = r0 + i4;
                bArr = Arrays.copyOfRange(this.f4608, i4, this.f4609);
                return C0510.m4955(bArr);
            }
        }
        if (r0 > 0) {
            throw C1124.m7558();
        } else if (r0 == 0) {
            bArr = C0936.f5913;
            return C0510.m4955(bArr);
        } else {
            throw C1124.m7559();
        }
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final int m5371() {
        return m5345();
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final int m5353() {
        return m5345();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final int m5357() {
        return m5343();
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    public final long m5349() {
        return m5340();
    }

    /* renamed from: г  reason: contains not printable characters */
    public final int m5368() {
        return m5270(m5345());
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    public final long m5360() {
        return m5271(m5342());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* renamed from: ɍ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m5345() {
        /*
            r5 = this;
            int r0 = r5.f4609
            int r1 = r5.f4615
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f4608
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.f4609 = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.f4609 = r1
            return r0
        L_0x006b:
            long r0 = r5.m5288()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0628.m5345():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b4;
     */
    /* renamed from: Ɨ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m5342() {
        /*
            r11 = this;
            int r0 = r11.f4609
            int r1 = r11.f4615
            if (r1 == r0) goto L_0x00b8
            byte[] r2 = r11.f4608
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.f4609 = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b8
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0025
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            goto L_0x00b5
        L_0x0025:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0036
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto L_0x00b5
        L_0x0036:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0044
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0044:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005b
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0057:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00b5
        L_0x005b:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006d:
            long r2 = r3 ^ r5
            goto L_0x00b5
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0057
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006d
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b3
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b8
            goto L_0x00b4
        L_0x00b3:
            r1 = r0
        L_0x00b4:
            r2 = r3
        L_0x00b5:
            r11.f4609 = r1
            return r2
        L_0x00b8:
            long r0 = r11.m5288()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0628.m5342():long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ʟ  reason: contains not printable characters */
    public final long m5362() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte r3 = m5346();
            j |= ((long) (r3 & Byte.MAX_VALUE)) << i;
            if ((r3 & 128) == 0) {
                return j;
            }
        }
        throw C1124.m7562();
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    private final int m5343() {
        int i = this.f4609;
        if (this.f4615 - i >= 4) {
            byte[] bArr = this.f4608;
            this.f4609 = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw C1124.m7558();
    }

    /* renamed from: ſ  reason: contains not printable characters */
    private final long m5340() {
        int i = this.f4609;
        if (this.f4615 - i >= 8) {
            byte[] bArr = this.f4608;
            this.f4609 = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw C1124.m7558();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m5365(int i) {
        if (i >= 0) {
            int r2 = i + m5287();
            int i2 = this.f4610;
            if (r2 <= i2) {
                this.f4610 = r2;
                m5344();
                return i2;
            }
            throw C1124.m7558();
        }
        throw C1124.m7559();
    }

    /* renamed from: ǀ  reason: contains not printable characters */
    private final void m5344() {
        this.f4615 += this.f4614;
        int i = this.f4615;
        int i2 = i - this.f4611;
        int i3 = this.f4610;
        if (i2 > i3) {
            this.f4614 = i2 - i3;
            this.f4615 = i - this.f4614;
            return;
        }
        this.f4614 = 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5348(int i) {
        this.f4610 = i;
        m5344();
    }

    /* renamed from: ł  reason: contains not printable characters */
    public final boolean m5350() {
        return this.f4609 == this.f4615;
    }

    /* renamed from: ʅ  reason: contains not printable characters */
    public final int m5361() {
        return this.f4609 - this.f4611;
    }

    /* renamed from: ɟ  reason: contains not printable characters */
    private final byte m5346() {
        int i = this.f4609;
        if (i != this.f4615) {
            byte[] bArr = this.f4608;
            this.f4609 = i + 1;
            return bArr[i];
        }
        throw C1124.m7558();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final void m5341(int i) {
        if (i >= 0) {
            int i2 = this.f4615;
            int i3 = this.f4609;
            if (i <= i2 - i3) {
                this.f4609 = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw C1124.m7559();
        }
        throw C1124.m7558();
    }
}
