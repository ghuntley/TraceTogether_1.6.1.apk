package o;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.aG;

public abstract class aN<Params, Progress, Result> extends aG<Params, Progress, Result> implements aJ<aW>, aO, aW {

    /* renamed from: ι  reason: contains not printable characters */
    private final aQ f1465 = new aQ();

    /* renamed from: ı  reason: contains not printable characters */
    public final void m1512(ExecutorService executorService) {
        super.m1492((Executor) new C0113(executorService, this));
    }

    public int compareTo(Object obj) {
        return aL.m1502(this, obj);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1511(aW aWVar) {
        if (L_() == aG.If.PENDING) {
            this.f1465.m1498(aWVar);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    /* renamed from: o.aN$ı  reason: contains not printable characters */
    static class C0113<Result> implements Executor {

        /* renamed from: ı  reason: contains not printable characters */
        private final Executor f1466;

        /* renamed from: ɩ  reason: contains not printable characters */
        final aN f1467;

        public C0113(Executor executor, aN aNVar) {
            this.f1466 = executor;
            this.f1467 = aNVar;
        }

        public final void execute(Runnable runnable) {
            this.f1466.execute(new aS<Result>(runnable) {
                /* renamed from: ι  reason: contains not printable characters */
                public final <T extends aJ<aW> & aO & aW> T m1519() {
                    return C0113.this.f1467;
                }
            });
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public Collection<aW> m1514() {
        return this.f1465.m1499();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m1517() {
        return this.f1465.m1500();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public aL m1510() {
        return this.f1465.m1520();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m1516(boolean z) {
        this.f1465.m1546(z);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public boolean m1513() {
        return this.f1465.m1544();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m1515(Throwable th) {
        this.f1465.m1545(th);
    }
}
