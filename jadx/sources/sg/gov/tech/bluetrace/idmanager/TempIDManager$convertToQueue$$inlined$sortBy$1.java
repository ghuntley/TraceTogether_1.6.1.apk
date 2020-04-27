package sg.gov.tech.bluetrace.idmanager;

import java.util.Comparator;
import kotlin.Metadata;
import o.C3389eq;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00032\n\u0010\u0000\u001a\u0006*\u00028\u00008\u00002\n\u0010\u0001\u001a\u0006*\u00028\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"p0", "p1", "", "T", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 1, 16})
public final class TempIDManager$convertToQueue$$inlined$sortBy$1<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        return C3389eq.m2212(Long.valueOf(((TemporaryID) t).getStartTime()), Long.valueOf(((TemporaryID) t2).getStartTime()));
    }
}
