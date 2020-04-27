package o;

/* renamed from: o.co  reason: case insensitive filesystem */
public final class C3334co extends C3329cj<Runnable> {
    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* synthetic */ void m1972(Object obj) {
        ((Runnable) obj).run();
    }

    public C3334co(Runnable runnable) {
        super(runnable);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RunnableDisposable(disposed=");
        sb.append(get() == null);
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }
}
