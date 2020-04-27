package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: o.ǃı  reason: contains not printable characters */
public class C0881 extends Button implements C0291, C0664 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1044 f5667;

    /* renamed from: ι  reason: contains not printable characters */
    private final C1412 f5668;

    public C0881(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0881(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f149242130968701);
    }

    public C0881(Context context, AttributeSet attributeSet, int i) {
        super(C1786.m9912(context), attributeSet, i);
        this.f5667 = new C1044(this);
        this.f5667.m7293(attributeSet, i);
        this.f5668 = new C1412(this);
        this.f5668.m8610(attributeSet, i);
        this.f5668.m8604();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1044 r0 = this.f5667;
        if (r0 != null) {
            r0.m7294(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1044 r0 = this.f5667;
        if (r0 != null) {
            r0.m7297(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1044 r0 = this.f5667;
        if (r0 != null) {
            r0.m7291(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1044 r0 = this.f5667;
        if (r0 != null) {
            return r0.m7289();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1044 r0 = this.f5667;
        if (r0 != null) {
            r0.m7292(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1044 r0 = this.f5667;
        if (r0 != null) {
            return r0.m7295();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1044 r0 = this.f5667;
        if (r0 != null) {
            r0.m7296();
        }
        C1412 r02 = this.f5668;
        if (r02 != null) {
            r02.m8604();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1412 r0 = this.f5668;
        if (r0 != null) {
            r0.m8621(context, i);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1412 r0 = this.f5668;
        if (r0 != null) {
            r0.m8615(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (f4738) {
            super.setTextSize(i, f);
            return;
        }
        C1412 r0 = this.f5668;
        if (r0 != null) {
            r0.m8620(i, f);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f5668 != null && !f4738 && this.f5668.m8616()) {
            this.f5668.m8617();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f4738) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1412 r0 = this.f5668;
        if (r0 != null) {
            r0.m8605(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f4738) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1412 r0 = this.f5668;
        if (r0 != null) {
            r0.m8618(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f4738) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1412 r0 = this.f5668;
        if (r0 != null) {
            r0.m8612(iArr, i);
        }
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!f4738) {
            C1412 r0 = this.f5668;
            if (r0 != null) {
                return r0.m8619();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (f4738) {
            return super.getAutoSizeStepGranularity();
        }
        C1412 r0 = this.f5668;
        if (r0 != null) {
            return r0.m8622();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f4738) {
            return super.getAutoSizeMinTextSize();
        }
        C1412 r0 = this.f5668;
        if (r0 != null) {
            return r0.m8624();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (f4738) {
            return super.getAutoSizeMaxTextSize();
        }
        C1412 r0 = this.f5668;
        if (r0 != null) {
            return r0.m8623();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f4738) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1412 r0 = this.f5668;
        return r0 != null ? r0.m8607() : new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        C1412 r0 = this.f5668;
        if (r0 != null) {
            r0.m8611(z);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0893.m6623((TextView) this, callback));
    }
}
