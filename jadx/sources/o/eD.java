package o;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3369dx;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\b \u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u00020\u00012\u00020\u001bB\u0019\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\t\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0004\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0012H$ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0013J\u000f\u0010\u0007\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0007\u0010\u0014J \u0010\u0007\u001a\u00020\r2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0012ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R#\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/eD;", "Lo/eG;", "ı", "()Lo/eG;", "ǃ", "Lo/er;", "", "Ι", "Lo/er;", "ɩ", "()Lo/er;", "p0", "p1", "", "(Ljava/lang/Object;Lo/er;)Lo/er;", "Ljava/lang/StackTraceElement;", "Q_", "()Ljava/lang/StackTraceElement;", "Lo/dx;", "(Ljava/lang/Object;)Ljava/lang/Object;", "()V", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "<init>", "(Lo/er;)V", "Ljava/io/Serializable;"}, k = 1, mv = {1, 1, 15})
public abstract class eD implements C3390er<Object>, eG, Serializable {

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3390er<Object> f2082;

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract Object m2131(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m2134() {
    }

    public eD(C3390er<Object> erVar) {
        this.f2082 = erVar;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3390er<Object> m2132() {
        return this.f2082;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m2135(Object obj) {
        C3390er erVar = this;
        while (true) {
            eD eDVar = (eD) erVar;
            eN.m2154(eDVar);
            C3390er erVar2 = eDVar.f2082;
            if (erVar2 == null) {
                fM.m2256();
            }
            try {
                Object r4 = eDVar.m2131(obj);
                if (r4 != eF.m2136()) {
                    C3369dx.C0158 r2 = C3369dx.f2060;
                    obj = C3369dx.m2118(r4);
                    eDVar.m2134();
                    if (erVar2 instanceof eD) {
                        erVar = erVar2;
                    } else {
                        erVar2.m2214(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                C3369dx.C0158 r22 = C3369dx.f2060;
                obj = C3369dx.m2118(C3366du.m2110(th));
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public C3390er<dF> m2133(Object obj, C3390er<?> erVar) {
        fM.m2254(erVar, "");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Serializable Q_ = Q_();
        if (Q_ == null) {
            Q_ = getClass().getName();
        }
        sb.append(Q_);
        return sb.toString();
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public eG m2130() {
        C3390er<Object> erVar = this.f2082;
        if (!(erVar instanceof eG)) {
            erVar = null;
        }
        return (eG) erVar;
    }

    public StackTraceElement Q_() {
        return eI.m2143(this);
    }
}
