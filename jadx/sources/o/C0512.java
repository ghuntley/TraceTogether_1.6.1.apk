package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import o.C3169;

/* renamed from: o.ŀι  reason: contains not printable characters */
class C0512 extends C0326 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final C3169.C3172 f4257 = new C3169.C3172() {
        /* renamed from: ı  reason: contains not printable characters */
        public final <T extends C0326> T m4974(Class<T> cls) {
            return new C0512();
        }
    };

    /* renamed from: ǃ  reason: contains not printable characters */
    final HashMap<UUID, C0307> f4258 = new HashMap<>();

    C0512() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static C0512 m4971(C0307 r2) {
        return (C0512) new C3169(r2, f4257).m16018(C0512.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4972(UUID uuid) {
        C0307 remove = this.f4258.remove(uuid);
        if (remove != null) {
            remove.m4365();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m4973() {
        for (C0307 r1 : this.f4258.values()) {
            r1.m4365();
        }
        this.f4258.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f4258.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
