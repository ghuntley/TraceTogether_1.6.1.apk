package o;

import java.io.Serializable;
import kotlin.Metadata;
import o.C3396ex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u000f2\u00060\u001cj\u0002`\u001dB\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0001\u001a\u00028\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/ew;", "p0", "Lkotlin/Function2;", "Lo/ex$ı;", "p1", "R", "fold", "(Ljava/lang/Object;Lo/fy;)Ljava/lang/Object;", "Lo/ex$ǃ;", "E", "get", "(Lo/ex$ǃ;)Lo/ex$ı;", "", "hashCode", "()I", "Lo/ex;", "minusKey", "(Lo/ex$ǃ;)Lo/ex;", "plus", "(Lo/ex;)Lo/ex;", "", "readResolve", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "<init>", "()V", "Ljava/io/Serializable;", "Lo/ı;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.ew  reason: case insensitive filesystem */
public final class C3395ew implements C3396ex, Serializable {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C3395ew f2135 = new C3395ew();

    public final <R> R fold(R r, C3423fy<? super R, ? super C3396ex.C0169, ? extends R> fyVar) {
        fM.m2254(fyVar, "");
        return r;
    }

    public final <E extends C3396ex.C0169> E get(C3396ex.C0170<E> r2) {
        fM.m2254(r2, "");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final C3396ex plus(C3396ex exVar) {
        fM.m2254(exVar, "");
        return exVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    private C3395ew() {
    }

    private final Object readResolve() {
        return f2135;
    }

    public final C3396ex minusKey(C3396ex.C0170<?> r2) {
        fM.m2254(r2, "");
        return this;
    }
}
