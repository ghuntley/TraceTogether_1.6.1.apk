package o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class cG<T, R> extends bZ<R> {

    /* renamed from: ı  reason: contains not printable characters */
    private C3324ce<? extends T>[] f1830;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3341ct<? super Object[], ? extends R> f1831;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f1832;

    public cG(C3324ce<? extends T>[] ceVarArr, C3341ct<? super Object[], ? extends R> ctVar, int i) {
        this.f1830 = ceVarArr;
        this.f1831 = ctVar;
        this.f1832 = i;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1861(C3322cc<? super R> ccVar) {
        int i;
        C3324ce<? extends T>[] ceVarArr = this.f1830;
        if (ceVarArr == null) {
            ceVarArr = new C3324ce[8];
            Iterable<C3324ce<? extends T>> iterable = null;
            i = 0;
            for (C3324ce<? extends T> ceVar : iterable) {
                if (i == ceVarArr.length) {
                    C3324ce<? extends T>[] ceVarArr2 = new C3324ce[((i >> 2) + i)];
                    System.arraycopy(ceVarArr, 0, ceVarArr2, 0, i);
                    ceVarArr = ceVarArr2;
                }
                ceVarArr[i] = ceVar;
                i++;
            }
        } else {
            i = ceVarArr.length;
        }
        if (i == 0) {
            C3345cx.m2035(ccVar);
            return;
        }
        C0128 r2 = new C0128(ccVar, this.f1831, i);
        int i2 = this.f1832;
        If<T, R>[] ifArr = r2.f1840;
        int length = ifArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            ifArr[i3] = new If<>(r2, i2);
        }
        r2.lazySet(0);
        r2.f1838.m1956(r2);
        for (int i4 = 0; i4 < length && !r2.f1843; i4++) {
            ceVarArr[i4].m1958(ifArr[i4]);
        }
    }

    /* renamed from: o.cG$ɩ  reason: contains not printable characters */
    static final class C0128<T, R> extends AtomicInteger implements C3326cg {

        /* renamed from: ı  reason: contains not printable characters */
        final C3322cc<? super R> f1838;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private boolean f1839 = false;

        /* renamed from: ǃ  reason: contains not printable characters */
        final If<T, R>[] f1840;

        /* renamed from: ɩ  reason: contains not printable characters */
        private C3341ct<? super Object[], ? extends R> f1841;

        /* renamed from: Ι  reason: contains not printable characters */
        private T[] f1842;

        /* renamed from: ι  reason: contains not printable characters */
        volatile boolean f1843;

        C0128(C3322cc<? super R> ccVar, C3341ct<? super Object[], ? extends R> ctVar, int i) {
            this.f1838 = ccVar;
            this.f1841 = ctVar;
            this.f1840 = new If[i];
            this.f1842 = (Object[]) new Object[i];
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1868() {
            if (!this.f1843) {
                this.f1843 = true;
                for (If<T, R> ifR : this.f1840) {
                    C3340cs.m2018(ifR.f1836);
                }
                if (getAndIncrement() == 0) {
                    m1866();
                }
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private void m1865() {
            m1866();
            for (If<T, R> ifR : this.f1840) {
                C3340cs.m2018(ifR.f1836);
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private void m1866() {
            for (If<T, R> ifR : this.f1840) {
                cJ<T> cJVar = ifR.f1833;
                while (true) {
                    if (cJVar.d_() == null) {
                        if (cJVar.f1856.get() == cJVar.f1857.get()) {
                            break;
                        }
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x004f A[SYNTHETIC] */
        /* renamed from: ı  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m1867() {
            /*
                r15 = this;
                int r0 = r15.getAndIncrement()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                o.cG$If<T, R>[] r0 = r15.f1840
                o.cc<? super R> r1 = r15.f1838
                T[] r2 = r15.f1842
                r3 = 1
                r4 = 1
            L_0x000f:
                int r5 = r0.length
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
            L_0x0014:
                if (r7 >= r5) goto L_0x006e
                r10 = r0[r7]
                r11 = r2[r9]
                if (r11 != 0) goto L_0x0058
                boolean r11 = r10.f1834
                o.cJ<T> r12 = r10.f1833
                java.lang.Object r12 = r12.d_()
                if (r12 != 0) goto L_0x0028
                r13 = 1
                goto L_0x0029
            L_0x0028:
                r13 = 0
            L_0x0029:
                boolean r14 = r15.f1843
                if (r14 == 0) goto L_0x0032
                r15.m1865()
            L_0x0030:
                r10 = 1
                goto L_0x004d
            L_0x0032:
                if (r11 == 0) goto L_0x004c
                java.lang.Throwable r10 = r10.f1835
                if (r10 == 0) goto L_0x0041
                r15.f1843 = r3
                r15.m1865()
                r1.m1955((java.lang.Throwable) r10)
                goto L_0x0030
            L_0x0041:
                if (r13 == 0) goto L_0x004c
                r15.f1843 = r3
                r15.m1865()
                r1.N_()
                goto L_0x0030
            L_0x004c:
                r10 = 0
            L_0x004d:
                if (r10 == 0) goto L_0x0050
                return
            L_0x0050:
                if (r13 != 0) goto L_0x0055
                r2[r9] = r12
                goto L_0x0069
            L_0x0055:
                int r8 = r8 + 1
                goto L_0x0069
            L_0x0058:
                boolean r11 = r10.f1834
                if (r11 == 0) goto L_0x0069
                java.lang.Throwable r10 = r10.f1835
                if (r10 == 0) goto L_0x0069
                r15.f1843 = r3
                r15.m1865()
                r1.m1955((java.lang.Throwable) r10)
                return
            L_0x0069:
                int r9 = r9 + 1
                int r7 = r7 + 1
                goto L_0x0014
            L_0x006e:
                if (r8 != 0) goto L_0x0097
                o.ct<? super java.lang.Object[], ? extends R> r5 = r15.f1841     // Catch:{ all -> 0x008c }
                java.lang.Object r6 = r2.clone()     // Catch:{ all -> 0x008c }
                java.lang.Object r5 = r5.m2023(r6)     // Catch:{ all -> 0x008c }
                java.lang.String r6 = "The zipper returned a null value"
                if (r5 == 0) goto L_0x0086
                r1.m1954(r5)
                r5 = 0
                java.util.Arrays.fill(r2, r5)
                goto L_0x000f
            L_0x0086:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x008c }
                r0.<init>(r6)     // Catch:{ all -> 0x008c }
                throw r0     // Catch:{ all -> 0x008c }
            L_0x008c:
                r0 = move-exception
                o.C2745.m14522((java.lang.Throwable) r0)
                r15.m1865()
                r1.m1955((java.lang.Throwable) r0)
                return
            L_0x0097:
                int r4 = -r4
                int r4 = r15.addAndGet(r4)
                if (r4 != 0) goto L_0x000f
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.cG.C0128.m1867():void");
        }
    }

    static final class If<T, R> implements C3322cc<T> {

        /* renamed from: ı  reason: contains not printable characters */
        final cJ<T> f1833;

        /* renamed from: ǃ  reason: contains not printable characters */
        volatile boolean f1834;

        /* renamed from: ɩ  reason: contains not printable characters */
        Throwable f1835;

        /* renamed from: Ι  reason: contains not printable characters */
        final AtomicReference<C3326cg> f1836 = new AtomicReference<>();

        /* renamed from: ι  reason: contains not printable characters */
        private C0128<T, R> f1837;

        If(C0128<T, R> r2, int i) {
            this.f1837 = r2;
            this.f1833 = new cJ<>(i);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m1864(C3326cg cgVar) {
            C3340cs.m2020(this.f1836, cgVar);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1862(T t) {
            this.f1833.m1880(t);
            this.f1837.m1867();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1863(Throwable th) {
            this.f1835 = th;
            this.f1834 = true;
            this.f1837.m1867();
        }

        public final void N_() {
            this.f1834 = true;
            this.f1837.m1867();
        }
    }
}
