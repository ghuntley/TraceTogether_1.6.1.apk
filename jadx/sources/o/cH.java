package o;

import java.util.concurrent.atomic.AtomicReference;

public final class cH<T> extends bZ<T> {

    /* renamed from: Ι  reason: contains not printable characters */
    private C3323cd<T> f1844;

    public cH(C3323cd<T> cdVar) {
        this.f1844 = cdVar;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1869(C3322cc<? super T> ccVar) {
        C0129 r0 = new C0129(ccVar);
        ccVar.m1956(r0);
        try {
            this.f1844.m1957(r0);
        } catch (Throwable th) {
            C2745.m14522(th);
            if (!r0.m1872(th)) {
                cX.m1936(th);
            }
        }
    }

    /* renamed from: o.cH$ɩ  reason: contains not printable characters */
    static final class C0129<T> extends AtomicReference<C3326cg> implements C3325cf<T>, C3326cg {

        /* renamed from: ǃ  reason: contains not printable characters */
        private C3322cc<? super T> f1845;

        C0129(C3322cc<? super T> ccVar) {
            this.f1845 = ccVar;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1870(T t) {
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (!m1872(nullPointerException)) {
                    cX.m1936(nullPointerException);
                }
            } else if (!C3340cs.m2019((C3326cg) get())) {
                this.f1845.m1954(t);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1871() {
            C3340cs.m2018(this);
        }

        public final String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m1872(Throwable th) {
            if (C3340cs.m2019((C3326cg) get())) {
                return false;
            }
            try {
                this.f1845.m1955(th);
                C3340cs.m2018(this);
                return true;
            } catch (Throwable th2) {
                C3340cs.m2018(this);
                throw th2;
            }
        }
    }
}
