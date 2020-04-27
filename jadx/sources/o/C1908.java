package o;

import androidx.recyclerview.widget.RecyclerView;
import o.C2745;

/* renamed from: o.ΞΙ  reason: contains not printable characters */
public final class C1908 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final int[] f9643 = {1, 10, 100, 1000, C3273am.f1527, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int[] f9644 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int[] f9645 = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: Ι  reason: contains not printable characters */
    private static final int[] f9646 = {1, 1, 2, 6, 24, C2745.aux.f12794, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: ι  reason: contains not printable characters */
    private static final byte[] f9647 = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m10381(int i, int i2) {
        long j = ((long) i) << 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
    }
}
