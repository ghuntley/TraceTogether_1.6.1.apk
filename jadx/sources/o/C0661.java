package o;

import o.C3024;
import o.C3024.C3028;

/* renamed from: o.ƖЈ  reason: contains not printable characters */
public abstract class C0661<A extends C3024.C3028, ResultT> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final boolean f4731;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2847[] f4732;

    @Deprecated
    public C0661() {
        this.f4732 = null;
        this.f4731 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m5487(A a, C3203<ResultT> r2);

    private C0661(C2847[] r1, boolean z) {
        this.f4732 = r1;
        this.f4731 = z;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2847[] m5488() {
        return this.f4732;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m5489() {
        return this.f4731;
    }

    /* renamed from: o.ƖЈ$if  reason: invalid class name */
    public static class Cif<A extends C3024.C3028, ResultT> {

        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean f4733;

        /* renamed from: Ι  reason: contains not printable characters */
        public C2847[] f4734;

        /* renamed from: ι  reason: contains not printable characters */
        public C0541<A, C3203<ResultT>> f4735;

        private Cif() {
            this.f4733 = true;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C0661<A, ResultT> m5491() {
            if (this.f4735 != null) {
                return new C0798(this, this.f4734, this.f4733);
            }
            throw new IllegalArgumentException("execute parameter required");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <A extends C3024.C3028, ResultT> Cif<A, ResultT> m5486() {
        return new Cif<>();
    }
}
