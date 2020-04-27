package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0004\u0010\f"}, d2 = {"", "p0", "", "p1", "ɩ", "(Ljava/lang/String;Z)Z", "", "p2", "p3", "ı", "(Ljava/lang/String;III)I", "", "(Ljava/lang/String;JJJ)J"}, k = 5, mv = {1, 1, 15}, xs = "o/jf")
/* renamed from: o.ji  reason: case insensitive filesystem */
final /* synthetic */ class C3514ji {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final boolean m3093(String str, boolean z) {
        fM.m2254(str, "");
        String r1 = C3511jf.m3075(str);
        return r1 != null ? Boolean.parseBoolean(r1) : z;
    }

    /* renamed from: ı$default  reason: contains not printable characters */
    public static /* synthetic */ int m3091$default(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C3511jf.m3070(str, i, i2, i3);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final int m3090(String str, int i, int i2, int i3) {
        fM.m2254(str, "");
        return (int) C3511jf.m3072(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: ɩ$default  reason: contains not printable characters */
    public static /* synthetic */ long m3094$default(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C3511jf.m3072(str, j, j4, j3);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final long m3092(String str, long j, long j2, long j3) {
        fM.m2254(str, "");
        String r0 = C3511jf.m3075(str);
        if (r0 == null) {
            return j;
        }
        Long r5 = gK.m2346(r0);
        if (r5 != null) {
            long longValue = r5.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + r0 + '\'').toString());
    }
}
