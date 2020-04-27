package o;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.hL;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b \u0018\u00002\u00020\u000eB\u0007¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00018%@$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/hN;", "Ljava/lang/Thread;", "ı", "()Ljava/lang/Thread;", "", "p0", "Lo/hL$if;", "p1", "", "ι", "(JLo/hL$if;)V", "Ӏ", "()V", "<init>", "Lo/hO;"}, k = 1, mv = {1, 1, 15})
public abstract class hN extends hO {
    /* access modifiers changed from: protected */
    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public abstract Thread m2476();

    /* access modifiers changed from: protected */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m2478() {
        Thread r0 = m2476();
        if (Thread.currentThread() != r0) {
            C3500iv r1 = C3499iu.m2796();
            if (r1 != null) {
                r1.m2798(r0);
            } else {
                LockSupport.unpark(r0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m2477(long j, hL.Cif ifVar) {
        fM.m2254(ifVar, "");
        if (hA.m2423()) {
            if (!(this != hC.f2251)) {
                throw new AssertionError();
            }
        }
        hC.f2251.m2465(j, ifVar);
    }
}
