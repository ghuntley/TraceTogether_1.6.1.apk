package o;

import java.util.Collection;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u001f\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "", "", "T", "ɩ", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/dN")
public class dU extends dT {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final <T> boolean m2081(Collection<? super T> collection, Iterable<? extends T> iterable) {
        fM.m2254(collection, "");
        fM.m2254(iterable, "");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }
}
