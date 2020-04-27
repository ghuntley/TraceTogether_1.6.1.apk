package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: o.ҝɩ  reason: contains not printable characters */
public final class C2702 {

    /* renamed from: ı  reason: contains not printable characters */
    static final Charset f12516 = Charset.forName("UTF-8");

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final byte[] f12517;

    /* renamed from: o.ҝɩ$ǃ  reason: contains not printable characters */
    public interface C2703 {
    }

    /* renamed from: o.ҝɩ$ɩ  reason: contains not printable characters */
    public interface C2704<E> extends List<E>, RandomAccess {
        /* renamed from: ı  reason: contains not printable characters */
        C2704<E> m14399(int i);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m14400();

        /* renamed from: Ι  reason: contains not printable characters */
        boolean m14401();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m14396(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m14397(boolean z) {
        return z ? 1231 : 1237;
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f12517 = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f12517;
        C1841.m10175(bArr2, bArr2.length);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static int m14398(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }
}
