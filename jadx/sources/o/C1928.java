package o;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.αı  reason: contains not printable characters */
public class C1928 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static volatile C1928 f9735;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Set<C1872> f9736 = new HashSet();

    C1928() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final Set<C1872> m10529() {
        Set<C1872> unmodifiableSet;
        synchronized (this.f9736) {
            unmodifiableSet = Collections.unmodifiableSet(this.f9736);
        }
        return unmodifiableSet;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C1928 m10528() {
        C1928 r1;
        C1928 r0 = f9735;
        if (r0 != null) {
            return r0;
        }
        synchronized (C1928.class) {
            r1 = f9735;
            if (r1 == null) {
                r1 = new C1928();
                f9735 = r1;
            }
        }
        return r1;
    }
}
