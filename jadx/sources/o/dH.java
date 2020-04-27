package o;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0016 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00132\u00060\u0014j\u0002`\u0015B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\b@\bX\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0016\u0010\u0002\u001a\u00028\u00008W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/dH;", "", "ι", "Ljava/lang/Object;", "Ι", "Lkotlin/Function0;", "Lo/fk;", "ı", "()Ljava/lang/Object;", "", "ɩ", "()Z", "", "toString", "()Ljava/lang/String;", "writeReplace", "p0", "<init>", "(Lo/fk;)V", "Lo/dj;", "Ljava/io/Serializable;", "Lo/ı;", "T"}, k = 1, mv = {1, 1, 15})
public final class dH<T> implements C3357dj<T>, Serializable {

    /* renamed from: Ι  reason: contains not printable characters */
    public C3409fk<? extends T> f2034;

    /* renamed from: ι  reason: contains not printable characters */
    private Object f2035 = C3371dz.f2063;

    public dH(C3409fk<? extends T> fkVar) {
        fM.m2254(fkVar, "");
        this.f2034 = fkVar;
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final T m2057() {
        if (this.f2035 == C3371dz.f2063) {
            C3409fk<? extends T> fkVar = this.f2034;
            if (fkVar == null) {
                fM.m2256();
            }
            this.f2035 = fkVar.invoke();
            this.f2034 = null;
        }
        return this.f2035;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m2058() {
        return this.f2035 != C3371dz.f2063;
    }

    public final String toString() {
        return m2058() ? String.valueOf(m2057()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new dg(m2057());
    }
}
