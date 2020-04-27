package o;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3516jk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0016\u0018\u0000*\u0012\b\u0000\u0010\u001c*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u00060\u0018j\u0002`\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\r2\u0006\u0010\t\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u000eJ\u0011\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0004\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0004\u0010\u0013J\u000f\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0002\u0010\u000fJ\u0018\u0010\u0002\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0002\u0010\fJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0010\u0010\fJ\u001f\u0010\u0002\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0002\u0010\u0015R \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0006\u001a\u00020\u00058G@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8G@CX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\n\u0010\f"}, d2 = {"Lo/jm;", "", "ı", "[Lo/jk;", "Ι", "", "ɩ", "()Z", "", "p0", "ι", "()I", "(I)V", "", "(Lo/jk;)V", "()Lo/jk;", "ǃ", "І", "()[Lo/jk;", "(I)Lo/jk;", "p1", "(II)V", "<init>", "()V", "", "Lo/SynchronizedObject;", "Lo/jk;", "", "T"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.jm  reason: case insensitive filesystem */
public class C3518jm<T extends C3516jk & Comparable<? super T>> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f2479 = AtomicIntegerFieldUpdater.newUpdater(C3518jm.class, "_size");
    private volatile int _size = 0;

    /* renamed from: ı  reason: contains not printable characters */
    private T[] f2480;

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final int m3109() {
        return this._size;
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    private final void m3101(int i) {
        this._size = i;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m3106() {
        return m3109() == 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final T m3107() {
        T[] tArr = this.f2480;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final T m3108(int i) {
        boolean z = false;
        if (hA.m2423()) {
            if (!(m3109() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f2480;
        if (tArr == null) {
            fM.m2256();
        }
        m3101(m3109() - 1);
        if (i < m3109()) {
            m3099(i, m3109());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                if (t == null) {
                    fM.m2256();
                }
                Comparable comparable = (Comparable) t;
                T t2 = tArr[i2];
                if (t2 == null) {
                    fM.m2256();
                }
                if (comparable.compareTo(t2) < 0) {
                    m3099(i, i2);
                    m3100(i2);
                }
            }
            m3098(i);
        }
        T t3 = tArr[m3109()];
        if (t3 == null) {
            fM.m2256();
        }
        if (hA.m2423()) {
            if (t3.S_() == this) {
                z = true;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        t3.m3096((C3518jm<?>) null);
        t3.m3097(-1);
        tArr[m3109()] = (C3516jk) null;
        return t3;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3105(T t) {
        fM.m2254(t, "");
        if (hA.m2423()) {
            if (!(t.S_() == null)) {
                throw new AssertionError();
            }
        }
        t.m3096(this);
        C3516jk[] r0 = m3102();
        int r1 = m3109();
        m3101(r1 + 1);
        r0[r1] = t;
        t.m3097(r1);
        m3100(r1);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m3100(int i) {
        while (i > 0) {
            T[] tArr = this.f2480;
            if (tArr == null) {
                fM.m2256();
            }
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            if (t == null) {
                fM.m2256();
            }
            Comparable comparable = (Comparable) t;
            T t2 = tArr[i];
            if (t2 == null) {
                fM.m2256();
            }
            if (comparable.compareTo(t2) > 0) {
                m3099(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m3098(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < m3109()) {
                T[] tArr = this.f2480;
                if (tArr == null) {
                    fM.m2256();
                }
                int i3 = i2 + 1;
                if (i3 < m3109()) {
                    T t = tArr[i3];
                    if (t == null) {
                        fM.m2256();
                    }
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i2];
                    if (t2 == null) {
                        fM.m2256();
                    }
                    if (comparable.compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                if (t3 == null) {
                    fM.m2256();
                }
                Comparable comparable2 = (Comparable) t3;
                T t4 = tArr[i2];
                if (t4 == null) {
                    fM.m2256();
                }
                if (comparable2.compareTo(t4) > 0) {
                    m3099(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    private final T[] m3102() {
        T[] tArr = this.f2480;
        if (tArr == null) {
            T[] tArr2 = new C3516jk[4];
            this.f2480 = tArr2;
            return tArr2;
        } else if (m3109() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, m3109() * 2);
            fM.m2252((Object) copyOf, "");
            T[] tArr3 = (C3516jk[]) copyOf;
            this.f2480 = tArr3;
            return tArr3;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m3099(int i, int i2) {
        T[] tArr = this.f2480;
        if (tArr == null) {
            fM.m2256();
        }
        T t = tArr[i2];
        if (t == null) {
            fM.m2256();
        }
        T t2 = tArr[i];
        if (t2 == null) {
            fM.m2256();
        }
        tArr[i] = t;
        tArr[i2] = t2;
        t.m3097(i);
        t2.m3097(i2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final T m3104() {
        T r0;
        synchronized (this) {
            r0 = m3107();
        }
        return r0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final T m3103() {
        T r0;
        synchronized (this) {
            r0 = m3109() > 0 ? m3108(0) : null;
        }
        return r0;
    }
}
