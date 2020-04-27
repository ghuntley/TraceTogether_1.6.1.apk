package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import o.C2745;

/* renamed from: o.ɩǃ  reason: contains not printable characters */
class C1249 extends C0908 {

    /* renamed from: ı  reason: contains not printable characters */
    private PorterDuff.Mode f7067 = null;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f7068 = false;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Drawable f7069;

    /* renamed from: Ι  reason: contains not printable characters */
    private final SeekBar f7070;

    /* renamed from: ι  reason: contains not printable characters */
    private ColorStateList f7071 = null;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f7072 = false;

    C1249(SeekBar seekBar) {
        super(seekBar);
        this.f7070 = seekBar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m8055(AttributeSet attributeSet, int i) {
        super.m6710(attributeSet, i);
        Context context = this.f7070.getContext();
        C1992 r2 = new C1992(context, context.obtainStyledAttributes(attributeSet, C2745.aux.f13016, i, 0));
        Drawable r5 = r2.m10794(C2745.aux.f12780);
        if (r5 != null) {
            this.f7070.setThumb(r5);
        }
        m8059(r2.m10793(C2745.aux.f12911));
        int i2 = C2745.aux.f12961;
        if (r2.f9934.hasValue(3)) {
            int i3 = C2745.aux.f12961;
            this.f7067 = C2674.m14214(r2.f9934.getInt(3, -1), this.f7067);
            this.f7072 = true;
        }
        int i4 = C2745.aux.f12943;
        if (r2.f9934.hasValue(2)) {
            this.f7071 = r2.m10792(C2745.aux.f12943);
            this.f7068 = true;
        }
        r2.f9934.recycle();
        m8054();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m8059(Drawable drawable) {
        Drawable drawable2 = this.f7069;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f7069 = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f7070);
            C1266.m8157(drawable, C0293.m4156(this.f7070));
            if (drawable.isStateful()) {
                drawable.setState(this.f7070.getDrawableState());
            }
            m8054();
        }
        this.f7070.invalidate();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m8054() {
        if (this.f7069 == null) {
            return;
        }
        if (this.f7068 || this.f7072) {
            this.f7069 = C1266.m8158(this.f7069.mutate());
            if (this.f7068) {
                C1266.m8152(this.f7069, this.f7071);
            }
            if (this.f7072) {
                C1266.m8153(this.f7069, this.f7067);
            }
            if (this.f7069.isStateful()) {
                this.f7069.setState(this.f7070.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m8057() {
        Drawable drawable = this.f7069;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m8058() {
        Drawable drawable = this.f7069;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f7070.getDrawableState())) {
            this.f7070.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m8056(Canvas canvas) {
        if (this.f7069 != null) {
            int max = this.f7070.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f7069.getIntrinsicWidth();
                int intrinsicHeight = this.f7069.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f7069.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f7070.getWidth() - this.f7070.getPaddingLeft()) - this.f7070.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f7070.getPaddingLeft(), (float) (this.f7070.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f7069.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
