package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aQ\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\u0003\u0010\u000b\u001aI\u0010\u000e\u001a\u00020\f\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\r2\u001a\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\u000e\u0010\u000f\u001aS\u0010\u0011\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\u0018\b\u0002\u0010\u0010*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\r*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t2\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"", "K", "V", "ı", "()Ljava/util/Map;", "", "p0", "ι", "(I)I", "", "Lo/dr;", "([Lo/dr;)Ljava/util/Map;", "", "", "ǃ", "(Ljava/util/Map;[Lo/dr;)V", "M", "ɩ", "([Lo/dr;Ljava/util/Map;)Ljava/util/Map;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/ee")
/* renamed from: o.ec  reason: case insensitive filesystem */
public class C3375ec extends C3378ef {
    /* renamed from: ı  reason: contains not printable characters */
    public static final <K, V> Map<K, V> m2201() {
        dZ dZVar = dZ.f2038;
        if (dZVar != null) {
            return dZVar;
        }
        throw new dA("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final <K, V> Map<K, V> m2202(C3363dr<? extends K, ? extends V>... drVarArr) {
        fM.m2254(drVarArr, "");
        return drVarArr.length > 0 ? C3377ee.m2204(drVarArr, new LinkedHashMap(C3377ee.m2205(drVarArr.length))) : C3377ee.m2201();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final int m2205(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return i + (i / 3);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final <K, V> void m2203(Map<? super K, ? super V> map, C3363dr<? extends K, ? extends V>[] drVarArr) {
        fM.m2254(map, "");
        fM.m2254(drVarArr, "");
        for (C3363dr<? extends K, ? extends V> drVar : drVarArr) {
            map.put(drVar.m2102(), drVar.m2103());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> M m2204(C3363dr<? extends K, ? extends V>[] drVarArr, M m) {
        fM.m2254(drVarArr, "");
        fM.m2254(m, "");
        C3377ee.m2203(m, drVarArr);
        return m;
    }
}
