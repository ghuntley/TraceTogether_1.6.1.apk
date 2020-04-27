package o;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.C0607;
import o.C2724;

/* renamed from: o.Ł  reason: contains not printable characters */
public class C0520 {

    /* renamed from: ı  reason: contains not printable characters */
    private static int f4301;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final AccessibilityNodeInfo f4302;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f4303 = -1;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f4304 = -1;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m4992(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case C2724.C2725.f12589 /*64*/:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case C0872.f5653 /*4096*/:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: o.Ł$if  reason: invalid class name */
    public static class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        public static final Cif f4306 = new Cif(2, (CharSequence) null);

        /* renamed from: ŀ  reason: contains not printable characters */
        public static final Cif f4307 = new Cif(32768, (CharSequence) null);

        /* renamed from: ł  reason: contains not printable characters */
        public static final Cif f4308 = new Cif(131072, (CharSequence) null, C0607.C0612.class);

        /* renamed from: ſ  reason: contains not printable characters */
        public static final Cif f4309 = new Cif(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C0607) null, (Class<? extends C0607.C0608>) null);

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static final Cif f4310 = new Cif(256, (CharSequence) null, C0607.C0610.class);

        /* renamed from: Ɨ  reason: contains not printable characters */
        public static final Cif f4311 = new Cif(2097152, (CharSequence) null, C0607.C0611.class);

        /* renamed from: ƚ  reason: contains not printable characters */
        public static final Cif f4312 = new Cif(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (C0607) null, (Class<? extends C0607.C0608>) null);

