package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0010\u0018\u00002\u00020\u000fB\u0019\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0007\u001a\u00020\u00058G@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006"}, d2 = {"Lo/hk;", "", "ǃ", "Ljava/lang/Throwable;", "ı", "", "()Z", "ɩ", "", "toString", "()Ljava/lang/String;", "p0", "p1", "<init>", "(Ljava/lang/Throwable;Z)V", ""}, k = 1, mv = {1, 1, 15})
/* renamed from: o.hk  reason: case insensitive filesystem */
public class C3463hk {

    /* renamed from: ı  reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f2290 = AtomicIntegerFieldUpdater.newUpdater(C3463hk.class, "_handled");
    private volatile int _handled;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Throwable f2291;

    public C3463hk(Throwable th, boolean z) {
        fM.m2254(th, "");
        this.f2291 = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3463hk(Throwable th, boolean z, int i, fL fLVar) {
        this(th, (i & 2) != 0 ? false : z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m2536() {
        return this._handled;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m2537() {
        return f2290.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return hB.m2428((Object) this) + '[' + this.f2291 + ']';
    }
}
