package o;

import kotlin.Metadata;
import o.C3392et;
import o.C3396ex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b&\u0018\u00002\u00020\u00152\u00020\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/hq;", "Lo/ex;", "p0", "Ljava/lang/Runnable;", "Lo/ɩ;", "p1", "", "Ι", "(Lo/ex;Ljava/lang/Runnable;)V", "Lo/er;", "T", "ι", "(Lo/er;)Lo/er;", "", "ǃ", "(Lo/ex;)Z", "", "toString", "()Ljava/lang/String;", "<init>", "()V", "Lo/ev;", "Lo/et;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.hq  reason: case insensitive filesystem */
public abstract class C3469hq extends C3394ev implements C3392et {
    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m2541(C3396ex exVar) {
        fM.m2254(exVar, "");
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m2543(C3396ex exVar, Runnable runnable);

    public <E extends C3396ex.C0169> E get(C3396ex.C0170<E> r2) {
        fM.m2254(r2, "");
        return C3392et.DefaultImpls.m2225((C3392et) this, r2);
    }

    public C3396ex minusKey(C3396ex.C0170<?> r2) {
        fM.m2254(r2, "");
        return C3392et.DefaultImpls.m2224(this, r2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m2542(C3390er<?> erVar) {
        fM.m2254(erVar, "");
        C3392et.DefaultImpls.m2226((C3392et) this, erVar);
    }

    public C3469hq() {
        super(C3392et.f2133);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <T> C3390er<T> m2544(C3390er<? super T> erVar) {
        fM.m2254(erVar, "");
        return new hE<>(this, erVar);
    }

    public String toString() {
        return hB.m2428((Object) this) + '@' + hB.m2427(this);
    }
}
