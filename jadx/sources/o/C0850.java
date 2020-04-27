package o;

import java.util.Arrays;

/* renamed from: o.ǀɨ  reason: contains not printable characters */
public final class C0850<K, V> {

    /* renamed from: ı  reason: contains not printable characters */
    private int f5557;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f5558;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Object[] f5559;

    public C0850() {
        this(4);
    }

    private C0850(int i) {
        this.f5559 = new Object[8];
        this.f5557 = 0;
        this.f5558 = false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0850<K, V> m6396(K k, V v) {
        int i = (this.f5557 + 1) << 1;
        Object[] objArr = this.f5559;
        if (i > objArr.length) {
            int length = objArr.length;
            if (i >= 0) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    i2 = Integer.highestOneBit(i - 1) << 1;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                this.f5559 = Arrays.copyOf(objArr, i2);
                this.f5558 = false;
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        C0733.m5871(k, v);
        Object[] objArr2 = this.f5559;
        int i3 = this.f5557;
        objArr2[i3 * 2] = k;
        objArr2[(i3 * 2) + 1] = v;
        this.f5557 = i3 + 1;
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0959<K, V> m6397() {
        this.f5558 = true;
        return C0971.m6938(this.f5557, this.f5559);
    }
}
