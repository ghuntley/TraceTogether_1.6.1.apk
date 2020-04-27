package o;

import java.util.Collection;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p0", "", "T", "Ι", "(Ljava/lang/Iterable;I)I"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/dN")
public class dP extends dQ {
    /* renamed from: Ι  reason: contains not printable characters */
    public static final <T> int m2074(Iterable<? extends T> iterable, int i) {
        fM.m2254(iterable, "");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
