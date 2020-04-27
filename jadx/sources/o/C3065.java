package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import o.C0858;

/* renamed from: o.ե  reason: contains not printable characters */
public class C3065 extends FrameLayout implements C2850 {

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f14006;

    /* renamed from: ǃ  reason: contains not printable characters */
    private Drawable f14007;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Rect f14008;

    /* renamed from: Ι  reason: contains not printable characters */
    private Rect f14009;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f14010;

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m15639(C0501 r1) {
    }

    public C3065(Context context) {
        this(context, (AttributeSet) null);
    }

    public C3065(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3065(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14008 = new Rect();
        this.f14006 = true;
        this.f14010 = true;
        int[] iArr = C0858.Aux.f5584;
        C3160.m15978(context, attributeSet, i, R.style.f174982131952219);
        C3160.m15976(context, attributeSet, iArr, i, R.style.f174982131952219, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, R.style.f174982131952219);
        this.f14007 = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        C0293.m4207((View) this, (C2850) this);
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f14007 = drawable;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f14006 = z;
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f14010 = z;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f14009 != null && this.f14007 != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f14006) {
                this.f14008.set(0, 0, width, this.f14009.top);
                this.f14007.setBounds(this.f14008);
                this.f14007.draw(canvas);
            }
            if (this.f14010) {
                this.f14008.set(0, height - this.f14009.bottom, width, height);
                this.f14007.setBounds(this.f14008);
                this.f14007.draw(canvas);
            }
            this.f14008.set(0, this.f14009.top, this.f14009.left, height - this.f14009.bottom);
            this.f14007.setBounds(this.f14008);
            this.f14007.draw(canvas);
            this.f14008.set(width - this.f14009.right, this.f14009.top, width, height - this.f14009.bottom);
            this.f14007.setBounds(this.f14008);
            this.f14007.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f14007;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f14007;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public C0501 m15640(View view, C0501 r6) {
        if (this.f14009 == null) {
            this.f14009 = new Rect();
        }
        this.f14009.set(r6.m4895(), r6.m4893(), r6.m4894(), r6.m4890());
        m15639(r6);
        setWillNotDraw(!r6.m4892() || this.f14007 == null);
        C0293.m4176(this);
        return r6.m4896();
    }
}
