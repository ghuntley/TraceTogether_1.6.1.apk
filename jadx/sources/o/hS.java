package o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b \u0018\u00002\u00020\u00182\u00020\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u0002\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0002\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/hS;", "", "Ι", "Z", "", "close", "()V", "Lo/ex;", "p0", "Ljava/lang/Runnable;", "Lo/ɩ;", "p1", "(Lo/ex;Ljava/lang/Runnable;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "ι", "", "toString", "()Ljava/lang/String;", "<init>", "Lo/hT;", "Lo/hD;"}, k = 1, mv = {1, 1, 15})
public abstract class hS extends hT implements hD {

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f2276;

    /* renamed from: ι  reason: contains not printable characters */
    public final void m2495() {
        this.f2276 = iO.m2613(m2496());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m2494(C3396ex exVar, Runnable runnable) {
        Runnable runnable2;
        fM.m2254(exVar, "");
        fM.m2254(runnable, "");
        try {
            Executor r2 = m2496();
            C3500iv r0 = C3499iu.m2796();
            if (r0 == null || (runnable2 = r0.m2799(runnable)) == null) {
                runnable2 = runnable;
            }
            r2.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            C3500iv r22 = C3499iu.m2796();
            if (r22 != null) {
                r22.m2800();
            }
            hC.f2251.m2466(runnable);
        }
    }

    public void close() {
        Executor r0 = m2496();
        if (!(r0 instanceof ExecutorService)) {
            r0 = null;
        }
        ExecutorService executorService = (ExecutorService) r0;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public String toString() {
        return m2496().toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof hS) && ((hS) obj).m2496() == m2496();
    }

    public int hashCode() {
        return System.identityHashCode(m2496());
    }
}
