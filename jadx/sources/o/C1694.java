package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import o.C2864;

/* renamed from: o.ʟӏ  reason: contains not printable characters */
public final class C1694 extends C1578 {

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C0592 f8805;

    C1694(C0379 r4, C1685 r5) {
        super(r4, r5);
        this.f8805 = new C0592(r4, this, new C2864.If("__container", r5.f8725, false));
        this.f8805.m5239(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9611(Canvas canvas, Matrix matrix, int i) {
        this.f8805.m5235(canvas, matrix, i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9613(RectF rectF, Matrix matrix, boolean z) {
        super.m9256(rectF, matrix, z);
        this.f8805.m5236(rectF, this.f8399, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9612(C1695 r2, int i, List<C1695> list, C1695 r5) {
        this.f8805.m5237(r2, i, list, r5);
    }
}
