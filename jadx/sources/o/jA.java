package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00020\u0013B#\u0012\n\u0010\f\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00060\u0001j\u0002`\u00028\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/jA;", "Ljava/lang/Runnable;", "Lo/ɩ;", "Ι", "Ljava/lang/Runnable;", "ɩ", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "p0", "", "p1", "Lo/jy;", "p2", "<init>", "(Ljava/lang/Runnable;JLo/jy;)V", "Lo/jx;"}, k = 1, mv = {1, 1, 15})
public final class jA extends C3528jx {

    /* renamed from: Ι  reason: contains not printable characters */
    public final Runnable f2393;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jA(Runnable runnable, long j, C3529jy jyVar) {
        super(j, jyVar);
        fM.m2254(runnable, "");
        fM.m2254(jyVar, "");
        this.f2393 = runnable;
    }

    public final void run() {
        try {
            this.f2393.run();
        } finally {
            this.f2531.m3191();
        }
    }

    public final String toString() {
        return "Task[" + hB.m2428((Object) this.f2393) + '@' + hB.m2427(this.f2393) + ", " + this.f2532 + ", " + this.f2531 + ']';
    }
}
