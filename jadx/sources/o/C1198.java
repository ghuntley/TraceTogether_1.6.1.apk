package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: o.ɨŧ  reason: contains not printable characters */
final class C1198 extends C0671 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Paint f6852;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f6853;

    /* renamed from: ι  reason: contains not printable characters */
    final RectF f6854;

    C1198() {
        this((C0785) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1198(C0785 r3) {
        super(r3 == null ? new C0785() : r3);
        this.f6852 = new Paint(1);
        this.f6852.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f6852.setColor(-1);
        this.f6852.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f6854 = new RectF();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m7810(float f, float f2, float f3, float f4) {
        if (f != this.f6854.left || f2 != this.f6854.top || f3 != this.f6854.right || f4 != this.f6854.bottom) {
            this.f6854.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f6853 = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        } else {
            this.f6853 = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.f6854, this.f6852);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.f6853);
        }
    }
}
