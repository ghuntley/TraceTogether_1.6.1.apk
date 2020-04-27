package o;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import o.C1260;

/* renamed from: o.ɩг  reason: contains not printable characters */
public final class C1300 extends FrameLayout {

    /* renamed from: ı  reason: contains not printable characters */
    private ArrayList<View> f7278;

    /* renamed from: ǃ  reason: contains not printable characters */
    private ArrayList<View> f7279;

    /* renamed from: ι  reason: contains not printable characters */
    boolean f7280 = true;

    public C1300(Context context) {
        super(context);
    }

    public C1300(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to be instantiated from XML.");
    }

    public C1300(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to be instantiated from XML.");
    }

    C1300(Context context, AttributeSet attributeSet, C1550 r8) {
        super(context, attributeSet);
        C1469 r2;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1260.C1262.f7106);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C1260.C1262.f7110) : classAttribute;
        String string = obtainStyledAttributes.getString(C1260.C1262.f7105);
        obtainStyledAttributes.recycle();
        int id = getId();
        C1277 findFragmentById = r8.findFragmentById(id);
        if (classAttribute != null && findFragmentById == null) {
            if (id <= 0) {
                String concat = string != null ? " with tag ".concat(string) : "";
                StringBuilder sb = new StringBuilder("FragmentContainerView must have an android:id to add Fragment ");
                sb.append(classAttribute);
                sb.append(concat);
                throw new IllegalStateException(sb.toString());
            }
            if (r8.f8259 != null) {
                r2 = r8.f8259.mFragmentManager.m9131();
            } else {
                r2 = r8.f8279;
            }
            C1277 r1 = r2.m8798(context.getClassLoader(), classAttribute);
            r1.onInflate(context, attributeSet, (Bundle) null);
            C1265 r6 = new C1265(r8);
            r6.f9214 = true;
            r1.mContainer = this;
            r6.m9968(getId(), r1, string, 1);
            r6.m9963();
        }
    }

    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f7280 && this.f7279 != null) {
            for (int i = 0; i < this.f7279.size(); i++) {
                super.drawChild(canvas, this.f7279.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f7280 || (arrayList = this.f7279) == null || arrayList.size() <= 0 || !this.f7279.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f7278 == null) {
                this.f7278 = new ArrayList<>();
            }
            this.f7278.add(view);
        }
        super.startViewTransition(view);
    }

    public final void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f7278;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f7279;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f7280 = true;
            }
        }
        super.endViewTransition(view);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (C1550.m9073(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (C1550.m9073(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    public final void removeViewAt(int i) {
        m8242(getChildAt(i));
        super.removeViewAt(i);
    }

    public final void removeViewInLayout(View view) {
        m8242(view);
        super.removeViewInLayout(view);
    }

    public final void removeView(View view) {
        m8242(view);
        super.removeView(view);
    }

    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m8242(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m8242(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m8242(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public final void removeDetachedView(View view, boolean z) {
        if (z) {
            m8242(view);
        }
        super.removeDetachedView(view, z);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m8242(View view) {
        ArrayList<View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.f7278) != null && arrayList.contains(view))) {
            if (this.f7279 == null) {
                this.f7279 = new ArrayList<>();
            }
            this.f7279.add(view);
        }
    }
}
