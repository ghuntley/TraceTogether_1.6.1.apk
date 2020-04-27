package o;

import java.util.ArrayList;
import java.util.List;
import o.C2702;

/* renamed from: o.էΙ  reason: contains not printable characters */
public final class C3072<E> extends C1704<E> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C3072<Object> f14022;

    /* renamed from: Ι  reason: contains not printable characters */
    private final List<E> f14023;

    static {
        C3072<Object> r0 = new C3072<>();
        f14022 = r0;
        r0.m9676();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static <E> C3072<E> m15665() {
        return f14022;
    }

    C3072() {
        this(new ArrayList(10));
    }

    private C3072(List<E> list) {
        this.f14023 = list;
    }

    public final void add(int i, E e) {
        m9675();
        this.f14023.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f14023.get(i);
    }

    public final E remove(int i) {
        m9675();
        E remove = this.f14023.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        m9675();
        E e2 = this.f14023.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f14023.size();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* synthetic */ C2702.C2704 m15666(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f14023);
            return new C3072(arrayList);
        }
        throw new IllegalArgumentException();
    }
}
