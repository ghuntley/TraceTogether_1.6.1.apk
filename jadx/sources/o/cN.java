package o;

import java.util.concurrent.ThreadFactory;
import o.C3321cb;

public final class cN extends C3321cb {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final cS f1896 = new cS("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: Ι  reason: contains not printable characters */
    private ThreadFactory f1897;

    public cN() {
        this(f1896);
    }

    private cN(ThreadFactory threadFactory) {
        this.f1897 = threadFactory;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3321cb.Cif m1900() {
        return new cM(this.f1897);
    }
}
