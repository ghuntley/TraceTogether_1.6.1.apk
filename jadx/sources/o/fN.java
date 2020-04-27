package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00070\u00142\u00020\u0015B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00018\u0017@\u0016X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/fN;", "Ljava/lang/Class;", "ǃ", "Ljava/lang/Class;", "ı", "()Ljava/lang/Class;", "ɩ", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Class;)V", "Lo/gp;", "Lo/fI;"}, k = 1, mv = {1, 1, 15})
public final class fN implements C3441gp<Object>, fI {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Class<?> f2160;

    public fN(Class<?> cls) {
        fM.m2254(cls, "");
        this.f2160 = cls;
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final Class<?> m2258() {
        return this.f2160;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fN) && fM.m2257(C3408fj.m2296(this), C3408fj.m2296((C3441gp) obj));
    }

    public final int hashCode() {
        return C3408fj.m2296(this).hashCode();
    }

    public final String toString() {
        return m2258().toString() + " (Kotlin reflection is not available)";
    }
}
