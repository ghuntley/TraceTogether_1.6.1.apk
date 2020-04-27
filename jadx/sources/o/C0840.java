package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: o.ǀł  reason: contains not printable characters */
final class C0840 extends C0486<Float> implements C2061, RandomAccess {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C0840 f5529;

    /* renamed from: ɩ  reason: contains not printable characters */
    private float[] f5530;

    /* renamed from: ι  reason: contains not printable characters */
    private int f5531;

    C0840() {
        this(new float[10], 0);
    }

    private C0840(float[] fArr, int i) {
        this.f5530 = fArr;
        this.f5531 = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        g_();
        if (i2 >= i) {
            float[] fArr = this.f5530;
            System.arraycopy(fArr, i2, fArr, i, this.f5531 - i2);
            this.f5531 -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0840)) {
            return super.equals(obj);
        }
        C0840 r6 = (C0840) obj;
        if (this.f5531 != r6.f5531) {
            return false;
        }
        float[] fArr = r6.f5530;
        for (int i = 0; i < this.f5531; i++) {
            if (Float.floatToIntBits(this.f5530[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5531; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f5530[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f5531;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6312(float f) {
        g_();
        int i = this.f5531;
        float[] fArr = this.f5530;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f5530 = fArr2;
        }
        float[] fArr3 = this.f5530;
        int i2 = this.f5531;
        this.f5531 = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        g_();
        C0936.m6809(collection);
        if (!(collection instanceof C0840)) {
            return super.addAll(collection);
        }
        C0840 r6 = (C0840) collection;
        int i = r6.f5531;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5531;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f5530;
            if (i3 > fArr.length) {
                this.f5530 = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(r6.f5530, 0, this.f5530, this.f5531, r6.f5531);
            this.f5531 = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        g_();
        for (int i = 0; i < this.f5531; i++) {
            if (obj.equals(Float.valueOf(this.f5530[i]))) {
                float[] fArr = this.f5530;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f5531 - i) - 1);
                this.f5531--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m6309(int i) {
        if (i < 0 || i >= this.f5531) {
            throw new IndexOutOfBoundsException(m6310(i));
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final String m6310(int i) {
        int i2 = this.f5531;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        g_();
        m6309(i);
        float[] fArr = this.f5530;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        g_();
        m6309(i);
        float[] fArr = this.f5530;
        float f = fArr[i];
        int i2 = this.f5531;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f5531--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        g_();
        if (i < 0 || i > (i2 = this.f5531)) {
            throw new IndexOutOfBoundsException(m6310(i));
        }
        float[] fArr = this.f5530;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f5530, i, fArr2, i + 1, this.f5531 - i);
            this.f5530 = fArr2;
        }
        this.f5530[i] = floatValue;
        this.f5531++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        m6312(((Float) obj).floatValue());
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ C1001 m6311(int i) {
        if (i >= this.f5531) {
            return new C0840(Arrays.copyOf(this.f5530, i), this.f5531);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m6309(i);
        return Float.valueOf(this.f5530[i]);
    }

    static {
        C0840 r0 = new C0840(new float[0], 0);
        f5529 = r0;
        r0.m4847();
    }
}
