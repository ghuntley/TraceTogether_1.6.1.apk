package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3396ex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b \u0018\u00002\u00020\u0015B\u0019\u0012\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012B#\u0012\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0015\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00018W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\n"}, d2 = {"Lo/eJ;", "Lo/ex;", "ι", "Lo/ex;", "ı", "ǃ", "()Lo/ex;", "ɩ", "Lo/er;", "", "Lo/er;", "І", "()Lo/er;", "", "Ι", "()V", "p0", "<init>", "(Lo/er;)V", "p1", "(Lo/er;Lo/ex;)V", "Lo/eD;"}, k = 1, mv = {1, 1, 15})
public abstract class eJ extends eD {

    /* renamed from: ɩ  reason: contains not printable characters */
    private transient C3390er<Object> f2084;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3396ex f2085;

    public eJ(C3390er<Object> erVar, C3396ex exVar) {
        super(erVar);
        this.f2085 = exVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public eJ(C3390er<Object> erVar) {
        this(erVar, erVar != null ? erVar.m2213() : null);
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public C3396ex m2144() {
        C3396ex exVar = this.f2085;
        if (exVar == null) {
            fM.m2256();
        }
        return exVar;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final C3390er<Object> m2146() {
        C3390er<Object> erVar = this.f2084;
        if (erVar == null) {
            C3392et etVar = (C3392et) m2144().get(C3392et.f2133);
            if (etVar == null || (erVar = etVar.m2223(this)) == null) {
                erVar = this;
            }
            this.f2084 = erVar;
        }
        return erVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m2145() {
        C3390er<Object> erVar = this.f2084;
        if (!(erVar == null || erVar == this)) {
            C3396ex.C0169 r1 = m2144().get(C3392et.f2133);
            if (r1 == null) {
                fM.m2256();
            }
            ((C3392et) r1).m2222(erVar);
        }
        this.f2084 = eH.f2083;
    }
}
