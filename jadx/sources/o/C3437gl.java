package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006\u001a!\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\t\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0004¢\u0006\u0004\b\t\u0010\u000f"}, d2 = {"", "p0", "ǃ", "(II)I", "", "ı", "(JJ)J", "ɩ", "p1", "Ι", "(III)I", "Lo/ge;", "ι", "(II)Lo/ge;", "Lo/gf;", "(II)Lo/gf;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/gj")
/* renamed from: o.gl  reason: case insensitive filesystem */
public class C3437gl extends C3434gi {
    /* renamed from: ı  reason: contains not printable characters */
    public static final long m2406(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final int m2407(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final int m2408(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final long m2409(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final C3430ge m2412(int i, int i2) {
        return C3430ge.f2232.m2398(i, i2, -1);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C3431gf m2411(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C3431gf.If.m2403();
        }
        return new C3431gf(i, i2 - 1);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final int m2410(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }
}
