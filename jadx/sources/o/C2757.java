package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import o.C0787;
import o.C0858;

/* renamed from: o.ӀŁ  reason: contains not printable characters */
public final class C2757 extends C2147 implements C0710 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Matrix f13065;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final Paint f13066;

    /* renamed from: ǃ  reason: contains not printable characters */
    C0785 f13067;

    /* renamed from: ȷ  reason: contains not printable characters */
    private BitmapShader f13068;

    /* renamed from: ɨ  reason: contains not printable characters */
    private Bitmap f13069;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C0787 f13070;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f13071;

    /* renamed from: Ι  reason: contains not printable characters */
    private final RectF f13072;

    /* renamed from: ι  reason: contains not printable characters */
    final RectF f13073;

    /* renamed from: І  reason: contains not printable characters */
    private final Path f13074;

    /* renamed from: і  reason: contains not printable characters */
    private ColorStateList f13075;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Paint f13076;

    public C2757(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public C2757(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2757(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13070 = new C0787();
        this.f13074 = new Path();
        this.f13065 = new Matrix();
        this.f13072 = new RectF();
        this.f13073 = new RectF();
        this.f13066 = new Paint();
        this.f13066.setAntiAlias(true);
        this.f13066.setFilterBitmap(true);
        this.f13066.setDither(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858.Aux.f5606, i, R.style.f175242131952293);
        this.f13075 = C0344.m4473(context, obtainStyledAttributes, 0);
        this.f13071 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f13076 = new Paint();
        this.f13076.setStyle(Paint.Style.STROKE);
        this.f13076.setAntiAlias(true);
        this.f13067 = new C0785(C0785.m6131(context, attributeSet, i, R.style.f175242131952293, new C0531(0.0f)), (byte) 0);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new If());
        }
        m14599();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f13069;
        if (bitmap != null) {
            this.f13072.set(0.0f, 0.0f, (float) bitmap.getWidth(), (float) this.f13069.getHeight());
            RectF rectF = this.f13072;
            RectF rectF2 = this.f13073;
            this.f13065.reset();
            this.f13065.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            this.f13068.setLocalMatrix(this.f13065);
            this.f13066.setShader(this.f13068);
            canvas.drawPath(this.f13074, this.f13066);
            this.f13076.setStrokeWidth((float) this.f13071);
            int colorForState = this.f13075.getColorForState(getDrawableState(), this.f13075.getDefaultColor());
            if (this.f13071 > 0 && colorForState != 0) {
                this.f13076.setColor(colorForState);
                canvas.drawPath(this.f13074, this.f13076);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f13073.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getMeasuredWidth() - getPaddingRight()), (float) (getMeasuredHeight() - getPaddingBottom()));
        this.f13070.m6145(this.f13067, 1.0f, this.f13073, (C0787.C0788) null, this.f13074);
    }

    public final void setShapeAppearanceModel(C0785 r1) {
        this.f13067 = r1;
        requestLayout();
    }

    public final void setStrokeColorResource(int i) {
        setStrokeColor(C3257Con.m1342(getContext(), i));
    }

    public final void setStrokeWidth(int i) {
        if (this.f13071 != i) {
            this.f13071 = i;
            invalidate();
        }
    }

    public final void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public final void setStrokeColor(ColorStateList colorStateList) {
        this.f13075 = colorStateList;
        invalidate();
    }

    @TargetApi(21)
    /* renamed from: o.ӀŁ$If */
    class If extends ViewOutlineProvider {

        /* renamed from: ɩ  reason: contains not printable characters */
        private Rect f13077 = new Rect();

        If() {
        }

        public final void getOutline(View view, Outline outline) {
            if (C2757.this.f13067 != null && C2757.this.f13067.m6132(C2757.this.f13073)) {
                C2757.this.f13073.round(this.f13077);
                outline.setRoundRect(this.f13077, C2757.this.f13067.f5222.m4787(C2757.this.f13073));
            }
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m14599();
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m14599();
    }

    public final void setImageResource(int i) {
        super.setImageResource(i);
        m14599();
    }

    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m14599();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m14599() {
        this.f13069 = m14598();
        Bitmap bitmap = this.f13069;
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f13068 = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private Bitmap m14598() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }
}
