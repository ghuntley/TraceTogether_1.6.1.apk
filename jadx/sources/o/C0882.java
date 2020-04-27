package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import o.C2745;

/* renamed from: o.ǃŀ  reason: contains not printable characters */
public class C0882 extends FrameLayout implements C2910, C2607 {

    /* renamed from: ſ  reason: contains not printable characters */
    private static final int[] f5669 = {16843130};

    /* renamed from: ƚ  reason: contains not printable characters */
    private static final C0884 f5670 = new C0884();

    /* renamed from: ı  reason: contains not printable characters */
    private long f5671;

    /* renamed from: ŀ  reason: contains not printable characters */
    private int f5672;

    /* renamed from: ł  reason: contains not printable characters */
    private final int[] f5673;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f5674;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private int f5675;

    /* renamed from: ǀ  reason: contains not printable characters */
    private float f5676;

    /* renamed from: ǃ  reason: contains not printable characters */
    private EdgeEffect f5677;

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean f5678;

    /* renamed from: ɍ  reason: contains not printable characters */
    private final C2745.IF f5679;

    /* renamed from: ɨ  reason: contains not printable characters */
    private int f5680;

    /* renamed from: ɩ  reason: contains not printable characters */
    private OverScroller f5681;

    /* renamed from: ɪ  reason: contains not printable characters */
    private VelocityTracker f5682;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f5683;

    /* renamed from: ɺ  reason: contains not printable characters */
    private final C2601 f5684;

    /* renamed from: ɼ  reason: contains not printable characters */
    private C0883 f5685;

    /* renamed from: ɾ  reason: contains not printable characters */
    private boolean f5686;

    /* renamed from: ɿ  reason: contains not printable characters */
    private int f5687;

    /* renamed from: ʅ  reason: contains not printable characters */
    private If f5688;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final int[] f5689;

    /* renamed from: Ι  reason: contains not printable characters */
    private EdgeEffect f5690;

    /* renamed from: ι  reason: contains not printable characters */
    private final Rect f5691;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f5692;

    /* renamed from: г  reason: contains not printable characters */
    private int f5693;

    /* renamed from: і  reason: contains not printable characters */
    private int f5694;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private View f5695;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f5696;

