package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.C1483;
import o.C2118;
import o.C2328;
import o.C2745;
import o.C3282auX;

/* renamed from: o.ιι  reason: contains not printable characters */
public class C2026 extends ViewGroup {

    /* renamed from: ı  reason: contains not printable characters */
    C2118 f10004;

    /* renamed from: ŀ  reason: contains not printable characters */
    private CharSequence f10005;

    /* renamed from: ł  reason: contains not printable characters */
    private ImageView f10006;

    /* renamed from: ſ  reason: contains not printable characters */
    private Context f10007;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public int f10008;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private int f10009;

    /* renamed from: ƚ  reason: contains not printable characters */
    private int f10010;

    /* renamed from: ǀ  reason: contains not printable characters */
    private C2745.C2747 f10011;

    /* renamed from: ǃ  reason: contains not printable characters */
    ImageButton f10012;

    /* renamed from: ȷ  reason: contains not printable characters */
    CharSequence f10013;

    /* renamed from: ɍ  reason: contains not printable characters */
    private int f10014;

    /* renamed from: ɔ  reason: contains not printable characters */
    private int f10015;

    /* renamed from: ɟ  reason: contains not printable characters */
    private ColorStateList f10016;

    /* renamed from: ɨ  reason: contains not printable characters */
    public C1920 f10017;

    /* renamed from: ɩ  reason: contains not printable characters */
    View f10018;

    /* renamed from: ɪ  reason: contains not printable characters */
    Cif f10019;

    /* renamed from: ɭ  reason: contains not printable characters */
    private C2328.Cif f10020;

    /* renamed from: ɹ  reason: contains not printable characters */
    public int f10021;

    /* renamed from: ɺ  reason: contains not printable characters */
    private int f10022;

    /* renamed from: ɻ  reason: contains not printable characters */
    private final Runnable f10023;

    /* renamed from: ɼ  reason: contains not printable characters */
    private int f10024;

    /* renamed from: ɾ  reason: contains not printable characters */
    If f10025;

    /* renamed from: ɿ  reason: contains not printable characters */
    private Drawable f10026;

    /* renamed from: ʅ  reason: contains not printable characters */
    private int f10027;

    /* renamed from: ʟ  reason: contains not printable characters */
    private TextView f10028;

    /* renamed from: ͻ  reason: contains not printable characters */
    private final ArrayList<View> f10029;

    /* renamed from: Ι  reason: contains not printable characters */
    int f10030;

    /* renamed from: ι  reason: contains not printable characters */
    ImageButton f10031;

    /* renamed from: ϲ  reason: contains not printable characters */
    private final int[] f10032;

    /* renamed from: ϳ  reason: contains not printable characters */
    private boolean f10033;

    /* renamed from: І  reason: contains not printable characters */
    public int f10034;

    /* renamed from: Ј  reason: contains not printable characters */
    private boolean f10035;

    /* renamed from: г  reason: contains not printable characters */
    private TextView f10036;

    /* renamed from: с  reason: contains not printable characters */
    private ColorStateList f10037;

    /* renamed from: т  reason: contains not printable characters */
    private C2348 f10038;

    /* renamed from: х  reason: contains not printable characters */
    private boolean f10039;

    /* renamed from: і  reason: contains not printable characters */
    public int f10040;

    /* renamed from: ј  reason: contains not printable characters */
    private C1483.C1484 f10041;

    /* renamed from: ґ  reason: contains not printable characters */
    private final C2118.Cif f10042;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public CharSequence f10043;

    /* renamed from: ӏ  reason: contains not printable characters */
    final ArrayList<View> f10044;

