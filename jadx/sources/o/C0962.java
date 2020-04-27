package o;

import java.util.Iterator;
import java.util.Set;

/* renamed from: o.ȷɟ  reason: contains not printable characters */
public abstract class C0962<E> extends C0852<E> implements Set<E> {

    /* renamed from: Ι  reason: contains not printable characters */
    private transient C0719<E> f5966;

    C0962() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return C1023.m7262(this, obj);
    }

    public int hashCode() {
        return C1023.m7261(this);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public C0719<E> m6878() {
        C0719<E> r0 = this.f5966;
        if (r0 != null) {
            return r0;
        }
        C0719<E> r02 = m6877();
        this.f5966 = r02;
        return r02;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public C0719<E> m6877() {
        return C0719.m5841(toArray());
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
