package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o.C0520;
import o.C0858;
import o.C2317;
import o.C2613;
import o.C2745;

@C2613.C2616
/* renamed from: o.ƾі  reason: contains not printable characters */
public class C0828 extends HorizontalScrollView {

    /* renamed from: Ɨ  reason: contains not printable characters */
    private static final C2317.If<aux> f5378 = new C2317.Cif(16);

    /* renamed from: ı  reason: contains not printable characters */
    aux f5379;

    /* renamed from: ŀ  reason: contains not printable characters */
    int f5380;

    /* renamed from: ł  reason: contains not printable characters */
    int f5381;

    /* renamed from: ſ  reason: contains not printable characters */
    C2613 f5382;

    /* renamed from: Ɩ  reason: contains not printable characters */
    int f5383;

    /* renamed from: ƚ  reason: contains not printable characters */
    boolean f5384;

    /* renamed from: ǀ  reason: contains not printable characters */
    private final int f5385;

    /* renamed from: ǃ  reason: contains not printable characters */
    final RectF f5386;

    /* renamed from: ȷ  reason: contains not printable characters */
    float f5387;

    /* renamed from: ɍ  reason: contains not printable characters */
    boolean f5388;

    /* renamed from: ɔ  reason: contains not printable characters */
    private Cif f5389;

    /* renamed from: ɟ  reason: contains not printable characters */
    private int f5390;

    /* renamed from: ɨ  reason: contains not printable characters */
    float f5391;

    /* renamed from: ɩ  reason: contains not printable characters */
    final ArrayList<aux> f5392;

    /* renamed from: ɪ  reason: contains not printable characters */
    Drawable f5393;

    /* renamed from: ɭ  reason: contains not printable characters */
    private C2676 f5394;

    /* renamed from: ɹ  reason: contains not printable characters */
    int f5395;

    /* renamed from: ɺ  reason: contains not printable characters */
    private final int f5396;

    /* renamed from: ɻ  reason: contains not printable characters */
    private final C2317.If<IF> f5397;

    /* renamed from: ɼ  reason: contains not printable characters */
    private final int f5398;

    /* renamed from: ɾ  reason: contains not printable characters */
    PorterDuff.Mode f5399;

    /* renamed from: ɿ  reason: contains not printable characters */
    int f5400;

    /* renamed from: ʅ  reason: contains not printable characters */
    boolean f5401;

    /* renamed from: ʟ  reason: contains not printable characters */
    int f5402;

    /* renamed from: ͻ  reason: contains not printable characters */
    private C3628If f5403;

    /* renamed from: Ι  reason: contains not printable characters */
    int f5404;

    /* renamed from: ι  reason: contains not printable characters */
    int f5405;

    /* renamed from: ϲ  reason: contains not printable characters */
    private ValueAnimator f5406;

    /* renamed from: ϳ  reason: contains not printable characters */
    private final ArrayList<C3628If> f5407;

    /* renamed from: І  reason: contains not printable characters */
    ColorStateList f5408;

    /* renamed from: Ј  reason: contains not printable characters */
    private int f5409;

    /* renamed from: г  reason: contains not printable characters */
    final int f5410;

    /* renamed from: с  reason: contains not printable characters */
    private C3628If f5411;

    /* renamed from: т  reason: contains not printable characters */
    private DataSetObserver f5412;

    /* renamed from: х  reason: contains not printable characters */
    private C0831 f5413;

    /* renamed from: і  reason: contains not printable characters */
    int f5414;

    /* renamed from: ј  reason: contains not printable characters */
    private boolean f5415;

    /* renamed from: ґ  reason: contains not printable characters */
    private C3629iF f5416;

    /* renamed from: Ӏ  reason: contains not printable characters */
    ColorStateList f5417;

    /* renamed from: ӏ  reason: contains not printable characters */
    ColorStateList f5418;

    @Deprecated
    /* renamed from: o.ƾі$If  reason: case insensitive filesystem */
    public interface C3628If<T extends aux> {
        /* renamed from: ι  reason: contains not printable characters */
        void m6287(T t);
    }

    /* renamed from: o.ƾі$ı  reason: contains not printable characters */
    public interface C0829 extends C3628If<aux> {
    }

    public C0828(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0828(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f154862130969305);
    }

