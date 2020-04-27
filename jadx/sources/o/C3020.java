package o;

/* renamed from: o.Է  reason: contains not printable characters */
public final class C3020 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int f13926;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m15469(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m15470(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m15468() {
        return f13926;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m15467() {
        return f13926 >= 9;
    }

    static {
        String property = System.getProperty("java.version");
        int r1 = m15469(property);
        if (r1 == -1) {
            r1 = m15470(property);
        }
        if (r1 == -1) {
            r1 = 6;
        }
        f13926 = r1;
    }
}
