package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C0785;

/* renamed from: o.ɪƨ  reason: contains not printable characters */
public class C1336 extends LinearLayout {

    /* renamed from: ı  reason: contains not printable characters */
    final C1093 f7363;

    /* renamed from: ıı  reason: contains not printable characters */
    private ColorStateList f7364;

    /* renamed from: ıǃ  reason: contains not printable characters */
    private boolean f7365;

    /* renamed from: ıɩ  reason: contains not printable characters */
    private PorterDuff.Mode f7366;

    /* renamed from: ıι  reason: contains not printable characters */
    private View.OnLongClickListener f7367;

    /* renamed from: ĸ  reason: contains not printable characters */
    private final C2861 f7368;

    /* renamed from: Ŀ  reason: contains not printable characters */
    private ColorStateList f7369;

    /* renamed from: ŀ  reason: contains not printable characters */
    final LinkedHashSet<C1339> f7370;

    /* renamed from: ł  reason: contains not printable characters */
    boolean f7371;

    /* renamed from: ſ  reason: contains not printable characters */
    private final LinearLayout f7372;

    /* renamed from: Ɩ  reason: contains not printable characters */
    boolean f7373;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private final FrameLayout f7374;

    /* renamed from: ƚ  reason: contains not printable characters */
    private final LinearLayout f7375;

    /* renamed from: ǀ  reason: contains not printable characters */
    private CharSequence f7376;

    /* renamed from: ǃ  reason: contains not printable characters */
    boolean f7377;

    /* renamed from: ǃı  reason: contains not printable characters */
    private PorterDuff.Mode f7378;

    /* renamed from: ǃǃ  reason: contains not printable characters */
    private boolean f7379;

    /* renamed from: ǃɩ  reason: contains not printable characters */
    private ColorStateList f7380;

    /* renamed from: ǃι  reason: contains not printable characters */
    private ColorStateList f7381;

    /* renamed from: ȷ  reason: contains not printable characters */
    public CharSequence f7382;

    /* renamed from: Ƚ  reason: contains not printable characters */
    private int f7383;

    /* renamed from: ɂ  reason: contains not printable characters */
    private Drawable f7384;

    /* renamed from: Ɉ  reason: contains not printable characters */
    private int f7385;

    /* renamed from: ɉ  reason: contains not printable characters */
    private int f7386;

    /* renamed from: ɍ  reason: contains not printable characters */
    final C2927 f7387;

    /* renamed from: ɔ  reason: contains not printable characters */
    private int f7388;

    /* renamed from: ɟ  reason: contains not printable characters */
    private ColorStateList f7389;

    /* renamed from: ɨ  reason: contains not printable characters */
    int f7390;

    /* renamed from: ɩ  reason: contains not printable characters */
    final FrameLayout f7391;

    /* renamed from: ɩı  reason: contains not printable characters */
    private int f7392;

    /* renamed from: ɩǃ  reason: contains not printable characters */
    private ColorStateList f7393;

    /* renamed from: ɪ  reason: contains not printable characters */
    public boolean f7394;

    /* renamed from: ɫ  reason: contains not printable characters */
    private int f7395;

    /* renamed from: ɭ  reason: contains not printable characters */
    private final int f7396;

    /* renamed from: ɹ  reason: contains not printable characters */
    boolean f7397;

    /* renamed from: ɺ  reason: contains not printable characters */
    private CharSequence f7398;

    /* renamed from: ɻ  reason: contains not printable characters */
    private final int f7399;

    /* renamed from: ɼ  reason: contains not printable characters */
    private int f7400;

    /* renamed from: ɽ  reason: contains not printable characters */
    private int f7401;

    /* renamed from: ɾ  reason: contains not printable characters */
    public boolean f7402;

    /* renamed from: ɿ  reason: contains not printable characters */
    final C2861 f7403;

    /* renamed from: ʃ  reason: contains not printable characters */
    private View.OnLongClickListener f7404;

    /* renamed from: ʅ  reason: contains not printable characters */
    boolean f7405;

    /* renamed from: ʇ  reason: contains not printable characters */
    private final int f7406;

    /* renamed from: ʋ  reason: contains not printable characters */
    private boolean f7407;

    /* renamed from: ʌ  reason: contains not printable characters */
    private ColorStateList f7408;

    /* renamed from: ʏ  reason: contains not printable characters */
    private int f7409;

    /* renamed from: ʔ  reason: contains not printable characters */
    private final int f7410;

    /* renamed from: ʕ  reason: contains not printable characters */
    private final Rect f7411;

    /* renamed from: ʖ  reason: contains not printable characters */
    private int f7412;

    /* renamed from: ʟ  reason: contains not printable characters */
    int f7413;

    /* renamed from: ͻ  reason: contains not printable characters */
    private final TextView f7414;

    /* renamed from: ͼ  reason: contains not printable characters */
    private boolean f7415;

    /* renamed from: ͽ  reason: contains not printable characters */
    private final SparseArray<C1097> f7416;

    /* renamed from: Γ  reason: contains not printable characters */
    private final Rect f7417;

    /* renamed from: Ι  reason: contains not printable characters */
    EditText f7418;

    /* renamed from: Ξ  reason: contains not printable characters */
    private Drawable f7419;

    /* renamed from: Υ  reason: contains not printable characters */
    private final int f7420;

    /* renamed from: ι  reason: contains not printable characters */
    int f7421;

    /* renamed from: ιı  reason: contains not printable characters */
    private int f7422;

    /* renamed from: ιǃ  reason: contains not printable characters */
    private final int f7423;

    /* renamed from: ς  reason: contains not printable characters */
    private Drawable f7424;

    /* renamed from: τ  reason: contains not printable characters */
    private Typeface f7425;

    /* renamed from: ϛ  reason: contains not printable characters */
    private int f7426;

    /* renamed from: ϲ  reason: contains not printable characters */
    private ColorStateList f7427;

    /* renamed from: ϳ  reason: contains not printable characters */
    private int f7428;

    /* renamed from: І  reason: contains not printable characters */
    CharSequence f7429;

    /* renamed from: Ј  reason: contains not printable characters */
    private ColorStateList f7430;

    /* renamed from: Г  reason: contains not printable characters */
    private final RectF f7431;

    /* renamed from: г  reason: contains not printable characters */
    final LinkedHashSet<If> f7432;

    /* renamed from: с  reason: contains not printable characters */
    private CharSequence f7433;

    /* renamed from: т  reason: contains not printable characters */
    private final TextView f7434;

    /* renamed from: х  reason: contains not printable characters */
    private final int f7435;

    /* renamed from: ч  reason: contains not printable characters */
    private boolean f7436;

    /* renamed from: і  reason: contains not printable characters */
    TextView f7437;

    /* renamed from: ј  reason: contains not printable characters */
    private C0671 f7438;

    /* renamed from: ҁ  reason: contains not printable characters */
    private ValueAnimator f7439;

    /* renamed from: ґ  reason: contains not printable characters */
    private C0785 f7440;

    /* renamed from: ғ  reason: contains not printable characters */
    private boolean f7441;

    /* renamed from: Ӏ  reason: contains not printable characters */
    TextView f7442;

    /* renamed from: ӏ  reason: contains not printable characters */
    C0671 f7443;

    /* renamed from: ӷ  reason: contains not printable characters */
    private final C2861 f7444;

    /* renamed from: o.ɪƨ$If */
    public interface If {
        /* renamed from: ı  reason: contains not printable characters */
        void m8417(C1336 r1, int i);
    }

    /* renamed from: o.ɪƨ$ɩ  reason: contains not printable characters */
    public interface C1339 {
        /* renamed from: ι  reason: contains not printable characters */
        void m8419(C1336 r1);
    }

