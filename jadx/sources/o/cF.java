package o;

import o.C3321cb;

public final class cF<T> extends cD<T, T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3321cb f1817;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f1818;

    public cF(C3324ce<T> ceVar, C3321cb cbVar, int i) {
        super(ceVar);
        this.f1817 = cbVar;
        this.f1818 = i;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1853(C3322cc<? super T> ccVar) {
        C3321cb cbVar = this.f1817;
        if (cbVar instanceof cY) {
            this.f1813.m1958(ccVar);
            return;
        }
        this.f1813.m1958(new Cif(ccVar, cbVar.m1947(), this.f1818));
    }

    /* renamed from: o.cF$if  reason: invalid class name */
    static final class Cif<T> extends cA<T> implements C3322cc<T>, Runnable {

        /* renamed from: ı  reason: contains not printable characters */
        private int f1819;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private C3326cg f1820;

        /* renamed from: ǃ  reason: contains not printable characters */
        private cC<T> f1821;

        /* renamed from: ɩ  reason: contains not printable characters */
        private C3322cc<? super T> f1822;

        /* renamed from: ɹ  reason: contains not printable characters */
        private Throwable f1823;

        /* renamed from: ɾ  reason: contains not printable characters */
        private boolean f1824;

        /* renamed from: Ι  reason: contains not printable characters */
        private C3321cb.Cif f1825;

        /* renamed from: ι  reason: contains not printable characters */
        private boolean f1826 = false;

        /* renamed from: І  reason: contains not printable characters */
        private volatile boolean f1827;

        /* renamed from: і  reason: contains not printable characters */
        private volatile boolean f1828;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private int f1829;

        Cif(C3322cc<? super T> ccVar, C3321cb.Cif ifVar, int i) {
            this.f1822 = ccVar;
            this.f1825 = ifVar;
            this.f1819 = i;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m1860(C3326cg cgVar) {
            if (C3340cs.m2021(this.f1820, cgVar)) {
                this.f1820 = cgVar;
                if (cgVar instanceof C3343cv) {
                    C3343cv cvVar = (C3343cv) cgVar;
                    cvVar.m1846();
                    this.f1829 = 2;
                    this.f1821 = cvVar;
                    this.f1822.m1956(this);
                    return;
                }
                this.f1821 = new cJ(this.f1819);
                this.f1822.m1956(this);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1856(T t) {
            if (!this.f1827) {
                if (this.f1829 != 2) {
                    this.f1821.m1847(t);
                }
                if (getAndIncrement() == 0) {
                    this.f1825.m1951(this);
                }
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1857(Throwable th) {
            if (this.f1827) {
                cX.m1936(th);
                return;
            }
            this.f1823 = th;
            this.f1827 = true;
            if (getAndIncrement() == 0) {
                this.f1825.m1951(this);
            }
        }

        public final void N_() {
            if (!this.f1827) {
                this.f1827 = true;
                if (getAndIncrement() == 0) {
                    this.f1825.m1951(this);
                }
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1859() {
            if (!this.f1828) {
                this.f1828 = true;
                this.f1820.m1959();
                this.f1825.m1959();
                if (!this.f1824 && getAndIncrement() == 0) {
                    this.f1821.J_();
                }
            }
        }

        public final void run() {
            if (this.f1824) {
                int i = 1;
                while (!this.f1828) {
                    boolean z = this.f1827;
                    Throwable th = this.f1823;
                    if (!z || th == null) {
                        this.f1822.m1954(null);
                        if (z) {
                            this.f1828 = true;
                            Throwable th2 = this.f1823;
                            if (th2 != null) {
                                this.f1822.m1955(th2);
                            } else {
                                this.f1822.N_();
                            }
                            this.f1825.m1959();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        this.f1828 = true;
                        this.f1822.m1955(th);
                        this.f1825.m1959();
                        return;
                    }
                }
                return;
            }
            cC<T> cCVar = this.f1821;
            C3322cc<? super T> ccVar = this.f1822;
            int i2 = 1;
            while (!m1854(this.f1827, cCVar.m1848(), ccVar)) {
                while (true) {
                    boolean z2 = this.f1827;
                    try {
                        T d_ = cCVar.d_();
                        boolean z3 = d_ == null;
                        if (m1854(z2, z3, ccVar)) {
                            return;
                        }
                        if (!z3) {
                            ccVar.m1954(d_);
                        } else {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        C2745.m14522(th3);
                        this.f1828 = true;
                        this.f1820.m1959();
                        cCVar.J_();
                        ccVar.m1955(th3);
                        this.f1825.m1959();
                        return;
                    }
                }
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private boolean m1854(boolean z, boolean z2, C3322cc<? super T> ccVar) {
            if (this.f1828) {
                this.f1821.J_();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f1823;
                if (th != null) {
                    this.f1828 = true;
                    this.f1821.J_();
                    ccVar.m1955(th);
                    this.f1825.m1959();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.f1828 = true;
                    ccVar.N_();
                    this.f1825.m1959();
                    return true;
                }
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m1855() {
            this.f1824 = true;
            return 2;
        }

        public final T d_() {
            return this.f1821.d_();
        }

        public final void J_() {
            this.f1821.J_();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m1858() {
            return this.f1821.m1848();
        }
    }
}
