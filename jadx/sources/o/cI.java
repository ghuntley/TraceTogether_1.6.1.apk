package o;

import java.util.concurrent.atomic.AtomicReference;

public final class cI<T> extends cD<T, T> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3321cb f1846;

    public cI(C3324ce<T> ceVar, C3321cb cbVar) {
        super(ceVar);
        this.f1846 = cbVar;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1873(C3322cc<? super T> ccVar) {
        C0130 r0 = new C0130(ccVar);
        ccVar.m1956(r0);
        C3340cs.m2020((AtomicReference<C3326cg>) r0, this.f1846.m1949(new Cif(r0)));
    }

    /* renamed from: o.cI$ı  reason: contains not printable characters */
    static final class C0130<T> extends AtomicReference<C3326cg> implements C3322cc<T>, C3326cg {

        /* renamed from: ı  reason: contains not printable characters */
        private C3322cc<? super T> f1849;

        /* renamed from: ι  reason: contains not printable characters */
        private AtomicReference<C3326cg> f1850 = new AtomicReference<>();

        C0130(C3322cc<? super T> ccVar) {
            this.f1849 = ccVar;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m1877(C3326cg cgVar) {
            C3340cs.m2020(this.f1850, cgVar);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1874(T t) {
            this.f1849.m1954(t);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1875(Throwable th) {
            this.f1849.m1955(th);
        }

        public final void N_() {
            this.f1849.N_();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1876() {
            C3340cs.m2018(this.f1850);
            C3340cs.m2018(this);
        }
    }

    /* renamed from: o.cI$if  reason: invalid class name */
    final class Cif implements Runnable {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C0130<T> f1848;

        Cif(C0130<T> r2) {
            this.f1848 = r2;
        }

        public final void run() {
            cI.this.f1813.m1958(this.f1848);
        }
    }
}
