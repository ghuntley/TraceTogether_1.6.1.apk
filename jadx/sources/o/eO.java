package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b \u0018\u00002\u00020\nB\u0019\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00018W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/eO;", "Lo/ex;", "ǃ", "()Lo/ex;", "ι", "Lo/er;", "", "p0", "<init>", "(Lo/er;)V", "Lo/eD;"}, k = 1, mv = {1, 1, 15})
public abstract class eO extends eD {
    public eO(C3390er<Object> erVar) {
        super(erVar);
        if (erVar != null) {
            if (!(erVar.m2213() == C3395ew.f2135)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public C3396ex m2156() {
        return C3395ew.f2135;
    }
}
