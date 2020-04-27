package o;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Set;

/* renamed from: o.ʙǃ  reason: contains not printable characters */
public final class C1663 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f8663;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f8664;

    /* renamed from: Ι  reason: contains not printable characters */
    public final String f8665;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f8666;

    private C1663(String str) {
        this.f8666 = m9523(str, "apiKey");
        this.f8664 = m9523(str, "oobCode");
        this.f8663 = m9523(str, "mode");
        if (this.f8666 == null || this.f8664 == null || this.f8663 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        m9523(str, "continueUrl");
        m9523(str, "languageCode");
        this.f8665 = m9523(str, "tenantId");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static String m9523(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(parse.getQueryParameter("link")).getQueryParameter(str2);
            }
            return null;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    static {
        new C0850().m6396("recoverEmail", 2).m6396("resetPassword", 0).m6396("signIn", 4).m6396("verifyEmail", 1).m6396("verifyBeforeChangeEmail", 5).m6396("revertSecondFactorAddition", 6).m6397();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C1663 m9522(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new C1663(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }
}
