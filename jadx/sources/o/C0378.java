package o;

import java.util.HashSet;
import java.util.Set;
import o.C0496;

/* renamed from: o.ıͽ  reason: contains not printable characters */
class C0378 implements C2908 {

    /* renamed from: ı  reason: contains not printable characters */
    static final Set<C0496.C0497> f3872 = new HashSet<C0496.C0497>() {
        {
            add(C0496.C0497.START);
            add(C0496.C0497.RESUME);
            add(C0496.C0497.PAUSE);
            add(C0496.C0497.STOP);
        }
    };

    /* renamed from: ǃ  reason: contains not printable characters */
    final int f3873;

    public C0378(int i) {
        this.f3873 = i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m4589(C0496 r5) {
        return (f3872.contains(r5.f4169) && r5.f4166.f4296 == null) && (Math.abs(r5.f4166.f4290.hashCode() % this.f3873) != 0);
    }
}
