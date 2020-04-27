package o;

import java.util.Iterator;

/* renamed from: o.зɩ  reason: contains not printable characters */
final class C2429 implements Iterator<String> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private Iterator<String> f11057 = this.f11058.f11066.keySet().iterator();

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C2433 f11058;

    C2429(C2433 r1) {
        this.f11058 = r1;
    }

    public final boolean hasNext() {
        return this.f11057.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public final /* synthetic */ Object next() {
        return this.f11057.next();
    }
}
