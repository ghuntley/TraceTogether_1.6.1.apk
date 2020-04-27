package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import o.C1976;

/* renamed from: o.ͻǃ  reason: contains not printable characters */
public final class C1737 extends C1976 {

    /* renamed from: ȷ  reason: contains not printable characters */
    private static final Property<View, PointF> f9000 = new Property<View, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C2300.m11982(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };

    /* renamed from: ɨ  reason: contains not printable characters */
    private static C1954 f9001 = new C1954();

    /* renamed from: ɪ  reason: contains not printable characters */
    private static final Property<View, PointF> f9002 = new Property<View, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C2300.m11982(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final Property<If, PointF> f9003 = new Property<If, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            If ifR = (If) obj;
            PointF pointF = (PointF) obj2;
            ifR.f9025 = Math.round(pointF.x);
            ifR.f9022 = Math.round(pointF.y);
            ifR.f9023++;
            if (ifR.f9023 == ifR.f9028) {
                ifR.m9793();
            }
        }
    };

    /* renamed from: ɾ  reason: contains not printable characters */
    private static final Property<View, PointF> f9004 = new Property<View, PointF>(PointF.class, "position") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C2300.m11982(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };

    /* renamed from: І  reason: contains not printable characters */
    private static final String[] f9005 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: і  reason: contains not printable characters */
    private static final Property<If, PointF> f9006 = new Property<If, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            If ifR = (If) obj;
            PointF pointF = (PointF) obj2;
            ifR.f9024 = Math.round(pointF.x);
            ifR.f9026 = Math.round(pointF.y);
            ifR.f9028++;
            if (ifR.f9023 == ifR.f9028) {
                ifR.m9793();
            }
        }
    };

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f9007 = false;

    static {
        new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {

            /* renamed from: ɩ  reason: contains not printable characters */
            private Rect f9011 = new Rect();

            public final /* synthetic */ Object get(Object obj) {
                ((Drawable) obj).copyBounds(this.f9011);
                return new PointF((float) this.f9011.left, (float) this.f9011.top);
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                Drawable drawable = (Drawable) obj;
                PointF pointF = (PointF) obj2;
                drawable.copyBounds(this.f9011);
                this.f9011.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
                drawable.setBounds(this.f9011);
            }
        };
    }

    public C1737() {
    }

    @SuppressLint({"RestrictedApi"})
    public C1737(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004.f9955);
        z = ((XmlResourceParser) attributeSet).getAttributeValue("http://schemas.android.com/apk/res/android", "resizeClip") != null ? obtainStyledAttributes.getBoolean(0, false) : z;
        obtainStyledAttributes.recycle();
        this.f9007 = z;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String[] m9786() {
        return f9005;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m9784(C2259 r8) {
        View view = r8.f10584;
        if (C0293.m4186(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            r8.f10585.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            r8.f10585.put("android:changeBounds:parent", r8.f10584.getParent());
            if (this.f9007) {
                r8.f10585.put("android:changeBounds:clip", C0293.m4171(view));
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9788(C2259 r1) {
        m9784(r1);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9785(C2259 r1) {
        m9784(r1);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Animator m9787(ViewGroup viewGroup, C2259 r21, C2259 r22) {
        int i;
        boolean z;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator2;
        ObjectAnimator objectAnimator3;
        ObjectAnimator objectAnimator4;
        ObjectAnimator objectAnimator5;
        C2259 r0 = r21;
        C2259 r1 = r22;
        if (r0 == null || r1 == null) {
            return null;
        }
        Map<String, Object> map = r0.f10585;
        Map<String, Object> map2 = r1.f10585;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = r1.f10584;
        Rect rect2 = (Rect) r0.f10585.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) r1.f10585.get("android:changeBounds:bounds");
        int i3 = rect2.left;
        int i4 = rect3.left;
        int i5 = rect2.top;
        int i6 = rect3.top;
        int i7 = rect2.right;
        int i8 = rect3.right;
        int i9 = rect2.bottom;
        int i10 = rect3.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        View view3 = view2;
        Rect rect4 = (Rect) r0.f10585.get("android:changeBounds:clip");
        Rect rect5 = (Rect) r1.f10585.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i = 0;
        } else {
            i = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (!(i7 == i8 && i9 == i10)) {
                i++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i++;
        }
        int i15 = i;
        if (i15 <= 0) {
            return null;
        }
        Rect rect6 = rect5;
        Rect rect7 = rect4;
        if (!this.f9007) {
            view = view3;
            C2300.m11982(view, i3, i5, i7, i9);
            if (i15 == 2) {
                if (i11 == i13 && i12 == i14) {
                    Path r12 = m10732().m10260((float) i3, (float) i5, (float) i4, (float) i6);
                    Property<View, PointF> property = f9004;
                    if (Build.VERSION.SDK_INT >= 21) {
                        animator = ObjectAnimator.ofObject(view, property, (TypeConverter) null, r12);
                    } else {
                        animator = ObjectAnimator.ofFloat(view, new C1952(property, r12), new float[]{0.0f, 1.0f});
                    }
                } else {
                    final If ifR = new If(view);
                    Path r2 = m10732().m10260((float) i3, (float) i5, (float) i4, (float) i6);
                    Property<If, PointF> property2 = f9003;
                    if (Build.VERSION.SDK_INT >= 21) {
                        objectAnimator4 = ObjectAnimator.ofObject(ifR, property2, (TypeConverter) null, r2);
                    } else {
                        objectAnimator4 = ObjectAnimator.ofFloat(ifR, new C1952(property2, r2), new float[]{0.0f, 1.0f});
                    }
                    Path r3 = m10732().m10260((float) i7, (float) i9, (float) i8, (float) i10);
                    Property<If, PointF> property3 = f9006;
                    if (Build.VERSION.SDK_INT >= 21) {
                        objectAnimator5 = ObjectAnimator.ofObject(ifR, property3, (TypeConverter) null, r3);
                    } else {
                        objectAnimator5 = ObjectAnimator.ofFloat(ifR, new C1952(property3, r3), new float[]{0.0f, 1.0f});
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{objectAnimator4, objectAnimator5});
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        private If mViewBounds = ifR;
                    });
                    animator = animatorSet;
                }
            } else if (i3 == i4 && i5 == i6) {
                Path r13 = m10732().m10260((float) i7, (float) i9, (float) i8, (float) i10);
                Property<View, PointF> property4 = f9002;
                if (Build.VERSION.SDK_INT >= 21) {
                    animator = ObjectAnimator.ofObject(view, property4, (TypeConverter) null, r13);
                } else {
                    animator = ObjectAnimator.ofFloat(view, new C1952(property4, r13), new float[]{0.0f, 1.0f});
                }
            } else {
                Path r14 = m10732().m10260((float) i3, (float) i5, (float) i4, (float) i6);
                Property<View, PointF> property5 = f9000;
                if (Build.VERSION.SDK_INT >= 21) {
                    animator = ObjectAnimator.ofObject(view, property5, (TypeConverter) null, r14);
                } else {
                    animator = ObjectAnimator.ofFloat(view, new C1952(property5, r14), new float[]{0.0f, 1.0f});
                }
            }
            z = true;
        } else {
            view = view3;
            C2300.m11982(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
            if (i3 == i4 && i5 == i6) {
                objectAnimator = null;
            } else {
                Path r15 = m10732().m10260((float) i3, (float) i5, (float) i4, (float) i6);
                Property<View, PointF> property6 = f9004;
                if (Build.VERSION.SDK_INT >= 21) {
                    objectAnimator3 = ObjectAnimator.ofObject(view, property6, (TypeConverter) null, r15);
                } else {
                    objectAnimator3 = ObjectAnimator.ofFloat(view, new C1952(property6, r15), new float[]{0.0f, 1.0f});
                }
                objectAnimator = objectAnimator3;
            }
            if (rect7 == null) {
                i2 = 0;
                rect = new Rect(0, 0, i11, i12);
            } else {
                i2 = 0;
                rect = rect7;
            }
            Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
            if (!rect.equals(rect8)) {
                C0293.m4149(view, rect);
                C1954 r23 = f9001;
                Object[] objArr = new Object[2];
                objArr[i2] = rect;
                objArr[1] = rect8;
                objectAnimator2 = ObjectAnimator.ofObject(view, "clipBounds", r23, objArr);
                final View view4 = view;
                final Rect rect9 = rect6;
                final int i16 = i4;
                final int i17 = i6;
                final int i18 = i8;
                z = true;
                final int i19 = i10;
                objectAnimator2.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: Ɩ  reason: contains not printable characters */
                    private boolean f9015;

                    public final void onAnimationCancel(Animator animator) {
                        this.f9015 = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (!this.f9015) {
                            C0293.m4149(view4, rect9);
                            C2300.m11982(view4, i16, i17, i18, i19);
                        }
                    }
                });
            } else {
                z = true;
                objectAnimator2 = null;
            }
            animator = C2112.m11266(objectAnimator, objectAnimator2);
        }
        if (view.getParent() instanceof ViewGroup) {
            final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C2235.m11686(viewGroup4, z);
            m10747((C1976.If) new C2169() {

                /* renamed from: ɩ  reason: contains not printable characters */
                private boolean f9008 = false;

                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m9789() {
                    C2235.m11686(viewGroup4, false);
                    this.f9008 = true;
                }

                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m9790(C1976 r3) {
                    if (!this.f9008) {
                        C2235.m11686(viewGroup4, false);
                    }
                    r3.m10741((C1976.If) this);
                }

                /* renamed from: ι  reason: contains not printable characters */
                public final void m9792() {
                    C2235.m11686(viewGroup4, false);
                }

                /* renamed from: Ι  reason: contains not printable characters */
                public final void m9791() {
                    C2235.m11686(viewGroup4, true);
                }
            });
        }
        return animator;
    }

    /* renamed from: o.ͻǃ$If */
    static class If {

        /* renamed from: ı  reason: contains not printable characters */
        int f9022;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f9023;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f9024;

        /* renamed from: Ι  reason: contains not printable characters */
        int f9025;

        /* renamed from: ι  reason: contains not printable characters */
        int f9026;

        /* renamed from: І  reason: contains not printable characters */
        private View f9027;

        /* renamed from: Ӏ  reason: contains not printable characters */
        int f9028;

        If(View view) {
            this.f9027 = view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m9793() {
            C2300.m11982(this.f9027, this.f9025, this.f9022, this.f9024, this.f9026);
            this.f9023 = 0;
            this.f9028 = 0;
        }
    }
}
