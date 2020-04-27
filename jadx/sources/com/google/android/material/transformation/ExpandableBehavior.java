package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import o.C0293;
import o.C2732;

public abstract class ExpandableBehavior extends CoordinatorLayout.C3238If<View> {

    /* renamed from: ι  reason: contains not printable characters */
    int f916 = 0;

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract boolean m1050(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final C2732 r3;
        if (!C0293.m4186(view)) {
            List<View> r8 = coordinatorLayout.m144(view);
            int size = r8.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    r3 = null;
                    break;
                }
                View view2 = r8.get(i2);
                if (layoutDependsOn(coordinatorLayout, view, view2)) {
                    r3 = (C2732) view2;
                    break;
                }
                i2++;
            }
            if (r3 != null && m1049(r3.m14474())) {
                this.f916 = r3.m14474() ? 1 : 2;
                final int i3 = this.f916;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (ExpandableBehavior.this.f916 == i3) {
                            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                            C2732 r1 = r3;
                            expandableBehavior.m1050((View) r1, view, r1.m14474(), false);
                        }
                        return false;
                    }
                });
            }
        }
        return false;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C2732 r4 = (C2732) view2;
        if (!m1049(r4.m14474())) {
            return false;
        }
        this.f916 = r4.m14474() ? 1 : 2;
        return m1050((View) r4, view, r4.m14474(), true);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m1049(boolean z) {
        if (!z) {
            return this.f916 == 1;
        }
        int i = this.f916;
        return i == 0 || i == 2;
    }
}
