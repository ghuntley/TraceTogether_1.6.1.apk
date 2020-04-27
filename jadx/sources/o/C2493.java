package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import o.C2771;
import o.C2864;

/* renamed from: o.хι  reason: contains not printable characters */
public final class C2493 {

    /* renamed from: ı  reason: contains not printable characters */
    private static PointF f11293 = new PointF();

    /* renamed from: ǃ  reason: contains not printable characters */
    public static float m13237(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m13239(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m13243(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static double m13244(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static PointF m13240(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m13242(C2864.Cif ifVar, Path path) {
        path.reset();
        PointF pointF = ifVar.f13338;
        path.moveTo(pointF.x, pointF.y);
        f11293.set(pointF.x, pointF.y);
        for (int i = 0; i < ifVar.f13339.size(); i++) {
            C2771.Cif ifVar2 = ifVar.f13339.get(i);
            PointF pointF2 = ifVar2.f13123;
            PointF pointF3 = ifVar2.f13124;
            PointF pointF4 = ifVar2.f13125;
            if (!pointF2.equals(f11293) || !pointF3.equals(pointF4)) {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            } else {
                path.lineTo(pointF4.x, pointF4.y);
            }
            f11293.set(pointF4.x, pointF4.y);
        }
        if (ifVar.f13337) {
            path.close();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m13236(int i) {
        return Math.max(0, Math.min(255, i));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static float m13245(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m13241(C1695 r1, int i, List<C1695> list, C1695 r4, C1214 r5) {
        if (r1.m9618(r5.m5135(), i)) {
            String r12 = r5.m5135();
            C1695 r2 = new C1695(r4);
            r2.f8806.add(r12);
            C1695 r13 = new C1695(r2);
            r13.f8807 = r5;
            list.add(r13);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static int m13238(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }
}
