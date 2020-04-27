package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import o.C0284;
import o.C2745;

/* renamed from: o.Ɉ  reason: contains not printable characters */
public final class C1029 extends ViewGroup implements ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {

    /* renamed from: ı  reason: contains not printable characters */
    final FrameLayout f6251;

    /* renamed from: Ɩ  reason: contains not printable characters */
    boolean f6252;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Drawable f6253;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final int f6254;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final ImageView f6255;

    /* renamed from: ɩ  reason: contains not printable characters */
    final C1030 f6256;

    /* renamed from: ɪ  reason: contains not printable characters */
    private C2438 f6257;

    /* renamed from: ɹ  reason: contains not printable characters */
    final DataSetObserver f6258;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final C1029 f6259;

    /* renamed from: ɿ  reason: contains not printable characters */
    private PopupWindow.OnDismissListener f6260;

    /* renamed from: ʟ  reason: contains not printable characters */
    private C2999 f6261;

    /* renamed from: Ι  reason: contains not printable characters */
    final FrameLayout f6262;

    /* renamed from: ι  reason: contains not printable characters */
    final View f6263;

    /* renamed from: І  reason: contains not printable characters */
    final ImageView f6264;

    /* renamed from: г  reason: contains not printable characters */
    private final ViewTreeObserver.OnGlobalLayoutListener f6265;

    /* renamed from: і  reason: contains not printable characters */
    boolean f6266;

    /* renamed from: Ӏ  reason: contains not printable characters */
    int f6267;

    /* renamed from: ӏ  reason: contains not printable characters */
    int f6268;

