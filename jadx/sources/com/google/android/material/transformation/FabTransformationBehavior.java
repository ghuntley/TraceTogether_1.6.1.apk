package com.google.android.material.transformation;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import o.C1091;
import o.C1121;
import o.C1311;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: ı  reason: contains not printable characters */
    private final RectF f923 = new RectF();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final int[] f924 = new int[2];

    /* renamed from: ǃ  reason: contains not printable characters */
    private final RectF f925 = new RectF();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Rect f926 = new Rect();

    /* renamed from: І  reason: contains not printable characters */
    private float f927;

    /* renamed from: і  reason: contains not printable characters */
    private float f928;

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract C0076 m1059(Context context, boolean z);

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int i = ((FloatingActionButton) view2).f858.f9885;
            if (i == 0 || i == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public void onAttachedToLayoutParams(CoordinatorLayout.C0016 r2) {
        if (r2.f163 == 0) {
            r2.f163 = 80;
        }
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [android.view.View] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0376 A[LOOP:0: B:99:0x0374->B:100:0x0376, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0324  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet m1060(android.view.View r23, android.view.View r24, boolean r25, boolean r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r9 = r24
            r10 = r25
            android.content.Context r2 = r24.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$ǃ r11 = r0.m1059(r2, r10)
            if (r10 == 0) goto L_0x001e
            float r2 = r23.getTranslationX()
            r0.f928 = r2
            float r2 = r23.getTranslationY()
            r0.f927 = r2
        L_0x001e:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r14 = 21
            r15 = 0
            r8 = 1
            r7 = 0
            if (r2 < r14) goto L_0x0066
            float r2 = o.C0293.m4188(r24)
            float r3 = o.C0293.m4188(r23)
            float r2 = r2 - r3
            if (r10 == 0) goto L_0x004d
            if (r26 != 0) goto L_0x0042
            float r2 = -r2
            r9.setTranslationZ(r2)
        L_0x0042:
            android.util.Property r2 = android.view.View.TRANSLATION_Z
            float[] r3 = new float[r8]
            r3[r7] = r15
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r9, r2, r3)
            goto L_0x0058
        L_0x004d:
            android.util.Property r3 = android.view.View.TRANSLATION_Z
            float[] r4 = new float[r8]
            float r2 = -r2
            r4[r7] = r2
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r9, r3, r4)
        L_0x0058:
            o.ɐı r3 = r11.f936
            java.lang.String r4 = "elevation"
            o.əı r3 = r3.m7460(r4)
            r3.m7543((android.animation.Animator) r2)
            r12.add(r2)
        L_0x0066:
            android.graphics.RectF r2 = r0.f923
            float r3 = r22.m1056(r23, r24)
            float r4 = r22.m1054((android.view.View) r23, (android.view.View) r24)
            android.util.Pair r5 = m1053(r3, r4, r10, r11)
            java.lang.Object r6 = r5.first
            o.əı r6 = (o.C1121) r6
            java.lang.Object r5 = r5.second
            o.əı r5 = (o.C1121) r5
            if (r10 == 0) goto L_0x00c6
            if (r26 != 0) goto L_0x0088
            float r14 = -r3
            r9.setTranslationX(r14)
            float r14 = -r4
            r9.setTranslationY(r14)
        L_0x0088:
            android.util.Property r14 = android.view.View.TRANSLATION_X
            r17 = r13
            float[] r13 = new float[r8]
            r13[r7] = r15
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r9, r14, r13)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            r18 = r13
            float[] r13 = new float[r8]
            r13[r7] = r15
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r9, r14, r13)
            float r3 = -r3
            float r4 = -r4
            float r3 = m1057(r11, r6, r3)
            float r4 = m1057(r11, r5, r4)
            android.graphics.Rect r14 = r0.f926
            r9.getWindowVisibleDisplayFrame(r14)
            android.graphics.RectF r15 = r0.f923
            r15.set(r14)
            android.graphics.RectF r14 = r0.f925
            r0.m1055((android.view.View) r9, (android.graphics.RectF) r14)
            r14.offset(r3, r4)
            r14.intersect(r15)
            r2.set(r14)
            r3 = r13
            r13 = r18
            goto L_0x00de
        L_0x00c6:
            r17 = r13
            android.util.Property r13 = android.view.View.TRANSLATION_X
            float[] r14 = new float[r8]
            float r3 = -r3
            r14[r7] = r3
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r9, r13, r14)
            android.util.Property r3 = android.view.View.TRANSLATION_Y
            float[] r14 = new float[r8]
            float r4 = -r4
            r14[r7] = r4
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r9, r3, r14)
        L_0x00de:
            r6.m7543((android.animation.Animator) r13)
            r5.m7543((android.animation.Animator) r3)
            r12.add(r13)
            r12.add(r3)
            float r3 = r2.width()
            float r2 = r2.height()
            float r4 = r22.m1056(r23, r24)
            float r5 = r22.m1054((android.view.View) r23, (android.view.View) r24)
            android.util.Pair r6 = m1053(r4, r5, r10, r11)
            java.lang.Object r13 = r6.first
            o.əı r13 = (o.C1121) r13
            java.lang.Object r6 = r6.second
            o.əı r6 = (o.C1121) r6
            android.util.Property r14 = android.view.View.TRANSLATION_X
            float[] r15 = new float[r8]
            if (r10 == 0) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            float r4 = r0.f928
        L_0x010f:
            r15[r7] = r4
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            float[] r15 = new float[r8]
            if (r10 == 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            float r5 = r0.f927
        L_0x011e:
            r15[r7] = r5
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            r13.m7543((android.animation.Animator) r4)
            r6.m7543((android.animation.Animator) r5)
            r12.add(r4)
            r12.add(r5)
            boolean r13 = r9 instanceof o.C1961
            if (r13 == 0) goto L_0x0187
            boolean r4 = r1 instanceof android.widget.ImageView
            if (r4 != 0) goto L_0x0139
            goto L_0x0187
        L_0x0139:
            r4 = r9
            o.ιƶ r4 = (o.C1961) r4
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.graphics.drawable.Drawable r5 = r5.getDrawable()
            if (r5 == 0) goto L_0x0187
            r5.mutate()
            r6 = 255(0xff, float:3.57E-43)
            if (r10 == 0) goto L_0x015c
            if (r26 != 0) goto L_0x0151
            r5.setAlpha(r6)
        L_0x0151:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r6 = o.C0955.f5951
            int[] r14 = new int[r8]
            r14[r7] = r7
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofInt(r5, r6, r14)
            goto L_0x0166
        L_0x015c:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r14 = o.C0955.f5951
            int[] r15 = new int[r8]
            r15[r7] = r6
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofInt(r5, r14, r15)
        L_0x0166:
            com.google.android.material.transformation.FabTransformationBehavior$3 r14 = new com.google.android.material.transformation.FabTransformationBehavior$3
            r14.<init>(r9)
            r6.addUpdateListener(r14)
            o.ɐı r14 = r11.f936
            java.lang.String r15 = "iconFade"
            o.əı r14 = r14.m7460(r15)
            r14.m7543((android.animation.Animator) r6)
            r12.add(r6)
            com.google.android.material.transformation.FabTransformationBehavior$1 r6 = new com.google.android.material.transformation.FabTransformationBehavior$1
            r6.<init>(r5)
            r14 = r17
            r14.add(r6)
            goto L_0x0189
        L_0x0187:
            r14 = r17
        L_0x0189:
            if (r13 == 0) goto L_0x028f
            r15 = r9
            o.ιƶ r15 = (o.C1961) r15
            android.graphics.RectF r4 = r0.f923
            android.graphics.RectF r5 = r0.f925
            r0.m1055((android.view.View) r1, (android.graphics.RectF) r4)
            float r6 = r0.f928
            float r8 = r0.f927
            r4.offset(r6, r8)
            r0.m1055((android.view.View) r9, (android.graphics.RectF) r5)
            float r6 = r22.m1056(r23, r24)
            float r6 = -r6
            r8 = 0
            r5.offset(r6, r8)
            float r4 = r4.centerX()
            float r5 = r5.left
            float r4 = r4 - r5
            android.graphics.RectF r5 = r0.f923
            android.graphics.RectF r6 = r0.f925
            r0.m1055((android.view.View) r1, (android.graphics.RectF) r5)
            float r8 = r0.f928
            float r7 = r0.f927
            r5.offset(r8, r7)
            r0.m1055((android.view.View) r9, (android.graphics.RectF) r6)
            float r7 = r22.m1054((android.view.View) r23, (android.view.View) r24)
            float r7 = -r7
            r8 = 0
            r6.offset(r8, r7)
            float r5 = r5.centerY()
            float r6 = r6.top
            float r5 = r5 - r6
            r6 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r6 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r6
            android.graphics.Rect r7 = r0.f926
            boolean r8 = o.C0293.m4186(r6)
            if (r8 == 0) goto L_0x01ed
            int r8 = r6.getWidth()
            int r1 = r6.getHeight()
            r19 = r13
            r13 = 0
            r7.set(r13, r13, r8, r1)
            r6.m991(r7)
            goto L_0x01f0
        L_0x01ed:
            r19 = r13
            r13 = 0
        L_0x01f0:
            android.graphics.Rect r1 = r0.f926
            int r1 = r1.width()
            float r1 = (float) r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r6
            o.ɐı r6 = r11.f936
            java.lang.String r7 = "expansion"
            o.əı r8 = r6.m7460(r7)
            if (r10 == 0) goto L_0x023c
            if (r26 != 0) goto L_0x020e
            o.ιƶ$ı r6 = new o.ιƶ$ı
            r6.<init>(r4, r5, r1)
            r15.setRevealInfo(r6)
        L_0x020e:
            if (r26 == 0) goto L_0x0216
            o.ιƶ$ı r1 = r15.C_()
            float r1 = r1.f9855
        L_0x0216:
            r7 = r1
            float r1 = o.C2745.m14524((float) r4, (float) r5, (float) r3, (float) r2)
            android.animation.Animator r1 = o.C1726.m9727(r15, r4, r5, r1)
            com.google.android.material.transformation.FabTransformationBehavior$2 r2 = new com.google.android.material.transformation.FabTransformationBehavior$2
            r2.<init>()
            r1.addListener(r2)
            long r2 = r8.f6630
            int r6 = (int) r4
            int r5 = (int) r5
            r3 = r2
            r2 = r24
            r16 = r5
            r5 = r6
            r6 = r16
            r13 = r8
            r0 = 1
            r8 = r12
            m1058(r2, r3, r5, r6, r7, r8)
            r21 = r11
            goto L_0x0280
        L_0x023c:
            r13 = r8
            r0 = 1
            o.ιƶ$ı r2 = r15.C_()
            float r7 = r2.f9855
            android.animation.Animator r17 = o.C1726.m9727(r15, r4, r5, r1)
            long r2 = r13.f6630
            int r8 = (int) r4
            int r6 = (int) r5
            r3 = r2
            r2 = r24
            r5 = r8
            r20 = r6
            r0 = r8
            r8 = r12
            m1058(r2, r3, r5, r6, r7, r8)
            long r2 = r13.f6630
            long r4 = r13.f6632
            o.ɐı r6 = r11.f936
            long r6 = r6.m7461()
            int r8 = android.os.Build.VERSION.SDK_INT
            r21 = r11
            r11 = 21
            if (r8 < r11) goto L_0x027e
            long r2 = r2 + r4
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x027e
            r4 = r20
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r9, r0, r4, r1, r1)
            r0.setStartDelay(r2)
            long r6 = r6 - r2
            r0.setDuration(r6)
            r12.add(r0)
        L_0x027e:
            r1 = r17
        L_0x0280:
            r13.m7543((android.animation.Animator) r1)
            r12.add(r1)
            o.ͱɹ$2 r0 = new o.ͱɹ$2
            r0.<init>(r15)
            r14.add(r0)
            goto L_0x0293
        L_0x028f:
            r21 = r11
            r19 = r13
        L_0x0293:
            if (r19 == 0) goto L_0x02e6
            r0 = r9
            o.ιƶ r0 = (o.C1961) r0
            android.content.res.ColorStateList r1 = o.C0293.m4158(r23)
            if (r1 == 0) goto L_0x02ab
            int[] r2 = r23.getDrawableState()
            int r3 = r1.getDefaultColor()
            int r7 = r1.getColorForState(r2, r3)
            goto L_0x02ac
        L_0x02ab:
            r7 = 0
        L_0x02ac:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r7
            if (r10 == 0) goto L_0x02c4
            if (r26 != 0) goto L_0x02b7
            r0.setCircularRevealScrimColor(r7)
        L_0x02b7:
            android.util.Property<o.ιƶ, java.lang.Integer> r2 = o.C1961.C1964.f9858
            r3 = 1
            int[] r4 = new int[r3]
            r5 = 0
            r4[r5] = r1
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r2, r4)
            goto L_0x02d0
        L_0x02c4:
            r3 = 1
            r5 = 0
            android.util.Property<o.ιƶ, java.lang.Integer> r1 = o.C1961.C1964.f9858
            int[] r2 = new int[r3]
            r2[r5] = r7
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r1, r2)
        L_0x02d0:
            o.ƶι r1 = o.C0807.f5286
            r0.setEvaluator(r1)
            r1 = r21
            o.ɐı r2 = r1.f936
            java.lang.String r3 = "color"
            o.əı r2 = r2.m7460(r3)
            r2.m7543((android.animation.Animator) r0)
            r12.add(r0)
            goto L_0x02e8
        L_0x02e6:
            r1 = r21
        L_0x02e8:
            boolean r0 = r9 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x035d
            if (r19 == 0) goto L_0x02f2
            int r2 = o.C1899.f9615
            if (r2 == 0) goto L_0x035d
        L_0x02f2:
            r2 = 2131362163(0x7f0a0173, float:1.8344099E38)
            android.view.View r2 = r9.findViewById(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0304
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0322
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x0322
        L_0x0304:
            boolean r2 = r9 instanceof o.C1454
            if (r2 != 0) goto L_0x0313
            boolean r2 = r9 instanceof o.C1586
            if (r2 == 0) goto L_0x030d
            goto L_0x0313
        L_0x030d:
            if (r0 == 0) goto L_0x0322
            r3 = r9
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x0322
        L_0x0313:
            r0 = r9
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2 = 0
            android.view.View r0 = r0.getChildAt(r2)
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0322
            r3 = r0
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x0322:
            if (r3 == 0) goto L_0x035d
            if (r10 == 0) goto L_0x0341
            if (r26 != 0) goto L_0x0332
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = o.C0803.f5282
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.set(r3, r2)
        L_0x0332:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = o.C0803.f5282
            r2 = 1
            float[] r2 = new float[r2]
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r2[r5] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r3, r0, r2)
            goto L_0x034e
        L_0x0341:
            r2 = 1
            r5 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = o.C0803.f5282
            float[] r2 = new float[r2]
            r4 = 0
            r2[r5] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r3, r0, r2)
        L_0x034e:
            o.ɐı r1 = r1.f936
            java.lang.String r2 = "contentFade"
            o.əı r1 = r1.m7460(r2)
            r1.m7543((android.animation.Animator) r0)
            r12.add(r0)
            goto L_0x035e
        L_0x035d:
            r5 = 0
        L_0x035e:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            o.C1460.m8726((android.animation.AnimatorSet) r0, (java.util.List<android.animation.Animator>) r12)
            com.google.android.material.transformation.FabTransformationBehavior$4 r1 = new com.google.android.material.transformation.FabTransformationBehavior$4
            r2 = r23
            r1.<init>(r10, r9, r2)
            r0.addListener(r1)
            int r1 = r14.size()
        L_0x0374:
            if (r5 >= r1) goto L_0x0382
            java.lang.Object r2 = r14.get(r5)
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r0.addListener(r2)
            int r5 = r5 + 1
            goto L_0x0374
        L_0x0382:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.m1060(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Pair<C1121, C1121> m1053(float f, float f2, boolean z, C0076 r4) {
        C1121 r2;
        C1121 r1;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            r1 = r4.f936.m7460("translationXLinear");
            r2 = r4.f936.m7460("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            r1 = r4.f936.m7460("translationXCurveDownwards");
            r2 = r4.f936.m7460("translationYCurveDownwards");
        } else {
            r1 = r4.f936.m7460("translationXCurveUpwards");
            r2 = r4.f936.m7460("translationYCurveUpwards");
        }
        return new Pair<>(r1, r2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private float m1056(View view, View view2) {
        RectF rectF = this.f923;
        RectF rectF2 = this.f925;
        m1055(view, rectF);
        rectF.offset(this.f928, this.f927);
        m1055(view2, rectF2);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private float m1054(View view, View view2) {
        RectF rectF = this.f923;
        RectF rectF2 = this.f925;
        m1055(view, rectF);
        rectF.offset(this.f928, this.f927);
        m1055(view2, rectF2);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m1055(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f924;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m1058(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$ǃ  reason: contains not printable characters */
    public static class C0076 {

        /* renamed from: ι  reason: contains not printable characters */
        public C1091 f936;

        protected C0076() {
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static float m1057(C0076 r8, C1121 r9, float f) {
        long j = r9.f6630;
        long j2 = r9.f6632;
        C1121 r82 = r8.f936.m7460("expansion");
        return f + ((r9.f6633 != null ? r9.f6633 : C1311.f7289).getInterpolation(((float) (((r82.f6630 + r82.f6632) + 17) - j)) / ((float) j2)) * (0.0f - f));
    }
}
