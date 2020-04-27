package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import o.C2745;

/* renamed from: o.ͼ  reason: contains not printable characters */
public class C1745 extends EditText implements C0291 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1412 f9043;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1612 f9044;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1044 f9045;

    public C1745(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1745(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2745.C2746.f13032);
    }

    public C1745(Context context, AttributeSet attributeSet, int i) {
        super(C1786.m9912(context), attributeSet, i);
        this.f9045 = new C1044(this);
        this.f9045.m7293(attributeSet, i);
        this.f9043 = new C1412(this);
        this.f9043.m8610(attributeSet, i);
        this.f9043.m8604();
        this.f9044 = new C1612(this);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1044 r0 = this.f9045;
        if (r0 != null) {
            r0.m7294(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1044 r0 = this.f9045;
        if (r0 != null) {
            r0.m7297(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1044 r0 = this.f9045;
        if (r0 != null) {
            r0.m7291(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1044 r0 = this.f9045;
        if (r0 != null) {
            return r0.m7289();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1044 r0 = this.f9045;
        if (r0 != null) {
            r0.m7292(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1044 r0 = this.f9045;
        if (r0 != null) {
            return r0.m7295();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1044 r0 = this.f9045;
        if (r0 != null) {
            r0.m7296();
        }
        C1412 r02 = this.f9043;
        if (r02 != null) {
            r02.m8604();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1412 r0 = this.f9043;
        if (r0 != null) {
            r0.m8621(context, i);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0389.m4650(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0893.m6623((TextView) this, callback));
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C1612 r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.f9044) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            r0.m9350(textClassifier);
        }
    }

    public TextClassifier getTextClassifier() {
        C1612 r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.f9044) == null) {
            return super.getTextClassifier();
        }
        return r0.m9349();
    }
}
