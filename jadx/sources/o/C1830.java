package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import o.C1692;
import o.C2745;

/* renamed from: o.Ιɾ  reason: contains not printable characters */
public class C1830 extends ViewGroup implements C2890, C2607 {

    /* renamed from: ǀ  reason: contains not printable characters */
    private static final int[] f9368 = {16842766};

    /* renamed from: ı  reason: contains not printable characters */
    boolean f9369;

    /* renamed from: ŀ  reason: contains not printable characters */
    private final int[] f9370;

    /* renamed from: ł  reason: contains not printable characters */
    private float f9371;

    /* renamed from: ſ  reason: contains not printable characters */
    private boolean f9372;

    /* renamed from: Ɩ  reason: contains not printable characters */
    float f9373;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private float f9374;

    /* renamed from: ƚ  reason: contains not printable characters */
    private float f9375;

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f9376;

    /* renamed from: ȷ  reason: contains not printable characters */
    boolean f9377;

    /* renamed from: ɍ  reason: contains not printable characters */
    private boolean f9378;

    /* renamed from: ɔ  reason: contains not printable characters */
    private final DecelerateInterpolator f9379;

    /* renamed from: ɟ  reason: contains not printable characters */
    private int f9380;

    /* renamed from: ɨ  reason: contains not printable characters */
    boolean f9381;

    /* renamed from: ɩ  reason: contains not printable characters */
    C1687 f9382;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f9383;

    /* renamed from: ɭ  reason: contains not printable characters */
    private final Animation f9384;

    /* renamed from: ɹ  reason: contains not printable characters */
    protected int f9385;

    /* renamed from: ɺ  reason: contains not printable characters */
    private int f9386;

    /* renamed from: ɼ  reason: contains not printable characters */
    private int f9387;

    /* renamed from: ɾ  reason: contains not printable characters */
    private float f9388;

    /* renamed from: ɿ  reason: contains not printable characters */
    private final C2745.IF f9389;

    /* renamed from: ʅ  reason: contains not printable characters */
    private int f9390;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final C2601 f9391;

    /* renamed from: ͻ  reason: contains not printable characters */
    private Animation f9392;

    /* renamed from: Ι  reason: contains not printable characters */
    int f9393;

    /* renamed from: ι  reason: contains not printable characters */
    Cif f9394;

    /* renamed from: ϲ  reason: contains not printable characters */
    private Animation f9395;

    /* renamed from: ϳ  reason: contains not printable characters */
    private Animation f9396;

    /* renamed from: І  reason: contains not printable characters */
    protected int f9397;

    /* renamed from: Ј  reason: contains not printable characters */
    private Animation f9398;

    /* renamed from: г  reason: contains not printable characters */
    private final int[] f9399;

    /* renamed from: с  reason: contains not printable characters */
    private Animation f9400;

    /* renamed from: т  reason: contains not printable characters */
    private int f9401;

    /* renamed from: х  reason: contains not printable characters */
    private C1831 f9402;

    /* renamed from: і  reason: contains not printable characters */
    C1692 f9403;

    /* renamed from: ј  reason: contains not printable characters */
    private final Animation f9404;

    /* renamed from: ґ  reason: contains not printable characters */
    private Animation.AnimationListener f9405;

    /* renamed from: Ӏ  reason: contains not printable characters */
    int f9406;

    /* renamed from: ӏ  reason: contains not printable characters */
    private View f9407;

    /* renamed from: o.Ιɾ$if  reason: invalid class name */
    public interface Cif {
        void onRefresh();
    }

    /* renamed from: o.Ιɾ$ɩ  reason: contains not printable characters */
    public interface C1831 {
        /* renamed from: ɩ  reason: contains not printable characters */
        boolean m10136();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10133() {
        this.f9382.clearAnimation();
        this.f9403.stop();
        this.f9382.setVisibility(8);
        this.f9382.getBackground().setAlpha(255);
        this.f9403.setAlpha(255);
        if (this.f9369) {
            this.f9382.setScaleX(0.0f);
            this.f9382.setScaleY(0.0f);
        } else {
            int i = this.f9385 - this.f9393;
            this.f9382.bringToFront();
            C0293.m4164((View) this.f9382, i);
            this.f9393 = this.f9382.getTop();
        }
        this.f9393 = this.f9382.getTop();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            m10133();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m10133();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.f9369 = z;
        this.f9385 = i;
        this.f9406 = i2;
        this.f9377 = true;
        m10133();
        this.f9376 = false;
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.f9406 = i;
        this.f9369 = z;
        this.f9382.invalidate();
    }

