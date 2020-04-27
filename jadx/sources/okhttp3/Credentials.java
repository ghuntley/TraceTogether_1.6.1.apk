package okhttp3;

import java.nio.charset.Charset;
import o.jM;
import okhttp3.internal.Util;

public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, Util.ISO_8859_1);
    }

    public static String basic(String str, String str2, Charset charset) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return "Basic ".concat(String.valueOf(jM.m2950(sb.toString(), charset).m2957()));
    }
}
