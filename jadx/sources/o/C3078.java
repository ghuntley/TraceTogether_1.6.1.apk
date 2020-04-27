package o;

/* renamed from: o.էӏ  reason: contains not printable characters */
public class C3078 {
    /* renamed from: Ι  reason: contains not printable characters */
    public static void m15686(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
