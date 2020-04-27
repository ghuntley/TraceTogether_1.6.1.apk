package o;

import java.util.Iterator;

/* renamed from: o.ȷј  reason: contains not printable characters */
final class C0973<K> extends C0962<K> {

    /* renamed from: Ι  reason: contains not printable characters */
    private final transient C0719<K> f5986;

    /* renamed from: ι  reason: contains not printable characters */
    private final transient C0959<K, ?> f5987;

    C0973(C0959<K, ?> r1, C0719<K> r2) {
        this.f5987 = r1;
        this.f5986 = r2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1036<K> m6948() {
        return (C1036) m6405().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final int m6949(Object[] objArr, int i) {
        return m6405().m6403(objArr, i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C0719<K> m6950() {
        return this.f5986;
    }

    public final boolean contains(Object obj) {
        return this.f5987.get(obj) != null;
    }

    public final int size() {
        return this.f5987.size();
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
