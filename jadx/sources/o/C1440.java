package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: o.ɭɨ  reason: contains not printable characters */
final class C1440 extends C0486<Long> implements C1043, C2061, RandomAccess {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C1440 f7781;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f7782;

    /* renamed from: ι  reason: contains not printable characters */
    private long[] f7783;

    /* renamed from: Ι  reason: contains not printable characters */
    public static C1440 m8699() {
        return f7781;
    }

    C1440() {
        this(new long[10], 0);
    }

    private C1440(long[] jArr, int i) {
        this.f7783 = jArr;
        this.f7782 = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        g_();
        if (i2 >= i) {
            long[] jArr = this.f7783;
            System.arraycopy(jArr, i2, jArr, i, this.f7782 - i2);
            this.f7782 -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1440)) {
            return super.equals(obj);
        }
        C1440 r9 = (C1440) obj;
        if (this.f7782 != r9.f7782) {
            return false;
        }
        long[] jArr = r9.f7783;
        for (int i = 0; i < this.f7782; i++) {
            if (this.f7783[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7782; i2++) {
            i = (i * 31) + C0936.m6805(this.f7783[i2]);
        }
        return i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1043 m8700(int i) {
        if (i >= this.f7782) {
            return new C1440(Arrays.copyOf(this.f7783, i), this.f7782);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final long m8703(int i) {
        m8697(i);
        return this.f7783[i];
    }

    public final int size() {
        return this.f7782;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8702(long j) {
        g_();
        int i = this.f7782;
        long[] jArr = this.f7783;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f7783 = jArr2;
        }
        long[] jArr3 = this.f7783;
        int i2 = this.f7782;
        this.f7782 = i2 + 1;
        jArr3[i2] = j;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        g_();
        C0936.m6809(collection);
        if (!(collection instanceof C1440)) {
            return super.addAll(collection);
        }
        C1440 r6 = (C1440) collection;
        int i = r6.f7782;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7782;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f7783;
            if (i3 > jArr.length) {
                this.f7783 = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(r6.f7783, 0, this.f7783, this.f7782, r6.f7782);
            this.f7782 = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        g_();
        for (int i = 0; i < this.f7782; i++) {
            if (obj.equals(Long.valueOf(this.f7783[i]))) {
                long[] jArr = this.f7783;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f7782 - i) - 1);
                this.f7782--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m8697(int i) {
        if (i < 0 || i >= this.f7782) {
            throw new IndexOutOfBoundsException(m8698(i));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final String m8698(int i) {
        int i2 = this.f7782;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        g_();
        m8697(i);
        long[] jArr = this.f7783;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        g_();
        m8697(i);
        long[] jArr = this.f7783;
        long j = jArr[i];
        int i2 = this.f7782;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f7782--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        g_();
        if (i < 0 || i > (i2 = this.f7782)) {
            throw new IndexOutOfBoundsException(m8698(i));
        }
        long[] jArr = this.f7783;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f7783, i, jArr2, i + 1, this.f7782 - i);
            this.f7783 = jArr2;
        }
        this.f7783[i] = longValue;
        this.f7782++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        m8702(((Long) obj).longValue());
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(m8703(i));
    }

    static {
        C1440 r0 = new C1440(new long[0], 0);
        f7781 = r0;
        r0.m4847();
    }
}