    /* renamed from: o.ιι$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: Ι  reason: contains not printable characters */
        boolean m10887(MenuItem menuItem);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m10864(layoutParams);
    }

    public C2026(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2026(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f155362130969370);
    }

    public C2026(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10024 = 8388627;
        this.f10029 = new ArrayList<>();
        this.f10044 = new ArrayList<>();
        this.f10032 = new int[2];
        this.f10042 = new C2118.Cif() {
            /* renamed from: ι  reason: contains not printable characters */
            public final boolean m10875(MenuItem menuItem) {
                if (C2026.this.f10019 != null) {
                    return C2026.this.f10019.m10887(menuItem);
                }
                return false;
            }
        };
        this.f10023 = new Runnable() {
            public final void run() {
                C2026.this.m10873();
            }
        };
        Context context2 = getContext();
        C1992 r2 = new C1992(context2, context2.obtainStyledAttributes(attributeSet, C2745.aux.f12883, i, 0));
        int i2 = C2745.aux.f12988;
        this.f10027 = r2.f9934.getResourceId(28, 0);
        int i3 = C2745.aux.f12958;
        this.f10009 = r2.f9934.getResourceId(19, 0);
        int i4 = C2745.aux.f12886;
        this.f10024 = r2.f9934.getInteger(0, this.f10024);
        int i5 = C2745.aux.f12895;
        this.f10030 = r2.f9934.getInteger(2, 48);
        int i6 = C2745.aux.f12955;
        int dimensionPixelOffset = r2.f9934.getDimensionPixelOffset(22, 0);
        int i7 = C2745.aux.f12968;
        if (r2.f9934.hasValue(27)) {
            int i8 = C2745.aux.f12968;
            dimensionPixelOffset = r2.f9934.getDimensionPixelOffset(27, dimensionPixelOffset);
        }
        this.f10040 = dimensionPixelOffset;
        this.f10008 = dimensionPixelOffset;
        this.f10021 = dimensionPixelOffset;
        this.f10034 = dimensionPixelOffset;
        int i9 = C2745.aux.f12969;
        int dimensionPixelOffset2 = r2.f9934.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f10034 = dimensionPixelOffset2;
        }
        int i10 = C2745.aux.f12965;
        int dimensionPixelOffset3 = r2.f9934.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f10021 = dimensionPixelOffset3;
        }
        int i11 = C2745.aux.f12979;
        int dimensionPixelOffset4 = r2.f9934.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f10008 = dimensionPixelOffset4;
        }
        int i12 = C2745.aux.f12966;
        int dimensionPixelOffset5 = r2.f9934.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f10040 = dimensionPixelOffset5;
        }
        int i13 = C2745.aux.f12937;
        this.f10010 = r2.f9934.getDimensionPixelSize(13, -1);
        int i14 = C2745.aux.f12920;
        int dimensionPixelOffset6 = r2.f9934.getDimensionPixelOffset(9, RecyclerView.UNDEFINED_DURATION);
        int i15 = C2745.aux.f12902;
        int dimensionPixelOffset7 = r2.f9934.getDimensionPixelOffset(5, RecyclerView.UNDEFINED_DURATION);
        int i16 = C2745.aux.f12903;
        int dimensionPixelSize = r2.f9934.getDimensionPixelSize(7, 0);
        int i17 = C2745.aux.f12916;
        int dimensionPixelSize2 = r2.f9934.getDimensionPixelSize(8, 0);
        if (this.f10011 == null) {
            this.f10011 = new C2745.C2747();
        }
        this.f10011.m14565(dimensionPixelSize, dimensionPixelSize2);
        if (!(dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {
            this.f10011.m14566(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        int i18 = C2745.aux.f12924;
        this.f10015 = r2.f9934.getDimensionPixelOffset(10, RecyclerView.UNDEFINED_DURATION);
        int i19 = C2745.aux.f12906;
        this.f10022 = r2.f9934.getDimensionPixelOffset(6, RecyclerView.UNDEFINED_DURATION);
        this.f10026 = r2.m10793(C2745.aux.f12900);
        int i20 = C2745.aux.f12907;
        this.f10005 = r2.f9934.getText(3);
        int i21 = C2745.aux.f12959;
        CharSequence text = r2.f9934.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        int i22 = C2745.aux.f12947;
        CharSequence text2 = r2.f9934.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f10007 = getContext();
        int i23 = C2745.aux.f12931;
        setPopupTheme(r2.f9934.getResourceId(17, 0));
        Drawable r6 = r2.m10793(C2745.aux.f12945);
        if (r6 != null) {
            setNavigationIcon(r6);
        }
        int i24 = C2745.aux.f12928;
        CharSequence text3 = r2.f9934.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable r62 = r2.m10793(C2745.aux.f12919);
        if (r62 != null) {
            setLogo(r62);
        }
        int i25 = C2745.aux.f12918;
        CharSequence text4 = r2.f9934.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        int i26 = C2745.aux.f12987;
        if (r2.f9934.hasValue(29)) {
            setTitleTextColor(r2.m10792(C2745.aux.f12987));
        }
        int i27 = C2745.aux.f12957;
        if (r2.f9934.hasValue(20)) {
            setSubtitleTextColor(r2.m10792(C2745.aux.f12957));
        }
        int i28 = C2745.aux.f12939;
        if (r2.f9934.hasValue(14)) {
            int i29 = C2745.aux.f12939;
            int resourceId = r2.f9934.getResourceId(14, 0);
            C0491 r7 = new C0491(getContext());
            m10872();
            r7.inflate(resourceId, this.f10004.m11283());
        }
        r2.f9934.recycle();
    }

    public void setPopupTheme(int i) {
        if (this.f10014 != i) {
            this.f10014 = i;
            if (i == 0) {
                this.f10007 = getContext();
            } else {
                this.f10007 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.f10034 = i;
        this.f10008 = i2;
        this.f10021 = i3;
        this.f10040 = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f10034 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f10008 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f10021 = i;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.f10040 = i;
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        if (this.f10011 == null) {
            this.f10011 = new C2745.C2747();
        }
        C2745.C2747 r0 = this.f10011;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != r0.f13035) {
            r0.f13035 = z;
            if (!r0.f13038) {
                r0.f13036 = r0.f13037;
                r0.f13040 = r0.f13041;
            } else if (z) {
                r0.f13036 = r0.f13034 != Integer.MIN_VALUE ? r0.f13034 : r0.f13037;
                r0.f13040 = r0.f13039 != Integer.MIN_VALUE ? r0.f13039 : r0.f13041;
            } else {
                r0.f13036 = r0.f13039 != Integer.MIN_VALUE ? r0.f13039 : r0.f13037;
                r0.f13040 = r0.f13034 != Integer.MIN_VALUE ? r0.f13034 : r0.f13041;
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C3257Con.m1345(getContext(), i));
    }

    public final boolean B_() {
        C2118 r0 = this.f10004;
        if (r0 != null) {
            if (r0.f10244 != null && r0.f10244.m12286()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m10873() {
        C2118 r0 = this.f10004;
        if (r0 != null) {
            if (r0.f10244 != null && r0.f10244.m12296()) {
                return true;
            }
        }
        return false;
    }

    public void setMenu(C2328 r6, C2348 r7) {
        if (r6 != null || this.f10004 != null) {
            m10869();
            C2328 r0 = this.f10004.f10246;
            if (r0 != r6) {
                if (r0 != null) {
                    r0.m12138((C1483) this.f10038);
                    r0.m12138((C1483) this.f10025);
                }
                if (this.f10025 == null) {
                    this.f10025 = new If();
                }
                r7.f10870 = true;
                if (r6 != null) {
                    Context context = this.f10007;
                    r6.f10807.add(new WeakReference(r7));
                    r7.m8873(context, r6);
                    r6.f10817 = true;
                    If ifR = this.f10025;
                    Context context2 = this.f10007;
                    r6.f10807.add(new WeakReference(ifR));
                    ifR.m8873(context2, r6);
                    r6.f10817 = true;
                } else {
                    r7.m7315(this.f10007, (C2328) null);
                    this.f10025.m10884(this.f10007, (C2328) null);
                    r7.m7317(true);
                    this.f10025.m10885(true);
                }
                this.f10004.setPopupTheme(this.f10014);
                this.f10004.setPresenter(r7);
                this.f10038 = r7;
            }
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f10006 == null) {
            this.f10006 = new C2147(getContext());
        }
        ImageView imageView = this.f10006;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        boolean z = false;
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f10028 == null) {
                Context context = getContext();
                this.f10028 = new C1514(context);
                this.f10028.setSingleLine();
                this.f10028.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f10027;
                if (i != 0) {
                    this.f10028.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f10016;
                if (colorStateList != null) {
                    this.f10028.setTextColor(colorStateList);
                }
            }
            TextView textView = this.f10028;
            if (textView.getParent() == this || this.f10044.contains(textView)) {
                z = true;
            }
            if (!z) {
                m10858(this.f10028, true);
            }
        } else {
            TextView textView2 = this.f10028;
            if (textView2 != null) {
                if (textView2.getParent() == this || this.f10044.contains(textView2)) {
                    z = true;
                }
                if (z) {
                    removeView(this.f10028);
                    this.f10044.remove(this.f10028);
                }
            }
        }
        TextView textView3 = this.f10028;
        if (textView3 != null) {
            textView3.setText(charSequence);
        }
        this.f10043 = charSequence;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean z = false;
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f10036 == null) {
                Context context = getContext();
                this.f10036 = new C1514(context);
                this.f10036.setSingleLine();
                this.f10036.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f10009;
                if (i != 0) {
                    this.f10036.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f10037;
                if (colorStateList != null) {
                    this.f10036.setTextColor(colorStateList);
                }
            }
            TextView textView = this.f10036;
            if (textView.getParent() == this || this.f10044.contains(textView)) {
                z = true;
            }
            if (!z) {
                m10858(this.f10036, true);
            }
        } else {
            TextView textView2 = this.f10036;
            if (textView2 != null) {
                if (textView2.getParent() == this || this.f10044.contains(textView2)) {
                    z = true;
                }
                if (z) {
                    removeView(this.f10036);
                    this.f10044.remove(this.f10036);
                }
            }
        }
        TextView textView3 = this.f10036;
        if (textView3 != null) {
            textView3.setText(charSequence);
        }
        this.f10013 = charSequence;
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.f10027 = i;
        TextView textView = this.f10028;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.f10009 = i;
        TextView textView = this.f10036;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f10016 = colorStateList;
        TextView textView = this.f10028;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f10037 = colorStateList;
        TextView textView = this.f10036;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m10861();
        }
        ImageButton imageButton = this.f10012;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C3257Con.m1345(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        boolean z = false;
        if (drawable != null) {
            m10861();
            ImageButton imageButton = this.f10012;
            if (imageButton.getParent() == this || this.f10044.contains(imageButton)) {
                z = true;
            }
            if (!z) {
                m10858(this.f10012, true);
            }
        } else {
            ImageButton imageButton2 = this.f10012;
            if (imageButton2 != null) {
                if (imageButton2.getParent() == this || this.f10044.contains(imageButton2)) {
                    z = true;
                }
                if (z) {
                    removeView(this.f10012);
                    this.f10044.remove(this.f10012);
                }
            }
        }
        ImageButton imageButton3 = this.f10012;
        if (imageButton3 != null) {
            imageButton3.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m10861();
        this.f10012.setOnClickListener(onClickListener);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m10874();
        }
        ImageButton imageButton = this.f10031;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C3257Con.m1345(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m10874();
            this.f10031.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f10031;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f10026);
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        m10872();
        this.f10004.setOverflowIcon(drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10872() {
        m10869();
        if (this.f10004.f10246 == null) {
            C2328 r0 = (C2328) this.f10004.m11283();
            if (this.f10025 == null) {
                this.f10025 = new If();
            }
            this.f10004.setExpandedActionViewsExclusive(true);
            If ifR = this.f10025;
            Context context = this.f10007;
            r0.f10807.add(new WeakReference(ifR));
            ifR.m8873(context, r0);
            r0.f10817 = true;
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    private void m10869() {
        if (this.f10004 == null) {
            this.f10004 = new C2118(getContext());
            this.f10004.setPopupTheme(this.f10014);
            this.f10004.setOnMenuItemClickListener(this.f10042);
            this.f10004.setMenuCallbacks(this.f10041, this.f10020);
            C2028 r0 = new C2028();
            r0.f1551 = 8388613 | (this.f10030 & 112);
            this.f10004.setLayoutParams(r0);
            m10858(this.f10004, false);
        }
    }

    public void setOnMenuItemClickListener(Cif ifVar) {
        this.f10019 = ifVar;
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f10015) {
            this.f10015 = i;
            ImageButton imageButton = this.f10012;
            if ((imageButton != null ? imageButton.getDrawable() : null) != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f10022) {
            this.f10022 = i;
            ImageButton imageButton = this.f10012;
            if ((imageButton != null ? imageButton.getDrawable() : null) != null) {
                requestLayout();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f10246;
     */
    /* renamed from: І  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m10868() {
        /*
            r3 = this;
            o.τ r0 = r3.f10004
            r1 = 0
            if (r0 == 0) goto L_0x0011
            o.Ј r0 = r0.f10246
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x002e
            o.Ӏ$ǃ r0 = r3.f10011
            if (r0 == 0) goto L_0x0022
            boolean r2 = r0.f13035
            if (r2 == 0) goto L_0x001f
            int r0 = r0.f13036
            goto L_0x0023
        L_0x001f:
            int r0 = r0.f13040
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            int r2 = r3.f10022
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L_0x002e:
            o.Ӏ$ǃ r0 = r3.f10011
            if (r0 == 0) goto L_0x003c
            boolean r1 = r0.f13035
            if (r1 == 0) goto L_0x0039
            int r0 = r0.f13036
            return r0
        L_0x0039:
            int r0 = r0.f13040
            return r0
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2026.m10868():int");
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private void m10861() {
        if (this.f10012 == null) {
            this.f10012 = new C2115(getContext(), (AttributeSet) null, R.attr.f155352130969369);
            C2028 r0 = new C2028();
            r0.f1551 = 8388611 | (this.f10030 & 112);
            this.f10012.setLayoutParams(r0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m10874() {
        if (this.f10031 == null) {
            this.f10031 = new C2115(getContext(), (AttributeSet) null, R.attr.f155352130969369);
            this.f10031.setImageDrawable(this.f10026);
            this.f10031.setContentDescription(this.f10005);
            C2028 r0 = new C2028();
            r0.f1551 = 8388611 | (this.f10030 & 112);
            r0.f10053 = 2;
            this.f10031.setLayoutParams(r0);
            this.f10031.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C2026 r2 = C2026.this;
                    C2459 r22 = r2.f10025 == null ? null : r2.f10025.f10048;
                    if (r22 != null) {
                        r22.collapseActionView();
                    }
                }
            });
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m10858(View view, boolean z) {
        C2028 r0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            r0 = new C2028();
        } else if (!checkLayoutParams(layoutParams)) {
            r0 = m10864(layoutParams);
        } else {
            r0 = (C2028) layoutParams;
        }
        r0.f10053 = 1;
        if (!z || this.f10018 == null) {
            addView(view, r0);
            return;
        }
        view.setLayoutParams(r0);
        this.f10044.add(view);
    }

    public Parcelable onSaveInstanceState() {
        C2027 r0 = new C2027(super.onSaveInstanceState());
        If ifR = this.f10025;
        if (!(ifR == null || ifR.f10048 == null)) {
            r0.f10051 = this.f10025.f10048.getItemId();
        }
        r0.f10052 = B_();
        return r0;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C2328 r0;
        MenuItem findItem;
        if (!(parcelable instanceof C2027)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2027 r3 = (C2027) parcelable;
        super.onRestoreInstanceState(r3.f6905);
        C2118 r02 = this.f10004;
        if (r02 != null) {
            r0 = r02.f10246;
        } else {
            r0 = null;
        }
        if (!(r3.f10051 == 0 || this.f10025 == null || r0 == null || (findItem = r0.findItem(r3.f10051)) == null)) {
            findItem.expandActionView();
        }
        if (r3.f10052) {
            removeCallbacks(this.f10023);
            post(this.f10023);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f10023);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f10033 = false;
        }
        if (!this.f10033) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f10033 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f10033 = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f10035 = false;
        }
        if (!this.f10035) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f10035 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f10035 = false;
        }
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m10867(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private int m10859(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x036c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r19, int r20) {
        /*
            r18 = this;
            r7 = r18
            int[] r8 = r7.f10032
            boolean r0 = o.C2373.m12363(r18)
            r10 = 0
            if (r0 == 0) goto L_0x000e
            r6 = 1
            r11 = 0
            goto L_0x0010
        L_0x000e:
            r6 = 0
            r11 = 1
        L_0x0010:
            android.widget.ImageButton r0 = r7.f10012
            r12 = 8
            if (r0 == 0) goto L_0x0024
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != r7) goto L_0x0024
            int r0 = r0.getVisibility()
            if (r0 == r12) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0072
            android.widget.ImageButton r1 = r7.f10012
            r3 = 0
            int r5 = r7.f10010
            r0 = r18
            r2 = r19
            r4 = r20
            r0.m10867(r1, r2, r3, r4, r5)
            android.widget.ImageButton r0 = r7.f10012
            int r0 = r0.getMeasuredWidth()
            android.widget.ImageButton r1 = r7.f10012
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = o.C2826.m14763(r1)
            int r1 = o.C2826.m14766(r1)
            int r2 = r2 + r1
            int r0 = r0 + r2
            android.widget.ImageButton r1 = r7.f10012
            int r1 = r1.getMeasuredHeight()
            android.widget.ImageButton r2 = r7.f10012
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r2.topMargin
            int r2 = r2.bottomMargin
            int r3 = r3 + r2
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r10, r1)
            android.widget.ImageButton r2 = r7.f10012
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r10, r2)
            r13 = r1
            r14 = r2
            goto L_0x0075
        L_0x0072:
            r0 = 0
            r13 = 0
            r14 = 0
        L_0x0075:
            android.widget.ImageButton r1 = r7.f10031
            if (r1 == 0) goto L_0x0087
            android.view.ViewParent r2 = r1.getParent()
            if (r2 != r7) goto L_0x0087
            int r1 = r1.getVisibility()
            if (r1 == r12) goto L_0x0087
            r1 = 1
            goto L_0x0088
        L_0x0087:
            r1 = 0
        L_0x0088:
            if (r1 == 0) goto L_0x00d2
            android.widget.ImageButton r1 = r7.f10031
            r3 = 0
            int r5 = r7.f10010
            r0 = r18
            r2 = r19
            r4 = r20
            r0.m10867(r1, r2, r3, r4, r5)
            android.widget.ImageButton r0 = r7.f10031
            int r0 = r0.getMeasuredWidth()
            android.widget.ImageButton r1 = r7.f10031
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = o.C2826.m14763(r1)
            int r1 = o.C2826.m14766(r1)
            int r2 = r2 + r1
            int r0 = r0 + r2
            android.widget.ImageButton r1 = r7.f10031
            int r1 = r1.getMeasuredHeight()
            android.widget.ImageButton r2 = r7.f10031
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r2.topMargin
            int r2 = r2.bottomMargin
            int r3 = r3 + r2
            int r1 = r1 + r3
            int r13 = java.lang.Math.max(r13, r1)
            android.widget.ImageButton r1 = r7.f10031
            int r1 = r1.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r1)
        L_0x00d2:
            int r1 = r18.m10870()
            int r2 = java.lang.Math.max(r1, r0)
            int r15 = r2 + 0
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r10, r1)
            r8[r6] = r0
            o.τ r0 = r7.f10004
            if (r0 == 0) goto L_0x00f5
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != r7) goto L_0x00f5
            int r0 = r0.getVisibility()
            if (r0 == r12) goto L_0x00f5
            r0 = 1
            goto L_0x00f6
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            if (r0 == 0) goto L_0x0141
            o.τ r1 = r7.f10004
            int r5 = r7.f10010
            r0 = r18
            r2 = r19
            r3 = r15
            r4 = r20
            r0.m10867(r1, r2, r3, r4, r5)
            o.τ r0 = r7.f10004
            int r0 = r0.getMeasuredWidth()
            o.τ r1 = r7.f10004
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = o.C2826.m14763(r1)
            int r1 = o.C2826.m14766(r1)
            int r2 = r2 + r1
            int r0 = r0 + r2
            o.τ r1 = r7.f10004
            int r1 = r1.getMeasuredHeight()
            o.τ r2 = r7.f10004
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r2.topMargin
            int r2 = r2.bottomMargin
            int r3 = r3 + r2
            int r1 = r1 + r3
            int r13 = java.lang.Math.max(r13, r1)
            o.τ r1 = r7.f10004
            int r1 = r1.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r1)
            goto L_0x0142
        L_0x0141:
            r0 = 0
        L_0x0142:
            int r1 = r18.m10868()
            int r2 = java.lang.Math.max(r1, r0)
            int r15 = r15 + r2
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r10, r1)
            r8[r11] = r0
            android.view.View r0 = r7.f10018
            if (r0 == 0) goto L_0x0164
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != r7) goto L_0x0164
            int r0 = r0.getVisibility()
            if (r0 == r12) goto L_0x0164
            r0 = 1
            goto L_0x0165
        L_0x0164:
            r0 = 0
        L_0x0165:
            if (r0 == 0) goto L_0x0199
            android.view.View r1 = r7.f10018
            r5 = 0
            r0 = r18
            r2 = r19
            r3 = r15
            r4 = r20
            r6 = r8
            int r0 = r0.m10859(r1, r2, r3, r4, r5, r6)
            int r15 = r15 + r0
            android.view.View r0 = r7.f10018
            int r0 = r0.getMeasuredHeight()
            android.view.View r1 = r7.f10018
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.topMargin
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            int r0 = r0 + r2
            int r13 = java.lang.Math.max(r13, r0)
            android.view.View r0 = r7.f10018
            int r0 = r0.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r0)
        L_0x0199:
            android.widget.ImageView r0 = r7.f10006
            if (r0 == 0) goto L_0x01ab
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != r7) goto L_0x01ab
            int r0 = r0.getVisibility()
            if (r0 == r12) goto L_0x01ab
            r0 = 1
            goto L_0x01ac
        L_0x01ab:
            r0 = 0
        L_0x01ac:
            if (r0 == 0) goto L_0x01e0
            android.widget.ImageView r1 = r7.f10006
            r5 = 0
            r0 = r18
            r2 = r19
            r3 = r15
            r4 = r20
            r6 = r8
            int r0 = r0.m10859(r1, r2, r3, r4, r5, r6)
            int r15 = r15 + r0
            android.widget.ImageView r0 = r7.f10006
            int r0 = r0.getMeasuredHeight()
            android.widget.ImageView r1 = r7.f10006
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.topMargin
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            int r0 = r0 + r2
            int r13 = java.lang.Math.max(r13, r0)
            android.widget.ImageView r0 = r7.f10006
            int r0 = r0.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r0)
        L_0x01e0:
            int r11 = r18.getChildCount()
            r6 = r13
            r13 = 0
        L_0x01e6:
            if (r13 >= r11) goto L_0x023c
            android.view.View r16 = r7.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r0 = r16.getLayoutParams()
            o.ιι$ɩ r0 = (o.C2026.C2028) r0
            int r0 = r0.f10053
            if (r0 != 0) goto L_0x0237
            android.view.ViewParent r0 = r16.getParent()
            if (r0 != r7) goto L_0x0204
            int r0 = r16.getVisibility()
            if (r0 == r12) goto L_0x0204
            r0 = 1
            goto L_0x0205
        L_0x0204:
            r0 = 0
        L_0x0205:
            if (r0 == 0) goto L_0x0237
            r5 = 0
            r0 = r18
            r1 = r16
            r2 = r19
            r3 = r15
            r4 = r20
            r9 = r6
            r6 = r8
            int r0 = r0.m10859(r1, r2, r3, r4, r5, r6)
            int r15 = r15 + r0
            int r0 = r16.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r16.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.topMargin
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r9, r0)
            int r1 = r16.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r14, r1)
            r6 = r0
            r14 = r1
            goto L_0x0239
        L_0x0237:
            r9 = r6
            r6 = r9
        L_0x0239:
            int r13 = r13 + 1
            goto L_0x01e6
        L_0x023c:
            r9 = r6
            int r0 = r7.f10008
            int r1 = r7.f10040
            int r11 = r0 + r1
            int r0 = r7.f10034
            int r1 = r7.f10021
            int r13 = r0 + r1
            android.widget.TextView r0 = r7.f10028
            if (r0 == 0) goto L_0x025b
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != r7) goto L_0x025b
            int r0 = r0.getVisibility()
            if (r0 == r12) goto L_0x025b
            r0 = 1
            goto L_0x025c
        L_0x025b:
            r0 = 0
        L_0x025c:
            if (r0 == 0) goto L_0x02a7
            android.widget.TextView r1 = r7.f10028
            int r3 = r15 + r13
            r0 = r18
            r2 = r19
            r4 = r20
            r5 = r11
            r6 = r8
            r0.m10859(r1, r2, r3, r4, r5, r6)
            android.widget.TextView r0 = r7.f10028
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r7.f10028
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = o.C2826.m14763(r1)
            int r1 = o.C2826.m14766(r1)
            int r2 = r2 + r1
            int r0 = r0 + r2
            android.widget.TextView r1 = r7.f10028
            int r1 = r1.getMeasuredHeight()
            android.widget.TextView r2 = r7.f10028
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r2.topMargin
            int r2 = r2.bottomMargin
            int r3 = r3 + r2
            int r1 = r1 + r3
            android.widget.TextView r2 = r7.f10028
            int r2 = r2.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r2)
            r6 = r0
            r16 = r1
            goto L_0x02aa
        L_0x02a7:
            r6 = 0
            r16 = 0
        L_0x02aa:
            android.widget.TextView r0 = r7.f10036
            if (r0 == 0) goto L_0x02bc
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != r7) goto L_0x02bc
            int r0 = r0.getVisibility()
            if (r0 == r12) goto L_0x02bc
            r0 = 1
            goto L_0x02bd
        L_0x02bc:
            r0 = 0
        L_0x02bd:
            if (r0 == 0) goto L_0x02f6
            android.widget.TextView r1 = r7.f10036
            int r3 = r15 + r13
            int r5 = r16 + r11
            r0 = r18
            r2 = r19
            r4 = r20
            r11 = r6
            r6 = r8
            int r0 = r0.m10859(r1, r2, r3, r4, r5, r6)
            int r6 = java.lang.Math.max(r11, r0)
            android.widget.TextView r0 = r7.f10036
            int r0 = r0.getMeasuredHeight()
            android.widget.TextView r1 = r7.f10036
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.topMargin
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            int r0 = r0 + r2
            int r16 = r16 + r0
            android.widget.TextView r0 = r7.f10036
            int r0 = r0.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r0)
            goto L_0x02f7
        L_0x02f6:
            r11 = r6
        L_0x02f7:
            r0 = r16
            int r15 = r15 + r6
            int r0 = java.lang.Math.max(r9, r0)
            int r1 = r18.getPaddingLeft()
            int r2 = r18.getPaddingRight()
            int r1 = r1 + r2
            int r15 = r15 + r1
            int r1 = r18.getPaddingTop()
            int r2 = r18.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r18.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r15, r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r14
            r3 = r19
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            int r2 = r18.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r14 << 16
            r3 = r20
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r2)
            boolean r2 = r7.f10039
            if (r2 != 0) goto L_0x033a
        L_0x0337:
            r17 = 0
            goto L_0x036a
        L_0x033a:
            int r2 = r18.getChildCount()
            r3 = 0
        L_0x033f:
            if (r3 >= r2) goto L_0x0368
            android.view.View r4 = r7.getChildAt(r3)
            if (r4 == 0) goto L_0x0355
            android.view.ViewParent r5 = r4.getParent()
            if (r5 != r7) goto L_0x0355
            int r5 = r4.getVisibility()
            if (r5 == r12) goto L_0x0355
            r5 = 1
            goto L_0x0356
        L_0x0355:
            r5 = 0
        L_0x0356:
            if (r5 == 0) goto L_0x0365
            int r5 = r4.getMeasuredWidth()
            if (r5 <= 0) goto L_0x0365
            int r4 = r4.getMeasuredHeight()
            if (r4 <= 0) goto L_0x0365
            goto L_0x0337
        L_0x0365:
            int r3 = r3 + 1
            goto L_0x033f
        L_0x0368:
            r17 = 1
        L_0x036a:
            if (r17 == 0) goto L_0x036d
            r0 = 0
        L_0x036d:
            r7.setMeasuredDimension(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2026.onMeasure(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x019a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x031e A[LOOP:0: B:160:0x031c->B:161:0x031e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0340 A[LOOP:1: B:163:0x033e->B:164:0x0340, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0366 A[LOOP:2: B:166:0x0364->B:167:0x0366, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03b6 A[LOOP:3: B:174:0x03b4->B:175:0x03b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = o.C0293.m4156(r18)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r18.getWidth()
            int r5 = r18.getHeight()
            int r6 = r18.getPaddingLeft()
            int r7 = r18.getPaddingRight()
            int r8 = r18.getPaddingTop()
            int r9 = r18.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f10032
            r11[r2] = r3
            r11[r3] = r3
            int r12 = o.C0293.m4182(r18)
            if (r12 < 0) goto L_0x003a
            int r13 = r23 - r21
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f10012
            r14 = 8
            if (r13 == 0) goto L_0x004f
            android.view.ViewParent r15 = r13.getParent()
            if (r15 != r0) goto L_0x004f
            int r13 = r13.getVisibility()
            if (r13 == r14) goto L_0x004f
            r13 = 1
            goto L_0x0050
        L_0x004f:
            r13 = 0
        L_0x0050:
            if (r13 == 0) goto L_0x0064
            if (r1 == 0) goto L_0x005d
            android.widget.ImageButton r13 = r0.f10012
            int r13 = r0.m10866(r13, r10, r11, r12)
            r15 = r13
            r13 = r6
            goto L_0x0066
        L_0x005d:
            android.widget.ImageButton r13 = r0.f10012
            int r13 = r0.m10863(r13, r6, r11, r12)
            goto L_0x0065
        L_0x0064:
            r13 = r6
        L_0x0065:
            r15 = r10
        L_0x0066:
            android.widget.ImageButton r3 = r0.f10031
            if (r3 == 0) goto L_0x0078
            android.view.ViewParent r2 = r3.getParent()
            if (r2 != r0) goto L_0x0078
            int r2 = r3.getVisibility()
            if (r2 == r14) goto L_0x0078
            r2 = 1
            goto L_0x0079
        L_0x0078:
            r2 = 0
        L_0x0079:
            if (r2 == 0) goto L_0x008a
            if (r1 == 0) goto L_0x0084
            android.widget.ImageButton r2 = r0.f10031
            int r15 = r0.m10866(r2, r15, r11, r12)
            goto L_0x008a
        L_0x0084:
            android.widget.ImageButton r2 = r0.f10031
            int r13 = r0.m10863(r2, r13, r11, r12)
        L_0x008a:
            o.τ r2 = r0.f10004
            if (r2 == 0) goto L_0x009c
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != r0) goto L_0x009c
            int r2 = r2.getVisibility()
            if (r2 == r14) goto L_0x009c
            r2 = 1
            goto L_0x009d
        L_0x009c:
            r2 = 0
        L_0x009d:
            if (r2 == 0) goto L_0x00ae
            if (r1 == 0) goto L_0x00a8
            o.τ r2 = r0.f10004
            int r13 = r0.m10863(r2, r13, r11, r12)
            goto L_0x00ae
        L_0x00a8:
            o.τ r2 = r0.f10004
            int r15 = r0.m10866(r2, r15, r11, r12)
        L_0x00ae:
            int r2 = o.C0293.m4156(r18)
            r3 = 1
            if (r2 != r3) goto L_0x00ba
            int r2 = r18.m10868()
            goto L_0x00be
        L_0x00ba:
            int r2 = r18.m10870()
        L_0x00be:
            int r14 = o.C0293.m4156(r18)
            if (r14 != r3) goto L_0x00c9
            int r14 = r18.m10870()
            goto L_0x00cd
        L_0x00c9:
            int r14 = r18.m10868()
        L_0x00cd:
            int r3 = r2 - r13
            r22 = r7
            r7 = 0
            int r3 = java.lang.Math.max(r7, r3)
            r11[r7] = r3
            int r3 = r10 - r15
            int r3 = r14 - r3
            int r3 = java.lang.Math.max(r7, r3)
            r7 = 1
            r11[r7] = r3
            int r2 = java.lang.Math.max(r13, r2)
            int r10 = r10 - r14
            int r3 = java.lang.Math.min(r15, r10)
            android.view.View r7 = r0.f10018
            if (r7 == 0) goto L_0x0100
            android.view.ViewParent r10 = r7.getParent()
            if (r10 != r0) goto L_0x0100
            int r7 = r7.getVisibility()
            r10 = 8
            if (r7 == r10) goto L_0x0100
            r7 = 1
            goto L_0x0101
        L_0x0100:
            r7 = 0
        L_0x0101:
            if (r7 == 0) goto L_0x0112
            if (r1 == 0) goto L_0x010c
            android.view.View r7 = r0.f10018
            int r3 = r0.m10866(r7, r3, r11, r12)
            goto L_0x0112
        L_0x010c:
            android.view.View r7 = r0.f10018
            int r2 = r0.m10863(r7, r2, r11, r12)
        L_0x0112:
            android.widget.ImageView r7 = r0.f10006
            if (r7 == 0) goto L_0x0126
            android.view.ViewParent r10 = r7.getParent()
            if (r10 != r0) goto L_0x0126
            int r7 = r7.getVisibility()
            r10 = 8
            if (r7 == r10) goto L_0x0126
            r7 = 1
            goto L_0x0127
        L_0x0126:
            r7 = 0
        L_0x0127:
            if (r7 == 0) goto L_0x0138
            if (r1 == 0) goto L_0x0132
            android.widget.ImageView r7 = r0.f10006
            int r3 = r0.m10866(r7, r3, r11, r12)
            goto L_0x0138
        L_0x0132:
            android.widget.ImageView r7 = r0.f10006
            int r2 = r0.m10863(r7, r2, r11, r12)
        L_0x0138:
            android.widget.TextView r7 = r0.f10028
            if (r7 == 0) goto L_0x014c
            android.view.ViewParent r10 = r7.getParent()
            if (r10 != r0) goto L_0x014c
            int r7 = r7.getVisibility()
            r10 = 8
            if (r7 == r10) goto L_0x014e
            r7 = 1
            goto L_0x014f
        L_0x014c:
            r10 = 8
        L_0x014e:
            r7 = 0
        L_0x014f:
            android.widget.TextView r13 = r0.f10036
            if (r13 == 0) goto L_0x0161
            android.view.ViewParent r14 = r13.getParent()
            if (r14 != r0) goto L_0x0161
            int r13 = r13.getVisibility()
            if (r13 == r10) goto L_0x0161
            r10 = 1
            goto L_0x0162
        L_0x0161:
            r10 = 0
        L_0x0162:
            if (r7 == 0) goto L_0x017b
            android.widget.TextView r13 = r0.f10028
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            o.ιι$ɩ r13 = (o.C2026.C2028) r13
            int r14 = r13.topMargin
            android.widget.TextView r15 = r0.f10028
            int r15 = r15.getMeasuredHeight()
            int r14 = r14 + r15
            int r13 = r13.bottomMargin
            int r14 = r14 + r13
            r13 = 0
            int r14 = r14 + r13
            goto L_0x017c
        L_0x017b:
            r14 = 0
        L_0x017c:
            if (r10 == 0) goto L_0x0196
            android.widget.TextView r13 = r0.f10036
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            o.ιι$ɩ r13 = (o.C2026.C2028) r13
            int r15 = r13.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f10036
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r13.bottomMargin
            int r15 = r15 + r4
            int r14 = r14 + r15
            goto L_0x0198
        L_0x0196:
            r16 = r4
        L_0x0198:
            if (r7 != 0) goto L_0x01a3
            if (r10 == 0) goto L_0x019d
            goto L_0x01a3
        L_0x019d:
            r17 = r6
            r21 = r12
            goto L_0x030e
        L_0x01a3:
            if (r7 == 0) goto L_0x01a8
            android.widget.TextView r4 = r0.f10028
            goto L_0x01aa
        L_0x01a8:
            android.widget.TextView r4 = r0.f10036
        L_0x01aa:
            if (r10 == 0) goto L_0x01af
            android.widget.TextView r13 = r0.f10036
            goto L_0x01b1
        L_0x01af:
            android.widget.TextView r13 = r0.f10028
        L_0x01b1:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            o.ιι$ɩ r4 = (o.C2026.C2028) r4
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            o.ιι$ɩ r13 = (o.C2026.C2028) r13
            if (r7 == 0) goto L_0x01c7
            android.widget.TextView r15 = r0.f10028
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x01d1
        L_0x01c7:
            if (r10 == 0) goto L_0x01d5
            android.widget.TextView r15 = r0.f10036
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x01d5
        L_0x01d1:
            r17 = r6
            r15 = 1
            goto L_0x01d8
        L_0x01d5:
            r17 = r6
            r15 = 0
        L_0x01d8:
            int r6 = r0.f10024
            r6 = r6 & 112(0x70, float:1.57E-43)
            r21 = r12
            r12 = 48
            if (r6 == r12) goto L_0x0221
            r12 = 80
            if (r6 == r12) goto L_0x0215
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r14
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r2
            int r2 = r0.f10008
            int r12 = r12 + r2
            if (r6 >= r12) goto L_0x01fc
            int r2 = r4.topMargin
            int r4 = r0.f10008
            int r6 = r2 + r4
            goto L_0x0213
        L_0x01fc:
            int r5 = r5 - r9
            int r5 = r5 - r14
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r4 = r0.f10040
            int r2 = r2 + r4
            if (r5 >= r2) goto L_0x0213
            int r2 = r13.bottomMargin
            int r4 = r0.f10040
            int r2 = r2 + r4
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0213:
            int r8 = r8 + r6
            goto L_0x022e
        L_0x0215:
            r23 = r2
            int r5 = r5 - r9
            int r2 = r13.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f10040
            int r5 = r5 - r2
            int r8 = r5 - r14
            goto L_0x022e
        L_0x0221:
            r23 = r2
            int r2 = r18.getPaddingTop()
            int r4 = r4.topMargin
            int r2 = r2 + r4
            int r4 = r0.f10008
            int r8 = r2 + r4
        L_0x022e:
            if (r1 == 0) goto L_0x02a2
            if (r15 == 0) goto L_0x0235
            int r1 = r0.f10034
            goto L_0x0236
        L_0x0235:
            r1 = 0
        L_0x0236:
            r2 = 1
            r4 = r11[r2]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r3 = r3 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r2] = r1
            if (r7 == 0) goto L_0x026d
            android.widget.TextView r1 = r0.f10028
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.ιι$ɩ r1 = (o.C2026.C2028) r1
            android.widget.TextView r2 = r0.f10028
            int r2 = r2.getMeasuredWidth()
            int r2 = r3 - r2
            android.widget.TextView r4 = r0.f10028
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f10028
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f10021
            int r2 = r2 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x026e
        L_0x026d:
            r2 = r3
        L_0x026e:
            if (r10 == 0) goto L_0x0296
            android.widget.TextView r1 = r0.f10036
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.ιι$ɩ r1 = (o.C2026.C2028) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f10036
            int r4 = r4.getMeasuredWidth()
            int r4 = r3 - r4
            android.widget.TextView r5 = r0.f10036
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f10036
            r6.layout(r4, r8, r3, r5)
            int r4 = r0.f10021
            int r4 = r3 - r4
            int r1 = r1.bottomMargin
            goto L_0x0297
        L_0x0296:
            r4 = r3
        L_0x0297:
            if (r15 == 0) goto L_0x029e
            int r1 = java.lang.Math.min(r2, r4)
            r3 = r1
        L_0x029e:
            r2 = r23
            goto L_0x030e
        L_0x02a2:
            if (r15 == 0) goto L_0x02a7
            int r1 = r0.f10034
            goto L_0x02a8
        L_0x02a7:
            r1 = 0
        L_0x02a8:
            r2 = 0
            r4 = r11[r2]
            int r1 = r1 - r4
            int r4 = java.lang.Math.max(r2, r1)
            int r4 = r23 + r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r7 == 0) goto L_0x02de
            android.widget.TextView r1 = r0.f10028
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.ιι$ɩ r1 = (o.C2026.C2028) r1
            android.widget.TextView r2 = r0.f10028
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r4
            android.widget.TextView r5 = r0.f10028
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f10028
            r6.layout(r4, r8, r2, r5)
            int r6 = r0.f10021
            int r2 = r2 + r6
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L_0x02df
        L_0x02de:
            r2 = r4
        L_0x02df:
            if (r10 == 0) goto L_0x0305
            android.widget.TextView r1 = r0.f10036
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.ιι$ɩ r1 = (o.C2026.C2028) r1
            int r5 = r1.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.f10036
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r4
            android.widget.TextView r6 = r0.f10036
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r8
            android.widget.TextView r7 = r0.f10036
            r7.layout(r4, r8, r5, r6)
            int r6 = r0.f10021
            int r5 = r5 + r6
            int r1 = r1.bottomMargin
            goto L_0x0306
        L_0x0305:
            r5 = r4
        L_0x0306:
            if (r15 == 0) goto L_0x030d
            int r2 = java.lang.Math.max(r2, r5)
            goto L_0x030e
        L_0x030d:
            r2 = r4
        L_0x030e:
            java.util.ArrayList<android.view.View> r1 = r0.f10029
            r4 = 3
            r0.m10865(r1, r4)
            java.util.ArrayList<android.view.View> r1 = r0.f10029
            int r1 = r1.size()
            r4 = r2
            r2 = 0
        L_0x031c:
            if (r2 >= r1) goto L_0x032f
            java.util.ArrayList<android.view.View> r5 = r0.f10029
            java.lang.Object r5 = r5.get(r2)
            android.view.View r5 = (android.view.View) r5
            r12 = r21
            int r4 = r0.m10863(r5, r4, r11, r12)
            int r2 = r2 + 1
            goto L_0x031c
        L_0x032f:
            r12 = r21
            java.util.ArrayList<android.view.View> r1 = r0.f10029
            r2 = 5
            r0.m10865(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f10029
            int r1 = r1.size()
            r2 = 0
        L_0x033e:
            if (r2 >= r1) goto L_0x034f
            java.util.ArrayList<android.view.View> r5 = r0.f10029
            java.lang.Object r5 = r5.get(r2)
            android.view.View r5 = (android.view.View) r5
            int r3 = r0.m10866(r5, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x033e
        L_0x034f:
            java.util.ArrayList<android.view.View> r1 = r0.f10029
            r2 = 1
            r0.m10865(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f10029
            r5 = 0
            r6 = r11[r5]
            r2 = r11[r2]
            int r5 = r1.size()
            r8 = r2
            r7 = r6
            r2 = 0
            r6 = 0
        L_0x0364:
            if (r2 >= r5) goto L_0x0397
            java.lang.Object r9 = r1.get(r2)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            o.ιι$ɩ r10 = (o.C2026.C2028) r10
            int r13 = r10.leftMargin
            int r13 = r13 - r7
            int r7 = r10.rightMargin
            int r7 = r7 - r8
            r8 = 0
            int r10 = java.lang.Math.max(r8, r13)
            int r14 = java.lang.Math.max(r8, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r8, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r9.getMeasuredWidth()
            int r10 = r10 + r9
            int r10 = r10 + r14
            int r6 = r6 + r10
            int r2 = r2 + 1
            r8 = r7
            r7 = r13
            goto L_0x0364
        L_0x0397:
            r8 = 0
            int r1 = r16 - r17
            int r1 = r1 - r22
            int r1 = r1 / 2
            int r1 = r17 + r1
            int r2 = r6 / 2
            int r1 = r1 - r2
            int r6 = r6 + r1
            if (r1 >= r4) goto L_0x03a7
            goto L_0x03ae
        L_0x03a7:
            if (r6 <= r3) goto L_0x03ad
            int r6 = r6 - r3
            int r4 = r1 - r6
            goto L_0x03ae
        L_0x03ad:
            r4 = r1
        L_0x03ae:
            java.util.ArrayList<android.view.View> r1 = r0.f10029
            int r1 = r1.size()
        L_0x03b4:
            if (r8 >= r1) goto L_0x03c5
            java.util.ArrayList<android.view.View> r2 = r0.f10029
            java.lang.Object r2 = r2.get(r8)
            android.view.View r2 = (android.view.View) r2
            int r4 = r0.m10863(r2, r4, r11, r12)
            int r8 = r8 + 1
            goto L_0x03b4
        L_0x03c5:
            java.util.ArrayList<android.view.View> r1 = r0.f10029
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2026.onLayout(boolean, int, int, int, int):void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private int m10863(View view, int i, int[] iArr, int i2) {
        C2028 r0 = (C2028) view.getLayoutParams();
        int i3 = r0.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int r7 = m10860(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, r7, max + measuredWidth, view.getMeasuredHeight() + r7);
        return max + measuredWidth + r0.rightMargin;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private int m10866(View view, int i, int[] iArr, int i2) {
        C2028 r0 = (C2028) view.getLayoutParams();
        int i3 = r0.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int r8 = m10860(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, r8, max, view.getMeasuredHeight() + r8);
        return max - (measuredWidth + r0.leftMargin);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int m10860(View view, int i) {
        C2028 r0 = (C2028) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int r2 = m10862(r0.f1551);
        if (r2 == 48) {
            return getPaddingTop() - i2;
        }
        if (r2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - r0.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i3 < r0.topMargin) {
            i3 = r0.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            if (i4 < r0.bottomMargin) {
                i3 = Math.max(0, i3 - (r0.bottomMargin - i4));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private int m10862(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f10024 & 112;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m10865(List<View> list, int i) {
        boolean z = C0293.m4156(this) == 1;
        int childCount = getChildCount();
        int r10 = C2409.m12455(i, C0293.m4156(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C2028 r5 = (C2028) childAt.getLayoutParams();
                if (r5.f10053 == 0) {
                    if ((childAt.getParent() == this && childAt.getVisibility() != 8) && m10856(r5.f1551) == r10) {
                        list.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C2028 r6 = (C2028) childAt2.getLayoutParams();
            if (r6.f10053 == 0) {
                if ((childAt2.getParent() == this && childAt2.getVisibility() != 8) && m10856(r6.f1551) == r10) {
                    list.add(childAt2);
                }
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private int m10856(int i) {
        int r0 = C0293.m4156(this);
        int r5 = C2409.m12455(i, r0) & 7;
        if (r5 == 1 || r5 == 3 || r5 == 5) {
            return r5;
        }
        return r0 == 1 ? 5 : 3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static C2028 m10864(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2028) {
            return new C2028((C2028) layoutParams);
        }
        if (layoutParams instanceof C3282auX.C0119) {
            return new C2028((C3282auX.C0119) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C2028((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C2028(layoutParams);
    }

    /* renamed from: ı  reason: contains not printable characters */
    protected static C2028 m10857() {
        return new C2028();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2028);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m10871() {
        for (int size = this.f10044.size() - 1; size >= 0; size--) {
            addView(this.f10044.get(size));
        }
        this.f10044.clear();
    }

    public void setCollapsible(boolean z) {
        this.f10039 = z;
        requestLayout();
    }

    public void setMenuCallbacks(C1483.C1484 r2, C2328.Cif ifVar) {
        this.f10041 = r2;
        this.f10020 = ifVar;
        C2118 r0 = this.f10004;
        if (r0 != null) {
            r0.setMenuCallbacks(r2, ifVar);
        }
    }

    /* renamed from: o.ιι$ɩ  reason: contains not printable characters */
    public static class C2028 extends C3282auX.C0119 {

        /* renamed from: ı  reason: contains not printable characters */
        int f10053 = 0;

        public C2028(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2028() {
            this.f1551 = 8388627;
        }

        public C2028(C2028 r2) {
            super((C3282auX.C0119) r2);
            this.f10053 = r2.f10053;
        }

        public C2028(C3282auX.C0119 r1) {
            super(r1);
        }

        public C2028(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C2028(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: o.ιι$ı  reason: contains not printable characters */
    public static class C2027 extends C1219 {
        public static final Parcelable.Creator<C2027> CREATOR = new Parcelable.ClassLoaderCreator<C2027>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2027(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C2027[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C2027(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ǃ  reason: contains not printable characters */
        int f10051;

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean f10052;

        public C2027(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10051 = parcel.readInt();
            this.f10052 = parcel.readInt() != 0;
        }

        public C2027(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10051);
            parcel.writeInt(this.f10052 ? 1 : 0);
        }
    }

    /* renamed from: o.ιι$If */
    class If implements C1483 {

        /* renamed from: ǃ  reason: contains not printable characters */
        C2459 f10048;

        /* renamed from: ι  reason: contains not printable characters */
        private C2328 f10050;

        /* renamed from: ı  reason: contains not printable characters */
        public final void m10876(C1483.C1484 r1) {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m10877(C2328 r1, boolean z) {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m10878() {
            return false;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m10880(Parcelable parcelable) {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m10881() {
            return 0;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final Parcelable m10882() {
            return null;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m10883(C1653 r1) {
            return false;
        }

        If() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m10884(Context context, C2328 r3) {
            C2459 r0;
            C2328 r2 = this.f10050;
            if (!(r2 == null || (r0 = this.f10048) == null)) {
                r2.m12140(r0);
            }
            this.f10050 = r3;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m10885(boolean z) {
            if (this.f10048 != null) {
                C2328 r5 = this.f10050;
                boolean z2 = false;
                if (r5 != null) {
                    int size = r5.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f10050.getItem(i) == this.f10048) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    m10886(this.f10048);
                }
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m10879(C2459 r7) {
            C2026.this.m10874();
            ViewParent parent = C2026.this.f10031.getParent();
            C2026 r1 = C2026.this;
            if (parent != r1) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(r1.f10031);
                }
                C2026 r0 = C2026.this;
                r0.addView(r0.f10031);
            }
            C2026.this.f10018 = r7.getActionView();
            this.f10048 = r7;
            ViewParent parent2 = C2026.this.f10018.getParent();
            C2026 r12 = C2026.this;
            if (parent2 != r12) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(r12.f10018);
                }
                C2028 r02 = C2026.m10857();
                r02.f1551 = 8388611 | (C2026.this.f10030 & 112);
                r02.f10053 = 2;
                C2026.this.f10018.setLayoutParams(r02);
                C2026 r03 = C2026.this;
                r03.addView(r03.f10018);
            }
            C2026 r04 = C2026.this;
            for (int childCount = r04.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = r04.getChildAt(childCount);
                if (!(((C2028) childAt.getLayoutParams()).f10053 == 2 || childAt == r04.f10004)) {
                    r04.removeViewAt(childCount);
                    r04.f10044.add(childAt);
                }
            }
            C2026.this.requestLayout();
            r7.f11195 = true;
            r7.f11193.m12149(false);
            if (C2026.this.f10018 instanceof CON) {
                ((CON) C2026.this.f10018).onActionViewExpanded();
            }
            return true;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m10886(C2459 r3) {
            if (C2026.this.f10018 instanceof CON) {
                ((CON) C2026.this.f10018).onActionViewCollapsed();
            }
            C2026 r0 = C2026.this;
            r0.removeView(r0.f10018);
            C2026 r02 = C2026.this;
            r02.removeView(r02.f10031);
            C2026 r03 = C2026.this;
            r03.f10018 = null;
            r03.m10871();
            this.f10048 = null;
            C2026.this.requestLayout();
            r3.f11195 = false;
            r3.f11193.m12149(false);
            return true;
        }
    }

    public void setLogo(Drawable drawable) {
        boolean z = false;
        if (drawable != null) {
            if (this.f10006 == null) {
                this.f10006 = new C2147(getContext());
            }
            ImageView imageView = this.f10006;
            if (imageView.getParent() == this || this.f10044.contains(imageView)) {
                z = true;
            }
            if (!z) {
                m10858(this.f10006, true);
            }
        } else {
            ImageView imageView2 = this.f10006;
            if (imageView2 != null) {
                if (imageView2.getParent() == this || this.f10044.contains(imageView2)) {
                    z = true;
                }
                if (z) {
                    removeView(this.f10006);
                    this.f10044.remove(this.f10006);
                }
            }
        }
        ImageView imageView3 = this.f10006;
        if (imageView3 != null) {
            imageView3.setImageDrawable(drawable);
        }
    }

    public void setContentInsetsRelative(int i, int i2) {
        if (this.f10011 == null) {
            this.f10011 = new C2745.C2747();
        }
        this.f10011.m14566(i, i2);
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        if (this.f10011 == null) {
            this.f10011 = new C2745.C2747();
        }
        this.f10011.m14565(i, i2);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int m10870() {
        ImageButton imageButton = this.f10012;
        if ((imageButton != null ? imageButton.getDrawable() : null) != null) {
            C2745.C2747 r0 = this.f10011;
            return Math.max(r0 != null ? r0.f13035 ? r0.f13040 : r0.f13036 : 0, Math.max(this.f10015, 0));
        }
        C2745.C2747 r02 = this.f10011;
        if (r02 != null) {
            return r02.f13035 ? r02.f13040 : r02.f13036;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2028();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2028(getContext(), attributeSet);
    }
}
