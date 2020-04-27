package o;

/* renamed from: o.Ɨſ  reason: contains not printable characters */
public final class C0672 {
    /* renamed from: ı  reason: contains not printable characters */
    public static <T> T m5540(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m5539(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str = C0835.m6301("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            str = C0835.m6301("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m5541(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m5542(i, i2, "index"));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m5544(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m5542(i, i2, str));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m5542(int i, int i2, String str) {
        if (i < 0) {
            return C0835.m6301("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C0835.m6301("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m5543(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m5542(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m5542(i2, i3, "end index");
            } else {
                str = C0835.m6301("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }
}
