package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* renamed from: o.ǃǃ  reason: contains not printable characters */
public class C0898 extends AutoCompleteTextView implements C0291 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final int[] f5739 = {16843126};

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1044 f5740;

    /* renamed from: ι  reason: contains not printable characters */
    private final C1412 f5741;

    public C0898(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0898(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f148562130968624);
    }

    public C0898(Context context, AttributeSet attributeSet, int i) {
        super(C1786.m9912(context), attributeSet, i);
        Context context2 = getContext();
        C1992 r1 = new C1992(context2, context2.obtainStyledAttributes(attributeSet, f5739, i, 0));
        if (r1.f9934.hasValue(0)) {
            setDropDownBackgroundDrawable(r1.m10793(0));
        }
        r1.f9934.recycle();
        this.f5740 = new C1044(this);
        this.f5740.m7293(attributeSet, i);
        this.f5741 = new C1412(this);
        this.f5741.m8610(attributeSet, i);
        this.f5741.m8604();
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C3257Con.m1345(getContext(), i));
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1044 r0 = this.f5740;
        if (r0 != null) {
            r0.m7294(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1044 r0 = this.f5740;
        if (r0 != null) {
            r0.m7297(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1044 r0 = this.f5740;
        if (r0 != null) {
            r0.m7291(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1044 r0 = this.f5740;
        if (r0 != null) {
            return r0.m7289();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1044 r0 = this.f5740;
        if (r0 != null) {
            r0.m7292(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1044 r0 = this.f5740;
        if (r0 != null) {
            return r0.m7295();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1044 r0 = this.f5740;
        if (r0 != null) {
            r0.m7296();
        }
        C1412 r02 = this.f5741;
        if (r02 != null) {
            r02.m8604();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1412 r0 = this.f5741;
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
}
