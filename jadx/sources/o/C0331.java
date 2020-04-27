package o;

import java.io.Serializable;

/* renamed from: o.ıɜ  reason: contains not printable characters */
final class C0331<T> implements C0388<T>, Serializable {

    /* renamed from: ı  reason: contains not printable characters */
    private transient T f3684;

    /* renamed from: ǃ  reason: contains not printable characters */
    private volatile transient boolean f3685;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C0388<T> f3686;

    C0331(C0388<T> r1) {
        this.f3686 = (C0388) C2964.m15238(r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final T m4424() {
        if (!this.f3685) {
            synchronized (this) {
                if (!this.f3685) {
                    T r0 = this.f3686.m4649();
                    this.f3684 = r0;
                    this.f3685 = true;
                    return r0;
                }
            }
        }
        return this.f3684;
    }

    public final String toString() {
        Object obj;
        if (this.f3685) {
            String valueOf = String.valueOf(this.f3684);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f3686;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
