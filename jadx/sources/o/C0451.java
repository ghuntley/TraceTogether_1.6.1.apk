package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.ıӷ  reason: contains not printable characters */
public final class C0451 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Map<String, C0960> f4058 = new HashMap();

    /* renamed from: ǃ  reason: contains not printable characters */
    boolean f4059 = false;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Set<Object> f4060 = new C0639();

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4764(String str) {
        if (this.f4059) {
            C0960 r0 = this.f4058.get(str);
            if (r0 == null) {
                r0 = new C0960();
                this.f4058.put(str, r0);
            }
            r0.f5964 += 0.0f;
            r0.f5965++;
            if (r0.f5965 == Integer.MAX_VALUE) {
                r0.f5964 /= 2.0f;
                r0.f5965 /= 2;
            }
            if (str.equals("__container")) {
                Iterator<Object> it = this.f4060.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
