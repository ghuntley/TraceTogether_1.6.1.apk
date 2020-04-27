package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import o.C0520;
import o.C1068;

/* renamed from: o.ɍı  reason: contains not printable characters */
public class C1059 extends ViewGroup {

    /* renamed from: ǃ  reason: contains not printable characters */
    static final boolean f6339 = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: ȷ  reason: contains not printable characters */
    private static final boolean f6340;

    /* renamed from: ɩ  reason: contains not printable characters */
    static final int[] f6341 = {16842931};

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final int[] f6342 = {16843828};

    /* renamed from: ı  reason: contains not printable characters */
    final C1068 f6343;

    /* renamed from: ŀ  reason: contains not printable characters */
    private boolean f6344;

    /* renamed from: ł  reason: contains not printable characters */
    private Paint f6345;

    /* renamed from: ſ  reason: contains not printable characters */
    private boolean f6346;

    /* renamed from: Ɩ  reason: contains not printable characters */
    CharSequence f6347;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private int f6348;

    /* renamed from: ƚ  reason: contains not printable characters */
    private int f6349;

    /* renamed from: ǀ  reason: contains not printable characters */
    private Drawable f6350;

    /* renamed from: ɍ  reason: contains not printable characters */
    private int f6351;

    /* renamed from: ɔ  reason: contains not printable characters */
    private float f6352;

    /* renamed from: ɟ  reason: contains not printable characters */
    private C1060 f6353;

    /* renamed from: ɨ  reason: contains not printable characters */
    private float f6354;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f6355;

    /* renamed from: ɭ  reason: contains not printable characters */
    private Matrix f6356;

    /* renamed from: ɹ  reason: contains not printable characters */
    List<C1060> f6357;

    /* renamed from: ɺ  reason: contains not printable characters */
    private Drawable f6358;

    /* renamed from: ɼ  reason: contains not printable characters */
    private float f6359;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f6360;

    /* renamed from: ɿ  reason: contains not printable characters */
    private final C1063 f6361;

    /* renamed from: ʅ  reason: contains not printable characters */
    private int f6362;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final C1063 f6363;

    /* renamed from: ͻ  reason: contains not printable characters */
    private Drawable f6364;

    /* renamed from: Ι  reason: contains not printable characters */
    final C1068 f6365;

    /* renamed from: ι  reason: contains not printable characters */
    int f6366;

    /* renamed from: ϲ  reason: contains not printable characters */
    private Drawable f6367;

    /* renamed from: ϳ  reason: contains not printable characters */
    private Object f6368;

    /* renamed from: І  reason: contains not printable characters */
    boolean f6369;

    /* renamed from: Ј  reason: contains not printable characters */
    private Drawable f6370;

    /* renamed from: г  reason: contains not printable characters */
    private float f6371;

    /* renamed from: с  reason: contains not printable characters */
    private boolean f6372;

    /* renamed from: т  reason: contains not printable characters */
    private final ArrayList<View> f6373;

    /* renamed from: х  reason: contains not printable characters */
    private Drawable f6374;

    /* renamed from: і  reason: contains not printable characters */
    CharSequence f6375;

    /* renamed from: ј  reason: contains not printable characters */
    private Rect f6376;

    /* renamed from: ґ  reason: contains not printable characters */
    private Drawable f6377;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final Cif f6378;

    /* renamed from: o.ɍı$ı  reason: contains not printable characters */
    public interface C1060 {
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        f6340 = z;
    }

