package o;

public final class N<T> implements C3351dc<T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static /* synthetic */ boolean f1274 = (!N.class.desiredAssertionStatus());

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Object f1275 = new Object();

    /* renamed from: ı  reason: contains not printable characters */
    private volatile Object f1276 = f1275;

    /* renamed from: ι  reason: contains not printable characters */
    private volatile C3351dc<T> f1277;

    private N(C3351dc<T> dcVar) {
        if (f1274 || dcVar != null) {
            this.f1277 = dcVar;
            return;
        }
        throw new AssertionError();
    }

    public final T get() {
        T t = this.f1276;
        if (t == f1275) {
            synchronized (this) {
                t = this.f1276;
                if (t == f1275) {
                    t = this.f1277.get();
                    T t2 = this.f1276;
                    if (t2 != f1275 && !(t2 instanceof T)) {
                        if (t2 != t) {
                            StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                            sb.append(t2);
                            sb.append(" & ");
                            sb.append(t);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f1276 = t;
                    this.f1277 = null;
                }
            }
        }
        return t;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <P extends C3351dc<T>, T> C3351dc<T> m1391(P p) {
        if (p == null) {
            throw new NullPointerException();
        } else if (p instanceof N) {
            return p;
        } else {
            return new N(p);
        }
    }
}
