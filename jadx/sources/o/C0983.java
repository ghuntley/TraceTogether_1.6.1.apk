package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* renamed from: o.Ƚ  reason: contains not printable characters */
public class C0983 extends RadioButton implements C0892, C0291 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1412 f6006;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1606 f6007;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1044 f6008;

    public C0983(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0983(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f153952130969208);
    }

    public C0983(Context context, AttributeSet attributeSet, int i) {
        super(C1786.m9912(context), attributeSet, i);
        this.f6007 = new C1606(this);
        this.f6007.m9327(attributeSet, i);
        this.f6008 = new C1044(this);
        this.f6008.m7293(attributeSet, i);
        this.f6006 = new C1412(this);
        this.f6006.m8610(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1606 r1 = this.f6007;
        if (r1 != null) {
            r1.m9325();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C3257Con.m1345(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C1606 r1 = this.f6007;
        return r1 != null ? r1.m9323(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1606 r0 = this.f6007;
        if (r0 != null) {
            r0.m9329(colorStateList);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public ColorStateList m6961() {
        C1606 r0 = this.f6007;
        if (r0 != null) {
            return r0.m9324();
        }
        return null;
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1606 r0 = this.f6007;
        if (r0 != null) {
            r0.m9326(mode);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1044 r0 = this.f6008;
        if (r0 != null) {
            r0.m7291(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1044 r0 = this.f6008;
        if (r0 != null) {
            return r0.m7289();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1044 r0 = this.f6008;
        if (r0 != null) {
            r0.m7292(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1044 r0 = this.f6008;
        if (r0 != null) {
            return r0.m7295();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1044 r0 = this.f6008;
        if (r0 != null) {
            r0.m7297(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1044 r0 = this.f6008;
        if (r0 != null) {
            r0.m7294(i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1044 r0 = this.f6008;
        if (r0 != null) {
            r0.m7296();
        }
        C1412 r02 = this.f6006;
        if (r02 != null) {
            r02.m8604();
        }
    }
}
