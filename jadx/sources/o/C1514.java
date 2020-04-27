package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import o.C2104;

/* renamed from: o.ɽ  reason: contains not printable characters */
public class C1514 extends TextView implements C0291, C0963, C0664 {
    private final C1044 mBackgroundTintHelper;
    private Future<C2104> mPrecomputedTextFuture;
    private final C1612 mTextClassifierHelper;
    private final C1412 mTextHelper;

    public C1514(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1514(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C1514(Context context, AttributeSet attributeSet, int i) {
        super(C1786.m9912(context), attributeSet, i);
        this.mBackgroundTintHelper = new C1044(this);
        this.mBackgroundTintHelper.m7293(attributeSet, i);
        this.mTextHelper = new C1412(this);
        this.mTextHelper.m8610(attributeSet, i);
        this.mTextHelper.m8604();
        this.mTextClassifierHelper = new C1612(this);
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1044 r0 = this.mBackgroundTintHelper;
        if (r0 != null) {
            r0.m7294(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1044 r0 = this.mBackgroundTintHelper;
        if (r0 != null) {
            r0.m7297(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1044 r0 = this.mBackgroundTintHelper;
        if (r0 != null) {
            r0.m7291(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1044 r0 = this.mBackgroundTintHelper;
        if (r0 != null) {
            return r0.m7289();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1044 r0 = this.mBackgroundTintHelper;
        if (r0 != null) {
            r0.m7292(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1044 r0 = this.mBackgroundTintHelper;
        if (r0 != null) {
            return r0.m7295();
        }
        return null;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1412 r0 = this.mTextHelper;
        if (r0 != null) {
            r0.m8621(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1044 r0 = this.mBackgroundTintHelper;
        if (r0 != null) {
            r0.m7296();
        }
        C1412 r02 = this.mTextHelper;
        if (r02 != null) {
            r02.m8604();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1412 r0 = this.mTextHelper;
        if (r0 != null) {
            r0.m8615(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (f4738) {
            super.setTextSize(i, f);
            return;
        }
        C1412 r0 = this.mTextHelper;
        if (r0 != null) {
            r0.m8620(i, f);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper != null && !f4738 && this.mTextHelper.m8616()) {
            this.mTextHelper.m8617();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f4738) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1412 r0 = this.mTextHelper;
        if (r0 != null) {
            r0.m8605(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f4738) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1412 r0 = this.mTextHelper;
        if (r0 != null) {
            r0.m8618(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f4738) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1412 r0 = this.mTextHelper;
        if (r0 != null) {
            r0.m8612(iArr, i);
        }
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!f4738) {
            C1412 r0 = this.mTextHelper;
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
        C1412 r0 = this.mTextHelper;
        if (r0 != null) {
            return r0.m8622();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f4738) {
            return super.getAutoSizeMinTextSize();
        }
        C1412 r0 = this.mTextHelper;
        if (r0 != null) {
            return r0.m8624();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (f4738) {
            return super.getAutoSizeMaxTextSize();
        }
        C1412 r0 = this.mTextHelper;
        if (r0 != null) {
            return r0.m8623();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f4738) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1412 r0 = this.mTextHelper;
        return r0 != null ? r0.m8607() : new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0389.m4650(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0893.m6624((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0893.m6629(this, i);
        }
    }

    public int getFirstBaselineToTopHeight() {
        return C0893.m6622(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0893.m6616((TextView) this);
    }

    public void setLineHeight(int i) {
        C0893.m6619((TextView) this, i);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0893.m6623((TextView) this, callback));
    }

    public void setTextMetricsParamsCompat(C2104.C2105 r1) {
        C0893.m6625((TextView) this, r1);
    }

    public void setPrecomputedText(C2104 r1) {
        C0893.m6626((TextView) this, r1);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<C2104> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C0893.m6626((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C1612 r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            r0.m9350(textClassifier);
        }
    }

    public TextClassifier getTextClassifier() {
        C1612 r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return r0.m9349();
    }

    public void setTextFuture(Future<C2104> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1412 r1 = this.mTextHelper;
        if (r1 != null) {
            r1.m8608();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1412 r1 = this.mTextHelper;
        if (r1 != null) {
            r1.m8608();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1412 r1 = this.mTextHelper;
        if (r1 != null) {
            r1.m8608();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable r3 = i != 0 ? C3257Con.m1345(context, i) : null;
        Drawable r4 = i2 != 0 ? C3257Con.m1345(context, i2) : null;
        Drawable r5 = i3 != 0 ? C3257Con.m1345(context, i3) : null;
        if (i4 != 0) {
            drawable = C3257Con.m1345(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, drawable);
        C1412 r32 = this.mTextHelper;
        if (r32 != null) {
            r32.m8608();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1412 r1 = this.mTextHelper;
        if (r1 != null) {
            r1.m8608();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable r3 = i != 0 ? C3257Con.m1345(context, i) : null;
        Drawable r4 = i2 != 0 ? C3257Con.m1345(context, i2) : null;
        Drawable r5 = i3 != 0 ? C3257Con.m1345(context, i3) : null;
        if (i4 != 0) {
            drawable = C3257Con.m1345(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r4, r5, drawable);
        C1412 r32 = this.mTextHelper;
        if (r32 != null) {
            r32.m8608();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m8606(colorStateList);
        this.mTextHelper.m8604();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m8613(mode);
        this.mTextHelper.m8604();
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface r0 = (typeface == null || i <= 0) ? null : C1173.m7685(getContext(), typeface, i);
        if (r0 != null) {
            typeface = r0;
        }
        super.setTypeface(typeface, i);
    }
}
