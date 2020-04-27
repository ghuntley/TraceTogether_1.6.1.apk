package o;

/* renamed from: o.єɩ  reason: contains not printable characters */
final class C2539 {
    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m13556(byte b) {
        return b >= 0;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private static boolean m13564(byte b) {
        return b > -65;
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m13568(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: І  reason: contains not printable characters */
    public static boolean m13569(byte b) {
        return b < -16;
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m13562(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m13561(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m13564(b2)) {
            throw C1124.m7564();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m13558(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m13564(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m13564(b3)))) {
            throw C1124.m7564();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m13557(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m13564(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m13564(b3) || m13564(b4)) {
            throw C1124.m7564();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }
}
