package o;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import org.json.JSONException;

/* renamed from: o.Լӏ  reason: contains not printable characters */
public final class C3037 {

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3018 f13947;

    /* renamed from: ι  reason: contains not printable characters */
    public final C3018 f13948;

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m15519(String str, String str2) {
        Object[] objArr = {str2, str};
    }

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public C3037(C3018 r1, C3018 r2) {
        this.f13948 = r1;
        this.f13947 = r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m15518(C3018 r1, String str) {
        C2832 r12 = r1.m15464();
        if (r12 == null) {
            return null;
        }
        try {
            return r12.f13257.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }
}
