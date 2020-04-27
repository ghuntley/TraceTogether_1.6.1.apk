package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.ճ  reason: contains not printable characters */
public final class C3135 extends C1367 implements Iterable<C1367> {

    /* renamed from: ι  reason: contains not printable characters */
    public final List<C1367> f14299 = new ArrayList();

    public final Iterator<C1367> iterator() {
        return this.f14299.iterator();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Number m15888() {
        if (this.f14299.size() == 1) {
            return this.f14299.get(0).m8484();
        }
        throw new IllegalStateException();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m15887() {
        if (this.f14299.size() == 1) {
            return this.f14299.get(0).m8483();
        }
        throw new IllegalStateException();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m15889() {
        if (this.f14299.size() == 1) {
            return this.f14299.get(0).m8485();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3135) && ((C3135) obj).f14299.equals(this.f14299);
        }
        return true;
    }

    public final int hashCode() {
        return this.f14299.hashCode();
    }
}
