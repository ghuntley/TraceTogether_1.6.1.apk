package o;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\bÆ\u0002\u0018\u00002\u00020\u0013B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0002\u0010\rJ\u0015\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0004\u0010\u000eJ\u000f\u0010\b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\b\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n"}, d2 = {"Lo/li;", "", "Ι", "Ljava/lang/String;", "ɩ", "Ljavax/crypto/Cipher;", "ǃ", "Ljavax/crypto/Cipher;", "ι", "Ljavax/crypto/SecretKey;", "Ljavax/crypto/SecretKey;", "", "p0", "([B)[B", "()Ljavax/crypto/Cipher;", "Ljavax/crypto/spec/SecretKeySpec;", "()Ljavax/crypto/spec/SecretKeySpec;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.li  reason: case insensitive filesystem */
public final class C3568li {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C3568li f2880;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Cipher f2881;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final String f2882 = f2882;

    /* renamed from: ι  reason: contains not printable characters */
    private static final SecretKey f2883;

    static {
        C3568li liVar = new C3568li();
        f2880 = liVar;
        f2883 = liVar.m3558();
        f2881 = liVar.m3557();
    }

    private C3568li() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final SecretKeySpec m3558() {
        byte[] r0 = C1709.m9684().m9688("atwb5CPoHq13y53aS1C8KTTXPGyJsm3RDN1pr/FAmIl=");
        fM.m2252((Object) r0, "");
        return new SecretKeySpec(r0, 0, r0.length, "AES");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Cipher m3557() {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        fM.m2252((Object) instance, "");
        return instance;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final byte[] m3559(byte[] bArr) {
        fM.m2254(bArr, "");
        f2881.init(1, f2883);
        byte[] doFinal = f2881.doFinal(bArr);
        fM.m2252((Object) doFinal, "");
        byte[] iv = f2881.getIV();
        fM.m2252((Object) iv, "");
        return dM.m2060(doFinal, iv);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final byte[] m3560(byte[] bArr) {
        fM.m2254(bArr, "");
        byte[] r1 = dM.m2064(bArr, 0, bArr.length - 16);
        f2881.init(2, f2883, new IvParameterSpec(dM.m2064(bArr, bArr.length - 16, bArr.length)));
        byte[] doFinal = f2881.doFinal(r1);
        fM.m2252((Object) doFinal, "");
        return doFinal;
    }
}