    /* JADX INFO: finally extract failed */
    public C0828(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5392 = new ArrayList<>();
        this.f5386 = new RectF();
        this.f5400 = Integer.MAX_VALUE;
        this.f5407 = new ArrayList<>();
        this.f5397 = new C2317.C2318(12);
        setHorizontalScrollBarEnabled(false);
        this.f5389 = new Cif(context);
        super.addView(this.f5389, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray r14 = C3160.m15974(context, attributeSet, C0858.Aux.f5611, i, R.style.f175002131952221, 22);
        if (getBackground() instanceof ColorDrawable) {
            C0671 r5 = new C0671();
            ColorStateList valueOf = ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor());
            if (r5.f4785.f4804 != valueOf) {
                r5.f4785.f4804 = valueOf;
                r5.onStateChange(r5.getState());
            }
            r5.m5522(context);
            r5.m5526(C0293.m4188(this));
            C0293.m4199((View) this, (Drawable) r5);
        }
        Cif ifVar = this.f5389;
        int dimensionPixelSize = r14.getDimensionPixelSize(10, -1);
        if (ifVar.f5449 != dimensionPixelSize) {
            ifVar.f5449 = dimensionPixelSize;
            C0293.m4176(ifVar);
        }
        Cif ifVar2 = this.f5389;
        int color = r14.getColor(7, 0);
        if (ifVar2.f5441.getColor() != color) {
            ifVar2.f5441.setColor(color);
            C0293.m4176(ifVar2);
        }
        setSelectedTabIndicator(C0344.m4474(context, r14, 5));
        setSelectedTabIndicatorGravity(r14.getInt(9, 0));
        setTabIndicatorFullWidth(r14.getBoolean(8, true));
        int dimensionPixelSize2 = r14.getDimensionPixelSize(15, 0);
        this.f5395 = dimensionPixelSize2;
        this.f5414 = dimensionPixelSize2;
        this.f5404 = dimensionPixelSize2;
        this.f5405 = dimensionPixelSize2;
        this.f5405 = r14.getDimensionPixelSize(18, this.f5405);
        this.f5404 = r14.getDimensionPixelSize(19, this.f5404);
        this.f5414 = r14.getDimensionPixelSize(17, this.f5414);
        this.f5395 = r14.getDimensionPixelSize(16, this.f5395);
        this.f5383 = r14.getResourceId(22, R.style.f174112131951995);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.f5383, C2745.aux.f12838);
        try {
            this.f5387 = (float) obtainStyledAttributes.getDimensionPixelSize(C2745.aux.f12857, 0);
            this.f5417 = C0344.m4473(context, obtainStyledAttributes, C2745.aux.f12854);
            obtainStyledAttributes.recycle();
            if (r14.hasValue(23)) {
                this.f5417 = C0344.m4473(context, r14, 23);
            }
            if (r14.hasValue(21)) {
                this.f5417 = m6265(this.f5417.getDefaultColor(), r14.getColor(21, 0));
            }
            this.f5408 = C0344.m4473(context, r14, 3);
            this.f5399 = C3198.m16133(r14.getInt(4, -1), (PorterDuff.Mode) null);
            this.f5418 = C0344.m4473(context, r14, 20);
            this.f5409 = r14.getInt(6, 300);
            this.f5398 = r14.getDimensionPixelSize(13, -1);
            this.f5396 = r14.getDimensionPixelSize(12, -1);
            this.f5410 = r14.getResourceId(0, 0);
            this.f5390 = r14.getDimensionPixelSize(1, 0);
            this.f5402 = r14.getInt(14, 1);
            this.f5381 = r14.getInt(2, 0);
            this.f5384 = r14.getBoolean(11, false);
            this.f5388 = r14.getBoolean(24, false);
            r14.recycle();
            Resources resources = getResources();
            this.f5391 = (float) resources.getDimensionPixelSize(R.dimen.f158362131165325);
            this.f5385 = resources.getDimensionPixelSize(R.dimen.f158342131165323);
            m6263();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        Cif ifVar = this.f5389;
        if (ifVar.f5441.getColor() != i) {
            ifVar.f5441.setColor(i);
            C0293.m4176(ifVar);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        Cif ifVar = this.f5389;
        if (ifVar.f5449 != i) {
            ifVar.f5449 = i;
            C0293.m4176(ifVar);
        }
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f5389.getChildCount()) {
            if (z2) {
                Cif ifVar = this.f5389;
                if (ifVar.f5442 != null && ifVar.f5442.isRunning()) {
                    ifVar.f5442.cancel();
                }
                ifVar.f5444 = i;
                ifVar.f5448 = f;
                ifVar.m6294();
            }
            ValueAnimator valueAnimator = this.f5406;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f5406.cancel();
            }
            scrollTo(m6262(i, f), 0);
            if (z) {
                m6271(round);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m6264(aux aux2, int i, boolean z) {
        if (aux2.f5437 == this) {
            m6269(aux2, i);
            IF ifR = aux2.f5434;
            ifR.setSelected(false);
            ifR.setActivated(false);
            Cif ifVar = this.f5389;
            int i2 = aux2.f5435;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            m6268(layoutParams);
            ifVar.addView(ifR, i2, layoutParams);
            if (!z) {
                return;
            }
            if (aux2.f5437 != null) {
                aux2.f5437.m6277(aux2, true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Deprecated
    public void setOnTabSelectedListener(C0829 r1) {
        setOnTabSelectedListener((C3628If) r1);
    }

    @Deprecated
    public void setOnTabSelectedListener(C3628If ifR) {
        C3628If ifR2 = this.f5403;
        if (ifR2 != null) {
            this.f5407.remove(ifR2);
        }
        this.f5403 = ifR;
        if (ifR != null && !this.f5407.contains(ifR)) {
            this.f5407.add(ifR);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m6273() {
        int childCount = this.f5389.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            IF ifR = (IF) this.f5389.getChildAt(childCount);
            this.f5389.removeViewAt(childCount);
            if (ifR != null) {
                if (ifR.f5420 != null) {
                    ifR.f5420 = null;
                    ifR.m6283();
                }
                ifR.setSelected(false);
                this.f5397.m12091(ifR);
            }
            requestLayout();
        }
        Iterator<aux> it = this.f5392.iterator();
        while (it.hasNext()) {
            aux next = it.next();
            it.remove();
            next.f5437 = null;
            next.f5434 = null;
            next.f5432 = null;
            next.f5430 = null;
            next.f5436 = null;
            next.f5435 = -1;
            next.f5433 = null;
            f5378.m12091(next);
        }
        this.f5379 = null;
    }

    public void setTabMode(int i) {
        if (i != this.f5402) {
            this.f5402 = i;
            m6263();
        }
    }

    public void setTabGravity(int i) {
        if (this.f5381 != i) {
            this.f5381 = i;
            m6263();
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f5380 != i) {
            this.f5380 = i;
            C0293.m4176(this.f5389);
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f5401 = z;
        C0293.m4176(this.f5389);
    }

    public void setInlineLabel(boolean z) {
        if (this.f5384 != z) {
            this.f5384 = z;
            for (int i = 0; i < this.f5389.getChildCount(); i++) {
                View childAt = this.f5389.getChildAt(i);
                if (childAt instanceof IF) {
                    IF ifR = (IF) childAt;
                    ifR.setOrientation(C0828.this.f5384 ^ true ? 1 : 0);
                    if (ifR.f5426 == null && ifR.f5425 == null) {
                        ifR.m6284(ifR.f5422, ifR.f5423);
                    } else {
                        ifR.m6284(ifR.f5426, ifR.f5425);
                    }
                }
            }
            m6263();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f5388 != z) {
            this.f5388 = z;
            for (int i = 0; i < this.f5389.getChildCount(); i++) {
                View childAt = this.f5389.getChildAt(i);
                if (childAt instanceof IF) {
                    ((IF) childAt).m6285(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f5417 != colorStateList) {
            this.f5417 = colorStateList;
            m6267();
        }
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m6265(i, i2));
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f5408 != colorStateList) {
            this.f5408 = colorStateList;
            m6267();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C3257Con.m1342(getContext(), i));
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f5418 != colorStateList) {
            this.f5418 = colorStateList;
            for (int i = 0; i < this.f5389.getChildCount(); i++) {
                View childAt = this.f5389.getChildAt(i);
                if (childAt instanceof IF) {
                    ((IF) childAt).m6285(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C3257Con.m1342(getContext(), i));
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f5393 != drawable) {
            this.f5393 = drawable;
            C0293.m4176(this.f5389);
        }
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C3257Con.m1345(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setupWithViewPager(C2613 r2) {
        setupWithViewPager(r2, true);
    }

    public void setupWithViewPager(C2613 r2, boolean z) {
        m6261(r2, z, false);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m6261(C2613 r4, boolean z, boolean z2) {
        C2613 r0 = this.f5382;
        if (r0 != null) {
            C3629iF iFVar = this.f5416;
            if (iFVar != null) {
                r0.m13880((C2613.C3648iF) iFVar);
            }
            C0831 r02 = this.f5413;
            if (r02 != null) {
                this.f5382.m13870((C2613.C2614) r02);
            }
        }
        C3628If ifR = this.f5411;
        if (ifR != null) {
            this.f5407.remove(ifR);
            this.f5411 = null;
        }
        if (r4 != null) {
            this.f5382 = r4;
            if (this.f5416 == null) {
                this.f5416 = new C3629iF(this);
            }
            C3629iF iFVar2 = this.f5416;
            iFVar2.f5440 = 0;
            iFVar2.f5439 = 0;
            r4.m13867((C2613.C3648iF) iFVar2);
            this.f5411 = new C0832(r4);
            C3628If ifR2 = this.f5411;
            if (!this.f5407.contains(ifR2)) {
                this.f5407.add(ifR2);
            }
            C2676 r03 = r4.m13873();
            if (r03 != null) {
                m6279(r03, z);
            }
            if (this.f5413 == null) {
                this.f5413 = new C0831();
            }
            C0831 r04 = this.f5413;
            r04.f5459 = z;
            r4.m13861((C2613.C2614) r04);
            setScrollPosition(r4.m13865(), 0.0f, true);
        } else {
            this.f5382 = null;
            m6279((C2676) null, false);
        }
        this.f5415 = z2;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C2676 r2) {
        m6279(r2, false);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2745.m14535((View) this);
        if (this.f5382 == null) {
            ViewParent parent = getParent();
            if (parent instanceof C2613) {
                m6261((C2613) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5415) {
            setupWithViewPager((C2613) null);
            this.f5415 = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6279(C2676 r3, boolean z) {
        DataSetObserver dataSetObserver;
        C2676 r0 = this.f5394;
        if (!(r0 == null || (dataSetObserver = this.f5412) == null)) {
            r0.m14234(dataSetObserver);
        }
        this.f5394 = r3;
        if (z && r3 != null) {
            if (this.f5412 == null) {
                this.f5412 = new C0830();
            }
            r3.m14228(this.f5412);
        }
        m6276();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m6276() {
        int i;
        m6273();
        C2676 r0 = this.f5394;
        if (r0 != null) {
            int r02 = r0.m14230();
            for (int i2 = 0; i2 < r02; i2++) {
                m6264(m6270().m6288(this.f5394.m14231(i2)), this.f5392.size(), false);
            }
            C2613 r1 = this.f5382;
            if (r1 != null && r02 > 0) {
                int r03 = r1.m13865();
                aux aux2 = this.f5379;
                if (aux2 != null) {
                    i = aux2.f5435;
                } else {
                    i = -1;
                }
                if (r03 != i && r03 < this.f5392.size()) {
                    m6277((r03 < 0 || r03 >= this.f5392.size()) ? null : this.f5392.get(r03), true);
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m6267() {
        int size = this.f5392.size();
        for (int i = 0; i < size; i++) {
            aux aux2 = this.f5392.get(i);
            if (aux2.f5434 != null) {
                aux2.f5434.m6283();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private IF m6266(aux aux2) {
        C2317.If<IF> ifR = this.f5397;
        IF r0 = ifR != null ? ifR.m12090() : null;
        if (r0 == null) {
            r0 = new IF(getContext());
        }
        if (aux2 != r0.f5420) {
            r0.f5420 = aux2;
            r0.m6283();
        }
        r0.setFocusable(true);
        r0.setMinimumWidth(m6275());
        if (TextUtils.isEmpty(aux2.f5436)) {
            r0.setContentDescription(aux2.f5430);
        } else {
            r0.setContentDescription(aux2.f5436);
        }
        return r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m6268(LinearLayout.LayoutParams layoutParams) {
        if (this.f5402 == 1 && this.f5381 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C2745.m14513((View) this, f);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0520.m4998(accessibilityNodeInfo).m5035((Object) C0520.C0521.m5076(1, this.f5392.size(), false, 1));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f5389.getChildCount(); i++) {
            View childAt = this.f5389.getChildAt(i);
            if (childAt instanceof IF) {
                IF ifR = (IF) childAt;
                if (ifR.f5424 != null) {
                    ifR.f5424.setBounds(ifR.getLeft(), ifR.getTop(), ifR.getRight(), ifR.getBottom());
                    ifR.f5424.draw(canvas);
                }
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r0 != 2) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bb, code lost:
        if (r8.getMeasuredWidth() != getMeasuredWidth()) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bd, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c7, code lost:
        if (r8.getMeasuredWidth() < getMeasuredWidth()) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            android.content.Context r0 = r7.getContext()
            java.util.ArrayList<o.ƾі$aux> r1 = r7.f5392
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        L_0x000c:
            r4 = 1
            if (r3 >= r1) goto L_0x002a
            java.util.ArrayList<o.ƾі$aux> r5 = r7.f5392
            java.lang.Object r5 = r5.get(r3)
            o.ƾі$aux r5 = (o.C0828.aux) r5
            if (r5 == 0) goto L_0x0027
            android.graphics.drawable.Drawable r6 = r5.f5432
            if (r6 == 0) goto L_0x0027
            java.lang.CharSequence r5 = r5.f5430
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0027
            r1 = 1
            goto L_0x002b
        L_0x0027:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x002a:
            r1 = 0
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            boolean r1 = r7.f5384
            if (r1 != 0) goto L_0x0034
            r1 = 72
            goto L_0x0036
        L_0x0034:
            r1 = 48
        L_0x0036:
            android.content.res.Resources r0 = r0.getResources()
            float r1 = (float) r1
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r4, r1, r0)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L_0x0063
            if (r1 == 0) goto L_0x0054
            goto L_0x0076
        L_0x0054:
            int r9 = r7.getPaddingTop()
            int r0 = r0 + r9
            int r9 = r7.getPaddingBottom()
            int r0 = r0 + r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            goto L_0x0076
        L_0x0063:
            int r1 = r7.getChildCount()
            if (r1 != r4) goto L_0x0076
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            if (r1 < r0) goto L_0x0076
            android.view.View r1 = r7.getChildAt(r2)
            r1.setMinimumHeight(r0)
        L_0x0076:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            if (r1 == 0) goto L_0x009c
            int r1 = r7.f5396
            if (r1 <= 0) goto L_0x0085
            goto L_0x009a
        L_0x0085:
            float r0 = (float) r0
            android.content.Context r1 = r7.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 1113587712(0x42600000, float:56.0)
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r4, r3, r1)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x009a:
            r7.f5400 = r1
        L_0x009c:
            super.onMeasure(r8, r9)
            int r8 = r7.getChildCount()
            if (r8 != r4) goto L_0x00ea
            android.view.View r8 = r7.getChildAt(r2)
            int r0 = r7.f5402
            if (r0 == 0) goto L_0x00bf
            if (r0 == r4) goto L_0x00b3
            r1 = 2
            if (r0 == r1) goto L_0x00bf
            goto L_0x00ca
        L_0x00b3:
            int r0 = r8.getMeasuredWidth()
            int r1 = r7.getMeasuredWidth()
            if (r0 == r1) goto L_0x00ca
        L_0x00bd:
            r2 = 1
            goto L_0x00ca
        L_0x00bf:
            int r0 = r8.getMeasuredWidth()
            int r1 = r7.getMeasuredWidth()
            if (r0 >= r1) goto L_0x00ca
            goto L_0x00bd
        L_0x00ca:
            if (r2 == 0) goto L_0x00ea
            int r0 = r7.getPaddingTop()
            int r1 = r7.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r1 = r1.height
            int r9 = getChildMeasureSpec(r9, r0, r1)
            int r0 = r7.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r8.measure(r0, r9)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0828.onMeasure(int, int):void");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m6274(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null && C0293.m4186(this)) {
                Cif ifVar = this.f5389;
                int childCount = ifVar.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    } else if (ifVar.getChildAt(i2).getWidth() <= 0) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int r1 = m6262(i, 0.0f);
                    if (scrollX != r1) {
                        if (this.f5406 == null) {
                            this.f5406 = new ValueAnimator();
                            this.f5406.setInterpolator(C1311.f7289);
                            this.f5406.setDuration((long) this.f5409);
                            this.f5406.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    C0828.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                                }
                            });
                        }
                        this.f5406.setIntValues(new int[]{scrollX, r1});
                        this.f5406.start();
                    }
                    Cif ifVar2 = this.f5389;
                    int i3 = this.f5409;
                    if (ifVar2.f5442 != null && ifVar2.f5442.isRunning()) {
                        ifVar2.f5442.cancel();
                    }
                    ifVar2.m6295(true, i, i3);
                    return;
                }
            }
            setScrollPosition(i, 0.0f, true);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m6271(int i) {
        int childCount = this.f5389.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f5389.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6278(aux aux2) {
        m6277(aux2, true);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6277(aux aux2, boolean z) {
        int i;
        aux aux3 = this.f5379;
        if (aux3 != aux2) {
            if (aux2 != null) {
                i = aux2.f5435;
            } else {
                i = -1;
            }
            if (z) {
                if ((aux3 == null || aux3.f5435 == -1) && i != -1) {
                    setScrollPosition(i, 0.0f, true);
                } else {
                    m6274(i);
                }
                if (i != -1) {
                    m6271(i);
                }
            }
            this.f5379 = aux2;
            if (aux3 != null) {
                for (int size = this.f5407.size() - 1; size >= 0; size--) {
                    this.f5407.get(size);
                }
            }
            if (aux2 != null) {
                m6272(aux2);
            }
        } else if (aux3 != null) {
            for (int size2 = this.f5407.size() - 1; size2 >= 0; size2--) {
                this.f5407.get(size2);
            }
            m6274(aux2.f5435);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m6272(aux aux2) {
        for (int size = this.f5407.size() - 1; size >= 0; size--) {
            this.f5407.get(size).m6287(aux2);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private int m6262(int i, float f) {
        int i2 = this.f5402;
        int i3 = 0;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f5389.getChildAt(i);
        int i4 = i + 1;
        View childAt2 = i4 < this.f5389.getChildCount() ? this.f5389.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        return C0293.m4156(this) == 0 ? left + i5 : left - i5;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m6263() {
        int i;
        int i2 = this.f5402;
        if (i2 == 0 || i2 == 2) {
            i = Math.max(0, this.f5390 - this.f5405);
        } else {
            i = 0;
        }
        C0293.m4178(this.f5389, i, 0, 0, 0);
        int i3 = this.f5402;
        if (i3 == 0) {
            m6259(this.f5381);
        } else if (i3 == 1 || i3 == 2) {
            this.f5389.setGravity(1);
        }
        m6280(true);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m6259(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f5389.setGravity(1);
                return;
            } else if (i != 2) {
                return;
            }
        }
        this.f5389.setGravity(8388611);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6280(boolean z) {
        for (int i = 0; i < this.f5389.getChildCount(); i++) {
            View childAt = this.f5389.getChildAt(i);
            childAt.setMinimumWidth(m6275());
            m6268((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* renamed from: o.ƾі$aux */
    public static class aux {

        /* renamed from: ı  reason: contains not printable characters */
        CharSequence f5430;

        /* renamed from: Ɩ  reason: contains not printable characters */
        int f5431 = 1;

        /* renamed from: ǃ  reason: contains not printable characters */
        Drawable f5432;

        /* renamed from: ɩ  reason: contains not printable characters */
        View f5433;

        /* renamed from: ɹ  reason: contains not printable characters */
        public IF f5434;

        /* renamed from: Ι  reason: contains not printable characters */
        int f5435 = -1;

        /* renamed from: ι  reason: contains not printable characters */
        CharSequence f5436;

        /* renamed from: І  reason: contains not printable characters */
        public C0828 f5437;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final aux m6288(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f5436) && !TextUtils.isEmpty(charSequence)) {
                this.f5434.setContentDescription(charSequence);
            }
            this.f5430 = charSequence;
            IF ifR = this.f5434;
            if (ifR != null) {
                ifR.m6283();
            }
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m6289() {
            int i;
            C0828 r0 = this.f5437;
            if (r0 != null) {
                if (r0.f5379 != null) {
                    i = r0.f5379.f5435;
                } else {
                    i = -1;
                }
                return i == this.f5435;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    /* renamed from: o.ƾі$IF */
    public final class IF extends LinearLayout {

        /* renamed from: ı  reason: contains not printable characters */
        aux f5420;

        /* renamed from: ǃ  reason: contains not printable characters */
        TextView f5422;

        /* renamed from: ɩ  reason: contains not printable characters */
        ImageView f5423;

        /* renamed from: ɹ  reason: contains not printable characters */
        Drawable f5424;

        /* renamed from: Ι  reason: contains not printable characters */
        ImageView f5425;

        /* renamed from: ι  reason: contains not printable characters */
        TextView f5426;

        /* renamed from: І  reason: contains not printable characters */
        private int f5427 = 2;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private View f5428;

        public IF(Context context) {
            super(context);
            m6285(context);
            C0293.m4178(this, C0828.this.f5405, C0828.this.f5404, C0828.this.f5414, C0828.this.f5395);
            setGravity(17);
            setOrientation(C0828.this.f5384 ^ true ? 1 : 0);
            setClickable(true);
            C0293.m4208((View) this, C3014.m15447(getContext(), 1002));
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: android.graphics.drawable.GradientDrawable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.graphics.drawable.GradientDrawable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: android.graphics.drawable.GradientDrawable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: android.graphics.drawable.GradientDrawable} */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: ɩ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m6285(android.content.Context r7) {
            /*
                r6 = this;
                o.ƾі r0 = o.C0828.this
                int r0 = r0.f5410
                r1 = 0
                if (r0 == 0) goto L_0x0025
                o.ƾі r0 = o.C0828.this
                int r0 = r0.f5410
                android.graphics.drawable.Drawable r7 = o.C3257Con.m1345(r7, r0)
                r6.f5424 = r7
                android.graphics.drawable.Drawable r7 = r6.f5424
                if (r7 == 0) goto L_0x0027
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0027
                android.graphics.drawable.Drawable r7 = r6.f5424
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0027
            L_0x0025:
                r6.f5424 = r1
            L_0x0027:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = r7
                android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
                r2 = 0
                r0.setColor(r2)
                o.ƾі r0 = o.C0828.this
                android.content.res.ColorStateList r0 = r0.f5418
                if (r0 == 0) goto L_0x0080
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r3)
                r3 = -1
                r0.setColor(r3)
                o.ƾі r3 = o.C0828.this
                android.content.res.ColorStateList r3 = r3.f5418
                android.content.res.ColorStateList r3 = o.C0410.m4696(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x006b
                android.graphics.drawable.RippleDrawable r2 = new android.graphics.drawable.RippleDrawable
                o.ƾі r4 = o.C0828.this
                boolean r4 = r4.f5388
                if (r4 == 0) goto L_0x005f
                r7 = r1
            L_0x005f:
                o.ƾі r4 = o.C0828.this
                boolean r4 = r4.f5388
                if (r4 == 0) goto L_0x0066
                r0 = r1
            L_0x0066:
                r2.<init>(r3, r7, r0)
                r7 = r2
                goto L_0x0080
            L_0x006b:
                android.graphics.drawable.Drawable r0 = o.C1266.m8158(r0)
                o.C1266.m8152((android.graphics.drawable.Drawable) r0, (android.content.res.ColorStateList) r3)
                android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r2] = r7
                r7 = 1
                r3[r7] = r0
                r1.<init>(r3)
                r7 = r1
            L_0x0080:
                o.C0293.m4199((android.view.View) r6, (android.graphics.drawable.Drawable) r7)
                o.ƾі r7 = o.C0828.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0828.IF.m6285(android.content.Context):void");
        }

        /* access modifiers changed from: protected */
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f5424;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f5424.setState(drawableState);
            }
            if (z) {
                invalidate();
                C0828.this.invalidate();
            }
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f5420 == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            aux aux = this.f5420;
            if (aux.f5437 != null) {
                aux.f5437.m6278(aux);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f5422;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f5423;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f5428;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar.Tab");
            C0520 r8 = C0520.m4998(accessibilityNodeInfo);
            r8.m5023((Object) C0520.If.m5072(0, 1, this.f5420.f5435, 1, false, isSelected()));
            if (isSelected()) {
                r8.m5068(false);
                r8.m5011(C0520.Cif.f4329);
            }
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar.Tab");
        }

        public final void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int i3 = C0828.this.f5400;
            if (i3 > 0 && (mode == 0 || size > i3)) {
                i = View.MeasureSpec.makeMeasureSpec(C0828.this.f5400, RecyclerView.UNDEFINED_DURATION);
            }
            super.onMeasure(i, i2);
            if (this.f5422 != null) {
                float f = C0828.this.f5387;
                int i4 = this.f5427;
                ImageView imageView = this.f5423;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f5422;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = C0828.this.f5391;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.f5422.getTextSize();
                int lineCount = this.f5422.getLineCount();
                int r5 = C0893.m6631(this.f5422);
                int i5 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i5 != 0 || (r5 >= 0 && i4 != r5)) {
                    if (C0828.this.f5402 == 1 && i5 > 0 && lineCount == 1 && ((layout = this.f5422.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f5422.setTextSize(0, f);
                        this.f5422.setMaxLines(i4);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m6283() {
            View view;
            aux aux = this.f5420;
            Drawable drawable = null;
            if (aux != null) {
                view = aux.f5433;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f5428 = view;
                TextView textView = this.f5422;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f5423;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f5423.setImageDrawable((Drawable) null);
                }
                this.f5426 = (TextView) view.findViewById(16908308);
                TextView textView2 = this.f5426;
                if (textView2 != null) {
                    this.f5427 = C0893.m6631(textView2);
                }
                this.f5425 = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f5428;
                if (view2 != null) {
                    removeView(view2);
                    this.f5428 = null;
                }
                this.f5426 = null;
                this.f5425 = null;
            }
            if (this.f5428 == null) {
                if (this.f5423 == null) {
                    m6282();
                }
                if (!(aux == null || aux.f5432 == null)) {
                    drawable = C1266.m8158(aux.f5432).mutate();
                }
                if (drawable != null) {
                    C1266.m8152(drawable, C0828.this.f5408);
                    if (C0828.this.f5399 != null) {
                        C1266.m8153(drawable, C0828.this.f5399);
                    }
                }
                if (this.f5422 == null) {
                    m6281();
                    this.f5427 = C0893.m6631(this.f5422);
                }
                C0893.m6632(this.f5422, C0828.this.f5383);
                if (C0828.this.f5417 != null) {
                    this.f5422.setTextColor(C0828.this.f5417);
                }
                m6284(this.f5422, this.f5423);
                final ImageView imageView2 = this.f5423;
                if (imageView2 != null) {
                    imageView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            r1.getVisibility();
                        }
                    });
                }
                final TextView textView3 = this.f5422;
                if (textView3 != null) {
                    textView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            textView3.getVisibility();
                        }
                    });
                }
            } else if (!(this.f5426 == null && this.f5425 == null)) {
                m6284(this.f5426, this.f5425);
            }
            if (aux != null && !TextUtils.isEmpty(aux.f5436)) {
                setContentDescription(aux.f5436);
            }
            setSelected(aux != null && aux.m6289());
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private void m6282() {
            ViewGroup viewGroup;
            if (C1315.f7313) {
                viewGroup = new FrameLayout(getContext());
                viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(viewGroup, 0);
            } else {
                viewGroup = this;
            }
            this.f5423 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.f169052131558448, viewGroup, false);
            viewGroup.addView(this.f5423, 0);
        }

        /* renamed from: ı  reason: contains not printable characters */
        private void m6281() {
            ViewGroup viewGroup;
            if (C1315.f7313) {
                viewGroup = new FrameLayout(getContext());
                viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(viewGroup);
            } else {
                viewGroup = this;
            }
            this.f5422 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.f169062131558449, viewGroup, false);
            viewGroup.addView(this.f5422);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m6284(TextView textView, ImageView imageView) {
            CharSequence charSequence;
            CharSequence charSequence2;
            aux aux = this.f5420;
            Drawable mutate = (aux == null || aux.f5432 == null) ? null : C1266.m8158(this.f5420.f5432).mutate();
            aux aux2 = this.f5420;
            if (aux2 != null) {
                charSequence = aux2.f5430;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    if (this.f5420.f5431 == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int applyDimension = (!z || imageView.getVisibility() != 0) ? 0 : (int) TypedValue.applyDimension(1, 8.0f, getContext().getResources().getDisplayMetrics());
                if (C0828.this.f5384) {
                    if (applyDimension != C2826.m14766(marginLayoutParams)) {
                        C2826.m14764(marginLayoutParams, applyDimension);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (applyDimension != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = applyDimension;
                    C2826.m14764(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            aux aux3 = this.f5420;
            if (aux3 != null) {
                charSequence2 = aux3.f5436;
            } else {
                charSequence2 = null;
            }
            if (z) {
                charSequence2 = null;
            }
            C2110.m11263(this, charSequence2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final int m6286() {
            View[] viewArr = {this.f5422, this.f5423, this.f5428};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }
    }

    /* renamed from: o.ƾі$if  reason: invalid class name */
    class Cif extends LinearLayout {

        /* renamed from: ı  reason: contains not printable characters */
        final Paint f5441;

        /* renamed from: Ɩ  reason: contains not printable characters */
        ValueAnimator f5442;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f5443 = -1;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f5444 = -1;

        /* renamed from: ɹ  reason: contains not printable characters */
        int f5446 = -1;

        /* renamed from: ɾ  reason: contains not printable characters */
        private int f5447 = -1;

        /* renamed from: Ι  reason: contains not printable characters */
        float f5448;

        /* renamed from: ι  reason: contains not printable characters */
        int f5449;

        /* renamed from: І  reason: contains not printable characters */
        int f5450 = -1;

        /* renamed from: і  reason: contains not printable characters */
        int f5451 = -1;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private final GradientDrawable f5452;

        Cif(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f5441 = new Paint();
            this.f5452 = new GradientDrawable();
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f5447 != i) {
                requestLayout();
                this.f5447 = i;
            }
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                boolean z = true;
                if (C0828.this.f5381 == 1 || C0828.this.f5402 == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) TypedValue.applyDimension(1, 16.0f, getContext().getResources().getDisplayMetrics())) << 1)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            C0828 r0 = C0828.this;
                            r0.f5381 = 0;
                            r0.m6280(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f5442;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m6294();
            } else {
                m6295(false, this.f5444, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m6294() {
            int i;
            int i2;
            View childAt = getChildAt(this.f5444);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (!C0828.this.f5401 && (childAt instanceof IF)) {
                    m6293((IF) childAt, C0828.this.f5386);
                    i2 = (int) C0828.this.f5386.left;
                    i = (int) C0828.this.f5386.right;
                }
                if (this.f5448 > 0.0f && this.f5444 < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f5444 + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (!C0828.this.f5401 && (childAt2 instanceof IF)) {
                        m6293((IF) childAt2, C0828.this.f5386);
                        left = (int) C0828.this.f5386.left;
                        right = (int) C0828.this.f5386.right;
                    }
                    float f = this.f5448;
                    i2 = (int) ((((float) left) * f) + ((1.0f - f) * ((float) i2)));
                    i = (int) ((((float) right) * f) + ((1.0f - f) * ((float) i)));
                }
            }
            if (i2 != this.f5443 || i != this.f5451) {
                this.f5443 = i2;
                this.f5451 = i;
                C0293.m4176(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m6295(boolean z, final int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                m6294();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (!C0828.this.f5401 && (childAt instanceof IF)) {
                m6293((IF) childAt, C0828.this.f5386);
                left = (int) C0828.this.f5386.left;
                right = (int) C0828.this.f5386.right;
            }
            int i3 = this.f5443;
            int i4 = this.f5451;
            if (i3 != left || i4 != right) {
                if (z) {
                    this.f5446 = i3;
                    this.f5450 = i4;
                }
                AnonymousClass3 r0 = new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        Cif ifVar = Cif.this;
                        int i = ifVar.f5446;
                        int round = i + Math.round(((float) (left - i)) * animatedFraction);
                        int i2 = Cif.this.f5450;
                        int round2 = i2 + Math.round(animatedFraction * ((float) (right - i2)));
                        if (round != ifVar.f5443 || round2 != ifVar.f5451) {
                            ifVar.f5443 = round;
                            ifVar.f5451 = round2;
                            C0293.m4176(ifVar);
                        }
                    }
                };
                if (z) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.f5442 = valueAnimator;
                    valueAnimator.setInterpolator(C1311.f7289);
                    valueAnimator.setDuration((long) i2);
                    valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                    valueAnimator.addUpdateListener(r0);
                    valueAnimator.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationStart(Animator animator) {
                            Cif.this.f5444 = i;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            Cif ifVar = Cif.this;
                            ifVar.f5444 = i;
                            ifVar.f5448 = 0.0f;
                        }
                    });
                    valueAnimator.start();
                    return;
                }
                this.f5442.removeAllUpdateListeners();
                this.f5442.addUpdateListener(r0);
            }
        }

        public final void draw(Canvas canvas) {
            int i = 0;
            int intrinsicHeight = C0828.this.f5393 != null ? C0828.this.f5393.getIntrinsicHeight() : 0;
            int i2 = this.f5449;
            if (i2 >= 0) {
                intrinsicHeight = i2;
            }
            int i3 = C0828.this.f5380;
            if (i3 == 0) {
                i = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i3 == 1) {
                i = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i3 != 2) {
                intrinsicHeight = i3 != 3 ? 0 : getHeight();
            }
            int i4 = this.f5443;
            if (i4 >= 0 && this.f5451 > i4) {
                Drawable r2 = C1266.m8158(C0828.this.f5393 != null ? C0828.this.f5393 : this.f5452);
                r2.setBounds(this.f5443, i, this.f5451, intrinsicHeight);
                if (this.f5441 != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        r2.setColorFilter(this.f5441.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        C1266.m8148(r2, this.f5441.getColor());
                    }
                }
                r2.draw(canvas);
            }
            super.draw(canvas);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private void m6293(IF ifR, RectF rectF) {
            int r0 = ifR.m6286();
            int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, getContext().getResources().getDisplayMetrics());
            if (r0 < applyDimension) {
                r0 = applyDimension;
            }
            int left = (ifR.getLeft() + ifR.getRight()) / 2;
            int i = r0 / 2;
            rectF.set((float) (left - i), 0.0f, (float) (left + i), 0.0f);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static ColorStateList m6265(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int m6275() {
        int i = this.f5398;
        if (i != -1) {
            return i;
        }
        int i2 = this.f5402;
        if (i2 == 0 || i2 == 2) {
            return this.f5385;
        }
        return 0;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* renamed from: o.ƾі$iF  reason: case insensitive filesystem */
    public static class C3629iF implements C2613.C3648iF {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final WeakReference<C0828> f5438;

        /* renamed from: Ι  reason: contains not printable characters */
        int f5439;

        /* renamed from: ι  reason: contains not printable characters */
        int f5440;

        public C3629iF(C0828 r2) {
            this.f5438 = new WeakReference<>(r2);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m6292(int i) {
            this.f5439 = this.f5440;
            this.f5440 = i;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m6291(int i, float f, int i2) {
            C0828 r8 = this.f5438.get();
            if (r8 != null) {
                boolean z = false;
                boolean z2 = this.f5440 != 2 || this.f5439 == 1;
                if (!(this.f5440 == 2 && this.f5439 == 0)) {
                    z = true;
                }
                r8.setScrollPosition(i, f, z2, z);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m6290(int i) {
            int i2;
            C0828 r0 = this.f5438.get();
            if (r0 != null) {
                if (r0.f5379 != null) {
                    i2 = r0.f5379.f5435;
                } else {
                    i2 = -1;
                }
                if (i2 != i && i < r0.f5392.size()) {
                    int i3 = this.f5440;
                    r0.m6277((i < 0 || i >= r0.f5392.size()) ? null : r0.f5392.get(i), i3 == 0 || (i3 == 2 && this.f5439 == 0));
                }
            }
        }
    }

    /* renamed from: o.ƾі$ι  reason: contains not printable characters */
    public static class C0832 implements C0829 {

        /* renamed from: Ι  reason: contains not printable characters */
        private final C2613 f5461;

        public C0832(C2613 r1) {
            this.f5461 = r1;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m6297(aux aux) {
            this.f5461.setCurrentItem(aux.f5435);
        }
    }

    /* renamed from: o.ƾі$ǃ  reason: contains not printable characters */
    class C0830 extends DataSetObserver {
        C0830() {
        }

        public final void onChanged() {
            C0828.this.m6276();
        }

        public final void onInvalidated() {
            C0828.this.m6276();
        }
    }

    /* renamed from: o.ƾі$ɩ  reason: contains not printable characters */
    class C0831 implements C2613.C2614 {

        /* renamed from: ı  reason: contains not printable characters */
        boolean f5459;

        C0831() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m6296(C2613 r1, C2676 r2, C2676 r3) {
            if (C0828.this.f5382 == r1) {
                C0828.this.m6279(r3, this.f5459);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m6260(C1057 r6) {
        aux r0 = f5378.m12090();
        if (r0 == null) {
            r0 = new aux();
        }
        r0.f5437 = this;
        r0.f5434 = m6266(r0);
        if (r6.f6328 != null) {
            r0.m6288(r6.f6328);
        }
        if (r6.f6327 != null) {
            r0.f5432 = r6.f6327;
            if (r0.f5437.f5381 == 1 || r0.f5437.f5402 == 2) {
                r0.f5437.m6280(true);
            }
            if (r0.f5434 != null) {
                r0.f5434.m6283();
            }
        }
        if (r6.f6329 != 0) {
            r0.f5433 = LayoutInflater.from(r0.f5434.getContext()).inflate(r6.f6329, r0.f5434, false);
            if (r0.f5434 != null) {
                r0.f5434.m6283();
            }
        }
        if (!TextUtils.isEmpty(r6.getContentDescription())) {
            r0.f5436 = r6.getContentDescription();
            if (r0.f5434 != null) {
                r0.f5434.m6283();
            }
        }
        m6264(r0, this.f5392.size(), this.f5392.isEmpty());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private aux m6270() {
        aux r0 = f5378.m12090();
        if (r0 == null) {
            r0 = new aux();
        }
        r0.f5437 = this;
        r0.f5434 = m6266(r0);
        return r0;
    }

    public boolean shouldDelayChildPressedState() {
        if (Math.max(0, ((this.f5389.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m6269(aux aux2, int i) {
        aux2.f5435 = i;
        this.f5392.add(i, aux2);
        int size = this.f5392.size();
        while (true) {
            i++;
            if (i < size) {
                this.f5392.get(i).f5435 = i;
            } else {
                return;
            }
        }
    }

    public void addView(View view) {
        if (view instanceof C1057) {
            m6260((C1057) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void addView(View view, int i) {
        if (view instanceof C1057) {
            m6260((C1057) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C1057) {
            m6260((C1057) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C1057) {
            m6260((C1057) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }
}
