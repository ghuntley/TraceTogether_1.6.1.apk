package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: o.ɛɪ  reason: contains not printable characters */
public final class C1127 extends C2026 {
    public C1127(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1127(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f155362130969370);
    }

    public C1127(Context context, AttributeSet attributeSet, int i) {
        super(C1400.m8576(context, attributeSet, i, R.style.f175262131952314), attributeSet, i);
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C0671 r4 = new C0671();
            ColorStateList valueOf = ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0);
            if (r4.f4785.f4804 != valueOf) {
                r4.f4785.f4804 = valueOf;
                r4.onStateChange(r4.getState());
            }
            r4.f4785.f4812 = new C2610(context2);
            r4.m5521();
            float r2 = C0293.m4188(this);
            if (r4.f4785.f4803 != r2) {
                r4.f4785.f4803 = r2;
                r4.m5521();
            }
            C0293.m4199((View) this, (Drawable) r4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2745.m14535((View) this);
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        C2745.m14513((View) this, f);
    }
}
