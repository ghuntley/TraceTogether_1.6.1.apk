package o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import o.C3321cb;

public class cM extends C3321cb.Cif {

    /* renamed from: ı  reason: contains not printable characters */
    public volatile boolean f1894;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final ScheduledExecutorService f1895;

    public cM(ThreadFactory threadFactory) {
        this.f1895 = cT.m1931(threadFactory);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3326cg m1896(Runnable runnable) {
        return m1952(runnable, (TimeUnit) null);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3326cg m1897(Runnable runnable, TimeUnit timeUnit) {
        if (this.f1894) {
            return C3345cx.INSTANCE;
        }
        return m1895(runnable, timeUnit, (C3342cu) null);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3326cg m1898(Runnable runnable, TimeUnit timeUnit) {
        if (runnable != null) {
            cP cPVar = new cP(runnable);
            try {
                cPVar.m1902(this.f1895.submit(cPVar));
                return cPVar;
            } catch (RejectedExecutionException e) {
                cX.m1936(e);
                return C3345cx.INSTANCE;
            }
        } else {
            throw new NullPointerException("run is null");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final cQ m1895(Runnable runnable, TimeUnit timeUnit, C3342cu cuVar) {
        if (runnable != null) {
            cQ cQVar = new cQ(runnable, cuVar);
            if (cuVar != null && !cuVar.m2025(cQVar)) {
                return cQVar;
            }
            try {
                cQVar.m1921(this.f1895.submit(cQVar));
            } catch (RejectedExecutionException e) {
                if (cuVar != null) {
                    cuVar.m2026(cQVar);
                }
                cX.m1936(e);
            }
            return cQVar;
        }
        throw new NullPointerException("run is null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m1899() {
        if (!this.f1894) {
            this.f1894 = true;
            this.f1895.shutdownNow();
        }
    }
}
