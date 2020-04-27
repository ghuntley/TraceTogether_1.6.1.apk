package o;

import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\"\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "ɩ", "()Ljava/util/Set;", "ı", "(Ljava/util/Set;)Ljava/util/Set;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/eh")
/* renamed from: o.ej  reason: case insensitive filesystem */
class C3382ej extends C3383ek {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final <T> Set<T> m2210() {
        return dX.f2036;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> Set<T> m2209(Set<? extends T> set) {
        fM.m2254(set, "");
        int size = set.size();
        if (size == 0) {
            return C3380eh.m2210();
        }
        if (size != 1) {
            return set;
        }
        return C3380eh.m2211(set.iterator().next());
    }
}
