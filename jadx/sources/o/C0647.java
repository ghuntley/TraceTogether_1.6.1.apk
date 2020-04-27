package o;

/* renamed from: o.Ɩǃ  reason: contains not printable characters */
public final class C0647 {

    /* renamed from: ǃ  reason: contains not printable characters */
    static final long[] f4656 = new long[0];

    /* renamed from: Ι  reason: contains not printable characters */
    static final Object[] f4657 = new Object[0];

    /* renamed from: ι  reason: contains not printable characters */
    static final int[] f4658 = new int[0];

    /* renamed from: ι  reason: contains not printable characters */
    private static int m5436(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m5433(int i) {
        return m5436(i << 2) / 4;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m5435(int i) {
        return m5436(i << 3) / 8;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m5431(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static int m5434(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m5432(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }
}
