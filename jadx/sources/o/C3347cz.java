package o;

import o.C0712;
import o.C3100;

/* renamed from: o.cz  reason: case insensitive filesystem */
public final class C3347cz {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C3338cq<Throwable> f2017 = new C0154();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C3338cq<Object> f2018 = new C0152();

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C0712.C0713 f2019 = new If();

    /* renamed from: ι  reason: contains not printable characters */
    public static final Runnable f2020 = new C0153();

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <T1, T2, R> C3341ct<Object[], R> m2045(C3339cr<? super T1, ? super T2, ? extends R> crVar) {
        if (crVar != null) {
            return new Cif(crVar);
        }
        throw new NullPointerException("f is null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <T> C3338cq<T> m2044() {
        return f2018;
    }

    /* renamed from: o.cz$if  reason: invalid class name */
    static final class Cif<T1, T2, R> implements C3341ct<Object[], R> {

        /* renamed from: ι  reason: contains not printable characters */
        private C3339cr<? super T1, ? super T2, ? extends R> f2021;

        /* renamed from: ι  reason: contains not printable characters */
        public final /* synthetic */ Object m2046(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 2) {
                return this.f2021.m2017(objArr[0], objArr[1]);
            }
            StringBuilder sb = new StringBuilder("Array of size 2 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }

        Cif(C3339cr<? super T1, ? super T2, ? extends R> crVar) {
            this.f2021 = crVar;
        }
    }

    /* renamed from: o.cz$ɩ  reason: contains not printable characters */
    static final class C0153 implements Runnable {
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }

        C0153() {
        }
    }

    /* renamed from: o.cz$If */
    static final class If implements C0712.C0713 {
        public final String toString() {
            return "EmptyAction";
        }

        If() {
        }
    }

    /* renamed from: o.cz$ǃ  reason: contains not printable characters */
    static final class C0152 implements C3338cq<Object> {
        public final String toString() {
            return "EmptyConsumer";
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m2049(Object obj) {
        }

        C0152() {
        }
    }

    /* renamed from: o.cz$Ι  reason: contains not printable characters */
    static final class C0154 implements C3338cq<Throwable> {
        C0154() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final /* synthetic */ void m2050(Object obj) {
            cX.m1936(new C3331cl((Throwable) obj));
        }
    }

    /* renamed from: o.cz$ı  reason: contains not printable characters */
    public static final class C0151 implements C0712.C0713, C3108 {

        /* renamed from: ı  reason: contains not printable characters */
        private C3203<String> f2022;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m2048(C0399 r1, Exception exc) {
            return false;
        }

        C0151() {
        }

        public C0151(C3203<String> r1) {
            this.f2022 = r1;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m2047(C0399 r5) {
            if (!(r5.m4667() == C3100.If.f14198)) {
                if (!(r5.m4667() == C3100.If.f14197)) {
                    if (!(r5.m4667() == C3100.If.f14195)) {
                        return false;
                    }
                }
            }
            this.f2022.f14555.m6087(r5.m4666());
            return true;
        }
    }
}