    public void setSlingshotDistance(int i) {
        this.f9386 = i;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f9401 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f9401 = (int) (displayMetrics.density * 40.0f);
            }
            this.f9382.setImageDrawable((Drawable) null);
            this.f9403.m9610(i);
            this.f9382.setImageDrawable(this.f9403);
        }
    }

    public C1830(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1830(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9376 = false;
        this.f9388 = -1.0f;
        this.f9370 = new int[2];
        this.f9399 = new int[2];
        this.f9380 = -1;
        this.f9387 = -1;
        this.f9405 = new Animation.AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (C1830.this.f9376) {
                    C1830.this.f9403.setAlpha(255);
                    C1830.this.f9403.start();
                    if (C1830.this.f9381 && C1830.this.f9394 != null) {
                        C1830.this.f9394.onRefresh();
                    }
                    C1830 r2 = C1830.this;
                    r2.f9393 = r2.f9382.getTop();
                    return;
                }
                C1830.this.m10133();
            }
        };
        this.f9384 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (!C1830.this.f9377) {
                    i = C1830.this.f9406 - Math.abs(C1830.this.f9385);
                } else {
                    i = C1830.this.f9406;
                }
                int top = (C1830.this.f9397 + ((int) (((float) (i - C1830.this.f9397)) * f))) - C1830.this.f9382.getTop();
                C1830 r4 = C1830.this;
                r4.f9382.bringToFront();
                C0293.m4164((View) r4.f9382, top);
                r4.f9393 = r4.f9382.getTop();
                C1692 r42 = C1830.this.f9403;
                float f2 = 1.0f - f;
                C1692.C1693 r3 = r42.f8774;
                if (f2 != r3.f8797) {
                    r3.f8797 = f2;
                }
                r42.invalidateSelf();
            }
        };
        this.f9404 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                C1830.this.m10135(f);
            }
        };
        this.f9383 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f9390 = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f9379 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f9401 = (int) (displayMetrics.density * 40.0f);
        this.f9382 = new C1687(getContext());
        this.f9403 = new C1692(getContext());
        this.f9403.m9610(1);
        this.f9382.setImageDrawable(this.f9403);
        this.f9382.setVisibility(8);
        addView(this.f9382);
        setChildrenDrawingOrderEnabled(true);
        this.f9406 = (int) (displayMetrics.density * 64.0f);
        this.f9388 = (float) this.f9406;
        this.f9389 = new C2745.IF();
        this.f9391 = new C2601(this);
        setNestedScrollingEnabled(true);
        int i = -this.f9401;
        this.f9393 = i;
        this.f9385 = i;
        m10135(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9368);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f9387;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    public void setOnRefreshListener(Cif ifVar) {
        this.f9394 = ifVar;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f9376 == z) {
            m10129(z, false);
            return;
        }
        this.f9376 = z;
        if (!this.f9377) {
            i = this.f9406 + this.f9385;
        } else {
            i = this.f9406;
        }
        int i2 = i - this.f9393;
        this.f9382.bringToFront();
        C0293.m4164((View) this.f9382, i2);
        this.f9393 = this.f9382.getTop();
        this.f9381 = false;
        Animation.AnimationListener animationListener = this.f9405;
        this.f9382.setVisibility(0);
        this.f9403.setAlpha(255);
        this.f9395 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                C1830 r3 = C1830.this;
                r3.f9382.setScaleX(f);
                r3.f9382.setScaleY(f);
            }
        };
        this.f9395.setDuration((long) this.f9390);
        if (animationListener != null) {
            this.f9382.setAnimationListener(animationListener);
        }
        this.f9382.clearAnimation();
        this.f9382.startAnimation(this.f9395);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m10129(boolean z, boolean z2) {
        if (this.f9376 != z) {
            this.f9381 = z2;
            m10131();
            this.f9376 = z;
            if (this.f9376) {
                m10124(this.f9393, this.f9405);
            } else {
                m10134(this.f9405);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10134(Animation.AnimationListener animationListener) {
        this.f9398 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                C1830 r3 = C1830.this;
                float f2 = 1.0f - f;
                r3.f9382.setScaleX(f2);
                r3.f9382.setScaleY(f2);
            }
        };
        this.f9398.setDuration(150);
        this.f9382.setAnimationListener(animationListener);
        this.f9382.clearAnimation();
        this.f9382.startAnimation(this.f9398);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private Animation m10122(final int i, final int i2) {
        AnonymousClass3 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                C1692 r5 = C1830.this.f9403;
                int i = i;
                r5.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r0.setDuration(300);
        this.f9382.setAnimationListener((Animation.AnimationListener) null);
        this.f9382.clearAnimation();
        this.f9382.startAnimation(r0);
        return r0;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0651.m5450(getContext(), i));
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f9382.setBackgroundColor(i);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0651.m5450(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(int... iArr) {
        m10131();
        C1692 r0 = this.f9403;
        C1692.C1693 r1 = r0.f8774;
        r1.f8794 = iArr;
        r1.f8802 = 0;
        r1.f8788 = r1.f8794[r1.f8802];
        C1692.C1693 r12 = r0.f8774;
        r12.f8802 = 0;
        r12.f8788 = r12.f8794[r12.f8802];
        r0.invalidateSelf();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m10131() {
        if (this.f9407 == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f9382)) {
                    this.f9407 = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.f9388 = (float) i;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f9407 == null) {
                m10131();
            }
            View view = this.f9407;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f9382.getMeasuredWidth();
                int measuredHeight2 = this.f9382.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f9393;
                this.f9382.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9407 == null) {
            m10131();
        }
        View view = this.f9407;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f9382.measure(View.MeasureSpec.makeMeasureSpec(this.f9401, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9401, 1073741824));
            this.f9387 = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f9382) {
                    this.f9387 = i3;
                    return;
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m10130() {
        C1831 r0 = this.f9402;
        if (r0 != null) {
            return r0.m10136();
        }
        View view = this.f9407;
        if (view instanceof ListView) {
            return C0885.m6595((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public void setOnChildScrollUpCallback(C1831 r1) {
        this.f9402 = r1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        m10131();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m10130() || this.f9376 || this.f9378) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f9380;
                    if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                        return false;
                    }
                    m10123(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m10125(motionEvent);
                    }
                }
            }
            this.f9372 = false;
            this.f9380 = -1;
        } else {
            int top = this.f9385 - this.f9382.getTop();
            this.f9382.bringToFront();
            C0293.m4164((View) this.f9382, top);
            this.f9393 = this.f9382.getTop();
            this.f9380 = motionEvent.getPointerId(0);
            this.f9372 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f9380);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f9374 = motionEvent.getY(findPointerIndex2);
        }
        return this.f9372;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f9407 instanceof AbsListView)) {
            View view = this.f9407;
            if (view == null || C0293.m4170(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f9376 && (i & 2) != 0;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f9389.f12774 = i;
        startNestedScroll(i & 2);
        this.f9371 = 0.0f;
        this.f9378 = true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f9371;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f9371 = 0.0f;
                } else {
                    this.f9371 = f - f2;
                    iArr[1] = i2;
                }
                m10126(this.f9371);
            }
        }
        if (this.f9377 && i2 > 0 && this.f9371 == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f9382.setVisibility(8);
        }
        int[] iArr2 = this.f9370;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public int getNestedScrollAxes() {
        C2745.IF ifR = this.f9389;
        return ifR.f12775 | ifR.f12774;
    }

    public void onStopNestedScroll(View view) {
        this.f9389.f12774 = 0;
        this.f9378 = false;
        float f = this.f9371;
        if (f > 0.0f) {
            m10128(f);
            this.f9371 = 0.0f;
        }
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f9399);
        int i5 = i4 + this.f9399[1];
        if (i5 < 0 && !m10130()) {
            this.f9371 += (float) Math.abs(i5);
            m10126(this.f9371);
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        C2601 r0 = this.f9391;
        if (r0.f11846) {
            C0293.m4155(r0.f11847);
        }
        r0.f11846 = z;
    }

    public boolean isNestedScrollingEnabled() {
        return this.f9391.f11846;
    }

    public boolean startNestedScroll(int i) {
        return this.f9391.m13789(i, 0);
    }

    public void stopNestedScroll() {
        C2601 r0 = this.f9391;
        ViewParent r2 = r0.m13785(0);
        if (r2 != null) {
            C0301.m4282(r2, r0.f11847, 0);
            r0.m13787(0, (ViewParent) null);
        }
    }

    public boolean hasNestedScrollingParent() {
        return this.f9391.m13785(0) != null;
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f9391.m13786(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f9391.m13790(i, i2, iArr, iArr2, 0);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f9391.m13788(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent r1;
        C2601 r0 = this.f9391;
        if (!r0.f11846 || (r1 = r0.m13785(0)) == null) {
            return false;
        }
        return C0301.m4284(r1, r0.f11847, f, f2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m10126(float f) {
        C1692 r0 = this.f9403;
        C1692.C1693 r1 = r0.f8774;
        boolean z = true;
        if (!r1.f8793) {
            r1.f8793 = true;
        }
        r0.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.f9388));
        float max = (Math.max((float) (((double) min) - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f9388;
        int i = this.f9386;
        if (i <= 0) {
            i = this.f9377 ? this.f9406 - this.f9385 : this.f9406;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f9385 + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f9382.getVisibility() != 0) {
            this.f9382.setVisibility(0);
        }
        if (!this.f9369) {
            this.f9382.setScaleX(1.0f);
            this.f9382.setScaleY(1.0f);
        }
        if (this.f9369) {
            float min2 = Math.min(1.0f, f / this.f9388);
            this.f9382.setScaleX(min2);
            this.f9382.setScaleY(min2);
        }
        if (f < this.f9388) {
            if (this.f9403.getAlpha() > 76) {
                Animation animation = this.f9392;
                if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
                    z = false;
                }
                if (!z) {
                    this.f9392 = m10122(this.f9403.getAlpha(), 76);
                }
            }
        } else if (this.f9403.getAlpha() < 255) {
            Animation animation2 = this.f9400;
            if (animation2 == null || !animation2.hasStarted() || animation2.hasEnded()) {
                z = false;
            }
            if (!z) {
                this.f9400 = m10122(this.f9403.getAlpha(), 255);
            }
        }
        C1692 r3 = this.f9403;
        float min3 = Math.min(0.8f, max * 0.8f);
        r3.f8774.f8784 = 0.0f;
        r3.f8774.f8800 = min3;
        r3.invalidateSelf();
        C1692 r13 = this.f9403;
        float min4 = Math.min(1.0f, max);
        C1692.C1693 r12 = r13.f8774;
        if (min4 != r12.f8797) {
            r12.f8797 = min4;
        }
        r13.invalidateSelf();
        C1692 r132 = this.f9403;
        r132.f8774.f8803 = (((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f;
        r132.invalidateSelf();
        int i3 = i2 - this.f9393;
        this.f9382.bringToFront();
        C0293.m4164((View) this.f9382, i3);
        this.f9393 = this.f9382.getTop();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m10128(float f) {
        if (f > this.f9388) {
            m10129(true, true);
            return;
        }
        this.f9376 = false;
        C1692 r0 = this.f9403;
        r0.f8774.f8784 = 0.0f;
        r0.f8774.f8800 = 0.0f;
        r0.invalidateSelf();
        AnonymousClass5 r02 = null;
        if (!this.f9369) {
            r02 = new Animation.AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!C1830.this.f9369) {
                        C1830.this.m10134((Animation.AnimationListener) null);
                    }
                }
            };
        }
        m10132(this.f9393, r02);
        C1692 r03 = this.f9403;
        C1692.C1693 r1 = r03.f8774;
        if (r1.f8793) {
            r1.f8793 = false;
        }
        r03.invalidateSelf();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m10130() || this.f9376 || this.f9378) {
            return false;
        }
        if (actionMasked == 0) {
            this.f9380 = motionEvent.getPointerId(0);
            this.f9372 = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f9380);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.f9372) {
                this.f9372 = false;
                m10128((motionEvent.getY(findPointerIndex) - this.f9375) * 0.5f);
            }
            this.f9380 = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f9380);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            m10123(y);
            if (this.f9372) {
                float f = (y - this.f9375) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                m10126(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.f9380 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m10125(motionEvent);
            }
        }
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m10123(float f) {
        float f2 = this.f9374;
        int i = this.f9383;
        if (f - f2 > ((float) i) && !this.f9372) {
            this.f9375 = f2 + ((float) i);
            this.f9372 = true;
            this.f9403.setAlpha(76);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m10124(int i, Animation.AnimationListener animationListener) {
        this.f9397 = i;
        this.f9384.reset();
        this.f9384.setDuration(200);
        this.f9384.setInterpolator(this.f9379);
        if (animationListener != null) {
            this.f9382.setAnimationListener(animationListener);
        }
        this.f9382.clearAnimation();
        this.f9382.startAnimation(this.f9384);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m10132(int i, Animation.AnimationListener animationListener) {
        if (this.f9369) {
            m10127(i, animationListener);
            return;
        }
        this.f9397 = i;
        this.f9404.reset();
        this.f9404.setDuration(200);
        this.f9404.setInterpolator(this.f9379);
        if (animationListener != null) {
            this.f9382.setAnimationListener(animationListener);
        }
        this.f9382.clearAnimation();
        this.f9382.startAnimation(this.f9404);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m10135(float f) {
        int i = this.f9397;
        int top = (i + ((int) (((float) (this.f9385 - i)) * f))) - this.f9382.getTop();
        this.f9382.bringToFront();
        C0293.m4164((View) this.f9382, top);
        this.f9393 = this.f9382.getTop();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m10127(int i, Animation.AnimationListener animationListener) {
        this.f9397 = i;
        this.f9373 = this.f9382.getScaleX();
        this.f9396 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                float f2 = C1830.this.f9373 + ((-C1830.this.f9373) * f);
                C1830 r0 = C1830.this;
                r0.f9382.setScaleX(f2);
                r0.f9382.setScaleY(f2);
                C1830.this.m10135(f);
            }
        };
        this.f9396.setDuration(150);
        if (animationListener != null) {
            this.f9382.setAnimationListener(animationListener);
        }
        this.f9382.clearAnimation();
        this.f9382.startAnimation(this.f9396);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m10125(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9380) {
            this.f9380 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
