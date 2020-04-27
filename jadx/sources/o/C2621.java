package o;

import android.net.Uri;
import java.util.Map;

/* renamed from: o.јȷ  reason: contains not printable characters */
public final class C2621 {

    /* renamed from: ι  reason: contains not printable characters */
    private final Map<String, Map<String, String>> f11957;

    C2621(Map<String, Map<String, String>> map) {
        this.f11957 = map;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m13930(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map map = this.f11957.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str3);
            str3 = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
        }
        return (String) map.get(str3);
    }
}
