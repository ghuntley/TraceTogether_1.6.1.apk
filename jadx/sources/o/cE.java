package o;

import java.util.concurrent.atomic.AtomicReference;

public final class cE<T> extends AtomicReference<C3326cg> implements C3322cc<T>, C3326cg {

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3338cq<? super C3326cg> f1814;

    /* renamed from: Ι  reason: contains not printable characters */
    private C3338cq<? super Throwable> f1815;

    /* renamed from: ι  reason: contains not printable characters */
    private C3338cq<? super T> f1816;

    public cE(C3338cq<? super T> cqVar, C3338cq<? super Throwable> cqVar2, C3338cq<? super C3326cg> cqVar3) {
        this.f1816 = cqVar;
        this.f1815 = cqVar2;
        this.f1814 = cqVar3;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1852(C3326cg cgVar) {
        if (C3340cs.m2020((AtomicReference<C3326cg>) this, cgVar)) {
            try {
                this.f1814.m2016(this);
            } catch (Throwable th) {
                C2745.m14522(th);
                cgVar.m1959();
                m1850(th);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m1851() {
        C3340cs.m2018(this);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m1849(T t) {
        if (!(get() == C3340cs.f2008)) {
            try {
                this.f1816.m2016(t);
            } catch (Throwable th) {
                C2745.m14522(th);
                ((C3326cg) get()).m1959();
                m1850(th);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m1850(Throwable th) {
        if (!(get() == C3340cs.f2008)) {
            lazySet(C3340cs.f2008);
            try {
                this.f1815.m2016(th);
            } catch (Throwable th2) {
                C2745.m14522(th2);
                cX.m1936(new C3337cp(th, th2));
            }
        } else {
            cX.m1936(th);
        }
    }

    public final void N_() {
        if (!(get() == C3340cs.f2008)) {
            lazySet(C3340cs.f2008);
        }
    }
}
