package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0011\u0010\u0002\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a9\u0010\u000b\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u000f\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "", "ı", "(Ljava/lang/CharSequence;)Z", "", "p0", "", "p1", "p2", "p3", "p4", "ǃ", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "Ι", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "ι", "(Ljava/lang/String;Ljava/lang/String;Z)Z"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/gK")
public class gT extends gU {
    /* renamed from: Ι$default  reason: contains not printable characters */
    public static /* synthetic */ String m2343$default(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return gK.m2342(str, str2, str3, z);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final String m2342(String str, String str2, String str3, boolean z) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        fM.m2254(str4, "");
        fM.m2254(str5, "");
        fM.m2254(str6, "");
        return C3450gy.m2315$default(gK.m2365$default((CharSequence) str4, new String[]{str5}, z, 0, 4, (Object) null), str6, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C3413fo) null, 62, (Object) null);
    }

    /* renamed from: ι$default  reason: contains not printable characters */
    public static /* synthetic */ boolean m2345$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return gK.m2344(str, str2, z);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final boolean m2344(String str, String str2, boolean z) {
        fM.m2254(str, "");
        fM.m2254(str2, "");
        if (!z) {
            return str.startsWith(str2);
        }
        return gK.m2341(str, 0, str2, 0, str2.length(), z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m2340(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = ""
            o.fM.m2254(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0040
            o.gf r0 = o.gK.m2361(r4)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0022
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0022
        L_0x0020:
            r4 = 1
            goto L_0x003e
        L_0x0022:
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0020
            r3 = r0
            o.ed r3 = (o.C3376ed) r3
            int r3 = r3.m2207()
            char r3 = r4.charAt(r3)
            boolean r3 = o.gD.m2321(r3)
            if (r3 != 0) goto L_0x0026
            r4 = 0
        L_0x003e:
            if (r4 == 0) goto L_0x0041
        L_0x0040:
            r1 = 1
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.gT.m2340(java.lang.CharSequence):boolean");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final boolean m2341(String str, int i, String str2, int i2, int i3, boolean z) {
        fM.m2254(str, "");
        fM.m2254(str2, "");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }
}