    public C1059(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1059(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1059(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6378 = new Cif();
        this.f6360 = -1728053248;
        this.f6345 = new Paint();
        this.f6346 = true;
        this.f6362 = 3;
        this.f6349 = 3;
        this.f6351 = 3;
        this.f6348 = 3;
        this.f6370 = null;
        this.f6364 = null;
        this.f6377 = null;
        this.f6374 = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f6355 = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f6361 = new C1063(3);
        this.f6363 = new C1063(5);
        this.f6343 = C1068.m7370((ViewGroup) this, 1.0f, (C1068.If) this.f6361);
        C1068 r8 = this.f6343;
        r8.f6416 = 1;
        r8.f6433 = f2;
        this.f6361.f6392 = r8;
        this.f6365 = C1068.m7370((ViewGroup) this, 1.0f, (C1068.If) this.f6363);
        C1068 r82 = this.f6365;
        r82.f6416 = 2;
        r82.f6433 = f2;
        this.f6363.f6392 = r82;
        setFocusableInTouchMode(true);
        C0293.m4203((View) this, 1);
        C0293.m4151((View) this, (C2449) new C1062());
        setMotionEventSplittingEnabled(false);
        if (C0293.m4153(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        ((C1059) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f6342);
                try {
                    this.f6350 = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f6350 = null;
            }
        }
        this.f6354 = f * 10.0f;
        this.f6373 = new ArrayList<>();
    }

    public void setDrawerElevation(float f) {
        this.f6354 = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m7325(childAt)) {
                C0293.m4163(childAt, this.f6354);
            }
        }
    }

    public void setChildInsets(Object obj, boolean z) {
        this.f6368 = obj;
        this.f6372 = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (!f6340) {
            if ((i & 8388611) == 8388611) {
                this.f6370 = drawable;
            } else if ((i & 8388613) == 8388613) {
                this.f6364 = drawable;
            } else if ((i & 3) == 3) {
                this.f6377 = drawable;
            } else if ((i & 5) == 5) {
                this.f6374 = drawable;
            } else {
                return;
            }
            if (!f6340) {
                this.f6358 = m7320();
                this.f6367 = m7324();
            }
            invalidate();
        }
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(C0651.m5458(getContext(), i), i2);
    }

    public void setScrimColor(int i) {
        this.f6360 = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(C1060 r3) {
        List<C1060> list;
        C1060 r0 = this.f6353;
        if (!(r0 == null || r0 == null || (list = this.f6357) == null)) {
            list.remove(r0);
        }
        if (r3 != null) {
            if (this.f6357 == null) {
                this.f6357 = new ArrayList();
            }
            this.f6357.add(r3);
        }
        this.f6353 = r3;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerLockMode(int i, int i2) {
        View r4;
        int r0 = C2409.m12455(i2, C0293.m4156(this));
        if (i2 == 3) {
            this.f6362 = i;
        } else if (i2 == 5) {
            this.f6349 = i;
        } else if (i2 == 8388611) {
            this.f6351 = i;
        } else if (i2 == 8388613) {
            this.f6348 = i;
        }
        if (i != 0) {
            (r0 == 3 ? this.f6343 : this.f6365).m7386();
        }
        if (i == 1) {
            View r42 = m7329(r0);
            if (r42 != null) {
                m7332(r42);
            }
        } else if (i == 2 && (r4 = m7329(r0)) != null) {
            m7326(r4);
        }
    }

    public void setDrawerLockMode(int i, View view) {
        if (m7325(view)) {
            setDrawerLockMode(i, ((If) view.getLayoutParams()).f6381);
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer with appropriate layout_gravity");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m7328(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        if (m7325(view)) {
            int i5 = ((If) view.getLayoutParams()).f6381;
            int r0 = C0293.m4156(this);
            if (i5 == 3) {
                int i6 = this.f6362;
                if (i6 != 3) {
                    return i6;
                }
                if (r0 == 0) {
                    i = this.f6351;
                } else {
                    i = this.f6348;
                }
                if (i != 3) {
                    return i;
                }
                return 0;
            } else if (i5 == 5) {
                int i7 = this.f6349;
                if (i7 != 3) {
                    return i7;
                }
                if (r0 == 0) {
                    i2 = this.f6348;
                } else {
                    i2 = this.f6351;
                }
                if (i2 != 3) {
                    return i2;
                }
                return 0;
            } else if (i5 == 8388611) {
                int i8 = this.f6351;
                if (i8 != 3) {
                    return i8;
                }
                if (r0 == 0) {
                    i3 = this.f6362;
                } else {
                    i3 = this.f6349;
                }
                if (i3 != 3) {
                    return i3;
                }
                return 0;
            } else if (i5 != 8388613) {
                return 0;
            } else {
                int i9 = this.f6348;
                if (i9 != 3) {
                    return i9;
                }
                if (r0 == 0) {
                    i4 = this.f6349;
                } else {
                    i4 = this.f6362;
                }
                if (i4 != 3) {
                    return i4;
                }
                return 0;
            }
        } else {
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a drawer");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        int r2 = C2409.m12455(i, C0293.m4156(this));
        if (r2 == 3) {
            this.f6347 = charSequence;
        } else if (r2 == 5) {
            this.f6375 = charSequence;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m7327(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m7325(childAt)) && (!z || childAt != view)) {
                C0293.m4203(childAt, 4);
            } else {
                C0293.m4203(childAt, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7330(View view, float f) {
        If ifR = (If) view.getLayoutParams();
        if (f != ifR.f6382) {
            ifR.f6382 = f;
            List<C1060> list = this.f6357;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f6357.get(size);
                }
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    static float m7319(View view) {
        return ((If) view.getLayoutParams()).f6382;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private View m7322() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((If) childAt.getLayoutParams()).f6380 & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final View m7329(int i) {
        int r6 = C2409.m12455(i, C0293.m4156(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((C2409.m12455(((If) childAt.getLayoutParams()).f6381, C0293.m4156(this)) & 7) == r6) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6346 = true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6346 = true;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        String str;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f6368 != null && C0293.m4153(this);
        int r7 = C0293.m4156(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                If ifR = (If) childAt.getLayoutParams();
                if (z) {
                    int r2 = C2409.m12455(ifR.f6381, r7);
                    if (C0293.m4153(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f6368;
                            if (r2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (r2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f6368;
                        if (r2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (r2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ifR.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ifR.topMargin = windowInsets2.getSystemWindowInsetTop();
                        ifR.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ifR.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (((If) childAt.getLayoutParams()).f6381 == 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ifR.leftMargin) - ifR.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ifR.topMargin) - ifR.bottomMargin, 1073741824));
                } else if (m7325(childAt)) {
                    if (f6340) {
                        float r22 = C0293.m4188(childAt);
                        float f = this.f6354;
                        if (r22 != f) {
                            C0293.m4163(childAt, f);
                        }
                    }
                    int r23 = C2409.m12455(((If) childAt.getLayoutParams()).f6381, C0293.m4156(this)) & 7;
                    boolean z4 = r23 == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(getChildMeasureSpec(i, this.f6355 + ifR.leftMargin + ifR.rightMargin, ifR.width), getChildMeasureSpec(i2, ifR.topMargin + ifR.bottomMargin, ifR.height));
                        i4++;
                        i3 = 0;
                    } else {
                        StringBuilder sb = new StringBuilder("Child drawer has absolute gravity ");
                        if ((r23 & 3) != 3) {
                            str = (r23 & 5) == 5 ? "RIGHT" : Integer.toHexString(r23);
                        } else {
                            str = "LEFT";
                        }
                        sb.append(str);
                        sb.append(" but this DrawerLayout already has a drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i4);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            int i5 = i;
            int i6 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private Drawable m7320() {
        int r0 = C0293.m4156(this);
        if (r0 == 0) {
            Drawable drawable = this.f6370;
            if (drawable != null) {
                if (drawable != null && C1266.m8142(drawable)) {
                    C1266.m8157(drawable, r0);
                }
                return this.f6370;
            }
        } else {
            Drawable drawable2 = this.f6364;
            if (drawable2 != null) {
                if (drawable2 != null && C1266.m8142(drawable2)) {
                    C1266.m8157(drawable2, r0);
                }
                return this.f6364;
            }
        }
        return this.f6377;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private Drawable m7324() {
        int r0 = C0293.m4156(this);
        if (r0 == 0) {
            Drawable drawable = this.f6364;
            if (drawable != null) {
                if (drawable != null && C1266.m8142(drawable)) {
                    C1266.m8157(drawable, r0);
                }
                return this.f6364;
            }
        } else {
            Drawable drawable2 = this.f6370;
            if (drawable2 != null) {
                if (drawable2 != null && C1266.m8142(drawable2)) {
                    C1266.m8157(drawable2, r0);
                }
                return this.f6370;
            }
        }
        return this.f6374;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        this.f6344 = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                If ifR = (If) childAt.getLayoutParams();
                if (((If) childAt.getLayoutParams()).f6381 == 0) {
                    childAt.layout(ifR.leftMargin, ifR.topMargin, ifR.leftMargin + childAt.getMeasuredWidth(), ifR.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if ((C2409.m12455(((If) childAt.getLayoutParams()).f6381, C0293.m4156(this)) & 3) == 3) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (ifR.f6382 * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i8 = i6 - ((int) (ifR.f6382 * f3));
                        f = ((float) (i6 - i8)) / f3;
                        i5 = i8;
                    }
                    boolean z2 = f != ifR.f6382;
                    int i9 = ifR.f6381 & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        if (i11 < ifR.topMargin) {
                            i11 = ifR.topMargin;
                        } else if (i11 + measuredHeight > i10 - ifR.bottomMargin) {
                            i11 = (i10 - ifR.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        childAt.layout(i5, ifR.topMargin, measuredWidth + i5, ifR.topMargin + measuredHeight);
                    } else {
                        int i12 = i4 - i2;
                        childAt.layout(i5, (i12 - ifR.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - ifR.bottomMargin);
                    }
                    if (z2) {
                        m7330(childAt, f);
                    }
                    int i13 = ifR.f6382 > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i13) {
                        childAt.setVisibility(i13);
                    }
                }
            }
        }
        this.f6344 = false;
        this.f6346 = false;
    }

    public void requestLayout() {
        if (!this.f6344) {
            super.requestLayout();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((If) getChildAt(i).getLayoutParams()).f6382);
        }
        this.f6371 = f;
        boolean r0 = this.f6343.m7381();
        boolean r1 = this.f6365.m7381();
        if (r0 || r1) {
            C0293.m4176(this);
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f6350 = drawable;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f6350 = i != 0 ? C0651.m5458(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f6350 = new ColorDrawable(i);
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.f6368;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f6372
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.f6350
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.f6368
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.f6350
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.f6350
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1059.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        Canvas canvas2 = canvas;
        int height = getHeight();
        boolean z = true;
        boolean z2 = ((If) view.getLayoutParams()).f6381 == 0;
        int width = getWidth();
        int save = canvas.save();
        if (z2) {
            int childCount = getChildCount();
            i = width;
            i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && m7325(childAt) && childAt.getHeight() >= height) {
                        if ((C2409.m12455(((If) childAt.getLayoutParams()).f6381, C0293.m4156(this)) & 3) == 3) {
                            int right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < i) {
                                i = left;
                            }
                        }
                    }
                }
            }
            View view2 = view;
            canvas2.clipRect(i2, 0, i, getHeight());
        } else {
            View view3 = view;
            i = width;
            i2 = 0;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas2.restoreToCount(save);
        float f = this.f6371;
        if (f <= 0.0f || !z2) {
            if (this.f6358 != null) {
                if ((C2409.m12455(((If) view.getLayoutParams()).f6381, C0293.m4156(this)) & 3) == 3) {
                    int intrinsicWidth = this.f6358.getIntrinsicWidth();
                    int right2 = view.getRight();
                    float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f6343.f6423), 1.0f));
                    this.f6358.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                    this.f6358.setAlpha((int) (max * 255.0f));
                    this.f6358.draw(canvas2);
                }
            }
            if (this.f6367 != null) {
                if ((C2409.m12455(((If) view.getLayoutParams()).f6381, C0293.m4156(this)) & 5) != 5) {
                    z = false;
                }
                if (z) {
                    int intrinsicWidth2 = this.f6367.getIntrinsicWidth();
                    int left2 = view.getLeft();
                    float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f6365.f6423), 1.0f));
                    this.f6367.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                    this.f6367.setAlpha((int) (max2 * 255.0f));
                    this.f6367.draw(canvas2);
                }
            }
        } else {
            int i4 = this.f6360;
            this.f6345.setColor((((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.f6345);
        }
        return drawChild;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static boolean m7325(View view) {
        int r2 = C2409.m12455(((If) view.getLayoutParams()).f6381, C0293.m4156(view));
        return ((r2 & 3) == 0 && (r2 & 5) == 0) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != 3) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[LOOP:0: B:8:0x0024->B:20:0x005b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0059 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            o.ɍǃ r1 = r8.f6343
            boolean r1 = r1.m7379((android.view.MotionEvent) r9)
            o.ɍǃ r2 = r8.f6365
            boolean r2 = r2.m7379((android.view.MotionEvent) r9)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x007b
            if (r0 == r2) goto L_0x0074
            r9 = 2
            if (r0 == r9) goto L_0x001e
            r9 = 3
            if (r0 == r9) goto L_0x0074
            goto L_0x0079
        L_0x001e:
            o.ɍǃ r9 = r8.f6343
            float[] r0 = r9.f6429
            int r0 = r0.length
            r4 = 0
        L_0x0024:
            if (r4 >= r0) goto L_0x005e
            int r5 = r9.f6430
            int r6 = r2 << r4
            r5 = r5 & r6
            if (r5 == 0) goto L_0x002f
            r5 = 1
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 == 0) goto L_0x0056
            float[] r5 = r9.f6418
            r5 = r5[r4]
            float[] r6 = r9.f6429
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.f6432
            r6 = r6[r4]
            float[] r7 = r9.f6428
            r7 = r7[r4]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r5 = r5 + r6
            int r6 = r9.f6413
            int r7 = r9.f6413
            int r6 = r6 * r7
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            if (r5 == 0) goto L_0x005b
            r9 = 1
            goto L_0x005f
        L_0x005b:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x005e:
            r9 = 0
        L_0x005f:
            if (r9 == 0) goto L_0x0079
            o.ɍı$ι r9 = r8.f6361
            o.ɍı r0 = o.C1059.this
            java.lang.Runnable r9 = r9.f6393
            r0.removeCallbacks(r9)
            o.ɍı$ι r9 = r8.f6363
            o.ɍı r0 = o.C1059.this
            java.lang.Runnable r9 = r9.f6393
            r0.removeCallbacks(r9)
            goto L_0x0079
        L_0x0074:
            r8.m7321((boolean) r2)
            r8.f6369 = r3
        L_0x0079:
            r9 = 0
            goto L_0x00ac
        L_0x007b:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f6359 = r0
            r8.f6352 = r9
            float r4 = r8.f6371
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a9
            o.ɍǃ r4 = r8.f6343
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.m7380(r0, r9)
            if (r9 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            o.ɍı$If r9 = (o.C1059.If) r9
            int r9 = r9.f6381
            if (r9 != 0) goto L_0x00a4
            r9 = 1
            goto L_0x00a5
        L_0x00a4:
            r9 = 0
        L_0x00a5:
            if (r9 == 0) goto L_0x00a9
            r9 = 1
            goto L_0x00aa
        L_0x00a9:
            r9 = 0
        L_0x00aa:
            r8.f6369 = r3
        L_0x00ac:
            if (r1 != 0) goto L_0x00d3
            if (r9 != 0) goto L_0x00d3
            int r9 = r8.getChildCount()
            r0 = 0
        L_0x00b5:
            if (r0 >= r9) goto L_0x00ca
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.ɍı$If r1 = (o.C1059.If) r1
            boolean r1 = r1.f6383
            if (r1 == 0) goto L_0x00c7
            r9 = 1
            goto L_0x00cb
        L_0x00c7:
            int r0 = r0 + 1
            goto L_0x00b5
        L_0x00ca:
            r9 = 0
        L_0x00cb:
            if (r9 != 0) goto L_0x00d3
            boolean r9 = r8.f6369
            if (r9 == 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            return r3
        L_0x00d3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1059.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f6371 <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = getChildAt(childCount);
                if (this.f6376 == null) {
                    this.f6376 = new Rect();
                }
                childAt.getHitRect(this.f6376);
                if (this.f6376.contains((int) x, (int) y)) {
                    if (((If) childAt.getLayoutParams()).f6381 == 0) {
                        continue;
                    } else {
                        if (!childAt.getMatrix().isIdentity()) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.offsetLocation((float) (getScrollX() - childAt.getLeft()), (float) (getScrollY() - childAt.getTop()));
                            Matrix matrix = childAt.getMatrix();
                            if (!matrix.isIdentity()) {
                                if (this.f6356 == null) {
                                    this.f6356 = new Matrix();
                                }
                                matrix.invert(this.f6356);
                                obtain.transform(this.f6356);
                            }
                            z = childAt.dispatchGenericMotionEvent(obtain);
                            obtain.recycle();
                        } else {
                            float scrollX = (float) (getScrollX() - childAt.getLeft());
                            float scrollY = (float) (getScrollY() - childAt.getTop());
                            motionEvent.offsetLocation(scrollX, scrollY);
                            z = childAt.dispatchGenericMotionEvent(motionEvent);
                            motionEvent.offsetLocation(-scrollX, -scrollY);
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (m7328(r7) != 2) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            o.ɍǃ r0 = r6.f6343
            r0.m7382((android.view.MotionEvent) r7)
            o.ɍǃ r0 = r6.f6365
            r0.m7382((android.view.MotionEvent) r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0069
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x0077
        L_0x001a:
            r6.m7321((boolean) r2)
            r6.f6369 = r1
            goto L_0x0077
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            o.ɍǃ r3 = r6.f6343
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.m7380(r4, r5)
            if (r3 == 0) goto L_0x0064
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            o.ɍı$If r3 = (o.C1059.If) r3
            int r3 = r3.f6381
            if (r3 != 0) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            if (r3 == 0) goto L_0x0064
            float r3 = r6.f6359
            float r0 = r0 - r3
            float r3 = r6.f6352
            float r7 = r7 - r3
            o.ɍǃ r3 = r6.f6343
            int r3 = r3.f6413
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0064
            android.view.View r7 = r6.m7322()
            if (r7 == 0) goto L_0x0064
            int r7 = r6.m7328(r7)
            r0 = 2
            if (r7 != r0) goto L_0x0065
        L_0x0064:
            r1 = 1
        L_0x0065:
            r6.m7321((boolean) r1)
            goto L_0x0077
        L_0x0069:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f6359 = r0
            r6.f6352 = r7
            r6.f6369 = r1
        L_0x0077:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1059.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m7321(true);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m7321(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            If ifR = (If) childAt.getLayoutParams();
            if (m7325(childAt) && (!z || ifR.f6383)) {
                int width = childAt.getWidth();
                if ((C2409.m12455(((If) childAt.getLayoutParams()).f6381, C0293.m4156(this)) & 3) == 3) {
                    z2 = this.f6343.m7385(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.f6365.m7385(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                ifR.f6383 = false;
            }
        }
        C1063 r10 = this.f6361;
        C1059.this.removeCallbacks(r10.f6393);
        C1063 r102 = this.f6363;
        C1059.this.removeCallbacks(r102.f6393);
        if (z3) {
            invalidate();
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    private void m7326(View view) {
        if (m7325(view)) {
            If ifR = (If) view.getLayoutParams();
            boolean z = true;
            if (this.f6346) {
                ifR.f6382 = 1.0f;
                ifR.f6380 = 1;
                m7327(view, true);
            } else {
                ifR.f6380 |= 2;
                if ((C2409.m12455(((If) view.getLayoutParams()).f6381, C0293.m4156(this)) & 3) != 3) {
                    z = false;
                }
                if (z) {
                    this.f6343.m7385(view, 0, view.getTop());
                } else {
                    this.f6365.m7385(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m7332(View view) {
        if (m7325(view)) {
            If ifR = (If) view.getLayoutParams();
            boolean z = false;
            if (this.f6346) {
                ifR.f6382 = 0.0f;
                ifR.f6380 = 0;
            } else {
                ifR.f6380 |= 4;
                if ((C2409.m12455(((If) view.getLayoutParams()).f6381, C0293.m4156(this)) & 3) == 3) {
                    z = true;
                }
                if (z) {
                    this.f6343.m7385(view, -view.getWidth(), view.getTop());
                } else {
                    this.f6365.m7385(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new If();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof If) {
            return new If((If) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new If((ViewGroup.MarginLayoutParams) layoutParams) : new If(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof If) && super.checkLayoutParams(layoutParams);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new If(getContext(), attributeSet);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!m7325(childAt)) {
                    this.f6373.add(childAt);
                } else if (m7325(childAt)) {
                    if ((((If) childAt.getLayoutParams()).f6380 & 1) == 1) {
                        childAt.addFocusables(arrayList, i, i2);
                        z = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("View ");
                    sb.append(childAt);
                    sb.append(" is not a drawer");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (!z) {
                int size = this.f6373.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f6373.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f6373.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final View m7331() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m7325(childAt)) {
                if (m7325(childAt)) {
                    if (((If) childAt.getLayoutParams()).f6382 > 0.0f) {
                        return childAt;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("View ");
                    sb.append(childAt);
                    sb.append(" is not a drawer");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return null;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View r2 = m7331();
        if (r2 != null && m7328(r2) == 0) {
            m7321(false);
        }
        if (r2 != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View r0;
        if (!(parcelable instanceof C1061)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1061 r4 = (C1061) parcelable;
        super.onRestoreInstanceState(r4.f6905);
        if (!(r4.f6384 == 0 || (r0 = m7329(r4.f6384)) == null)) {
            m7326(r0);
        }
        if (r4.f6386 != 3) {
            setDrawerLockMode(r4.f6386, 3);
        }
        if (r4.f6385 != 3) {
            setDrawerLockMode(r4.f6385, 5);
        }
        if (r4.f6387 != 3) {
            setDrawerLockMode(r4.f6387, 8388611);
        }
        if (r4.f6388 != 3) {
            setDrawerLockMode(r4.f6388, 8388613);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1061 r1 = new C1061(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            If ifR = (If) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = ifR.f6380 == 1;
            if (ifR.f6380 != 2) {
                z = false;
            }
            if (z2 || z) {
                r1.f6384 = ifR.f6381;
            } else {
                i++;
            }
        }
        r1.f6386 = this.f6362;
        r1.f6385 = this.f6349;
        r1.f6387 = this.f6351;
        r1.f6388 = this.f6348;
        return r1;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m7322() != null || m7325(view)) {
            C0293.m4203(view, 4);
        } else {
            C0293.m4203(view, 1);
        }
        if (!f6339) {
            C0293.m4151(view, (C2449) this.f6378);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m7323(View view) {
        return (C0293.m4217(view) == 4 || C0293.m4217(view) == 2) ? false : true;
    }

    /* renamed from: o.ɍı$ǃ  reason: contains not printable characters */
    public static class C1061 extends C1219 {
        public static final Parcelable.Creator<C1061> CREATOR = new Parcelable.ClassLoaderCreator<C1061>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1061(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C1061[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C1061(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        int f6384 = 0;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f6385;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f6386;

        /* renamed from: І  reason: contains not printable characters */
        int f6387;

        /* renamed from: Ӏ  reason: contains not printable characters */
        int f6388;

        public C1061(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6384 = parcel.readInt();
            this.f6386 = parcel.readInt();
            this.f6385 = parcel.readInt();
            this.f6387 = parcel.readInt();
            this.f6388 = parcel.readInt();
        }

        public C1061(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6384);
            parcel.writeInt(this.f6386);
            parcel.writeInt(this.f6385);
            parcel.writeInt(this.f6387);
            parcel.writeInt(this.f6388);
        }
    }

    /* renamed from: o.ɍı$ι  reason: contains not printable characters */
    class C1063 extends C1068.If implements Runnable {

        /* renamed from: ı  reason: contains not printable characters */
        final int f6391;

        /* renamed from: ǃ  reason: contains not printable characters */
        C1068 f6392;

        /* renamed from: ɩ  reason: contains not printable characters */
        final Runnable f6393 = this;

        C1063(int i) {
            this.f6391 = i;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m7345(View view, int i) {
            if (C1059.m7325(view)) {
                C1059 r5 = C1059.this;
                int i2 = this.f6391;
                if (!((C2409.m12455(((If) view.getLayoutParams()).f6381, C0293.m4156(r5)) & i2) == i2) || C1059.this.m7328(view) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m7347(int i) {
            View rootView;
            C1059 r0 = C1059.this;
            View view = this.f6392.f6419;
            int i2 = r0.f6343.f6421;
            int i3 = r0.f6365.f6421;
            int i4 = 2;
            if (i2 == 1 || i3 == 1) {
                i4 = 1;
            } else if (!(i2 == 2 || i3 == 2)) {
                i4 = 0;
            }
            if (view != null && i == 0) {
                If ifR = (If) view.getLayoutParams();
                if (ifR.f6382 == 0.0f) {
                    If ifR2 = (If) view.getLayoutParams();
                    if ((ifR2.f6380 & 1) == 1) {
                        ifR2.f6380 = 0;
                        if (r0.f6357 != null) {
                            for (int size = r0.f6357.size() - 1; size >= 0; size--) {
                                r0.f6357.get(size);
                            }
                        }
                        r0.m7327(view, false);
                        if (r0.hasWindowFocus() && (rootView = r0.getRootView()) != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                } else if (ifR.f6382 == 1.0f) {
                    If ifR3 = (If) view.getLayoutParams();
                    if ((ifR3.f6380 & 1) == 0) {
                        ifR3.f6380 = 1;
                        if (r0.f6357 != null) {
                            for (int size2 = r0.f6357.size() - 1; size2 >= 0; size2--) {
                                r0.f6357.get(size2);
                            }
                        }
                        r0.m7327(view, true);
                        if (r0.hasWindowFocus()) {
                            r0.sendAccessibilityEvent(32);
                        }
                    }
                }
            }
            if (i4 != r0.f6366) {
                r0.f6366 = i4;
                if (r0.f6357 != null) {
                    for (int size3 = r0.f6357.size() - 1; size3 >= 0; size3--) {
                        r0.f6357.get(size3);
                    }
                }
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m7340(View view, int i) {
            int width = view.getWidth();
            int i2 = 0;
            float width2 = ((C2409.m12455(((If) view.getLayoutParams()).f6381, C0293.m4156(C1059.this)) & 3) == 3 ? (float) (i + width) : (float) (C1059.this.getWidth() - i)) / ((float) width);
            C1059.this.m7330(view, width2);
            if (width2 == 0.0f) {
                i2 = 4;
            }
            view.setVisibility(i2);
            C1059.this.invalidate();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m7348(View view, int i) {
            ((If) view.getLayoutParams()).f6383 = false;
            m7338();
        }

        /* renamed from: ı  reason: contains not printable characters */
        private void m7338() {
            int i = 3;
            if (this.f6391 == 3) {
                i = 5;
            }
            View r0 = C1059.this.m7329(i);
            if (r0 != null) {
                C1059.this.m7332(r0);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m7344(View view, float f, float f2) {
            float r8 = C1059.m7319(view);
            int width = view.getWidth();
            int i = 0;
            if ((C2409.m12455(((If) view.getLayoutParams()).f6381, C0293.m4156(C1059.this)) & 3) == 3) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 <= 0 && (i2 != 0 || r8 <= 0.5f)) {
                    i = -width;
                }
            } else {
                int width2 = C1059.this.getWidth();
                if (f < 0.0f || (f == 0.0f && r8 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f6392.m7384(i, view.getTop());
            C1059.this.invalidate();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m7342() {
            C1059.this.postDelayed(this.f6393, 160);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m7343(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = C1059.this.m7329(3);
            } else {
                view = C1059.this.m7329(5);
            }
            if (view != null && C1059.this.m7328(view) == 0) {
                this.f6392.m7383(view, i2);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final int m7346(View view) {
            if (C1059.m7325(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m7341(View view, int i) {
            if ((C2409.m12455(((If) view.getLayoutParams()).f6381, C0293.m4156(C1059.this)) & 3) == 3) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = C1059.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m7339(View view, int i) {
            return view.getTop();
        }

        public final void run() {
            int i;
            View view;
            int i2 = this.f6392.f6423;
            boolean z = this.f6391 == 3;
            if (z) {
                view = C1059.this.m7329(3);
                i = (view != null ? -view.getWidth() : 0) + i2;
            } else {
                view = C1059.this.m7329(5);
                i = C1059.this.getWidth() - i2;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && C1059.this.m7328(view) == 0) {
                this.f6392.m7385(view, i, view.getTop());
                ((If) view.getLayoutParams()).f6383 = true;
                C1059.this.invalidate();
                m7338();
                C1059 r0 = C1059.this;
                if (!r0.f6369) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = r0.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        r0.getChildAt(i3).dispatchTouchEvent(obtain);
                    }
                    obtain.recycle();
                    r0.f6369 = true;
                }
            }
        }
    }

    /* renamed from: o.ɍı$If */
    public static class If extends ViewGroup.MarginLayoutParams {

        /* renamed from: ǃ  reason: contains not printable characters */
        int f6380;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f6381 = 0;

        /* renamed from: Ι  reason: contains not printable characters */
        float f6382;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f6383;

        public If(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1059.f6341);
            this.f6381 = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public If() {
            super(-1, -1);
        }

        public If(If ifR) {
            super(ifR);
            this.f6381 = ifR.f6381;
        }

        public If(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public If(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: o.ɍı$ɩ  reason: contains not printable characters */
    class C1062 extends C2449 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final Rect f6390 = new Rect();

        C1062() {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m7334(View view, C0520 r7) {
            if (C1059.f6339) {
                super.m12579(view, r7);
            } else {
                C0520 r0 = C0520.m4999(r7);
                super.m12579(view, r0);
                r7.m5057(view);
                ViewParent r2 = C0293.m4220(view);
                if (r2 instanceof View) {
                    r7.m5007((View) r2);
                }
                Rect rect = this.f6390;
                r0.m5056(rect);
                r7.m5050(rect);
                r0.m5031(rect);
                r7.m5021(rect);
                r7.m5036(r0.m5069());
                r7.m5051(r0.m5065());
                r7.m5022(r0.m5012());
                r7.m5034(r0.m5019());
                r7.m5063(r0.m5071());
                r7.m5068(r0.m5029());
                r7.m5010(r0.m5064());
                r7.m5024(r0.m5067());
                r7.m5040(r0.m5038());
                r7.m5016(r0.m5043());
                r7.m5066(r0.m5026());
                r7.m5030(r0.m5054());
                r0.m5018();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (C1059.m7323(childAt)) {
                        r7.m5032(childAt);
                    }
                }
            }
            r7.m5022((CharSequence) C1059.class.getName());
            r7.m5010(false);
            r7.m5024(false);
            r7.m5011(C0520.Cif.f4320);
            r7.m5011(C0520.Cif.f4306);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m7337(View view, AccessibilityEvent accessibilityEvent) {
            super.m12584(view, accessibilityEvent);
            accessibilityEvent.setClassName(C1059.class.getName());
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m7336(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence charSequence;
            if (accessibilityEvent.getEventType() != 32) {
                return super.m12582(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View r4 = C1059.this.m7331();
            if (r4 == null) {
                return true;
            }
            int r42 = C2409.m12455(((If) r4.getLayoutParams()).f6381, C0293.m4156(C1059.this));
            C1059 r0 = C1059.this;
            int r43 = C2409.m12455(r42, C0293.m4156(r0));
            if (r43 == 3) {
                charSequence = r0.f6347;
            } else if (r43 == 5) {
                charSequence = r0.f6375;
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                return true;
            }
            text.add(charSequence);
            return true;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m7335(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (C1059.f6339 || C1059.m7323(view)) {
                return super.m12581(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: o.ɍı$if  reason: invalid class name */
    static final class Cif extends C2449 {
        Cif() {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m7333(View view, C0520 r2) {
            super.m12579(view, r2);
            if (!C1059.m7323(view)) {
                r2.m5007((View) null);
            }
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (!f6340) {
            this.f6358 = m7320();
            this.f6367 = m7324();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (m7331() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
