package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.C0742;

/* renamed from: o.ſӀ  reason: contains not printable characters */
public final class C0599 implements C0648, C0742.C0744, C1214 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Paint f4554 = new C0552(1);

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final List<C0707> f4555 = new ArrayList();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final boolean f4556;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1578 f4557;

    /* renamed from: ɹ  reason: contains not printable characters */
    private C0742<ColorFilter, ColorFilter> f4558;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Path f4559 = new Path();

    /* renamed from: ι  reason: contains not printable characters */
    private final String f4560;

    /* renamed from: І  reason: contains not printable characters */
    private final C0742<Integer, Integer> f4561;

    /* renamed from: і  reason: contains not printable characters */
    private final C0379 f4562;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C0742<Integer, Integer> f4563;

    public C0599(C0379 r3, C1578 r4, C1577 r5) {
        this.f4557 = r4;
        this.f4560 = r5.f8378;
        this.f4556 = r5.f8382;
        this.f4562 = r3;
        if (r5.f8379 == null || r5.f8380 == null) {
            this.f4563 = null;
            this.f4561 = null;
            return;
        }
        this.f4559.setFillType(r5.f8383);
        this.f4563 = new C0938(r5.f8379.f7684);
        this.f4563.f5002.add(this);
        C0742<Integer, Integer> r32 = this.f4563;
        if (r32 != null) {
            r4.f8389.add(r32);
        }
        this.f4561 = new C0865(r5.f8380.f7684);
        this.f4561.f5002.add(this);
        C0742<Integer, Integer> r33 = this.f4561;
        if (r33 != null) {
            r4.f8389.add(r33);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5298() {
        this.f4562.invalidateSelf();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5304(List<C0550> list, List<C0550> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C0550 r0 = list2.get(i);
            if (r0 instanceof C0707) {
                this.f4555.add((C0707) r0);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m5300() {
        return this.f4560;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5301(Canvas canvas, Matrix matrix, int i) {
        if (!this.f4556) {
            C2921.m15081();
            this.f4554.setColor(((C0938) this.f4563).m6823());
            this.f4554.setAlpha(C2493.m13236((int) ((((((float) i) / 255.0f) * ((float) this.f4561.m5937().intValue())) / 100.0f) * 255.0f)));
            C0742<ColorFilter, ColorFilter> r5 = this.f4558;
            if (r5 != null) {
                this.f4554.setColorFilter(r5.m5937());
            }
            this.f4559.reset();
            for (int i2 = 0; i2 < this.f4555.size(); i2++) {
                this.f4559.addPath(this.f4555.get(i2).m5819(), matrix);
            }
            canvas.drawPath(this.f4559, this.f4554);
            C2921.m15080();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5302(RectF rectF, Matrix matrix, boolean z) {
        this.f4559.reset();
        for (int i = 0; i < this.f4555.size(); i++) {
            this.f4559.addPath(this.f4555.get(i).m5819(), matrix);
        }
        this.f4559.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5303(C1695 r1, int i, List<C1695> list, C1695 r4) {
        C2493.m13241(r1, i, list, r4, this);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m5299(T t, C2476<T> r3) {
        if (t == C0349.f3749) {
            this.f4563.m5932(r3);
        } else if (t == C0349.f3763) {
            this.f4561.m5932(r3);
        } else if (t == C0349.f3761) {
            C0742<ColorFilter, ColorFilter> r2 = this.f4558;
            if (r2 != null) {
                this.f4557.f8389.remove(r2);
            }
            if (r3 == null) {
                this.f4558 = null;
                return;
            }
            this.f4558 = new C1120(r3);
            this.f4558.f5002.add(this);
            C1578 r22 = this.f4557;
            C0742<ColorFilter, ColorFilter> r32 = this.f4558;
            if (r32 != null) {
                r22.f8389.add(r32);
            }
        }
    }
}
