package o;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0005\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/gB;", "", "T", "Ι", "(Ljava/util/Iterator;)Lo/gB;", "ǃ", "(Lo/gB;)Lo/gB;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/gy")
public class gE extends C3451gz {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0004J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¸\u0006\u0005"}, d2 = {"Lo/gE$if;", "", "ι", "()Ljava/util/Iterator;", "Lo/gB;", "o/gE$if"}, k = 1, mv = {1, 1, 15})
    public static final class If implements gB<T> {

        /* renamed from: ǃ  reason: contains not printable characters */
        final /* synthetic */ Iterator f2185;

        public If(Iterator it) {
            this.f2185 = it;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final Iterator<T> m2308() {
            return this.f2185;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0004J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/gE$if;", "", "ι", "()Ljava/util/Iterator;", "Lo/gB;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.gE$if  reason: invalid class name */
    public static final class Cif implements gB<T> {

        /* renamed from: Ι  reason: contains not printable characters */
        final /* synthetic */ C3409fk f2186;

        /* renamed from: ι  reason: contains not printable characters */
        public final Iterator<T> m2309() {
            return (Iterator) this.f2186.invoke();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final <T> gB<T> m2307(Iterator<? extends T> it) {
        fM.m2254(it, "");
        return C3450gy.m2306(new If(it));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final <T> gB<T> m2306(gB<? extends T> gBVar) {
        fM.m2254(gBVar, "");
        return gBVar instanceof C3449gx ? gBVar : new C3449gx<>(gBVar);
    }
}
