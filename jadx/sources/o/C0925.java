package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import o.C2958;
import o.C3282auX;

/* renamed from: o.ǃі  reason: contains not printable characters */
public class C0925 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: ı  reason: contains not printable characters */
    int f5835;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f5836;

    /* renamed from: ɩ  reason: contains not printable characters */
    Runnable f5837;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f5838;

    /* renamed from: Ι  reason: contains not printable characters */
    protected final Cif f5839 = new Cif();

    /* renamed from: ι  reason: contains not printable characters */
    C2958 f5840;

    /* renamed from: І  reason: contains not printable characters */
    private int f5841;

    /* renamed from: і  reason: contains not printable characters */
    private boolean f5842;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private Spinner f5843;

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    static {
        new DecelerateInterpolator();
    }

    public C0925(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        C1560 r0 = new C1560(context);
        setContentHeight(r0.m9187());
        this.f5841 = r0.f8311.getResources().getDimensionPixelSize(R.dimen.f157642131165194);
        C2958 r4 = new C2958(getContext(), (AttributeSet) null, R.attr.f148172130968583);
        r4.setMeasureWithLargestChildEnabled(true);
        r4.setGravity(17);
        r4.setLayoutParams(new C2958.C2959(-2, -1));
        this.f5840 = r4;
        addView(this.f5840, new ViewGroup.LayoutParams(-2, -1));
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f5840.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f5835 = -1;
        } else {
            if (childCount > 2) {
                this.f5835 = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f5835 = View.MeasureSpec.getSize(i) / 2;
            }
            this.f5835 = Math.min(this.f5835, this.f5841);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f5836, 1073741824);
        if (!z2 && this.f5842) {
            this.f5840.measure(0, makeMeasureSpec);
            if (this.f5840.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                Spinner spinner = this.f5843;
                if (spinner == null || spinner.getParent() != this) {
                    z = false;
                }
                if (!z) {
                    if (this.f5843 == null) {
                        C1231 r0 = new C1231(getContext(), (AttributeSet) null, R.attr.f148232130968589);
                        r0.setLayoutParams(new C2958.C2959(-2, -1));
                        r0.setOnItemSelectedListener(this);
                        this.f5843 = r0;
                    }
                    removeView(this.f5840);
                    addView(this.f5843, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f5843.getAdapter() == null) {
                        this.f5843.setAdapter(new C0927());
                    }
                    Runnable runnable = this.f5837;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f5837 = null;
                    }
                    this.f5843.setSelection(this.f5838);
                }
            } else {
                m6761();
            }
        } else {
            m6761();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f5838);
        }
    }

    public void setAllowCollapse(boolean z) {
        this.f5842 = z;
    }

    public void setTabSelected(int i) {
        this.f5838 = i;
        int childCount = this.f5840.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f5840.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = this.f5840.getChildAt(i);
                Runnable runnable = this.f5837;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                this.f5837 = new Runnable() {
                    public final void run() {
                        C0925.this.smoothScrollTo(childAt2.getLeft() - ((C0925.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        C0925.this.f5837 = null;
                    }
                };
                post(this.f5837);
            }
            i2++;
        }
        Spinner spinner = this.f5843;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    public void setContentHeight(int i) {
        this.f5836 = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1560 r0 = new C1560(getContext());
        setContentHeight(r0.m9187());
        this.f5841 = r0.f8311.getResources().getDimensionPixelSize(R.dimen.f157642131165194);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f5837;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f5837;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* renamed from: o.ǃі$ǃ  reason: contains not printable characters */
    class C0926 extends LinearLayout {

        /* renamed from: ı  reason: contains not printable characters */
        private TextView f5848;

        /* renamed from: ɩ  reason: contains not printable characters */
        private ImageView f5850;

        /* renamed from: ɹ  reason: contains not printable characters */
        private View f5851;

        /* renamed from: Ι  reason: contains not printable characters */
        C3282auX.C0120 f5852;

        /* renamed from: ι  reason: contains not printable characters */
        private final int[] f5853 = {16842964};

        public C0926(Context context, C3282auX.C0120 r7) {
            super(context, (AttributeSet) null, R.attr.f148182130968584);
            this.f5852 = r7;
            C1992 r1 = new C1992(context, context.obtainStyledAttributes((AttributeSet) null, this.f5853, R.attr.f148182130968584, 0));
            if (r1.f9934.hasValue(0)) {
                setBackgroundDrawable(r1.m10793(0));
            }
            r1.f9934.recycle();
            setGravity(8388627);
            m6762();
        }

        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0925.this.f5835 > 0 && getMeasuredWidth() > C0925.this.f5835) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(C0925.this.f5835, 1073741824), i2);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m6762() {
            C3282auX.C0120 r0 = this.f5852;
            View r1 = r0.m1649();
            CharSequence charSequence = null;
            if (r1 != null) {
                ViewParent parent = r1.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(r1);
                    }
                    addView(r1);
                }
                this.f5851 = r1;
                TextView textView = this.f5848;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f5850;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f5850.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f5851;
            if (view != null) {
                removeView(view);
                this.f5851 = null;
            }
            Drawable r12 = r0.m1651();
            CharSequence r4 = r0.m1652();
            if (r12 != null) {
                if (this.f5850 == null) {
                    C2147 r8 = new C2147(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    r8.setLayoutParams(layoutParams);
                    addView(r8, 0);
                    this.f5850 = r8;
                }
                this.f5850.setImageDrawable(r12);
                this.f5850.setVisibility(0);
            } else {
                ImageView imageView2 = this.f5850;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f5850.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(r4);
            if (z) {
                if (this.f5848 == null) {
                    C1514 r2 = new C1514(getContext(), (AttributeSet) null, R.attr.f148192130968585);
                    r2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    r2.setLayoutParams(layoutParams2);
                    addView(r2);
                    this.f5848 = r2;
                }
                this.f5848.setText(r4);
                this.f5848.setVisibility(0);
            } else {
                TextView textView2 = this.f5848;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f5848.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f5850;
            if (imageView3 != null) {
                imageView3.setContentDescription(r0.m1650());
            }
            if (!z) {
                charSequence = r0.m1650();
            }
            C2110.m11263(this, charSequence);
        }
    }

    /* renamed from: o.ǃі$ɩ  reason: contains not printable characters */
    class C0927 extends BaseAdapter {
        public final long getItemId(int i) {
            return (long) i;
        }

        C0927() {
        }

        public final int getCount() {
            return C0925.this.f5840.getChildCount();
        }

        public final Object getItem(int i) {
            return ((C0926) C0925.this.f5840.getChildAt(i)).f5852;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0925 r3 = C0925.this;
                C0926 r4 = new C0926(r3.getContext(), (C3282auX.C0120) getItem(i));
                r4.setBackgroundDrawable((Drawable) null);
                r4.setLayoutParams(new AbsListView.LayoutParams(-1, r3.f5836));
                return r4;
            }
            C0926 r42 = (C0926) view;
            r42.f5852 = (C3282auX.C0120) getItem(i);
            r42.m6762();
            return view;
        }
    }

    /* renamed from: o.ǃі$if  reason: invalid class name */
    public class Cif extends AnimatorListenerAdapter {

        /* renamed from: ɩ  reason: contains not printable characters */
        private boolean f5847 = false;

        protected Cif() {
        }

        public final void onAnimationStart(Animator animator) {
            C0925.this.setVisibility(0);
            this.f5847 = false;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f5847) {
                C0925.this.setVisibility(0);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.f5847 = true;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m6761() {
        Spinner spinner = this.f5843;
        if (!(spinner != null && spinner.getParent() == this)) {
            return false;
        }
        removeView(this.f5843);
        addView(this.f5840, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f5843.getSelectedItemPosition());
        return false;
    }
}
