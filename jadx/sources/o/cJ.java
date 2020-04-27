package o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o.C0712;

public final class cJ<T> implements C0712.C0713<T> {

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final Object f1851 = new Object();

    /* renamed from: Ι  reason: contains not printable characters */
    private static int f1852 = Integer.getInteger("jctools.spsc.max.lookahead.step", C0872.f5653).intValue();

    /* renamed from: ı  reason: contains not printable characters */
    private int f1853;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private AtomicReferenceArray<Object> f1854;

    /* renamed from: ǃ  reason: contains not printable characters */
    private long f1855;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final AtomicLong f1856 = new AtomicLong();

    /* renamed from: ι  reason: contains not printable characters */
    public final AtomicLong f1857 = new AtomicLong();

    /* renamed from: І  reason: contains not printable characters */
    private int f1858;

    /* renamed from: і  reason: contains not printable characters */
    private int f1859;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private AtomicReferenceArray<Object> f1860;

    public cJ(int i) {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(numberOfLeadingZeros + 1);
        this.f1854 = atomicReferenceArray;
        this.f1859 = i2;
        this.f1853 = Math.min(numberOfLeadingZeros / 4, f1852);
        this.f1860 = atomicReferenceArray;
        this.f1858 = i2;
        this.f1855 = (long) (i2 - 1);
        this.f1856.lazySet(0);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m1880(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f1854;
            long j = this.f1856.get();
            int i = this.f1859;
            int i2 = ((int) j) & i;
            if (j < this.f1855) {
                atomicReferenceArray.lazySet(i2, t);
                this.f1856.lazySet(j + 1);
                return true;
            }
            long j2 = ((long) this.f1853) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.f1855 = j2 - 1;
                atomicReferenceArray.lazySet(i2, t);
                this.f1856.lazySet(j + 1);
                return true;
            }
            long j3 = 1 + j;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, t);
                this.f1856.lazySet(j3);
                return true;
            }
            m1879(atomicReferenceArray, j, i2, t, (long) i);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m1879(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f1854 = atomicReferenceArray2;
        this.f1855 = (j2 + j) - 1;
        atomicReferenceArray2.lazySet(i, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i, f1851);
        this.f1856.lazySet(j + 1);
    }

    public final T d_() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f1860;
        long j = this.f1857.get();
        int i = this.f1858;
        int i2 = ((int) j) & i;
        T t = atomicReferenceArray.get(i2);
        boolean z = t == f1851;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, (Object) null);
            this.f1857.lazySet(j + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            int i3 = i + 1;
            atomicReferenceArray.lazySet(i3, (Object) null);
            return m1878((AtomicReferenceArray) atomicReferenceArray.get(i3), j, i);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private T m1878(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f1860 = atomicReferenceArray;
        int i2 = i & ((int) j);
        T t = atomicReferenceArray.get(i2);
        if (t != null) {
            atomicReferenceArray.lazySet(i2, (Object) null);
            this.f1857.lazySet(j + 1);
        }
        return t;
    }

    public final void J_() {
        while (true) {
            if (d_() == null) {
                if (this.f1856.get() == this.f1857.get()) {
                    return;
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m1881() {
        return this.f1856.get() == this.f1857.get();
    }
}
