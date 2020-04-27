package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import o.C2745;

/* renamed from: o.ɉ  reason: contains not printable characters */
class C1044 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1641 f6301;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C1288 f6302;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f6303 = -1;

    /* renamed from: Ι  reason: contains not printable characters */
    private C1288 f6304;

    /* renamed from: ι  reason: contains not printable characters */
    private final View f6305;

    /* renamed from: І  reason: contains not printable characters */
    private C1288 f6306;

    C1044(View view) {
        this.f6305 = view;
        this.f6301 = C1641.m9449();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7293(AttributeSet attributeSet, int i) {
        Context context = this.f6305.getContext();
        C1992 r2 = new C1992(context, context.obtainStyledAttributes(attributeSet, C2745.aux.f13014, i, 0));
        try {
            int i2 = C2745.aux.f13007;
            if (r2.f9934.hasValue(0)) {
                int i3 = C2745.aux.f13007;
                this.f6303 = r2.f9934.getResourceId(0, -1);
                ColorStateList r5 = this.f6301.m9450(this.f6305.getContext(), this.f6303);
                if (r5 != null) {
                    m7290(r5);
                }
            }
            int i4 = C2745.aux.f13006;
            if (r2.f9934.hasValue(1)) {
                C0293.m4198(this.f6305, r2.m10792(C2745.aux.f13006));
            }
            int i5 = C2745.aux.f13013;
            if (r2.f9934.hasValue(2)) {
                View view = this.f6305;
                int i6 = C2745.aux.f13013;
                C0293.m4179(view, C2674.m14214(r2.f9934.getInt(2, -1), (PorterDuff.Mode) null));
            }
        } finally {
            r2.f9934.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m7294(int i) {
        this.f6303 = i;
        C1641 r0 = this.f6301;
        m7290(r0 != null ? r0.m9450(this.f6305.getContext(), i) : null);
        m7296();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m7297(Drawable drawable) {
        this.f6303 = -1;
        m7290((ColorStateList) null);
        m7296();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7291(ColorStateList colorStateList) {
        if (this.f6304 == null) {
            this.f6304 = new C1288();
        }
        C1288 r0 = this.f6304;
        r0.f7234 = colorStateList;
        r0.f7236 = true;
        m7296();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public ColorStateList m7289() {
        C1288 r0 = this.f6304;
        if (r0 != null) {
            return r0.f7234;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7292(PorterDuff.Mode mode) {
        if (this.f6304 == null) {
            this.f6304 = new C1288();
        }
        C1288 r0 = this.f6304;
        r0.f7233 = mode;
        r0.f7235 = true;
        m7296();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public PorterDuff.Mode m7295() {
        C1288 r0 = this.f6304;
        if (r0 != null) {
            return r0.f7233;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m7296() {
        Drawable background = this.f6305.getBackground();
        if (background == null) {
            return;
        }
        if (!m7288() || !m7287(background)) {
            C1288 r1 = this.f6304;
            if (r1 != null) {
                C1641.m9448(background, r1, this.f6305.getDrawableState());
                return;
            }
            C1288 r12 = this.f6302;
            if (r12 != null) {
                C1641.m9448(background, r12, this.f6305.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m7290(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f6302 == null) {
                this.f6302 = new C1288();
            }
            C1288 r0 = this.f6302;
            r0.f7234 = colorStateList;
            r0.f7236 = true;
        } else {
            this.f6302 = null;
        }
        m7296();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m7288() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f6302 != null : i == 21;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m7287(Drawable drawable) {
        if (this.f6306 == null) {
            this.f6306 = new C1288();
        }
        C1288 r0 = this.f6306;
        r0.f7234 = null;
        r0.f7236 = false;
        r0.f7233 = null;
        r0.f7235 = false;
        ColorStateList r1 = C0293.m4158(this.f6305);
        if (r1 != null) {
            r0.f7236 = true;
            r0.f7234 = r1;
        }
        PorterDuff.Mode r12 = C0293.m4190(this.f6305);
        if (r12 != null) {
            r0.f7235 = true;
            r0.f7233 = r12;
        }
        if (!r0.f7236 && !r0.f7235) {
            return false;
        }
        C1641.m9448(drawable, r0, this.f6305.getDrawableState());
        return true;
    }
}
