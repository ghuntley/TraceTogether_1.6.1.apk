package o;

public final class I<E, F> implements C3551kt<E> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Cif f1265 = new C0097();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final G<F> f1266;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Cif<E, F> f1267;

    /* renamed from: o.I$if  reason: invalid class name */
    public interface Cif<E, F> {
        F extract(E e);
    }

    public I(G<F> g, Cif<E, F> ifVar) {
        this.f1266 = g;
        this.f1267 = ifVar;
    }

    public I(G<F> g) {
        this(g, f1265);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m1371(kB<E> kBVar) {
        if (this.f1266 == null) {
            return;
        }
        if (kBVar.f2555.isSuccessful()) {
            this.f1266.onSuccess(this.f1267.extract(kBVar.f2556));
        } else {
            this.f1266.onError(K.m1379(kBVar));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m1372(Throwable th) {
        G<F> g = this.f1266;
        if (g != null) {
            g.onError(K.m1378(th));
        }
    }

    /* renamed from: o.I$ı  reason: contains not printable characters */
    static final class C0097<E> implements Cif<E, E> {
        public final E extract(E e) {
            return e;
        }

        C0097() {
        }
    }
}
