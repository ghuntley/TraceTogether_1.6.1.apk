package o;

/* renamed from: o.ɩΙ  reason: contains not printable characters */
public class C1286<E> implements Cloneable {

    /* renamed from: ι  reason: contains not printable characters */
    private static final Object f7228 = new Object();

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f7229;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f7230;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Object[] f7231;

    /* renamed from: Ι  reason: contains not printable characters */
    private int[] f7232;

    public C1286() {
        this(10);
    }

    public C1286(int i) {
        this.f7229 = false;
        if (i == 0) {
            this.f7232 = C0647.f4658;
            this.f7231 = C0647.f4657;
            return;
        }
        int r2 = C0647.m5433(i);
        this.f7232 = new int[r2];
        this.f7231 = new Object[r2];
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C1286<E> clone() {
        try {
            C1286<E> r0 = (C1286) super.clone();
            r0.f7232 = (int[]) this.f7232.clone();
            r0.f7231 = (Object[]) this.f7231.clone();
            return r0;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public E m8216(int i) {
        return m8209(i, (Object) null);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public E m8209(int i, E e) {
        int r4 = C0647.m5434(this.f7232, this.f7230, i);
        if (r4 >= 0) {
            E[] eArr = this.f7231;
            if (eArr[r4] != f7228) {
                return eArr[r4];
            }
        }
        return e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f7231;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8211(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f7232
            int r1 = r3.f7230
            int r4 = o.C0647.m5434(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f7231
            r1 = r0[r4]
            java.lang.Object r2 = f7228
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f7229 = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1286.m8211(int):void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m8213(int i) {
        Object[] objArr = this.f7231;
        Object obj = objArr[i];
        Object obj2 = f7228;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f7229 = true;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m8207() {
        int i = this.f7230;
        int[] iArr = this.f7232;
        Object[] objArr = this.f7231;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f7228) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f7229 = false;
        this.f7230 = i2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m8219(int i, E e) {
        int r0 = C0647.m5434(this.f7232, this.f7230, i);
        if (r0 >= 0) {
            this.f7231[r0] = e;
            return;
        }
        int i2 = ~r0;
        if (i2 < this.f7230) {
            Object[] objArr = this.f7231;
            if (objArr[i2] == f7228) {
                this.f7232[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f7229 && this.f7230 >= this.f7232.length) {
            m8207();
            i2 = ~C0647.m5434(this.f7232, this.f7230, i);
        }
        int i3 = this.f7230;
        if (i3 >= this.f7232.length) {
            int r1 = C0647.m5433(i3 + 1);
            int[] iArr = new int[r1];
            Object[] objArr2 = new Object[r1];
            int[] iArr2 = this.f7232;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f7231;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f7232 = iArr;
            this.f7231 = objArr2;
        }
        int i4 = this.f7230;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f7232;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f7231;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f7230 - i2);
        }
        this.f7232[i2] = i;
        this.f7231[i2] = e;
        this.f7230++;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public int m8210() {
        if (this.f7229) {
            m8207();
        }
        return this.f7230;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public int m8208(int i) {
        if (this.f7229) {
            m8207();
        }
        return this.f7232[i];
    }

    /* renamed from: ι  reason: contains not printable characters */
    public E m8218(int i) {
        if (this.f7229) {
            m8207();
        }
        return this.f7231[i];
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public int m8220(int i) {
        if (this.f7229) {
            m8207();
        }
        return C0647.m5434(this.f7232, this.f7230, i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public int m8215(E e) {
        if (this.f7229) {
            m8207();
        }
        for (int i = 0; i < this.f7230; i++) {
            if (this.f7231[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m8212() {
        int i = this.f7230;
        Object[] objArr = this.f7231;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f7230 = 0;
        this.f7229 = false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m8214(int i, E e) {
        int i2 = this.f7230;
        if (i2 == 0 || i > this.f7232[i2 - 1]) {
            if (this.f7229 && this.f7230 >= this.f7232.length) {
                m8207();
            }
            int i3 = this.f7230;
            if (i3 >= this.f7232.length) {
                int r1 = C0647.m5433(i3 + 1);
                int[] iArr = new int[r1];
                Object[] objArr = new Object[r1];
                int[] iArr2 = this.f7232;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f7231;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f7232 = iArr;
                this.f7231 = objArr;
            }
            this.f7232[i3] = i;
            this.f7231[i3] = e;
            this.f7230 = i3 + 1;
            return;
        }
        m8219(i, e);
    }

    public String toString() {
        if (m8210() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7230 * 28);
        sb.append('{');
        for (int i = 0; i < this.f7230; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m8208(i));
            sb.append('=');
            Object r2 = m8218(i);
            if (r2 != this) {
                sb.append(r2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
