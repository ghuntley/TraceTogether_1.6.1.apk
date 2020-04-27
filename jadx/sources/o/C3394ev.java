package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3396ex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b&\u0018\u00002\u00020\tB\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00018\u0017@\u0016X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/ev;", "Lo/ex$ǃ;", "key", "Lo/ex$ǃ;", "getKey", "()Lo/ex$ǃ;", "p0", "<init>", "(Lo/ex$ǃ;)V", "Lo/ex$ı;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.ev  reason: case insensitive filesystem */
public abstract class C3394ev implements C3396ex.C0169 {
    private final C3396ex.C0170<?> key;

    public C3394ev(C3396ex.C0170<?> r2) {
        fM.m2254(r2, "");
        this.key = r2;
    }

    public <R> R fold(R r, C3423fy<? super R, ? super C3396ex.C0169, ? extends R> fyVar) {
        fM.m2254(fyVar, "");
        return C3396ex.C0169.DefaultImpls.m2231(this, r, fyVar);
    }

    public <E extends C3396ex.C0169> E get(C3396ex.C0170<E> r2) {
        fM.m2254(r2, "");
        return C3396ex.C0169.DefaultImpls.get(this, r2);
    }

    @JvmName(name = "getKey")
    public C3396ex.C0170<?> getKey() {
        return this.key;
    }

    public C3396ex minusKey(C3396ex.C0170<?> r2) {
        fM.m2254(r2, "");
        return C3396ex.C0169.DefaultImpls.m2229(this, r2);
    }

    public C3396ex plus(C3396ex exVar) {
        fM.m2254(exVar, "");
        return C3396ex.C0169.DefaultImpls.m2230(this, exVar);
    }
}
