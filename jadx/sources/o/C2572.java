package o;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o.іǀ  reason: contains not printable characters */
public abstract class C2572 {

    /* renamed from: o.іǀ$If */
    public static abstract class If {

        /* renamed from: o.іǀ$If$ǃ  reason: contains not printable characters */
        public static abstract class C2573 {
            /* renamed from: ɩ  reason: contains not printable characters */
            public abstract C2573 m13687(Set<Cif> set);

            /* renamed from: ɩ  reason: contains not printable characters */
            public abstract If m13688();

            /* renamed from: Ι  reason: contains not printable characters */
            public abstract C2573 m13689();

            /* renamed from: Ι  reason: contains not printable characters */
            public abstract C2573 m13690(long j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public abstract long m13684();

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public abstract long m13685();

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public abstract Set<Cif> m13686();
    }

    /* renamed from: o.іǀ$if  reason: invalid class name */
    public enum Cif {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: o.іǀ$ɩ  reason: contains not printable characters */
    public static class C2574 {

        /* renamed from: ı  reason: contains not printable characters */
        public Map<C1766, If> f11708 = new HashMap();

        /* renamed from: ɩ  reason: contains not printable characters */
        public C2693 f11709;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract C2693 m13682();

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract Map<C1766, If> m13683();

    /* renamed from: ı  reason: contains not printable characters */
    public final long m13681(C1766 r5, long j, int i) {
        long r6 = j - m13682().m14297();
        If ifR = m13683().get(r5);
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i - 1))) * ifR.m13684(), r6), ifR.m13685());
    }
}
