package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0014B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013JY\u0010\u000e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r2\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0006\u0010\t\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u00020\u00018G@\u0007¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003j\u0002\b\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0004\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/hw;", "", "ǃ", "()Z", "Ι", "Lkotlin/Function2;", "Lo/er;", "", "p0", "p1", "p2", "", "R", "T", "ι", "(Lo/fy;Ljava/lang/Object;Lo/er;)V", "ɩ", "ı", "<init>", "(Ljava/lang/String;I)V", ""}, k = 1, mv = {1, 1, 15})
/* renamed from: o.hw  reason: case insensitive filesystem */
public enum C3475hw {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: ι  reason: contains not printable characters */
    public final <R, T> void m2557(C3423fy<? super R, ? super C3390er<? super T>, ? extends Object> fyVar, R r, C3390er<? super T> erVar) {
        fM.m2254(fyVar, "");
        fM.m2254(erVar, "");
        int i = hy$WhenMappings.f2302[ordinal()];
        if (i == 1) {
            C3515jj.m3095(fyVar, r, erVar);
        } else if (i == 2) {
            ez.m2232(fyVar, r, erVar);
        } else if (i == 3) {
            C3520jo.m3114(fyVar, r, erVar);
        } else if (i != 4) {
            throw new C3362dq();
        }
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m2556() {
        return this == LAZY;
    }
}
