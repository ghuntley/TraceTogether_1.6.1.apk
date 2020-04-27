package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.List;
import o.C0293;
import o.C0328;
import o.C0344;
import o.C0501;
import o.C0520;
import o.C0806;
import o.C0824;
import o.C0827;
import o.C0858;
import o.C1266;
import o.C1311;
import o.C1400;
import o.C2449;
import o.C2724;
import o.C2850;
import o.C3160;
import o.C3198;
import o.R;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: ɨ  reason: contains not printable characters */
    private static final int[] f870 = {R.attr.f154262130969243};

    /* renamed from: ɩ  reason: contains not printable characters */
    static final Handler f871 = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).m1028();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                int i2 = message.arg1;
                ((BaseTransientBottomBar) message.obj).m1024();
                return true;
            }
        }
    });

    /* renamed from: ι  reason: contains not printable characters */
    static final boolean f872 = (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 19);

    /* renamed from: ı  reason: contains not printable characters */
    public final Context f873;

    /* renamed from: Ɩ  reason: contains not printable characters */
    int f874;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0075 f875;

    /* renamed from: ȷ  reason: contains not printable characters */
    private Rect f876;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final Runnable f877 = new Runnable() {
        public final void run() {
            if (BaseTransientBottomBar.this.f875 != null && BaseTransientBottomBar.this.f873 != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) BaseTransientBottomBar.this.f873.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                int r0 = (displayMetrics.heightPixels - BaseTransientBottomBar.m1017(BaseTransientBottomBar.this)) + ((int) BaseTransientBottomBar.this.f875.getTranslationY());
                if (r0 < BaseTransientBottomBar.this.f874) {
                    ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f875.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f874 - r0;
                        BaseTransientBottomBar.this.f875.requestLayout();
                    }
                }
            }
        }
    };

    /* renamed from: ɹ  reason: contains not printable characters */
    int f878;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final ViewGroup f879;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final AccessibilityManager f880;

    /* renamed from: Ι  reason: contains not printable characters */
    final C0806 f881;

    /* renamed from: І  reason: contains not printable characters */
    public C0824.C0826 f882 = new C0824.C0826() {
        /* renamed from: ι  reason: contains not printable characters */
        public final void m1031() {
            Handler handler = BaseTransientBottomBar.f871;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1030(int i) {
            Handler handler = BaseTransientBottomBar.f871;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    };

    /* renamed from: і  reason: contains not printable characters */
    int f883;

    /* renamed from: Ӏ  reason: contains not printable characters */
    int f884;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f885;

    public interface If {
        /* renamed from: ǃ  reason: contains not printable characters */
        void m1041();
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$ǃ  reason: contains not printable characters */
    public interface C0074 {
        /* renamed from: ǃ  reason: contains not printable characters */
        void m1042();

        /* renamed from: ι  reason: contains not printable characters */
        void m1043();
    }

    public BaseTransientBottomBar(ViewGroup viewGroup, View view, C0806 r8) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (r8 != null) {
            this.f879 = viewGroup;
            this.f881 = r8;
            this.f873 = viewGroup.getContext();
            C3160.m15973(this.f873, C3160.f14379, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(this.f873);
            TypedArray obtainStyledAttributes = this.f873.obtainStyledAttributes(f870);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            this.f875 = (C0075) from.inflate(resourceId != -1 ? R.layout.f169472131558497 : R.layout.f169032131558446, this.f879, false);
            if (view instanceof C0827) {
                C0827 r6 = (C0827) view;
                float f = this.f875.f910;
                if (f != 1.0f) {
                    r6.f5377.setTextColor(C2724.m14457(C0328.m4398(r6.getContext(), (int) R.attr.f150352130968822, r6.getClass().getCanonicalName()), r6.f5377.getCurrentTextColor(), f));
                }
            }
            this.f875.addView(view);
            ViewGroup.LayoutParams layoutParams = this.f875.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f876 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            C0293.m4177((View) this.f875, 1);
            C0293.m4203((View) this.f875, 1);
            C0293.m4200((View) this.f875, true);
            C0293.m4207((View) this.f875, (C2850) new C2850() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final C0501 m1035(View view, C0501 r3) {
                    BaseTransientBottomBar.this.f878 = r3.m4890();
                    BaseTransientBottomBar.this.f883 = r3.m4895();
                    BaseTransientBottomBar.this.f884 = r3.m4894();
                    BaseTransientBottomBar.this.m1019();
                    return r3;
                }
            });
            C0293.m4151((View) this.f875, (C2449) new C2449() {
                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m1032(View view, C0520 r2) {
                    super.m12579(view, r2);
                    r2.m5030(1048576);
                    r2.m5042(true);
                }

                /* renamed from: ǃ  reason: contains not printable characters */
                public final boolean m1033(View view, int i, Bundle bundle) {
                    if (i != 1048576) {
                        return super.m12580(view, i, bundle);
                    }
                    BaseTransientBottomBar.this.m1023();
                    return true;
                }
            });
            this.f880 = (AccessibilityManager) this.f873.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (((r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0016) && (((androidx.coordinatorlayout.widget.CoordinatorLayout.C0016) r0).f162 instanceof com.google.android.material.behavior.SwipeDismissBehavior)) != false) goto L_0x0054;
     */
    /* renamed from: ɹ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1019() {
        /*
            r4 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$ɩ r0 = r4.f875
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0064
            android.graphics.Rect r1 = r4.f876
            if (r1 != 0) goto L_0x000f
            goto L_0x0064
        L_0x000f:
            int r2 = r4.f878
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r1.bottom
            int r1 = r1 + r2
            r0.bottomMargin = r1
            android.graphics.Rect r1 = r4.f876
            int r1 = r1.left
            int r2 = r4.f883
            int r1 = r1 + r2
            r0.leftMargin = r1
            android.graphics.Rect r1 = r4.f876
            int r1 = r1.right
            int r2 = r4.f884
            int r1 = r1 + r2
            r0.rightMargin = r1
            com.google.android.material.snackbar.BaseTransientBottomBar$ɩ r0 = r4.f875
            r0.requestLayout()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0064
            int r0 = r4.f874
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0053
            com.google.android.material.snackbar.BaseTransientBottomBar$ɩ r0 = r4.f875
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r3 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0016
            if (r3 == 0) goto L_0x004f
            androidx.coordinatorlayout.widget.CoordinatorLayout$ɩ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0016) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$If r0 = r0.f162
            boolean r0 = r0 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r0 == 0) goto L_0x004f
            r0 = 1
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            if (r1 == 0) goto L_0x0064
            com.google.android.material.snackbar.BaseTransientBottomBar$ɩ r0 = r4.f875
            java.lang.Runnable r1 = r4.f877
            r0.removeCallbacks(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$ɩ r0 = r4.f875
            java.lang.Runnable r1 = r4.f877
            r0.post(r1)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.m1019():void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final B m1026() {
        this.f885 = -2;
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public int m1027() {
        return this.f885;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m1028() {
        this.f875.f911 = new Object() {
            /* renamed from: ι  reason: contains not printable characters */
            public final void m1037() {
                WindowInsets rootWindowInsets;
                if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f875.getRootWindowInsets()) != null) {
                    BaseTransientBottomBar.this.f874 = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    BaseTransientBottomBar.this.m1019();
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m1036() {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                if (C0824.f5366 == null) {
                    C0824.f5366 = new C0824();
                }
                if (C0824.f5366.m6248(baseTransientBottomBar.f882)) {
                    BaseTransientBottomBar.f871.post(this);
                }
            }

            public final void run() {
                BaseTransientBottomBar.this.m1029();
            }
        };
        if (this.f875.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f875.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0016) {
                CoordinatorLayout.C0016 r0 = (CoordinatorLayout.C0016) layoutParams;
                Behavior behavior = new Behavior();
                behavior.f905.f906 = this.f882;
                behavior.f657 = new SwipeDismissBehavior.C0062() {
                    /* renamed from: ɩ  reason: contains not printable characters */
                    public final void m1039(View view) {
                        view.setVisibility(8);
                        BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                        if (C0824.f5366 == null) {
                            C0824.f5366 = new C0824();
                        }
                        C0824.f5366.m6252(baseTransientBottomBar.f882, 0);
                    }

                    /* renamed from: ɩ  reason: contains not printable characters */
                    public final void m1038(int i) {
                        if (i == 0) {
                            if (C0824.f5366 == null) {
                                C0824.f5366 = new C0824();
                            }
                            C0824.f5366.m6245(BaseTransientBottomBar.this.f882);
                        } else if (i == 1 || i == 2) {
                            if (C0824.f5366 == null) {
                                C0824.f5366 = new C0824();
                            }
                            C0824.f5366.m6249(BaseTransientBottomBar.this.f882);
                        }
                    }
                };
                r0.m157(behavior);
                r0.f176 = 80;
            }
            m1019();
            this.f875.setVisibility(4);
            this.f879.addView(this.f875);
        }
        if (C0293.m4186(this.f875)) {
            boolean z = true;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f880.getEnabledAccessibilityServiceList(1);
            if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
                z = false;
            }
            if (z) {
                this.f875.post(new Runnable() {
                    public final void run() {
                        if (BaseTransientBottomBar.this.f875 != null) {
                            BaseTransientBottomBar.this.f875.setVisibility(0);
                            if (BaseTransientBottomBar.this.f875.f913 == 1) {
                                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                                ofFloat.setInterpolator(C1311.f7290);
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        BaseTransientBottomBar.this.f875.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    }
                                });
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                                ofFloat2.setInterpolator(C1311.f7291);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        BaseTransientBottomBar.this.f875.setScaleX(floatValue);
                                        BaseTransientBottomBar.this.f875.setScaleY(floatValue);
                                    }
                                });
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                                animatorSet.setDuration(150);
                                animatorSet.addListener(new AnimatorListenerAdapter() {
                                    public final void onAnimationEnd(Animator animator) {
                                        BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                                        if (C0824.f5366 == null) {
                                            C0824.f5366 = new C0824();
                                        }
                                        C0824.f5366.m6251(baseTransientBottomBar.f882);
                                    }
                                });
                                animatorSet.start();
                                return;
                            }
                            BaseTransientBottomBar.m1021(BaseTransientBottomBar.this);
                        }
                    }
                });
                return;
            }
            this.f875.setVisibility(0);
            if (C0824.f5366 == null) {
                C0824.f5366 = new C0824();
            }
            C0824.f5366.m6251(this.f882);
            return;
        }
        this.f875.f908 = new If() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m1034() {
                BaseTransientBottomBar.this.f875.f908 = null;
                BaseTransientBottomBar.m1018(BaseTransientBottomBar.this);
            }
        };
    }

    /* renamed from: і  reason: contains not printable characters */
    private int m1022() {
        int height = this.f875.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f875.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$ɩ  reason: contains not printable characters */
    public static class C0075 extends FrameLayout {

        /* renamed from: ι  reason: contains not printable characters */
        private static final View.OnTouchListener f907 = new View.OnTouchListener() {
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        If f908;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private PorterDuff.Mode f909;

        /* renamed from: ǃ  reason: contains not printable characters */
        final float f910;

        /* renamed from: ɩ  reason: contains not printable characters */
        C0074 f911;

        /* renamed from: ɹ  reason: contains not printable characters */
        private ColorStateList f912;

        /* renamed from: Ι  reason: contains not printable characters */
        int f913;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private final float f914;

        public C0075(Context context) {
            this(context, (AttributeSet) null);
        }

        public C0075(Context context, AttributeSet attributeSet) {
            super(C1400.m8576(context, attributeSet, 0, 0), attributeSet);
            Drawable drawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C0858.Aux.f5608);
            if (obtainStyledAttributes.hasValue(6)) {
                C0293.m4163((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f913 = obtainStyledAttributes.getInt(2, 0);
            this.f914 = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(C0344.m4473(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(C3198.m16133(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f910 = obtainStyledAttributes.getFloat(1, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f907);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.f159312131165499);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(C2724.m14457(C0328.m4398(getContext(), (int) R.attr.f150352130968822, getClass().getCanonicalName()), C0328.m4398(getContext(), (int) R.attr.f150292130968813, getClass().getCanonicalName()), this.f914));
                if (this.f912 != null) {
                    drawable = C1266.m8158(gradientDrawable);
                    C1266.m8152(drawable, this.f912);
                } else {
                    drawable = C1266.m8158(gradientDrawable);
                }
                C0293.m4199((View) this, drawable);
            }
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f912 == null)) {
                drawable = C1266.m8158(drawable.mutate());
                C1266.m8152(drawable, this.f912);
                C1266.m8153(drawable, this.f909);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f912 = colorStateList;
            if (getBackground() != null) {
                Drawable r0 = C1266.m8158(getBackground().mutate());
                C1266.m8152(r0, colorStateList);
                C1266.m8153(r0, this.f909);
                if (r0 != getBackground()) {
                    super.setBackgroundDrawable(r0);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f909 = mode;
            if (getBackground() != null) {
                Drawable r0 = C1266.m8158(getBackground().mutate());
                C1266.m8153(r0, mode);
                if (r0 != getBackground()) {
                    super.setBackgroundDrawable(r0);
                }
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f907);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            If ifR = this.f908;
            if (ifR != null) {
                ifR.m1041();
            }
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C0074 r0 = this.f911;
            if (r0 != null) {
                r0.m1043();
            }
            C0293.m4154(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C0074 r0 = this.f911;
            if (r0 != null) {
                r0.m1042();
            }
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: І  reason: contains not printable characters */
        final C0073 f905 = new C0073(this);

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C0073 r0 = this.f905;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    if (C0824.f5366 == null) {
                        C0824.f5366 = new C0824();
                    }
                    C0824.f5366.m6245(r0.f906);
                }
            } else if (coordinatorLayout.m143(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                if (C0824.f5366 == null) {
                    C0824.f5366 = new C0824();
                }
                C0824.f5366.m6249(r0.f906);
            }
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m1040(View view) {
            return view instanceof C0075;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$ı  reason: contains not printable characters */
    public static class C0073 {

        /* renamed from: Ι  reason: contains not printable characters */
        C0824.C0826 f906;

        public C0073(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.f656 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f655 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f652 = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0076 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0078  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1025() {
        /*
            r7 = this;
            o.ƾΙ r0 = o.C0824.f5366
            if (r0 != 0) goto L_0x000b
            o.ƾΙ r0 = new o.ƾΙ
            r0.<init>()
            o.C0824.f5366 = r0
        L_0x000b:
            o.ƾΙ r0 = o.C0824.f5366
            int r1 = r7.m1027()
            o.ƾΙ$ɩ r2 = r7.f882
            java.lang.Object r3 = r0.f5368
            monitor-enter(r3)
            o.ƾΙ$ı r4 = r0.f5369     // Catch:{ all -> 0x0080 }
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x002f
            o.ƾΙ$ı r4 = r0.f5369     // Catch:{ all -> 0x0080 }
            if (r2 == 0) goto L_0x002a
            java.lang.ref.WeakReference<o.ƾΙ$ɩ> r4 = r4.f5373     // Catch:{ all -> 0x0080 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0080 }
            if (r4 != r2) goto L_0x002a
            r4 = 1
            goto L_0x002b
        L_0x002a:
            r4 = 0
        L_0x002b:
            if (r4 == 0) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r4 == 0) goto L_0x0044
            o.ƾΙ$ı r2 = r0.f5369     // Catch:{ all -> 0x0080 }
            r2.f5371 = r1     // Catch:{ all -> 0x0080 }
            android.os.Handler r1 = r0.f5367     // Catch:{ all -> 0x0080 }
            o.ƾΙ$ı r2 = r0.f5369     // Catch:{ all -> 0x0080 }
            r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x0080 }
            o.ƾΙ$ı r1 = r0.f5369     // Catch:{ all -> 0x0080 }
            r0.m6244((o.C0824.C0825) r1)     // Catch:{ all -> 0x0080 }
            monitor-exit(r3)     // Catch:{ all -> 0x0080 }
            return
        L_0x0044:
            o.ƾΙ$ı r4 = r0.f5370     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x005a
            o.ƾΙ$ı r4 = r0.f5370     // Catch:{ all -> 0x0080 }
            if (r2 == 0) goto L_0x0056
            java.lang.ref.WeakReference<o.ƾΙ$ɩ> r4 = r4.f5373     // Catch:{ all -> 0x0080 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0080 }
            if (r4 != r2) goto L_0x0056
            r4 = 1
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r4 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r5 = 0
        L_0x005b:
            if (r5 == 0) goto L_0x0062
            o.ƾΙ$ı r2 = r0.f5370     // Catch:{ all -> 0x0080 }
            r2.f5371 = r1     // Catch:{ all -> 0x0080 }
            goto L_0x0069
        L_0x0062:
            o.ƾΙ$ı r4 = new o.ƾΙ$ı     // Catch:{ all -> 0x0080 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0080 }
            r0.f5370 = r4     // Catch:{ all -> 0x0080 }
        L_0x0069:
            o.ƾΙ$ı r1 = r0.f5369     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x0078
            o.ƾΙ$ı r1 = r0.f5369     // Catch:{ all -> 0x0080 }
            r2 = 4
            boolean r1 = r0.m6247(r1, r2)     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x0078
            monitor-exit(r3)     // Catch:{ all -> 0x0080 }
            return
        L_0x0078:
            r1 = 0
            r0.f5369 = r1     // Catch:{ all -> 0x0080 }
            r0.m6250()     // Catch:{ all -> 0x0080 }
            monitor-exit(r3)     // Catch:{ all -> 0x0080 }
            return
        L_0x0080:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.m1025():void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m1023() {
        if (C0824.f5366 == null) {
            C0824.f5366 = new C0824();
        }
        C0824.f5366.m6252(this.f882, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m1024() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f880.getEnabledAccessibilityServiceList(1);
        if (!(enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) || this.f875.getVisibility() != 0) {
            m1029();
        } else if (this.f875.f913 == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.setInterpolator(C1311.f7290);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BaseTransientBottomBar.this.f875.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ofFloat.setDuration(75);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    BaseTransientBottomBar.this.m1029();
                }
            });
            ofFloat.start();
        } else {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{0, m1022()});
            valueAnimator.setInterpolator(C1311.f7289);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    BaseTransientBottomBar.this.f881.m6201();
                }

                public final void onAnimationEnd(Animator animator) {
                    BaseTransientBottomBar.this.m1029();
                }
            });
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: ǃ  reason: contains not printable characters */
                private int f901 = 0;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (BaseTransientBottomBar.f872) {
                        C0293.m4164((View) BaseTransientBottomBar.this.f875, intValue - this.f901);
                    } else {
                        BaseTransientBottomBar.this.f875.setTranslationY((float) intValue);
                    }
                    this.f901 = intValue;
                }
            });
            valueAnimator.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m1029() {
        if (C0824.f5366 == null) {
            C0824.f5366 = new C0824();
        }
        C0824.f5366.m6246(this.f882);
        ViewParent parent = this.f875.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f875);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static /* synthetic */ int m1017(BaseTransientBottomBar baseTransientBottomBar) {
        int[] iArr = new int[2];
        baseTransientBottomBar.f875.getLocationOnScreen(iArr);
        return iArr[1] + baseTransientBottomBar.f875.getHeight();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static /* synthetic */ void m1018(BaseTransientBottomBar baseTransientBottomBar) {
        boolean z = true;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = baseTransientBottomBar.f880.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            z = false;
        }
        if (z) {
            baseTransientBottomBar.f875.post(new Runnable() {
                public final void run() {
                    if (BaseTransientBottomBar.this.f875 != null) {
                        BaseTransientBottomBar.this.f875.setVisibility(0);
                        if (BaseTransientBottomBar.this.f875.f913 == 1) {
                            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                            ofFloat.setInterpolator(C1311.f7290);
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    BaseTransientBottomBar.this.f875.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                }
                            });
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                            ofFloat2.setInterpolator(C1311.f7291);
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    BaseTransientBottomBar.this.f875.setScaleX(floatValue);
                                    BaseTransientBottomBar.this.f875.setScaleY(floatValue);
                                }
                            });
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                            animatorSet.setDuration(150);
                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                public final void onAnimationEnd(Animator animator) {
                                    BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                                    if (C0824.f5366 == null) {
                                        C0824.f5366 = new C0824();
                                    }
                                    C0824.f5366.m6251(baseTransientBottomBar.f882);
                                }
                            });
                            animatorSet.start();
                            return;
                        }
                        BaseTransientBottomBar.m1021(BaseTransientBottomBar.this);
                    }
                }
            });
            return;
        }
        baseTransientBottomBar.f875.setVisibility(0);
        if (C0824.f5366 == null) {
            C0824.f5366 = new C0824();
        }
        C0824.f5366.m6251(baseTransientBottomBar.f882);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static /* synthetic */ void m1021(BaseTransientBottomBar baseTransientBottomBar) {
        final int r0 = baseTransientBottomBar.m1022();
        if (f872) {
            C0293.m4164((View) baseTransientBottomBar.f875, r0);
        } else {
            baseTransientBottomBar.f875.setTranslationY((float) r0);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{r0, 0});
        valueAnimator.setInterpolator(C1311.f7289);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f881.m6200();
            }

            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                if (C0824.f5366 == null) {
                    C0824.f5366 = new C0824();
                }
                C0824.f5366.m6251(baseTransientBottomBar.f882);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: ι  reason: contains not printable characters */
            private int f900 = r0;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f872) {
                    C0293.m4164((View) BaseTransientBottomBar.this.f875, intValue - this.f900);
                } else {
                    BaseTransientBottomBar.this.f875.setTranslationY((float) intValue);
                }
                this.f900 = intValue;
            }
        });
        valueAnimator.start();
    }
}
