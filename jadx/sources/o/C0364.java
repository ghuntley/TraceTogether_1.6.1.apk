package o;

import java.util.Arrays;

/* renamed from: o.ıʏ  reason: contains not printable characters */
public final class C0364<V> {

    /* renamed from: Ι  reason: contains not printable characters */
    public final V f3823;

    /* renamed from: ι  reason: contains not printable characters */
    final Throwable f3824;

    public C0364(V v) {
        this.f3823 = v;
        this.f3824 = null;
    }

    public C0364(Throwable th) {
        this.f3824 = th;
        this.f3823 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0364)) {
            return false;
        }
        C0364 r5 = (C0364) obj;
        V v = this.f3823;
        if (v != null && v.equals(r5.f3823)) {
            return true;
        }
        Throwable th = this.f3824;
        if (th == null || r5.f3824 == null) {
            return false;
        }
        return th.toString().equals(this.f3824.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3823, this.f3824});
    }
}
