package o;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.cw  reason: case insensitive filesystem */
public final class C3344cw {

    /* renamed from: ı  reason: contains not printable characters */
    private final SharedPreferences f2010;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f2011;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m2029(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r4.isEmpty() != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3344cw(com.google.firebase.FirebaseApp r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.m1074()
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.f2010 = r0
            o.ͳ r0 = r4.m1075()
            java.lang.String r0 = r0.f8950
            r1 = 0
            if (r0 == 0) goto L_0x001a
            goto L_0x0049
        L_0x001a:
            o.ͳ r4 = r4.m1075()
            java.lang.String r4 = r4.f8951
            java.lang.String r0 = "1:"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "2:"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r0 = r4
            goto L_0x0049
        L_0x0033:
            java.lang.String r0 = ":"
            java.lang.String[] r4 = r4.split(r0)
            int r0 = r4.length
            r2 = 4
            if (r0 == r2) goto L_0x003f
        L_0x003d:
            r0 = r1
            goto L_0x0049
        L_0x003f:
            r0 = 1
            r4 = r4[r0]
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0031
            goto L_0x003d
        L_0x0049:
            r3.f2011 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3344cw.<init>(com.google.firebase.FirebaseApp):void");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m2034() {
        synchronized (this.f2010) {
            SharedPreferences sharedPreferences = this.f2010;
            String str = this.f2011;
            StringBuilder sb = new StringBuilder("|T|");
            sb.append(str);
            sb.append("|*");
            String string = sharedPreferences.getString(sb.toString(), (String) null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            if (!string.startsWith("{")) {
                return string;
            }
            String r1 = m2027(string);
            return r1;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m2027(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m2033() {
        synchronized (this.f2010) {
            String r1 = m2030();
            if (r1 != null) {
                return r1;
            }
            String r12 = m2031();
            return r12;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private String m2030() {
        String string;
        synchronized (this.f2010) {
            string = this.f2010.getString("|S|id", (String) null);
        }
        return string;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private String m2031() {
        synchronized (this.f2010) {
            String string = this.f2010.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey r1 = m2032(string);
            if (r1 == null) {
                return null;
            }
            String r12 = m2028(r1);
            return r12;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m2028(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static PublicKey m2032(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            return null;
        }
    }
}
