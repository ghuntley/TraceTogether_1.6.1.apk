package o;

/* renamed from: o.ɨІ  reason: contains not printable characters */
public abstract class C1221<T> extends C1474 {
    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m7899(C1647 r1, T t);

    public C1221(C1242 r1) {
        super(r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m7898(T t) {
        C1647 r0 = m8840();
        try {
            m7899(r0, t);
            r0.m9481();
        } finally {
            if (r0 == this.f7911) {
                this.f7910.set(false);
            }
        }
    }
}
