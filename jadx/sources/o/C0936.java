package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: o.ǃւ  reason: contains not printable characters */
public final class C0936 {

    /* renamed from: ı  reason: contains not printable characters */
    public static final byte[] f5913;

    /* renamed from: ǃ  reason: contains not printable characters */
    static final Charset f5914 = Charset.forName("UTF-8");

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Charset f5915 = Charset.forName("ISO-8859-1");

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C0598 f5916;

    /* renamed from: ι  reason: contains not printable characters */
    private static final ByteBuffer f5917;

    /* renamed from: ı  reason: contains not printable characters */
    public static int m6805(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m6812(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static <T> T m6809(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static <T> T m6813(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m6814(byte[] bArr) {
        return C2530.m13544(bArr);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m6807(byte[] bArr) {
        return new String(bArr, f5914);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m6808(byte[] bArr) {
        int length = bArr.length;
        int r2 = m6811(length, bArr, 0, length);
        if (r2 == 0) {
            return 1;
        }
        return r2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static int m6811(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static boolean m6810(C1637 r1) {
        if (!(r1 instanceof C0487)) {
            return false;
        }
        C0487 r12 = (C0487) r1;
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static Object m6806(Object obj, Object obj2) {
        return ((C1637) obj).m9435().m9847((C1637) obj2).m9844();
    }

    static {
        byte[] bArr = new byte[0];
        f5913 = bArr;
        f5917 = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f5913;
        f5916 = C0598.m5272(bArr2, 0, bArr2.length, false);
    }
}
