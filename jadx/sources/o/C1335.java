package o;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.ɪƚ  reason: contains not printable characters */
public class C1335 {

    /* renamed from: ı  reason: contains not printable characters */
    public static C1335 f7361 = new C1335();

    /* renamed from: ι  reason: contains not printable characters */
    private ConcurrentHashMap<String, String> f7362 = new ConcurrentHashMap<>();

    protected C1335() {
    }

    static {
        new C1642("LibraryVersion", "");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m8374(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Please provide a valid libraryName");
        } else if (this.f7362.containsKey(str)) {
            return this.f7362.get(str);
        } else {
            Properties properties = new Properties();
            String str2 = null;
            try {
                InputStream resourceAsStream = C1335.class.getResourceAsStream(String.format("/%s.properties", new Object[]{str}));
                if (resourceAsStream != null) {
                    properties.load(resourceAsStream);
                    str2 = properties.getProperty("version", (String) null);
                }
            } catch (IOException unused) {
            }
            if (str2 == null) {
                str2 = "UNKNOWN";
            }
            this.f7362.put(str, str2);
            return str2;
        }
    }
}
