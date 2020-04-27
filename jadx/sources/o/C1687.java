package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: o.ʟΙ  reason: contains not printable characters */
final class C1687 extends ImageView {

    /* renamed from: ı  reason: contains not printable characters */
    private Animation.AnimationListener f8755;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f8756;

    C1687(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f8756 = (int) (3.5f * f);
        if (Build.VERSION.SDK_INT >= 21) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0293.m4163((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new Cif(this.f8756));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f8756, (float) i2, (float) i, 503316480);
            int i3 = this.f8756;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(-328966);
        C0293.m4199((View) this, (Drawable) shapeDrawable);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!(Build.VERSION.SDK_INT >= 21)) {
            setMeasuredDimension(getMeasuredWidth() + (this.f8756 << 1), getMeasuredHeight() + (this.f8756 << 1));
        }
    }

    public final void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f8755 = animationListener;
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f8755;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f8755;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void setBackgroundColorRes(int i) {
        setBackgroundColor(C0651.m5450(getContext(), i));
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* renamed from: o.ʟΙ$if  reason: invalid class name */
    class Cif extends OvalShape {

        /* renamed from: ɩ  reason: contains not printable characters */
        private Paint f8757 = new Paint();

        /* renamed from: Ι  reason: contains not printable characters */
        private RadialGradient f8758;

        Cif(int i) {
            C1687.this.f8756 = i;
            m9583((int) rect().width());
        }

        /* access modifiers changed from: protected */
        public final void onResize(float f, float f2) {
            super.onResize(f, f2);
            m9583((int) f);
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = C1687.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C1687.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f8757);
            canvas.drawCircle(f, height, (float) (width - C1687.this.f8756), paint);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private void m9583(int i) {
            float f = (float) (i / 2);
            this.f8758 = new RadialGradient(f, f, (float) C1687.this.f8756, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f8757.setShader(this.f8758);
        }
    }
}
