package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "p0", "ι", "(I)I", "", "p1", "ǃ", "(CI)I", "", "ɩ", "(C)Z"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/gD")
class gH {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final boolean m2321(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final int m2320(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final int m2322(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C3431gf(2, 36));
    }
}
