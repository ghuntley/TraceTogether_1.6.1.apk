package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.ϫ  reason: contains not printable characters */
final class C2162 implements Iterator<Object> {
    C2162() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
