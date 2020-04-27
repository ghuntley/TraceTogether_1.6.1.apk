package o;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0018 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00152\u00060\u0016j\u0002`\u0017B!\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\b@\bX\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0003R\u0016\u0010\b\u001a\u00028\u00008W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lo/dw;", "", "ι", "Ljava/lang/Object;", "Lkotlin/Function0;", "ǃ", "Lo/fk;", "ɩ", "Ι", "ı", "()Ljava/lang/Object;", "", "()Z", "", "toString", "()Ljava/lang/String;", "writeReplace", "p0", "p1", "<init>", "(Lo/fk;Ljava/lang/Object;)V", "Lo/dj;", "Ljava/io/Serializable;", "Lo/ı;", "T"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.dw  reason: case insensitive filesystem */
final class C3368dw<T> implements C3357dj<T>, Serializable {

    /* renamed from: ǃ  reason: contains not printable characters */
    public C3409fk<? extends T> f2057;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Object f2058;

    /* renamed from: ι  reason: contains not printable characters */
    private volatile Object f2059;

    public C3368dw(C3409fk<? extends T> fkVar, Object obj) {
        fM.m2254(fkVar, "");
        this.f2057 = fkVar;
        this.f2059 = C3371dz.f2063;
        this.f2058 = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3368dw(C3409fk fkVar, Object obj, int i, fL fLVar) {
        this(fkVar, (i & 2) != 0 ? null : obj);
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final T m2111() {
        T t;
        T t2 = this.f2059;
        if (t2 != C3371dz.f2063) {
            return t2;
        }
        synchronized (this.f2058) {
            t = this.f2059;
            if (t == C3371dz.f2063) {
                C3409fk fkVar = this.f2057;
                if (fkVar == null) {
                    fM.m2256();
                }
                t = fkVar.invoke();
                this.f2059 = t;
                this.f2057 = null;
            }
        }
        return t;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m2112() {
        return this.f2059 != C3371dz.f2063;
    }

    public final String toString() {
        return m2112() ? String.valueOf(m2111()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new dg(m2111());
    }
}
