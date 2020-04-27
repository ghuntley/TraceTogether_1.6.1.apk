package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.C0888;

/* renamed from: o.Ɩı  reason: contains not printable characters */
public final class C0639<E> implements Collection<E>, Set<E> {

    /* renamed from: ı  reason: contains not printable characters */
    private static Object[] f4629;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static Object[] f4630;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int[] f4631 = new int[0];

    /* renamed from: ι  reason: contains not printable characters */
    private static final Object[] f4632 = new Object[0];

    /* renamed from: і  reason: contains not printable characters */
    private static int f4633;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static int f4634;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f4635;

    /* renamed from: ɹ  reason: contains not printable characters */
    private C0888<E, E> f4636;

    /* renamed from: Ι  reason: contains not printable characters */
    public Object[] f4637;

    /* renamed from: І  reason: contains not printable characters */
    private int[] f4638;

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final int m5404(Object obj, int i) {
        int i2 = this.f4635;
        if (i2 == 0) {
            return -1;
        }
        int r1 = C0647.m5434(this.f4638, i2, i);
        if (r1 < 0 || obj.equals(this.f4637[r1])) {
            return r1;
        }
        int i3 = r1 + 1;
        while (i3 < i2 && this.f4638[i3] == i) {
            if (obj.equals(this.f4637[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = r1 - 1;
        while (i4 >= 0 && this.f4638[i4] == i) {
            if (obj.equals(this.f4637[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final int m5406() {
        int i = this.f4635;
        if (i == 0) {
            return -1;
        }
        int r1 = C0647.m5434(this.f4638, i, 0);
        if (r1 < 0 || this.f4637[r1] == null) {
            return r1;
        }
        int i2 = r1 + 1;
        while (i2 < i && this.f4638[i2] == 0) {
            if (this.f4637[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = r1 - 1;
        while (i3 >= 0 && this.f4638[i3] == 0) {
            if (this.f4637[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m5403(int i) {
        Class<C0639> cls = C0639.class;
        if (i == 8) {
            synchronized (cls) {
                if (f4630 != null) {
                    Object[] objArr = f4630;
                    this.f4637 = objArr;
                    f4630 = (Object[]) objArr[0];
                    this.f4638 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f4633--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (f4629 != null) {
                    Object[] objArr2 = f4629;
                    this.f4637 = objArr2;
                    f4629 = (Object[]) objArr2[0];
                    this.f4638 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f4634--;
                    return;
                }
            }
        }
        this.f4638 = new int[i];
        this.f4637 = new Object[i];
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m5402(int[] iArr, Object[] objArr, int i) {
        Class<C0639> cls = C0639.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f4633 < 10) {
                    objArr[0] = f4630;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f4630 = objArr;
                    f4633++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f4634 < 10) {
                    objArr[0] = f4629;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f4629 = objArr;
                    f4634++;
                }
            }
        }
    }

    public C0639() {
        this((byte) 0);
    }

    private C0639(byte b) {
        this.f4638 = f4631;
        this.f4637 = f4632;
        this.f4635 = 0;
    }

    public final void clear() {
        int i = this.f4635;
        if (i != 0) {
            m5402(this.f4638, this.f4637, i);
            this.f4638 = f4631;
            this.f4637 = f4632;
            this.f4635 = 0;
        }
    }

    public final boolean isEmpty() {
        return this.f4635 <= 0;
    }

    public final boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m5406();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m5404(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f4635;
        if (i4 >= this.f4638.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f4638;
            Object[] objArr = this.f4637;
            m5403(i5);
            int[] iArr2 = this.f4638;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f4637, 0, objArr.length);
            }
            m5402(iArr, objArr, this.f4635);
        }
        int i6 = this.f4635;
        if (i3 < i6) {
            int[] iArr3 = this.f4638;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f4637;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f4635 - i3);
        }
        this.f4638[i3] = i;
        this.f4637[i3] = e;
        this.f4635++;
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final E m5405(int i) {
        E[] eArr = this.f4637;
        E e = eArr[i];
        int i2 = this.f4635;
        if (i2 <= 1) {
            m5402(this.f4638, eArr, i2);
            this.f4638 = f4631;
            this.f4637 = f4632;
            this.f4635 = 0;
        } else {
            int[] iArr = this.f4638;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f4635--;
                int i4 = this.f4635;
                if (i < i4) {
                    int[] iArr2 = this.f4638;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f4637;
                    System.arraycopy(objArr, i5, objArr, i, this.f4635 - i);
                }
                this.f4637[this.f4635] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f4638;
                Object[] objArr2 = this.f4637;
                m5403(i3);
                this.f4635--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f4638, 0, i);
                    System.arraycopy(objArr2, 0, this.f4637, 0, i);
                }
                int i6 = this.f4635;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f4638, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f4637, i, this.f4635 - i);
                }
            }
        }
        return e;
    }

    public final int size() {
        return this.f4635;
    }

    public final Object[] toArray() {
        int i = this.f4635;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f4637, 0, objArr, 0, i);
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f4635) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f4635);
        }
        System.arraycopy(this.f4637, 0, tArr, 0, this.f4635);
        int length = tArr.length;
        int i = this.f4635;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f4635) {
                try {
                    if (!set.contains(this.f4637[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f4638;
        int i = this.f4635;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4635 * 14);
        sb.append('{');
        for (int i = 0; i < this.f4635; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f4637[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.f4635 + collection.size();
        int[] iArr = this.f4638;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4637;
            m5403(size);
            int i = this.f4635;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f4638, 0, i);
                System.arraycopy(objArr, 0, this.f4637, 0, this.f4635);
            }
            m5402(iArr, objArr, this.f4635);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f4635 - 1; i >= 0; i--) {
            if (!collection.contains(this.f4637[i])) {
                m5405(i);
                z = true;
            }
        }
        return z;
    }

    public final boolean contains(Object obj) {
        return (obj == null ? m5406() : m5404(obj, obj.hashCode())) >= 0;
    }

    public final boolean remove(Object obj) {
        int i;
        if (obj == null) {
            i = m5406();
        } else {
            i = m5404(obj, obj.hashCode());
        }
        if (i < 0) {
            return false;
        }
        m5405(i);
        return true;
    }

    public final Iterator<E> iterator() {
        if (this.f4636 == null) {
            this.f4636 = new C0888<E, E>() {
                /* access modifiers changed from: protected */
                /* renamed from: ι  reason: contains not printable characters */
                public final int m5415() {
                    return C0639.this.f4635;
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final Object m5412(int i, int i2) {
                    return C0639.this.f4637[i];
                }

                /* access modifiers changed from: protected */
                /* renamed from: ı  reason: contains not printable characters */
                public final int m5407(Object obj) {
                    C0639 r0 = C0639.this;
                    return obj == null ? r0.m5406() : r0.m5404(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final int m5411(Object obj) {
                    C0639 r0 = C0639.this;
                    return obj == null ? r0.m5406() : r0.m5404(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                /* renamed from: ǃ  reason: contains not printable characters */
                public final Map<E, E> m5410() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final void m5414(E e, E e2) {
                    C0639.this.add(e);
                }

                /* access modifiers changed from: protected */
                /* renamed from: ǃ  reason: contains not printable characters */
                public final E m5409(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final void m5413(int i) {
                    C0639.this.m5405(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: ı  reason: contains not printable characters */
                public final void m5408() {
                    C0639.this.clear();
                }
            };
        }
        C0888<E, E> r0 = this.f4636;
        if (r0.f5702 == null) {
            r0.f5702 = new C0888.Cif();
        }
        return r0.f5702.iterator();
    }
}
