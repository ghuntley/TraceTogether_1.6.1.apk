package o;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00020\"2\u00020#B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b\u001e\u0010!J#\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u000b\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0004\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0004\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0015\u0010\b\u001a\u00020\u00008\u0016@\u0016X\u0017¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r"}, d2 = {"Lo/iA;", "_immediate", "Lo/iA;", "Landroid/os/Handler;", "ǃ", "Landroid/os/Handler;", "ı", "ɩ", "ι", "", "Z", "Ι", "", "Ljava/lang/String;", "Lo/ex;", "p0", "Ljava/lang/Runnable;", "Lo/ɩ;", "p1", "", "(Lo/ex;Ljava/lang/Runnable;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "(Lo/ex;)Z", "toString", "()Ljava/lang/String;", "<init>", "(Landroid/os/Handler;Ljava/lang/String;)V", "p2", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "Lo/iD;", "Lo/hD;"}, k = 1, mv = {1, 1, 15})
public final class iA extends iD {
    private volatile iA _immediate;

    /* renamed from: ı  reason: contains not printable characters */
    private final boolean f2306;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Handler f2307;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final iA f2308;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f2309;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private iA(Handler handler, String str, boolean z) {
        super((fL) null);
        iA iAVar = null;
        this.f2307 = handler;
        this.f2309 = str;
        this.f2306 = z;
        this._immediate = this.f2306 ? this : iAVar;
        iA iAVar2 = this._immediate;
        if (iAVar2 == null) {
            iAVar2 = new iA(this.f2307, this.f2309, true);
            this._immediate = iAVar2;
        }
        this.f2308 = iAVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public iA(Handler handler, String str) {
        this(handler, str, false);
        fM.m2254(handler, "");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m2564(C3396ex exVar) {
        fM.m2254(exVar, "");
        return !this.f2306 || (fM.m2257(Looper.myLooper(), this.f2307.getLooper()) ^ true);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m2565(C3396ex exVar, Runnable runnable) {
        fM.m2254(exVar, "");
        fM.m2254(runnable, "");
        this.f2307.post(runnable);
    }

    public final String toString() {
        String str = this.f2309;
        if (str == null) {
            String handler = this.f2307.toString();
            fM.m2252((Object) handler, "");
            return handler;
        } else if (!this.f2306) {
            return str;
        } else {
            return this.f2309 + " [immediate]";
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof iA) && ((iA) obj).f2307 == this.f2307;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2307);
    }
}
