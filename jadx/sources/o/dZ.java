package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÂ\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040 2\u00060!j\u0002`\"B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00018W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\t8W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\nR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lo/dZ;", "", "", "", "", "ı", "()Ljava/util/Set;", "ɩ", "ǃ", "", "()I", "Ι", "", "ι", "()Ljava/util/Collection;", "p0", "", "containsKey", "(Ljava/lang/Object;)Z", "(Ljava/lang/Void;)Z", "equals", "(Ljava/lang/Object;)Ljava/lang/Void;", "hashCode", "isEmpty", "()Z", "readResolve", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "<init>", "()V", "", "Ljava/io/Serializable;", "Lo/ı;"}, k = 1, mv = {1, 1, 15})
final class dZ implements Map, Serializable {

    /* renamed from: ι  reason: contains not printable characters */
    public static final dZ f2038 = new dZ();

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "{}";
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m2090(Void voidR) {
        fM.m2254(voidR, "");
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Void m2091(Object obj) {
        return null;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m2093() {
        return 0;
    }

    private dZ() {
    }

    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m2090((Void) obj);
        }
        return false;
    }

    public final Set<Map.Entry> entrySet() {
        return m2089();
    }

    public final Object get(Object obj) {
        return m2091(obj);
    }

    public final Set<Object> keySet() {
        return m2092();
    }

    public final int size() {
        return m2093();
    }

    public final Collection values() {
        return m2094();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final Set<Map.Entry> m2089() {
        return dX.f2036;
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final Set<Object> m2092() {
        return dX.f2036;
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final Collection m2094() {
        return dY.f2037;
    }

    private final Object readResolve() {
        return f2038;
    }
}
