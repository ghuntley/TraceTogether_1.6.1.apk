package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import o.C2745;

/* renamed from: o.ԧ  reason: contains not printable characters */
public class C2999 implements C2257, Runnable, AdapterView.OnItemSelectedListener, AbsListView.OnScrollListener, View.OnTouchListener {

    /* renamed from: Ι  reason: contains not printable characters */
    private static Method f13812;

    /* renamed from: ι  reason: contains not printable characters */
    private static Method f13813;

    /* renamed from: І  reason: contains not printable characters */
    private static Method f13814;

    /* renamed from: ı  reason: contains not printable characters */
    final If f13815;

    /* renamed from: ŀ  reason: contains not printable characters */
    private boolean f13816;

    /* renamed from: ł  reason: contains not printable characters */
    private int f13817;

    /* renamed from: ſ  reason: contains not printable characters */
    private View f13818;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public PopupWindow f13819;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private DataSetObserver f13820;

    /* renamed from: ƚ  reason: contains not printable characters */
    private boolean f13821;

    /* renamed from: ǀ  reason: contains not printable characters */
    private AdapterView.OnItemSelectedListener f13822;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f13823;

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f13824;

    /* renamed from: ɍ  reason: contains not printable characters */
    private boolean f13825;

    /* renamed from: ɔ  reason: contains not printable characters */
    private final C2999 f13826;

    /* renamed from: ɟ  reason: contains not printable characters */
    private Drawable f13827;

    /* renamed from: ɨ  reason: contains not printable characters */
    private int f13828;

    /* renamed from: ɩ  reason: contains not printable characters */
    C2688 f13829;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f13830;

    /* renamed from: ɹ  reason: contains not printable characters */
    private ListAdapter f13831;

    /* renamed from: ɺ  reason: contains not printable characters */
    private AdapterView.OnItemClickListener f13832;

    /* renamed from: ɼ  reason: contains not printable characters */
    private View f13833;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f13834;

    /* renamed from: ɿ  reason: contains not printable characters */
    private boolean f13835;

    /* renamed from: ʅ  reason: contains not printable characters */
    private int f13836;

    /* renamed from: ʟ  reason: contains not printable characters */
    private boolean f13837;

    /* renamed from: ͻ  reason: contains not printable characters */
    private final C3000 f13838;

    /* renamed from: ϲ  reason: contains not printable characters */
    private final C2999 f13839;

    /* renamed from: ϳ  reason: contains not printable characters */
    private final Rect f13840;

    /* renamed from: Ј  reason: contains not printable characters */
    private Rect f13841;

    /* renamed from: г  reason: contains not printable characters */
    private boolean f13842;

    /* renamed from: с  reason: contains not printable characters */
    private Runnable f13843;

    /* renamed from: т  reason: contains not printable characters */
    private boolean f13844;

    /* renamed from: і  reason: contains not printable characters */
    private Context f13845;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final Handler f13846;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f13847;

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f13812 = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                f13814 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f13813 = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C2999(Context context) {
        this(context, (AttributeSet) null, R.attr.f153072130969101);
    }

