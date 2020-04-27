package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0007\u001a'\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0007"}, d2 = {"", "p0", "p1", "p2", "ǃ", "(III)I", "ı", "(II)I"}, k = 2, mv = {1, 1, 15})
public final class eR {
    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int m2161(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int m2162(int i, int i2, int i3) {
        return m2161(m2161(i, i3) - m2161(i2, i3), i3);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final int m2160(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - m2162(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m2162(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
