package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import o.C0858;

/* renamed from: o.ɡ  reason: contains not printable characters */
public final class C1171 extends FrameLayout implements C2850, ValueAnimator.AnimatorUpdateListener, AppBarLayout.Cif {

    /* renamed from: ı  reason: contains not printable characters */
    private C2026 f6743;

    /* renamed from: ŀ  reason: contains not printable characters */
    private int f6744;

    /* renamed from: ł  reason: contains not printable characters */
    private int f6745;

    /* renamed from: ſ  reason: contains not printable characters */
    private AppBarLayout.Cif f6746;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f6747;

    /* renamed from: ǃ  reason: contains not printable characters */
    private View f6748;

    /* renamed from: ȷ  reason: contains not printable characters */
    private Drawable f6749;

    /* renamed from: ɍ  reason: contains not printable characters */
    private C0501 f6750;

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean f6751;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f6752;

    /* renamed from: ɪ  reason: contains not printable characters */
    private C2927 f6753;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f6754;

    /* renamed from: ɾ  reason: contains not printable characters */
    private Drawable f6755;

    /* renamed from: ɿ  reason: contains not printable characters */
    private boolean f6756;

    /* renamed from: ʅ  reason: contains not printable characters */
    private int f6757;

    /* renamed from: ʟ  reason: contains not printable characters */
    private long f6758;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f6759;

    /* renamed from: ι  reason: contains not printable characters */
    private View f6760;

    /* renamed from: І  reason: contains not printable characters */
    private final Rect f6761;

    /* renamed from: г  reason: contains not printable characters */
    private ValueAnimator f6762;

    /* renamed from: і  reason: contains not printable characters */
    private int f6763;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f6764;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f6765;

