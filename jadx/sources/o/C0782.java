package o;

/* renamed from: o.Ƭ  reason: contains not printable characters */
public final class C0782<E> implements Cloneable {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final Object f5198 = new Object();

    /* renamed from: ı  reason: contains not printable characters */
    public boolean f5199;

    /* renamed from: ɩ  reason: contains not printable characters */
    public Object[] f5200;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f5201;

    /* renamed from: ι  reason: contains not printable characters */
    public long[] f5202;

    public C0782() {
        this(10);
    }

    public C0782(int i) {
        this.f5199 = false;
        if (i == 0) {
            this.f5202 = C0647.f4656;
            this.f5200 = C0647.f4657;
            return;
        }
        int r2 = C0647.m5435(i);
        this.f5202 = new long[r2];
        this.f5200 = new Object[r2];
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0782<E> clone() {
        try {
            C0782<E> r0 = (C0782) super.clone();
            r0.f5202 = (long[]) this.f5202.clone();
            r0.f5200 = (Object[]) this.f5200.clone();
            return r0;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final E m6119(long j, E e) {
        int r3 = C0647.m5432(this.f5202, this.f5201, j);
        if (r3 >= 0) {
            E[] eArr = this.f5200;
            if (eArr[r3] != f5198) {
                return eArr[r3];
            }
        }
        return e;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6115() {
        int i = this.f5201;
        long[] jArr = this.f5202;
        Object[] objArr = this.f5200;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f5198) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f5199 = false;
        this.f5201 = i2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6116(long j, E e) {
        int r0 = C0647.m5432(this.f5202, this.f5201, j);
        if (r0 >= 0) {
            this.f5200[r0] = e;
            return;
        }
        int i = ~r0;
        if (i < this.f5201) {
            Object[] objArr = this.f5200;
            if (objArr[i] == f5198) {
                this.f5202[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f5199 && this.f5201 >= this.f5202.length) {
            m6115();
            i = ~C0647.m5432(this.f5202, this.f5201, j);
        }
        int i2 = this.f5201;
        if (i2 >= this.f5202.length) {
            int r1 = C0647.m5435(i2 + 1);
            long[] jArr = new long[r1];
            Object[] objArr2 = new Object[r1];
            long[] jArr2 = this.f5202;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f5200;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5202 = jArr;
            this.f5200 = objArr2;
        }
        int i3 = this.f5201;
        if (i3 - i != 0) {
            long[] jArr3 = this.f5202;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f5200;
            System.arraycopy(objArr4, i, objArr4, i4, this.f5201 - i);
        }
        this.f5202[i] = j;
        this.f5200[i] = e;
        this.f5201++;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m6121() {
        if (this.f5199) {
            m6115();
        }
        return this.f5201;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final long m6114(int i) {
        if (this.f5199) {
            m6115();
        }
        return this.f5202[i];
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private E m6113(int i) {
        if (this.f5199) {
            m6115();
        }
        return this.f5200[i];
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6117() {
        int i = this.f5201;
        Object[] objArr = this.f5200;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f5201 = 0;
        this.f5199 = false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6118(long j, E e) {
        int i = this.f5201;
        if (i == 0 || j > this.f5202[i - 1]) {
            if (this.f5199 && this.f5201 >= this.f5202.length) {
                m6115();
            }
            int i2 = this.f5201;
            if (i2 >= this.f5202.length) {
                int r1 = C0647.m5435(i2 + 1);
                long[] jArr = new long[r1];
                Object[] objArr = new Object[r1];
                long[] jArr2 = this.f5202;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f5200;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f5202 = jArr;
                this.f5200 = objArr;
            }
            this.f5202[i2] = j;
            this.f5200[i2] = e;
            this.f5201 = i2 + 1;
            return;
        }
        m6116(j, e);
    }

    public final String toString() {
        if (this.f5199) {
            m6115();
        }
        int i = this.f5201;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5201; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m6114(i2));
            sb.append('=');
            Object r2 = m6113(i2);
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
