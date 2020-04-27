package o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.Σǃ  reason: contains not printable characters */
public class C1916 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Map<String, C1802> f9665 = new HashMap();

    /* renamed from: ι  reason: contains not printable characters */
    private final C1855 f9666;

    public C1916(C1855 r2) {
        this.f9666 = r2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final synchronized C1802 m10407(String str) {
        if (!this.f9665.containsKey(str)) {
            this.f9665.put(str, new C1802(this.f9666, str));
        }
        return this.f9665.get(str);
    }
}
