package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import o.C0293;
import o.C1091;
import o.R;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: ı  reason: contains not printable characters */
    private Map<View, Integer> f941;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final FabTransformationBehavior.C0076 m1062(Context context, boolean z) {
        int i = z ? R.animator.f148082130837521 : R.animator.f148072130837520;
        FabTransformationBehavior.C0076 r0 = new FabTransformationBehavior.C0076();
        r0.f936 = C1091.m7459(context, i);
        return r0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m1063(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f941 = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0016) && (((CoordinatorLayout.C0016) childAt.getLayoutParams()).f162 instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.f941;
                        if (map != null && map.containsKey(childAt)) {
                            C0293.m4203(childAt, this.f941.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f941.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C0293.m4203(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f941 = null;
            }
        }
        return super.m1052(view, view2, z, z2);
    }
}
