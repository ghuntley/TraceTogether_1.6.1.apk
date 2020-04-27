package o;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\b\u0016\u0018\u00002\u00020'B%\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$B)\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010%\u001a\u00020\u000e¢\u0006\u0004\b#\u0010&J\u0015\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0002\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0002\u0010\u0017J#\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00182\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u0002\u0010\u001cJ+\u0010\u0005\u001a\u00020\u00142\n\u0010\u0011\u001a\u00060\u0019j\u0002`\u001a2\u0006\u0010\u001b\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b\u0005\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\b8W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\tR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/jr;", "", "Ι", "I", "Lo/jp;", "ǃ", "Lo/jp;", "ı", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "ɩ", "", "J", "ι", "", "Ӏ", "Ljava/lang/String;", "p0", "Lo/hq;", "(I)Lo/hq;", "", "close", "()V", "()Lo/jp;", "Lo/ex;", "Ljava/lang/Runnable;", "Lo/ɩ;", "p1", "(Lo/ex;Ljava/lang/Runnable;)V", "Lo/jy;", "", "p2", "(Ljava/lang/Runnable;Lo/jy;Z)V", "toString", "()Ljava/lang/String;", "<init>", "(IILjava/lang/String;)V", "p3", "(IIJLjava/lang/String;)V", "Lo/hT;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.jr  reason: case insensitive filesystem */
public class C3523jr extends hT {

    /* renamed from: ı  reason: contains not printable characters */
    private final long f2517;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3521jp f2518;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f2519;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f2520;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final String f2521;

    public C3523jr(int i, int i2, long j, String str) {
        fM.m2254(str, "");
        this.f2520 = i;
        this.f2519 = i2;
        this.f2517 = j;
        this.f2521 = str;
        this.f2518 = m3176();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3523jr(int i, int i2, String str, int i3, fL fLVar) {
        this((i3 & 1) != 0 ? jB.f2395 : i, (i3 & 2) != 0 ? jB.f2398 : i2, (i3 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3523jr(int i, int i2, String str) {
        this(i, i2, jB.f2400, str);
        fM.m2254(str, "");
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public Executor m3178() {
        return this.f2518;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m3180(C3396ex exVar, Runnable runnable) {
        fM.m2254(exVar, "");
        fM.m2254(runnable, "");
        try {
            C3521jp.m3126$default(this.f2518, runnable, (C3529jy) null, false, 6, (Object) null);
        } catch (RejectedExecutionException unused) {
            hC.f2251.m2470(exVar, runnable);
        }
    }

    public void close() {
        this.f2518.close();
    }

    public String toString() {
        return super.toString() + "[scheduler = " + this.f2518 + ']';
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3469hq m3177(int i) {
        if (i > 0) {
            return new C3524jt(this, i, C3530jz.PROBABLY_BLOCKING);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i).toString());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3179(Runnable runnable, C3529jy jyVar, boolean z) {
        fM.m2254(runnable, "");
        fM.m2254(jyVar, "");
        try {
            this.f2518.m3147(runnable, jyVar, z);
        } catch (RejectedExecutionException unused) {
            hC.f2251.m2466(this.f2518.m3148(runnable, jyVar));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3521jp m3176() {
        return new C3521jp(this.f2520, this.f2519, this.f2517, this.f2521);
    }
}
