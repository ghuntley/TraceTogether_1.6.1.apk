package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import o.C2745;

/* renamed from: o.ıɩ  reason: contains not printable characters */
public class C0337 {

    /* renamed from: ı  reason: contains not printable characters */
    private C1288 f3701;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C1288 f3702;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final ImageView f3703;

    /* renamed from: ι  reason: contains not printable characters */
    private C1288 f3704;

    public C0337(ImageView imageView) {
        this.f3703 = imageView;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m4449(AttributeSet attributeSet, int i) {
        Context context = this.f3703.getContext();
        C1992 r2 = new C1992(context, context.obtainStyledAttributes(attributeSet, C2745.aux.f12899, i, 0));
        try {
            Drawable drawable = this.f3703.getDrawable();
            if (drawable == null) {
                int i2 = C2745.aux.f12897;
                int resourceId = r2.f9934.getResourceId(1, -1);
                if (!(resourceId == -1 || (drawable = C3257Con.m1345(this.f3703.getContext(), resourceId)) == null)) {
                    this.f3703.setImageDrawable(drawable);
                }
            }
            if (drawable != null) {
                C2674.m14211(drawable);
            }
            int i3 = C2745.aux.f12896;
            if (r2.f9934.hasValue(2)) {
                C0679.m5550(this.f3703, r2.m10792(C2745.aux.f12896));
            }
            int i4 = C2745.aux.f12898;
            if (r2.f9934.hasValue(3)) {
                ImageView imageView = this.f3703;
                int i5 = C2745.aux.f12898;
                C0679.m5553(imageView, C2674.m14214(r2.f9934.getInt(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            r2.f9934.recycle();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m4448(int i) {
        if (i != 0) {
            Drawable r2 = C3257Con.m1345(this.f3703.getContext(), i);
            if (r2 != null) {
                C2674.m14211(r2);
            }
            this.f3703.setImageDrawable(r2);
        } else {
            this.f3703.setImageDrawable((Drawable) null);
        }
        m4450();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public boolean m4454() {
        return Build.VERSION.SDK_INT < 21 || !(this.f3703.getBackground() instanceof RippleDrawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m4452(ColorStateList colorStateList) {
        if (this.f3701 == null) {
            this.f3701 = new C1288();
        }
        C1288 r0 = this.f3701;
        r0.f7234 = colorStateList;
        r0.f7236 = true;
        m4450();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public ColorStateList m4447() {
        C1288 r0 = this.f3701;
        if (r0 != null) {
            return r0.f7234;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m4453(PorterDuff.Mode mode) {
        if (this.f3701 == null) {
            this.f3701 = new C1288();
        }
        C1288 r0 = this.f3701;
        r0.f7233 = mode;
        r0.f7235 = true;
        m4450();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public PorterDuff.Mode m4451() {
        C1288 r0 = this.f3701;
        if (r0 != null) {
            return r0.f7233;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m4450() {
        Drawable drawable = this.f3703.getDrawable();
        if (drawable != null) {
            C2674.m14211(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m4446() || !m4445(drawable)) {
            C1288 r1 = this.f3701;
            if (r1 != null) {
                C1641.m9448(drawable, r1, this.f3703.getDrawableState());
                return;
            }
            C1288 r12 = this.f3704;
            if (r12 != null) {
                C1641.m9448(drawable, r12, this.f3703.getDrawableState());
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m4446() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f3704 != null : i == 21;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m4445(Drawable drawable) {
        if (this.f3702 == null) {
            this.f3702 = new C1288();
        }
        C1288 r0 = this.f3702;
        r0.f7234 = null;
        r0.f7236 = false;
        r0.f7233 = null;
        r0.f7235 = false;
        ColorStateList r1 = C0679.m5552(this.f3703);
        if (r1 != null) {
            r0.f7236 = true;
            r0.f7234 = r1;
        }
        PorterDuff.Mode r12 = C0679.m5551(this.f3703);
        if (r12 != null) {
            r0.f7235 = true;
            r0.f7233 = r12;
        }
        if (!r0.f7236 && !r0.f7235) {
            return false;
        }
        C1641.m9448(drawable, r0, this.f3703.getDrawableState());
        return true;
    }
}
