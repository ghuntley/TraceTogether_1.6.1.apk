package o;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.bS;

public final class bU {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Pattern f1709 = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Pattern f1710 = Pattern.compile("[- ]");

    /* renamed from: Ι  reason: contains not printable characters */
    private static final bS.If f1711;

    /* renamed from: ι  reason: contains not printable characters */
    private static final Pattern f1712 = Pattern.compile(" ");

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f1713;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f1714;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f1715;

    static {
        bS.If ifR = new bS.If();
        ifR.f1653 = "NA";
        f1711 = ifR;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.bU, java.util.List, java.util.AbstractMap, java.lang.StringBuilder] */
    /* renamed from: ı  reason: contains not printable characters */
    private boolean m1722() {
        String str;
        ? r0 = 0;
        Iterator it = r0.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                return false;
            }
            bS.C0123 r2 = (bS.C0123) it.next();
            if (r0.f1713.equals(r2.f1700)) {
                return false;
            }
            String str2 = r2.f1700;
            String str3 = r2.f1694;
            Pattern pattern = (Pattern) r0.get(str2);
            if (pattern == null) {
                pattern = Pattern.compile(str2);
                r0.put(str2, pattern);
            }
            Matcher matcher = pattern.matcher("999999999999999");
            matcher.find();
            String group = matcher.group();
            if (group.length() < r0.length()) {
                str = "";
            } else {
                str = group.replaceAll(str2, str3).replaceAll("9", " ");
            }
            if (str.length() > 0) {
                z = true;
            }
            if (z) {
                f1710.matcher(r2.f1697).find();
                return true;
            }
            it.remove();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.bU, java.util.List, java.util.AbstractMap, java.lang.CharSequence] */
    /* renamed from: Ι  reason: contains not printable characters */
    private String m1727() {
        ? r0 = 0;
        for (bS.C0123 r2 : r0) {
            String str = r2.f1700;
            Pattern pattern = (Pattern) r0.get(str);
            if (pattern == null) {
                pattern = Pattern.compile(str);
                r0.put(str, pattern);
            }
            Matcher matcher = pattern.matcher(r0);
            if (matcher.matches()) {
                f1710.matcher(r2.f1697).find();
                return r0.m1730(matcher.replaceAll(r2.f1694));
            }
        }
        return "";
    }

    /* renamed from: ι  reason: contains not printable characters */
    private String m1730(String str) {
        StringBuilder sb = null;
        int length = sb.length();
        if (!this.f1715 || length <= 0 || sb.charAt(length - 1) == ' ') {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sb);
            sb2.append(str);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(new String(sb));
        sb3.append(' ');
        sb3.append(str);
        return sb3.toString();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.bU, java.lang.StringBuilder, java.lang.Object] */
    /* renamed from: ι  reason: contains not printable characters */
    private static String m1729() {
        ? r0 = 0;
        if (r0.length() < 3) {
            return r0.m1730(r0.toString());
        }
        r0.m1725(r0.toString());
        String r1 = r0.m1727();
        if (r1.length() > 0) {
            return r1;
        }
        return r0.m1722() ? r0.m1723() : r0.toString();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.bU, java.lang.StringBuilder, java.lang.Object] */
    /* renamed from: ǃ  reason: contains not printable characters */
    private String m1723() {
        ? r0 = 0;
        int length = r0.length();
        if (length <= 0) {
            return r0.toString();
        }
        for (int i = 0; i < length; i++) {
            r0.m1724(r0.charAt(i));
        }
        return r0.toString();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List, java.lang.CharSequence, java.lang.Object, java.lang.StringBuilder] */
    /* renamed from: ǃ  reason: contains not printable characters */
    private String m1724(char c) {
        ? r1 = 0;
        Matcher matcher = f1712.matcher(r1);
        if (matcher.find(this.f1714)) {
            matcher.replaceFirst(Character.toString(c));
            this.f1714 = matcher.start();
            return r1.substring(0, this.f1714 + 1);
        }
        r1.size();
        this.f1713 = "";
        return r1.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: o.bS$If} */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map, java.util.Set, o.bR] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.bS.If m1728(java.lang.String r7) {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            if (r7 == 0) goto L_0x000d
            boolean r3 = r2.contains(r7)
            if (r3 == 0) goto L_0x000d
            r3 = 1
            goto L_0x000e
        L_0x000d:
            r3 = 0
        L_0x000e:
            if (r3 != 0) goto L_0x0030
            java.util.logging.Logger r3 = o.bT.f1704
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid or missing region code ("
            r5.<init>(r6)
            if (r7 != 0) goto L_0x001f
            java.lang.String r7 = "null"
        L_0x001f:
            r5.append(r7)
            java.lang.String r7 = ") provided."
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            r3.log(r4, r7)
            r7 = 0
            goto L_0x0047
        L_0x0030:
            if (r7 == 0) goto L_0x003a
            boolean r3 = r2.contains(r7)
            if (r3 == 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            if (r3 != 0) goto L_0x003f
            r3 = r2
            goto L_0x0043
        L_0x003f:
            o.bS$If r3 = r2.m1718()
        L_0x0043:
            if (r3 == 0) goto L_0x0073
            int r7 = r3.f1671
        L_0x0047:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r2.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x0056
            java.lang.String r7 = "ZZ"
            goto L_0x005c
        L_0x0056:
            java.lang.Object r7 = r7.get(r1)
            java.lang.String r7 = (java.lang.String) r7
        L_0x005c:
            if (r7 == 0) goto L_0x0065
            boolean r7 = r2.contains(r7)
            if (r7 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 != 0) goto L_0x0069
            goto L_0x006d
        L_0x0069:
            o.bS$If r2 = r2.m1718()
        L_0x006d:
            if (r2 == 0) goto L_0x0070
            return r2
        L_0x0070:
            o.bS$If r7 = f1711
            return r7
        L_0x0073:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "Invalid region code: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bU.m1728(java.lang.String):o.bS$If");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List, java.util.AbstractMap, java.lang.String, o.bS$If] */
    /* renamed from: ǃ  reason: contains not printable characters */
    private void m1725(String str) {
        ? r0 = 0;
        for (bS.C0123 next : r0.f1643) {
            if ((r0.length() <= 0 || !bT.m1720(next.f1697) || next.f1699 || next.f1695) && ((r0.length() != 0 || bT.m1720(next.f1697) || next.f1699) && f1709.matcher(next.f1694).matches())) {
                r0.add(next);
            }
        }
        int length = str.length() - 3;
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            bS.C0123 r3 = (bS.C0123) it.next();
            if (r3.f1696.size() != 0) {
                String str2 = r3.f1696.get(Math.min(length, r3.f1696.size() - 1));
                Pattern pattern = (Pattern) r0.get(str2);
                if (pattern == null) {
                    pattern = Pattern.compile(str2);
                    r0.put(str2, pattern);
                }
                if (!pattern.matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractMap, java.util.List, java.lang.CharSequence, java.util.Map, java.lang.Object, java.lang.StringBuilder, o.bS$If] */
    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m1726(char c) {
        boolean z;
        int i;
        StringBuilder sb;
        int r0;
        String str;
        ? r2 = 0;
        if (!Character.isDigit(c) && r2.length() == 1) {
            bT.f1706.matcher(Character.toString(c)).matches();
        }
        StringBuilder sb2 = new StringBuilder("\\+|");
        sb2.append(r2.f1653);
        String obj = sb2.toString();
        Pattern pattern = (Pattern) r2.get(obj);
        if (pattern == null) {
            pattern = Pattern.compile(obj);
            r2.put(obj, pattern);
        }
        Matcher matcher = pattern.matcher(r2);
        boolean z2 = false;
        if (matcher.lookingAt()) {
            matcher.end();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!(r2.length() == 0 || (r0 = bT.m1721(sb)) == 0)) {
                r2.append((sb = new StringBuilder()));
                List list = (List) r2.get(Integer.valueOf(r0));
                if (list == null) {
                    str = "ZZ";
                } else {
                    str = (String) list.get(0);
                }
                if ("001".equals(str)) {
                    r2.containsKey(Integer.valueOf(r0));
                } else if (!str.equals(r2)) {
                    m1728(str);
                }
                z2 = true;
            }
            if (z2) {
                r2.clear();
                return m1729();
            }
        } else {
            if (r2.f1671 == 1 && r2.charAt(0) == '1' && r2.charAt(1) != '0' && r2.charAt(1) != '1') {
                i = 1;
            } else {
                if (r2.f1633) {
                    String str2 = r2.f1670;
                    Pattern pattern2 = (Pattern) r2.get(str2);
                    if (pattern2 == null) {
                        pattern2 = Pattern.compile(str2);
                        r2.put(str2, pattern2);
                    }
                    Matcher matcher2 = pattern2.matcher(r2);
                    if (matcher2.lookingAt() && matcher2.end() > 0) {
                        i = matcher2.end();
                    }
                }
                i = 0;
            }
            if (!r2.equals(r2.substring(0, i))) {
                r2.clear();
                return m1729();
            }
        }
        return r2.toString();
    }
}
