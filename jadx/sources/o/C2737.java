package o;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import o.C0787;

/* renamed from: o.ҹι  reason: contains not printable characters */
public final class C2737 extends Drawable {

    /* renamed from: ı  reason: contains not printable characters */
    final Paint f12734;

    /* renamed from: ŀ  reason: contains not printable characters */
    private ColorStateList f12735;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C0787 f12736 = new C0787();

    /* renamed from: ǃ  reason: contains not printable characters */
    int f12737;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final C2738 f12738 = new C2738(this, (byte) 0);

    /* renamed from: ɨ  reason: contains not printable characters */
    private int f12739;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f12740;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final RectF f12741 = new RectF();

    /* renamed from: ɹ  reason: contains not printable characters */
    int f12742;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final Rect f12743 = new Rect();

    /* renamed from: Ι  reason: contains not printable characters */
    int f12744;

    /* renamed from: ι  reason: contains not printable characters */
    float f12745;

    /* renamed from: І  reason: contains not printable characters */
    private final Path f12746 = new Path();

    /* renamed from: і  reason: contains not printable characters */
    boolean f12747 = true;

    /* renamed from: Ӏ  reason: contains not printable characters */
    C0785 f12748;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final RectF f12749 = new RectF();

    C2737(C0785 r3) {
        this.f12748 = r3;
        this.f12734 = new Paint(1);
        this.f12734.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14483(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f12739 = colorStateList.getColorForState(getState(), this.f12739);
        }
        this.f12735 = colorStateList;
        this.f12747 = true;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f12734.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        if (this.f12747) {
            Paint paint = this.f12734;
            Rect rect = this.f12743;
            copyBounds(rect);
            float height = this.f12745 / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C0960.m6875(this.f12737, this.f12739), C0960.m6875(this.f12740, this.f12739), C0960.m6875(this.f12740 & 16777215, this.f12739), C0960.m6875(this.f12742 & 16777215, this.f12739), C0960.m6875(this.f12742, this.f12739), C0960.m6875(this.f12744, this.f12739)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f12747 = false;
        }
        float strokeWidth = this.f12734.getStrokeWidth() / 2.0f;
        copyBounds(this.f12743);
        this.f12749.set(this.f12743);
        C0460 r2 = this.f12748.f5215;
        this.f12741.set(getBounds());
        float min = Math.min(r2.m4787(this.f12741), this.f12749.width() / 2.0f);
        C0785 r22 = this.f12748;
        this.f12741.set(getBounds());
        if (r22.m6132(this.f12741)) {
            this.f12749.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f12749, min, min, this.f12734);
        }
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        C0785 r0 = this.f12748;
        this.f12741.set(getBounds());
        if (r0.m6132(this.f12741)) {
            C0460 r02 = this.f12748.f5215;
            this.f12741.set(getBounds());
            outline.setRoundRect(getBounds(), r02.m4787(this.f12741));
            return;
        }
        copyBounds(this.f12743);
        this.f12749.set(this.f12743);
        this.f12736.m6145(this.f12748, 1.0f, this.f12749, (C0787.C0788) null, this.f12746);
        if (this.f12746.isConvex()) {
            outline.setConvexPath(this.f12746);
        }
    }

    public final boolean getPadding(Rect rect) {
        C0785 r0 = this.f12748;
        this.f12741.set(getBounds());
        if (!r0.m6132(this.f12741)) {
            return true;
        }
        int round = Math.round(this.f12745);
        rect.set(round, round, round, round);
        return true;
    }

    public final void setAlpha(int i) {
        this.f12734.setAlpha(i);
        invalidateSelf();
    }

    public final int getOpacity() {
        return this.f12745 > 0.0f ? -3 : -2;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f12747 = true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f12735;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f12735;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f12739)) == this.f12739)) {
            this.f12747 = true;
            this.f12739 = colorForState;
        }
        if (this.f12747) {
            invalidateSelf();
        }
        return this.f12747;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f12738;
    }

    /* renamed from: o.ҹι$ɩ  reason: contains not printable characters */
    class C2738 extends Drawable.ConstantState {
        public final int getChangingConfigurations() {
            return 0;
        }

        private C2738() {
        }

        /* synthetic */ C2738(C2737 r1, byte b) {
            this();
        }

        public final Drawable newDrawable() {
            return C2737.this;
        }
    }
}
