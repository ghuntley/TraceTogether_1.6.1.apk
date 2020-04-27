package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import o.C1483;
import o.C2745;

/* renamed from: o.ӷ  reason: contains not printable characters */
public class C2933 extends ViewGroup implements C2155, C2910 {

    /* renamed from: ɼ  reason: contains not printable characters */
    private static int[] f13614 = {R.attr.f148142130968580, 16842841};

    /* renamed from: ı  reason: contains not printable characters */
    final AnimatorListenerAdapter f13615;

    /* renamed from: ŀ  reason: contains not printable characters */
    private final Rect f13616;

    /* renamed from: ł  reason: contains not printable characters */
    private final Rect f13617;

    /* renamed from: ſ  reason: contains not printable characters */
    private final Runnable f13618;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C1969 f13619;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private OverScroller f13620;

    /* renamed from: ƚ  reason: contains not printable characters */
    private C2935 f13621;

    /* renamed from: ǀ  reason: contains not printable characters */
    private final Runnable f13622;

    /* renamed from: ǃ  reason: contains not printable characters */
    ViewPropertyAnimator f13623;

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean f13624;

    /* renamed from: ɍ  reason: contains not printable characters */
    private final Rect f13625;

    /* renamed from: ɟ  reason: contains not printable characters */
    private final C2745.IF f13626;

    /* renamed from: ɨ  reason: contains not printable characters */
    private int f13627;

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean f13628;

    /* renamed from: ɪ  reason: contains not printable characters */
    private boolean f13629;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f13630;

    /* renamed from: ɾ  reason: contains not printable characters */
    private boolean f13631;

    /* renamed from: ɿ  reason: contains not printable characters */
    private final Rect f13632;

    /* renamed from: ʅ  reason: contains not printable characters */
    private final Rect f13633;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final Rect f13634;

    /* renamed from: Ι  reason: contains not printable characters */
    C1771 f13635;

    /* renamed from: ι  reason: contains not printable characters */
    public boolean f13636;

    /* renamed from: І  reason: contains not printable characters */
    private Drawable f13637;

    /* renamed from: г  reason: contains not printable characters */
    private final Rect f13638;

    /* renamed from: і  reason: contains not printable characters */
    private C2717 f13639;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f13640;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f13641;

    /* renamed from: o.ӷ$ɩ  reason: contains not printable characters */
    public interface C2935 {
        /* renamed from: ı  reason: contains not printable characters */
        void m15163(boolean z);

        /* renamed from: Ɩ  reason: contains not printable characters */
        void m15164();

        /* renamed from: ɹ  reason: contains not printable characters */
        void m15165();

        /* renamed from: ɾ  reason: contains not printable characters */
        void m15166();

        /* renamed from: ι  reason: contains not printable characters */
        void m15167(int i);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public C2933(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2933(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13640 = 0;
        this.f13634 = new Rect();
        this.f13638 = new Rect();
        this.f13616 = new Rect();
        this.f13632 = new Rect();
        this.f13617 = new Rect();
        this.f13625 = new Rect();
        this.f13633 = new Rect();
        this.f13615 = new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C2933 r2 = C2933.this;
                r2.f13623 = null;
                r2.f13628 = false;
            }

            public final void onAnimationCancel(Animator animator) {
                C2933 r2 = C2933.this;
                r2.f13623 = null;
                r2.f13628 = false;
            }
        };
        this.f13618 = new Runnable() {
            public final void run() {
                C2933.this.m15149();
                C2933 r0 = C2933.this;
                r0.f13623 = r0.f13635.animate().translationY(0.0f).setListener(C2933.this.f13615);
            }
        };
        this.f13622 = new Runnable() {
            public final void run() {
                C2933.this.m15149();
                C2933 r0 = C2933.this;
                r0.f13623 = r0.f13635.animate().translationY((float) (-C2933.this.f13635.getHeight())).setListener(C2933.this.f13615);
            }
        };
        m15147(context);
        this.f13626 = new C2745.IF();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m15147(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f13614);
        boolean z = false;
        this.f13630 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f13637 = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f13637 == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f13629 = z;
        this.f13620 = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m15149();
    }