    public C2999(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f153072130969101);
    }

    public C2999(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C2999(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f13830 = -2;
        this.f13834 = -2;
        this.f13828 = 1002;
        this.f13842 = true;
        this.f13817 = 0;
        this.f13825 = false;
        this.f13821 = false;
        this.f13823 = Integer.MAX_VALUE;
        this.f13836 = 0;
        this.f13815 = new If();
        this.f13826 = this;
        this.f13839 = this;
        this.f13838 = new C3000();
        this.f13840 = new Rect();
        this.f13845 = context;
        this.f13846 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2745.aux.f12970, i, i2);
        this.f13824 = obtainStyledAttributes.getDimensionPixelOffset(C2745.aux.f12981, 0);
        this.f13847 = obtainStyledAttributes.getDimensionPixelOffset(C2745.aux.f12973, 0);
        if (this.f13847 != 0) {
            this.f13837 = true;
        }
        obtainStyledAttributes.recycle();
        this.f13819 = new C0483(context, attributeSet, i, i2);
        this.f13819.setInputMethodMode(1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m15357(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f13820;
        if (dataSetObserver == null) {
            this.f13820 = new Cif();
        } else {
            ListAdapter listAdapter2 = this.f13831;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f13831 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f13820);
        }
        C2688 r3 = this.f13829;
        if (r3 != null) {
            r3.setAdapter(this.f13831);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m15367(int i) {
        this.f13836 = i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m15380(boolean z) {
        this.f13844 = z;
        this.f13819.setFocusable(z);
    }

    /* renamed from: І  reason: contains not printable characters */
    public boolean m15382() {
        return this.f13844;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public Drawable m15377() {
        return this.f13819.getBackground();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m15368(Drawable drawable) {
        this.f13819.setBackgroundDrawable(drawable);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m15378(int i) {
        this.f13819.setAnimationStyle(i);
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public View m15387() {
        return this.f13833;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m15369(View view) {
        this.f13833 = view;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public int m15361() {
        return this.f13824;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m15363(int i) {
        this.f13824 = i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public int m15355() {
        if (!this.f13837) {
            return 0;
        }
        return this.f13847;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m15374(int i) {
        this.f13847 = i;
        this.f13837 = true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m15375(Rect rect) {
        this.f13841 = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public void m15362(int i) {
        this.f13817 = i;
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public int m15366() {
        return this.f13834;
    }

    /* renamed from: І  reason: contains not printable characters */
    public void m15381(int i) {
        this.f13834 = i;
    }

    /* renamed from: і  reason: contains not printable characters */
    public void m15385(int i) {
        Drawable background = this.f13819.getBackground();
        if (background != null) {
            background.getPadding(this.f13840);
            this.f13834 = this.f13840.left + this.f13840.right + i;
            return;
        }
        m15381(i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m15379(AdapterView.OnItemClickListener onItemClickListener) {
        this.f13832 = onItemClickListener;
    }

    public void b_() {
        int r0 = m15354();
        boolean r1 = m15372();
        C0887.m6601(this.f13819, this.f13828);
        boolean z = true;
        if (!this.f13819.isShowing()) {
            int i = this.f13834;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = m15387().getWidth();
            }
            int i2 = this.f13830;
            if (i2 == -1) {
                r0 = -1;
            } else if (i2 != -2) {
                r0 = i2;
            }
            this.f13819.setWidth(i);
            this.f13819.setHeight(r0);
            m15353(true);
            this.f13819.setOutsideTouchable(!this.f13821 && !this.f13825);
            this.f13819.setTouchInterceptor(this.f13826);
            if (this.f13835) {
                C0887.m6600(this.f13819, this.f13816);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f13814;
                if (method != null) {
                    try {
                        method.invoke(this.f13819, new Object[]{this.f13841});
                    } catch (Exception unused) {
                    }
                }
            } else {
                this.f13819.setEpicenterBounds(this.f13841);
            }
            C0887.m6599(this.f13819, m15387(), this.f13824, this.f13847, this.f13817);
            this.f13829.setSelection(-1);
            if (!this.f13844 || this.f13829.isInTouchMode()) {
                m15370();
            }
            if (!this.f13844) {
                this.f13846.post(this.f13838);
            }
        } else if (C0293.m4187(m15387())) {
            int i3 = this.f13834;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = m15387().getWidth();
            }
            int i4 = this.f13830;
            if (i4 == -1) {
                if (!r1) {
                    r0 = -1;
                }
                if (r1) {
                    this.f13819.setWidth(this.f13834 == -1 ? -1 : 0);
                    this.f13819.setHeight(0);
                } else {
                    this.f13819.setWidth(this.f13834 == -1 ? -1 : 0);
                    this.f13819.setHeight(-1);
                }
            } else if (i4 != -2) {
                r0 = i4;
            }
            PopupWindow popupWindow = this.f13819;
            if (this.f13821 || this.f13825) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f13819.update(m15387(), this.f13824, this.f13847, i3 < 0 ? -1 : i3, r0 < 0 ? -1 : r0);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m15373() {
        this.f13819.dismiss();
        m15352();
        this.f13819.setContentView((View) null);
        this.f13829 = null;
        this.f13846.removeCallbacks(this.f13815);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m15376(PopupWindow.OnDismissListener onDismissListener) {
        this.f13819.setOnDismissListener(onDismissListener);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m15352() {
        View view = this.f13818;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f13818);
            }
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public void m15371(int i) {
        this.f13819.setInputMethodMode(i);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public void m15386(int i) {
        C2688 r0 = this.f13829;
        if (m15364() && r0 != null) {
            r0.f12412 = false;
            r0.setSelection(i);
            if (r0.getChoiceMode() != 0) {
                r0.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public void m15370() {
        C2688 r0 = this.f13829;
        if (r0 != null) {
            r0.f12412 = true;
            r0.requestLayout();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m15364() {
        return this.f13819.isShowing();
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public boolean m15372() {
        return this.f13819.getInputMethodMode() == 2;
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public Object m15365() {
        if (!m15364()) {
            return null;
        }
        return this.f13829.getSelectedItem();
    }

    /* renamed from: г  reason: contains not printable characters */
    public int m15383() {
        if (!m15364()) {
            return -1;
        }
        return this.f13829.getSelectedItemPosition();
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    public long m15359() {
        if (!m15364()) {
            return Long.MIN_VALUE;
        }
        return this.f13829.getSelectedItemId();
    }

    /* renamed from: ł  reason: contains not printable characters */
    public View m15360() {
        if (!m15364()) {
            return null;
        }
        return this.f13829.getSelectedView();
    }

    /* renamed from: і  reason: contains not printable characters */
    public ListView m15384() {
        return this.f13829;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public C2688 m15356(Context context, boolean z) {
        return new C2688(context, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: o.ғ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: o.ғ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: o.ғ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ӏ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m15354() {
        /*
            r12 = this;
            o.ғ r0 = r12.f13829
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x009e
            android.content.Context r0 = r12.f13845
            r12.f13843 = r12
            boolean r5 = r12.f13844
            r5 = r5 ^ r3
            o.ғ r5 = r12.m15356(r0, r5)
            r12.f13829 = r5
            android.graphics.drawable.Drawable r5 = r12.f13827
            if (r5 == 0) goto L_0x001f
            o.ғ r6 = r12.f13829
            r6.setSelector(r5)
        L_0x001f:
            o.ғ r5 = r12.f13829
            android.widget.ListAdapter r6 = r12.f13831
            r5.setAdapter(r6)
            o.ғ r5 = r12.f13829
            android.widget.AdapterView$OnItemClickListener r6 = r12.f13832
            r5.setOnItemClickListener(r6)
            o.ғ r5 = r12.f13829
            r5.setFocusable(r3)
            o.ғ r5 = r12.f13829
            r5.setFocusableInTouchMode(r3)
            o.ғ r5 = r12.f13829
            r5.setOnItemSelectedListener(r12)
            o.ғ r5 = r12.f13829
            o.ԧ r6 = r12.f13839
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f13822
            if (r5 == 0) goto L_0x004c
            o.ғ r6 = r12.f13829
            r6.setOnItemSelectedListener(r5)
        L_0x004c:
            o.ғ r5 = r12.f13829
            android.view.View r6 = r12.f13818
            if (r6 == 0) goto L_0x0097
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f13836
            if (r8 == 0) goto L_0x006f
            if (r8 == r3) goto L_0x0068
            goto L_0x0075
        L_0x0068:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0075
        L_0x006f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0075:
            int r0 = r12.f13834
            if (r0 < 0) goto L_0x007c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x007e
        L_0x007c:
            r0 = 0
            r5 = 0
        L_0x007e:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r0 = r0 + r5
            r5 = r7
            goto L_0x0098
        L_0x0097:
            r0 = 0
        L_0x0098:
            android.widget.PopupWindow r6 = r12.f13819
            r6.setContentView(r5)
            goto L_0x00b9
        L_0x009e:
            android.widget.PopupWindow r0 = r12.f13819
            r0.getContentView()
            android.view.View r0 = r12.f13818
            if (r0 == 0) goto L_0x00b8
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            android.widget.PopupWindow r5 = r12.f13819
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00db
            android.graphics.Rect r6 = r12.f13840
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f13840
            int r5 = r5.top
            android.graphics.Rect r6 = r12.f13840
            int r6 = r6.bottom
            int r5 = r5 + r6
            boolean r6 = r12.f13837
            if (r6 != 0) goto L_0x00e1
            android.graphics.Rect r6 = r12.f13840
            int r6 = r6.top
            int r6 = -r6
            r12.f13847 = r6
            goto L_0x00e1
        L_0x00db:
            android.graphics.Rect r5 = r12.f13840
            r5.setEmpty()
            r5 = 0
        L_0x00e1:
            android.widget.PopupWindow r6 = r12.f13819
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            r3 = 0
        L_0x00ec:
            android.view.View r4 = r12.m15387()
            int r6 = r12.f13847
            int r3 = r12.m15351(r4, r6, r3)
            boolean r4 = r12.f13825
            if (r4 != 0) goto L_0x0162
            int r4 = r12.f13830
            if (r4 != r2) goto L_0x00ff
            goto L_0x0162
        L_0x00ff:
            int r4 = r12.f13834
            r6 = -2
            if (r4 == r6) goto L_0x0129
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x010e
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L_0x010c:
            r7 = r1
            goto L_0x0144
        L_0x010e:
            android.content.Context r2 = r12.f13845
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f13840
            int r4 = r4.left
            android.graphics.Rect r6 = r12.f13840
            int r6 = r6.right
            int r4 = r4 + r6
            int r2 = r2 - r4
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x010c
        L_0x0129:
            android.content.Context r2 = r12.f13845
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f13840
            int r4 = r4.left
            android.graphics.Rect r6 = r12.f13840
            int r6 = r6.right
            int r4 = r4 + r6
            int r2 = r2 - r4
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x010c
        L_0x0144:
            o.ғ r6 = r12.f13829
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.m14292(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0160
            o.ғ r2 = r12.f13829
            int r2 = r2.getPaddingTop()
            o.ғ r3 = r12.f13829
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0160:
            int r1 = r1 + r0
            return r1
        L_0x0162:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2999.m15354():int");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m15358(boolean z) {
        this.f13835 = true;
        this.f13816 = z;
    }

    /* renamed from: o.ԧ$if  reason: invalid class name */
    class Cif extends DataSetObserver {
        Cif() {
        }

        public final void onChanged() {
            if (C2999.this.m15364()) {
                C2999.this.b_();
            }
        }

        public final void onInvalidated() {
            C2999.this.m15373();
        }
    }

    /* renamed from: o.ԧ$ǃ  reason: contains not printable characters */
    class C3000 implements Runnable {
        C3000() {
        }

        public final void run() {
            C2999.this.m15370();
        }
    }

    /* renamed from: o.ԧ$If */
    class If implements Runnable {
        If() {
        }

        public final void run() {
            if (C2999.this.f13829 != null && C0293.m4187(C2999.this.f13829) && C2999.this.f13829.getCount() > C2999.this.f13829.getChildCount() && C2999.this.f13829.getChildCount() <= C2999.this.f13823) {
                C2999.this.f13819.setInputMethodMode(2);
                C2999.this.b_();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m15353(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f13812;
            if (method != null) {
                try {
                    method.invoke(this.f13819, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        } else {
            this.f13819.setIsClippedToScreen(z);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private int m15351(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.f13819.getMaxAvailableHeight(view, i, z);
        }
        Method method = f13813;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f13819, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
            }
        }
        return this.f13819.getMaxAvailableHeight(view, i);
    }

    public void run() {
        View r0 = m15387();
        if (r0 != null && r0.getWindowToken() != null) {
            b_();
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C2688 r1;
        if (i != -1 && (r1 = this.f13829) != null) {
            r1.f12412 = false;
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !m15372() && this.f13819.getContentView() != null) {
            this.f13846.removeCallbacks(this.f13815);
            this.f13815.run();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && (popupWindow = this.f13819) != null && popupWindow.isShowing() && x >= 0 && x < this.f13819.getWidth() && y >= 0 && y < this.f13819.getHeight()) {
            this.f13846.postDelayed(this.f13815, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            this.f13846.removeCallbacks(this.f13815);
            return false;
        }
    }
}
