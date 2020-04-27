package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.C0987;

/* renamed from: o.Ɨј  reason: contains not printable characters */
public class C0705 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C0705 f4900 = new C0705(true);

    /* renamed from: ǃ  reason: contains not printable characters */
    private static volatile C0705 f4901 = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static volatile C0705 f4902 = null;

    /* renamed from: Ι  reason: contains not printable characters */
    private static volatile boolean f4903 = false;

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean f4904 = true;

    /* renamed from: І  reason: contains not printable characters */
    private final Map<If, C0987.C3635iF<?, ?>> f4905;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C0705 m5817() {
        C0705 r0 = f4902;
        if (r0 == null) {
            synchronized (C0705.class) {
                r0 = f4902;
                if (r0 == null) {
                    r0 = f4900;
                    f4902 = r0;
                }
            }
        }
        return r0;
    }

    /* renamed from: o.Ɨј$If */
    static final class If {

        /* renamed from: ı  reason: contains not printable characters */
        private final int f4906;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final Object f4907;

        If(Object obj, int i) {
            this.f4907 = obj;
            this.f4906 = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f4907) * 65535) + this.f4906;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof If)) {
                return false;
            }
            If ifR = (If) obj;
            if (this.f4907 == ifR.f4907 && this.f4906 == ifR.f4906) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C0705 m5816() {
        Class<C0705> cls = C0705.class;
        C0705 r1 = f4901;
        if (r1 != null) {
            return r1;
        }
        synchronized (cls) {
            C0705 r12 = f4901;
            if (r12 != null) {
                return r12;
            }
            C0705 r13 = C0842.m6313(cls);
            f4901 = r13;
            return r13;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <ContainingType extends C1637> C0987.C3635iF<ContainingType, ?> m5818(ContainingType containingtype, int i) {
        return this.f4905.get(new If(containingtype, i));
    }

    C0705() {
        this.f4905 = new HashMap();
    }

    private C0705(boolean z) {
        this.f4905 = Collections.emptyMap();
    }
}
