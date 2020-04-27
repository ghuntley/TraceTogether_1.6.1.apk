package o;

import java.util.Iterator;
import java.util.Set;
import o.C2344;

/* renamed from: o.ʓ  reason: contains not printable characters */
public final class C1651 implements C1971 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f8649;

    /* renamed from: ι  reason: contains not printable characters */
    private final C1928 f8650;

    private C1651(Set<C1872> set, C1928 r2) {
        this.f8649 = m9500(set);
        this.f8650 = r2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m9502() {
        if (this.f8650.m10529().isEmpty()) {
            return this.f8649;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8649);
        sb.append(' ');
        sb.append(m9500(this.f8650.m10529()));
        return sb.toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m9500(Set<C1872> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C1872> it = set.iterator();
        while (it.hasNext()) {
            C1872 next = it.next();
            sb.append(next.m10258());
            sb.append('/');
            sb.append(next.m10259());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2344<C1971> m9501() {
        C2344.C2345 r0 = new C2344.C2345(C1971.class, new Class[0], (byte) 0).m12230(new C2393(C1872.class, 2, 0));
        C2313<T> r1 = C2079.m11010();
        if (r1 != null) {
            r0.f10854 = r1;
            return r0.m12231();
        }
        throw new NullPointerException("Null factory");
    }

    /* renamed from: ı  reason: contains not printable characters */
    static /* synthetic */ C1971 m9499(C2298 r2) {
        return new C1651(r2.m11971(C1872.class), C1928.m10528());
    }
}