    public C1171(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1171(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1171(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6752 = true;
        this.f6761 = new Rect();
        this.f6745 = -1;
        this.f6753 = new C2927(this);
        C2927 r2 = this.f6753;
        r2.f13583 = C1311.f7292;
        if (r2.f13575.getHeight() > 0 && r2.f13575.getWidth() > 0) {
            r2.m15103();
            r2.m15107(r2.f13569);
        }
        int[] iArr = C0858.Aux.f5613;
        C3160.m15978(context, attributeSet, i, R.style.f174952131952216);
        C3160.m15976(context, attributeSet, iArr, i, R.style.f174952131952216, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, R.style.f174952131952216);
        C2927 r13 = this.f6753;
        int i2 = obtainStyledAttributes.getInt(3, 8388691);
        i2 = (i2 & 8388615) == 0 ? i2 | 8388611 : i2;
        if (r13.f13593 != i2) {
            r13.f13593 = i2;
            if (r13.f13575.getHeight() > 0 && r13.f13575.getWidth() > 0) {
                r13.m15103();
                r13.m15107(r13.f13569);
            }
        }
        C2927 r132 = this.f6753;
        int i3 = obtainStyledAttributes.getInt(0, 8388627);
        i3 = (8388615 & i3) == 0 ? i3 | 8388611 : i3;
        if (r132.f13592 != i3) {
            r132.f13592 = i3;
            if (r132.f13575.getHeight() > 0 && r132.f13575.getWidth() > 0) {
                r132.m15103();
                r132.m15107(r132.f13569);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f6754 = dimensionPixelSize;
        this.f6764 = dimensionPixelSize;
        this.f6747 = dimensionPixelSize;
        this.f6763 = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(7)) {
            this.f6763 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f6764 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        if (obtainStyledAttributes.hasValue(8)) {
            this.f6747 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.f6754 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        }
        this.f6765 = obtainStyledAttributes.getBoolean(14, true);
        setTitle(obtainStyledAttributes.getText(13));
        this.f6753.m15118((int) R.style.f174012131951985);
        this.f6753.m15108((int) R.style.f173922131951959);
        if (obtainStyledAttributes.hasValue(9)) {
            this.f6753.m15118(obtainStyledAttributes.getResourceId(9, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f6753.m15108(obtainStyledAttributes.getResourceId(1, 0));
        }
        this.f6745 = obtainStyledAttributes.getDimensionPixelSize(11, -1);
        this.f6758 = (long) obtainStyledAttributes.getInt(10, 600);
        setContentScrim(obtainStyledAttributes.getDrawable(2));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(12));
        this.f6759 = obtainStyledAttributes.getResourceId(15, -1);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        C0293.m4207((View) this, (C2850) this);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            C0293.m4200((View) this, C0293.m4153((View) parent));
            if (this.f6746 == null) {
                this.f6746 = this;
            }
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            AppBarLayout.Cif ifVar = this.f6746;
            if (appBarLayout.f618 == null) {
                appBarLayout.f618 = new ArrayList();
            }
            if (ifVar != null && !appBarLayout.f618.contains(ifVar)) {
                appBarLayout.f618.add(ifVar);
            }
            C0293.m4154(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.Cif ifVar = this.f6746;
        if (ifVar != null && (parent instanceof AppBarLayout)) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (!(appBarLayout.f618 == null || ifVar == null)) {
                appBarLayout.f618.remove(ifVar);
            }
        }
        super.onDetachedFromWindow();
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m7681();
        if (this.f6743 == null && (drawable = this.f6755) != null && this.f6744 > 0) {
            drawable.mutate().setAlpha(this.f6744);
            this.f6755.draw(canvas);
        }
        if (this.f6765 && this.f6751) {
            this.f6753.m15106(canvas);
        }
        if (this.f6749 != null && this.f6744 > 0) {
            C0501 r0 = this.f6750;
            int r02 = r0 != null ? r0.m4893() : 0;
            if (r02 > 0) {
                this.f6749.setBounds(0, -this.f6757, getWidth(), r02 - this.f6757);
                this.f6749.mutate().setAlpha(this.f6744);
                this.f6749.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f6755
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002f
            int r0 = r4.f6744
            if (r0 <= 0) goto L_0x002f
            android.view.View r0 = r4.f6760
            if (r0 == 0) goto L_0x0014
            if (r0 != r4) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            if (r6 != r0) goto L_0x001a
            goto L_0x0018
        L_0x0014:
            o.ιι r0 = r4.f6743
            if (r6 != r0) goto L_0x001a
        L_0x0018:
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x002f
            android.graphics.drawable.Drawable r0 = r4.f6755
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r4.f6744
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r4.f6755
            r0.draw(r5)
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            boolean r5 = super.drawChild(r5, r6, r7)
            if (r5 != 0) goto L_0x003a
            if (r0 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r2
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1171.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f6755;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7681() {
        /*
            r6 = this;
            boolean r0 = r6.f6752
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f6743 = r0
            r6.f6760 = r0
            int r1 = r6.f6759
            r2 = -1
            if (r1 == r2) goto L_0x0021
            android.view.View r1 = r6.findViewById(r1)
            o.ιι r1 = (o.C2026) r1
            r6.f6743 = r1
            o.ιι r1 = r6.f6743
            if (r1 == 0) goto L_0x0021
            android.view.View r1 = r6.m7679(r1)
            r6.f6760 = r1
        L_0x0021:
            o.ιι r1 = r6.f6743
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = 0
        L_0x002b:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof o.C2026
            if (r5 == 0) goto L_0x0039
            r0 = r4
            o.ιι r0 = (o.C2026) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003c:
            r6.f6743 = r0
        L_0x003e:
            r6.m7674()
            r6.f6752 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1171.m7681():void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private View m7679(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m7674() {
        View view;
        if (!this.f6765 && (view = this.f6748) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f6748);
            }
        }
        if (this.f6765 && this.f6743 != null) {
            if (this.f6748 == null) {
                this.f6748 = new View(getContext());
            }
            if (this.f6748.getParent() == null) {
                this.f6743.addView(this.f6748, -1, -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        m7681();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C0501 r0 = this.f6750;
        int r02 = r0 != null ? r0.m4893() : 0;
        if (mode == 0 && r02 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + r02, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        C0501 r8 = this.f6750;
        if (r8 != null) {
            int r82 = r8.m4893();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (!C0293.m4153(childAt) && childAt.getTop() < r82) {
                    C0293.m4164(childAt, r82);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            C1289 r2 = m7680(getChildAt(i8));
            r2.f7240 = r2.f7237.getTop();
            r2.f7239 = r2.f7237.getLeft();
        }
        if (this.f6765 && (view = this.f6748) != null) {
            boolean z2 = true;
            this.f6751 = C0293.m4187(view) && this.f6748.getVisibility() == 0;
            if (this.f6751) {
                if (C0293.m4156(this) != 1) {
                    z2 = false;
                }
                View view2 = this.f6760;
                if (view2 == null) {
                    view2 = this.f6743;
                }
                int r83 = m7676(view2);
                View view3 = this.f6748;
                Rect rect = this.f6761;
                rect.set(0, 0, view3.getWidth(), view3.getHeight());
                C2715.m14418(this, view3, rect);
                C2927 r22 = this.f6753;
                int i9 = this.f6761.left;
                if (z2) {
                    i5 = this.f6743.f10021;
                } else {
                    i5 = this.f6743.f10034;
                }
                int i10 = i9 + i5;
                int i11 = this.f6761.top + r83 + this.f6743.f10008;
                int i12 = this.f6761.right;
                if (z2) {
                    i6 = this.f6743.f10034;
                } else {
                    i6 = this.f6743.f10021;
                }
                r22.m15114(i10, i11, i12 + i6, (this.f6761.bottom + r83) - this.f6743.f10040);
                this.f6753.m15119(z2 ? this.f6764 : this.f6763, this.f6761.top + this.f6747, (i3 - i) - (z2 ? this.f6763 : this.f6764), (i4 - i2) - this.f6754);
                C2927 r84 = this.f6753;
                if (r84.f13575.getHeight() > 0 && r84.f13575.getWidth() > 0) {
                    r84.m15103();
                    r84.m15107(r84.f13569);
                }
            }
        }
        if (this.f6743 != null) {
            if (this.f6765 && TextUtils.isEmpty(this.f6753.f13576)) {
                setTitle(this.f6743.f10043);
            }
            View view4 = this.f6760;
            if (view4 == null || view4 == this) {
                setMinimumHeight(m7673((View) this.f6743));
            } else {
                setMinimumHeight(m7673(view4));
            }
        }
        m7677();
        int childCount3 = getChildCount();
        for (int i13 = 0; i13 < childCount3; i13++) {
            m7680(getChildAt(i13)).m8223();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m7673(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static C1289 m7680(View view) {
        C1289 r1 = (C1289) view.getTag(R.id.f168202131362446);
        if (r1 != null) {
            return r1;
        }
        C1289 r12 = new C1289(view);
        view.setTag(R.id.f168202131362446, r12);
        return r12;
    }

    public final void setTitle(CharSequence charSequence) {
        CharSequence charSequence2;
        this.f6753.m15111(charSequence);
        if (this.f6765) {
            charSequence2 = this.f6753.f13576;
        } else {
            charSequence2 = null;
        }
        setContentDescription(charSequence2);
    }

    public final void setTitleEnabled(boolean z) {
        CharSequence charSequence;
        if (z != this.f6765) {
            this.f6765 = z;
            if (this.f6765) {
                charSequence = this.f6753.f13576;
            } else {
                charSequence = null;
            }
            setContentDescription(charSequence);
            m7674();
            requestLayout();
        }
    }

    public final void setScrimsShown(boolean z) {
        setScrimsShown(z, C0293.m4186(this) && !isInEditMode());
    }

    public final void setScrimsShown(boolean z, boolean z2) {
        if (this.f6756 != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                m7681();
                ValueAnimator valueAnimator = this.f6762;
                if (valueAnimator == null) {
                    this.f6762 = new ValueAnimator();
                    this.f6762.setDuration(this.f6758);
                    this.f6762.setInterpolator(i > this.f6744 ? C1311.f7288 : C1311.f7291);
                    this.f6762.addUpdateListener(this);
                } else if (valueAnimator.isRunning()) {
                    this.f6762.cancel();
                }
                this.f6762.setIntValues(new int[]{this.f6744, i});
                this.f6762.start();
            } else {
                if (!z) {
                    i = 0;
                }
                m7678(i);
            }
            this.f6756 = z;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m7678(int i) {
        C2026 r0;
        if (i != this.f6744) {
            if (!(this.f6755 == null || (r0 = this.f6743) == null)) {
                C0293.m4176(r0);
            }
            this.f6744 = i;
            C0293.m4176(this);
        }
    }

    public final void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f6755;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f6755 = drawable3;
            Drawable drawable4 = this.f6755;
            if (drawable4 != null) {
                drawable4.setBounds(0, 0, getWidth(), getHeight());
                this.f6755.setCallback(this);
                this.f6755.setAlpha(this.f6744);
            }
            C0293.m4176(this);
        }
    }

    public final void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public final void setContentScrimResource(int i) {
        setContentScrim(C0651.m5458(getContext(), i));
    }

    public final void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f6749;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f6749 = drawable3;
            Drawable drawable4 = this.f6749;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f6749.setState(getDrawableState());
                }
                C1266.m8157(this.f6749, C0293.m4156(this));
                this.f6749.setVisible(getVisibility() == 0, false);
                this.f6749.setCallback(this);
                this.f6749.setAlpha(this.f6744);
            }
            C0293.m4176(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6749;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState) | false;
        Drawable drawable2 = this.f6755;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        C2927 r3 = this.f6753;
        if (r3 != null) {
            r3.f13570 = drawableState;
            if (r3.m15112()) {
                if (r3.f13575.getHeight() > 0 && r3.f13575.getWidth() > 0) {
                    r3.m15103();
                    r3.m15107(r3.f13569);
                }
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6755 || drawable == this.f6749;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f6749;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f6749.setVisible(z, false);
        }
        Drawable drawable2 = this.f6755;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f6755.setVisible(z, false);
        }
    }

    public final void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public final void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C0651.m5458(getContext(), i));
    }

    public final void setCollapsedTitleTextAppearance(int i) {
        this.f6753.m15108(i);
    }

    public final void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        C2927 r0 = this.f6753;
        if (r0.f13596 != colorStateList) {
            r0.f13596 = colorStateList;
            if (r0.f13575.getHeight() > 0 && r0.f13575.getWidth() > 0) {
                r0.m15103();
                r0.m15107(r0.f13569);
            }
        }
    }

    public final void setCollapsedTitleGravity(int i) {
        C2927 r0 = this.f6753;
        if ((8388615 & i) == 0) {
            i |= 8388611;
        }
        if (r0.f13592 != i) {
            r0.f13592 = i;
            if (r0.f13575.getHeight() > 0 && r0.f13575.getWidth() > 0) {
                r0.m15103();
                r0.m15107(r0.f13569);
            }
        }
    }

    public final void setExpandedTitleTextAppearance(int i) {
        this.f6753.m15118(i);
    }

    public final void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C2927 r0 = this.f6753;
        if (r0.f13602 != colorStateList) {
            r0.f13602 = colorStateList;
            if (r0.f13575.getHeight() > 0 && r0.f13575.getWidth() > 0) {
                r0.m15103();
                r0.m15107(r0.f13569);
            }
        }
    }

    public final void setExpandedTitleGravity(int i) {
        C2927 r0 = this.f6753;
        if ((8388615 & i) == 0) {
            i |= 8388611;
        }
        if (r0.f13593 != i) {
            r0.f13593 = i;
            if (r0.f13575.getHeight() > 0 && r0.f13575.getWidth() > 0) {
                r0.m15103();
                r0.m15107(r0.f13569);
            }
        }
    }

    public final void setCollapsedTitleTypeface(Typeface typeface) {
        C2927 r0 = this.f6753;
        boolean z = true;
        if (r0.f13574 != null) {
            r0.f13574.f14565 = true;
        }
        if (r0.f13578 != typeface) {
            r0.f13578 = typeface;
        } else {
            z = false;
        }
        if (z && r0.f13575.getHeight() > 0 && r0.f13575.getWidth() > 0) {
            r0.m15103();
            r0.m15107(r0.f13569);
        }
    }

    public final void setExpandedTitleTypeface(Typeface typeface) {
        C2927 r0 = this.f6753;
        boolean z = true;
        if (r0.f13605 != null) {
            r0.f13605.f14565 = true;
        }
        if (r0.f13565 != typeface) {
            r0.f13565 = typeface;
        } else {
            z = false;
        }
        if (z && r0.f13575.getHeight() > 0 && r0.f13575.getWidth() > 0) {
            r0.m15103();
            r0.m15107(r0.f13569);
        }
    }

    public final void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.f6763 = i;
        this.f6747 = i2;
        this.f6764 = i3;
        this.f6754 = i4;
        requestLayout();
    }

    public final void setExpandedTitleMarginStart(int i) {
        this.f6763 = i;
        requestLayout();
    }

    public final void setExpandedTitleMarginTop(int i) {
        this.f6747 = i;
        requestLayout();
    }

    public final void setExpandedTitleMarginEnd(int i) {
        this.f6764 = i;
        requestLayout();
    }

    public final void setExpandedTitleMarginBottom(int i) {
        this.f6754 = i;
        requestLayout();
    }

    public final void setScrimVisibleHeightTrigger(int i) {
        if (this.f6745 != i) {
            this.f6745 = i;
            m7677();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private int m7675() {
        int i = this.f6745;
        if (i >= 0) {
            return i;
        }
        C0501 r0 = this.f6750;
        int r02 = r0 != null ? r0.m4893() : 0;
        int r1 = C0293.m4182(this);
        if (r1 > 0) {
            return Math.min((r1 << 1) + r02, getHeight());
        }
        return getHeight() / 3;
    }

    public final void setScrimAnimationDuration(long j) {
        this.f6758 = j;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1172;
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1172(getContext(), attributeSet);
    }

    /* renamed from: o.ɡ$ɩ  reason: contains not printable characters */
    public static class C1172 extends FrameLayout.LayoutParams {

        /* renamed from: ǃ  reason: contains not printable characters */
        float f6766 = 0.5f;

        /* renamed from: Ι  reason: contains not printable characters */
        int f6767 = 0;

        public C1172(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858.Aux.f5581);
            this.f6767 = obtainStyledAttributes.getInt(0, 0);
            this.f6766 = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public C1172() {
            super(-1, -1);
        }

        public C1172(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m7677() {
        if (this.f6755 != null || this.f6749 != null) {
            setScrimsShown(getHeight() + this.f6757 < m7675());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private int m7676(View view) {
        return ((getHeight() - m7680(view).f7240) - view.getHeight()) - ((C1172) view.getLayoutParams()).bottomMargin;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1172(layoutParams);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0501 m7683(View view, C0501 r3) {
        C0501 r2 = C0293.m4153(this) ? r3 : null;
        if (!C2408.m12453(this.f6750, r2)) {
            this.f6750 = r2;
            requestLayout();
        }
        return r3.m4896();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        m7678(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m7682(int i) {
        this.f6757 = i;
        C0501 r0 = this.f6750;
        int r02 = r0 != null ? r0.m4893() : 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1172 r5 = (C1172) childAt.getLayoutParams();
            C1289 r6 = m7680(childAt);
            int i3 = r5.f6767;
            if (i3 == 1) {
                int i4 = -i;
                int r4 = m7676(childAt);
                if (i4 < 0) {
                    r4 = 0;
                } else if (i4 <= r4) {
                    r4 = i4;
                }
                if (r6.f7243 && r6.f7238 != r4) {
                    r6.f7238 = r4;
                    r6.m8223();
                }
            } else if (i3 == 2) {
                int round = Math.round(((float) (-i)) * r5.f6766);
                if (r6.f7243 && r6.f7238 != round) {
                    r6.f7238 = round;
                    r6.m8223();
                }
            }
        }
        m7677();
        if (this.f6749 != null && r02 > 0) {
            C0293.m4176(this);
        }
        int height = (getHeight() - C0293.m4182(this)) - r02;
        C2927 r03 = this.f6753;
        float abs = ((float) Math.abs(i)) / ((float) height);
        if (abs < 0.0f) {
            abs = 0.0f;
        } else if (abs > 1.0f) {
            abs = 1.0f;
        }
        if (abs != r03.f13569) {
            r03.f13569 = abs;
            r03.m15107(r03.f13569);
        }
    }
}
