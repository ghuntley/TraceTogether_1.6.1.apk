package o;

/* renamed from: o.іլ  reason: contains not printable characters */
public final class C2609<T> implements C2841<T> {

    /* renamed from: ι  reason: contains not printable characters */
    private static final Object f11866 = new Object();

    /* renamed from: ǃ  reason: contains not printable characters */
    private volatile Object f11867 = f11866;

    /* renamed from: Ι  reason: contains not printable characters */
    private volatile C2841<T> f11868;

    public C2609(C2841<T> r2) {
        this.f11868 = r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final T m13833() {
        T t = this.f11867;
        if (t == f11866) {
            synchronized (this) {
                t = this.f11867;
                if (t == f11866) {
                    t = this.f11868.m14812();
                    this.f11867 = t;
                    this.f11868 = null;
                }
            }
        }
        return t;
    }
}
