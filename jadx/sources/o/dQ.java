package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\t\u0010\u000b\"#\u0010\u0005\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "T", "ɩ", "(Ljava/util/List;)I", "Ι", "ı", "()Ljava/util/List;", "", "ǃ", "()V", "(Ljava/util/List;)Ljava/util/List;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/dN")
public class dQ extends dO {
    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> List<T> m2075() {
        return dY.f2037;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final <T> int m2078(List<? extends T> list) {
        fM.m2254(list, "");
        return list.size() - 1;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final <T> List<T> m2076(List<? extends T> list) {
        fM.m2254(list, "");
        int size = list.size();
        if (size == 0) {
            return dN.m2075();
        }
        if (size != 1) {
            return list;
        }
        return dN.m2073(list.get(0));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final void m2077() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
