package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: o.ɩɐ  reason: contains not printable characters */
public class C1254 extends C1745 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Rect f7087;

    public C1254(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1254(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f151032130968892);
    }

    public C1254(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7087 = new Rect();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1336 r0 = m8085();
        if (r0 != null && r0.f7402 && super.getHint() == null && Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
            setHint("");
        }
    }

    public CharSequence getHint() {
        C1336 r0 = m8085();
        if (r0 == null || !r0.f7402) {
            return super.getHint();
        }
        if (r0.f7394) {
            return r0.f7382;
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            C1336 r1 = m8085();
            CharSequence charSequence = null;
            if (r1 != null && r1.f7394) {
                charSequence = r1.f7382;
            }
            editorInfo.hintText = charSequence;
        }
        return onCreateInputConnection;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private C1336 m8085() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof C1336) {
                return (C1336) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        C1336 r0 = m8085();
        if (r0 != null && rect != null) {
            r0.getFocusedRect(this.f7087);
            rect.bottom = this.f7087.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        C1336 r1 = m8085();
        if (!(r1 == null || rect == null)) {
            r1.getGlobalVisibleRect(this.f7087, point);
            rect.bottom = this.f7087.bottom;
        }
        return globalVisibleRect;
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        C1336 r0 = m8085();
        if (r0 != null) {
            this.f7087.set(0, r0.getHeight() - getResources().getDimensionPixelOffset(R.dimen.f158992131165444), r0.getWidth(), r0.getHeight());
            r0.requestRectangleOnScreen(this.f7087, true);
        }
        return requestRectangleOnScreen;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1336 r0 = m8085();
        if (Build.VERSION.SDK_INT < 23 && r0 != null) {
            Editable text = getText();
            String str = null;
            CharSequence charSequence2 = r0.f7394 ? r0.f7382 : null;
            if (r0.f7363.f6513) {
                charSequence = r0.f7363.f6522;
            } else {
                charSequence = null;
            }
            if (r0.f7363.f6521) {
                str = r0.f7363.f6512;
            }
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(charSequence2);
            boolean z3 = !TextUtils.isEmpty(charSequence);
            boolean z4 = !TextUtils.isEmpty(str);
            String str2 = "";
            String charSequence3 = z2 ? charSequence2.toString() : str2;
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence3);
            sb.append(((z4 || z3) && !TextUtils.isEmpty(charSequence3)) ? ", " : str2);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            if (!z4) {
                str = z3 ? charSequence : str2;
            }
            sb2.append(str);
            String obj2 = sb2.toString();
            if (z) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(text);
                if (!TextUtils.isEmpty(obj2)) {
                    str2 = ", ".concat(String.valueOf(obj2));
                }
                sb3.append(str2);
                str2 = sb3.toString();
            } else if (!TextUtils.isEmpty(obj2)) {
                str2 = obj2;
            }
            accessibilityNodeInfo.setText(str2);
        }
    }
}