    /* renamed from: o.ǃŀ$ı  reason: contains not printable characters */
    public interface C0883 {
        /* renamed from: ι  reason: contains not printable characters */
        void m6591(C0882 r1);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m6588(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public C0882(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0882(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0882(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5691 = new Rect();
        this.f5692 = true;
        this.f5683 = false;
        this.f5695 = null;
        this.f5674 = false;
        this.f5686 = true;
        this.f5693 = -1;
        this.f5673 = new int[2];
        this.f5689 = new int[2];
        this.f5681 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f5696 = viewConfiguration.getScaledTouchSlop();
        this.f5680 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5687 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5669, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f5679 = new C2745.IF();
        this.f5684 = new C2601(this);
        setNestedScrollingEnabled(true);
        C0293.m4151((View) this, (C2449) f5670);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m6574(int i) {
        C2601 r0 = this.f5684;
        ViewParent r1 = r0.m13785(i);
        if (r1 != null) {
            C0301.m4282(r1, r0.f11847, i);
            r0.m13787(i, (ViewParent) null);
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        C2601 r0 = this.f5684;
        if (r0.f11846) {
            C0293.m4155(r0.f11847);
        }
        r0.f11846 = z;
    }

    public boolean isNestedScrollingEnabled() {
        return this.f5684.f11846;
    }

    public void stopNestedScroll() {
        m6574(0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f5684.m13786(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f5684.m13788(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent r1;
        C2601 r0 = this.f5684;
        if (!r0.f11846 || (r1 = r0.m13785(0)) == null) {
            return false;
        }
        return C0301.m4284(r1, r0.f11847, f, f2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6583(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m6577(i4, i5, iArr);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m6577(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f5684.m13786(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6585(View view, View view2, int i, int i2) {
        C2745.IF ifR = this.f5679;
        if (i2 == 1) {
            ifR.f12775 = i;
        } else {
            ifR.f12774 = i;
        }
        this.f5684.m13789(2, i2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6582(View view, int i) {
        C2745.IF ifR = this.f5679;
        if (i == 1) {
            ifR.f12775 = 0;
        } else {
            ifR.f12774 = 0;
        }
        m6574(i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6587(View view, int i, int i2, int i3, int i4, int i5) {
        m6577(i4, i5, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        m6585(view, view2, i, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m6577(i4, 0, (int[]) null);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m6576((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public int getNestedScrollAxes() {
        C2745.IF ifR = this.f5679;
        return ifR.f12775 | ifR.f12774;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(C0883 r1) {
        this.f5685 = r1;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m6570() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    public void setFillViewport(boolean z) {
        if (z != this.f5678) {
            this.f5678 = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f5686 = z;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0883 r1 = this.f5685;
        if (r1 != null) {
            r1.m6591(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5678 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m6590(keyEvent);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m6590(KeyEvent keyEvent) {
        this.f5691.setEmpty();
        int i = 130;
        if (!m6570()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    m6571(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return m6567(130);
                } else {
                    return m6580(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return m6567(33);
            } else {
                return m6580(33);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r12.f5674
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0093
            r5 = -1
            if (r0 == r2) goto L_0x0067
            if (r0 == r1) goto L_0x0025
            r1 = 3
            if (r0 == r1) goto L_0x0067
            r1 = 6
            if (r0 == r1) goto L_0x0020
            goto L_0x0104
        L_0x0020:
            r12.m6569((android.view.MotionEvent) r13)
            goto L_0x0104
        L_0x0025:
            int r0 = r12.f5693
            if (r0 == r5) goto L_0x0104
            int r0 = r13.findPointerIndex(r0)
            if (r0 == r5) goto L_0x0104
            float r0 = r13.getY(r0)
            int r0 = (int) r0
            int r3 = r12.f5694
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.f5696
            if (r3 <= r5) goto L_0x0104
            int r3 = r12.getNestedScrollAxes()
            r1 = r1 & r3
            if (r1 != 0) goto L_0x0104
            r12.f5674 = r2
            r12.f5694 = r0
            android.view.VelocityTracker r0 = r12.f5682
            if (r0 != 0) goto L_0x0055
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f5682 = r0
        L_0x0055:
            android.view.VelocityTracker r0 = r12.f5682
            r0.addMovement(r13)
            r12.f5672 = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x0104
            r13.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0104
        L_0x0067:
            r12.f5674 = r4
            r12.f5693 = r5
            android.view.VelocityTracker r13 = r12.f5682
            if (r13 == 0) goto L_0x0074
            r13.recycle()
            r12.f5682 = r3
        L_0x0074:
            android.widget.OverScroller r5 = r12.f5681
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.m6586()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x008e
            o.C0293.m4176(r12)
        L_0x008e:
            r12.m6574(r4)
            goto L_0x0104
        L_0x0093:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L_0x00c7
            int r6 = r12.getScrollY()
            android.view.View r7 = r12.getChildAt(r4)
            int r8 = r7.getTop()
            int r8 = r8 - r6
            if (r0 < r8) goto L_0x00c7
            int r8 = r7.getBottom()
            int r8 = r8 - r6
            if (r0 >= r8) goto L_0x00c7
            int r6 = r7.getLeft()
            if (r5 < r6) goto L_0x00c7
            int r6 = r7.getRight()
            if (r5 >= r6) goto L_0x00c7
            r5 = 1
            goto L_0x00c8
        L_0x00c7:
            r5 = 0
        L_0x00c8:
            if (r5 != 0) goto L_0x00d6
            r12.f5674 = r4
            android.view.VelocityTracker r13 = r12.f5682
            if (r13 == 0) goto L_0x0104
            r13.recycle()
            r12.f5682 = r3
            goto L_0x0104
        L_0x00d6:
            r12.f5694 = r0
            int r0 = r13.getPointerId(r4)
            r12.f5693 = r0
            android.view.VelocityTracker r0 = r12.f5682
            if (r0 != 0) goto L_0x00e9
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f5682 = r0
            goto L_0x00ec
        L_0x00e9:
            r0.clear()
        L_0x00ec:
            android.view.VelocityTracker r0 = r12.f5682
            r0.addMovement(r13)
            android.widget.OverScroller r13 = r12.f5681
            r13.computeScrollOffset()
            android.widget.OverScroller r13 = r12.f5681
            boolean r13 = r13.isFinished()
            r13 = r13 ^ r2
            r12.f5674 = r13
            o.іІ r13 = r12.f5684
            r13.m13789(r1, r4)
        L_0x0104:
            boolean r13 = r12.f5674
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0882.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m6569(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5693) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5694 = (int) motionEvent.getY(i);
            this.f5693 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f5682;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f5674) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                if (this.f5676 == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        this.f5676 = typedValue.getDimension(context.getResources().getDisplayMetrics());
                    } else {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                }
                int r0 = m6586();
                int scrollY = getScrollY();
                int i = scrollY - ((int) (axisValue * this.f5676));
                if (i < 0) {
                    i = 0;
                } else if (i > r0) {
                    i = r0;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m6572(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i + i3;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            i2 = 0;
            z = true;
        }
        if (i5 > i4) {
            z2 = true;
        } else if (i5 < 0) {
            z2 = true;
            i4 = 0;
        } else {
            i4 = i5;
            z2 = false;
        }
        if (z2) {
            if (!(this.f5684.m13785(1) != null)) {
                this.f5681.springBack(i2, i4, 0, 0, 0, m6586());
            }
        }
        onOverScrolled(i2, i4, z, z2);
        return z || z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final int m6586() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private View m6568(boolean z, int i, int i2) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m6571(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f5691.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.f5691.top + height > bottom) {
                    this.f5691.top = bottom - height;
                }
            }
        } else {
            this.f5691.top = getScrollY() - height;
            if (this.f5691.top < 0) {
                this.f5691.top = 0;
            }
        }
        Rect rect = this.f5691;
        rect.bottom = rect.top + height;
        return m6581(i, this.f5691.top, this.f5691.bottom);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m6580(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f5691;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f5691.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f5691;
            rect2.top = rect2.bottom - height;
        }
        return m6581(i, this.f5691.top, this.f5691.bottom);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m6581(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = true;
        boolean z2 = i == 33;
        View r5 = m6568(z2, i2, i3);
        if (r5 == null) {
            r5 = this;
        }
        if (i2 < scrollY || i3 > i4) {
            int i5 = z2 ? i2 - scrollY : i3 - i4;
            if (i5 != 0) {
                if (this.f5686) {
                    m6589(0, i5);
                } else {
                    scrollBy(0, i5);
                }
            }
        } else {
            z = false;
        }
        if (r5 != findFocus()) {
            r5.requestFocus(i);
        }
        return z;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m6567(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (((float) getHeight()) * 0.5f);
        if (findNextFocus == null || !m6578(findNextFocus, height, getHeight())) {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            if (height != 0) {
                if (this.f5686) {
                    m6589(0, height);
                } else {
                    scrollBy(0, height);
                }
            }
        } else {
            findNextFocus.getDrawingRect(this.f5691);
            offsetDescendantRectToMyCoords(findNextFocus, this.f5691);
            int r2 = m6579(this.f5691);
            if (r2 != 0) {
                if (this.f5686) {
                    m6589(0, r2);
                } else {
                    scrollBy(0, r2);
                }
            }
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!m6578(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m6578(View view, int i, int i2) {
        view.getDrawingRect(this.f5691);
        offsetDescendantRectToMyCoords(view, this.f5691);
        return this.f5691.bottom + i >= getScrollY() && this.f5691.top - i <= getScrollY() + i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m6589(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f5671 > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f5681;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
                m6574(1);
                this.f5675 = getScrollY();
                C0293.m4176(this);
            } else {
                if (!this.f5681.isFinished()) {
                    this.f5681.abortAnimation();
                    m6574(1);
                }
                scrollBy(i, i2);
            }
            this.f5671 = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void computeScroll() {
        if (!this.f5681.isFinished()) {
            this.f5681.computeScrollOffset();
            int currY = this.f5681.getCurrY();
            int i = currY - this.f5675;
            this.f5675 = currY;
            int[] iArr = this.f5689;
            boolean z = false;
            iArr[1] = 0;
            this.f5684.m13790(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f5689[1];
            int r3 = m6586();
            if (i2 != 0) {
                int scrollY = getScrollY();
                m6572(i2, getScrollX(), scrollY, r3);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f5689;
                iArr2[1] = 0;
                this.f5684.m13786(0, scrollY2, 0, i3, this.f5673, 1, iArr2);
                i2 = i3 - this.f5689[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && r3 > 0)) {
                    z = true;
                }
                if (z) {
                    m6565();
                    if (i2 < 0) {
                        if (this.f5690.isFinished()) {
                            this.f5690.onAbsorb((int) this.f5681.getCurrVelocity());
                        }
                    } else if (this.f5677.isFinished()) {
                        this.f5677.onAbsorb((int) this.f5681.getCurrVelocity());
                    }
                }
                this.f5681.abortAnimation();
                m6574(1);
            }
            if (!this.f5681.isFinished()) {
                C0293.m4176(this);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m6566(View view) {
        view.getDrawingRect(this.f5691);
        offsetDescendantRectToMyCoords(view, this.f5691);
        int r2 = m6579(this.f5691);
        if (r2 != 0) {
            scrollBy(0, r2);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private int m6579(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f5692) {
            m6566(view2);
        } else {
            this.f5695 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !(true ^ m6578(view, 0, getHeight()))) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int r3 = m6579(rect);
        boolean z2 = r3 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, r3);
            } else {
                m6589(0, r3);
            }
        }
        return z2;
    }

    public void requestLayout() {
        this.f5692 = true;
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.f5692 = false;
        View view = this.f5695;
        if (view != null && m6575(view, this)) {
            m6566(this.f5695);
        }
        this.f5695 = null;
        if (!this.f5683) {
            if (this.f5688 != null) {
                scrollTo(getScrollX(), this.f5688.f5697);
                this.f5688 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f5683 = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5683 = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m6578(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f5691);
            offsetDescendantRectToMyCoords(findFocus, this.f5691);
            int r1 = m6579(this.f5691);
            if (r1 == 0) {
                return;
            }
            if (this.f5686) {
                m6589(0, r1);
            } else {
                scrollBy(0, r1);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m6575(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m6575((View) parent, view2)) {
            return false;
        }
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m6576(int i) {
        if (getChildCount() > 0) {
            this.f5681.fling(getScrollX(), getScrollY(), 0, i, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            this.f5684.m13789(2, 1);
            this.f5675 = getScrollY();
            C0293.m4176(this);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m6573() {
        this.f5674 = false;
        VelocityTracker velocityTracker = this.f5682;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5682 = null;
        }
        m6574(0);
        EdgeEffect edgeEffect = this.f5690;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f5677.onRelease();
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m6565() {
        if (getOverScrollMode() == 2) {
            this.f5690 = null;
            this.f5677 = null;
        } else if (this.f5690 == null) {
            Context context = getContext();
            this.f5690 = new EdgeEffect(context);
            this.f5677 = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f5690 != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f5690.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f5690.setSize(width, height);
                if (this.f5690.draw(canvas)) {
                    C0293.m4176(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f5677.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(m6586(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f5677.setSize(width2, height2);
                if (this.f5677.draw(canvas)) {
                    C0293.m4176(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof If)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        If ifR = (If) parcelable;
        super.onRestoreInstanceState(ifR.getSuperState());
        this.f5688 = ifR;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        If ifR = new If(super.onSaveInstanceState());
        ifR.f5697 = getScrollY();
        return ifR;
    }

    /* renamed from: o.ǃŀ$If */
    static class If extends View.BaseSavedState {
        public static final Parcelable.Creator<If> CREATOR = new Parcelable.Creator<If>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new If[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new If(parcel);
            }
        };

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f5697;

        If(Parcelable parcelable) {
            super(parcelable);
        }

        If(Parcel parcel) {
            super(parcel);
            this.f5697 = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5697);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.f5697);
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: o.ǃŀ$ǃ  reason: contains not printable characters */
    static class C0884 extends C2449 {
        C0884() {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m6593(View view, int i, Bundle bundle) {
            if (super.m12580(view, i, bundle)) {
                return true;
            }
            C0882 r3 = (C0882) view;
            if (!r3.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(r3.getScrollY() + ((r3.getHeight() - r3.getPaddingBottom()) - r3.getPaddingTop()), r3.m6586());
                if (min == r3.getScrollY()) {
                    return false;
                }
                r3.m6589(0 - r3.getScrollX(), min - r3.getScrollY());
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(r3.getScrollY() - ((r3.getHeight() - r3.getPaddingBottom()) - r3.getPaddingTop()), 0);
                if (max == r3.getScrollY()) {
                    return false;
                }
                r3.m6589(0 - r3.getScrollX(), max - r3.getScrollY());
                return true;
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m6592(View view, C0520 r4) {
            int r0;
            super.m12579(view, r4);
            C0882 r3 = (C0882) view;
            r4.m5022((CharSequence) ScrollView.class.getName());
            if (r3.isEnabled() && (r0 = r3.m6586()) > 0) {
                r4.m5028(true);
                if (r3.getScrollY() > 0) {
                    r4.m5030(8192);
                }
                if (r3.getScrollY() < r0) {
                    r4.m5030((int) C0872.f5653);
                }
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m6594(View view, AccessibilityEvent accessibilityEvent) {
            super.m12584(view, accessibilityEvent);
            C0882 r2 = (C0882) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(r2.m6586() > 0);
            accessibilityEvent.setScrollX(r2.getScrollX());
            accessibilityEvent.setScrollY(r2.getScrollY());
            C0662.m5493(accessibilityEvent, r2.getScrollX());
            C0662.m5494(accessibilityEvent, r2.m6586());
        }
    }

    public boolean startNestedScroll(int i) {
        return this.f5684.m13789(i, 0);
    }

    public boolean hasNestedScrollingParent() {
        return this.f5684.m13785(0) != null;
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f5684.m13790(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6584(View view, int i, int i2, int[] iArr, int i3) {
        this.f5684.m13790(i, i2, iArr, (int[]) null, i3);
    }

    public void onStopNestedScroll(View view) {
        this.f5679.f12774 = 0;
        m6574(0);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.f5684.m13790(i, i2, iArr, (int[]) null, 0);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f5682) != null) {
            velocityTracker.recycle();
            this.f5682 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f5682 == null) {
            this.f5682 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5672 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f5672);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f5682;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f5687);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f5693);
                if (Math.abs(yVelocity) > this.f5680) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        m6576(i);
                    }
                } else if (this.f5681.springBack(getScrollX(), getScrollY(), 0, 0, 0, m6586())) {
                    C0293.m4176(this);
                }
                this.f5693 = -1;
                m6573();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f5693);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i2 = this.f5694 - y;
                    if (this.f5684.m13790(0, i2, this.f5689, this.f5673, 0)) {
                        i2 -= this.f5689[1];
                        this.f5672 += this.f5673[1];
                    }
                    if (!this.f5674 && Math.abs(i2) > this.f5696) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f5674 = true;
                        if (i2 > 0) {
                            i2 -= this.f5696;
                        } else {
                            i2 += this.f5696;
                        }
                    }
                    if (this.f5674) {
                        this.f5694 = y - this.f5673[1];
                        int scrollY = getScrollY();
                        int r8 = m6586();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && r8 > 0);
                        if (m6572(i2, 0, getScrollY(), r8)) {
                            if (!(this.f5684.m13785(0) != null)) {
                                this.f5682.clear();
                            }
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f5689;
                        iArr[1] = 0;
                        this.f5684.m13786(0, scrollY2, 0, i2 - scrollY2, this.f5673, 0, iArr);
                        int i3 = this.f5694;
                        int[] iArr2 = this.f5673;
                        this.f5694 = i3 - iArr2[1];
                        this.f5672 += iArr2[1];
                        if (z) {
                            int i4 = i2 - this.f5689[1];
                            m6565();
                            int i5 = scrollY + i4;
                            if (i5 < 0) {
                                C0715.m5832(this.f5690, ((float) i4) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f5677.isFinished()) {
                                    this.f5677.onRelease();
                                }
                            } else if (i5 > r8) {
                                C0715.m5832(this.f5677, ((float) i4) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f5690.isFinished()) {
                                    this.f5690.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f5690;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f5677.isFinished())) {
                                C0293.m4176(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f5674 && getChildCount() > 0 && this.f5681.springBack(getScrollX(), getScrollY(), 0, 0, 0, m6586())) {
                    C0293.m4176(this);
                }
                this.f5693 = -1;
                m6573();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f5694 = (int) motionEvent2.getY(actionIndex);
                this.f5693 = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m6569(motionEvent);
                this.f5694 = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f5693));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f5681.isFinished();
            this.f5674 = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f5681.isFinished()) {
                this.f5681.abortAnimation();
                m6574(1);
            }
            this.f5694 = (int) motionEvent.getY();
            this.f5693 = motionEvent2.getPointerId(0);
            this.f5684.m13789(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f5682;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }
}
