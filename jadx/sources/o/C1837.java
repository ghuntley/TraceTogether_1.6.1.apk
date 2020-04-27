package o;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: o.Ιʌ  reason: contains not printable characters */
public final class C1837 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final OutputStream f9433 = new C1833();

    /* renamed from: ı  reason: contains not printable characters */
    private static byte[] m10164(Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] removeFirst = deque.removeFirst();
            int min = Math.min(i2, removeFirst.length);
            System.arraycopy(removeFirst, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static byte[] m10166(InputStream inputStream) {
        int i;
        C1764.m9851(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i2 = 8192;
        for (int i3 = 0; i3 < 2147483639; i3 = i) {
            byte[] bArr = new byte[Math.min(i2, 2147483639 - i3)];
            arrayDeque.add(bArr);
            i = i3;
            int i4 = 0;
            while (i4 < bArr.length) {
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                if (read == -1) {
                    return m10164(arrayDeque, i);
                }
                i4 += read;
                i += read;
            }
            i2 = C1908.m10381(i2, 2);
        }
        if (inputStream.read() == -1) {
            return m10164(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static InputStream m10165(InputStream inputStream, long j) {
        return new C1811(inputStream, 1048577);
    }
}
