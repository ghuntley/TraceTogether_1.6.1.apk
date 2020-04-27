package o;

import java.util.ListIterator;

/* renamed from: o.зǃ  reason: contains not printable characters */
final class C2428 implements ListIterator<String> {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ int f11054;

    /* renamed from: ɩ  reason: contains not printable characters */
    private ListIterator<String> f11055 = this.f11056.f11428.listIterator(this.f11054);

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C2514 f11056;

    C2428(C2514 r1, int i) {
        this.f11056 = r1;
        this.f11054 = i;
    }

    public final boolean hasNext() {
        return this.f11055.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f11055.hasPrevious();
    }

    public final int nextIndex() {
        return this.f11055.nextIndex();
    }

    public final int previousIndex() {
        return this.f11055.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return this.f11055.previous();
    }

    public final /* synthetic */ Object next() {
        return this.f11055.next();
    }
}
