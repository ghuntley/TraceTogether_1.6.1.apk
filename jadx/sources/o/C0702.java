package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: o.ƗЈ  reason: contains not printable characters */
final class C0702 extends C0486<Double> implements C2061, RandomAccess {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C0702 f4886;

    /* renamed from: ı  reason: contains not printable characters */
    private double[] f4887;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f4888;

    C0702() {
        this(new double[10], 0);
    }

    private C0702(double[] dArr, int i) {
        this.f4887 = dArr;
        this.f4888 = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        g_();
        if (i2 >= i) {
            double[] dArr = this.f4887;
            System.arraycopy(dArr, i2, dArr, i, this.f4888 - i2);
            this.f4888 -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0702)) {
            return super.equals(obj);
        }
        C0702 r9 = (C0702) obj;
        if (this.f4888 != r9.f4888) {
            return false;
        }
        double[] dArr = r9.f4887;
        for (int i = 0; i < this.f4888; i++) {
            if (Double.doubleToLongBits(this.f4887[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4888; i2++) {
            i = (i * 31) + C0936.m6805(Double.doubleToLongBits(this.f4887[i2]));
        }
        return i;
    }

    public final int size() {
        return this.f4888;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5809(double d) {
        g_();
        int i = this.f4888;
        double[] dArr = this.f4887;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f4887 = dArr2;
        }
        double[] dArr3 = this.f4887;
        int i2 = this.f4888;
        this.f4888 = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        g_();
        C0936.m6809(collection);
        if (!(collection instanceof C0702)) {
            return super.addAll(collection);
        }
        C0702 r6 = (C0702) collection;
        int i = r6.f4888;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4888;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f4887;
            if (i3 > dArr.length) {
                this.f4887 = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(r6.f4887, 0, this.f4887, this.f4888, r6.f4888);
            this.f4888 = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        g_();
        for (int i = 0; i < this.f4888; i++) {
            if (obj.equals(Double.valueOf(this.f4887[i]))) {
                double[] dArr = this.f4887;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f4888 - i) - 1);
                this.f4888--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m5807(int i) {
        if (i < 0 || i >= this.f4888) {
            throw new IndexOutOfBoundsException(m5806(i));
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final String m5806(int i) {
        int i2 = this.f4888;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        g_();
        m5807(i);
        double[] dArr = this.f4887;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        g_();
        m5807(i);
        double[] dArr = this.f4887;
        double d = dArr[i];
        int i2 = this.f4888;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f4888--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        g_();
        if (i < 0 || i > (i2 = this.f4888)) {
            throw new IndexOutOfBoundsException(m5806(i));
        }
        double[] dArr = this.f4887;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f4887, i, dArr2, i + 1, this.f4888 - i);
            this.f4887 = dArr2;
        }
        this.f4887[i] = doubleValue;
        this.f4888++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        m5809(((Double) obj).doubleValue());
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ C1001 m5808(int i) {
        if (i >= this.f4888) {
            return new C0702(Arrays.copyOf(this.f4887, i), this.f4888);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m5807(i);
        return Double.valueOf(this.f4887[i]);
    }

    static {
        C0702 r0 = new C0702(new double[0], 0);
        f4886 = r0;
        r0.m4847();
    }
}
