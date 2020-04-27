package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\n"}, d2 = {"", "", "ɩ", "(Ljava/lang/String;)Ljava/lang/Integer;", "p0", "ι", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "ı", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/gK")
public class gU extends gR {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final Integer m2347(String str) {
        fM.m2254(str, "");
        return gK.m2349(str, 10);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final Integer m2349(String str, int i) {
        boolean z;
        int i2;
        fM.m2254(str, "");
        gD.m2322(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        int i5 = 1;
        if (charAt >= '0') {
            z = false;
            i5 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i4 = RecyclerView.UNDEFINED_DURATION;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i6 = -59652323;
        while (i5 < length) {
            int r8 = gD.m2320(str.charAt(i5), i);
            if (r8 < 0) {
                return null;
            }
            if ((i3 < i6 && (i6 != -59652323 || i3 < (i6 = i4 / i))) || (i2 = i3 * i) < i4 + r8) {
                return null;
            }
            i3 = i2 - r8;
            i5++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final Long m2346(String str) {
        fM.m2254(str, "");
        return gK.m2348(str, 10);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final Long m2348(String str, int i) {
        String str2 = str;
        int i2 = i;
        fM.m2254(str2, "");
        gD.m2322(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char charAt = str2.charAt(0);
        long j = -9223372036854775807L;
        int i3 = 1;
        if (charAt >= '0') {
            i3 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            }
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i3 < length) {
            int r14 = gD.m2320(str2.charAt(i3), i2);
            if (r14 < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / ((long) i2);
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * ((long) i2);
            long j6 = (long) r14;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i3++;
            j2 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }
}