    public C1029(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1029(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1029(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6258 = new DataSetObserver() {
            public final void onChanged() {
                super.onChanged();
                C1029.this.f6256.notifyDataSetChanged();
            }

            public final void onInvalidated() {
                super.onInvalidated();
                C1029.this.f6256.notifyDataSetInvalidated();
            }
        };
        this.f6265 = this;
        this.f6267 = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2745.aux.f12880, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C2745.aux.f12880, attributeSet, obtainStyledAttributes, i, 0);
        }
        this.f6267 = obtainStyledAttributes.getInt(C2745.aux.f12949, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C2745.aux.f12950);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.f168652131558406, this, true);
        this.f6259 = this;
        this.f6263 = findViewById(R.id.f164412131361918);
        this.f6253 = this.f6263.getBackground();
        this.f6262 = (FrameLayout) findViewById(R.id.f165032131362009);
        this.f6262.setOnClickListener(this.f6259);
        this.f6262.setOnLongClickListener(this.f6259);
        this.f6264 = (ImageView) this.f6262.findViewById(R.id.f165422131362087);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.f165182131362043);
        frameLayout.setOnClickListener(this.f6259);
        frameLayout.setAccessibilityDelegate(new View.AccessibilityDelegate() {
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                C0520.m4998(accessibilityNodeInfo).m5025(true);
            }
        });
        frameLayout.setOnTouchListener(new C0381(frameLayout) {
            /* renamed from: Ι  reason: contains not printable characters */
            public final C2257 m7275() {
                return C1029.this.m7272();
            }

            /* access modifiers changed from: protected */
            /* renamed from: ι  reason: contains not printable characters */
            public final boolean m7276() {
                C1029 r0 = C1029.this;
                if (r0.m7272().m15364() || !r0.f6252) {
                    return true;
                }
                r0.f6266 = false;
                r0.m7273(r0.f6267);
                return true;
            }

            /* access modifiers changed from: protected */
            /* renamed from: ɩ  reason: contains not printable characters */
            public final boolean m7274() {
                C1029.this.m7271();
                return true;
            }
        });
        this.f6251 = frameLayout;
        this.f6255 = (ImageView) frameLayout.findViewById(R.id.f165422131362087);
        this.f6255.setImageDrawable(drawable);
        this.f6256 = new C1030();
        this.f6256.registerDataSetObserver(new DataSetObserver() {
            public final void onChanged() {
                super.onChanged();
                C1029 r0 = C1029.this;
                if (r0.f6256.getCount() > 0) {
                    r0.f6251.setEnabled(true);
                } else {
                    r0.f6251.setEnabled(false);
                }
                int r1 = r0.f6256.f6276.m4137();
                int r4 = r0.f6256.f6276.m4141();
                if (r1 == 1 || (r1 > 1 && r4 > 0)) {
                    r0.f6262.setVisibility(0);
                    ResolveInfo r12 = r0.f6256.f6276.m4143();
                    PackageManager packageManager = r0.getContext().getPackageManager();
                    r0.f6264.setImageDrawable(r12.loadIcon(packageManager));
                    if (r0.f6268 != 0) {
                        CharSequence loadLabel = r12.loadLabel(packageManager);
                        r0.f6262.setContentDescription(r0.getContext().getString(r0.f6268, new Object[]{loadLabel}));
                    }
                } else {
                    r0.f6262.setVisibility(8);
                }
                if (r0.f6262.getVisibility() == 0) {
                    r0.f6263.setBackgroundDrawable(r0.f6253);
                } else {
                    r0.f6263.setBackgroundDrawable((Drawable) null);
                }
            }
        });
        Resources resources = context.getResources();
        this.f6254 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f157682131165207));
    }

    public final void setActivityChooserModel(C0284 r4) {
        C1030 r0 = this.f6256;
        C0284 r1 = C1029.this.f6256.f6276;
        if (r1 != null && C1029.this.isShown()) {
            r1.unregisterObserver(C1029.this.f6258);
        }
        r0.f6276 = r4;
        if (r4 != null && C1029.this.isShown()) {
            r4.registerObserver(C1029.this.f6258);
        }
        r0.notifyDataSetChanged();
        if (m7272().m15364()) {
            m7271();
            if (!m7272().m15364() && this.f6252) {
                this.f6266 = false;
                m7273(this.f6267);
            }
        }
    }

    public final void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f6255.setImageDrawable(drawable);
    }

    public final void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f6255.setContentDescription(getContext().getString(i));
    }

    public final void setProvider(C2438 r1) {
        this.f6257 = r1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m7273(int i) {
        if (this.f6256.f6276 != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f6265);
            boolean z = this.f6262.getVisibility() == 0;
            int r3 = this.f6256.f6276.m4137();
            if (i == Integer.MAX_VALUE || r3 <= i + (z ? 1 : 0)) {
                C1030 r32 = this.f6256;
                if (r32.f6275) {
                    r32.f6275 = false;
                    r32.notifyDataSetChanged();
                }
                C1030 r33 = this.f6256;
                if (r33.f6274 != i) {
                    r33.f6274 = i;
                    r33.notifyDataSetChanged();
                }
            } else {
                C1030 r34 = this.f6256;
                if (!r34.f6275) {
                    r34.f6275 = true;
                    r34.notifyDataSetChanged();
                }
                C1030 r35 = this.f6256;
                int i2 = i - 1;
                if (r35.f6274 != i2) {
                    r35.f6274 = i2;
                    r35.notifyDataSetChanged();
                }
            }
            C2999 r6 = m7272();
            if (!r6.m15364()) {
                if (this.f6266 || !z) {
                    C1030 r36 = this.f6256;
                    if (!(r36.f6273 && r36.f6277 == z)) {
                        r36.f6273 = true;
                        r36.f6277 = z;
                        r36.notifyDataSetChanged();
                    }
                } else {
                    C1030 r0 = this.f6256;
                    if (r0.f6273 || r0.f6277) {
                        r0.f6273 = false;
                        r0.f6277 = false;
                        r0.notifyDataSetChanged();
                    }
                }
                r6.m15385(Math.min(this.f6256.m7277(), this.f6254));
                r6.b_();
                C2438 r02 = this.f6257;
                if (r02 != null) {
                    r02.m12541(true);
                }
                r6.m15384().setContentDescription(getContext().getString(R.string.f170132131886085));
                r6.m15384().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0284 r0 = this.f6256.f6276;
        if (r0 != null) {
            r0.registerObserver(this.f6258);
        }
        this.f6252 = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0284 r0 = this.f6256.f6276;
        if (r0 != null) {
            r0.unregisterObserver(this.f6258);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f6265);
        }
        if (m7272().m15364()) {
            m7271();
        }
        this.f6252 = false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        View view = this.f6263;
        if (this.f6262.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f6263.layout(0, 0, i3 - i, i4 - i2);
        if (!m7272().m15364()) {
            m7271();
        }
    }

    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f6260 = onDismissListener;
    }

    public final void setInitialActivityCount(int i) {
        this.f6267 = i;
    }

    public final void setDefaultActionButtonContentDescription(int i) {
        this.f6268 = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final C2999 m7272() {
        if (this.f6261 == null) {
            this.f6261 = new C2999(getContext());
            this.f6261.m15357((ListAdapter) this.f6256);
            this.f6261.m15369((View) this);
            this.f6261.m15380(true);
            this.f6261.m15379((AdapterView.OnItemClickListener) this.f6259);
            this.f6261.m15376((PopupWindow.OnDismissListener) this.f6259);
        }
        return this.f6261;
    }

    /* renamed from: o.Ɉ$ı  reason: contains not printable characters */
    class C1030 extends BaseAdapter {

        /* renamed from: ı  reason: contains not printable characters */
        boolean f6273;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f6274 = 4;

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean f6275;

        /* renamed from: Ι  reason: contains not printable characters */
        C0284 f6276;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f6277;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getViewTypeCount() {
            return 3;
        }

        C1030() {
        }

        public final int getItemViewType(int i) {
            return (!this.f6275 || i != getCount() - 1) ? 0 : 1;
        }

        public final int getCount() {
            int r0 = this.f6276.m4137();
            if (!this.f6273 && this.f6276.m4143() != null) {
                r0--;
            }
            int min = Math.min(r0, this.f6274);
            return this.f6275 ? min + 1 : min;
        }

        public final Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.f6273 && this.f6276.m4143() != null) {
                    i++;
                }
                return this.f6276.m4138(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != R.id.f165662131362119) {
                    view = LayoutInflater.from(C1029.this.getContext()).inflate(R.layout.f168662131558407, viewGroup, false);
                }
                PackageManager packageManager = C1029.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(R.id.f165412131362083)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(R.id.f167842131362399)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f6273 || i != 0 || !this.f6277) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(C1029.this.getContext()).inflate(R.layout.f168662131558407, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(R.id.f167842131362399)).setText(C1029.this.getContext().getString(R.string.f170122131886084));
                return inflate;
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final int m7277() {
            int i = this.f6274;
            this.f6274 = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, (ViewGroup) null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f6274 = i;
            return i2;
        }
    }

    /* renamed from: o.Ɉ$ɩ  reason: contains not printable characters */
    public static class C1031 extends LinearLayout {

        /* renamed from: ɩ  reason: contains not printable characters */
        private static final int[] f6279 = {16842964};

        public C1031(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C1992 r1 = new C1992(context, context.obtainStyledAttributes(attributeSet, f6279));
            setBackgroundDrawable(r1.m10793(0));
            r1.f9934.recycle();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m7271() {
        if (!m7272().m15364()) {
            return true;
        }
        m7272().m15373();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f6265);
        return true;
    }

    public final void onGlobalLayout() {
        if (!m7272().m15364()) {
            return;
        }
        if (!isShown()) {
            m7272().m15373();
            return;
        }
        m7272().b_();
        C2438 r0 = this.f6257;
        if (r0 != null) {
            r0.m12541(true);
        }
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int itemViewType = ((C1030) adapterView.getAdapter()).getItemViewType(i);
        if (itemViewType == 0) {
            m7271();
            if (!this.f6266) {
                synchronized (this.f6256.f6276.f3532) {
                }
            } else if (i > 0) {
                C0284 r5 = this.f6256.f6276;
                synchronized (r5.f3532) {
                    boolean r9 = r5.m4139() | false;
                    r5.m4140();
                    if (r9) {
                        r5.notifyChanged();
                    }
                    C0284.C0285 r7 = r5.f3531.get(i);
                    if (r5.f3527.add(new C0284.C0286(new ComponentName(r7.f3536.activityInfo.packageName, r7.f3536.activityInfo.name), System.currentTimeMillis(), r5.f3531.get(0) != null ? 5.0f : 1.0f))) {
                        r5.f3533 = true;
                        r5.m4140();
                        if (r5.f3528) {
                            if (r5.f3533) {
                                r5.f3533 = false;
                                if (!TextUtils.isEmpty(r5.f3534)) {
                                    new C0284.If().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(r5.f3527), r5.f3534});
                                }
                            }
                            r5.notifyChanged();
                        } else {
                            throw new IllegalStateException("No preceding call to #readHistoricalData");
                        }
                    }
                }
            }
        } else if (itemViewType == 1) {
            m7273(Integer.MAX_VALUE);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void onClick(View view) {
        if (view == this.f6262) {
            m7271();
            this.f6256.f6276.m4142(this.f6256.f6276.m4143());
            synchronized (this.f6256.f6276.f3532) {
            }
        } else if (view == this.f6251) {
            this.f6266 = false;
            m7273(this.f6267);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final boolean onLongClick(View view) {
        if (view == this.f6262) {
            if (this.f6256.getCount() > 0) {
                this.f6266 = true;
                m7273(this.f6267);
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    public final void onDismiss() {
        PopupWindow.OnDismissListener onDismissListener = this.f6260;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        C2438 r0 = this.f6257;
        if (r0 != null) {
            r0.m12541(false);
        }
    }
}
