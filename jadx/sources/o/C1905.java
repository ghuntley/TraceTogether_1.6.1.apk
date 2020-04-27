package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: o.Ξ  reason: contains not printable characters */
public class C1905 extends CheckBox implements C0892, C0291 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1044 f9640;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1412 f9641;

    /* renamed from: ι  reason: contains not printable characters */
    private final C1606 f9642;

    public C1905(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1905(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f149822130968759);
    }

    public C1905(Context context, AttributeSet attributeSet, int i) {
        super(C1786.m9912(context), attributeSet, i);
        this.f9642 = new C1606(this);
        this.f9642.m9327(attributeSet, i);
        this.f9640 = new C1044(this);
        this.f9640.m7293(attributeSet, i);
        this.f9641 = new C1412(this);
        this.f9641.m8610(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1606 r1 = this.f9642;
        if (r1 != null) {
            r1.m9325();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C3257Con.m1345(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C1606 r1 = this.f9642;
        return r1 != null ? r1.m9323(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1606 r0 = this.f9642;
        if (r0 != null) {
            r0.m9329(colorStateList);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public ColorStateList m10378() {
        C1606 r0 = this.f9642;
        if (r0 != null) {
            return r0.m9324();
        }
        return null;
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1606 r0 = this.f9642;
        if (r0 != null) {
            r0.m9326(mode);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1044 r0 = this.f9640;
        if (r0 != null) {
            r0.m7291(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1044 r0 = this.f9640;
        if (r0 != null) {
            return r0.m7289();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1044 r0 = this.f9640;
        if (r0 != null) {
            r0.m7292(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1044 r0 = this.f9640;
        if (r0 != null) {
            return r0.m7295();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1044 r0 = this.f9640;
        if (r0 != null) {
            r0.m7297(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1044 r0 = this.f9640;
        if (r0 != null) {
            r0.m7294(i);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1044 r0 = this.f9640;
        if (r0 != null) {
            r0.m7296();
        }
        C1412 r02 = this.f9641;
        if (r02 != null) {
            r02.m8604();
        }
    }
}
