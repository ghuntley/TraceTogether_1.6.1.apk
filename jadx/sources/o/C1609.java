package o;

import java.util.HashMap;
import java.util.Iterator;
import o.C3169;

/* renamed from: o.ʅı  reason: contains not printable characters */
final class C1609 extends C0326 {

    /* renamed from: І  reason: contains not printable characters */
    private static final C3169.C3172 f8513 = new C3169.C3172() {
        /* renamed from: ı  reason: contains not printable characters */
        public final <T extends C0326> T m9345(Class<T> cls) {
            return new C1609(true);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    final HashMap<String, C0307> f8514 = new HashMap<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    final HashMap<String, C1277> f8515 = new HashMap<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    final boolean f8516;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f8517 = false;

    /* renamed from: ι  reason: contains not printable characters */
    final HashMap<String, C1609> f8518 = new HashMap<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    static C1609 m9342(C0307 r2) {
        return (C1609) new C3169(r2, f8513).m16018(C1609.class);
    }

    C1609(boolean z) {
        this.f8516 = z;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9344() {
        C1550.m9081(3);
        this.f8517 = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9343(C1277 r3) {
        C1550.m9081(3);
        C1609 r0 = this.f8518.get(r3.mWho);
        if (r0 != null) {
            r0.m4397();
            this.f8518.remove(r3.mWho);
        }
        C0307 r02 = this.f8514.get(r3.mWho);
        if (r02 != null) {
            r02.m4365();
            this.f8514.remove(r3.mWho);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1609 r5 = (C1609) obj;
            return this.f8515.equals(r5.f8515) && this.f8518.equals(r5.f8518) && this.f8514.equals(r5.f8514);
        }
    }

    public final int hashCode() {
        return (((this.f8515.hashCode() * 31) + this.f8518.hashCode()) * 31) + this.f8514.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<C1277> it = this.f8515.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f8518.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f8514.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