    public void setActionBarVisibilityCallback(C2935 r2) {
        this.f13621 = r2;
        if (getWindowToken() != null) {
            this.f13621.m15167(this.f13640);
            int i = this.f13641;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0293.m4154(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.f13636 = z;
        this.f13629 = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f13624 = z;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m15147(getContext());
        C0293.m4154(this);
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m15148();
        int i2 = this.f13641 ^ i;
        this.f13641 = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C2935 r5 = this.f13621;
        if (r5 != null) {
            r5.m15163(!z);
            if (z2 || !z) {
                this.f13621.m15164();
            } else {
                this.f13621.m15165();
            }
        }
        if ((i2 & 256) != 0 && this.f13621 != null) {
            C0293.m4154(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f13640 = i;
        C2935 r0 = this.f13621;
        if (r0 != null) {
            r0.m15167(i);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m15145(View view, Rect rect, boolean z) {
        boolean z2;
        C2934 r4 = (C2934) view.getLayoutParams();
        if (r4.leftMargin != rect.left) {
            r4.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (r4.topMargin != rect.top) {
            r4.topMargin = rect.top;
            z2 = true;
        }
        if (r4.rightMargin != rect.right) {
            r4.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || r4.bottomMargin == rect.bottom) {
            return z2;
        }
        r4.bottomMargin = rect.bottom;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        m15148();
        C0293.m4189(this);
        boolean r0 = m15145(this.f13635, rect, false);
        this.f13632.set(rect);
        C2373.m12362(this, this.f13632, this.f13634);
        if (!this.f13617.equals(this.f13632)) {
            this.f13617.set(this.f13632);
            r0 = true;
        }
        if (!this.f13638.equals(this.f13634)) {
            this.f13638.set(this.f13634);
            r0 = true;
        }
        if (r0) {
            requestLayout();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2934(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2934;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m15148();
        measureChildWithMargins(this.f13635, i, 0, i2, 0);
        C2934 r0 = (C2934) this.f13635.getLayoutParams();
        int i3 = 0;
        int max = Math.max(0, this.f13635.getMeasuredWidth() + r0.leftMargin + r0.rightMargin);
        int max2 = Math.max(0, this.f13635.getMeasuredHeight() + r0.topMargin + r0.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f13635.getMeasuredState());
        boolean z = (C0293.m4189(this) & 256) != 0;
        if (z) {
            i3 = this.f13630;
            if (this.f13624 && this.f13635.f9094 != null) {
                i3 += this.f13630;
            }
        } else if (this.f13635.getVisibility() != 8) {
            i3 = this.f13635.getMeasuredHeight();
        }
        this.f13616.set(this.f13634);
        this.f13625.set(this.f13632);
        if (this.f13636 || z) {
            this.f13625.top += i3;
            Rect rect = this.f13625;
            rect.bottom = rect.bottom;
        } else {
            this.f13616.top += i3;
            Rect rect2 = this.f13616;
            rect2.bottom = rect2.bottom;
        }
        m15145(this.f13619, this.f13616, true);
        if (!this.f13633.equals(this.f13625)) {
            this.f13633.set(this.f13625);
            this.f13619.m10696(this.f13625);
        }
        measureChildWithMargins(this.f13619, i, 0, i2, 0);
        C2934 r2 = (C2934) this.f13619.getLayoutParams();
        int max3 = Math.max(max, this.f13619.getMeasuredWidth() + r2.leftMargin + r2.rightMargin);
        int max4 = Math.max(max2, this.f13619.getMeasuredHeight() + r2.topMargin + r2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f13619.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C2934 r0 = (C2934) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = r0.leftMargin + paddingLeft;
                int i7 = r0.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f13637 != null && !this.f13629) {
            int bottom = this.f13635.getVisibility() == 0 ? (int) (((float) this.f13635.getBottom()) + this.f13635.getTranslationY() + 0.5f) : 0;
            this.f13637.setBounds(0, bottom, getWidth(), this.f13637.getIntrinsicHeight() + bottom);
            this.f13637.draw(canvas);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m15160(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15154(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m15150(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m15158(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15153(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f13635.getVisibility() != 0) {
            return false;
        }
        return this.f13631;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f13626.f12774 = i;
        C1771 r1 = this.f13635;
        this.f13627 = r1 != null ? -((int) r1.getTranslationY()) : 0;
        m15149();
        C2935 r12 = this.f13621;
        if (r12 != null) {
            r12.m15166();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f13627 += i2;
        setActionBarHideOffset(this.f13627);
    }

    public void onStopNestedScroll(View view) {
        if (this.f13631 && !this.f13628) {
            if (this.f13627 <= this.f13635.getHeight()) {
                m15149();
                postDelayed(this.f13618, 600);
                return;
            }
            m15149();
            postDelayed(this.f13622, 600);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.f13631 || !z) {
            return false;
        }
        this.f13620.fling(0, 0, 0, (int) f2, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        if (this.f13620.getFinalY() > this.f13635.getHeight()) {
            z2 = true;
        }
        if (z2) {
            m15149();
            this.f13622.run();
        } else {
            m15149();
            this.f13618.run();
        }
        this.f13628 = true;
        return true;
    }

    public int getNestedScrollAxes() {
        C2745.IF ifR = this.f13626;
        return ifR.f12775 | ifR.f12774;
    }

    /* renamed from: І  reason: contains not printable characters */
    private void m15148() {
        if (this.f13619 == null) {
            this.f13619 = (C1969) findViewById(R.id.f164302131361900);
            this.f13635 = (C1771) findViewById(R.id.f164312131361901);
            this.f13639 = m15146(findViewById(R.id.f164292131361899));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static C2717 m15146(View view) {
        if (view instanceof C2717) {
            return (C2717) view;
        }
        if (view instanceof C2026) {
            C2026 r3 = (C2026) view;
            if (r3.f10017 == null) {
                r3.f10017 = new C1920(r3, true);
            }
            return r3.f10017;
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f13631) {
            this.f13631 = z;
            if (!z) {
                m15149();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setActionBarHideOffset(int i) {
        m15149();
        this.f13635.setTranslationY((float) (-Math.max(0, Math.min(i, this.f13635.getHeight()))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m15149() {
        removeCallbacks(this.f13618);
        removeCallbacks(this.f13622);
        ViewPropertyAnimator viewPropertyAnimator = this.f13623;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void setWindowCallback(Window.Callback callback) {
        m15148();
        this.f13639.m14432(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        m15148();
        this.f13639.m14428(charSequence);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m15157(int i) {
        m15148();
        if (i != 2 && i != 5 && i == 109) {
            setOverlayMode(true);
        }
    }

    public void setIcon(int i) {
        m15148();
        this.f13639.m14442(i);
    }

    public void setIcon(Drawable drawable) {
        m15148();
        this.f13639.m14431(drawable);
    }

    public void setLogo(int i) {
        m15148();
        this.f13639.m14438(i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m15155() {
        m15148();
        return this.f13639.m14433();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m15151() {
        m15148();
        return this.f13639.m14435();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m15161() {
        m15148();
        return this.f13639.m14443();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m15159() {
        m15148();
        return this.f13639.m14445();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final boolean m15162() {
        m15148();
        return this.f13639.m14424();
    }

    public void setMenuPrepared() {
        m15148();
        this.f13639.m14444();
    }

    public void setMenu(Menu menu, C1483.C1484 r3) {
        m15148();
        this.f13639.m14427(menu, r3);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m15156() {
        m15148();
        this.f13639.m14434();
    }

    /* renamed from: o.ӷ$ǃ  reason: contains not printable characters */
    public static class C2934 extends ViewGroup.MarginLayoutParams {
        public C2934(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2934() {
            super(-1, -1);
        }

        public C2934(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15152(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2934();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2934(getContext(), attributeSet);
    }
}
