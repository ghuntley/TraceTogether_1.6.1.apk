package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010*\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00050\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\n"}, d2 = {"Lo/ea;", "", "hasNext", "()Z", "hasPrevious", "", "ǃ", "()Ljava/lang/Void;", "", "nextIndex", "()I", "ɩ", "previousIndex", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
/* renamed from: o.ea  reason: case insensitive filesystem */
public final class C3373ea implements ListIterator {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C3373ea f2120 = new C3373ea();

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final int nextIndex() {
        return 0;
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private C3373ea() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Void next() {
        throw new NoSuchElementException();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Void previous() {
        throw new NoSuchElementException();
    }
}
