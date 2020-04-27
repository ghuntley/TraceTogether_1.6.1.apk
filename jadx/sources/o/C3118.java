package o;

/* renamed from: o.լϳ  reason: contains not printable characters */
public enum C3118 implements C3120 {
    ;

    /* renamed from: ı  reason: contains not printable characters */
    static String m15816(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: ı  reason: contains not printable characters */
    static String m15815(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        int i2 = i + 1;
        if (i2 < str.length()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(upperCase);
            sb2.append(str.substring(i2));
            str2 = sb2.toString();
        } else {
            str2 = String.valueOf(upperCase);
        }
        sb.append(str2);
        return sb.toString();
    }
}
