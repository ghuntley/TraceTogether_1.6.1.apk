package o;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import o.C2745;

/* renamed from: o.чɩ  reason: contains not printable characters */
abstract class C2500 extends C1759 {

    /* renamed from: ι  reason: contains not printable characters */
    private int f11319;

    protected C2500(byte[] bArr) {
        C2745.C2746.m14563(bArr.length == 25);
        this.f11319 = Arrays.hashCode(bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract byte[] m13252();

    public int hashCode() {
        return this.f11319;
    }

    public boolean equals(Object obj) {
        C2722 r4;
        if (obj != null && (obj instanceof C1763)) {
            try {
                C1763 r42 = (C1763) obj;
                if (r42.m9849() != hashCode() || (r4 = r42.m9850()) == null) {
                    return false;
                }
                return Arrays.equals(m13252(), (byte[]) C2813.m14731(r4));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2722 m13251() {
        return C2813.m14730(m13252());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m13250() {
        return hashCode();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    protected static byte[] m13249(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
