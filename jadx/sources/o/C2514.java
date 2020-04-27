package o;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: o.ьı  reason: contains not printable characters */
public final class C2514 extends AbstractList<String> implements C1183, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1183 f11428;

    public C2514(C1183 r1) {
        this.f11428 = r1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1183 m13350() {
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m13348(int i) {
        return this.f11428.m7714(i);
    }

    public final int size() {
        return this.f11428.size();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m13351(C0510 r1) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new C2428(this, i);
    }

    public final Iterator<String> iterator() {
        return new C2526(this);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final List<?> m13349() {
        return this.f11428.m7715();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f11428.get(i);
    }
}
