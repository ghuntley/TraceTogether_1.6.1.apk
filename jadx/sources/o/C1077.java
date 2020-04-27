package o;

import java.util.Map;
import java.util.Set;

/* renamed from: o.ɍɿ  reason: contains not printable characters */
public final class C1077 {

    /* renamed from: ı  reason: contains not printable characters */
    private int f6454;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3203<Map<C0475<?>, String>> f6455;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f6456;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0299<C0475<?>, C2822> f6457;

    /* renamed from: ι  reason: contains not printable characters */
    private final C0299<C0475<?>, String> f6458;

    /* renamed from: Ι  reason: contains not printable characters */
    public final Set<C0475<?>> m7427() {
        return this.f6457.keySet();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m7426(C0475<?> r2, C2822 r3, String str) {
        this.f6457.put(r2, r3);
        this.f6458.put(r2, str);
        this.f6454--;
        if (!r3.m14746()) {
            this.f6456 = true;
        }
        if (this.f6454 != 0) {
            return;
        }
        if (this.f6456) {
            this.f6455.m16148((Exception) new C2984(this.f6457));
            return;
        }
        this.f6455.m16150(this.f6458);
    }
}
