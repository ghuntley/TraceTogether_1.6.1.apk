package o;

/* renamed from: o.эι  reason: contains not printable characters */
final class C2530 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C2585 f11611;

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public static int m13532(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m13534(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public static int m13539(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m13544(byte[] bArr) {
        return f11611.m13728(bArr, 0, bArr.length);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m13535(byte[] bArr, int i, int i2) {
        return f11611.m13728(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public static int m13543(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m13539(b);
        }
        if (i3 == 1) {
            return m13532(b, bArr[i]);
        }
        if (i3 == 2) {
            return m13534((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: ι  reason: contains not printable characters */
    static int m13542(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C2726(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static int m13541(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f11611.m13726(charSequence, bArr, i, i2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static String m13533(byte[] bArr, int i, int i2) {
        return f11611.m13727(bArr, i, i2);
    }

    static {
        C2585 r0;
        if (!(C2509.m13297() && C2509.m13277()) || C0517.m4978()) {
            r0 = new C2637();
        } else {
            r0 = new C2727();
        }
        f11611 = r0;
    }
}
