package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000f\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u00020\u0002\"\f\b\u0000\u0010\u0004*\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0000\u001a\u0004\u0018\u00018\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"p0", "p1", "", "", "T", "ι", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/eq")
/* renamed from: o.eo  reason: case insensitive filesystem */
public class C3387eo {
    /* renamed from: ι  reason: contains not printable characters */
    public static final <T extends Comparable<?>> int m2212(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
