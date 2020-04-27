package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: o.ŀǀ  reason: contains not printable characters */
final class C0500 extends C0486<Boolean> implements C2061, RandomAccess {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C0500 f4192;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean[] f4193;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f4194;

    C0500() {
        this(new boolean[10], 0);
    }

    private C0500(boolean[] zArr, int i) {
        this.f4193 = zArr;
        this.f4194 = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        g_();
        if (i2 >= i) {
            boolean[] zArr = this.f4193;
            System.arraycopy(zArr, i2, zArr, i, this.f4194 - i2);
            this.f4194 -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0500)) {
            return super.equals(obj);
        }
        C0500 r6 = (C0500) obj;
        if (this.f4194 != r6.f4194) {
            return false;
        }
        boolean[] zArr = r6.f4193;
        for (int i = 0; i < this.f4194; i++) {
            if (this.f4193[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4194; i2++) {
            i = (i * 31) + C0936.m6812(this.f4193[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f4194;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4887(boolean z) {
        g_();
        int i = this.f4194;
        boolean[] zArr = this.f4193;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f4193 = zArr2;
        }
        boolean[] zArr3 = this.f4193;
        int i2 = this.f4194;
        this.f4194 = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        g_();
        C0936.m6809(collection);
        if (!(collection instanceof C0500)) {
            return super.addAll(collection);
        }
        C0500 r6 = (C0500) collection;
        int i = r6.f4194;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4194;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f4193;
            if (i3 > zArr.length) {
                this.f4193 = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(r6.f4193, 0, this.f4193, this.f4194, r6.f4194);
            this.f4194 = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        g_();
        for (int i = 0; i < this.f4194; i++) {
            if (obj.equals(Boolean.valueOf(this.f4193[i]))) {
                boolean[] zArr = this.f4193;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f4194 - i) - 1);
                this.f4194--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m4884(int i) {
        if (i < 0 || i >= this.f4194) {
            throw new IndexOutOfBoundsException(m4885(i));
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final String m4885(int i) {
        int i2 = this.f4194;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        g_();
        m4884(i);
        boolean[] zArr = this.f4193;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        g_();
        m4884(i);
        boolean[] zArr = this.f4193;
        boolean z = zArr[i];
        int i2 = this.f4194;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f4194--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        g_();
        if (i < 0 || i > (i2 = this.f4194)) {
            throw new IndexOutOfBoundsException(m4885(i));
        }
        boolean[] zArr = this.f4193;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f4193, i, zArr2, i + 1, this.f4194 - i);
            this.f4193 = zArr2;
        }
        this.f4193[i] = booleanValue;
        this.f4194++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        m4887(((Boolean) obj).booleanValue());
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ C1001 m4886(int i) {
        if (i >= this.f4194) {
            return new C0500(Arrays.copyOf(this.f4193, i), this.f4194);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m4884(i);
        return Boolean.valueOf(this.f4193[i]);
    }

    static {
        C0500 r0 = new C0500(new boolean[0], 0);
        f4192 = r0;
        r0.m4847();
    }
}
