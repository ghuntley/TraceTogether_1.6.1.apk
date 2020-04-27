package o;

import java.util.Iterator;
import java.util.Set;

/* renamed from: o.ɂі  reason: contains not printable characters */
public final class C1023 {
    /* renamed from: ι  reason: contains not printable characters */
    static int m7261(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static boolean m7262(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }
}
