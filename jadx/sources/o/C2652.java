package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C3156;

/* renamed from: o.ѳı  reason: contains not printable characters */
public class C2652 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: ſ  reason: contains not printable characters */
    static final int[] f12147 = {16842919, 16842910};

    /* renamed from: Ɨ  reason: contains not printable characters */
    static final int[] f12148 = {16842908, 16842910};

    /* renamed from: ƚ  reason: contains not printable characters */
    static final int[] f12149 = {16843623, 16842910};

    /* renamed from: ǀ  reason: contains not printable characters */
    static final int[] f12150 = {16842910};

    /* renamed from: ɟ  reason: contains not printable characters */
    static final int[] f12151 = new int[0];

    /* renamed from: ʅ  reason: contains not printable characters */
    static final int[] f12152 = {16843623, 16842908, 16842910};

    /* renamed from: ι  reason: contains not printable characters */
    static final TimeInterpolator f12153 = C1311.f7288;

    /* renamed from: ı  reason: contains not printable characters */
    Drawable f12154;

    /* renamed from: ŀ  reason: contains not printable characters */
    public ArrayList<Animator.AnimatorListener> f12155;

    /* renamed from: ł  reason: contains not printable characters */
    int f12156 = 0;

    /* renamed from: Ɩ  reason: contains not printable characters */
    Drawable f12157;

    /* renamed from: ǃ  reason: contains not printable characters */
    public C2737 f12158;

    /* renamed from: ȷ  reason: contains not printable characters */
    public C1091 f12159;

    /* renamed from: ɍ  reason: contains not printable characters */
    public ArrayList<C2654> f12160;

    /* renamed from: ɔ  reason: contains not printable characters */
    public final Matrix f12161 = new Matrix();

    /* renamed from: ɨ  reason: contains not printable characters */
    public int f12162;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C0671 f12163;

    /* renamed from: ɪ  reason: contains not printable characters */
    public float f12164;

    /* renamed from: ɭ  reason: contains not printable characters */
    private final Rect f12165 = new Rect();

    /* renamed from: ɹ  reason: contains not printable characters */
    public float f12166;

    /* renamed from: ɺ  reason: contains not printable characters */
    public final FloatingActionButton f12167;

    /* renamed from: ɼ  reason: contains not printable characters */
    final C0429 f12168;

    /* renamed from: ɾ  reason: contains not printable characters */
    Animator f12169;

    /* renamed from: ɿ  reason: contains not printable characters */
    public float f12170 = 1.0f;

    /* renamed from: ʟ  reason: contains not printable characters */
    public ArrayList<Animator.AnimatorListener> f12171;

    /* renamed from: ͻ  reason: contains not printable characters */
    private final C3156 f12172;

    /* renamed from: Ι  reason: contains not printable characters */
    C0785 f12173;

    /* renamed from: ϲ  reason: contains not printable characters */
    private C1091 f12174;

    /* renamed from: ϳ  reason: contains not printable characters */
    private float f12175;

    /* renamed from: І  reason: contains not printable characters */
    public boolean f12176;

    /* renamed from: Ј  reason: contains not printable characters */
    public ViewTreeObserver.OnPreDrawListener f12177;

    /* renamed from: г  reason: contains not printable characters */
    public int f12178;

    /* renamed from: с  reason: contains not printable characters */
    private C1091 f12179;

    /* renamed from: т  reason: contains not printable characters */
    private final RectF f12180 = new RectF();

    /* renamed from: і  reason: contains not printable characters */
    public boolean f12181 = true;

    /* renamed from: ґ  reason: contains not printable characters */
    private final RectF f12182 = new RectF();

    /* renamed from: Ӏ  reason: contains not printable characters */
    public float f12183;

    /* renamed from: ӏ  reason: contains not printable characters */
    public C1091 f12184;

    /* renamed from: o.ѳı$ı  reason: contains not printable characters */
    public interface C2653 {
        /* renamed from: ǃ  reason: contains not printable characters */
        void m14053();

        /* renamed from: ι  reason: contains not printable characters */
        void m14054();
    }

    /* renamed from: o.ѳı$ǃ  reason: contains not printable characters */
    public interface C2654 {
        /* renamed from: ɩ  reason: contains not printable characters */
        void m14055();

        /* renamed from: ι  reason: contains not printable characters */
        void m14056();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public boolean m14038() {
        return true;
    }

    /* renamed from: І  reason: contains not printable characters */
    public boolean m14044() {
        return true;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public void m14046() {
    }

    public C2652(FloatingActionButton floatingActionButton, C0429 r4) {
        this.f12167 = floatingActionButton;
        this.f12168 = r4;
        this.f12172 = new C3156();
        C3156 r3 = this.f12172;
        int[] iArr = f12147;
        ValueAnimator r0 = m14020((IF) new C3651If());
        C3156.If ifR = new C3156.If(iArr, r0);
        r0.addListener(r3.f14370);
        r3.f14367.add(ifR);
        C3156 r32 = this.f12172;
        int[] iArr2 = f12152;
        ValueAnimator r02 = m14020((IF) new C2655());
        C3156.If ifR2 = new C3156.If(iArr2, r02);
        r02.addListener(r32.f14370);
        r32.f14367.add(ifR2);
        C3156 r33 = this.f12172;
        int[] iArr3 = f12148;
        ValueAnimator r03 = m14020((IF) new C2655());
        C3156.If ifR3 = new C3156.If(iArr3, r03);
        r03.addListener(r33.f14370);
        r33.f14367.add(ifR3);
        C3156 r34 = this.f12172;
        int[] iArr4 = f12149;
        ValueAnimator r04 = m14020((IF) new C2655());
        C3156.If ifR4 = new C3156.If(iArr4, r04);
        r04.addListener(r34.f14370);
        r34.f14367.add(ifR4);
        C3156 r35 = this.f12172;
        int[] iArr5 = f12150;
        ValueAnimator r05 = m14020((IF) new aux());
        C3156.If ifR5 = new C3156.If(iArr5, r05);
        r05.addListener(r35.f14370);
        r35.f14367.add(ifR5);
        C3156 r36 = this.f12172;
        int[] iArr6 = f12151;
        ValueAnimator r06 = m14020((IF) new Cif(this));
        C3156.If ifR6 = new C3156.If(iArr6, r06);
        r06.addListener(r36.f14370);
        r36.f14367.add(ifR6);
        this.f12175 = this.f12167.getRotation();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m14027(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        this.f12163 = m14030();
        this.f12163.setTintList(colorStateList);
        if (mode != null) {
            this.f12163.setTintMode(mode);
        }
        this.f12163.m5531();
        C0671 r2 = this.f12163;
        Context context = this.f12167.getContext();
        r2.f4785.f4812 = new C2610(context);
        r2.m5521();
        C0385 r22 = new C0385(this.f12163.f4785.f4796);
        r22.setTintList(C0410.m4695(colorStateList2));
        this.f12154 = r22;
        Drawable[] drawableArr = new Drawable[2];
        C0671 r5 = this.f12163;
        if (r5 != null) {
            drawableArr[0] = r5;
            drawableArr[1] = r22;
            this.f12157 = new LayerDrawable(drawableArr);
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m14026(ColorStateList colorStateList) {
        Drawable drawable = this.f12154;
        if (drawable != null) {
            C1266.m8152(drawable, C0410.m4695(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public float m14041() {
        return this.f12166;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14032(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f12167.getDrawable();
        if (drawable != null && this.f12178 != 0) {
            RectF rectF = this.f12180;
            RectF rectF2 = this.f12182;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f12178;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f12178;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14033(C0785 r3) {
        this.f12173 = r3;
        C0671 r0 = this.f12163;
        if (r0 != null) {
            r0.setShapeAppearanceModel(r3);
        }
        Drawable drawable = this.f12154;
        if (drawable instanceof C0710) {
            ((C0710) drawable).setShapeAppearanceModel(r3);
        }
        C2737 r02 = this.f12158;
        if (r02 != null) {
            r02.f12748 = r3;
            r02.invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m14034() {
        if (!this.f12176) {
            return true;
        }
        FloatingActionButton floatingActionButton = this.f12167;
        return floatingActionButton.m992(floatingActionButton.f857) >= this.f12162;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m14031(float f, float f2, float f3) {
        m14045();
        C0671 r2 = this.f12163;
        if (r2 != null && r2.f4785.f4803 != f) {
            r2.f4785.f4803 = f;
            r2.m5521();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14037(float f) {
        C0671 r0 = this.f12163;
        if (r0 != null && r0.f4785.f4803 != f) {
            r0.f4785.f4803 = f;
            r0.m5521();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m14029(int[] iArr) {
        C3156.If ifR;
        C3156 r0 = this.f12172;
        int size = r0.f14367.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ifR = null;
                break;
            }
            ifR = r0.f14367.get(i);
            if (StateSet.stateSetMatches(ifR.f14373, iArr)) {
                break;
            }
            i++;
        }
        if (ifR != r0.f14368) {
            if (!(r0.f14368 == null || r0.f14369 == null)) {
                r0.f14369.cancel();
                r0.f14369 = null;
            }
            r0.f14368 = ifR;
            if (ifR != null) {
                r0.f14369 = ifR.f14372;
                r0.f14369.start();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m14036() {
        C3156 r0 = this.f12172;
        if (r0.f14369 != null) {
            r0.f14369.end();
            r0.f14369 = null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m14043(final C2653 r3, final boolean z) {
        if (!m14039()) {
            Animator animator = this.f12169;
            if (animator != null) {
                animator.cancel();
            }
            if (C0293.m4186(this.f12167) && !this.f12167.isInEditMode()) {
                C1091 r0 = this.f12184;
                if (r0 == null) {
                    r0 = m14021();
                }
                AnimatorSet r02 = m14022(r0, 0.0f, 0.0f, 0.0f);
                r02.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: ι  reason: contains not printable characters */
                    private boolean f12193;

                    public final void onAnimationStart(Animator animator) {
                        C2652.this.f12167.m16155(0, z);
                        C2652 r0 = C2652.this;
                        r0.f12156 = 1;
                        r0.f12169 = animator;
                        this.f12193 = false;
                    }

                    public final void onAnimationCancel(Animator animator) {
                        this.f12193 = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        C2652 r3 = C2652.this;
                        r3.f12156 = 0;
                        r3.f12169 = null;
                        if (!this.f12193) {
                            r3.f12167.m16155(z ? 8 : 4, z);
                            C2653 r32 = r3;
                            if (r32 != null) {
                                r32.m14054();
                            }
                        }
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = this.f12155;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        r02.addListener(it.next());
                    }
                }
                r02.start();
                return;
            }
            this.f12167.m16155(z ? 8 : 4, z);
            if (r3 != null) {
                r3.m14054();
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m14028(final C2653 r4, final boolean z) {
        if (!m14047()) {
            Animator animator = this.f12169;
            if (animator != null) {
                animator.cancel();
            }
            if (C0293.m4186(this.f12167) && !this.f12167.isInEditMode()) {
                if (this.f12167.getVisibility() != 0) {
                    this.f12167.setAlpha(0.0f);
                    this.f12167.setScaleY(0.0f);
                    this.f12167.setScaleX(0.0f);
                    this.f12170 = 0.0f;
                    Matrix matrix = this.f12161;
                    m14032(0.0f, matrix);
                    this.f12167.setImageMatrix(matrix);
                }
                C1091 r0 = this.f12159;
                if (r0 == null) {
                    r0 = m14023();
                }
                AnimatorSet r02 = m14022(r0, 1.0f, 1.0f, 1.0f);
                r02.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                        C2652.this.f12167.m16155(0, z);
                        C2652 r0 = C2652.this;
                        r0.f12156 = 2;
                        r0.f12169 = animator;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        C2652 r2 = C2652.this;
                        r2.f12156 = 0;
                        r2.f12169 = null;
                        C2653 r22 = r4;
                        if (r22 != null) {
                            r22.m14053();
                        }
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = this.f12171;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        r02.addListener(it.next());
                    }
                }
                r02.start();
                return;
            }
            this.f12167.m16155(0, z);
            this.f12167.setAlpha(1.0f);
            this.f12167.setScaleY(1.0f);
            this.f12167.setScaleX(1.0f);
            this.f12170 = 1.0f;
            Matrix matrix2 = this.f12161;
            m14032(1.0f, matrix2);
            this.f12167.setImageMatrix(matrix2);
            if (r4 != null) {
                r4.m14053();
            }
        }
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    private C1091 m14023() {
        if (this.f12179 == null) {
            this.f12179 = C1091.m7459(this.f12167.getContext(), R.animator.f147962130837506);
        }
        C1091 r0 = this.f12179;
        if (r0 != null) {
            return r0;
        }
        throw new NullPointerException();
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    private C1091 m14021() {
        if (this.f12174 == null) {
            this.f12174 = C1091.m7459(this.f12167.getContext(), R.animator.f147952130837505);
        }
        C1091 r0 = this.f12174;
        if (r0 != null) {
            return r0;
        }
        throw new NullPointerException();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private AnimatorSet m14022(C1091 r8, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f12167, View.ALPHA, new float[]{f});
        r8.m7460("opacity").m7543((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f12167, View.SCALE_X, new float[]{f2});
        r8.m7460("scale").m7543((Animator) ofFloat2);
        if (Build.VERSION.SDK_INT == 26) {
            ofFloat2.setEvaluator(new TypeEvaluator<Float>() {

                /* renamed from: Ι  reason: contains not printable characters */
                private FloatEvaluator f12188 = new FloatEvaluator();

                public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
                    float floatValue = this.f12188.evaluate(f, (Float) obj, (Float) obj2).floatValue();
                    if (floatValue < 0.1f) {
                        floatValue = 0.0f;
                    }
                    return Float.valueOf(floatValue);
                }
            });
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f12167, View.SCALE_Y, new float[]{f2});
        r8.m7460("scale").m7543((Animator) ofFloat3);
        if (Build.VERSION.SDK_INT == 26) {
            ofFloat3.setEvaluator(new TypeEvaluator<Float>() {

                /* renamed from: Ι  reason: contains not printable characters */
                private FloatEvaluator f12188 = new FloatEvaluator();

                public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
                    float floatValue = this.f12188.evaluate(f, (Float) obj, (Float) obj2).floatValue();
                    if (floatValue < 0.1f) {
                        floatValue = 0.0f;
                    }
                    return Float.valueOf(floatValue);
                }
            });
        }
        arrayList.add(ofFloat3);
        m14032(f3, this.f12161);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f12167, new C1092(), new C1089() {
            public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
                C2652.this.f12170 = f;
                return super.evaluate(f, (Matrix) obj, (Matrix) obj2);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final Matrix m14048(float f, Matrix matrix, Matrix matrix2) {
                C2652.this.f12170 = f;
                return super.evaluate(f, matrix, matrix2);
            }
        }, new Matrix[]{new Matrix(this.f12161)});
        r8.m7460("iconScale").m7543((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C1460.m8726(animatorSet, (List<Animator>) arrayList);
        return animatorSet;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m14025() {
        ArrayList<C2654> arrayList = this.f12160;
        if (arrayList != null) {
            Iterator<C2654> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m14056();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14040() {
        ArrayList<C2654> arrayList = this.f12160;
        if (arrayList != null) {
            Iterator<C2654> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m14055();
            }
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m14045() {
        Rect rect = this.f12165;
        m14042(rect);
        m14024(rect);
        this.f12168.m4728(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m14042(Rect rect) {
        int i;
        if (this.f12176) {
            int i2 = this.f12162;
            FloatingActionButton floatingActionButton = this.f12167;
            i = (i2 - floatingActionButton.m992(floatingActionButton.f857)) / 2;
        } else {
            i = 0;
        }
        float r1 = this.f12181 ? m14041() + this.f12164 : 0.0f;
        int max = Math.max(i, (int) Math.ceil((double) r1));
        int max2 = Math.max(i, (int) Math.ceil((double) (r1 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m14024(Rect rect) {
        if (this.f12157 == null) {
            throw new NullPointerException("Didn't initialize content background");
        } else if (m14038()) {
            this.f12168.m4727(new InsetDrawable(this.f12157, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.f12168.m4727(this.f12157);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public C0671 m14030() {
        C0785 r0 = this.f12173;
        if (r0 != null) {
            return new C0671(r0);
        }
        throw new NullPointerException();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final boolean m14047() {
        return this.f12167.getVisibility() != 0 ? this.f12156 == 2 : this.f12156 != 1;
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final boolean m14039() {
        return this.f12167.getVisibility() == 0 ? this.f12156 == 1 : this.f12156 != 2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static ValueAnimator m14020(IF ifR) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f12153);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(ifR);
        valueAnimator.addUpdateListener(ifR);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: o.ѳı$IF */
    abstract class IF extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: ǃ  reason: contains not printable characters */
        private float f12194;

        /* renamed from: ɩ  reason: contains not printable characters */
        private boolean f12195;

        /* renamed from: ι  reason: contains not printable characters */
        private float f12197;

        /* access modifiers changed from: protected */
        /* renamed from: ι  reason: contains not printable characters */
        public abstract float m14049();

        private IF() {
        }

        /* synthetic */ IF(C2652 r1, byte b) {
            this();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            if (!this.f12195) {
                if (C2652.this.f12163 == null) {
                    f = 0.0f;
                } else {
                    f = C2652.this.f12163.f4785.f4803;
                }
                this.f12194 = f;
                this.f12197 = m14049();
                this.f12195 = true;
            }
            C2652 r0 = C2652.this;
            float f2 = this.f12194;
            r0.m14037((float) ((int) (f2 + ((this.f12197 - f2) * valueAnimator.getAnimatedFraction()))));
        }

        public void onAnimationEnd(Animator animator) {
            C2652.this.m14037((float) ((int) this.f12197));
            this.f12195 = false;
        }
    }

    /* renamed from: o.ѳı$aux */
    class aux extends IF {
        aux() {
            super(C2652.this, (byte) 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ι  reason: contains not printable characters */
        public final float m14051() {
            return C2652.this.f12166;
        }
    }

    /* renamed from: o.ѳı$ɩ  reason: contains not printable characters */
    class C2655 extends IF {
        C2655() {
            super(C2652.this, (byte) 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ι  reason: contains not printable characters */
        public final float m14057() {
            return C2652.this.f12166 + C2652.this.f12183;
        }
    }

    /* renamed from: o.ѳı$If  reason: case insensitive filesystem */
    class C3651If extends IF {
        C3651If() {
            super(C2652.this, (byte) 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ι  reason: contains not printable characters */
        public final float m14050() {
            return C2652.this.f12166 + C2652.this.f12164;
        }
    }

    /* renamed from: o.ѳı$if  reason: invalid class name */
    class Cif extends IF {
        /* access modifiers changed from: protected */
        /* renamed from: ι  reason: contains not printable characters */
        public final float m14052() {
            return 0.0f;
        }

        Cif(C2652 r2) {
            super(r2, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɨ  reason: contains not printable characters */
    public void m14035() {
        int i;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f12175 % 90.0f != 0.0f) {
                if (this.f12167.getLayerType() != 1) {
                    this.f12167.setLayerType(1, (Paint) null);
                }
            } else if (this.f12167.getLayerType() != 0) {
                this.f12167.setLayerType(0, (Paint) null);
            }
        }
        C0671 r0 = this.f12163;
        if (r0 != null && r0.f4785.f4810 != (i = (int) this.f12175)) {
            r0.f4785.f4810 = i;
            r0.m5524();
        }
    }

    public boolean onPreDraw() {
        float rotation = this.f12167.getRotation();
        if (this.f12175 == rotation) {
            return true;
        }
        this.f12175 = rotation;
        m14035();
        return true;
    }
}
