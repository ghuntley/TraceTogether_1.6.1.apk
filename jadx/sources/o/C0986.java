package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: o.ȽΙ  reason: contains not printable characters */
final class C0986 extends C0486<Integer> implements C1019, C2061, RandomAccess {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C0986 f6012;

    /* renamed from: ı  reason: contains not printable characters */
    private int f6013;

    /* renamed from: Ι  reason: contains not printable characters */
    private int[] f6014;

    /* renamed from: ı  reason: contains not printable characters */
    public static C0986 m6969() {
        return f6012;
    }

    C0986() {
        this(new int[10], 0);
    }

    private C0986(int[] iArr, int i) {
        this.f6014 = iArr;
        this.f6013 = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        g_();
        if (i2 >= i) {
            int[] iArr = this.f6014;
            System.arraycopy(iArr, i2, iArr, i, this.f6013 - i2);
            this.f6013 -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0986)) {
            return super.equals(obj);
        }
        C0986 r6 = (C0986) obj;
        if (this.f6013 != r6.f6013) {
            return false;
        }
        int[] iArr = r6.f6014;
        for (int i = 0; i < this.f6013; i++) {
            if (this.f6014[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6013; i2++) {
            i = (i * 31) + this.f6014[i2];
        }
        return i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1019 m6973(int i) {
        if (i >= this.f6013) {
            return new C0986(Arrays.copyOf(this.f6014, i), this.f6013);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m6975(int i) {
        m6970(i);
        return this.f6014[i];
    }

    public final int size() {
        return this.f6013;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6972(int i) {
        g_();
        int i2 = this.f6013;
        int[] iArr = this.f6014;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f6014 = iArr2;
        }
        int[] iArr3 = this.f6014;
        int i3 = this.f6013;
        this.f6013 = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        g_();
        C0936.m6809(collection);
        if (!(collection instanceof C0986)) {
            return super.addAll(collection);
        }
        C0986 r6 = (C0986) collection;
        int i = r6.f6013;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6013;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f6014;
            if (i3 > iArr.length) {
                this.f6014 = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(r6.f6014, 0, this.f6014, this.f6013, r6.f6013);
            this.f6013 = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        g_();
        for (int i = 0; i < this.f6013; i++) {
            if (obj.equals(Integer.valueOf(this.f6014[i]))) {
                int[] iArr = this.f6014;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f6013 - i) - 1);
                this.f6013--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m6970(int i) {
        if (i < 0 || i >= this.f6013) {
            throw new IndexOutOfBoundsException(m6971(i));
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    private final String m6971(int i) {
        int i2 = this.f6013;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        g_();
        m6970(i);
        int[] iArr = this.f6014;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        g_();
        m6970(i);
        int[] iArr = this.f6014;
        int i2 = iArr[i];
        int i3 = this.f6013;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f6013--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        g_();
        if (i < 0 || i > (i2 = this.f6013)) {
            throw new IndexOutOfBoundsException(m6971(i));
        }
        int[] iArr = this.f6014;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f6014, i, iArr2, i + 1, this.f6013 - i);
            this.f6014 = iArr2;
        }
        this.f6014[i] = intValue;
        this.f6013++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        m6972(((Integer) obj).intValue());
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(m6975(i));
    }

    static {
        C0986 r0 = new C0986(new int[0], 0);
        f6012 = r0;
        r0.m4847();
    }
}