    public C1336(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1336(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f155042130969336);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1336(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            r9 = 2131952222(0x7f13025e, float:1.954088E38)
            r1 = r21
            android.content.Context r1 = o.C1400.m8576(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            o.ɐɩ r1 = new o.ɐɩ
            r1.<init>(r0)
            r0.f7363 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f7411 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f7417 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f7431 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f7370 = r1
            r10 = 0
            r0.f7386 = r10
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.f7416 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f7432 = r1
            o.әı r1 = new o.әı
            r1.<init>(r0)
            r0.f7387 = r1
            android.content.Context r11 = r20.getContext()
            r12 = 1
            r0.setOrientation(r12)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r11)
            r0.f7374 = r1
            android.widget.FrameLayout r1 = r0.f7374
            r1.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r1 = r0.f7374
            r0.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r11)
            r0.f7372 = r1
            android.widget.LinearLayout r1 = r0.f7372
            r1.setOrientation(r10)
            android.widget.LinearLayout r1 = r0.f7372
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r13 = -2
            r14 = -1
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r2.<init>(r13, r14, r3)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.f7374
            android.widget.LinearLayout r2 = r0.f7372
            r1.addView(r2)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r11)
            r0.f7375 = r1
            android.widget.LinearLayout r1 = r0.f7375
            r1.setOrientation(r10)
            android.widget.LinearLayout r1 = r0.f7375
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388613(0x800005, float:1.175495E-38)
            r2.<init>(r13, r14, r3)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.f7374
            android.widget.LinearLayout r2 = r0.f7375
            r1.addView(r2)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r11)
            r0.f7391 = r1
            android.widget.FrameLayout r1 = r0.f7391
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r13, r14)
            r1.setLayoutParams(r2)
            o.әı r1 = r0.f7387
            android.animation.TimeInterpolator r2 = o.C1311.f7290
            r1.f13583 = r2
            android.view.View r2 = r1.f13575
            int r2 = r2.getHeight()
            if (r2 <= 0) goto L_0x00dd
            android.view.View r2 = r1.f13575
            int r2 = r2.getWidth()
            if (r2 <= 0) goto L_0x00dd
            r1.m15103()
            float r2 = r1.f13569
            r1.m15107((float) r2)
        L_0x00dd:
            o.әı r1 = r0.f7387
            android.animation.TimeInterpolator r2 = o.C1311.f7290
            r1.f13606 = r2
            r1.m15113()
            o.әı r1 = r0.f7387
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.m15104((int) r2)
            int[] r3 = o.C0858.Aux.f5612
            r5 = 2131952222(0x7f13025e, float:1.954088E38)
            r15 = 5
            int[] r6 = new int[r15]
            r6 = {18, 16, 31, 35, 39} // fill-array
            r1 = r11
            r2 = r22
            r4 = r23
            o.ιɩ r1 = o.C3160.m15977(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 38
            boolean r2 = r2.getBoolean(r3, r12)
            r0.f7394 = r2
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 2
            java.lang.CharSequence r2 = r2.getText(r3)
            r0.setHint(r2)
            android.content.res.TypedArray r2 = r1.f9934
            r4 = 37
            boolean r2 = r2.getBoolean(r4, r12)
            r0.f7407 = r2
            o.łƭ r2 = new o.łƭ
            r4 = 0
            r2.<init>(r4)
            o.ƭł$If r2 = o.C0785.m6131(r11, r7, r8, r9, r2)
            o.ƭł r5 = new o.ƭł
            r5.<init>(r2, r10)
            r0.f7440 = r5
            android.content.res.Resources r2 = r11.getResources()
            r5 = 2131165505(0x7f070141, float:1.794523E38)
            int r2 = r2.getDimensionPixelOffset(r5)
            r0.f7396 = r2
            android.content.res.TypedArray r2 = r1.f9934
            int r2 = r2.getDimensionPixelOffset(r15, r10)
            r0.f7435 = r2
            android.content.res.Resources r2 = r11.getResources()
            r5 = 2131165506(0x7f070142, float:1.7945231E38)
            int r2 = r2.getDimensionPixelSize(r5)
            android.content.res.TypedArray r5 = r1.f9934
            r6 = 12
            int r2 = r5.getDimensionPixelSize(r6, r2)
            r0.f7399 = r2
            android.content.res.Resources r2 = r11.getResources()
            r5 = 2131165507(0x7f070143, float:1.7945233E38)
            int r2 = r2.getDimensionPixelSize(r5)
            android.content.res.TypedArray r5 = r1.f9934
            r6 = 13
            int r2 = r5.getDimensionPixelSize(r6, r2)
            r0.f7410 = r2
            int r2 = r0.f7399
            r0.f7412 = r2
            android.content.res.TypedArray r2 = r1.f9934
            r5 = 9
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2.getDimension(r5, r6)
            android.content.res.TypedArray r5 = r1.f9934
            r7 = 8
            float r5 = r5.getDimension(r7, r6)
            android.content.res.TypedArray r8 = r1.f9934
            r9 = 6
            float r8 = r8.getDimension(r9, r6)
            android.content.res.TypedArray r9 = r1.f9934
            r15 = 7
            float r6 = r9.getDimension(r15, r6)
            o.ƭł r9 = r0.f7440
            o.ƭł$If r15 = new o.ƭł$If
            r15.<init>(r9)
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x01a6
            o.łƭ r9 = new o.łƭ
            r9.<init>(r2)
            r15.f5228 = r9
        L_0x01a6:
            int r2 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x01b1
            o.łƭ r2 = new o.łƭ
            r2.<init>(r5)
            r15.f5227 = r2
        L_0x01b1:
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x01bc
            o.łƭ r2 = new o.łƭ
            r2.<init>(r8)
            r15.f5235 = r2
        L_0x01bc:
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x01c7
            o.łƭ r2 = new o.łƭ
            r2.<init>(r6)
            r15.f5231 = r2
        L_0x01c7:
            o.ƭł r2 = new o.ƭł
            r2.<init>(r15, r10)
            r0.f7440 = r2
            r2 = 3
            android.content.res.ColorStateList r4 = o.C0344.m4476((android.content.Context) r11, (o.C1992) r1, (int) r2)
            if (r4 == 0) goto L_0x022c
            int r5 = r4.getDefaultColor()
            r0.f7392 = r5
            int r5 = r0.f7392
            r0.f7413 = r5
            boolean r5 = r4.isStateful()
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r5 == 0) goto L_0x0209
            int[] r5 = new int[r12]
            r5[r10] = r6
            int r5 = r4.getColorForState(r5, r14)
            r0.f7406 = r5
            int[] r5 = new int[r3]
            r5 = {16842908, 16842910} // fill-array
            int r5 = r4.getColorForState(r5, r14)
            r0.f7423 = r5
            int[] r5 = new int[r3]
            r5 = {16843623, 16842910} // fill-array
            int r4 = r4.getColorForState(r5, r14)
            r0.f7420 = r4
            goto L_0x0236
        L_0x0209:
            int r4 = r0.f7392
            r0.f7423 = r4
            r4 = 2131099836(0x7f0600bc, float:1.7812036E38)
            android.content.res.ColorStateList r4 = o.C3257Con.m1342(r11, r4)
            int[] r5 = new int[r12]
            r5[r10] = r6
            int r5 = r4.getColorForState(r5, r14)
            r0.f7406 = r5
            int[] r5 = new int[r12]
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r5[r10] = r6
            int r4 = r4.getColorForState(r5, r14)
            r0.f7420 = r4
            goto L_0x0236
        L_0x022c:
            r0.f7413 = r10
            r0.f7392 = r10
            r0.f7406 = r10
            r0.f7423 = r10
            r0.f7420 = r10
        L_0x0236:
            android.content.res.TypedArray r4 = r1.f9934
            boolean r4 = r4.hasValue(r12)
            if (r4 == 0) goto L_0x0246
            android.content.res.ColorStateList r4 = r1.m10792(r12)
            r0.f7380 = r4
            r0.f7381 = r4
        L_0x0246:
            r4 = 10
            android.content.res.ColorStateList r5 = o.C0344.m4476((android.content.Context) r11, (o.C1992) r1, (int) r4)
            android.content.res.TypedArray r6 = r1.f9934
            int r4 = r6.getColor(r4, r10)
            r0.f7401 = r4
            r4 = 2131099854(0x7f0600ce, float:1.7812073E38)
            int r4 = o.C0651.m5450(r11, r4)
            r0.f7395 = r4
            r4 = 2131099855(0x7f0600cf, float:1.7812075E38)
            int r4 = o.C0651.m5450(r11, r4)
            r0.f7422 = r4
            r4 = 2131099858(0x7f0600d2, float:1.7812081E38)
            int r4 = o.C0651.m5450(r11, r4)
            r0.f7383 = r4
            if (r5 == 0) goto L_0x0274
            r0.setBoxStrokeColorStateList(r5)
        L_0x0274:
            android.content.res.TypedArray r4 = r1.f9934
            r5 = 11
            boolean r4 = r4.hasValue(r5)
            if (r4 == 0) goto L_0x0287
            r4 = 11
            android.content.res.ColorStateList r4 = o.C0344.m4476((android.content.Context) r11, (o.C1992) r1, (int) r4)
            r0.setBoxStrokeErrorColor(r4)
        L_0x0287:
            android.content.res.TypedArray r4 = r1.f9934
            r5 = 39
            int r4 = r4.getResourceId(r5, r14)
            if (r4 == r14) goto L_0x029c
            android.content.res.TypedArray r4 = r1.f9934
            r5 = 39
            int r4 = r4.getResourceId(r5, r10)
            r0.setHintTextAppearance(r4)
        L_0x029c:
            android.content.res.TypedArray r4 = r1.f9934
            r5 = 31
            int r4 = r4.getResourceId(r5, r10)
            android.content.res.TypedArray r5 = r1.f9934
            r6 = 26
            java.lang.CharSequence r5 = r5.getText(r6)
            android.content.res.TypedArray r6 = r1.f9934
            r8 = 27
            boolean r6 = r6.getBoolean(r8, r10)
            android.content.Context r8 = r20.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            r9 = 2131558457(0x7f0d0039, float:1.874223E38)
            android.widget.LinearLayout r15 = r0.f7375
            android.view.View r8 = r8.inflate(r9, r15, r10)
            o.ӊ r8 = (o.C2861) r8
            r0.f7368 = r8
            o.ӊ r8 = r0.f7368
            r8.setVisibility(r7)
            android.content.res.TypedArray r8 = r1.f9934
            r9 = 28
            boolean r8 = r8.hasValue(r9)
            if (r8 == 0) goto L_0x02e1
            r8 = 28
            android.graphics.drawable.Drawable r8 = r1.m10793(r8)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r8)
        L_0x02e1:
            android.content.res.TypedArray r8 = r1.f9934
            r9 = 29
            boolean r8 = r8.hasValue(r9)
            if (r8 == 0) goto L_0x02f4
            r8 = 29
            android.content.res.ColorStateList r8 = o.C0344.m4476((android.content.Context) r11, (o.C1992) r1, (int) r8)
            r0.setErrorIconTintList(r8)
        L_0x02f4:
            android.content.res.TypedArray r8 = r1.f9934
            r9 = 30
            boolean r8 = r8.hasValue(r9)
            r9 = 0
            if (r8 == 0) goto L_0x030e
            android.content.res.TypedArray r8 = r1.f9934
            r15 = 30
            int r8 = r8.getInt(r15, r14)
            android.graphics.PorterDuff$Mode r8 = o.C3198.m16133((int) r8, (android.graphics.PorterDuff.Mode) r9)
            r0.setErrorIconTintMode(r8)
        L_0x030e:
            o.ӊ r8 = r0.f7368
            android.content.res.Resources r15 = r20.getResources()
            r13 = 2131886175(0x7f12005f, float:1.9406921E38)
            java.lang.CharSequence r13 = r15.getText(r13)
            r8.setContentDescription(r13)
            o.ӊ r8 = r0.f7368
            o.C0293.m4203((android.view.View) r8, (int) r3)
            o.ӊ r8 = r0.f7368
            r8.setClickable(r10)
            o.ӊ r8 = r0.f7368
            r8.setPressable(r10)
            o.ӊ r8 = r0.f7368
            r8.setFocusable(r10)
            android.content.res.TypedArray r8 = r1.f9934
            r13 = 35
            int r8 = r8.getResourceId(r13, r10)
            android.content.res.TypedArray r13 = r1.f9934
            r15 = 34
            boolean r13 = r13.getBoolean(r15, r10)
            android.content.res.TypedArray r15 = r1.f9934
            r2 = 33
            java.lang.CharSequence r2 = r15.getText(r2)
            android.content.res.TypedArray r15 = r1.f9934
            r3 = 47
            int r3 = r15.getResourceId(r3, r10)
            android.content.res.TypedArray r15 = r1.f9934
            r12 = 46
            java.lang.CharSequence r12 = r15.getText(r12)
            android.content.res.TypedArray r15 = r1.f9934
            r9 = 50
            int r9 = r15.getResourceId(r9, r10)
            android.content.res.TypedArray r15 = r1.f9934
            r7 = 49
            java.lang.CharSequence r7 = r15.getText(r7)
            android.content.res.TypedArray r15 = r1.f9934
            r14 = 60
            int r14 = r15.getResourceId(r14, r10)
            android.content.res.TypedArray r15 = r1.f9934
            r10 = 59
            java.lang.CharSequence r10 = r15.getText(r10)
            android.content.res.TypedArray r15 = r1.f9934
            r16 = r14
            r14 = 14
            r17 = r10
            r10 = 0
            boolean r14 = r15.getBoolean(r14, r10)
            android.content.res.TypedArray r15 = r1.f9934
            r10 = 15
            r18 = r14
            r14 = -1
            int r10 = r15.getInt(r10, r14)
            r0.setCounterMaxLength(r10)
            android.content.res.TypedArray r10 = r1.f9934
            r14 = 18
            r15 = 0
            int r10 = r10.getResourceId(r14, r15)
            r0.f7388 = r10
            android.content.res.TypedArray r10 = r1.f9934
            r14 = 16
            int r10 = r10.getResourceId(r14, r15)
            r0.f7400 = r10
            android.content.Context r10 = r20.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r14 = 2131558458(0x7f0d003a, float:1.8742232E38)
            r19 = r9
            android.widget.LinearLayout r9 = r0.f7372
            android.view.View r9 = r10.inflate(r14, r9, r15)
            o.ӊ r9 = (o.C2861) r9
            r0.f7444 = r9
            o.ӊ r9 = r0.f7444
            r10 = 8
            r9.setVisibility(r10)
            r9 = 0
            r0.setStartIconOnClickListener(r9)
            r0.setStartIconOnLongClickListener(r9)
            android.content.res.TypedArray r9 = r1.f9934
            r10 = 56
            boolean r9 = r9.hasValue(r10)
            if (r9 == 0) goto L_0x0403
            r9 = 56
            android.graphics.drawable.Drawable r9 = r1.m10793(r9)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r9)
            android.content.res.TypedArray r9 = r1.f9934
            r10 = 55
            boolean r9 = r9.hasValue(r10)
            if (r9 == 0) goto L_0x03f7
            android.content.res.TypedArray r9 = r1.f9934
            r10 = 55
            java.lang.CharSequence r9 = r9.getText(r10)
            r0.setStartIconContentDescription((java.lang.CharSequence) r9)
        L_0x03f7:
            android.content.res.TypedArray r9 = r1.f9934
            r10 = 54
            r14 = 1
            boolean r9 = r9.getBoolean(r10, r14)
            r0.setStartIconCheckable(r9)
        L_0x0403:
            android.content.res.TypedArray r9 = r1.f9934
            r10 = 57
            boolean r9 = r9.hasValue(r10)
            if (r9 == 0) goto L_0x0416
            r9 = 57
            android.content.res.ColorStateList r9 = o.C0344.m4476((android.content.Context) r11, (o.C1992) r1, (int) r9)
            r0.setStartIconTintList(r9)
        L_0x0416:
            android.content.res.TypedArray r9 = r1.f9934
            r10 = 58
            boolean r9 = r9.hasValue(r10)
            if (r9 == 0) goto L_0x0431
            android.content.res.TypedArray r9 = r1.f9934
            r10 = 58
            r14 = -1
            int r9 = r9.getInt(r10, r14)
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = o.C3198.m16133((int) r9, (android.graphics.PorterDuff.Mode) r10)
            r0.setStartIconTintMode(r9)
        L_0x0431:
            android.content.res.TypedArray r9 = r1.f9934
            r10 = 4
            r14 = 0
            int r9 = r9.getInt(r10, r14)
            r0.setBoxBackgroundMode(r9)
            android.content.Context r9 = r20.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r10 = 2131558457(0x7f0d0039, float:1.874223E38)
            android.widget.FrameLayout r15 = r0.f7391
            android.view.View r9 = r9.inflate(r10, r15, r14)
            o.ӊ r9 = (o.C2861) r9
            r0.f7403 = r9
            android.widget.FrameLayout r9 = r0.f7391
            o.ӊ r10 = r0.f7403
            r9.addView(r10)
            o.ӊ r9 = r0.f7403
            r10 = 8
            r9.setVisibility(r10)
            android.util.SparseArray<o.ɐι> r9 = r0.f7416
            o.ɀı r10 = new o.ɀı
            r10.<init>(r0)
            r14 = -1
            r9.append(r14, r10)
            android.util.SparseArray<o.ɐι> r9 = r0.f7416
            o.ɩլ r10 = new o.ɩլ
            r10.<init>(r0)
            r14 = 0
            r9.append(r14, r10)
            android.util.SparseArray<o.ɐι> r9 = r0.f7416
            o.ɪŧ r10 = new o.ɪŧ
            r10.<init>(r0)
            r14 = 1
            r9.append(r14, r10)
            android.util.SparseArray<o.ɐι> r9 = r0.f7416
            o.ɍւ r10 = new o.ɍւ
            r10.<init>(r0)
            r14 = 2
            r9.append(r14, r10)
            android.util.SparseArray<o.ɐι> r9 = r0.f7416
            o.ɨʝ r10 = new o.ɨʝ
            r10.<init>(r0)
            r14 = 3
            r9.append(r14, r10)
            android.content.res.TypedArray r9 = r1.f9934
            r10 = 23
            boolean r9 = r9.hasValue(r10)
            r10 = 43
            if (r9 == 0) goto L_0x04e3
            android.content.res.TypedArray r9 = r1.f9934
            r14 = 23
            r15 = 0
            int r9 = r9.getInt(r14, r15)
            r0.setEndIconMode(r9)
            android.content.res.TypedArray r9 = r1.f9934
            r14 = 22
            boolean r9 = r9.hasValue(r14)
            if (r9 == 0) goto L_0x04c1
            r9 = 22
            android.graphics.drawable.Drawable r9 = r1.m10793(r9)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r9)
        L_0x04c1:
            android.content.res.TypedArray r9 = r1.f9934
            r14 = 21
            boolean r9 = r9.hasValue(r14)
            if (r9 == 0) goto L_0x04d6
            android.content.res.TypedArray r9 = r1.f9934
            r14 = 21
            java.lang.CharSequence r9 = r9.getText(r14)
            r0.setEndIconContentDescription((java.lang.CharSequence) r9)
        L_0x04d6:
            android.content.res.TypedArray r9 = r1.f9934
            r14 = 20
            r15 = 1
            boolean r9 = r9.getBoolean(r14, r15)
            r0.setEndIconCheckable(r9)
            goto L_0x0537
        L_0x04e3:
            android.content.res.TypedArray r9 = r1.f9934
            boolean r9 = r9.hasValue(r10)
            if (r9 == 0) goto L_0x0537
            android.content.res.TypedArray r9 = r1.f9934
            r14 = 0
            boolean r9 = r9.getBoolean(r10, r14)
            r0.setEndIconMode(r9)
            r9 = 42
            android.graphics.drawable.Drawable r9 = r1.m10793(r9)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r9)
            android.content.res.TypedArray r9 = r1.f9934
            r14 = 41
            java.lang.CharSequence r9 = r9.getText(r14)
            r0.setEndIconContentDescription((java.lang.CharSequence) r9)
            android.content.res.TypedArray r9 = r1.f9934
            r14 = 44
            boolean r9 = r9.hasValue(r14)
            if (r9 == 0) goto L_0x051c
            r9 = 44
            android.content.res.ColorStateList r9 = o.C0344.m4476((android.content.Context) r11, (o.C1992) r1, (int) r9)
            r0.setEndIconTintList(r9)
        L_0x051c:
            android.content.res.TypedArray r9 = r1.f9934
            r14 = 45
            boolean r9 = r9.hasValue(r14)
            if (r9 == 0) goto L_0x0537
            android.content.res.TypedArray r9 = r1.f9934
            r14 = 45
            r15 = -1
            int r9 = r9.getInt(r14, r15)
            r14 = 0
            android.graphics.PorterDuff$Mode r9 = o.C3198.m16133((int) r9, (android.graphics.PorterDuff.Mode) r14)
            r0.setEndIconTintMode(r9)
        L_0x0537:
            android.content.res.TypedArray r9 = r1.f9934
            boolean r9 = r9.hasValue(r10)
            if (r9 != 0) goto L_0x056d
            android.content.res.TypedArray r9 = r1.f9934
            r10 = 24
            boolean r9 = r9.hasValue(r10)
            if (r9 == 0) goto L_0x0552
            r9 = 24
            android.content.res.ColorStateList r9 = o.C0344.m4476((android.content.Context) r11, (o.C1992) r1, (int) r9)
            r0.setEndIconTintList(r9)
        L_0x0552:
            android.content.res.TypedArray r9 = r1.f9934
            r10 = 25
            boolean r9 = r9.hasValue(r10)
            if (r9 == 0) goto L_0x056d
            android.content.res.TypedArray r9 = r1.f9934
            r10 = 25
            r14 = -1
            int r9 = r9.getInt(r10, r14)
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = o.C3198.m16133((int) r9, (android.graphics.PorterDuff.Mode) r10)
            r0.setEndIconTintMode(r9)
        L_0x056d:
            o.ɽ r9 = new o.ɽ
            r9.<init>(r11)
            r0.f7414 = r9
            android.widget.TextView r9 = r0.f7414
            r10 = 2131362394(0x7f0a025a, float:1.8344567E38)
            r9.setId(r10)
            android.widget.TextView r9 = r0.f7414
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r14 = -2
            r10.<init>(r14, r14)
            r9.setLayoutParams(r10)
            android.widget.TextView r9 = r0.f7414
            r10 = 1
            o.C0293.m4177((android.view.View) r9, (int) r10)
            android.widget.LinearLayout r9 = r0.f7372
            o.ӊ r10 = r0.f7444
            r9.addView(r10)
            android.widget.LinearLayout r9 = r0.f7372
            android.widget.TextView r10 = r0.f7414
            r9.addView(r10)
            o.ɽ r9 = new o.ɽ
            r9.<init>(r11)
            r0.f7434 = r9
            android.widget.TextView r9 = r0.f7434
            r10 = 2131362395(0x7f0a025b, float:1.834457E38)
            r9.setId(r10)
            android.widget.TextView r9 = r0.f7434
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r11 = 80
            r14 = -2
            r10.<init>(r14, r14, r11)
            r9.setLayoutParams(r10)
            android.widget.TextView r9 = r0.f7434
            r10 = 1
            o.C0293.m4177((android.view.View) r9, (int) r10)
            android.widget.LinearLayout r9 = r0.f7375
            android.widget.TextView r10 = r0.f7434
            r9.addView(r10)
            android.widget.LinearLayout r9 = r0.f7375
            o.ӊ r10 = r0.f7368
            r9.addView(r10)
            android.widget.LinearLayout r9 = r0.f7375
            android.widget.FrameLayout r10 = r0.f7391
            r9.addView(r10)
            r0.setHelperTextEnabled(r13)
            r0.setHelperText(r2)
            r0.setHelperTextTextAppearance(r8)
            r0.setErrorEnabled(r6)
            r0.setErrorTextAppearance(r4)
            r0.setErrorContentDescription(r5)
            int r2 = r0.f7388
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f7400
            r0.setCounterOverflowTextAppearance(r2)
            r0.setPlaceholderText(r12)
            r0.setPlaceholderTextAppearance(r3)
            r0.setPrefixText(r7)
            r2 = r19
            r0.setPrefixTextAppearance(r2)
            r2 = r17
            r0.setSuffixText(r2)
            r2 = r16
            r0.setSuffixTextAppearance(r2)
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 32
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x0619
            r2 = 32
            android.content.res.ColorStateList r2 = r1.m10792(r2)
            r0.setErrorTextColor(r2)
        L_0x0619:
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 36
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x062c
            r2 = 36
            android.content.res.ColorStateList r2 = r1.m10792(r2)
            r0.setHelperTextColor(r2)
        L_0x062c:
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 40
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x063f
            r2 = 40
            android.content.res.ColorStateList r2 = r1.m10792(r2)
            r0.setHintTextColor(r2)
        L_0x063f:
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 19
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x0652
            r2 = 19
            android.content.res.ColorStateList r2 = r1.m10792(r2)
            r0.setCounterTextColor(r2)
        L_0x0652:
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 17
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x0665
            r2 = 17
            android.content.res.ColorStateList r2 = r1.m10792(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x0665:
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 48
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x0678
            r2 = 48
            android.content.res.ColorStateList r2 = r1.m10792(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x0678:
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 51
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x068b
            r2 = 51
            android.content.res.ColorStateList r2 = r1.m10792(r2)
            r0.setPrefixTextColor(r2)
        L_0x068b:
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 61
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x069e
            r2 = 61
            android.content.res.ColorStateList r2 = r1.m10792(r2)
            r0.setSuffixTextColor(r2)
        L_0x069e:
            r2 = r18
            r0.setCounterEnabled(r2)
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 1
            r4 = 0
            boolean r2 = r2.getBoolean(r4, r3)
            r0.setEnabled(r2)
            android.content.res.TypedArray r1 = r1.f9934
            r1.recycle()
            r1 = 2
            o.C0293.m4203((android.view.View) r0, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1336.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f7374.addView(view, layoutParams2);
            this.f7374.setLayoutParams(layoutParams);
            m8396();
            EditText editText = (EditText) view;
            if (this.f7418 == null) {
                this.f7418 = editText;
                m8382();
                if (m8406()) {
                    C0293.m4199((View) this.f7418, (Drawable) this.f7443);
                }
                m8415();
                if (this.f7390 != 0) {
                    m8396();
                }
                setTextInputAccessibilityDelegate(new C1338(this));
                this.f7387.m15110(this.f7418.getTypeface());
                this.f7387.m15117(this.f7418.getTextSize());
                int gravity = this.f7418.getGravity();
                this.f7387.m15104((gravity & -113) | 48);
                this.f7387.m15121(gravity);
                this.f7418.addTextChangedListener(new TextWatcher() {
                    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public final void afterTextChanged(Editable editable) {
                        C1336 r0 = C1336.this;
                        r0.m8414(!r0.f7405, false);
                        if (C1336.this.f7377) {
                            C1336.this.m8413(editable.length());
                        }
                        if (C1336.this.f7397) {
                            C1336 r02 = C1336.this;
                            if (editable.length() == 0 && !r02.f7371) {
                                r02.m8412();
                            } else if (r02.f7437 != null && r02.f7397) {
                                r02.f7437.setText((CharSequence) null);
                                r02.f7437.setVisibility(4);
                            }
                        }
                    }
                });
                if (this.f7381 == null) {
                    this.f7381 = this.f7418.getHintTextColors();
                }
                if (this.f7394) {
                    if (TextUtils.isEmpty(this.f7382)) {
                        this.f7398 = this.f7418.getHint();
                        setHint(this.f7398);
                        this.f7418.setHint((CharSequence) null);
                    }
                    this.f7402 = true;
                }
                if (this.f7442 != null) {
                    m8413(this.f7418.getText().length());
                }
                m8416();
                this.f7363.m7472();
                this.f7372.bringToFront();
                this.f7375.bringToFront();
                this.f7391.bringToFront();
                this.f7368.bringToFront();
                m8378();
                m8410();
                m8397();
                if (!isEnabled()) {
                    editText.setEnabled(false);
                }
                m8414(false, true);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        super.addView(view, i, layoutParams);
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f7390) {
            this.f7390 = i;
            if (this.f7418 != null) {
                m8382();
                if (m8406()) {
                    C0293.m4199((View) this.f7418, (Drawable) this.f7443);
                }
                m8415();
                if (this.f7390 != 0) {
                    m8396();
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m8382() {
        int i = this.f7390;
        if (i == 0) {
            this.f7443 = null;
            this.f7438 = null;
        } else if (i == 1) {
            this.f7443 = new C0671(this.f7440);
            this.f7438 = new C0671();
        } else if (i == 2) {
            if (!this.f7394 || (this.f7443 instanceof C1198)) {
                this.f7443 = new C0671(this.f7440);
            } else {
                this.f7443 = new C1198(this.f7440);
            }
            this.f7438 = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7390);
            sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m8406() {
        EditText editText = this.f7418;
        return (editText == null || this.f7443 == null || editText.getBackground() != null || this.f7390 == 0) ? false : true;
    }

    public void setBoxStrokeColor(int i) {
        if (this.f7401 != i) {
            this.f7401 = i;
            m8415();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f7395 = colorStateList.getDefaultColor();
            this.f7422 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f7383 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f7401 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f7401 != colorStateList.getDefaultColor()) {
            this.f7401 = colorStateList.getDefaultColor();
        }
        m8415();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f7393 != colorStateList) {
            this.f7393 = colorStateList;
            m8415();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0651.m5450(getContext(), i));
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f7413 != i) {
            this.f7413 = i;
            this.f7392 = i;
            m8386();
        }
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        if (this.f7443.m5535() != f || this.f7443.m5534() != f2 || this.f7443.m5523() != f4 || this.f7443.m5528() != f3) {
            C0785.If ifR = new C0785.If(this.f7440);
            ifR.f5228 = new C0531(f);
            ifR.f5227 = new C0531(f2);
            ifR.f5235 = new C0531(f4);
            ifR.f5231 = new C0531(f3);
            this.f7440 = new C0785(ifR, (byte) 0);
            m8386();
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f7425) {
            this.f7425 = typeface;
            this.f7387.m15110(typeface);
            C1093 r0 = this.f7363;
            if (typeface != r0.f6515) {
                r0.f6515 = typeface;
                TextView textView = r0.f6504;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = r0.f6509;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f7442;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f7398 == null || (editText = this.f7418) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f7402;
        this.f7402 = false;
        CharSequence hint = editText.getHint();
        this.f7418.setHint(this.f7398);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f7418.setHint(hint);
            this.f7402 = z;
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private void m8396() {
        if (this.f7390 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7374.getLayoutParams();
            int r1 = m8395();
            if (r1 != layoutParams.topMargin) {
                layoutParams.topMargin = r1;
                this.f7374.requestLayout();
            }
        }
    }

    public int getBaseline() {
        EditText editText = this.f7418;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m8395();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8414(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f7418;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f7418;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean r5 = this.f7363.m7471();
        ColorStateList colorStateList2 = this.f7381;
        if (colorStateList2 != null) {
            this.f7387.m15105(colorStateList2);
            this.f7387.m15109(this.f7381);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f7381;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f7422) : this.f7422;
            this.f7387.m15105(ColorStateList.valueOf(colorForState));
            this.f7387.m15109(ColorStateList.valueOf(colorForState));
        } else if (r5) {
            C2927 r0 = this.f7387;
            C1093 r2 = this.f7363;
            r0.m15105(r2.f6504 != null ? r2.f6504.getTextColors() : null);
        } else if (this.f7373 && (textView = this.f7442) != null) {
            this.f7387.m15105(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f7380) != null) {
            this.f7387.m15105(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || r5))) {
            if (z2 || this.f7371) {
                m8385(z);
            }
        } else if (z2 || !this.f7371) {
            m8377(z);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f7394) {
            m8384(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m8384(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f7382)) {
            this.f7382 = charSequence;
            this.f7387.m15111(charSequence);
            if (!this.f7371) {
                m8381();
            }
        }
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f7394) {
            this.f7394 = z;
            if (!this.f7394) {
                this.f7402 = false;
                if (!TextUtils.isEmpty(this.f7382) && TextUtils.isEmpty(this.f7418.getHint())) {
                    this.f7418.setHint(this.f7382);
                }
                m8384((CharSequence) null);
            } else {
                CharSequence hint = this.f7418.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f7382)) {
                        setHint(hint);
                    }
                    this.f7418.setHint((CharSequence) null);
                }
                this.f7402 = true;
            }
            if (this.f7418 != null) {
                m8396();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f7387.m15108(i);
        this.f7380 = this.f7387.f13596;
        if (this.f7418 != null) {
            m8414(false, false);
            m8396();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f7380 != colorStateList) {
            if (this.f7381 == null) {
                this.f7387.m15105(colorStateList);
            }
            this.f7380 = colorStateList;
            if (this.f7418 != null) {
                m8414(false, false);
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f7381 = colorStateList;
        this.f7380 = colorStateList;
        if (this.f7418 != null) {
            m8414(false, false);
        }
    }

    public void setErrorEnabled(boolean z) {
        C1093 r0 = this.f7363;
        if (r0.f6521 != z) {
            if (r0.f6510 != null) {
                r0.f6510.cancel();
            }
            if (z) {
                r0.f6504 = new C1514(r0.f6507);
                r0.f6504.setId(R.id.f167772131362391);
                if (Build.VERSION.SDK_INT >= 17) {
                    r0.f6504.setTextAlignment(5);
                }
                if (r0.f6515 != null) {
                    r0.f6504.setTypeface(r0.f6515);
                }
                int i = r0.f6518;
                r0.f6518 = i;
                if (r0.f6504 != null) {
                    r0.f6517.m8392(r0.f6504, i);
                }
                ColorStateList colorStateList = r0.f6508;
                r0.f6508 = colorStateList;
                if (!(r0.f6504 == null || colorStateList == null)) {
                    r0.f6504.setTextColor(colorStateList);
                }
                CharSequence charSequence = r0.f6520;
                r0.f6520 = charSequence;
                if (r0.f6504 != null) {
                    r0.f6504.setContentDescription(charSequence);
                }
                r0.f6504.setVisibility(4);
                C0293.m4177((View) r0.f6504, 1);
                r0.m7470(r0.f6504, 0);
            } else {
                r0.m7468();
                r0.m7473(r0.f6504, 0);
                r0.f6504 = null;
                r0.f6517.m8416();
                r0.f6517.m8415();
            }
            r0.f6521 = z;
        }
    }

    public void setErrorTextAppearance(int i) {
        C1093 r0 = this.f7363;
        r0.f6518 = i;
        if (r0.f6504 != null) {
            r0.f6517.m8392(r0.f6504, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C1093 r0 = this.f7363;
        r0.f6508 = colorStateList;
        if (r0.f6504 != null && colorStateList != null) {
            r0.f6504.setTextColor(colorStateList);
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C1093 r0 = this.f7363;
        r0.f6511 = i;
        if (r0.f6509 != null) {
            C0893.m6632(r0.f6509, i);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C1093 r0 = this.f7363;
        r0.f6519 = colorStateList;
        if (r0.f6509 != null && colorStateList != null) {
            r0.f6509.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C1093 r0 = this.f7363;
        if (r0.f6513 != z) {
            if (r0.f6510 != null) {
                r0.f6510.cancel();
            }
            if (z) {
                r0.f6509 = new C1514(r0.f6507);
                r0.f6509.setId(R.id.f167782131362392);
                if (Build.VERSION.SDK_INT >= 17) {
                    r0.f6509.setTextAlignment(5);
                }
                if (r0.f6515 != null) {
                    r0.f6509.setTypeface(r0.f6515);
                }
                r0.f6509.setVisibility(4);
                C0293.m4177((View) r0.f6509, 1);
                int i = r0.f6511;
                r0.f6511 = i;
                if (r0.f6509 != null) {
                    C0893.m6632(r0.f6509, i);
                }
                ColorStateList colorStateList = r0.f6519;
                r0.f6519 = colorStateList;
                if (!(r0.f6509 == null || colorStateList == null)) {
                    r0.f6509.setTextColor(colorStateList);
                }
                r0.m7470(r0.f6509, 1);
            } else {
                if (r0.f6510 != null) {
                    r0.f6510.cancel();
                }
                if (r0.f6516 == 2) {
                    r0.f6501 = 0;
                }
                r0.m7469(r0.f6516, r0.f6501, r0.m7474(r0.f6509, (CharSequence) null));
                r0.m7473(r0.f6509, 1);
                r0.f6509 = null;
                r0.f6517.m8416();
                r0.f6517.m8415();
            }
            r0.f6513 = z;
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f7363.f6513) {
                setHelperTextEnabled(true);
            }
            C1093 r0 = this.f7363;
            if (r0.f6510 != null) {
                r0.f6510.cancel();
            }
            r0.f6522 = charSequence;
            r0.f6509.setText(charSequence);
            if (r0.f6516 != 2) {
                r0.f6501 = 2;
            }
            r0.m7469(r0.f6516, r0.f6501, r0.m7474(r0.f6509, charSequence));
        } else if (this.f7363.f6513) {
            setHelperTextEnabled(false);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C1093 r0 = this.f7363;
        r0.f6520 = charSequence;
        if (r0.f6504 != null) {
            r0.f6504.setContentDescription(charSequence);
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f7363.f6521) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C1093 r0 = this.f7363;
            if (r0.f6510 != null) {
                r0.f6510.cancel();
            }
            r0.f6512 = charSequence;
            r0.f6504.setText(charSequence);
            if (r0.f6516 != 1) {
                r0.f6501 = 1;
            }
            r0.m7469(r0.f6516, r0.f6501, r0.m7474(r0.f6504, charSequence));
            return;
        }
        this.f7363.m7468();
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C3257Con.m1345(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f7368.setImageDrawable(drawable);
        m8405(drawable != null && this.f7363.f6521);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f7369 = colorStateList;
        Drawable drawable = this.f7368.getDrawable();
        if (drawable != null) {
            drawable = C1266.m8158(drawable).mutate();
            C1266.m8152(drawable, colorStateList);
        }
        if (this.f7368.getDrawable() != drawable) {
            this.f7368.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7368.getDrawable();
        if (drawable != null) {
            drawable = C1266.m8158(drawable).mutate();
            C1266.m8153(drawable, mode);
        }
        if (this.f7368.getDrawable() != drawable) {
            this.f7368.setImageDrawable(drawable);
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f7377 != z) {
            if (z) {
                this.f7442 = new C1514(getContext());
                this.f7442.setId(R.id.f167762131362390);
                Typeface typeface = this.f7425;
                if (typeface != null) {
                    this.f7442.setTypeface(typeface);
                }
                this.f7442.setMaxLines(1);
                this.f7363.m7470(this.f7442, 2);
                C2826.m14765((ViewGroup.MarginLayoutParams) this.f7442.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.f159362131165508));
                m8411();
                m8407();
            } else {
                this.f7363.m7473(this.f7442, 2);
                this.f7442 = null;
            }
            this.f7377 = z;
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f7388 != i) {
            this.f7388 = i;
            m8411();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f7427 != colorStateList) {
            this.f7427 = colorStateList;
            m8411();
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f7400 != i) {
            this.f7400 = i;
            m8411();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f7430 != colorStateList) {
            this.f7430 = colorStateList;
            m8411();
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f7421 != i) {
            if (i > 0) {
                this.f7421 = i;
            } else {
                this.f7421 = -1;
            }
            if (this.f7377) {
                m8407();
            }
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    private void m8407() {
        if (this.f7442 != null) {
            EditText editText = this.f7418;
            m8413(editText == null ? 0 : editText.getText().length());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m8413(int i) {
        boolean z = this.f7373;
        int i2 = this.f7421;
        if (i2 == -1) {
            this.f7442.setText(String.valueOf(i));
            this.f7442.setContentDescription((CharSequence) null);
            this.f7373 = false;
        } else {
            this.f7373 = i > i2;
            m8390(getContext(), this.f7442, i, this.f7421, this.f7373);
            if (z != this.f7373) {
                m8411();
            }
            this.f7442.setText(getContext().getString(R.string.f170582131886147, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f7421)}));
        }
        if (this.f7418 != null && z != this.f7373) {
            m8414(false, false);
            m8415();
            m8416();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m8390(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? R.string.f170572131886146 : R.string.f170562131886145, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i = 0;
        if (!this.f7397 || !TextUtils.isEmpty(charSequence)) {
            if (!this.f7397) {
                m8393(true);
            }
            this.f7376 = charSequence;
        } else {
            m8393(false);
        }
        EditText editText = this.f7418;
        if (editText != null) {
            i = editText.getText().length();
        }
        if (i != 0 || this.f7371) {
            TextView textView = this.f7437;
            if (textView != null && this.f7397) {
                textView.setText((CharSequence) null);
                this.f7437.setVisibility(4);
                return;
            }
            return;
        }
        m8412();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m8393(boolean z) {
        if (this.f7397 != z) {
            if (z) {
                this.f7437 = new C1514(getContext());
                this.f7437.setId(R.id.f167792131362393);
                C0293.m4177((View) this.f7437, 1);
                setPlaceholderTextAppearance(this.f7428);
                setPlaceholderTextColor(this.f7389);
                TextView textView = this.f7437;
                if (textView != null) {
                    this.f7374.addView(textView);
                    this.f7437.setVisibility(0);
                }
            } else {
                TextView textView2 = this.f7437;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                this.f7437 = null;
            }
            this.f7397 = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m8412() {
        TextView textView = this.f7437;
        if (textView != null && this.f7397) {
            textView.setText(this.f7376);
            this.f7437.setVisibility(0);
            this.f7437.bringToFront();
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f7389 != colorStateList) {
            this.f7389 = colorStateList;
            TextView textView = this.f7437;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f7428 = i;
        TextView textView = this.f7437;
        if (textView != null) {
            C0893.m6632(textView, i);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f7433 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f7414.setText(charSequence);
        m8380();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private void m8380() {
        this.f7414.setVisibility((this.f7433 == null || this.f7371) ? 8 : 0);
        m8408();
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f7414.setTextColor(colorStateList);
    }

    public void setPrefixTextAppearance(int i) {
        C0893.m6632(this.f7414, i);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private void m8410() {
        if (this.f7418 != null) {
            TextView textView = this.f7414;
            int i = 0;
            if (!(this.f7444.getVisibility() == 0)) {
                i = this.f7418.getPaddingLeft();
            }
            textView.setPadding(i, this.f7418.getCompoundPaddingTop(), this.f7414.getCompoundPaddingRight(), this.f7418.getCompoundPaddingBottom());
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f7429 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f7434.setText(charSequence);
        m8409();
    }

    /* renamed from: і  reason: contains not printable characters */
    private void m8409() {
        int visibility = this.f7434.getVisibility();
        int i = 0;
        boolean z = this.f7429 != null && !this.f7371;
        TextView textView = this.f7434;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f7434.getVisibility()) {
            m8379().m7478(z);
        }
        m8408();
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f7434.setTextColor(colorStateList);
    }

    public void setSuffixTextAppearance(int i) {
        C0893.m6632(this.f7434, i);
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    private void m8397() {
        if (this.f7418 != null) {
            TextView textView = this.f7434;
            int paddingLeft = textView.getPaddingLeft();
            int paddingTop = this.f7418.getPaddingTop();
            boolean z = true;
            int i = 0;
            if (!(this.f7391.getVisibility() == 0 && this.f7403.getVisibility() == 0)) {
                if (this.f7368.getVisibility() != 0) {
                    z = false;
                }
                if (!z) {
                    i = this.f7418.getPaddingRight();
                }
            }
            textView.setPadding(paddingLeft, paddingTop, i, this.f7418.getPaddingBottom());
        }
    }

    public void setEnabled(boolean z) {
        m8391((ViewGroup) this, z);
        super.setEnabled(z);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m8391(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m8391((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    private void m8411() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f7442;
        if (textView != null) {
            m8392(textView, this.f7373 ? this.f7400 : this.f7388);
            if (!this.f7373 && (colorStateList2 = this.f7427) != null) {
                this.f7442.setTextColor(colorStateList2);
            }
            if (this.f7373 && (colorStateList = this.f7430) != null) {
                this.f7442.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m8392(TextView textView, int i) {
        boolean z = true;
        try {
            C0893.m6632(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0893.m6632(textView, (int) R.style.f173812131951931);
            textView.setTextColor(C0651.m5450(getContext(), R.color.f156282131099742));
        }
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    private int m8395() {
        float r0;
        if (!this.f7394) {
            return 0;
        }
        int i = this.f7390;
        if (i == 0 || i == 1) {
            r0 = this.f7387.m15116();
        } else if (i != 2) {
            return 0;
        } else {
            r0 = this.f7387.m15116() / 2.0f;
        }
        return (int) r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int m8389(int i, boolean z) {
        int compoundPaddingLeft = i + this.f7418.getCompoundPaddingLeft();
        return (this.f7433 == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f7414.getMeasuredWidth()) + this.f7414.getPaddingLeft();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private int m8402(int i, boolean z) {
        int compoundPaddingRight = i - this.f7418.getCompoundPaddingRight();
        return (this.f7433 == null || !z) ? compoundPaddingRight : compoundPaddingRight + this.f7414.getMeasuredWidth() + this.f7414.getPaddingRight();
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    private int m8388() {
        int i = this.f7413;
        if (this.f7390 != 1) {
            return i;
        }
        return C0960.m6875(this.f7413, C2724.m14458(getContext(), R.attr.f150352130968822));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if ((r4.f7412 >= 0 && r4.f7409 != 0) != false) goto L_0x0020;
     */
    /* renamed from: ȷ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8386() {
        /*
            r4 = this;
            o.Ɨŧ r0 = r4.f7443
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            o.ƭł r1 = r4.f7440
            r0.setShapeAppearanceModel(r1)
            int r0 = r4.f7390
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x001f
            int r0 = r4.f7412
            if (r0 < 0) goto L_0x001b
            int r0 = r4.f7409
            if (r0 == 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            if (r2 == 0) goto L_0x002c
            o.Ɨŧ r0 = r4.f7443
            int r1 = r4.f7412
            float r1 = (float) r1
            int r2 = r4.f7409
            r0.m5532((float) r1, (int) r2)
        L_0x002c:
            int r0 = r4.m8388()
            r4.f7413 = r0
            o.Ɨŧ r0 = r4.f7443
            int r1 = r4.f7413
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            o.Ɨŧ$if r2 = r0.f4785
            android.content.res.ColorStateList r2 = r2.f4804
            if (r2 == r1) goto L_0x004b
            o.Ɨŧ$if r2 = r0.f4785
            r2.f4804 = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L_0x004b:
            int r0 = r4.f7386
            r1 = 3
            if (r0 != r1) goto L_0x0059
            android.widget.EditText r0 = r4.f7418
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x0059:
            r4.m8398()
            r4.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1336.m8386():void");
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    private void m8398() {
        if (this.f7438 != null) {
            if (this.f7412 >= 0 && this.f7409 != 0) {
                C0671 r0 = this.f7438;
                ColorStateList valueOf = ColorStateList.valueOf(this.f7409);
                if (r0.f4785.f4804 != valueOf) {
                    r0.f4785.f4804 = valueOf;
                    r0.onStateChange(r0.getState());
                }
            }
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8416() {
        Drawable background;
        TextView textView;
        EditText editText = this.f7418;
        if (editText != null && this.f7390 == 0 && (background = editText.getBackground()) != null) {
            if (C2674.m14212(background)) {
                background = background.mutate();
            }
            if (this.f7363.m7471()) {
                C1093 r1 = this.f7363;
                background.setColorFilter(C1641.m9447(r1.f6504 != null ? r1.f6504.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
            } else if (!this.f7373 || (textView = this.f7442) == null) {
                C1266.m8159(background);
                this.f7418.refreshDrawableState();
            } else {
                background.setColorFilter(C1641.m9447(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* renamed from: o.ɪƨ$ı  reason: contains not printable characters */
    static class C1337 extends C1219 {
        public static final Parcelable.Creator<C1337> CREATOR = new Parcelable.ClassLoaderCreator<C1337>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1337(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C1337[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C1337(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        boolean f7449;

        /* renamed from: ɩ  reason: contains not printable characters */
        CharSequence f7450;

        C1337(Parcelable parcelable) {
            super(parcelable);
        }

        C1337(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7450 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7449 = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f7450, parcel, i);
            parcel.writeInt(this.f7449 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append(this.f7450);
            sb.append("}");
            return sb.toString();
        }
    }

    public Parcelable onSaveInstanceState() {
        CharSequence charSequence;
        C1337 r1 = new C1337(super.onSaveInstanceState());
        if (this.f7363.m7471()) {
            if (this.f7363.f6521) {
                charSequence = this.f7363.f6512;
            } else {
                charSequence = null;
            }
            r1.f7450 = charSequence;
        }
        boolean z = true;
        if (!(this.f7386 != 0) || !this.f7403.isChecked()) {
            z = false;
        }
        r1.f7449 = z;
        return r1;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1337)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1337 r2 = (C1337) parcelable;
        super.onRestoreInstanceState(r2.f6905);
        setError(r2.f7450);
        if (r2.f7449) {
            this.f7403.post(new Runnable() {
                public final void run() {
                    C1336.this.f7403.performClick();
                    C1336.this.f7403.jumpDrawablesToCurrentState();
                }
            });
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f7405 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f7405 = false;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f7407 = z;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        if (this.f7418 == null || this.f7418.getMeasuredHeight() >= (max = Math.max(this.f7375.getMeasuredHeight(), this.f7372.getMeasuredHeight()))) {
            z = false;
        } else {
            this.f7418.setMinimumHeight(max);
            z = true;
        }
        boolean r5 = m8408();
        if (z || r5) {
            this.f7418.post(new Runnable() {
                public final void run() {
                    C1336.this.f7418.requestLayout();
                }
            });
        }
        if (this.f7437 != null && (editText = this.f7418) != null) {
            this.f7437.setGravity((editText.getGravity() & -113) | 48);
            this.f7437.setPadding(this.f7418.getCompoundPaddingLeft(), this.f7418.getCompoundPaddingTop(), this.f7418.getCompoundPaddingRight(), this.f7418.getCompoundPaddingBottom());
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C3257Con.m1345(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f7444.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m8404(this.f7444, this.f7379, this.f7364, this.f7365, this.f7378);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C2861 r0 = this.f7444;
        View.OnLongClickListener onLongClickListener = this.f7404;
        r0.setOnClickListener(onClickListener);
        m8403(r0, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7404 = onLongClickListener;
        C2861 r0 = this.f7444;
        r0.setOnLongClickListener(onLongClickListener);
        m8403(r0, onLongClickListener);
    }

    public void setStartIconCheckable(boolean z) {
        this.f7444.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f7364 != colorStateList) {
            this.f7364 = colorStateList;
            this.f7379 = true;
            m8404(this.f7444, this.f7379, this.f7364, this.f7365, this.f7378);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f7378 != mode) {
            this.f7378 = mode;
            this.f7365 = true;
            m8404(this.f7444, this.f7379, this.f7364, this.f7365, this.f7378);
        }
    }

    public void setEndIconMode(int i) {
        int i2 = this.f7386;
        this.f7386 = i;
        setEndIconVisible(i != 0);
        if (m8379().m7477(this.f7390)) {
            m8379().m7479();
            m8404(this.f7403, this.f7415, this.f7408, this.f7436, this.f7366);
            m8383(i2);
            return;
        }
        StringBuilder sb = new StringBuilder("The current box background mode ");
        sb.append(this.f7390);
        sb.append(" is not supported by the end icon mode ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C2861 r0 = this.f7403;
        View.OnLongClickListener onLongClickListener = this.f7367;
        r0.setOnClickListener(onClickListener);
        m8403(r0, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7367 = onLongClickListener;
        C2861 r0 = this.f7403;
        r0.setOnLongClickListener(onLongClickListener);
        m8403(r0, onLongClickListener);
    }

    public void setEndIconActivated(boolean z) {
        this.f7403.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f7403.setCheckable(z);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C3257Con.m1345(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f7403.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f7408 != colorStateList) {
            this.f7408 = colorStateList;
            this.f7415 = true;
            m8404(this.f7403, this.f7415, this.f7408, this.f7436, this.f7366);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f7366 != mode) {
            this.f7366 = mode;
            this.f7436 = true;
            m8404(this.f7403, this.f7415, this.f7408, this.f7436, this.f7366);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C3257Con.m1345(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f7403.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f7403.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f7386 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f7408 = colorStateList;
        this.f7415 = true;
        m8404(this.f7403, this.f7415, this.f7408, this.f7436, this.f7366);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f7366 = mode;
        this.f7436 = true;
        m8404(this.f7403, this.f7415, this.f7408, this.f7436, this.f7366);
    }

    public void setTextInputAccessibilityDelegate(C1338 r2) {
        EditText editText = this.f7418;
        if (editText != null) {
            C0293.m4151((View) editText, (C2449) r2);
        }
    }

    /* renamed from: ł  reason: contains not printable characters */
    private C1097 m8379() {
        C1097 r0 = this.f7416.get(this.f7386);
        if (r0 != null) {
            return r0;
        }
        return this.f7416.get(0);
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    private void m8378() {
        Iterator<C1339> it = this.f7370.iterator();
        while (it.hasNext()) {
            it.next().m8419(this);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m8383(int i) {
        Iterator<If> it = this.f7432.iterator();
        while (it.hasNext()) {
            it.next().m8417(this, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0  */
    /* renamed from: г  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8408() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f7418
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            o.ӊ r0 = r10.f7444
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r2 = 1
            if (r0 != 0) goto L_0x0013
            java.lang.CharSequence r0 = r10.f7433
            if (r0 == 0) goto L_0x001d
        L_0x0013:
            android.widget.LinearLayout r0 = r10.f7372
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x001d
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r3 = 0
            r4 = 3
            r5 = 2
            if (r0 == 0) goto L_0x0060
            android.widget.LinearLayout r0 = r10.f7372
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f7418
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f7384
            if (r6 == 0) goto L_0x0038
            int r6 = r10.f7385
            if (r6 == r0) goto L_0x0048
        L_0x0038:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f7384 = r6
            r10.f7385 = r0
            android.graphics.drawable.Drawable r0 = r10.f7384
            int r6 = r10.f7385
            r0.setBounds(r1, r1, r6, r2)
        L_0x0048:
            android.widget.EditText r0 = r10.f7418
            android.graphics.drawable.Drawable[] r0 = o.C0893.m6630((android.widget.TextView) r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f7384
            if (r6 == r7) goto L_0x0079
            android.widget.EditText r6 = r10.f7418
            r8 = r0[r2]
            r9 = r0[r5]
            r0 = r0[r4]
            o.C0893.m6621(r6, r7, r8, r9, r0)
            goto L_0x0077
        L_0x0060:
            android.graphics.drawable.Drawable r0 = r10.f7384
            if (r0 == 0) goto L_0x0079
            android.widget.EditText r0 = r10.f7418
            android.graphics.drawable.Drawable[] r0 = o.C0893.m6630((android.widget.TextView) r0)
            android.widget.EditText r6 = r10.f7418
            r7 = r0[r2]
            r8 = r0[r5]
            r0 = r0[r4]
            o.C0893.m6621(r6, r3, r7, r8, r0)
            r10.f7384 = r3
        L_0x0077:
            r0 = 1
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            boolean r6 = r10.m8399()
            if (r6 == 0) goto L_0x00f0
            android.widget.TextView r3 = r10.f7434
            int r3 = r3.getMeasuredWidth()
            android.widget.EditText r6 = r10.f7418
            int r6 = r6.getPaddingRight()
            int r3 = r3 - r6
            o.ӊ r6 = r10.m8387()
            if (r6 == 0) goto L_0x00a3
            int r7 = r6.getMeasuredWidth()
            int r3 = r3 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = o.C2826.m14763(r6)
            int r3 = r3 + r6
        L_0x00a3:
            android.widget.EditText r6 = r10.f7418
            android.graphics.drawable.Drawable[] r6 = o.C0893.m6630((android.widget.TextView) r6)
            android.graphics.drawable.Drawable r7 = r10.f7419
            if (r7 == 0) goto L_0x00c6
            int r8 = r10.f7426
            if (r8 == r3) goto L_0x00c6
            r10.f7426 = r3
            int r0 = r10.f7426
            r7.setBounds(r1, r1, r0, r2)
            android.widget.EditText r0 = r10.f7418
            r1 = r6[r1]
            r3 = r6[r2]
            android.graphics.drawable.Drawable r5 = r10.f7419
            r4 = r6[r4]
            o.C0893.m6621(r0, r1, r3, r5, r4)
            goto L_0x0113
        L_0x00c6:
            android.graphics.drawable.Drawable r7 = r10.f7419
            if (r7 != 0) goto L_0x00da
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f7419 = r7
            r10.f7426 = r3
            android.graphics.drawable.Drawable r3 = r10.f7419
            int r7 = r10.f7426
            r3.setBounds(r1, r1, r7, r2)
        L_0x00da:
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f7419
            if (r3 == r7) goto L_0x0112
            r0 = r6[r5]
            r10.f7424 = r0
            android.widget.EditText r0 = r10.f7418
            r1 = r6[r1]
            r3 = r6[r2]
            r4 = r6[r4]
            o.C0893.m6621(r0, r1, r3, r7, r4)
            goto L_0x0113
        L_0x00f0:
            android.graphics.drawable.Drawable r6 = r10.f7419
            if (r6 == 0) goto L_0x0112
            android.widget.EditText r6 = r10.f7418
            android.graphics.drawable.Drawable[] r6 = o.C0893.m6630((android.widget.TextView) r6)
            r5 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f7419
            if (r5 != r7) goto L_0x010e
            android.widget.EditText r0 = r10.f7418
            r1 = r6[r1]
            r5 = r6[r2]
            android.graphics.drawable.Drawable r7 = r10.f7424
            r4 = r6[r4]
            o.C0893.m6621(r0, r1, r5, r7, r4)
            goto L_0x010f
        L_0x010e:
            r2 = r0
        L_0x010f:
            r10.f7419 = r3
            goto L_0x0113
        L_0x0112:
            r2 = r0
        L_0x0113:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1336.m8408():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if ((r3.f7391.getVisibility() == 0 && r3.f7403.getVisibility() == 0) == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r3.f7429 != null) goto L_0x002c;
     */
    /* renamed from: ʟ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8399() {
        /*
            r3 = this;
            o.ӊ r0 = r3.f7368
            int r0 = r0.getVisibility()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            int r0 = r3.f7386
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x0028
            android.widget.FrameLayout r0 = r3.f7391
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0025
            o.ӊ r0 = r3.f7403
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 != 0) goto L_0x002c
        L_0x0028:
            java.lang.CharSequence r0 = r3.f7429
            if (r0 == 0) goto L_0x0035
        L_0x002c:
            android.widget.LinearLayout r0 = r3.f7375
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0035
            return r1
        L_0x0035:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1336.m8399():boolean");
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    private C2861 m8387() {
        if (this.f7368.getVisibility() == 0) {
            return this.f7368;
        }
        boolean z = true;
        if (!(this.f7386 != 0)) {
            return null;
        }
        if (!(this.f7391.getVisibility() == 0 && this.f7403.getVisibility() == 0)) {
            z = false;
        }
        if (z) {
            return this.f7403;
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m8404(C2861 r1, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = r1.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C1266.m8158(drawable).mutate();
            if (z) {
                C1266.m8152(drawable, colorStateList);
            }
            if (z2) {
                C1266.m8153(drawable, mode);
            }
        }
        if (r1.getDrawable() != drawable) {
            r1.setImageDrawable(drawable);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m8403(C2861 r3, View.OnLongClickListener onLongClickListener) {
        boolean r0 = C0293.m4172(r3);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (r0 || z2) {
            z = true;
        }
        r3.setFocusable(z);
        r3.setClickable(r0);
        r3.setPressable(r0);
        r3.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        C0293.m4203((View) r3, i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f7418;
        if (editText != null) {
            Rect rect = this.f7411;
            boolean z2 = false;
            rect.set(0, 0, editText.getWidth(), editText.getHeight());
            C2715.m14418(this, editText, rect);
            if (this.f7438 != null) {
                this.f7438.setBounds(rect.left, rect.bottom - this.f7410, rect.right, rect.bottom);
            }
            if (this.f7394) {
                this.f7387.m15117(this.f7418.getTextSize());
                int gravity = this.f7418.getGravity() & -113;
                this.f7387.m15104(gravity | 48);
                this.f7387.m15121(gravity);
                C2927 r4 = this.f7387;
                if (this.f7418 != null) {
                    Rect rect2 = this.f7417;
                    boolean z3 = C0293.m4156(this) == 1;
                    rect2.bottom = rect.bottom;
                    int i7 = this.f7390;
                    if (i7 == 1) {
                        rect2.left = m8389(rect.left, z3);
                        rect2.top = rect.top + this.f7435;
                        rect2.right = m8402(rect.right, z3);
                    } else if (i7 != 2) {
                        rect2.left = m8389(rect.left, z3);
                        rect2.top = getPaddingTop();
                        rect2.right = m8402(rect.right, z3);
                    } else {
                        rect2.left = rect.left + this.f7418.getPaddingLeft();
                        rect2.top = rect.top - m8395();
                        rect2.right = rect.right - this.f7418.getPaddingRight();
                    }
                    r4.m15114(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    C2927 r42 = this.f7387;
                    if (this.f7418 != null) {
                        Rect rect3 = this.f7417;
                        TextPaint textPaint = r42.f13582;
                        textPaint.setTextSize(r42.f13561);
                        textPaint.setTypeface(r42.f13565);
                        float f = -r42.f13582.ascent();
                        rect3.left = rect.left + this.f7418.getCompoundPaddingLeft();
                        if (this.f7390 == 1 && (Build.VERSION.SDK_INT < 16 || this.f7418.getMinLines() <= 1)) {
                            i5 = (int) (((float) rect.centerY()) - (f / 2.0f));
                        } else {
                            i5 = rect.top + this.f7418.getCompoundPaddingTop();
                        }
                        rect3.top = i5;
                        rect3.right = rect.right - this.f7418.getCompoundPaddingRight();
                        if (this.f7390 == 1) {
                            i6 = (int) (((float) rect3.top) + f);
                        } else {
                            i6 = rect.bottom - this.f7418.getCompoundPaddingBottom();
                        }
                        rect3.bottom = i6;
                        r42.m15119(rect3.left, rect3.top, rect3.right, rect3.bottom);
                        this.f7387.m15113();
                        if (this.f7394 && !TextUtils.isEmpty(this.f7382) && (this.f7443 instanceof C1198)) {
                            z2 = true;
                        }
                        if (z2 && !this.f7371) {
                            m8381();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f7394) {
            this.f7387.m15106(canvas);
        }
        C0671 r0 = this.f7438;
        if (r0 != null) {
            Rect bounds = r0.getBounds();
            bounds.top = bounds.bottom - this.f7412;
            this.f7438.draw(canvas);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m8385(boolean z) {
        ValueAnimator valueAnimator = this.f7439;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f7439.cancel();
        }
        if (!z || !this.f7407) {
            this.f7387.m15120(1.0f);
        } else {
            m8400(1.0f);
        }
        boolean z2 = false;
        this.f7371 = false;
        if (this.f7394 && !TextUtils.isEmpty(this.f7382) && (this.f7443 instanceof C1198)) {
            z2 = true;
        }
        if (z2) {
            m8381();
        }
        m8412();
        m8380();
        m8409();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m8375(RectF rectF) {
        rectF.left -= (float) this.f7396;
        rectF.top -= (float) this.f7396;
        rectF.right += (float) this.f7396;
        rectF.bottom += (float) this.f7396;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z;
        boolean z2;
        if (!this.f7441) {
            boolean z3 = true;
            this.f7441 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C2927 r2 = this.f7387;
            if (r2 != null) {
                r2.f13570 = drawableState;
                if (r2.m15112()) {
                    if (r2.f13575.getHeight() > 0 && r2.f13575.getWidth() > 0) {
                        r2.m15103();
                        r2.m15107(r2.f13569);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2 | false;
            } else {
                z = false;
            }
            if (this.f7418 != null) {
                if (!C0293.m4186(this) || !isEnabled()) {
                    z3 = false;
                }
                m8414(z3, false);
            }
            m8416();
            m8415();
            if (z) {
                invalidate();
            }
            this.f7441 = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.f7418;
     */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m8415() {
        /*
            r6 = this;
            o.Ɨŧ r0 = r6.f7443
            if (r0 == 0) goto L_0x0102
            int r0 = r6.f7390
            if (r0 != 0) goto L_0x000a
            goto L_0x0102
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f7418
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f7418
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.f7422
            r6.f7409 = r4
            goto L_0x0089
        L_0x003f:
            o.ɐɩ r4 = r6.f7363
            boolean r4 = r4.m7471()
            if (r4 == 0) goto L_0x0060
            android.content.res.ColorStateList r4 = r6.f7393
            if (r4 == 0) goto L_0x004f
            r6.m8394((boolean) r0, (boolean) r3)
            goto L_0x0089
        L_0x004f:
            o.ɐɩ r4 = r6.f7363
            android.widget.TextView r5 = r4.f6504
            if (r5 == 0) goto L_0x005c
            android.widget.TextView r4 = r4.f6504
            int r4 = r4.getCurrentTextColor()
            goto L_0x005d
        L_0x005c:
            r4 = -1
        L_0x005d:
            r6.f7409 = r4
            goto L_0x0089
        L_0x0060:
            boolean r4 = r6.f7373
            if (r4 == 0) goto L_0x0077
            android.widget.TextView r4 = r6.f7442
            if (r4 == 0) goto L_0x0077
            android.content.res.ColorStateList r5 = r6.f7393
            if (r5 == 0) goto L_0x0070
            r6.m8394((boolean) r0, (boolean) r3)
            goto L_0x0089
        L_0x0070:
            int r4 = r4.getCurrentTextColor()
            r6.f7409 = r4
            goto L_0x0089
        L_0x0077:
            if (r0 == 0) goto L_0x007e
            int r4 = r6.f7401
            r6.f7409 = r4
            goto L_0x0089
        L_0x007e:
            if (r3 == 0) goto L_0x0085
            int r4 = r6.f7383
            r6.f7409 = r4
            goto L_0x0089
        L_0x0085:
            int r4 = r6.f7395
            r6.f7409 = r4
        L_0x0089:
            o.ӊ r4 = r6.f7368
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            if (r4 == 0) goto L_0x00a0
            o.ɐɩ r4 = r6.f7363
            boolean r4 = r4.f6521
            if (r4 == 0) goto L_0x00a0
            o.ɐɩ r4 = r6.f7363
            boolean r4 = r4.m7471()
            if (r4 == 0) goto L_0x00a0
            r1 = 1
        L_0x00a0:
            r6.m8405(r1)
            o.ӊ r1 = r6.f7368
            android.content.res.ColorStateList r4 = r6.f7369
            r6.m8376(r1, r4)
            o.ӊ r1 = r6.f7444
            android.content.res.ColorStateList r4 = r6.f7364
            r6.m8376(r1, r4)
            o.ӊ r1 = r6.f7403
            android.content.res.ColorStateList r4 = r6.f7408
            r6.m8376(r1, r4)
            o.ɐι r1 = r6.m8379()
            boolean r1 = r1.m7476()
            if (r1 == 0) goto L_0x00cb
            o.ɐɩ r1 = r6.f7363
            boolean r1 = r1.m7471()
            r6.m8401((boolean) r1)
        L_0x00cb:
            if (r0 == 0) goto L_0x00d8
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00d8
            int r1 = r6.f7410
            r6.f7412 = r1
            goto L_0x00dc
        L_0x00d8:
            int r1 = r6.f7399
            r6.f7412 = r1
        L_0x00dc:
            int r1 = r6.f7390
            if (r1 != r2) goto L_0x00ff
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00eb
            int r0 = r6.f7406
            r6.f7413 = r0
            goto L_0x00ff
        L_0x00eb:
            if (r3 == 0) goto L_0x00f4
            if (r0 != 0) goto L_0x00f4
            int r0 = r6.f7420
            r6.f7413 = r0
            goto L_0x00ff
        L_0x00f4:
            if (r0 == 0) goto L_0x00fb
            int r0 = r6.f7423
            r6.f7413 = r0
            goto L_0x00ff
        L_0x00fb:
            int r0 = r6.f7392
            r6.f7413 = r0
        L_0x00ff:
            r6.m8386()
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1336.m8415():void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m8394(boolean z, boolean z2) {
        int defaultColor = this.f7393.getDefaultColor();
        int colorForState = this.f7393.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f7393.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f7409 = colorForState2;
        } else if (z2) {
            this.f7409 = colorForState;
        } else {
            this.f7409 = defaultColor;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m8405(boolean z) {
        int i = 8;
        boolean z2 = false;
        this.f7368.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f7391;
        if (!z) {
            i = 0;
        }
        frameLayout.setVisibility(i);
        m8397();
        if (this.f7386 != 0) {
            z2 = true;
        }
        if (!z2) {
            m8408();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m8376(C2861 r4, ColorStateList colorStateList) {
        Drawable drawable = r4.getDrawable();
        if (r4.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            Drawable mutate = C1266.m8158(drawable).mutate();
            C1266.m8152(mutate, ColorStateList.valueOf(colorForState));
            r4.setImageDrawable(mutate);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m8377(boolean z) {
        ValueAnimator valueAnimator = this.f7439;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f7439.cancel();
        }
        if (!z || !this.f7407) {
            this.f7387.m15120(0.0f);
        } else {
            m8400(0.0f);
        }
        boolean z2 = false;
        if ((this.f7394 && !TextUtils.isEmpty(this.f7382) && (this.f7443 instanceof C1198)) && (!((C1198) this.f7443).f6854.isEmpty())) {
            if (this.f7394 && !TextUtils.isEmpty(this.f7382) && (this.f7443 instanceof C1198)) {
                z2 = true;
            }
            if (z2) {
                ((C1198) this.f7443).m7810(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        this.f7371 = true;
        TextView textView = this.f7437;
        if (textView != null && this.f7397) {
            textView.setText((CharSequence) null);
            this.f7437.setVisibility(4);
        }
        m8380();
        m8409();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m8400(float f) {
        if (this.f7387.f13569 != f) {
            if (this.f7439 == null) {
                this.f7439 = new ValueAnimator();
                this.f7439.setInterpolator(C1311.f7289);
                this.f7439.setDuration(167);
                this.f7439.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C1336.this.f7387.m15120(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
            }
            this.f7439.setFloatValues(new float[]{this.f7387.f13569, f});
            this.f7439.start();
        }
    }

    /* renamed from: o.ɪƨ$ǃ  reason: contains not printable characters */
    public static class C1338 extends C2449 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C1336 f7451;

        public C1338(C1336 r1) {
            this.f7451 = r1;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m8418(View view, C0520 r15) {
            CharSequence charSequence;
            CharSequence charSequence2;
            String str;
            String str2;
            super.m12579(view, r15);
            EditText editText = this.f7451.f7418;
            CharSequence charSequence3 = null;
            Editable text = editText != null ? editText.getText() : null;
            C1336 r1 = this.f7451;
            CharSequence charSequence4 = r1.f7394 ? r1.f7382 : null;
            C1336 r2 = this.f7451;
            if (r2.f7363.f6513) {
                charSequence = r2.f7363.f6522;
            } else {
                charSequence = null;
            }
            C1336 r3 = this.f7451;
            if (r3.f7363.f6521) {
                charSequence2 = r3.f7363.f6512;
            } else {
                charSequence2 = null;
            }
            int i = this.f7451.f7421;
            C1336 r5 = this.f7451;
            if (r5.f7377 && r5.f7373 && r5.f7442 != null) {
                charSequence3 = r5.f7442.getContentDescription();
            }
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(charSequence4);
            boolean z3 = !TextUtils.isEmpty(charSequence);
            boolean z4 = !TextUtils.isEmpty(charSequence2);
            boolean z5 = z4 || !TextUtils.isEmpty(charSequence3);
            if (z2) {
                str = charSequence4.toString();
            } else {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if ((z4 || z3) && !TextUtils.isEmpty(str)) {
                str2 = ", ";
            } else {
                str2 = "";
            }
            sb.append(str2);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            if (z4) {
                charSequence = charSequence2;
            } else if (!z3) {
                charSequence = "";
            }
            sb2.append(charSequence);
            String obj2 = sb2.toString();
            if (z) {
                r15.m5059((CharSequence) text);
            } else if (!TextUtils.isEmpty(obj2)) {
                r15.m5059((CharSequence) obj2);
            }
            if (!TextUtils.isEmpty(obj2)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    r15.m5039((CharSequence) obj2);
                } else {
                    if (z) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(text);
                        sb3.append(", ");
                        sb3.append(obj2);
                        obj2 = sb3.toString();
                    }
                    r15.m5059((CharSequence) obj2);
                }
                r15.m5037(!z);
            }
            if (text == null || text.length() != i) {
                i = -1;
            }
            r15.m5049(i);
            if (z5) {
                if (z4) {
                    charSequence3 = charSequence2;
                }
                r15.m5062(charSequence3);
            }
        }
    }

    public void setStartIconVisible(boolean z) {
        int i = 0;
        if ((this.f7444.getVisibility() == 0) != z) {
            C2861 r0 = this.f7444;
            if (!z) {
                i = 8;
            }
            r0.setVisibility(i);
            m8410();
            m8408();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (this.f7444.getContentDescription() != charSequence) {
            this.f7444.setContentDescription(charSequence);
        }
    }

    public void setEndIconVisible(boolean z) {
        int i = 0;
        if ((this.f7391.getVisibility() == 0 && this.f7403.getVisibility() == 0) != z) {
            C2861 r0 = this.f7403;
            if (!z) {
                i = 8;
            }
            r0.setVisibility(i);
            m8397();
            m8408();
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (this.f7403.getContentDescription() != charSequence) {
            this.f7403.setContentDescription(charSequence);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m8401(boolean z) {
        if (!z || this.f7403.getDrawable() == null) {
            m8404(this.f7403, this.f7415, this.f7408, this.f7436, this.f7366);
            return;
        }
        Drawable mutate = C1266.m8158(this.f7403.getDrawable()).mutate();
        C1093 r0 = this.f7363;
        C1266.m8148(mutate, r0.f6504 != null ? r0.f6504.getCurrentTextColor() : -1);
        this.f7403.setImageDrawable(mutate);
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    private void m8381() {
        if (this.f7394 && !TextUtils.isEmpty(this.f7382) && (this.f7443 instanceof C1198)) {
            RectF rectF = this.f7431;
            this.f7387.m15122(rectF, this.f7418.getWidth(), this.f7418.getGravity());
            m8375(rectF);
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            ((C1198) this.f7443).m7810(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }
}
