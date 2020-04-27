package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import o.C0520;
import o.C2523;
import o.C2728;

/* renamed from: o.ӏɹ  reason: contains not printable characters */
public final class C2895 extends ViewGroup {

    /* renamed from: І  reason: contains not printable characters */
    private static boolean f13465 = true;

    /* renamed from: ı  reason: contains not printable characters */
    public int f13466;

    /* renamed from: ŀ  reason: contains not printable characters */
    private C2876 f13467;

    /* renamed from: ł  reason: contains not printable characters */
    private C2806 f13468;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final Rect f13469 = new Rect();

    /* renamed from: ǃ  reason: contains not printable characters */
    LinearLayoutManager f13470;

    /* renamed from: ȷ  reason: contains not printable characters */
    private Parcelable f13471;

    /* renamed from: ɨ  reason: contains not printable characters */
    private RecyclerView.C0032 f13472 = new Cif() {
        /* renamed from: ι  reason: contains not printable characters */
        public final void m14985() {
            C2895 r0 = C2895.this;
            r0.f13480 = true;
            r0.f13473.f13269 = true;
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2833 f13473;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final Rect f13474 = new Rect();

    /* renamed from: ɹ  reason: contains not printable characters */
    boolean f13475 = true;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f13476 = -1;

    /* renamed from: ɿ  reason: contains not printable characters */
    private C0981 f13477;

    /* renamed from: ʟ  reason: contains not printable characters */
    private boolean f13478 = false;

    /* renamed from: Ι  reason: contains not printable characters */
    RecyclerView f13479;

    /* renamed from: ι  reason: contains not printable characters */
    boolean f13480 = false;

    /* renamed from: г  reason: contains not printable characters */
    private RecyclerView.C3246iF f13481 = null;

    /* renamed from: і  reason: contains not printable characters */
    int f13482 = -1;

    /* renamed from: Ӏ  reason: contains not printable characters */
    C3658If f13483;

    /* renamed from: ӏ  reason: contains not printable characters */
    private C2806 f13484 = new C2806();

    /* renamed from: o.ӏɹ$aux  reason: case insensitive filesystem */
    public interface C3659aux {
    }

    /* renamed from: o.ӏɹ$ɩ  reason: contains not printable characters */
    public static abstract class C2898 {
        /* renamed from: ı  reason: contains not printable characters */
        public void m15020(int i, float f, int i2) {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m15021(int i) {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m15022(int i) {
        }
    }

    public C2895(Context context) {
        super(context);
        m14976(context, (AttributeSet) null);
    }

    public C2895(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14976(context, attributeSet);
    }

    public C2895(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14976(context, attributeSet);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m14976(Context context, AttributeSet attributeSet) {
        this.f13483 = f13465 ? new C2900() : new C2897();
        this.f13479 = new IF(context);
        this.f13479.setId(C0293.m4193());
        this.f13479.setDescendantFocusability(131072);
        this.f13470 = new C2896(context);
        this.f13479.setLayoutManager(this.f13470);
        this.f13479.setScrollingTouchSlop(1);
        m14975(context, attributeSet);
        this.f13479.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f13479.addOnChildAttachStateChangeListener(new RecyclerView.C0039() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m14984(View view) {
                RecyclerView.C0038 r3 = (RecyclerView.C0038) view.getLayoutParams();
                if (r3.width != -1 || r3.height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        });
        this.f13473 = new C2833(this);
        new C2523.AnonymousClass4(this, this.f13473, this.f13479);
        this.f13477 = new C3660iF();
        this.f13477.m7404(this.f13479);
        this.f13479.addOnScrollListener(this.f13473);
        this.f13468 = new C2806();
        this.f13473.f13265 = this.f13468;
        AnonymousClass1 r3 = new C2898() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m14981(int i) {
                if (C2895.this.f13466 != i) {
                    C2895 r0 = C2895.this;
                    r0.f13466 = i;
                    r0.f13483.m14997();
                }
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m14982(int i) {
                if (i == 0) {
                    C2895.this.m14978();
                }
            }
        };
        AnonymousClass3 r4 = new C2898() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m14983(int i) {
                C2895.this.clearFocus();
                if (C2895.this.hasFocus()) {
                    C2895.this.f13479.requestFocus(2);
                }
            }
        };
        this.f13468.f13220.add(r3);
        this.f13468.f13220.add(r4);
        this.f13483.m15000(this.f13479);
        this.f13468.f13220.add(this.f13484);
        this.f13467 = new C2876(this.f13470);
        this.f13468.f13220.add(this.f13467);
        RecyclerView recyclerView = this.f13479;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    public final CharSequence getAccessibilityClassName() {
        if (this.f13483.m14993()) {
            return this.f13483.m14986();
        }
        return super.getAccessibilityClassName();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m14975(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2728.C2729.f12726);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C2728.C2729.f12726, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C2728.C2729.f12727, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        C2899 r1 = new C2899(super.onSaveInstanceState());
        r1.f13496 = this.f13479.getId();
        int i = this.f13476;
        if (i == -1) {
            i = this.f13466;
        }
        r1.f13497 = i;
        Parcelable parcelable = this.f13471;
        if (parcelable != null) {
            r1.f13498 = parcelable;
        } else {
            RecyclerView.C0035 adapter = this.f13479.getAdapter();
            if (adapter instanceof C2789) {
                r1.f13498 = ((C2789) adapter).m14701();
            }
        }
        return r1;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2899)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2899 r2 = (C2899) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.f13476 = r2.f13497;
        this.f13471 = r2.f13498;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m14977() {
        RecyclerView.C0035 adapter;
        if (this.f13476 != -1 && (adapter = this.f13479.getAdapter()) != null) {
            if (this.f13471 != null) {
                this.f13471 = null;
            }
            this.f13466 = Math.max(0, Math.min(this.f13476, adapter.getItemCount() - 1));
            this.f13476 = -1;
            this.f13479.scrollToPosition(this.f13466);
            this.f13483.m14988();
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof C2899) {
            int i = ((C2899) parcelable).f13496;
            sparseArray.put(this.f13479.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m14977();
    }

    /* renamed from: o.ӏɹ$Ι  reason: contains not printable characters */
    static class C2899 extends View.BaseSavedState {
        public static final Parcelable.Creator<C2899> CREATOR = new Parcelable.ClassLoaderCreator<C2899>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new C2899(parcel, classLoader) : new C2899(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C2899[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new C2899(parcel, (ClassLoader) null) : new C2899(parcel);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        int f13496;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f13497;

        /* renamed from: ι  reason: contains not printable characters */
        Parcelable f13498;

        C2899(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13496 = parcel.readInt();
            this.f13497 = parcel.readInt();
            this.f13498 = parcel.readParcelable(classLoader);
        }

        C2899(Parcel parcel) {
            super(parcel);
            this.f13496 = parcel.readInt();
            this.f13497 = parcel.readInt();
            this.f13498 = parcel.readParcelable((ClassLoader) null);
        }

        C2899(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13496);
            parcel.writeInt(this.f13497);
            parcel.writeParcelable(this.f13498, i);
        }
    }

    public final void setAdapter(RecyclerView.C0035 r3) {
        RecyclerView.C0035 adapter = this.f13479.getAdapter();
        this.f13483.m14999((RecyclerView.C0035<?>) adapter);
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f13472);
        }
        this.f13479.setAdapter(r3);
        this.f13466 = 0;
        m14977();
        this.f13483.m14990((RecyclerView.C0035<?>) r3);
        if (r3 != null) {
            r3.registerAdapterDataObserver(this.f13472);
        }
    }

    public final void onViewAdded(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" does not support direct child views");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        measureChild(this.f13479, i, i2);
        int measuredWidth = this.f13479.getMeasuredWidth();
        int measuredHeight = this.f13479.getMeasuredHeight();
        int measuredState = this.f13479.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f13479.getMeasuredWidth();
        int measuredHeight = this.f13479.getMeasuredHeight();
        this.f13469.left = getPaddingLeft();
        this.f13469.right = (i3 - i) - getPaddingRight();
        this.f13469.top = getPaddingTop();
        this.f13469.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f13469, this.f13474);
        this.f13479.layout(this.f13474.left, this.f13474.top, this.f13474.right, this.f13474.bottom);
        if (this.f13480) {
            m14978();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m14978() {
        C0981 r0 = this.f13477;
        if (r0 != null) {
            View r02 = r0.m7401(this.f13470);
            if (r02 != null) {
                int r03 = LinearLayoutManager.m392(r02);
                if (r03 != this.f13466 && this.f13473.f13266 == 0) {
                    this.f13468.m15021(r03);
                }
                this.f13480 = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final int m14980() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f13479;
        if (this.f13470.f290 == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public final void setOrientation(int i) {
        this.f13470.m284(i);
        this.f13483.m14995();
    }

    public final void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public final void setCurrentItem(int i, boolean z) {
        m14979(i, z);
    }

    public final void setUserInputEnabled(boolean z) {
        this.f13475 = z;
        this.f13483.m15002();
    }

    public final void setOffscreenPageLimit(int i) {
        if (i > 0 || i == -1) {
            this.f13482 = i;
            this.f13479.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public final boolean canScrollHorizontally(int i) {
        return this.f13479.canScrollHorizontally(i);
    }

    public final boolean canScrollVertically(int i) {
        return this.f13479.canScrollVertically(i);
    }

    public final void setPageTransformer(C3659aux aux) {
        if (aux != null) {
            if (!this.f13478) {
                this.f13481 = this.f13479.getItemAnimator();
                this.f13478 = true;
            }
            this.f13479.setItemAnimator((RecyclerView.C3246iF) null);
        } else if (this.f13478) {
            this.f13479.setItemAnimator(this.f13481);
            this.f13481 = null;
            this.f13478 = false;
        }
        if (aux != this.f13467.f13405) {
            C2876 r0 = this.f13467;
            r0.f13405 = aux;
            if (r0.f13405 != null) {
                C2833 r5 = this.f13473;
                r5.m14781();
                double d = ((double) r5.f13263.f13277) + ((double) r5.f13263.f13276);
                int i = (int) d;
                float f = (float) (d - ((double) i));
                this.f13467.m15020(i, f, Math.round(((float) m14980()) * f));
            }
        }
    }

    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f13483.m15004();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f13483.m14989(accessibilityNodeInfo);
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f13483.m15001(i)) {
            return this.f13483.m14994(i);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    /* renamed from: o.ӏɹ$IF */
    class IF extends RecyclerView {
        IF(Context context) {
            super(context);
        }

        public final CharSequence getAccessibilityClassName() {
            if (C2895.this.f13483.m14987()) {
                return C2895.this.f13483.m15003();
            }
            return super.getAccessibilityClassName();
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(C2895.this.f13466);
            accessibilityEvent.setToIndex(C2895.this.f13466);
            C2895.this.f13483.m14998(accessibilityEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return C2895.this.f13475 && super.onTouchEvent(motionEvent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return C2895.this.f13475 && super.onInterceptTouchEvent(motionEvent);
        }
    }

    /* renamed from: o.ӏɹ$ı  reason: contains not printable characters */
    class C2896 extends LinearLayoutManager {
        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m15014(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        C2896(Context context) {
            super(context);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m15012(RecyclerView.AUx aUx, RecyclerView.C0033 r3, int i, Bundle bundle) {
            if (C2895.this.f13483.m14992(i)) {
                return C2895.this.f13483.m14996(i);
            }
            return super.m420(aUx, r3, i, bundle);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m15011(RecyclerView.AUx aUx, RecyclerView.C0033 r2, C0520 r3) {
            super.m418(aUx, r2, r3);
            C2895.this.f13483.m14991(r3);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m15013(RecyclerView.C0033 r3, int[] iArr) {
            int i = C2895.this.f13482;
            if (i == -1) {
                super.m311(r3, iArr);
                return;
            }
            int r32 = C2895.this.m14980() * i;
            iArr[0] = r32;
            iArr[1] = r32;
        }
    }

    /* renamed from: o.ӏɹ$iF  reason: case insensitive filesystem */
    class C3660iF extends C0981 {
        C3660iF() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final View m15005(RecyclerView.IF ifR) {
            return super.m6957(ifR);
        }
    }

    /* renamed from: o.ӏɹ$Aux */
    static class Aux implements Runnable {

        /* renamed from: Ι  reason: contains not printable characters */
        private final RecyclerView f13489;

        /* renamed from: ι  reason: contains not printable characters */
        private final int f13490;

        Aux(int i, RecyclerView recyclerView) {
            this.f13490 = i;
            this.f13489 = recyclerView;
        }

        public final void run() {
            this.f13489.smoothScrollToPosition(this.f13490);
        }
    }

    /* renamed from: o.ӏɹ$If  reason: case insensitive filesystem */
    abstract class C3658If {
        /* access modifiers changed from: package-private */
        /* renamed from: Ɩ  reason: contains not printable characters */
        public boolean m14987() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public void m14988() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public void m14989(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public void m14990(RecyclerView.C0035<?> r1) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public void m14991(C0520 r1) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m14992(int i) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean m14993() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public void m14995() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public void m14997() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public void m14998(AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public void m14999(RecyclerView.C0035<?> r1) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public void m15000(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public boolean m15001(int i) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: І  reason: contains not printable characters */
        public void m15002() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ӏ  reason: contains not printable characters */
        public void m15004() {
        }

        private C3658If() {
        }

        /* synthetic */ C3658If(C2895 r1, byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public String m14986() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean m14994(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m14996(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: і  reason: contains not printable characters */
        public CharSequence m15003() {
            throw new IllegalStateException("Not implemented.");
        }
    }

    /* renamed from: o.ӏɹ$ǃ  reason: contains not printable characters */
    class C2897 extends C3658If {
        /* renamed from: Ɩ  reason: contains not printable characters */
        public final boolean m15015() {
            return true;
        }

        /* renamed from: і  reason: contains not printable characters */
        public final CharSequence m15019() {
            return "androidx.viewpager.widget.ViewPager";
        }

        C2897() {
            super(C2895.this, (byte) 0);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m15017(int i) {
            return (i == 8192 || i == 4096) && !C2895.this.f13475;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m15016(C0520 r2) {
            if (!C2895.this.f13475) {
                r2.m5011(C0520.Cif.f4315);
                r2.m5011(C0520.Cif.f4325);
                r2.m5028(false);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m15018(int i) {
            if ((i == 8192 || i == 4096) && !C2895.this.f13475) {
                return false;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.ӏɹ$ι  reason: contains not printable characters */
    class C2900 extends C3658If implements C0607 {

        /* renamed from: ı  reason: contains not printable characters */
        private final C0607 f13499 = this;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C0607 f13500 = new C0607() {
            /* renamed from: ı  reason: contains not printable characters */
            public final boolean m15040(View view) {
                C2900 r0 = C2900.this;
                int i = ((C2895) view).f13466 - 1;
                if (C2895.this.f13475) {
                    C2895.this.m14979(i, true);
                }
                return true;
            }
        };

        /* renamed from: ι  reason: contains not printable characters */
        private RecyclerView.C0032 f13502;

        /* renamed from: ı  reason: contains not printable characters */
        public final String m15023() {
            return "androidx.viewpager.widget.ViewPager";
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m15028() {
            return true;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m15036(int i) {
            return i == 8192 || i == 4096;
        }

        C2900() {
            super(C2895.this, (byte) 0);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m15035(RecyclerView recyclerView) {
            C0293.m4203((View) recyclerView, 2);
            this.f13502 = new Cif() {
                /* renamed from: ι  reason: contains not printable characters */
                public final void m15039() {
                    C2900.this.m15030();
                }
            };
            if (C0293.m4217(C2895.this) == 0) {
                C0293.m4203((View) C2895.this, 1);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m15025() {
            m15030();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m15027(RecyclerView.C0035<?> r2) {
            m15030();
            if (r2 != null) {
                r2.registerAdapterDataObserver(this.f13502);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m15034(RecyclerView.C0035<?> r2) {
            if (r2 != null) {
                r2.unregisterAdapterDataObserver(this.f13502);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m15031() {
            m15030();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m15032() {
            m15030();
        }

        /* renamed from: І  reason: contains not printable characters */
        public final void m15037() {
            m15030();
            if (Build.VERSION.SDK_INT < 21) {
                C2895.this.sendAccessibilityEvent(2048);
            }
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final void m15038() {
            m15030();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m15029(int i) {
            int i2;
            if (i == 8192 || i == 4096) {
                if (i == 8192) {
                    i2 = C2895.this.f13466 - 1;
                } else {
                    i2 = C2895.this.f13466 + 1;
                }
                if (C2895.this.f13475) {
                    C2895.this.m14979(i2, true);
                }
                return true;
            }
            throw new IllegalStateException();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m15033(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(C2895.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɹ  reason: contains not printable characters */
        public final void m15030() {
            int itemCount;
            C2895 r0 = C2895.this;
            int i = 16908360;
            C0293.m4147((View) r0, 16908360);
            C0293.m4147((View) r0, 16908361);
            C0293.m4147((View) r0, 16908358);
            C0293.m4147((View) r0, 16908359);
            if (C2895.this.f13479.getAdapter() != null && (itemCount = C2895.this.f13479.getAdapter().getItemCount()) != 0 && C2895.this.f13475) {
                if (C2895.this.f13470.f290 == 0) {
                    boolean z = C0293.m4156(C2895.this.f13470.f349) == 1;
                    int i2 = z ? 16908360 : 16908361;
                    if (z) {
                        i = 16908361;
                    }
                    if (C2895.this.f13466 < itemCount - 1) {
                        C0293.m4150(r0, new C0520.Cif(i2, (CharSequence) null), (CharSequence) null, this.f13499);
                    }
                    if (C2895.this.f13466 > 0) {
                        C0293.m4150(r0, new C0520.Cif(i, (CharSequence) null), (CharSequence) null, this.f13500);
                        return;
                    }
                    return;
                }
                if (C2895.this.f13466 < itemCount - 1) {
                    C0293.m4150(r0, new C0520.Cif(16908359, (CharSequence) null), (CharSequence) null, this.f13499);
                }
                if (C2895.this.f13466 > 0) {
                    C0293.m4150(r0, new C0520.Cif(16908358, (CharSequence) null), (CharSequence) null, this.f13500);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* renamed from: ǃ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m15026(android.view.accessibility.AccessibilityNodeInfo r6) {
            /*
                r5 = this;
                o.ӏɹ r0 = o.C2895.this
                androidx.recyclerview.widget.RecyclerView r0 = r0.f13479
                androidx.recyclerview.widget.RecyclerView$ɩ r0 = r0.getAdapter()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0030
                o.ӏɹ r0 = o.C2895.this
                androidx.recyclerview.widget.LinearLayoutManager r0 = r0.f13470
                int r0 = r0.f290
                if (r0 != r1) goto L_0x0021
                o.ӏɹ r0 = o.C2895.this
                androidx.recyclerview.widget.RecyclerView r0 = r0.f13479
                androidx.recyclerview.widget.RecyclerView$ɩ r0 = r0.getAdapter()
                int r0 = r0.getItemCount()
                goto L_0x0031
            L_0x0021:
                o.ӏɹ r0 = o.C2895.this
                androidx.recyclerview.widget.RecyclerView r0 = r0.f13479
                androidx.recyclerview.widget.RecyclerView$ɩ r0 = r0.getAdapter()
                int r0 = r0.getItemCount()
                r3 = r0
                r0 = 0
                goto L_0x0032
            L_0x0030:
                r0 = 0
            L_0x0031:
                r3 = 0
            L_0x0032:
                o.Ł r4 = o.C0520.m4998((android.view.accessibility.AccessibilityNodeInfo) r6)
                o.Ł$ɩ r0 = o.C0520.C0521.m5076(r0, r3, r2, r2)
                r4.m5035((java.lang.Object) r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 16
                if (r0 < r2) goto L_0x0075
                o.ӏɹ r0 = o.C2895.this
                androidx.recyclerview.widget.RecyclerView r0 = r0.f13479
                androidx.recyclerview.widget.RecyclerView$ɩ r0 = r0.getAdapter()
                if (r0 == 0) goto L_0x0075
                int r0 = r0.getItemCount()
                if (r0 == 0) goto L_0x0075
                o.ӏɹ r2 = o.C2895.this
                boolean r2 = r2.f13475
                if (r2 != 0) goto L_0x005a
                goto L_0x0075
            L_0x005a:
                o.ӏɹ r2 = o.C2895.this
                int r2 = r2.f13466
                if (r2 <= 0) goto L_0x0065
                r2 = 8192(0x2000, float:1.14794E-41)
                r6.addAction(r2)
            L_0x0065:
                o.ӏɹ r2 = o.C2895.this
                int r2 = r2.f13466
                int r0 = r0 - r1
                if (r2 >= r0) goto L_0x0071
                r0 = 4096(0x1000, float:5.74E-42)
                r6.addAction(r0)
            L_0x0071:
                r6.setScrollable(r1)
            L_0x0075:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2895.C2900.m15026(android.view.accessibility.AccessibilityNodeInfo):void");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m15024(View view) {
            int i = ((C2895) view).f13466 + 1;
            if (C2895.this.f13475) {
                C2895.this.m14979(i, true);
            }
            return true;
        }
    }

    /* renamed from: o.ӏɹ$if  reason: invalid class name */
    static abstract class Cif extends RecyclerView.C0032 {
        private Cif() {
        }

        /* synthetic */ Cif(byte b) {
            this();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m15006() {
            m496();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m15009(int i, int i2, Object obj) {
            m496();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m15010(int i) {
            m496();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m15007(int i, int i2) {
            m496();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m15008(int i, int i2) {
            m496();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m14979(int i, boolean z) {
        RecyclerView.C0035 adapter = this.f13479.getAdapter();
        boolean z2 = false;
        if (adapter == null) {
            if (this.f13476 != -1) {
                this.f13476 = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min == this.f13466) {
                if (this.f13473.f13266 == 0) {
                    return;
                }
            }
            if (min != this.f13466 || !z) {
                double d = (double) this.f13466;
                this.f13466 = min;
                this.f13483.m14997();
                if (this.f13473.f13266 == 0) {
                    z2 = true;
                }
                if (!z2) {
                    C2833 r0 = this.f13473;
                    r0.m14781();
                    d = ((double) r0.f13263.f13276) + ((double) r0.f13263.f13277);
                }
                this.f13473.m14782(min, z);
                if (!z) {
                    this.f13479.scrollToPosition(min);
                    return;
                }
                double d2 = (double) min;
                if (Math.abs(d2 - d) > 3.0d) {
                    this.f13479.scrollToPosition(d2 > d ? min - 3 : min + 3);
                    RecyclerView recyclerView = this.f13479;
                    recyclerView.post(new Aux(min, recyclerView));
                    return;
                }
                this.f13479.smoothScrollToPosition(min);
            }
        }
    }
}
