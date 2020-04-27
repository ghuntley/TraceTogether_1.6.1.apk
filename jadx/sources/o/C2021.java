package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import o.C2383;

/* renamed from: o.ιͻ  reason: contains not printable characters */
class C2021 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C2383.C2385 f9988 = C2383.C2385.m12397("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Interpolator f9989 = new LinearInterpolator();

    /* renamed from: ι  reason: contains not printable characters */
    private static C1286<WeakReference<Interpolator>> f9990;

    C2021() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static WeakReference<Interpolator> m10837(int i) {
        WeakReference<Interpolator> r2;
        synchronized (C2021.class) {
            if (f9990 == null) {
                f9990 = new C1286<>();
            }
            r2 = f9990.m8216(i);
        }
        return r2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m10836(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C2021.class) {
            f9990.m8219(i, weakReference);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static <T> C2463<T> m10839(C2383 r0, C0343 r1, float f, C2218<T> r3, boolean z) {
        if (z) {
            return m10838(r1, r0, f, r3);
        }
        return new C2463<>(r3.m11660(r0, f));
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static <T> C2463<T> m10838(C0343 r16, C2383 r17, float f, C2218<T> r19) {
        Interpolator interpolator;
        T t;
        Interpolator interpolator2;
        C2383 r0 = r17;
        float f2 = f;
        C2218<T> r2 = r19;
        r17.m12391();
        Interpolator interpolator3 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f3 = 0.0f;
        while (r17.m12383()) {
            switch (r0.m12385(f9988)) {
                case 0:
                    f3 = (float) r17.m12387();
                    break;
                case 1:
                    t3 = r2.m11660(r0, f2);
                    break;
                case 2:
                    t2 = r2.m11660(r0, f2);
                    break;
                case 3:
                    pointF = C2041.m10923(r17, f);
                    break;
                case 4:
                    pointF2 = C2041.m10923(r17, f);
                    break;
                case 5:
                    if (r17.m12389() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF4 = C2041.m10923(r17, f);
                    break;
                case 7:
                    pointF3 = C2041.m10923(r17, f);
                    break;
                default:
                    r17.m12396();
                    break;
            }
        }
        r17.m12392();
        if (z) {
            interpolator = f9989;
            t = t3;
        } else {
            if (pointF == null || pointF2 == null) {
                interpolator = f9989;
            } else {
                float f4 = -f2;
                pointF.x = C2493.m13245(pointF.x, f4, f2);
                pointF.y = C2493.m13245(pointF.y, -100.0f, 100.0f);
                pointF2.x = C2493.m13245(pointF2.x, f4, f2);
                pointF2.y = C2493.m13245(pointF2.y, -100.0f, 100.0f);
                int r22 = C2467.m12719(pointF.x, pointF.y, pointF2.x, pointF2.y);
                WeakReference<Interpolator> r02 = m10837(r22);
                if (r02 != null) {
                    interpolator3 = r02.get();
                }
                if (r02 == null || interpolator3 == null) {
                    pointF.x /= f2;
                    pointF.y /= f2;
                    pointF2.x /= f2;
                    pointF2.y /= f2;
                    try {
                        interpolator2 = C0585.m5211(pointF.x, pointF.y, pointF2.x, pointF2.y);
                    } catch (IllegalArgumentException e) {
                        if (e.getMessage().equals("The Path cannot loop back on itself.")) {
                            interpolator2 = C0585.m5211(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                        } else {
                            interpolator2 = new LinearInterpolator();
                        }
                    }
                    interpolator3 = interpolator2;
                    try {
                        m10836(r22, new WeakReference(interpolator3));
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
                interpolator = interpolator3;
            }
            t = t2;
        }
        C2463 r8 = new C2463(r16, t3, t, interpolator, f3, (Float) null);
        r8.f11218 = pointF4;
        r8.f11220 = pointF3;
        return r8;
    }
}
