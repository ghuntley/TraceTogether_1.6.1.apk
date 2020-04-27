package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\b\u0003\u001a9\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001a\u0010\u0002\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0000j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/util/Comparator;", "Lo/ɩ;", "p0", "", "", "T", "ı", "(Ljava/util/List;Ljava/util/Comparator;)V"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/dN")
class dT extends dV {
    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> void m2080(List<T> list, Comparator<? super T> comparator) {
        fM.m2254(list, "");
        fM.m2254(comparator, "");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
