package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00050 2\u00060(j\u0002`)2\u00060*j\u0002`+B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0004\u0010\u0013J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050 2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010\u0004\u001a\u00020\u00018W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/dY;", "", "ǃ", "()I", "ı", "", "p0", "", "ɩ", "(Ljava/lang/Void;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "", "equals", "(Ljava/lang/Object;)Z", "ι", "(I)Ljava/lang/Void;", "hashCode", "(Ljava/lang/Void;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "readResolve", "()Ljava/lang/Object;", "p1", "", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "<init>", "()V", "Ljava/io/Serializable;", "Lo/ı;", "Ljava/util/RandomAccess;", "Lo/ɹ;"}, k = 1, mv = {1, 1, 15})
public final class dY implements List, Serializable, RandomAccess {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final dY f2037 = new dY();

    public final /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int hashCode() {
        return 1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public final /* synthetic */ Object set(int i, Object obj) {
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
    public final int m2084(Void voidR) {
        fM.m2254(voidR, "");
        return -1;
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m2085() {
        return 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m2086(Void voidR) {
        fM.m2254(voidR, "");
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m2087(Void voidR) {
        fM.m2254(voidR, "");
        return -1;
    }

    private dY() {
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            return m2086((Void) obj);
        }
        return false;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Void) {
            return m2087((Void) obj);
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return m2084((Void) obj);
        }
        return -1;
    }

    public final int size() {
        return m2085();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public final boolean containsAll(Collection collection) {
        fM.m2254(collection, "");
        return collection.isEmpty();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public final Iterator iterator() {
        return C3373ea.f2120;
    }

    public final ListIterator listIterator() {
        return C3373ea.f2120;
    }

    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return C3373ea.f2120;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }

    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    private final Object readResolve() {
        return f2037;
    }
}
