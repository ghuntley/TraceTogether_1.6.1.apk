package o;

/* renamed from: o.ıռ  reason: contains not printable characters */
public final class C0466 {
    /* renamed from: ı  reason: contains not printable characters */
    public static void m4796(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
