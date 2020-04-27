package o;

/* renamed from: o.ıь  reason: contains not printable characters */
final class C0427<T> implements C0388<T> {

    /* renamed from: ı  reason: contains not printable characters */
    private T f4012;

    /* renamed from: Ι  reason: contains not printable characters */
    private volatile boolean f4013;

    /* renamed from: ι  reason: contains not printable characters */
    private volatile C0388<T> f4014;

    C0427(C0388<T> r1) {
        this.f4014 = (C0388) C2964.m15238(r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final T m4726() {
        if (!this.f4013) {
            synchronized (this) {
                if (!this.f4013) {
                    T r0 = this.f4014.m4649();
                    this.f4012 = r0;
                    this.f4013 = true;
                    this.f4014 = null;
                    return r0;
                }
            }
        }
        return this.f4012;
    }

    public final String toString() {
        Object obj = this.f4014;
        if (obj == null) {
            String valueOf = String.valueOf(this.f4012);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
