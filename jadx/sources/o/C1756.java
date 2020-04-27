package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: o.ͽ  reason: contains not printable characters */
public class C1756 extends CheckedTextView {

    /* renamed from: ι  reason: contains not printable characters */
    private static final int[] f9063 = {16843016};

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1412 f9064;

    public C1756(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1756(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C1756(Context context, AttributeSet attributeSet, int i) {
        super(C1786.m9912(context), attributeSet, i);
        this.f9064 = new C1412(this);
        this.f9064.m8610(attributeSet, i);
        this.f9064.m8604();
        Context context2 = getContext();
        C1992 r1 = new C1992(context2, context2.obtainStyledAttributes(attributeSet, f9063, i, 0));
        setCheckMarkDrawable(r1.m10793(0));
        r1.f9934.recycle();
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C3257Con.m1345(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1412 r0 = this.f9064;
        if (r0 != null) {
            r0.m8621(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1412 r0 = this.f9064;
        if (r0 != null) {
            r0.m8604();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0389.m4650(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0893.m6623((TextView) this, callback));
    }
}
