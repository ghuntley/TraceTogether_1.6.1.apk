package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: o.ǃɩ  reason: contains not printable characters */
class C0908 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int[] f5774 = {16843067, 16843068};

    /* renamed from: ɩ  reason: contains not printable characters */
    private Bitmap f5775;

    /* renamed from: ι  reason: contains not printable characters */
    private final ProgressBar f5776;

    C0908(ProgressBar progressBar) {
        this.f5776 = progressBar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m6710(AttributeSet attributeSet, int i) {
        Context context = this.f5776.getContext();
        C1992 r2 = new C1992(context, context.obtainStyledAttributes(attributeSet, f5774, i, 0));
        Drawable r5 = r2.m10794(0);
        if (r5 != null) {
            this.f5776.setIndeterminateDrawable(m6707(r5));
        }
        Drawable r52 = r2.m10794(1);
        if (r52 != null) {
            this.f5776.setProgressDrawable(m6708(r52, false));
        }
        r2.f9934.recycle();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private Drawable m6708(Drawable drawable, boolean z) {
        if (drawable instanceof C1465) {
            C1465 r0 = (C1465) drawable;
            Drawable r1 = r0.m8791();
            if (r1 != null) {
                r0.m8792(m6708(r1, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m6708(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f5775 == null) {
                this.f5775 = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m6709());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private Drawable m6707(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable r4 = m6708(animationDrawable.getFrame(i), true);
            r4.setLevel(C3273am.f1527);
            animationDrawable2.addFrame(r4, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(C3273am.f1527);
        return animationDrawable2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private Shape m6709() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public Bitmap m6711() {
        return this.f5775;
    }
}
