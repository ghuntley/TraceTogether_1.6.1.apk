package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: o.ʖ  reason: contains not printable characters */
final class C1654 extends Drawable {

    /* renamed from: Ι  reason: contains not printable characters */
    final C1771 f8654;

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C1654(C1771 r1) {
        this.f8654 = r1;
    }

    public final void draw(Canvas canvas) {
        if (!this.f8654.f9092) {
            if (this.f8654.f9089 != null) {
                this.f8654.f9089.draw(canvas);
            }
            if (this.f8654.f9095 != null && this.f8654.f9097) {
                this.f8654.f9095.draw(canvas);
            }
        } else if (this.f8654.f9091 != null) {
            this.f8654.f9091.draw(canvas);
        }
    }

    public final void getOutline(Outline outline) {
        if (this.f8654.f9092) {
            if (this.f8654.f9091 != null) {
                this.f8654.f9091.getOutline(outline);
            }
        } else if (this.f8654.f9089 != null) {
            this.f8654.f9089.getOutline(outline);
        }
    }
}
