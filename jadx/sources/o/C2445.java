package o;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import o.C2274;
import o.C2745;

/* renamed from: o.кΙ  reason: contains not printable characters */
abstract class C2445 {

    /* renamed from: ı  reason: contains not printable characters */
    Boolean f11097;

    /* renamed from: Ɩ  reason: contains not printable characters */
    Long f11098;

    /* renamed from: ǃ  reason: contains not printable characters */
    Long f11099;

    /* renamed from: ɩ  reason: contains not printable characters */
    Boolean f11100;

    /* renamed from: Ι  reason: contains not printable characters */
    int f11101;

    /* renamed from: ι  reason: contains not printable characters */
    String f11102;

    C2445(String str, int i) {
        this.f11102 = str;
        this.f11101 = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract boolean m12567();

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract int m12568();

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract boolean m12569();

    /* renamed from: ι  reason: contains not printable characters */
    static Boolean m12565(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static Boolean m12566(String str, C2274.aux aux, C2244 r11) {
        String str2;
        List<String> list;
        C2745.C2746.m14555(aux);
        if (str == null || !aux.m11863() || aux.m11869() == C2274.aux.If.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (aux.m11869() == C2274.aux.If.IN_LIST) {
            if (aux.m11870() == 0) {
                return null;
            }
        } else if (!aux.m11868()) {
            return null;
        }
        C2274.aux.If r3 = aux.m11869();
        boolean r4 = aux.m11867();
        if (r4 || r3 == C2274.aux.If.REGEXP || r3 == C2274.aux.If.IN_LIST) {
            str2 = aux.m11866();
        } else {
            str2 = aux.m11866().toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (aux.m11870() == 0) {
            list = null;
        } else {
            List<String> r10 = aux.m11871();
            if (!r4) {
                ArrayList arrayList = new ArrayList(r10.size());
                for (String upperCase : r10) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                r10 = Collections.unmodifiableList(arrayList);
            }
            list = r10;
        }
        return m12562(str, r3, r4, str3, list, r3 == C2274.aux.If.REGEXP ? str3 : null, r11);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Boolean m12562(String str, C2274.aux.If ifR, boolean z, String str2, List<String> list, String str3, C2244 r8) {
        if (str == null) {
            return null;
        }
        if (ifR == C2274.aux.If.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && ifR != C2274.aux.If.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (ifR) {
            case REGEXP:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (r8 != null) {
                        r8.A_().m11603("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case BEGINS_WITH:
                return Boolean.valueOf(str.startsWith(str2));
            case ENDS_WITH:
                return Boolean.valueOf(str.endsWith(str2));
            case PARTIAL:
                return Boolean.valueOf(str.contains(str2));
            case EXACT:
                return Boolean.valueOf(str.equals(str2));
            case IN_LIST:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static Boolean m12561(long j, C2274.C2279 r3) {
        try {
            return m12560(new BigDecimal(j), r3, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static Boolean m12564(double d, C2274.C2279 r3) {
        try {
            return m12560(new BigDecimal(d), r3, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static Boolean m12563(String str, C2274.C2279 r5) {
        if (!C2090.m11098(str)) {
            return null;
        }
        try {
            return m12560(new BigDecimal(str), r5, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r2 != null) goto L_0x0087;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m12560(java.math.BigDecimal r9, o.C2274.C2279 r10, double r11) {
        /*
            o.C2745.C2746.m14555(r10)
            boolean r0 = r10.m11932()
            r1 = 0
            if (r0 == 0) goto L_0x0110
            o.Іͽ$ɩ$ı r0 = r10.m11928()
            o.Іͽ$ɩ$ı r2 = o.C2274.C2279.C2280.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0110
        L_0x0014:
            o.Іͽ$ɩ$ı r0 = r10.m11928()
            o.Іͽ$ɩ$ı r2 = o.C2274.C2279.C2280.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r10.m11930()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r10.m11935()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r10.m11931()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            o.Іͽ$ɩ$ı r0 = r10.m11928()
            o.Іͽ$ɩ$ı r2 = r10.m11928()
            o.Іͽ$ɩ$ı r3 = o.C2274.C2279.C2280.BETWEEN
            if (r2 != r3) goto L_0x0067
            java.lang.String r2 = r10.m11933()
            boolean r2 = o.C2090.m11098((java.lang.String) r2)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r10.m11934()
            boolean r2 = o.C2090.m11098((java.lang.String) r2)
            if (r2 != 0) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r3 = r10.m11933()     // Catch:{ NumberFormatException -> 0x0066 }
            r2.<init>(r3)     // Catch:{ NumberFormatException -> 0x0066 }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r10 = r10.m11934()     // Catch:{ NumberFormatException -> 0x0066 }
            r3.<init>(r10)     // Catch:{ NumberFormatException -> 0x0066 }
            r10 = r2
            r2 = r1
            goto L_0x007d
        L_0x0066:
            return r1
        L_0x0067:
            java.lang.String r2 = r10.m11926()
            boolean r2 = o.C2090.m11098((java.lang.String) r2)
            if (r2 != 0) goto L_0x0072
            return r1
        L_0x0072:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0110 }
            java.lang.String r10 = r10.m11926()     // Catch:{ NumberFormatException -> 0x0110 }
            r2.<init>(r10)     // Catch:{ NumberFormatException -> 0x0110 }
            r10 = r1
            r3 = r10
        L_0x007d:
            o.Іͽ$ɩ$ı r4 = o.C2274.C2279.C2280.BETWEEN
            if (r0 != r4) goto L_0x0085
            if (r10 == 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            return r1
        L_0x0085:
            if (r2 == 0) goto L_0x0110
        L_0x0087:
            int[] r4 = o.C2310.f10731
            int r0 = r0.ordinal()
            r0 = r4[r0]
            r4 = -1
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L_0x0104
            r7 = 2
            if (r0 == r7) goto L_0x00f8
            r8 = 3
            if (r0 == r8) goto L_0x00b0
            r11 = 4
            if (r0 == r11) goto L_0x009e
            goto L_0x0110
        L_0x009e:
            int r10 = r9.compareTo(r10)
            if (r10 == r4) goto L_0x00ab
            int r9 = r9.compareTo(r3)
            if (r9 == r6) goto L_0x00ab
            r5 = 1
        L_0x00ab:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00b0:
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00ec
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r0)
            java.math.BigDecimal r10 = r2.subtract(r10)
            int r10 = r9.compareTo(r10)
            if (r10 != r6) goto L_0x00e7
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r11)
            java.math.BigDecimal r10 = r2.add(r10)
            int r9 = r9.compareTo(r10)
            if (r9 != r4) goto L_0x00e7
            r5 = 1
        L_0x00e7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00ec:
            int r9 = r9.compareTo(r2)
            if (r9 != 0) goto L_0x00f3
            r5 = 1
        L_0x00f3:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00f8:
            int r9 = r9.compareTo(r2)
            if (r9 != r6) goto L_0x00ff
            r5 = 1
        L_0x00ff:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0104:
            int r9 = r9.compareTo(r2)
            if (r9 != r4) goto L_0x010b
            r5 = 1
        L_0x010b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2445.m12560(java.math.BigDecimal, o.Іͽ$ɩ, double):java.lang.Boolean");
    }
}
