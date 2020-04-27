package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: o.ɪӏ  reason: contains not printable characters */
public abstract class C1406<V, O> implements C1431<V, O> {

    /* renamed from: Ι  reason: contains not printable characters */
    public final List<C2463<V>> f7684;

    C1406(V v) {
        this(Collections.singletonList(new C2463(v)));
    }

    C1406(List<C2463<V>> list) {
        this.f7684 = list;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public List<C2463<V>> m8587() {
        return this.f7684;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m8588() {
        if (!this.f7684.isEmpty()) {
            if (this.f7684.size() == 1) {
                if (this.f7684.get(0).f11219 == null) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f7684.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f7684.toArray()));
        }
        return sb.toString();
    }
}