        /* renamed from: ǀ  reason: contains not printable characters */
        public static final Cif f4313 = new Cif(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C0607) null, (Class<? extends C0607.C0608>) null);

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final Cif f4314 = new Cif(4, (CharSequence) null);

        /* renamed from: ȷ  reason: contains not printable characters */
        public static final Cif f4315 = new Cif(8192, (CharSequence) null);

        /* renamed from: ɍ  reason: contains not printable characters */
        public static final Cif f4316 = new Cif(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (C0607) null, C0607.If.class);

        /* renamed from: ɔ  reason: contains not printable characters */
        public static final Cif f4317 = new Cif(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (C0607) null, (Class<? extends C0607.C0608>) null);

        /* renamed from: ɟ  reason: contains not printable characters */
        public static final Cif f4318 = new Cif(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (C0607) null, (Class<? extends C0607.C0608>) null);

        /* renamed from: ɨ  reason: contains not printable characters */
        public static final Cif f4319 = new Cif(1024, (CharSequence) null, C0607.Cif.class);

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final Cif f4320 = new Cif(1, (CharSequence) null);

        /* renamed from: ɪ  reason: contains not printable characters */
        public static final Cif f4321 = new Cif(16384, (CharSequence) null);

        /* renamed from: ɹ  reason: contains not printable characters */
        public static final Cif f4322 = new Cif(64, (CharSequence) null);

        /* renamed from: ɺ  reason: contains not printable characters */
        public static final Cif f4323 = new Cif(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (C0607) null, C0607.C3627iF.class);

        /* renamed from: ɼ  reason: contains not printable characters */
        public static final Cif f4324 = new Cif(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (C0607) null, (Class<? extends C0607.C0608>) null);

        /* renamed from: ɾ  reason: contains not printable characters */
        public static final Cif f4325 = new Cif(C0872.f5653, (CharSequence) null);

        /* renamed from: ɿ  reason: contains not printable characters */
        public static final Cif f4326 = new Cif(262144, (CharSequence) null);

        /* renamed from: ʅ  reason: contains not printable characters */
        public static final Cif f4327 = new Cif(1048576, (CharSequence) null);

        /* renamed from: ʟ  reason: contains not printable characters */
        public static final Cif f4328 = new Cif(524288, (CharSequence) null);

        /* renamed from: Ι  reason: contains not printable characters */
        public static final Cif f4329 = new Cif(16, (CharSequence) null);

        /* renamed from: ι  reason: contains not printable characters */
        public static final Cif f4330 = new Cif(8, (CharSequence) null);

        /* renamed from: ϲ  reason: contains not printable characters */
        public static final Cif f4331 = new Cif(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C0607) null, (Class<? extends C0607.C0608>) null);

        /* renamed from: ϳ  reason: contains not printable characters */
        public static final Cif f4332;

        /* renamed from: І  reason: contains not printable characters */
        public static final Cif f4333 = new Cif(32, (CharSequence) null);

        /* renamed from: г  reason: contains not printable characters */
        public static final Cif f4334 = new Cif(65536, (CharSequence) null);

        /* renamed from: с  reason: contains not printable characters */
        public static final Cif f4335 = new Cif(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C0607) null, C0607.C0609.class);

        /* renamed from: і  reason: contains not printable characters */
        public static final Cif f4336 = new Cif(512, (CharSequence) null, C0607.C0610.class);

        /* renamed from: Ӏ  reason: contains not printable characters */
        public static final Cif f4337 = new Cif(128, (CharSequence) null);

        /* renamed from: ӏ  reason: contains not printable characters */
        public static final Cif f4338 = new Cif(2048, (CharSequence) null, C0607.Cif.class);

        /* renamed from: ɭ  reason: contains not printable characters */
        private final CharSequence f4339;

        /* renamed from: ͻ  reason: contains not printable characters */
        final Object f4340;

        /* renamed from: Ј  reason: contains not printable characters */
        protected final C0607 f4341;

        /* renamed from: ј  reason: contains not printable characters */
        private final int f4342;

        /* renamed from: ґ  reason: contains not printable characters */
        private final Class<? extends C0607.C0608> f4343;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            f4332 = new Cif(accessibilityAction, 16908357, (CharSequence) null, (C0607) null, (Class<? extends C0607.C0608>) null);
        }

        public Cif(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C0607) null, (Class<? extends C0607.C0608>) null);
        }

        private Cif(int i, CharSequence charSequence, Class<? extends C0607.C0608> cls) {
            this((Object) null, i, charSequence, (C0607) null, cls);
        }

        Cif(Object obj, int i, CharSequence charSequence, C0607 r5, Class<? extends C0607.C0608> cls) {
            this.f4342 = i;
            this.f4339 = charSequence;
            this.f4341 = r5;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f4340 = obj;
            } else {
                this.f4340 = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f4343 = cls;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public int m5074() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f4340).getId();
            }
            return 0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m5073(View view, Bundle bundle) {
            if (this.f4341 == null) {
                return false;
            }
            Class<? extends C0607.C0608> cls = this.f4343;
            if (cls != null) {
                try {
                    cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception unused) {
                }
            }
            return this.f4341.m5316(view);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public Cif m5075(CharSequence charSequence, C0607 r9) {
            return new Cif((Object) null, this.f4342, charSequence, r9, this.f4343);
        }
    }

    /* renamed from: o.Ł$ɩ  reason: contains not printable characters */
    public static class C0521 {

        /* renamed from: ǃ  reason: contains not printable characters */
        final Object f4344;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static C0521 m5076(int i, int i2, boolean z, int i3) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new C0521(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                return new C0521(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C0521((Object) null);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static C0521 m5077(int i, int i2, boolean z) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new C0521(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C0521((Object) null);
        }

        C0521(Object obj) {
            this.f4344 = obj;
        }
    }

    /* renamed from: o.Ł$If */
    public static class If {

        /* renamed from: ɩ  reason: contains not printable characters */
        final Object f4305;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static If m5072(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new If(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                return new If(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new If((Object) null);
        }

        If(Object obj) {
            this.f4305 = obj;
        }
    }

    private C0520(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4302 = accessibilityNodeInfo;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0520 m4998(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0520(accessibilityNodeInfo);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public AccessibilityNodeInfo m5006() {
        return this.f4302;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C0520 m4993(View view) {
        return m4998(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C0520 m4995() {
        return m4998(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0520 m4999(C0520 r0) {
        return m4998(AccessibilityNodeInfo.obtain(r0.f4302));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m5057(View view) {
        this.f4303 = -1;
        this.f4302.setSource(view);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5033(View view, int i) {
        this.f4303 = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f4302.setSource(view, i);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public int m5048() {
        return this.f4302.getChildCount();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5032(View view) {
        this.f4302.addChild(view);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m5008(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f4302.addChild(view, i);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public int m5054() {
        return this.f4302.getActions();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5030(int i) {
        this.f4302.addAction(i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private List<Integer> m5002(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f4302.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f4302.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m5052(Cif ifVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4302.addAction((AccessibilityNodeInfo.AccessibilityAction) ifVar.f4340);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m5011(Cif ifVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f4302.removeAction((AccessibilityNodeInfo.AccessibilityAction) ifVar.f4340);
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m5061(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f4302.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m5055(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f4302.setMovementGranularities(i);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public int m5020() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f4302.getMovementGranularities();
        }
        return 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m5007(View view) {
        this.f4304 = -1;
        this.f4302.setParent(view);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m5058(View view, int i) {
        this.f4304 = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f4302.setParent(view, i);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m5056(Rect rect) {
        this.f4302.getBoundsInParent(rect);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m5050(Rect rect) {
        this.f4302.setBoundsInParent(rect);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5031(Rect rect) {
        this.f4302.getBoundsInScreen(rect);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m5021(Rect rect) {
        this.f4302.setBoundsInScreen(rect);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public boolean m5041() {
        return this.f4302.isCheckable();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m5060(boolean z) {
        this.f4302.setCheckable(z);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public boolean m5017() {
        return this.f4302.isChecked();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m5053(boolean z) {
        this.f4302.setChecked(z);
    }

    /* renamed from: І  reason: contains not printable characters */
    public boolean m5064() {
        return this.f4302.isFocusable();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m5010(boolean z) {
        this.f4302.setFocusable(z);
    }

    /* renamed from: і  reason: contains not printable characters */
    public boolean m5067() {
        return this.f4302.isFocused();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m5024(boolean z) {
        this.f4302.setFocused(z);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public boolean m5069() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f4302.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5036(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f4302.setVisibleToUser(z);
        }
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public boolean m5038() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f4302.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public void m5040(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f4302.setAccessibilityFocused(z);
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public boolean m5043() {
        return this.f4302.isSelected();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public void m5016(boolean z) {
        this.f4302.setSelected(z);
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public boolean m5029() {
        return this.f4302.isClickable();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public void m5068(boolean z) {
        this.f4302.setClickable(z);
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public boolean m5026() {
        return this.f4302.isLongClickable();
    }

    /* renamed from: і  reason: contains not printable characters */
    public void m5066(boolean z) {
        this.f4302.setLongClickable(z);
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public boolean m5071() {
        return this.f4302.isEnabled();
    }

    /* renamed from: І  reason: contains not printable characters */
    public void m5063(boolean z) {
        this.f4302.setEnabled(z);
    }

    /* renamed from: ʟ  reason: contains not printable characters */
    public boolean m5047() {
        return this.f4302.isPassword();
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    public boolean m5045() {
        return this.f4302.isScrollable();
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public void m5028(boolean z) {
        this.f4302.setScrollable(z);
    }

    /* renamed from: г  reason: contains not printable characters */
    public CharSequence m5065() {
        return this.f4302.getPackageName();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m5051(CharSequence charSequence) {
        this.f4302.setPackageName(charSequence);
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    public CharSequence m5012() {
        return this.f4302.getClassName();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m5022(CharSequence charSequence) {
        this.f4302.setClassName(charSequence);
    }

    /* renamed from: ł  reason: contains not printable characters */
    public CharSequence m5013() {
        if (!m4994()) {
            return this.f4302.getText();
        }
        List<Integer> r0 = m5002("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> r1 = m5002("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> r2 = m5002("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> r3 = m5002("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f4302.getText(), 0, this.f4302.getText().length()));
        for (int i = 0; i < r0.size(); i++) {
            spannableString.setSpan(new C0533(r3.get(i).intValue(), this, m5027().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), r0.get(i).intValue(), r1.get(i).intValue(), r2.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m5059(CharSequence charSequence) {
        this.f4302.setText(charSequence);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m5009(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 26) {
            m4996();
            m5005(view);
            ClickableSpan[] r0 = m4991(charSequence);
            if (r0 != null && r0.length > 0) {
                m5027().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.f163962131361865);
                SparseArray<WeakReference<ClickableSpan>> r7 = m4997(view);
                for (int i = 0; i < r0.length; i++) {
                    int r2 = m5001(r0[i], r7);
                    r7.put(r2, new WeakReference(r0[i]));
                    m5000(r0[i], (Spanned) charSequence, r2);
                }
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private SparseArray<WeakReference<ClickableSpan>> m4997(View view) {
        SparseArray<WeakReference<ClickableSpan>> r0 = m5004(view);
        if (r0 != null) {
            return r0;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(R.id.f167582131362366, sparseArray);
        return sparseArray;
    }

    /* renamed from: і  reason: contains not printable characters */
    private SparseArray<WeakReference<ClickableSpan>> m5004(View view) {
        return (SparseArray) view.getTag(R.id.f167582131362366);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static ClickableSpan[] m4991(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private int m5001(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f4301;
        f4301 = i2 + 1;
        return i2;
    }

    /* renamed from: ɔ  reason: contains not printable characters */
    private boolean m4994() {
        return !m5002("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: ɼ  reason: contains not printable characters */
    private void m4996() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4302.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f4302.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f4302.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f4302.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m5000(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m5002("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m5002("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m5002("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m5002("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private void m5005(View view) {
        SparseArray<WeakReference<ClickableSpan>> r5 = m5004(view);
        if (r5 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < r5.size(); i++) {
                if (r5.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                r5.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    public CharSequence m5019() {
        return this.f4302.getContentDescription();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5034(CharSequence charSequence) {
        this.f4302.setContentDescription(charSequence);
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    public void m5018() {
        this.f4302.recycle();
    }

    /* renamed from: ſ  reason: contains not printable characters */
    public String m5014() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f4302.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5035(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4302.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0521) obj).f4344);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m5023(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4302.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((If) obj).f4305);
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public void m5039(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4302.setHintText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f4302.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    public void m5062(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4302.setError(charSequence);
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public void m5025(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4302.setCanOpenPopup(z);
        }
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    public Bundle m5027() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f4302.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m5049(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4302.setMaxTextLength(i);
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public void m5042(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4302.setDismissable(z);
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public void m5015(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4302.setPaneTitle(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f4302.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public void m5070(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4302.setScreenReaderFocusable(z);
        } else {
            m5003(1, z);
        }
    }

    /* renamed from: ʅ  reason: contains not printable characters */
    public boolean m5046() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f4302.isShowingHintText();
        }
        return m4990(4);
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public void m5037(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4302.setShowingHintText(z);
        } else {
            m5003(4, z);
        }
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    public void m5044(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4302.setHeading(z);
        } else {
            m5003(2, z);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4302;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0520 r5 = (C0520) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4302;
        if (accessibilityNodeInfo == null) {
            if (r5.f4302 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(r5.f4302)) {
            return false;
        }
        return this.f4303 == r5.f4303 && this.f4304 == r5.f4304;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m5056(rect);
        sb.append("; boundsInParent: ".concat(String.valueOf(rect)));
        m5031(rect);
        sb.append("; boundsInScreen: ".concat(String.valueOf(rect)));
        sb.append("; packageName: ");
        sb.append(m5065());
        sb.append("; className: ");
        sb.append(m5012());
        sb.append("; text: ");
        sb.append(m5013());
        sb.append("; contentDescription: ");
        sb.append(m5019());
        sb.append("; viewId: ");
        sb.append(m5014());
        sb.append("; checkable: ");
        sb.append(m5041());
        sb.append("; checked: ");
        sb.append(m5017());
        sb.append("; focusable: ");
        sb.append(m5064());
        sb.append("; focused: ");
        sb.append(m5067());
        sb.append("; selected: ");
        sb.append(m5043());
        sb.append("; clickable: ");
        sb.append(m5029());
        sb.append("; longClickable: ");
        sb.append(m5026());
        sb.append("; enabled: ");
        sb.append(m5071());
        sb.append("; password: ");
        sb.append(m5047());
        StringBuilder sb2 = new StringBuilder("; scrollable: ");
        sb2.append(m5045());
        sb.append(sb2.toString());
        sb.append("; [");
        int r1 = m5054();
        while (r1 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(r1);
            r1 &= ~numberOfTrailingZeros;
            sb.append(m4992(numberOfTrailingZeros));
            if (r1 != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m5003(int i, boolean z) {
        Bundle r0 = m5027();
        if (r0 != null) {
            int i2 = r0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            r0.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m4990(int i) {
        Bundle r0 = m5027();
        if (r0 != null && (r0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            return true;
        }
        return false;
    }
}
