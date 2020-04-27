package o;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public final class H extends C3011<Date> {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final TimeZone f1264 = TimeZone.getTimeZone("UTC");

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m1369(C0995 r1) {
        return m1366(r1);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* synthetic */ void m1370(C0815 r6, Object obj) {
        Date date = (Date) obj;
        if (date == null) {
            r6.m6224();
            return;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f1264, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(21);
        m1365(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        m1365(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        m1365(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        m1365(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        m1365(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        m1365(sb, gregorianCalendar.get(13), 2);
        sb.append('Z');
        r6.m6227(sb.toString());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Date m1366(C0995 r3) {
        if (r3.m7095() == C0313.NULL) {
            r3.m7105();
            return null;
        }
        String r32 = r3.m7101();
        try {
            return m1368(r32, new ParsePosition(0));
        } catch (ParseException unused) {
            new Object[1][0] = r32;
            F.m1355();
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m1365(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x010d A[Catch:{ IndexOutOfBoundsException -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x015c A[Catch:{ IndexOutOfBoundsException -> 0x0164 }] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Date m1368(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            r1 = r17
            r2 = r18
            java.lang.String r3 = "'"
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            int r4 = r0 + 4
            int r0 = m1367(r1, r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            int r5 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r6 = 45
            r7 = 0
            r8 = 1
            if (r4 >= r5) goto L_0x0022
            char r5 = r1.charAt(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r5 != r6) goto L_0x0022
            r5 = 1
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            if (r5 == 0) goto L_0x0027
            int r4 = r4 + 1
        L_0x0027:
            int r5 = r4 + 2
            int r4 = m1367(r1, r4, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            int r9 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r5 >= r9) goto L_0x003b
            char r9 = r1.charAt(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r9 != r6) goto L_0x003b
            r9 = 1
            goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            if (r9 == 0) goto L_0x0040
            int r5 = r5 + 1
        L_0x0040:
            int r9 = r5 + 2
            int r5 = m1367(r1, r5, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            int r10 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r9 >= r10) goto L_0x0056
            char r10 = r1.charAt(r9)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r11 = 84
            if (r10 != r11) goto L_0x0056
            r10 = 1
            goto L_0x0057
        L_0x0056:
            r10 = 0
        L_0x0057:
            if (r10 != 0) goto L_0x006d
            int r11 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r11 > r9) goto L_0x006d
            java.util.GregorianCalendar r6 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            int r4 = r4 - r8
            r6.<init>(r0, r4, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r2.setIndex(r9)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            java.util.Date r0 = r6.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            return r0
        L_0x006d:
            r11 = 90
            r12 = 2
            if (r10 == 0) goto L_0x0102
            int r9 = r9 + 1
            int r10 = r9 + 2
            int r9 = m1367(r1, r9, r10)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r14 = 58
            if (r10 >= r13) goto L_0x008a
            char r13 = r1.charAt(r10)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r13 != r14) goto L_0x008a
            r13 = 1
            goto L_0x008b
        L_0x008a:
            r13 = 0
        L_0x008b:
            if (r13 == 0) goto L_0x008f
            int r10 = r10 + 1
        L_0x008f:
            int r13 = r10 + 2
            int r10 = m1367(r1, r10, r13)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            int r15 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r13 >= r15) goto L_0x00a3
            char r15 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r15 != r14) goto L_0x00a3
            r14 = 1
            goto L_0x00a4
        L_0x00a3:
            r14 = 0
        L_0x00a4:
            if (r14 == 0) goto L_0x00a8
            int r13 = r13 + 1
        L_0x00a8:
            int r14 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r14 <= r13) goto L_0x0100
            char r14 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r14 == r11) goto L_0x0100
            r15 = 43
            if (r14 == r15) goto L_0x0100
            if (r14 == r6) goto L_0x0100
            int r6 = r13 + 2
            int r13 = m1367(r1, r13, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r14 = 59
            if (r13 <= r14) goto L_0x00c9
            r15 = 63
            if (r13 >= r15) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r14 = r13
        L_0x00ca:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r6 >= r13) goto L_0x00da
            char r13 = r1.charAt(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r15 = 46
            if (r13 != r15) goto L_0x00da
            r13 = 1
            goto L_0x00db
        L_0x00da:
            r13 = 0
        L_0x00db:
            if (r13 == 0) goto L_0x00fd
            int r6 = r6 + 1
            int r13 = r6 + 1
            int r13 = m1364(r1, r13)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            int r15 = r6 + 3
            int r15 = java.lang.Math.min(r13, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            int r16 = m1367(r1, r6, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            int r15 = r15 - r6
            if (r15 == r8) goto L_0x00f8
            if (r15 == r12) goto L_0x00f5
            goto L_0x00fa
        L_0x00f5:
            int r16 = r16 * 10
            goto L_0x00fa
        L_0x00f8:
            int r16 = r16 * 100
        L_0x00fa:
            r6 = r16
            goto L_0x0107
        L_0x00fd:
            r13 = r6
            r6 = 0
            goto L_0x0107
        L_0x0100:
            r6 = 0
            goto L_0x0106
        L_0x0102:
            r13 = r9
            r6 = 0
            r9 = 0
            r10 = 0
        L_0x0106:
            r14 = 0
        L_0x0107:
            int r15 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r15 <= r13) goto L_0x015c
            char r15 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            if (r15 != r11) goto L_0x0145
            java.util.TimeZone r11 = f1264     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            int r13 = r13 + r8
            java.util.GregorianCalendar r15 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r15.<init>(r11)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r15.setLenient(r7)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r15.set(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            int r4 = r4 - r8
            r15.set(r12, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r0 = 5
            r15.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r0 = 11
            r15.set(r0, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r0 = 12
            r15.set(r0, r10)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r0 = 13
            r15.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r0 = 14
            r15.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r2.setIndex(r13)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            java.util.Date r0 = r15.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            return r0
        L_0x0145:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            java.lang.String r5 = "Invalid time zone indicator '"
            r4.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r4.append(r15)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r4.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            java.lang.String r4 = r4.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
        L_0x015c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            java.lang.String r4 = "No time zone indicator"
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0164 }
        L_0x0164:
            r0 = move-exception
            if (r1 != 0) goto L_0x0169
            r1 = 0
            goto L_0x017a
        L_0x0169:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "\""
            r4.<init>(r5)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
        L_0x017a:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x0186
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x01a1
        L_0x0186:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x01a1:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.H.m1368(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m1367(String str, int i, int i2) {
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

    /* renamed from: ı  reason: contains not printable characters */
    private static int m1364(String str, int i) {
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
