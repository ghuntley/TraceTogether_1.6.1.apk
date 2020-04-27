package o;

import java.lang.reflect.Array;

/* renamed from: o.ǃɾ  reason: contains not printable characters */
final class C0912 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static /* synthetic */ boolean f5795 = (!C0912.class.desiredAssertionStatus());

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <T> T[] m6725(T[] tArr, int i, T t) {
        if (f5795 || i <= tArr.length) {
            if (i + 1 > tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i <= 4 ? 8 : i << 1);
                System.arraycopy(tArr, 0, tArr2, 0, i);
                tArr = tArr2;
            }
            tArr[i] = t;
            return tArr;
        }
        throw new AssertionError();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int[] m6726(int[] iArr, int i, int i2) {
        if (f5795 || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                int[] iArr2 = new int[(i <= 4 ? 8 : i << 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr = iArr2;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    private C0912() {
    }
}
