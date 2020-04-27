package o;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/ed;", "", "ǃ", "()Ljava/lang/Integer;", "Ι", "()I", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
/* renamed from: o.ed  reason: case insensitive filesystem */
public abstract class C3376ed implements Iterator<Integer> {
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract int m2207();

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Integer next() {
        return Integer.valueOf(m2207());
    }
}
