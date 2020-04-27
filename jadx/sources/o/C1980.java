package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import o.C1961;

/* renamed from: o.ιɑ  reason: contains not printable characters */
public class C1980 extends C1616 implements C1961 {

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C1899 f9920;

    public C1980(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1980(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9920 = new C1899(this);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m10767() {
        this.f9920.m10338();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10768() {
        this.f9920.m10340();
    }

    public void setRevealInfo(C1961.C1962 r2) {
        this.f9920.m10339(r2);
    }

    public final C1961.C1962 C_() {
        return this.f9920.m10336();
    }

    public void setCircularRevealScrimColor(int i) {
        C1899 r0 = this.f9920;
        r0.f9621.setColor(i);
        r0.f9616.invalidate();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m10771() {
        return this.f9920.f9621.getColor();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        C1899 r0 = this.f9920;
        r0.f9619 = drawable;
        r0.f9616.invalidate();
    }

    public void draw(Canvas canvas) {
        C1899 r0 = this.f9920;
        if (r0 != null) {
            r0.m10337(canvas);
        } else {
            super.draw(canvas);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10769(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean isOpaque() {
        C1899 r0 = this.f9920;
        if (r0 != null) {
            return r0.f9618.m10342() && !r0.m10335();
        }
        return super.isOpaque();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m10770() {
        return super.isOpaque();
    }
}
