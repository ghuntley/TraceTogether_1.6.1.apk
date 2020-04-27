package o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: o.ǃɹ  reason: contains not printable characters */
public class C0910<K, V> {

    /* renamed from: ı  reason: contains not printable characters */
    private static int f5779;

    /* renamed from: ɹ  reason: contains not printable characters */
    private static int f5780;

    /* renamed from: Ι  reason: contains not printable characters */
    private static Object[] f5781;

    /* renamed from: ι  reason: contains not printable characters */
    private static Object[] f5782;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f5783;

    /* renamed from: ɩ  reason: contains not printable characters */
    public Object[] f5784;

    /* renamed from: і  reason: contains not printable characters */
    private int[] f5785;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m6716(int[] iArr, int i, int i2) {
        try {
            return C0647.m5434(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m6723(Object obj, int i) {
        int i2 = this.f5783;
        if (i2 == 0) {
            return -1;
        }
        int r1 = m6716(this.f5785, i2, i);
        if (r1 < 0 || obj.equals(this.f5784[r1 << 1])) {
            return r1;
        }
        int i3 = r1 + 1;
        while (i3 < i2 && this.f5785[i3] == i) {
            if (obj.equals(this.f5784[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = r1 - 1;
        while (i4 >= 0 && this.f5785[i4] == i) {
            if (obj.equals(this.f5784[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m6719() {
        int i = this.f5783;
        if (i == 0) {
            return -1;
        }
        int r1 = m6716(this.f5785, i, 0);
        if (r1 < 0 || this.f5784[r1 << 1] == null) {
            return r1;
        }
        int i2 = r1 + 1;
        while (i2 < i && this.f5785[i2] == 0) {
            if (this.f5784[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = r1 - 1;
        while (i3 >= 0 && this.f5785[i3] == 0) {
            if (this.f5784[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m6717(int i) {
        Class<C0910> cls = C0910.class;
        if (i == 8) {
            synchronized (cls) {
                if (f5782 != null) {
                    Object[] objArr = f5782;
                    this.f5784 = objArr;
                    f5782 = (Object[]) objArr[0];
                    this.f5785 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f5780--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (f5781 != null) {
                    Object[] objArr2 = f5781;
                    this.f5784 = objArr2;
                    f5781 = (Object[]) objArr2[0];
                    this.f5785 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f5779--;
                    return;
                }
            }
        }
        this.f5785 = new int[i];
        this.f5784 = new Object[(i << 1)];
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m6718(int[] iArr, Object[] objArr, int i) {
        Class<C0910> cls = C0910.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f5780 < 10) {
                    objArr[0] = f5782;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f5782 = objArr;
                    f5780++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f5779 < 10) {
                    objArr[0] = f5781;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f5781 = objArr;
                    f5779++;
                }
            }
        }
    }

    public C0910() {
        this.f5785 = C0647.f4658;
        this.f5784 = C0647.f4657;
        this.f5783 = 0;
    }

    public C0910(int i) {
        if (i == 0) {
            this.f5785 = C0647.f4658;
            this.f5784 = C0647.f4657;
        } else {
            m6717(i);
        }
        this.f5783 = 0;
    }

    public C0910(C0910<K, V> r6) {
        this();
        if (r6 != null) {
            int i = r6.f5783;
            m6722(this.f5783 + i);
            if (this.f5783 != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    Object[] objArr = r6.f5784;
                    int i3 = i2 << 1;
                    put(objArr[i3], objArr[i3 + 1]);
                }
            } else if (i > 0) {
                System.arraycopy(r6.f5785, 0, this.f5785, 0, i);
                System.arraycopy(r6.f5784, 0, this.f5784, 0, i << 1);
                this.f5783 = i;
            }
        }
    }

    public void clear() {
        int i = this.f5783;
        if (i > 0) {
            int[] iArr = this.f5785;
            Object[] objArr = this.f5784;
            this.f5785 = C0647.f4658;
            this.f5784 = C0647.f4657;
            this.f5783 = 0;
            m6718(iArr, objArr, i);
        }
        if (this.f5783 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6722(int i) {
        int i2 = this.f5783;
        int[] iArr = this.f5785;
        if (iArr.length < i) {
            Object[] objArr = this.f5784;
            m6717(i);
            if (this.f5783 > 0) {
                System.arraycopy(iArr, 0, this.f5785, 0, i2);
                System.arraycopy(objArr, 0, this.f5784, 0, i2 << 1);
            }
            m6718(iArr, objArr, i2);
        }
        if (this.f5783 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m6720(Object obj) {
        int i = this.f5783 << 1;
        Object[] objArr = this.f5784;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return m6720(obj) >= 0;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public boolean isEmpty() {
        return this.f5783 <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f5783;
        if (k == null) {
            i2 = m6719();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = m6723(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f5784;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        if (i3 >= this.f5785.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f5785;
            Object[] objArr = this.f5784;
            m6717(i6);
            if (i3 == this.f5783) {
                int[] iArr2 = this.f5785;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f5784, 0, objArr.length);
                }
                m6718(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f5785;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f5784;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f5783 - i5) << 1);
        }
        int i8 = this.f5783;
        if (i3 == i8) {
            int[] iArr4 = this.f5785;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f5784;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f5783 = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final V m6721(int i) {
        int i2;
        V[] vArr = this.f5784;
        int i3 = i << 1;
        V v = vArr[i3 + 1];
        int i4 = this.f5783;
        if (i4 <= 1) {
            m6718(this.f5785, (Object[]) vArr, i4);
            this.f5785 = C0647.f4658;
            this.f5784 = C0647.f4657;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f5785;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f5785;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr = this.f5784;
                    System.arraycopy(objArr, i6 << 1, objArr, i3, i7 << 1);
                }
                Object[] objArr2 = this.f5784;
                int i8 = i2 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f5785;
                Object[] objArr3 = this.f5784;
                m6717(i5);
                if (i4 == this.f5783) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f5785, 0, i);
                        System.arraycopy(objArr3, 0, this.f5784, 0, i3);
                    }
                    if (i < i2) {
                        int i9 = i + 1;
                        int i10 = i2 - i;
                        System.arraycopy(iArr3, i9, this.f5785, i, i10);
                        System.arraycopy(objArr3, i9 << 1, this.f5784, i3, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i4 == this.f5783) {
            this.f5783 = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public int size() {
        return this.f5783;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0910) {
            C0910 r7 = (C0910) obj;
            if (size() != r7.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f5783) {
                try {
                    int i2 = i << 1;
                    Object obj2 = this.f5784[i2];
                    Object obj3 = this.f5784[i2 + 1];
                    Object obj4 = r7.get(obj2);
                    if (obj3 == null) {
                        if (obj4 != null || !r7.containsKey(obj2)) {
                            return false;
                        }
                    } else if (!obj3.equals(obj4)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f5783) {
                try {
                    int i4 = i3 << 1;
                    Object obj5 = this.f5784[i4];
                    Object obj6 = this.f5784[i4 + 1];
                    Object obj7 = map.get(obj5);
                    if (obj6 == null) {
                        if (obj7 != null || !map.containsKey(obj5)) {
                            return false;
                        }
                    } else if (!obj6.equals(obj7)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f5785;
        Object[] objArr = this.f5784;
        int i = this.f5783;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5783 * 28);
        sb.append('{');
        for (int i = 0; i < this.f5783; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = i << 1;
            Object obj = this.f5784[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f5784[i2 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean containsKey(Object obj) {
        return (obj == null ? m6719() : m6723(obj, obj.hashCode())) >= 0;
    }

    public V getOrDefault(Object obj, V v) {
        int i;
        if (obj == null) {
            i = m6719();
        } else {
            i = m6723(obj, obj.hashCode());
        }
        return i >= 0 ? this.f5784[(i << 1) + 1] : v;
    }

    public V remove(Object obj) {
        int i;
        if (obj == null) {
            i = m6719();
        } else {
            i = m6723(obj, obj.hashCode());
        }
        if (i >= 0) {
            return m6721(i);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int i;
        if (obj == null) {
            i = m6719();
        } else {
            i = m6723(obj, obj.hashCode());
        }
        if (i < 0) {
            return false;
        }
        Object obj3 = this.f5784[(i << 1) + 1];
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        m6721(i);
        return true;
    }

    public V replace(K k, V v) {
        int i;
        if (k == null) {
            i = m6719();
        } else {
            i = m6723(k, k.hashCode());
        }
        if (i < 0) {
            return null;
        }
        int i2 = (i << 1) + 1;
        V[] vArr = this.f5784;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    public boolean replace(K k, V v, V v2) {
        int i;
        if (k == null) {
            i = m6719();
        } else {
            i = m6723(k, k.hashCode());
        }
        if (i < 0) {
            return false;
        }
        int i2 = (i << 1) + 1;
        V v3 = this.f5784[i2];
        if (v3 != v && (v == null || !v.equals(v3))) {
            return false;
        }
        this.f5784[i2] = v2;
        return true;
    }
}
