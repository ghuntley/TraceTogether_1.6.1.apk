package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* renamed from: o.ƚӀ  reason: contains not printable characters */
public final class C0753 extends C0545 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1578 f5096;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C0742<Integer, Integer> f5097;

    /* renamed from: ɹ  reason: contains not printable characters */
    private C0742<ColorFilter, ColorFilter> f5098;

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean f5099;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f5100;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6005(Canvas canvas, Matrix matrix, int i) {
        if (!this.f5099) {
            this.f4409.setColor(((C0938) this.f5097).m6823());
            if (this.f5098 != null) {
                this.f4409.setColorFilter(this.f5098.m5937());
            }
            super.m5129(canvas, matrix, i);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m6004() {
        return this.f5100;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m6003(T t, C2476<T> r3) {
        super.m5128(t, r3);
        if (t == C0349.f3773) {
            this.f5097.m5932(r3);
        } else if (t == C0349.f3761) {
            C0742<ColorFilter, ColorFilter> r2 = this.f5098;
            if (r2 != null) {
                this.f5096.f8389.remove(r2);
            }
            if (r3 == null) {
                this.f5098 = null;
                return;
            }
            this.f5098 = new C1120(r3);
            this.f5098.f5002.add(this);
            C1578 r22 = this.f5096;
            C0742<Integer, Integer> r32 = this.f5097;
            if (r32 != null) {
                r22.f8389.add(r32);
            }
        }
    }

    public C0753(C0379 r12, C1578 r13, C1547 r14) {
        super(r12, r13, r14.f8235.m9057(), r14.f8229.m9058(), r14.f8236, r14.f8233, r14.f8232, r14.f8230, r14.f8231);
        this.f5096 = r13;
        this.f5100 = r14.f8228;
        this.f5099 = r14.f8237;
        this.f5097 = new C0938(r14.f8234.f7684);
        this.f5097.f5002.add(this);
        C0742<Integer, Integer> r122 = this.f5097;
        if (r122 != null) {
            r13.f8389.add(r122);
        }
    }
}
