package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.ɪɿ  reason: contains not printable characters */
final class C1363 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final Pattern f7550 = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    private C1363() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1362 m8473(String str) {
        Matcher matcher = f7550.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            return new C1362(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
        } catch (Exception unused) {
            C3263ac.m1563();
            return null;
        }
    }
}
