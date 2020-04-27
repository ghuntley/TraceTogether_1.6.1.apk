package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: Ι  reason: contains not printable characters */
    AnimatorSet f921;

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract AnimatorSet m1051(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m1052(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f921 != null;
        if (z3) {
            this.f921.cancel();
        }
        this.f921 = m1051(view, view2, z, z3);
        this.f921.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.f921 = null;
            }
        });
        this.f921.start();
        if (!z2) {
            this.f921.end();
        }
        return true;
    }
}
