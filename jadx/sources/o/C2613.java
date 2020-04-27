package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.јı  reason: contains not printable characters */
public class C2613 extends ViewGroup {

    /* renamed from: ı  reason: contains not printable characters */
    static final int[] f11874 = {16842931};

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Comparator<C3647If> f11875 = new Comparator<C3647If>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C3647If) obj).f11939 - ((C3647If) obj2).f11939;
        }
    };

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final Interpolator f11876 = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: ʃ  reason: contains not printable characters */
    private static final C2618 f11877 = new C2618();

    /* renamed from: ıı  reason: contains not printable characters */
    private boolean f11878 = true;

    /* renamed from: ıǃ  reason: contains not printable characters */
    private int f11879;

    /* renamed from: ŀ  reason: contains not printable characters */
    private Drawable f11880;

    /* renamed from: ł  reason: contains not printable characters */
    private int f11881;

    /* renamed from: ſ  reason: contains not printable characters */
    private boolean f11882;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final ArrayList<C3647If> f11883 = new ArrayList<>();

    /* renamed from: Ɨ  reason: contains not printable characters */
    private float f11884 = Float.MAX_VALUE;

    /* renamed from: ƚ  reason: contains not printable characters */
    private int f11885;

    /* renamed from: ǀ  reason: contains not printable characters */
    private boolean f11886;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f11887;

    /* renamed from: ǃı  reason: contains not printable characters */
    private C3648iF f11888;

    /* renamed from: ǃǃ  reason: contains not printable characters */
    private C3648iF f11889;

    /* renamed from: ȷ  reason: contains not printable characters */
    private IF f11890;

    /* renamed from: ɂ  reason: contains not printable characters */
    private C2617 f11891;

    /* renamed from: Ɉ  reason: contains not printable characters */
    private List<C2614> f11892;

    /* renamed from: ɉ  reason: contains not printable characters */
    private int f11893;

    /* renamed from: ɍ  reason: contains not printable characters */
    private int f11894;

    /* renamed from: ɔ  reason: contains not printable characters */
    private boolean f11895;

    /* renamed from: ɟ  reason: contains not printable characters */
    private int f11896;

    /* renamed from: ɨ  reason: contains not printable characters */
    private Scroller f11897;

    /* renamed from: ɪ  reason: contains not printable characters */
    private boolean f11898;

    /* renamed from: ɭ  reason: contains not printable characters */
    private VelocityTracker f11899;

    /* renamed from: ɺ  reason: contains not printable characters */
    private int f11900 = 1;

    /* renamed from: ɻ  reason: contains not printable characters */
    private EdgeEffect f11901;

    /* renamed from: ɼ  reason: contains not printable characters */
    private boolean f11902;

    /* renamed from: ɾ  reason: contains not printable characters */
    private ClassLoader f11903 = null;

    /* renamed from: ɿ  reason: contains not printable characters */
    private float f11904 = -3.4028235E38f;

    /* renamed from: ʅ  reason: contains not printable characters */
    private boolean f11905;

    /* renamed from: ʌ  reason: contains not printable characters */
    private ArrayList<View> f11906;

    /* renamed from: ʏ  reason: contains not printable characters */
    private int f11907;

    /* renamed from: ʔ  reason: contains not printable characters */
    private boolean f11908;

    /* renamed from: ʕ  reason: contains not printable characters */
    private int f11909;

    /* renamed from: ʖ  reason: contains not printable characters */
    private EdgeEffect f11910;

    /* renamed from: ʟ  reason: contains not printable characters */
    private int f11911;

    /* renamed from: ͻ  reason: contains not printable characters */
    private float f11912;

    /* renamed from: ͼ  reason: contains not printable characters */
    private int f11913 = 0;

    /* renamed from: ͽ  reason: contains not printable characters */
    private final Runnable f11914 = new Runnable() {
        public final void run() {
            C2613.this.m13874(0);
            C2613.this.m13858();
        }
    };

    /* renamed from: Γ  reason: contains not printable characters */
    private List<C3648iF> f11915;

    /* renamed from: Ι  reason: contains not printable characters */
    C2676 f11916;

    /* renamed from: ι  reason: contains not printable characters */
    int f11917;

    /* renamed from: τ  reason: contains not printable characters */
    private boolean f11918 = false;

    /* renamed from: ϲ  reason: contains not printable characters */
    private float f11919;

    /* renamed from: ϳ  reason: contains not printable characters */
    private float f11920;

    /* renamed from: І  reason: contains not printable characters */
    private final Rect f11921 = new Rect();

    /* renamed from: Ј  reason: contains not printable characters */
    private int f11922;

    /* renamed from: Г  reason: contains not printable characters */
    private boolean f11923;

    /* renamed from: г  reason: contains not printable characters */
    private int f11924;

    /* renamed from: с  reason: contains not printable characters */
    private int f11925;

    /* renamed from: т  reason: contains not printable characters */
    private int f11926;

    /* renamed from: х  reason: contains not printable characters */
    private float f11927;

    /* renamed from: і  reason: contains not printable characters */
    private final C3647If f11928 = new C3647If();

    /* renamed from: ј  reason: contains not printable characters */
    private int f11929;

    /* renamed from: ґ  reason: contains not printable characters */
    private int f11930 = -1;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f11931 = -1;

    /* renamed from: ӏ  reason: contains not printable characters */
    private Parcelable f11932 = null;

    /* renamed from: ӷ  reason: contains not printable characters */
    private int f11933;

    /* renamed from: o.јı$iF  reason: case insensitive filesystem */
    public interface C3648iF {
        /* renamed from: ı  reason: contains not printable characters */
        void m13884(int i);

        /* renamed from: ı  reason: contains not printable characters */
        void m13885(int i, float f, int i2);

        /* renamed from: ι  reason: contains not printable characters */
        void m13886(int i);
    }

    /* renamed from: o.јı$ı  reason: contains not printable characters */
    public interface C2614 {
        /* renamed from: Ι  reason: contains not printable characters */
        void m13887(C2613 r1, C2676 r2, C2676 r3);
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.јı$ɩ  reason: contains not printable characters */
    public @interface C2616 {
    }

    /* renamed from: o.јı$Ι  reason: contains not printable characters */
    public interface C2617 {
        /* renamed from: ı  reason: contains not printable characters */
        void m13891(View view, float f);
    }

    /* renamed from: o.јı$If  reason: case insensitive filesystem */
    static class C3647If {

        /* renamed from: ı  reason: contains not printable characters */
        float f11938;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f11939;

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean f11940;

        /* renamed from: Ι  reason: contains not printable characters */
        Object f11941;

        /* renamed from: ι  reason: contains not printable characters */
        float f11942;

        C3647If() {
        }
    }

    public C2613(Context context) {
        super(context);
        m13868();
    }

    public C2613(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13868();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m13868() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f11897 = new Scroller(context, f11876);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f11922 = viewConfiguration.getScaledPagingTouchSlop();
        this.f11926 = (int) (400.0f * f);
        this.f11929 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f11901 = new EdgeEffect(context);
        this.f11910 = new EdgeEffect(context);
        this.f11907 = (int) (25.0f * f);
        this.f11909 = (int) (2.0f * f);
        this.f11896 = (int) (f * 16.0f);
        C0293.m4151((View) this, (C2449) new C2615());
        if (C0293.m4217(this) == 0) {
            C0293.m4203((View) this, 1);
        }
        C0293.m4207((View) this, (C2850) new C2850() {

            /* renamed from: ǃ  reason: contains not printable characters */
            private final Rect f11935 = new Rect();

            /* renamed from: ɩ  reason: contains not printable characters */
            public final C0501 m13883(View view, C0501 r7) {
                C0501 r6 = C0293.m4202(view, r7);
                if (r6.m4897()) {
                    return r6;
                }
                Rect rect = this.f11935;
                rect.left = r6.m4895();
                rect.top = r6.m4893();
                rect.right = r6.m4894();
                rect.bottom = r6.m4890();
                int childCount = C2613.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0501 r2 = C0293.m4175(C2613.this.getChildAt(i), r6);
                    rect.left = Math.min(r2.m4895(), rect.left);
                    rect.top = Math.min(r2.m4893(), rect.top);
                    rect.right = Math.min(r2.m4894(), rect.right);
                    rect.bottom = Math.min(r2.m4890(), rect.bottom);
                }
                return r6.m4891(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f11914);
        Scroller scroller = this.f11897;
        if (scroller != null && !scroller.isFinished()) {
            this.f11897.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m13874(int i) {
        if (this.f11913 != i) {
            this.f11913 = i;
            if (this.f11891 != null) {
                m13853(i != 0);
            }
            m13857(i);
        }
    }

    public void setAdapter(C2676 r8) {
        C2676 r0 = this.f11916;
        if (r0 != null) {
            r0.m14222((DataSetObserver) null);
            this.f11916.m14229((ViewGroup) this);
            for (int i = 0; i < this.f11883.size(); i++) {
                C3647If ifR = this.f11883.get(i);
                this.f11916.m14241((ViewGroup) this, ifR.f11939, ifR.f11941);
            }
            this.f11916.m14224((ViewGroup) this);
            this.f11883.clear();
            m13849();
            this.f11917 = 0;
            scrollTo(0, 0);
        }
        C2676 r02 = this.f11916;
        this.f11916 = r8;
        this.f11887 = 0;
        if (this.f11916 != null) {
            if (this.f11890 == null) {
                this.f11890 = new IF();
            }
            this.f11916.m14222((DataSetObserver) this.f11890);
            this.f11895 = false;
            boolean z = this.f11878;
            this.f11878 = true;
            this.f11887 = this.f11916.m14230();
            if (this.f11931 >= 0) {
                this.f11916.m14238(this.f11932, this.f11903);
                m13860(this.f11931, false, true);
                this.f11931 = -1;
                this.f11932 = null;
                this.f11903 = null;
            } else if (!z) {
                m13858();
            } else {
                requestLayout();
            }
        }
        List<C2614> list = this.f11892;
        if (list != null && !list.isEmpty()) {
            int size = this.f11892.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f11892.get(i2).m13887(this, r02, r8);
            }
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private void m13849() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((Cif) getChildAt(i).getLayoutParams()).f11946) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C2676 m13873() {
        return this.f11916;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m13861(C2614 r2) {
        if (this.f11892 == null) {
            this.f11892 = new ArrayList();
        }
        this.f11892.add(r2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m13870(C2614 r2) {
        List<C2614> list = this.f11892;
        if (list != null) {
            list.remove(r2);
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int m13838() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.f11895 = false;
        m13860(i, !this.f11878, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.f11895 = false;
        m13860(i, z, false);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public int m13865() {
        return this.f11917;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m13860(int i, boolean z, boolean z2) {
        m13876(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m13876(int i, boolean z, boolean z2, int i2) {
        C2676 r0 = this.f11916;
        if (r0 == null || r0.m14230() <= 0) {
            m13850(false);
        } else if (z2 || this.f11917 != i || this.f11883.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f11916.m14230()) {
                i = this.f11916.m14230() - 1;
            }
            int i3 = this.f11900;
            int i4 = this.f11917;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f11883.size(); i5++) {
                    this.f11883.get(i5).f11940 = true;
                }
            }
            if (this.f11917 == i) {
                z3 = false;
            }
            if (this.f11878) {
                this.f11917 = i;
                if (z3) {
                    m13856(i);
                }
                requestLayout();
                return;
            }
            m13869(i);
            m13839(i, z, i2, z3);
        } else {
            m13850(false);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m13839(int i, boolean z, int i2, boolean z2) {
        C3647If r0 = m13866(i);
        int r02 = r0 != null ? (int) (((float) m13838()) * Math.max(this.f11904, Math.min(r0.f11938, this.f11884))) : 0;
        if (z) {
            m13875(r02, 0, i2);
            if (z2) {
                m13856(i);
                return;
            }
            return;
        }
        if (z2) {
            m13856(i);
        }
        m13840(false);
        scrollTo(r02, 0);
        m13854(r02);
    }

    @Deprecated
    public void setOnPageChangeListener(C3648iF iFVar) {
        this.f11889 = iFVar;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m13867(C3648iF iFVar) {
        if (this.f11915 == null) {
            this.f11915 = new ArrayList();
        }
        this.f11915.add(iFVar);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m13880(C3648iF iFVar) {
        List<C3648iF> list = this.f11915;
        if (list != null) {
            list.remove(iFVar);
        }
    }

    public void setPageTransformer(boolean z, C2617 r3) {
        setPageTransformer(z, r3, 2);
    }

    public void setPageTransformer(boolean z, C2617 r6, int i) {
        int i2 = 1;
        boolean z2 = r6 != null;
        boolean z3 = z2 != (this.f11891 != null);
        this.f11891 = r6;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.f11893 = i2;
            this.f11879 = i;
        } else {
            this.f11893 = 0;
        }
        if (z3) {
            m13858();
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f11893 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((Cif) this.f11906.get(i2).getLayoutParams()).f11951;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f11900) {
            this.f11900 = i;
            m13858();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f11911;
        this.f11911 = i;
        int width = getWidth();
        m13835(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f11880 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0651.m5458(getContext(), i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11880;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11880;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public float m13864(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m13875(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            m13850(false);
            return;
        }
        Scroller scroller = this.f11897;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f11898 ? this.f11897.getCurrX() : this.f11897.getStartX();
            this.f11897.abortAnimation();
            m13850(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = i2 - scrollY;
        if (i7 == 0 && i8 == 0) {
            m13840(false);
            m13858();
            m13874(0);
            return;
        }
        m13850(true);
        m13874(2);
        int r10 = m13838();
        int i9 = r10 / 2;
        float f = (float) r10;
        float f2 = (float) i9;
        float r11 = f2 + (m13864(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(r11 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f11916.m14226(this.f11917)) + ((float) this.f11911))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f11898 = false;
        this.f11897.startScroll(i6, scrollY, i7, i8, min);
        C0293.m4176(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public C3647If m13871(int i, int i2) {
        C3647If ifR = new C3647If();
        ifR.f11939 = i;
        ifR.f11941 = this.f11916.m14233(this, i);
        ifR.f11942 = this.f11916.m14226(i);
        if (i2 < 0 || i2 >= this.f11883.size()) {
            this.f11883.add(ifR);
        } else {
            this.f11883.add(i2, ifR);
        }
        return ifR;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m13879() {
        int r0 = this.f11916.m14230();
        this.f11887 = r0;
        boolean z = this.f11883.size() < (this.f11900 * 2) + 1 && this.f11883.size() < r0;
        int i = this.f11917;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f11883.size()) {
            C3647If ifR = this.f11883.get(i2);
            int r8 = this.f11916.m14221(ifR.f11941);
            if (r8 != -1) {
                if (r8 == -2) {
                    this.f11883.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f11916.m14229((ViewGroup) this);
                        z2 = true;
                    }
                    this.f11916.m14241((ViewGroup) this, ifR.f11939, ifR.f11941);
                    if (this.f11917 == ifR.f11939) {
                        i = Math.max(0, Math.min(this.f11917, r0 - 1));
                    }
                } else if (ifR.f11939 != r8) {
                    if (ifR.f11939 == this.f11917) {
                        i = r8;
                    }
                    ifR.f11939 = r8;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f11916.m14224((ViewGroup) this);
        }
        Collections.sort(this.f11883, f11875);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                Cif ifVar = (Cif) getChildAt(i3).getLayoutParams();
                if (!ifVar.f11946) {
                    ifVar.f11950 = 0.0f;
                }
            }
            m13860(i, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m13858() {
        m13869(this.f11917);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r8.f11939 == r0.f11917) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r8 = null;
     */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m13869(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f11917
            if (r2 == r1) goto L_0x000f
            o.јı$If r2 = r0.m13866((int) r2)
            r0.f11917 = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            o.ґı r1 = r0.f11916
            if (r1 != 0) goto L_0x0018
            r17.m13855()
            return
        L_0x0018:
            boolean r1 = r0.f11895
            if (r1 == 0) goto L_0x0020
            r17.m13855()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            o.ґı r1 = r0.f11916
            r1.m14229((android.view.ViewGroup) r0)
            int r1 = r0.f11900
            int r4 = r0.f11917
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            o.ґı r6 = r0.f11916
            int r6 = r6.m14230()
            int r7 = r6 + -1
            int r8 = r0.f11917
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f11887
            if (r6 != r7) goto L_0x0215
            r7 = 0
        L_0x004a:
            java.util.ArrayList<o.јı$If> r8 = r0.f11883
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x006a
            java.util.ArrayList<o.јı$If> r8 = r0.f11883
            java.lang.Object r8 = r8.get(r7)
            o.јı$If r8 = (o.C2613.C3647If) r8
            int r9 = r8.f11939
            int r10 = r0.f11917
            if (r9 < r10) goto L_0x0067
            int r9 = r8.f11939
            int r10 = r0.f11917
            if (r9 != r10) goto L_0x006a
            goto L_0x006b
        L_0x0067:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x006a:
            r8 = 0
        L_0x006b:
            if (r8 != 0) goto L_0x0075
            if (r6 <= 0) goto L_0x0075
            int r8 = r0.f11917
            o.јı$If r8 = r0.m13871(r8, r7)
        L_0x0075:
            r9 = 0
            if (r8 == 0) goto L_0x01a2
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0085
            java.util.ArrayList<o.јı$If> r11 = r0.f11883
            java.lang.Object r11 = r11.get(r10)
            o.јı$If r11 = (o.C2613.C3647If) r11
            goto L_0x0086
        L_0x0085:
            r11 = 0
        L_0x0086:
            int r12 = r17.m13838()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x0090
            r3 = 0
            goto L_0x009d
        L_0x0090:
            float r14 = r8.f11942
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r3 = r14 + r15
        L_0x009d:
            int r14 = r0.f11917
            int r14 = r14 + -1
            r15 = r10
            r10 = r7
            r7 = 0
        L_0x00a4:
            if (r14 < 0) goto L_0x0104
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00d2
            if (r14 >= r4) goto L_0x00d2
            if (r11 != 0) goto L_0x00af
            goto L_0x0104
        L_0x00af:
            int r5 = r11.f11939
            if (r14 != r5) goto L_0x0100
            boolean r5 = r11.f11940
            if (r5 != 0) goto L_0x0100
            java.util.ArrayList<o.јı$If> r5 = r0.f11883
            r5.remove(r15)
            o.ґı r5 = r0.f11916
            java.lang.Object r11 = r11.f11941
            r5.m14241((android.view.ViewGroup) r0, (int) r14, (java.lang.Object) r11)
            int r15 = r15 + -1
            int r10 = r10 + -1
            if (r15 < 0) goto L_0x00fe
            java.util.ArrayList<o.јı$If> r5 = r0.f11883
            java.lang.Object r5 = r5.get(r15)
            o.јı$If r5 = (o.C2613.C3647If) r5
            goto L_0x00ff
        L_0x00d2:
            if (r11 == 0) goto L_0x00e8
            int r5 = r11.f11939
            if (r14 != r5) goto L_0x00e8
            float r5 = r11.f11942
            float r7 = r7 + r5
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x00fe
            java.util.ArrayList<o.јı$If> r5 = r0.f11883
            java.lang.Object r5 = r5.get(r15)
            o.јı$If r5 = (o.C2613.C3647If) r5
            goto L_0x00ff
        L_0x00e8:
            int r5 = r15 + 1
            o.јı$If r5 = r0.m13871(r14, r5)
            float r5 = r5.f11942
            float r7 = r7 + r5
            int r10 = r10 + 1
            if (r15 < 0) goto L_0x00fe
            java.util.ArrayList<o.јı$If> r5 = r0.f11883
            java.lang.Object r5 = r5.get(r15)
            o.јı$If r5 = (o.C2613.C3647If) r5
            goto L_0x00ff
        L_0x00fe:
            r5 = 0
        L_0x00ff:
            r11 = r5
        L_0x0100:
            int r14 = r14 + -1
            r5 = 0
            goto L_0x00a4
        L_0x0104:
            float r3 = r8.f11942
            int r4 = r10 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0196
            java.util.ArrayList<o.јı$If> r5 = r0.f11883
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x011d
            java.util.ArrayList<o.јı$If> r5 = r0.f11883
            java.lang.Object r5 = r5.get(r4)
            o.јı$If r5 = (o.C2613.C3647If) r5
            goto L_0x011e
        L_0x011d:
            r5 = 0
        L_0x011e:
            if (r12 > 0) goto L_0x0122
            r7 = 0
            goto L_0x012a
        L_0x0122:
            int r7 = r17.getPaddingRight()
            float r7 = (float) r7
            float r11 = (float) r12
            float r7 = r7 / r11
            float r7 = r7 + r13
        L_0x012a:
            int r11 = r0.f11917
        L_0x012c:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0196
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x0160
            if (r11 <= r1) goto L_0x0160
            if (r5 != 0) goto L_0x0139
            goto L_0x0196
        L_0x0139:
            int r12 = r5.f11939
            if (r11 != r12) goto L_0x0195
            boolean r12 = r5.f11940
            if (r12 != 0) goto L_0x0195
            java.util.ArrayList<o.јı$If> r12 = r0.f11883
            r12.remove(r4)
            o.ґı r12 = r0.f11916
            java.lang.Object r5 = r5.f11941
            r12.m14241((android.view.ViewGroup) r0, (int) r11, (java.lang.Object) r5)
            java.util.ArrayList<o.јı$If> r5 = r0.f11883
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015e
            java.util.ArrayList<o.јı$If> r5 = r0.f11883
            java.lang.Object r5 = r5.get(r4)
            o.јı$If r5 = (o.C2613.C3647If) r5
            goto L_0x0195
        L_0x015e:
            r5 = 0
            goto L_0x0195
        L_0x0160:
            if (r5 == 0) goto L_0x017c
            int r12 = r5.f11939
            if (r11 != r12) goto L_0x017c
            float r5 = r5.f11942
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<o.јı$If> r5 = r0.f11883
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015e
            java.util.ArrayList<o.јı$If> r5 = r0.f11883
            java.lang.Object r5 = r5.get(r4)
            o.јı$If r5 = (o.C2613.C3647If) r5
            goto L_0x0195
        L_0x017c:
            o.јı$If r5 = r0.m13871(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f11942
            float r3 = r3 + r5
            java.util.ArrayList<o.јı$If> r5 = r0.f11883
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015e
            java.util.ArrayList<o.јı$If> r5 = r0.f11883
            java.lang.Object r5 = r5.get(r4)
            o.јı$If r5 = (o.C2613.C3647If) r5
        L_0x0195:
            goto L_0x012c
        L_0x0196:
            r0.m13836((o.C2613.C3647If) r8, (int) r10, (o.C2613.C3647If) r2)
            o.ґı r1 = r0.f11916
            int r2 = r0.f11917
            java.lang.Object r3 = r8.f11941
            r1.m14232(r0, r2, r3)
        L_0x01a2:
            o.ґı r1 = r0.f11916
            r1.m14224((android.view.ViewGroup) r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01ac:
            if (r2 >= r1) goto L_0x01d5
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            o.јı$if r4 = (o.C2613.Cif) r4
            r4.f11951 = r2
            boolean r5 = r4.f11946
            if (r5 != 0) goto L_0x01d2
            float r5 = r4.f11950
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01d2
            o.јı$If r3 = r0.m13878((android.view.View) r3)
            if (r3 == 0) goto L_0x01d2
            float r5 = r3.f11942
            r4.f11950 = r5
            int r3 = r3.f11939
            r4.f11948 = r3
        L_0x01d2:
            int r2 = r2 + 1
            goto L_0x01ac
        L_0x01d5:
            r17.m13855()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0214
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e9
            o.јı$If r3 = r0.m13872((android.view.View) r1)
            goto L_0x01ea
        L_0x01e9:
            r3 = 0
        L_0x01ea:
            if (r3 == 0) goto L_0x01f2
            int r1 = r3.f11939
            int r2 = r0.f11917
            if (r1 == r2) goto L_0x0214
        L_0x01f2:
            r1 = 0
        L_0x01f3:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x0214
            android.view.View r2 = r0.getChildAt(r1)
            o.јı$If r3 = r0.m13878((android.view.View) r2)
            if (r3 == 0) goto L_0x0211
            int r3 = r3.f11939
            int r4 = r0.f11917
            if (r3 != r4) goto L_0x0211
            r3 = 2
            boolean r2 = r2.requestFocus(r3)
            if (r2 == 0) goto L_0x0211
            goto L_0x0214
        L_0x0211:
            int r1 = r1 + 1
            goto L_0x01f3
        L_0x0214:
            return
        L_0x0215:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x0222 }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x0222 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0222 }
            goto L_0x022a
        L_0x0222:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x022a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f11887
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            o.ґı r1 = r0.f11916
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2613.m13869(int):void");
    }

    /* renamed from: І  reason: contains not printable characters */
    private void m13855() {
        if (this.f11893 != 0) {
            ArrayList<View> arrayList = this.f11906;
            if (arrayList == null) {
                this.f11906 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f11906.add(getChildAt(i));
            }
            Collections.sort(this.f11906, f11877);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m13836(C3647If ifR, int i, C3647If ifR2) {
        C3647If ifR3;
        C3647If ifR4;
        int r0 = this.f11916.m14230();
        int r1 = m13838();
        float f = r1 > 0 ? ((float) this.f11911) / ((float) r1) : 0.0f;
        if (ifR2 != null) {
            int i2 = ifR2.f11939;
            if (i2 < ifR.f11939) {
                float f2 = ifR2.f11938 + ifR2.f11942 + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= ifR.f11939 && i4 < this.f11883.size()) {
                    Object obj = this.f11883.get(i4);
                    while (true) {
                        ifR4 = (C3647If) obj;
                        if (i3 > ifR4.f11939 && i4 < this.f11883.size() - 1) {
                            i4++;
                            obj = this.f11883.get(i4);
                        }
                    }
                    while (i3 < ifR4.f11939) {
                        f2 += this.f11916.m14226(i3) + f;
                        i3++;
                    }
                    ifR4.f11938 = f2;
                    f2 += ifR4.f11942 + f;
                    i3++;
                }
            } else if (i2 > ifR.f11939) {
                int size = this.f11883.size() - 1;
                float f3 = ifR2.f11938;
                while (true) {
                    i2--;
                    if (i2 < ifR.f11939 || size < 0) {
                        break;
                    }
                    Object obj2 = this.f11883.get(size);
                    while (true) {
                        ifR3 = (C3647If) obj2;
                        if (i2 < ifR3.f11939 && size > 0) {
                            size--;
                            obj2 = this.f11883.get(size);
                        }
                    }
                    while (i2 > ifR3.f11939) {
                        f3 -= this.f11916.m14226(i2) + f;
                        i2--;
                    }
                    f3 -= ifR3.f11942 + f;
                    ifR3.f11938 = f3;
                }
            }
        }
        int size2 = this.f11883.size();
        float f4 = ifR.f11938;
        int i5 = ifR.f11939 - 1;
        this.f11904 = ifR.f11939 == 0 ? ifR.f11938 : -3.4028235E38f;
        int i6 = r0 - 1;
        this.f11884 = ifR.f11939 == i6 ? (ifR.f11938 + ifR.f11942) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            C3647If ifR5 = this.f11883.get(i7);
            while (i5 > ifR5.f11939) {
                f4 -= this.f11916.m14226(i5) + f;
                i5--;
            }
            f4 -= ifR5.f11942 + f;
            ifR5.f11938 = f4;
            if (ifR5.f11939 == 0) {
                this.f11904 = f4;
            }
            i7--;
            i5--;
        }
        float f5 = ifR.f11938 + ifR.f11942 + f;
        int i8 = ifR.f11939 + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C3647If ifR6 = this.f11883.get(i9);
            while (i8 < ifR6.f11939) {
                f5 += this.f11916.m14226(i8) + f;
                i8++;
            }
            if (ifR6.f11939 == i6) {
                this.f11884 = (ifR6.f11942 + f5) - 1.0f;
            }
            ifR6.f11938 = f5;
            f5 += ifR6.f11942 + f;
            i9++;
            i8++;
        }
        this.f11918 = false;
    }

    /* renamed from: o.јı$aux */
    public static class aux extends C1219 {
        public static final Parcelable.Creator<aux> CREATOR = new Parcelable.ClassLoaderCreator<aux>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new aux(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new aux[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new aux(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        ClassLoader f11943;

        /* renamed from: ǃ  reason: contains not printable characters */
        Parcelable f11944;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f11945;

        public aux(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11945);
            parcel.writeParcelable(this.f11944, i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f11945);
            sb.append("}");
            return sb.toString();
        }

        aux(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f11945 = parcel.readInt();
            this.f11944 = parcel.readParcelable(classLoader);
            this.f11943 = classLoader;
        }
    }

    public Parcelable onSaveInstanceState() {
        aux aux2 = new aux(super.onSaveInstanceState());
        aux2.f11945 = this.f11917;
        C2676 r0 = this.f11916;
        if (r0 != null) {
            aux2.f11944 = r0.m14236();
        }
        return aux2;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof aux)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        aux aux2 = (aux) parcelable;
        super.onRestoreInstanceState(aux2.m7894());
        C2676 r0 = this.f11916;
        if (r0 != null) {
            r0.m14238(aux2.f11944, aux2.f11943);
            m13860(aux2.f11945, false, true);
            return;
        }
        this.f11931 = aux2.f11945;
        this.f11932 = aux2.f11944;
        this.f11903 = aux2.f11943;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        Cif ifVar = (Cif) layoutParams;
        ifVar.f11946 |= m13841(view);
        if (!this.f11905) {
            super.addView(view, i, layoutParams);
        } else if (!ifVar.f11946) {
            ifVar.f11949 = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m13841(View view) {
        return view.getClass().getAnnotation(C2616.class) != null;
    }

    public void removeView(View view) {
        if (this.f11905) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public C3647If m13878(View view) {
        for (int i = 0; i < this.f11883.size(); i++) {
            C3647If ifR = this.f11883.get(i);
            if (this.f11916.m14225(view, ifR.f11941)) {
                return ifR;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public C3647If m13872(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m13878(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public C3647If m13866(int i) {
        for (int i2 = 0; i2 < this.f11883.size(); i2++) {
            C3647If ifR = this.f11883.get(i2);
            if (ifR.f11939 == i) {
                return ifR;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11878 = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = r17
            int r2 = getDefaultSize(r1, r2)
            r3 = r18
            int r3 = getDefaultSize(r1, r3)
            r0.setMeasuredDimension(r2, r3)
            int r2 = r16.getMeasuredWidth()
            int r3 = r2 / 10
            int r4 = r0.f11896
            int r3 = java.lang.Math.min(r3, r4)
            r0.f11925 = r3
            int r3 = r16.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r16.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r16.getMeasuredHeight()
            int r4 = r16.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r16.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r16.getChildCount()
            r5 = r3
            r3 = r2
            r2 = 0
        L_0x003f:
            r6 = 8
            r7 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r4) goto L_0x00c7
            android.view.View r9 = r0.getChildAt(r2)
            int r10 = r9.getVisibility()
            if (r10 == r6) goto L_0x00c2
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            o.јı$if r6 = (o.C2613.Cif) r6
            if (r6 == 0) goto L_0x00c2
            boolean r10 = r6.f11946
            if (r10 == 0) goto L_0x00c2
            int r10 = r6.f11947
            r10 = r10 & 7
            int r11 = r6.f11947
            r11 = r11 & 112(0x70, float:1.57E-43)
            r12 = 48
            if (r11 == r12) goto L_0x006f
            r12 = 80
            if (r11 != r12) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r11 = 0
            goto L_0x0070
        L_0x006f:
            r11 = 1
        L_0x0070:
            r12 = 3
            if (r10 == r12) goto L_0x0078
            r12 = 5
            if (r10 != r12) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x007f
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0084
        L_0x007f:
            if (r7 == 0) goto L_0x0084
            r12 = 1073741824(0x40000000, float:2.0)
            goto L_0x0086
        L_0x0084:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0086:
            int r13 = r6.width
            r14 = -1
            r15 = -2
            if (r13 == r15) goto L_0x0098
            int r10 = r6.width
            if (r10 == r14) goto L_0x0094
            int r10 = r6.width
            r13 = r10
            goto L_0x0095
        L_0x0094:
            r13 = r3
        L_0x0095:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0099
        L_0x0098:
            r13 = r3
        L_0x0099:
            int r1 = r6.height
            if (r1 == r15) goto L_0x00a6
            int r1 = r6.height
            if (r1 == r14) goto L_0x00a4
            int r1 = r6.height
            goto L_0x00a8
        L_0x00a4:
            r1 = r5
            goto L_0x00a8
        L_0x00a6:
            r1 = r5
            r8 = r12
        L_0x00a8:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r9.measure(r6, r1)
            if (r11 == 0) goto L_0x00bb
            int r1 = r9.getMeasuredHeight()
            int r5 = r5 - r1
            goto L_0x00c2
        L_0x00bb:
            if (r7 == 0) goto L_0x00c2
            int r1 = r9.getMeasuredWidth()
            int r3 = r3 - r1
        L_0x00c2:
            int r2 = r2 + 1
            r1 = 0
            goto L_0x003f
        L_0x00c7:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r0.f11885 = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            r0.f11894 = r1
            r0.f11905 = r7
            r16.m13858()
            r1 = 0
            r0.f11905 = r1
            int r2 = r16.getChildCount()
        L_0x00df:
            if (r1 >= r2) goto L_0x0109
            android.view.View r4 = r0.getChildAt(r1)
            int r5 = r4.getVisibility()
            if (r5 == r6) goto L_0x0106
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            o.јı$if r5 = (o.C2613.Cif) r5
            if (r5 == 0) goto L_0x00f7
            boolean r7 = r5.f11946
            if (r7 != 0) goto L_0x0106
        L_0x00f7:
            float r7 = (float) r3
            float r5 = r5.f11950
            float r7 = r7 * r5
            int r5 = (int) r7
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            int r7 = r0.f11894
            r4.measure(r5, r7)
        L_0x0106:
            int r1 = r1 + 1
            goto L_0x00df
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2613.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f11911;
            m13835(i, i3, i5, i5);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m13835(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f11883.isEmpty()) {
            C3647If r3 = m13866(this.f11917);
            int min = (int) ((r3 != null ? Math.min(r3.f11938, this.f11884) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m13840(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f11897.isFinished()) {
            this.f11897.setFinalX(m13865() * m13838());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C3647If r9;
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = paddingBottom;
        int i10 = 0;
        int i11 = paddingTop;
        int i12 = paddingLeft;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                Cif ifVar = (Cif) childAt.getLayoutParams();
                if (ifVar.f11946) {
                    int i14 = ifVar.f11947 & 7;
                    int i15 = ifVar.f11947 & 112;
                    if (i14 == 1) {
                        i5 = Math.max((i7 - childAt.getMeasuredWidth()) / 2, i12);
                    } else if (i14 == 3) {
                        i5 = i12;
                        i12 = childAt.getMeasuredWidth() + i12;
                    } else if (i14 != 5) {
                        i5 = i12;
                    } else {
                        i5 = (i7 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i15 == 16) {
                        i6 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, i11);
                    } else if (i15 == 48) {
                        i6 = i11;
                        i11 = childAt.getMeasuredHeight() + i11;
                    } else if (i15 != 80) {
                        i6 = i11;
                    } else {
                        i6 = (i8 - i9) - childAt.getMeasuredHeight();
                        i9 += childAt.getMeasuredHeight();
                    }
                    int i16 = i5 + scrollX;
                    childAt.layout(i16, i6, childAt.getMeasuredWidth() + i16, i6 + childAt.getMeasuredHeight());
                    i10++;
                }
            }
        }
        int i17 = (i7 - i12) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                Cif ifVar2 = (Cif) childAt2.getLayoutParams();
                if (!ifVar2.f11946 && (r9 = m13878(childAt2)) != null) {
                    float f = (float) i17;
                    int i19 = ((int) (r9.f11938 * f)) + i12;
                    if (ifVar2.f11949) {
                        ifVar2.f11949 = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * ifVar2.f11950), 1073741824), View.MeasureSpec.makeMeasureSpec((i8 - i11) - i9, 1073741824));
                    }
                    childAt2.layout(i19, i11, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + i11);
                }
            }
        }
        this.f11881 = i11;
        this.f11924 = i8 - i9;
        this.f11933 = i10;
        if (this.f11878) {
            z2 = false;
            m13839(this.f11917, false, 0, false);
        } else {
            z2 = false;
        }
        this.f11878 = z2;
    }

    public void computeScroll() {
        this.f11898 = true;
        if (this.f11897.isFinished() || !this.f11897.computeScrollOffset()) {
            m13840(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f11897.getCurrX();
        int currY = this.f11897.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m13854(currX)) {
                this.f11897.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0293.m4176(this);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m13854(int i) {
        if (this.f11883.size() != 0) {
            C3647If r0 = m13843();
            int r3 = m13838();
            int i2 = this.f11911;
            int i3 = r3 + i2;
            float f = (float) r3;
            int i4 = r0.f11939;
            float f2 = ((((float) i) / f) - r0.f11938) / (r0.f11942 + (((float) i2) / f));
            this.f11923 = false;
            m13859(i4, f2, (int) (((float) i3) * f2));
            if (this.f11923) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f11878) {
            return false;
        } else {
            this.f11923 = false;
            m13859(0, 0.0f, 0);
            if (this.f11923) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m13859(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f11933
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006d
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = 0
        L_0x001d:
            if (r3 >= r6) goto L_0x006d
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            o.јı$if r9 = (o.C2613.Cif) r9
            boolean r10 = r9.f11946
            if (r10 != 0) goto L_0x002e
            goto L_0x006a
        L_0x002e:
            int r9 = r9.f11947
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004f
            r10 = 3
            if (r9 == r10) goto L_0x0049
            r10 = 5
            if (r9 == r10) goto L_0x003c
            r9 = r4
            goto L_0x005e
        L_0x003c:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L_0x005b
        L_0x0049:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L_0x005e
        L_0x004f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L_0x005b:
            r11 = r9
            r9 = r4
            r4 = r11
        L_0x005e:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x0069
            r8.offsetLeftAndRight(r4)
        L_0x0069:
            r4 = r9
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x006d:
            r12.m13845(r13, r14, r15)
            o.јı$Ι r13 = r12.f11891
            if (r13 == 0) goto L_0x00a1
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007c:
            if (r1 >= r14) goto L_0x00a1
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            o.јı$if r0 = (o.C2613.Cif) r0
            boolean r0 = r0.f11946
            if (r0 == 0) goto L_0x008d
            goto L_0x009e
        L_0x008d:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.m13838()
            float r3 = (float) r3
            float r0 = r0 / r3
            o.јı$Ι r3 = r12.f11891
            r3.m13891(r15, r0)
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x007c
        L_0x00a1:
            r12.f11923 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2613.m13859(int, float, int):void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m13845(int i, float f, int i2) {
        C3648iF iFVar = this.f11889;
        if (iFVar != null) {
            iFVar.m13885(i, f, i2);
        }
        List<C3648iF> list = this.f11915;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C3648iF iFVar2 = this.f11915.get(i3);
                if (iFVar2 != null) {
                    iFVar2.m13885(i, f, i2);
                }
            }
        }
        C3648iF iFVar3 = this.f11888;
        if (iFVar3 != null) {
            iFVar3.m13885(i, f, i2);
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    private void m13856(int i) {
        C3648iF iFVar = this.f11889;
        if (iFVar != null) {
            iFVar.m13884(i);
        }
        List<C3648iF> list = this.f11915;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3648iF iFVar2 = this.f11915.get(i2);
                if (iFVar2 != null) {
                    iFVar2.m13884(i);
                }
            }
        }
        C3648iF iFVar3 = this.f11888;
        if (iFVar3 != null) {
            iFVar3.m13884(i);
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private void m13857(int i) {
        C3648iF iFVar = this.f11889;
        if (iFVar != null) {
            iFVar.m13886(i);
        }
        List<C3648iF> list = this.f11915;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3648iF iFVar2 = this.f11915.get(i2);
                if (iFVar2 != null) {
                    iFVar2.m13886(i);
                }
            }
        }
        C3648iF iFVar3 = this.f11888;
        if (iFVar3 != null) {
            iFVar3.m13886(i);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m13840(boolean z) {
        boolean z2 = this.f11913 == 2;
        if (z2) {
            m13850(false);
            if (!this.f11897.isFinished()) {
                this.f11897.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f11897.getCurrX();
                int currY = this.f11897.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m13854(currX);
                    }
                }
            }
        }
        this.f11895 = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f11883.size(); i++) {
            C3647If ifR = this.f11883.get(i);
            if (ifR.f11940) {
                ifR.f11940 = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            C0293.m4204((View) this, this.f11914);
        } else {
            this.f11914.run();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m13837(float f, float f2) {
        return (f < ((float) this.f11925) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f11925)) && f2 < 0.0f);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m13853(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f11879 : 0, (Paint) null);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m13842();
            return false;
        }
        if (action != 0) {
            if (this.f11902) {
                return true;
            }
            if (this.f11886) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f11912 = x;
            this.f11920 = x;
            float y = motionEvent.getY();
            this.f11927 = y;
            this.f11919 = y;
            this.f11930 = motionEvent2.getPointerId(0);
            this.f11886 = false;
            this.f11898 = true;
            this.f11897.computeScrollOffset();
            if (this.f11913 != 2 || Math.abs(this.f11897.getFinalX() - this.f11897.getCurrX()) <= this.f11909) {
                m13840(false);
                this.f11902 = false;
            } else {
                this.f11897.abortAnimation();
                this.f11895 = false;
                m13858();
                this.f11902 = true;
                m13847(true);
                m13874(1);
            }
        } else if (action == 2) {
            int i = this.f11930;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f11920;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f11927);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0 && !m13837(this.f11920, f)) {
                    if (m13877(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f11920 = x2;
                        this.f11919 = y2;
                        this.f11886 = true;
                        return false;
                    }
                }
                if (abs > ((float) this.f11922) && abs * 0.5f > abs2) {
                    this.f11902 = true;
                    m13847(true);
                    m13874(1);
                    float f2 = this.f11912;
                    float f3 = (float) this.f11922;
                    this.f11920 = i2 > 0 ? f2 + f3 : f2 - f3;
                    this.f11919 = y2;
                    m13850(true);
                } else if (abs2 > ((float) this.f11922)) {
                    this.f11886 = true;
                }
                if (this.f11902 && m13851(x2)) {
                    C0293.m4176(this);
                }
            }
        } else if (action == 6) {
            m13846(motionEvent);
        }
        if (this.f11899 == null) {
            this.f11899 = VelocityTracker.obtain();
        }
        this.f11899.addMovement(motionEvent2);
        return this.f11902;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C2676 r0;
        if (this.f11908) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (r0 = this.f11916) == null || r0.m14230() == 0) {
            return false;
        }
        if (this.f11899 == null) {
            this.f11899 = VelocityTracker.obtain();
        }
        this.f11899.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f11897.abortAnimation();
            this.f11895 = false;
            m13858();
            float x = motionEvent.getX();
            this.f11912 = x;
            this.f11920 = x;
            float y = motionEvent.getY();
            this.f11927 = y;
            this.f11919 = y;
            this.f11930 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f11902) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f11930);
                    if (findPointerIndex == -1) {
                        z = m13842();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f11920);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f11919);
                        if (abs > ((float) this.f11922) && abs > abs2) {
                            this.f11902 = true;
                            m13847(true);
                            float f = this.f11912;
                            this.f11920 = x2 - f > 0.0f ? f + ((float) this.f11922) : f - ((float) this.f11922);
                            this.f11919 = y2;
                            m13874(1);
                            m13850(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f11902) {
                    z = false | m13851(motionEvent.getX(motionEvent.findPointerIndex(this.f11930)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f11920 = motionEvent.getX(actionIndex);
                    this.f11930 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m13846(motionEvent);
                    this.f11920 = motionEvent.getX(motionEvent.findPointerIndex(this.f11930));
                }
            } else if (this.f11902) {
                m13839(this.f11917, true, 0, false);
                z = m13842();
            }
        } else if (this.f11902) {
            VelocityTracker velocityTracker = this.f11899;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f11929);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f11930);
            this.f11895 = true;
            int r2 = m13838();
            int scrollX = getScrollX();
            C3647If r4 = m13843();
            float f2 = (float) r2;
            m13876(m13844(r4.f11939, ((((float) scrollX) / f2) - r4.f11938) / (r4.f11942 + (((float) this.f11911) / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f11930)) - this.f11912)), true, true, xVelocity);
            z = m13842();
        }
        if (z) {
            C0293.m4176(this);
        }
        return true;
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean m13842() {
        this.f11930 = -1;
        m13848();
        this.f11901.onRelease();
        this.f11910.onRelease();
        return this.f11901.isFinished() || this.f11910.isFinished();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m13847(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m13851(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f11920 - f;
        this.f11920 = f;
        float scrollX = ((float) getScrollX()) + f2;
        float r0 = (float) m13838();
        float f3 = this.f11904 * r0;
        float f4 = this.f11884 * r0;
        boolean z3 = false;
        C3647If ifR = this.f11883.get(0);
        ArrayList<C3647If> arrayList = this.f11883;
        C3647If ifR2 = arrayList.get(arrayList.size() - 1);
        if (ifR.f11939 != 0) {
            f3 = ifR.f11938 * r0;
            z = false;
        } else {
            z = true;
        }
        if (ifR2.f11939 != this.f11916.m14230() - 1) {
            f4 = ifR2.f11938 * r0;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f11901.onPull(Math.abs(f3 - scrollX) / r0);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f11910.onPull(Math.abs(scrollX - f4) / r0);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f11920 += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m13854(i);
        return z3;
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    private C3647If m13843() {
        int i;
        int r0 = m13838();
        float scrollX = r0 > 0 ? ((float) getScrollX()) / ((float) r0) : 0.0f;
        float f = r0 > 0 ? ((float) this.f11911) / ((float) r0) : 0.0f;
        C3647If ifR = null;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i2 < this.f11883.size()) {
            C3647If ifR2 = this.f11883.get(i2);
            if (!z && ifR2.f11939 != (i = i3 + 1)) {
                ifR2 = this.f11928;
                ifR2.f11938 = f2 + f3 + f;
                ifR2.f11939 = i;
                ifR2.f11942 = this.f11916.m14226(ifR2.f11939);
                i2--;
            }
            f2 = ifR2.f11938;
            float f4 = ifR2.f11942 + f2 + f;
            if (!z && scrollX < f2) {
                return ifR;
            }
            if (scrollX < f4 || i2 == this.f11883.size() - 1) {
                return ifR2;
            }
            i3 = ifR2.f11939;
            f3 = ifR2.f11942;
            i2++;
            ifR = ifR2;
            z = false;
        }
        return ifR;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int m13844(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f11907 || Math.abs(i2) <= this.f11926) {
            i += (int) (f + (i >= this.f11917 ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f11883.size() <= 0) {
            return i;
        }
        ArrayList<C3647If> arrayList = this.f11883;
        return Math.max(this.f11883.get(0).f11939, Math.min(i, arrayList.get(arrayList.size() - 1).f11939));
    }

    public void draw(Canvas canvas) {
        C2676 r0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (r0 = this.f11916) != null && r0.m14230() > 1)) {
            if (!this.f11901.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f11904 * ((float) width));
                this.f11901.setSize(height, width);
                z = false | this.f11901.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f11910.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f11884 + 1.0f)) * ((float) width2));
                this.f11910.setSize(height2, width2);
                z |= this.f11910.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f11901.finish();
            this.f11910.finish();
        }
        if (z) {
            C0293.m4176(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f11911 > 0 && this.f11880 != null && this.f11883.size() > 0 && this.f11916 != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.f11911) / f4;
            int i = 0;
            C3647If ifR = this.f11883.get(0);
            float f6 = ifR.f11938;
            int size = this.f11883.size();
            int i2 = ifR.f11939;
            int i3 = this.f11883.get(size - 1).f11939;
            while (i2 < i3) {
                while (i2 > ifR.f11939 && i < size) {
                    i++;
                    ifR = this.f11883.get(i);
                }
                if (i2 == ifR.f11939) {
                    f2 = (ifR.f11938 + ifR.f11942) * f4;
                    f = ifR.f11938 + ifR.f11942 + f5;
                } else {
                    float r11 = this.f11916.m14226(i2);
                    f = f6 + r11 + f5;
                    f2 = (f6 + r11) * f4;
                }
                if (((float) this.f11911) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.f11880.setBounds(Math.round(f2), this.f11881, Math.round(((float) this.f11911) + f2), this.f11924);
                    this.f11880.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i2++;
                    f6 = f;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m13846(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f11930) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f11920 = motionEvent.getX(i);
            this.f11930 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f11899;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    private void m13848() {
        this.f11902 = false;
        this.f11886 = false;
        VelocityTracker velocityTracker = this.f11899;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11899 = null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m13850(boolean z) {
        if (this.f11882 != z) {
            this.f11882 = z;
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f11916 == null) {
            return false;
        }
        int r0 = m13838();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) r0) * this.f11904))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) r0) * this.f11884))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m13877(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (m13877(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m13863(keyEvent);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m13863(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return m13862(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return m13862(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return m13882();
                } else {
                    return m13862(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return m13881();
            } else {
                return m13862(17);
            }
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m13862(int i) {
        boolean requestFocus;
        boolean z;
        View findFocus = findFocus();
        boolean z2 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus != null && findNextFocus != view) {
            if (i == 17) {
                int i2 = m13852(this.f11921, findNextFocus).left;
                int i3 = m13852(this.f11921, view).left;
                if (view == null || i2 < i3) {
                    requestFocus = findNextFocus.requestFocus();
                } else {
                    requestFocus = m13881();
                }
            } else if (i == 66) {
                int i4 = m13852(this.f11921, findNextFocus).left;
                int i5 = m13852(this.f11921, view).left;
                if (view == null || i4 > i5) {
                    requestFocus = findNextFocus.requestFocus();
                } else {
                    requestFocus = m13882();
                }
            }
            z2 = requestFocus;
        } else if (i == 17 || i == 1) {
            z2 = m13881();
        } else if (i == 66 || i == 2) {
            z2 = m13882();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private Rect m13852(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public boolean m13881() {
        int i = this.f11917;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public boolean m13882() {
        C2676 r0 = this.f11916;
        if (r0 == null || this.f11917 >= r0.m14230() - 1) {
            return false;
        }
        setCurrentItem(this.f11917 + 1, true);
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C3647If r4;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (r4 = m13878(childAt)) != null && r4.f11939 == this.f11917) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C3647If r2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (r2 = m13878(childAt)) != null && r2.f11939 == this.f11917) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C3647If r6;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (r6 = m13878(childAt)) != null && r6.f11939 == this.f11917 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C3647If r4;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (r4 = m13878(childAt)) != null && r4.f11939 == this.f11917 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new Cif();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof Cif) && super.checkLayoutParams(layoutParams);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new Cif(getContext(), attributeSet);
    }

    /* renamed from: o.јı$ǃ  reason: contains not printable characters */
    class C2615 extends C2449 {
        C2615() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m13890(View view, AccessibilityEvent accessibilityEvent) {
            super.m12584(view, accessibilityEvent);
            accessibilityEvent.setClassName(C2613.class.getName());
            boolean z = true;
            if (C2613.this.f11916 == null || C2613.this.f11916.m14230() <= 1) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (accessibilityEvent.getEventType() == 4096 && C2613.this.f11916 != null) {
                accessibilityEvent.setItemCount(C2613.this.f11916.m14230());
                accessibilityEvent.setFromIndex(C2613.this.f11917);
                accessibilityEvent.setToIndex(C2613.this.f11917);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m13888(View view, C0520 r3) {
            super.m12579(view, r3);
            r3.m5022((CharSequence) C2613.class.getName());
            r3.m5028(C2613.this.f11916 != null && C2613.this.f11916.m14230() > 1);
            if (C2613.this.canScrollHorizontally(1)) {
                r3.m5030((int) C0872.f5653);
            }
            if (C2613.this.canScrollHorizontally(-1)) {
                r3.m5030(8192);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m13889(View view, int i, Bundle bundle) {
            if (super.m12580(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !C2613.this.canScrollHorizontally(-1)) {
                    return false;
                }
                C2613 r2 = C2613.this;
                r2.setCurrentItem(r2.f11917 - 1);
                return true;
            } else if (!C2613.this.canScrollHorizontally(1)) {
                return false;
            } else {
                C2613 r22 = C2613.this;
                r22.setCurrentItem(r22.f11917 + 1);
                return true;
            }
        }
    }

    /* renamed from: o.јı$IF */
    class IF extends DataSetObserver {
        IF() {
        }

        public final void onChanged() {
            C2613.this.m13879();
        }

        public final void onInvalidated() {
            C2613.this.m13879();
        }
    }

    /* renamed from: o.јı$if  reason: invalid class name */
    public static class Cif extends ViewGroup.LayoutParams {

        /* renamed from: ı  reason: contains not printable characters */
        public boolean f11946;

        /* renamed from: ǃ  reason: contains not printable characters */
        public int f11947;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f11948;

        /* renamed from: Ι  reason: contains not printable characters */
        boolean f11949;

        /* renamed from: ι  reason: contains not printable characters */
        float f11950 = 0.0f;

        /* renamed from: Ӏ  reason: contains not printable characters */
        int f11951;

        public Cif() {
            super(-1, -1);
        }

        public Cif(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2613.f11874);
            this.f11947 = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o.јı$ι  reason: contains not printable characters */
    static class C2618 implements Comparator<View> {
        C2618() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            Cif ifVar = (Cif) ((View) obj).getLayoutParams();
            Cif ifVar2 = (Cif) ((View) obj2).getLayoutParams();
            if (ifVar.f11946 != ifVar2.f11946) {
                return ifVar.f11946 ? 1 : -1;
            }
            return ifVar.f11948 - ifVar2.f11948;
        }
    }
}
