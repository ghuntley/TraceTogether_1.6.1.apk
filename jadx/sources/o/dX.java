package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00050\u001d2\u00060\u001ej\u0002`\u001fB\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00018W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/dX;", "", "ɩ", "()I", "ǃ", "", "p0", "", "ı", "(Ljava/lang/Void;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "readResolve", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "<init>", "()V", "", "Ljava/io/Serializable;", "Lo/ı;"}, k = 1, mv = {1, 1, 15})
public final class dX implements Set, Serializable {

    /* renamed from: ı  reason: contains not printable characters */
    public static final dX f2036 = new dX();

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return fJ.m2248(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        return fJ.m2249(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m2082(Void voidR) {
        fM.m2254(voidR, "");
        return false;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m2083() {
        return 0;
    }

    private dX() {
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            return m2082((Void) obj);
        }
        return false;
    }

    public final int size() {
        return m2083();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public final boolean containsAll(Collection collection) {
        fM.m2254(collection, "");
        return collection.isEmpty();
    }

    public final Iterator iterator() {
        return C3373ea.f2120;
    }

    private final Object readResolve() {
        return f2036;
    }
}
