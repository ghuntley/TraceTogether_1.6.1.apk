package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import o.C0638;

/* renamed from: o.ɩı  reason: contains not printable characters */
public class C1231 extends Spinner implements C0291 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final int[] f6984 = {16843505};

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C0381 f6985;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Rect f6986;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f6987;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final boolean f6988;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1044 f6989;

    /* renamed from: ι  reason: contains not printable characters */
    private final Context f6990;

    /* renamed from: І  reason: contains not printable characters */
    private C1234 f6991;

    /* renamed from: і  reason: contains not printable characters */
    private SpinnerAdapter f6992;

    /* renamed from: o.ɩı$ɩ  reason: contains not printable characters */
    interface C1234 {
        /* renamed from: ı  reason: contains not printable characters */
        int m7971();

        /* renamed from: ı  reason: contains not printable characters */
        void m7972(int i);

        /* renamed from: ı  reason: contains not printable characters */
        void m7973(ListAdapter listAdapter);

        /* renamed from: Ɩ  reason: contains not printable characters */
        int m7974();

        /* renamed from: ǃ  reason: contains not printable characters */
        void m7975(int i);

        /* renamed from: ǃ  reason: contains not printable characters */
        void m7976(int i, int i2);

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean m7977();

        /* renamed from: ɩ  reason: contains not printable characters */
        CharSequence m7978();

        /* renamed from: ɩ  reason: contains not printable characters */
        void m7979(Drawable drawable);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m7980(CharSequence charSequence);

        /* renamed from: Ι  reason: contains not printable characters */
        void m7981();

        /* renamed from: Ι  reason: contains not printable characters */
        void m7982(int i);

        /* renamed from: ι  reason: contains not printable characters */
        Drawable m7983();
    }

    public /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((SpinnerAdapter) adapter);
    }

    public C1231(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1231(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f154302130969248);
    }

    public C1231(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C1231(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r13 != null) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1231(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f6986 = r0
            int[] r0 = o.C2745.aux.f12784
            o.ιɩ r1 = new o.ιɩ
            r2 = 0
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0, r11, r2)
            r1.<init>(r9, r0)
            o.ɉ r0 = new o.ɉ
            r0.<init>(r8)
            r8.f6989 = r0
            if (r13 == 0) goto L_0x0027
            o.ł r0 = new o.ł
            r0.<init>((android.content.Context) r9, (android.content.res.Resources.Theme) r13)
            r8.f6990 = r0
            goto L_0x003c
        L_0x0027:
            int r13 = o.C2745.aux.f12791
            android.content.res.TypedArray r13 = r1.f9934
            r0 = 4
            int r13 = r13.getResourceId(r0, r2)
            if (r13 == 0) goto L_0x003a
            o.ł r0 = new o.ł
            r0.<init>((android.content.Context) r9, (int) r13)
            r8.f6990 = r0
            goto L_0x003c
        L_0x003a:
            r8.f6990 = r9
        L_0x003c:
            r13 = -1
            r0 = 0
            if (r12 != r13) goto L_0x0064
            int[] r13 = f6984     // Catch:{ Exception -> 0x0060, all -> 0x0058 }
            android.content.res.TypedArray r13 = r9.obtainStyledAttributes(r10, r13, r11, r2)     // Catch:{ Exception -> 0x0060, all -> 0x0058 }
            boolean r3 = r13.hasValue(r2)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            if (r3 == 0) goto L_0x0050
            int r12 = r13.getInt(r2, r2)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
        L_0x0050:
            r13.recycle()
            goto L_0x0064
        L_0x0054:
            r9 = move-exception
            goto L_0x005a
        L_0x0056:
            goto L_0x0061
        L_0x0058:
            r9 = move-exception
            r13 = r0
        L_0x005a:
            if (r13 == 0) goto L_0x005f
            r13.recycle()
        L_0x005f:
            throw r9
        L_0x0060:
            r13 = r0
        L_0x0061:
            if (r13 == 0) goto L_0x0064
            goto L_0x0050
        L_0x0064:
            r13 = 2
            r3 = 1
            if (r12 == 0) goto L_0x00ae
            if (r12 == r3) goto L_0x006b
            goto L_0x00c2
        L_0x006b:
            o.ɩı$if r12 = new o.ɩı$if
            android.content.Context r4 = r8.f6990
            r12.<init>(r4, r10, r11)
            android.content.Context r4 = r8.f6990
            int[] r5 = o.C2745.aux.f12784
            o.ιɩ r6 = new o.ιɩ
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r10, r5, r11, r2)
            r6.<init>(r4, r5)
            int r4 = o.C2745.aux.f12785
            android.content.res.TypedArray r4 = r6.f9934
            r5 = 3
            r7 = -2
            int r4 = r4.getLayoutDimension(r5, r7)
            r8.f6987 = r4
            int r4 = o.C2745.aux.f12790
            android.graphics.drawable.Drawable r4 = r6.m10793(r4)
            r12.m15368((android.graphics.drawable.Drawable) r4)
            int r4 = o.C2745.aux.f12787
            android.content.res.TypedArray r4 = r1.f9934
            java.lang.String r13 = r4.getString(r13)
            r12.m7955((java.lang.CharSequence) r13)
            android.content.res.TypedArray r13 = r6.f9934
            r13.recycle()
            r8.f6991 = r12
            o.ɩı$2 r13 = new o.ɩı$2
            r13.<init>(r8, r12)
            r8.f6985 = r13
            goto L_0x00c2
        L_0x00ae:
            o.ɩı$ı r12 = new o.ɩı$ı
            r12.<init>()
            r8.f6991 = r12
            o.ɩı$ɩ r12 = r8.f6991
            int r4 = o.C2745.aux.f12787
            android.content.res.TypedArray r4 = r1.f9934
            java.lang.String r13 = r4.getString(r13)
            r12.m7980((java.lang.CharSequence) r13)
        L_0x00c2:
            int r12 = o.C2745.aux.f13022
            android.content.res.TypedArray r12 = r1.f9934
            java.lang.CharSequence[] r12 = r12.getTextArray(r2)
            if (r12 == 0) goto L_0x00dd
            android.widget.ArrayAdapter r13 = new android.widget.ArrayAdapter
            r2 = 17367048(0x1090008, float:2.5162948E-38)
            r13.<init>(r9, r2, r12)
            r9 = 2131558528(0x7f0d0080, float:1.8742374E38)
            r13.setDropDownViewResource(r9)
            r8.setAdapter(r13)
        L_0x00dd:
            android.content.res.TypedArray r9 = r1.f9934
            r9.recycle()
            r8.f6988 = r3
            android.widget.SpinnerAdapter r9 = r8.f6992
            if (r9 == 0) goto L_0x00ed
            r8.setAdapter(r9)
            r8.f6992 = r0
        L_0x00ed:
            o.ɉ r9 = r8.f6989
            r9.m7293(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1231.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public Context getPopupContext() {
        return this.f6990;
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C1234 r0 = this.f6991;
        if (r0 != null) {
            r0.m7979(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C3257Con.m1345(getPopupContext(), i));
    }

    public Drawable getPopupBackground() {
        C1234 r0 = this.f6991;
        if (r0 != null) {
            return r0.m7983();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public void setDropDownVerticalOffset(int i) {
        C1234 r0 = this.f6991;
        if (r0 != null) {
            r0.m7982(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public int getDropDownVerticalOffset() {
        C1234 r0 = this.f6991;
        if (r0 != null) {
            return r0.m7971();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public void setDropDownHorizontalOffset(int i) {
        C1234 r0 = this.f6991;
        if (r0 != null) {
            r0.m7972(i);
            this.f6991.m7975(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public int getDropDownHorizontalOffset() {
        C1234 r0 = this.f6991;
        if (r0 != null) {
            return r0.m7974();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public void setDropDownWidth(int i) {
        if (this.f6991 != null) {
            this.f6987 = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public int getDropDownWidth() {
        if (this.f6991 != null) {
            return this.f6987;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f6988) {
            this.f6992 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f6991 != null) {
            Context context = this.f6990;
            if (context == null) {
                context = getContext();
            }
            this.f6991.m7973((ListAdapter) new C1233(spinnerAdapter, context.getTheme()));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1234 r0 = this.f6991;
        if (r0 != null && r0.m7977()) {
            this.f6991.m7981();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0381 r0 = this.f6985;
        if (r0 == null || !r0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6991 != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m7943(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        C1234 r0 = this.f6991;
        if (r0 == null) {
            return super.performClick();
        }
        if (r0.m7977()) {
            return true;
        }
        m7942();
        return true;
    }

    public void setPrompt(CharSequence charSequence) {
        C1234 r0 = this.f6991;
        if (r0 != null) {
            r0.m7980(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public CharSequence getPrompt() {
        C1234 r0 = this.f6991;
        return r0 != null ? r0.m7978() : super.getPrompt();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1044 r0 = this.f6989;
        if (r0 != null) {
            r0.m7294(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1044 r0 = this.f6989;
        if (r0 != null) {
            r0.m7297(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1044 r0 = this.f6989;
        if (r0 != null) {
            r0.m7291(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1044 r0 = this.f6989;
        if (r0 != null) {
            return r0.m7289();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1044 r0 = this.f6989;
        if (r0 != null) {
            r0.m7292(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1044 r0 = this.f6989;
        if (r0 != null) {
            return r0.m7295();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1044 r0 = this.f6989;
        if (r0 != null) {
            r0.m7296();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public int m7943(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f6986);
        return i2 + this.f6986.left + this.f6986.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1234 m7944() {
        return this.f6991;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m7942() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f6991.m7976(getTextDirection(), getTextAlignment());
        } else {
            this.f6991.m7976(-1, -1);
        }
    }

    public Parcelable onSaveInstanceState() {
        If ifR = new If(super.onSaveInstanceState());
        C1234 r1 = this.f6991;
        ifR.f6996 = r1 != null && r1.m7977();
        return ifR;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        If ifR = (If) parcelable;
        super.onRestoreInstanceState(ifR.getSuperState());
        if (ifR.f6996 && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    if (!C1231.this.m7944().m7977()) {
                        C1231.this.m7942();
                    }
                    ViewTreeObserver viewTreeObserver = C1231.this.getViewTreeObserver();
                    if (viewTreeObserver == null) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 16) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
            });
        }
    }

    /* renamed from: o.ɩı$If */
    static class If extends View.BaseSavedState {
        public static final Parcelable.Creator<If> CREATOR = new Parcelable.Creator<If>() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final If createFromParcel(Parcel parcel) {
                return new If(parcel);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final If[] newArray(int i) {
                return new If[i];
            }
        };

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean f6996;

        If(Parcelable parcelable) {
            super(parcelable);
        }

        If(Parcel parcel) {
            super(parcel);
            this.f6996 = parcel.readByte() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f6996 ? (byte) 1 : 0);
        }
    }

    /* renamed from: o.ɩı$ǃ  reason: contains not printable characters */
    static class C1233 implements ListAdapter, SpinnerAdapter {

        /* renamed from: ǃ  reason: contains not printable characters */
        private SpinnerAdapter f7011;

        /* renamed from: Ι  reason: contains not printable characters */
        private ListAdapter f7012;

        public int getItemViewType(int i) {
            return 0;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public C1233(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f7011 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f7012 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f7011;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f7011;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f7011;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f7011;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f7011;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f7011;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f7011;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f7012;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f7012;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    /* renamed from: o.ɩı$ı  reason: contains not printable characters */
    class C1232 implements C1234, DialogInterface.OnClickListener {

        /* renamed from: ı  reason: contains not printable characters */
        private ListAdapter f7007;

        /* renamed from: ɩ  reason: contains not printable characters */
        private CharSequence f7008;

        /* renamed from: ι  reason: contains not printable characters */
        C0638 f7010;

        /* renamed from: ı  reason: contains not printable characters */
        public int m7958() {
            return 0;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m7959(int i) {
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public int m7961() {
            return 0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m7962(int i) {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m7966(Drawable drawable) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m7969(int i) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public Drawable m7970() {
            return null;
        }

        C1232() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m7968() {
            C0638 r0 = this.f7010;
            if (r0 != null) {
                r0.dismiss();
                this.f7010 = null;
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m7964() {
            C0638 r0 = this.f7010;
            if (r0 != null) {
                return r0.isShowing();
            }
            return false;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m7960(ListAdapter listAdapter) {
            this.f7007 = listAdapter;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m7967(CharSequence charSequence) {
            this.f7008 = charSequence;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public CharSequence m7965() {
            return this.f7008;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m7963(int i, int i2) {
            if (this.f7007 != null) {
                C0638.Cif ifVar = new C0638.Cif(C1231.this.getPopupContext());
                CharSequence charSequence = this.f7008;
                if (charSequence != null) {
                    ifVar.f4628.f1167 = charSequence;
                }
                ListAdapter listAdapter = this.f7007;
                int selectedItemPosition = C1231.this.getSelectedItemPosition();
                ifVar.f4628.f1176 = listAdapter;
                ifVar.f4628.f1182 = this;
                ifVar.f4628.f1168 = selectedItemPosition;
                ifVar.f4628.f1174 = true;
                this.f7010 = ifVar.m5399();
                ListView listView = this.f7010.f4626.f1125;
                if (Build.VERSION.SDK_INT >= 17) {
                    listView.setTextDirection(i);
                    listView.setTextAlignment(i2);
                }
                this.f7010.show();
            }
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C1231.this.setSelection(i);
            if (C1231.this.getOnItemClickListener() != null) {
                C1231.this.performItemClick((View) null, i, this.f7007.getItemId(i));
            }
            m7968();
        }
    }

    /* renamed from: o.ɩı$if  reason: invalid class name */
    class Cif extends C2999 implements C1234 {

        /* renamed from: ɹ  reason: contains not printable characters */
        private int f6997;

        /* renamed from: Ι  reason: contains not printable characters */
        ListAdapter f6998;

        /* renamed from: І  reason: contains not printable characters */
        private CharSequence f7000;

        /* renamed from: і  reason: contains not printable characters */
        private final Rect f7001 = new Rect();

        public Cif(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            m15369((View) C1231.this);
            m15380(true);
            m15367(0);
            m15379((AdapterView.OnItemClickListener) new AdapterView.OnItemClickListener(C1231.this) {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    C1231.this.setSelection(i);
                    if (C1231.this.getOnItemClickListener() != null) {
                        C1231.this.performItemClick(view, i, Cif.this.f6998.getItemId(i));
                    }
                    Cif.this.m15373();
                }
            });
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m7951(ListAdapter listAdapter) {
            super.m15357(listAdapter);
            this.f6998 = listAdapter;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public CharSequence m7954() {
            return this.f7000;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m7955(CharSequence charSequence) {
            this.f7000 = charSequence;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɹ  reason: contains not printable characters */
        public void m7956() {
            int i;
            Drawable r0 = m15377();
            int i2 = 0;
            if (r0 != null) {
                r0.getPadding(C1231.this.f6986);
                i2 = C2373.m12363(C1231.this) ? C1231.this.f6986.right : -C1231.this.f6986.left;
            } else {
                Rect rect = C1231.this.f6986;
                C1231.this.f6986.right = 0;
                rect.left = 0;
            }
            int paddingLeft = C1231.this.getPaddingLeft();
            int paddingRight = C1231.this.getPaddingRight();
            int width = C1231.this.getWidth();
            if (C1231.this.f6987 == -2) {
                int r4 = C1231.this.m7943((SpinnerAdapter) this.f6998, m15377());
                int i3 = (C1231.this.getContext().getResources().getDisplayMetrics().widthPixels - C1231.this.f6986.left) - C1231.this.f6986.right;
                if (r4 > i3) {
                    r4 = i3;
                }
                m15385(Math.max(r4, (width - paddingLeft) - paddingRight));
            } else if (C1231.this.f6987 == -1) {
                m15385((width - paddingLeft) - paddingRight);
            } else {
                m15385(C1231.this.f6987);
            }
            if (C2373.m12363(C1231.this)) {
                i = i2 + (((width - paddingRight) - m15366()) - m7957());
            } else {
                i = i2 + paddingLeft + m7957();
            }
            m15363(i);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m7952(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean r0 = m15364();
            m7956();
            m15371(2);
            super.b_();
            ListView r1 = m15384();
            r1.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                r1.setTextDirection(i);
                r1.setTextAlignment(i2);
            }
            m15386(C1231.this.getSelectedItemPosition());
            if (!r0 && (viewTreeObserver = C1231.this.getViewTreeObserver()) != null) {
                final AnonymousClass3 r6 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        Cif ifVar = Cif.this;
                        if (!ifVar.m7953(C1231.this)) {
                            Cif.this.m15373();
                            return;
                        }
                        Cif.this.m7956();
                        Cif.super.b_();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r6);
                m15376((PopupWindow.OnDismissListener) new PopupWindow.OnDismissListener() {
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver = C1231.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(r6);
                        }
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m7953(View view) {
            return C0293.m4187(view) && view.getGlobalVisibleRect(this.f7001);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m7950(int i) {
            this.f6997 = i;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public int m7957() {
            return this.f6997;
        }
    }
}
