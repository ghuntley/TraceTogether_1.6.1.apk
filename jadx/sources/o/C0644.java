package o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.ƖƗ  reason: contains not printable characters */
public class C0644 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Map<String, Object> f4646 = new HashMap();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f4647;

    public C0644(String str) {
        this.f4647 = str;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C0644 m5428(String str, String str2) {
        this.f4646.put(str, str2);
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public C0644 m5426(String str, Number number) {
        this.f4646.put(str, number);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public C2863 m5427() {
        C2863 r0 = new C2863(this.f4647);
        for (String next : this.f4646.keySet()) {
            Object obj = this.f4646.get(next);
            if (obj instanceof String) {
                r0.m14449(next, (String) obj);
            } else if (obj instanceof Number) {
                r0.m14450(next, (Number) obj);
            }
        }
        return r0;
    }
}
