package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o.C1961;

/* renamed from: o.ʭӏ  reason: contains not printable characters */
public class C1719 extends FrameLayout implements C1961 {

    /* renamed from: ι  reason: contains not printable characters */
    private final C1899 f8913;

    public C1719(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1719(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8913 = new C1899(this);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9696() {
        this.f8913.m10338();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9697() {
        this.f8913.m10340();
    }

    public final C1961.C1962 C_() {
        return this.f8913.m10336();
    }

    public void setRevealInfo(C1961.C1962 r2) {
        this.f8913.m10339(r2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m9700() {
        return this.f8913.f9621.getColor();
    }

    public void setCircularRevealScrimColor(int i) {
        C1899 r0 = this.f8913;
        r0.f9621.setColor(i);
        r0.f9616.invalidate();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        C1899 r0 = this.f8913;
        r0.f9619 = drawable;
        r0.f9616.invalidate();
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C1899 r0 = this.f8913;
        if (r0 != null) {
            r0.m10337(canvas);
        } else {
            super.draw(canvas);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9698(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean isOpaque() {
        C1899 r0 = this.f8913;
        if (r0 != null) {
            return r0.f9618.m10342() && !r0.m10335();
        }
        return super.isOpaque();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m9699() {
        return super.isOpaque();
    }
}
