package o;

import java.util.TimeZone;

/* renamed from: o.ր  reason: contains not printable characters */
public final class C3183 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final TimeZone f14448 = TimeZone.getTimeZone("UTC");

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01e2 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x010e A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ea }] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m16058(java.lang.String r18, java.text.ParsePosition r19) {
        /*
            r1 = r18
            r2 = r19
            int r0 = r19.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r3 = r0 + 4
            int r0 = m16057(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r4 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r5 = 45
            r7 = 1
            if (r3 >= r4) goto L_0x001f
            char r4 = r1.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r4 != r5) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            if (r4 == 0) goto L_0x0024
            int r3 = r3 + 1
        L_0x0024:
            int r4 = r3 + 2
            int r3 = m16057(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r8 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r4 >= r8) goto L_0x0038
            char r8 = r1.charAt(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r8 != r5) goto L_0x0038
            r8 = 1
            goto L_0x0039
        L_0x0038:
            r8 = 0
        L_0x0039:
            if (r8 == 0) goto L_0x003d
            int r4 = r4 + 1
        L_0x003d:
            int r8 = r4 + 2
            int r4 = m16057(r1, r4, r8)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r9 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r8 >= r9) goto L_0x0053
            char r9 = r1.charAt(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r10 = 84
            if (r9 != r10) goto L_0x0053
            r9 = 1
            goto L_0x0054
        L_0x0053:
            r9 = 0
        L_0x0054:
            if (r9 != 0) goto L_0x006a
            int r10 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r10 > r8) goto L_0x006a
            java.util.GregorianCalendar r5 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r3 = r3 - r7
            r5.<init>(r0, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r2.setIndex(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.util.Date r0 = r5.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            return r0
        L_0x006a:
            r10 = 43
            r11 = 90
            r12 = 2
            if (r9 == 0) goto L_0x0103
            int r8 = r8 + 1
            int r9 = r8 + 2
            int r8 = m16057(r1, r8, r9)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r13 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r14 = 58
            if (r9 >= r13) goto L_0x0089
            char r13 = r1.charAt(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r13 != r14) goto L_0x0089
            r13 = 1
            goto L_0x008a
        L_0x0089:
            r13 = 0
        L_0x008a:
            if (r13 == 0) goto L_0x008e
            int r9 = r9 + 1
        L_0x008e:
            int r13 = r9 + 2
            int r9 = m16057(r1, r9, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r15 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r13 >= r15) goto L_0x00a2
            char r15 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r15 != r14) goto L_0x00a2
            r14 = 1
            goto L_0x00a3
        L_0x00a2:
            r14 = 0
        L_0x00a3:
            if (r14 == 0) goto L_0x00a7
            int r13 = r13 + 1
        L_0x00a7:
            int r14 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r14 <= r13) goto L_0x0106
            char r14 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r14 == r11) goto L_0x0106
            if (r14 == r10) goto L_0x0106
            if (r14 == r5) goto L_0x0106
            int r14 = r13 + 2
            int r13 = m16057(r1, r13, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r15 = 59
            if (r13 <= r15) goto L_0x00c8
            r15 = 63
            if (r13 >= r15) goto L_0x00c8
            r16 = 59
            goto L_0x00ca
        L_0x00c8:
            r16 = r13
        L_0x00ca:
            int r13 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r14 >= r13) goto L_0x00da
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r15 = 46
            if (r13 != r15) goto L_0x00da
            r13 = 1
            goto L_0x00db
        L_0x00da:
            r13 = 0
        L_0x00db:
            if (r13 == 0) goto L_0x00ff
            int r14 = r14 + 1
            int r13 = r14 + 1
            int r13 = m16056(r1, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r15 = r14 + 3
            int r15 = java.lang.Math.min(r13, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r17 = m16057(r1, r14, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r15 = r15 - r14
            if (r15 == r7) goto L_0x00f8
            if (r15 == r12) goto L_0x00f5
            goto L_0x00fa
        L_0x00f5:
            int r17 = r17 * 10
            goto L_0x00fa
        L_0x00f8:
            int r17 = r17 * 100
        L_0x00fa:
            r14 = r16
            r15 = r17
            goto L_0x0108
        L_0x00ff:
            r13 = r14
            r14 = r16
            goto L_0x0107
        L_0x0103:
            r13 = r8
            r8 = 0
            r9 = 0
        L_0x0106:
            r14 = 0
        L_0x0107:
            r15 = 0
        L_0x0108:
            int r12 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r12 <= r13) goto L_0x01e2
            char r12 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r6 = 5
            if (r12 != r11) goto L_0x011a
            java.util.TimeZone r5 = f14448     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r13 = r13 + r7
            goto L_0x01b1
        L_0x011a:
            if (r12 == r10) goto L_0x0138
            if (r12 != r5) goto L_0x011f
            goto L_0x0138
        L_0x011f:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r3.append(r12)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
        L_0x0138:
            java.lang.String r5 = r1.substring(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r10 = r5.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r10 < r6) goto L_0x0143
            goto L_0x0154
        L_0x0143:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r10.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r10.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.String r5 = "00"
            r10.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.String r5 = r10.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
        L_0x0154:
            int r10 = r5.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r13 = r13 + r10
            java.lang.String r10 = "+0000"
            boolean r10 = r10.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r10 != 0) goto L_0x01af
            java.lang.String r10 = "+00:00"
            boolean r10 = r10.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r10 == 0) goto L_0x016a
            goto L_0x01af
        L_0x016a:
            java.lang.String r10 = "GMT"
            java.lang.String r5 = r10.concat(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.util.TimeZone r10 = java.util.TimeZone.getTimeZone(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.String r11 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            boolean r12 = r11.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r12 != 0) goto L_0x01ad
            java.lang.String r12 = ":"
            java.lang.String r6 = ""
            java.lang.String r6 = r11.replace(r12, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            boolean r6 = r6.equals(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            if (r6 == 0) goto L_0x018d
            goto L_0x01ad
        L_0x018d:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r3.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.String r4 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
        L_0x01ad:
            r5 = r10
            goto L_0x01b1
        L_0x01af:
            java.util.TimeZone r5 = f14448     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
        L_0x01b1:
            java.util.GregorianCalendar r6 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r6.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r5 = 0
            r6.setLenient(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r6.set(r7, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            int r3 = r3 - r7
            r0 = 2
            r6.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r0 = 5
            r6.set(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r0 = 11
            r6.set(r0, r8)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r0 = 12
            r6.set(r0, r9)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r0 = 13
            r6.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r0 = 14
            r6.set(r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            r2.setIndex(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.util.Date r0 = r6.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            return r0
        L_0x01e2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01ee, NumberFormatException -> 0x01ec, IllegalArgumentException -> 0x01ea }
        L_0x01ea:
            r0 = move-exception
            goto L_0x01ef
        L_0x01ec:
            r0 = move-exception
            goto L_0x01ef
        L_0x01ee:
            r0 = move-exception
        L_0x01ef:
            if (r1 != 0) goto L_0x01f3
            r1 = 0
            goto L_0x0206
        L_0x01f3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            r3.append(r1)
            r1 = 34
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x0206:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x0212
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x022d
        L_0x0212:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x022d:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r19.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3183.m16058(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m16057(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                StringBuilder sb = new StringBuilder("Invalid number: ");
                sb.append(str.substring(i, i2));
                throw new NumberFormatException(sb.toString());
            }
        } else {
            i4 = i;
            i3 = 0;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                StringBuilder sb2 = new StringBuilder("Invalid number: ");
                sb2.append(str.substring(i, i2));
                throw new NumberFormatException(sb2.toString());
            }
        }
        return -i3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m16056(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
