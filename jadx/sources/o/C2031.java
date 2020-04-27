package o;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: o.ιο  reason: contains not printable characters */
final class C2031<E> extends C0486<E> implements RandomAccess {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2031<Object> f10055;

    /* renamed from: ɩ  reason: contains not printable characters */
    private E[] f10056;

    /* renamed from: ι  reason: contains not printable characters */
    private int f10057;

    /* renamed from: ı  reason: contains not printable characters */
    public static <E> C2031<E> m10890() {
        return f10055;
    }

    C2031() {
        this(new Object[10], 0);
    }

    private C2031(E[] eArr, int i) {
        this.f10056 = eArr;
        this.f10057 = i;
    }

    public final boolean add(E e) {
        g_();
        int i = this.f10057;
        E[] eArr = this.f10056;
        if (i == eArr.length) {
            this.f10056 = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f10056;
        int i2 = this.f10057;
        this.f10057 = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public final void add(int i, E e) {
        int i2;
        g_();
        if (i < 0 || i > (i2 = this.f10057)) {
            throw new IndexOutOfBoundsException(m10892(i));
        }
        E[] eArr = this.f10056;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f10056, i, eArr2, i + 1, this.f10057 - i);
            this.f10056 = eArr2;
        }
        this.f10056[i] = e;
        this.f10057++;
        this.modCount++;
    }

    public final E get(int i) {
        m10891(i);
        return this.f10056[i];
    }

    public final E remove(int i) {
        g_();
        m10891(i);
        E[] eArr = this.f10056;
        E e = eArr[i];
        int i2 = this.f10057;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f10057--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        g_();
        m10891(i);
        E[] eArr = this.f10056;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f10057;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m10891(int i) {
        if (i < 0 || i >= this.f10057) {
            throw new IndexOutOfBoundsException(m10892(i));
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final String m10892(int i) {
        int i2 = this.f10057;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ C1001 m10893(int i) {
        if (i >= this.f10057) {
            return new C2031(Arrays.copyOf(this.f10056, i), this.f10057);
        }
        throw new IllegalArgumentException();
    }

    static {
        C2031<Object> r0 = new C2031<>(new Object[0], 0);
        f10055 = r0;
        r0.m4847();
    }
}
