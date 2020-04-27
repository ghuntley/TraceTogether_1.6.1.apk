package o;

import java.util.Arrays;

final class jT extends jM {

    /* renamed from: ı  reason: contains not printable characters */
    private transient int[] f2452;

    /* renamed from: ɩ  reason: contains not printable characters */
    private transient byte[][] f2453;

    jT(jH jHVar, int i) {
        super((byte[]) null);
        jX.m3051(jHVar.f2411, 0, (long) i);
        int i2 = 0;
        jS jSVar = jHVar.f2412;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (jSVar.f2447 != jSVar.f2449) {
                i3 += jSVar.f2447 - jSVar.f2449;
                i4++;
                jSVar = jSVar.f2450;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f2453 = new byte[i4][];
        this.f2452 = new int[(i4 << 1)];
        jS jSVar2 = jHVar.f2412;
        int i5 = 0;
        while (i2 < i) {
            this.f2453[i5] = jSVar2.f2446;
            i2 += jSVar2.f2447 - jSVar2.f2449;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f2452;
            iArr[i5] = i2;
            iArr[this.f2453.length + i5] = jSVar2.f2449;
            jSVar2.f2445 = true;
            i5++;
            jSVar2 = jSVar2.f2450;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final byte m2990(int i) {
        jX.m3051((long) this.f2452[this.f2453.length - 1], (long) i, 1);
        int i2 = 0;
        int binarySearch = Arrays.binarySearch(this.f2452, 0, this.f2453.length, i + 1);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        }
        if (binarySearch != 0) {
            i2 = this.f2452[binarySearch - 1];
        }
        int[] iArr = this.f2452;
        byte[][] bArr = this.f2453;
        return bArr[binarySearch][(i - i2) + iArr[bArr.length + binarySearch]];
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final int m3001() {
        return this.f2452[this.f2453.length - 1];
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final byte[] m2994() {
        int[] iArr = this.f2452;
        byte[][] bArr = this.f2453;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f2452;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f2453[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m2992(jH jHVar) {
        int length = this.f2453.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f2452;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            jS jSVar = new jS(this.f2453[i], i3, (i3 + i4) - i2, true, false);
            if (jHVar.f2412 == null) {
                jSVar.f2451 = jSVar;
                jSVar.f2450 = jSVar;
                jHVar.f2412 = jSVar;
            } else {
                jS jSVar2 = jHVar.f2412.f2451;
                jSVar.f2451 = jSVar2;
                jSVar.f2450 = jSVar2.f2450;
                jSVar2.f2450.f2451 = jSVar;
                jSVar2.f2450 = jSVar;
            }
            i++;
            i2 = i4;
        }
        jHVar.f2411 += (long) i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public final byte[] m3000() {
        return m2960();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jM) {
            jM jMVar = (jM) obj;
            int r1 = jMVar.m2967();
            int[] iArr = this.f2452;
            byte[][] bArr = this.f2453;
            return r1 == iArr[bArr.length - 1] && m2963(0, jMVar, 0, iArr[bArr.length - 1]);
        }
    }

    public final int hashCode() {
        int i = this.f2424;
        if (i != 0) {
            return i;
        }
        int length = this.f2453.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f2453[i2];
            int[] iArr = this.f2452;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f2424 = i3;
        return i3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m2995() {
        return new jM(m2960()).m2961();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m2991() {
        return new jM(m2960()).m2957();
    }

    /* renamed from: І  reason: contains not printable characters */
    public final String m2999() {
        return new jM(m2960()).m2965();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final jM m2989() {
        return new jM(m2960()).m2955();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final jM m2987() {
        return new jM(m2960()).m2953();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final jM m2993() {
        return new jM(m2960()).m2959();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final jM m2998() {
        return new jM(m2960()).m2964();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final jM m2996(int i, int i2) {
        return new jM(m2960()).m2962(i, i2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m2997(int i, jM jMVar, int i2, int i3) {
        int[] iArr = this.f2452;
        byte[][] bArr = this.f2453;
        if (iArr[bArr.length - 1] - i3 < 0) {
            return false;
        }
        int binarySearch = Arrays.binarySearch(iArr, 0, bArr.length, 1);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        }
        while (i3 > 0) {
            int i4 = binarySearch == 0 ? 0 : this.f2452[binarySearch - 1];
            int min = Math.min(i3, ((this.f2452[binarySearch] - i4) + i4) - i);
            int[] iArr2 = this.f2452;
            byte[][] bArr2 = this.f2453;
            if (!jMVar.m2954(i2, bArr2[binarySearch], (i - i4) + iArr2[bArr2.length + binarySearch], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            binarySearch++;
        }
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m2988(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            int[] iArr = this.f2452;
            byte[][] bArr2 = this.f2453;
            if (i <= iArr[bArr2.length - 1] - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                int binarySearch = Arrays.binarySearch(iArr, 0, bArr2.length, i + 1);
                if (binarySearch < 0) {
                    binarySearch = ~binarySearch;
                }
                while (i3 > 0) {
                    int i4 = binarySearch == 0 ? 0 : this.f2452[binarySearch - 1];
                    int min = Math.min(i3, ((this.f2452[binarySearch] - i4) + i4) - i);
                    int[] iArr2 = this.f2452;
                    byte[][] bArr3 = this.f2453;
                    if (!jX.m3052(bArr3[binarySearch], (i - i4) + iArr2[bArr3.length + binarySearch], bArr, i2, min)) {
                        return false;
                    }
                    i += min;
                    i2 += min;
                    i3 -= min;
                    binarySearch++;
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return new jM(m2960()).toString();
    }

    private Object writeReplace() {
        return new jM(m2960());
    }
}
