package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.C2328;
import o.C2407;
import o.C2745;
import o.C2933;
import o.C3282auX;

/* renamed from: o.COn  reason: case insensitive filesystem */
public final class C3255COn extends C3282auX implements C2933.C2935 {

    /* renamed from: ŀ  reason: contains not printable characters */
    private static final Interpolator f1213 = new AccelerateInterpolator();

    /* renamed from: ɿ  reason: contains not printable characters */
    private static final Interpolator f1214 = new DecelerateInterpolator();

    /* renamed from: ı  reason: contains not printable characters */
    C2933 f1215;

    /* renamed from: ł  reason: contains not printable characters */
    final C0493 f1216 = new C0493() {
        /* renamed from: ι  reason: contains not printable characters */
        public final void m1311() {
            ((View) C3255COn.this.f1234.getParent()).invalidate();
        }
    };

    /* renamed from: ſ  reason: contains not printable characters */
    private int f1217 = 0;

    /* renamed from: Ɩ  reason: contains not printable characters */
    View f1218;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private boolean f1219;

    /* renamed from: ƚ  reason: contains not printable characters */
    private ArrayList<C3282auX.Cif> f1220 = new ArrayList<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    C2717 f1221;

    /* renamed from: ȷ  reason: contains not printable characters */
    final C0300 f1222 = new C0321() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m1312(View view) {
            if (C3255COn.this.f1228 && C3255COn.this.f1218 != null) {
                C3255COn.this.f1218.setTranslationY(0.0f);
                C3255COn.this.f1234.setTranslationY(0.0f);
            }
            C3255COn.this.f1234.setVisibility(8);
            C3255COn.this.f1234.setTransitioning(false);
            C3255COn cOn = C3255COn.this;
            cOn.f1227 = null;
            if (cOn.f1238 != null) {
                cOn.f1238.m12450(cOn.f1237);
                cOn.f1237 = null;
                cOn.f1238 = null;
            }
            if (C3255COn.this.f1215 != null) {
                C0293.m4154(C3255COn.this.f1215);
            }
        }
    };

    /* renamed from: ɍ  reason: contains not printable characters */
    private boolean f1223;

    /* renamed from: ɟ  reason: contains not printable characters */
    private boolean f1224 = true;

    /* renamed from: ɨ  reason: contains not printable characters */
    final C0300 f1225 = new C0321() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m1310(View view) {
            C3255COn cOn = C3255COn.this;
            cOn.f1227 = null;
            cOn.f1234.requestLayout();
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    Context f1226;

    /* renamed from: ɪ  reason: contains not printable characters */
    C1608 f1227;

    /* renamed from: ɹ  reason: contains not printable characters */
    boolean f1228 = true;

    /* renamed from: ɼ  reason: contains not printable characters */
    private boolean f1229;

    /* renamed from: ɾ  reason: contains not printable characters */
    boolean f1230;

    /* renamed from: ʅ  reason: contains not printable characters */
    private boolean f1231;

    /* renamed from: ʟ  reason: contains not printable characters */
    private boolean f1232;

    /* renamed from: Ι  reason: contains not printable characters */
    C0308 f1233;

    /* renamed from: ι  reason: contains not printable characters */
    C1771 f1234;

    /* renamed from: І  reason: contains not printable characters */
    Cif f1235;

    /* renamed from: г  reason: contains not printable characters */
    private Context f1236;

    /* renamed from: і  reason: contains not printable characters */
    C2407 f1237;

    /* renamed from: Ӏ  reason: contains not printable characters */
    C2407.If f1238;

    /* renamed from: ӏ  reason: contains not printable characters */
    boolean f1239;

    /* renamed from: і  reason: contains not printable characters */
    static boolean m1288(boolean z) {
        return !z;
    }

    public C3255COn(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        m1287(decorView);
        if (!z) {
            this.f1218 = decorView.findViewById(16908290);
        }
    }

    public C3255COn(Dialog dialog) {
        new ArrayList();
        m1287(dialog.getWindow().getDecorView());
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m1287(View view) {
        this.f1215 = (C2933) view.findViewById(R.id.f165022131362008);
        C2933 r0 = this.f1215;
        if (r0 != null) {
            r0.setActionBarVisibilityCallback(this);
        }
        this.f1221 = m1284(view.findViewById(R.id.f164292131361899));
        this.f1233 = (C0308) view.findViewById(R.id.f164352131361907);
        this.f1234 = (C1771) view.findViewById(R.id.f164312131361901);
        C2717 r5 = this.f1221;
        if (r5 == null || this.f1233 == null || this.f1234 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.f1226 = r5.m14425();
        if ((this.f1221.m14436() & 4) != 0) {
            this.f1232 = true;
        }
        C1560 r02 = new C1560(this.f1226);
        int i = r02.f8311.getApplicationInfo().targetSdkVersion;
        this.f1223 = r02.f8311.getResources().getBoolean(R.bool.f155672131034112);
        this.f1234.setTabContainer((C0925) null);
        this.f1221.m14429();
        this.f1215.setHasNonEmbeddedTabs(false);
        TypedArray obtainStyledAttributes = this.f1226.obtainStyledAttributes((AttributeSet) null, C2745.aux.f12818, R.attr.f148162130968582, 0);
        if (obtainStyledAttributes.getBoolean(C2745.aux.f12882, false)) {
            m1641();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C2745.aux.f12951, 0);
        if (dimensionPixelSize != 0) {
            C0293.m4163((View) this.f1234, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C2717 m1284(View view) {
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
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m1296(Configuration configuration) {
        this.f1223 = new C1560(this.f1226).f8311.getResources().getBoolean(R.bool.f155672131034112);
        this.f1234.setTabContainer((C0925) null);
        this.f1221.m14429();
        this.f1215.setHasNonEmbeddedTabs(false);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1305(int i) {
        this.f1217 = i;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1294(boolean z) {
        C1608 r1;
        this.f1229 = z;
        if (!z && (r1 = this.f1227) != null) {
            r1.m9338();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1307(boolean z) {
        if (z != this.f1219) {
            this.f1219 = z;
            int size = this.f1220.size();
            for (int i = 0; i < size; i++) {
                this.f1220.get(i);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1306(CharSequence charSequence) {
        this.f1221.m14439(charSequence);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m1302(CharSequence charSequence) {
        this.f1221.m14428(charSequence);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m1293() {
        return this.f1221.m14436();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2407 m1301(C2407.If ifR) {
        Cif ifVar = this.f1235;
        if (ifVar != null) {
            ifVar.m12437();
        }
        this.f1215.setHideOnContentScrollEnabled(false);
        this.f1233.m4368();
        Cif ifVar2 = new Cif(this.f1233.getContext(), ifR);
        if (!ifVar2.m1314()) {
            return null;
        }
        this.f1235 = ifVar2;
        ifVar2.m12445();
        this.f1233.m4370(ifVar2);
        m1308(true);
        this.f1233.sendAccessibilityEvent(32);
        return ifVar2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m1291(boolean z) {
        this.f1228 = z;
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    private void m1285() {
        if (!this.f1231) {
            this.f1231 = true;
            C2933 r1 = this.f1215;
            if (r1 != null) {
                r1.setShowingForActionMode(true);
            }
            m1289(false);
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m1292() {
        if (this.f1230) {
            this.f1230 = false;
            m1289(true);
        }
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    private void m1290() {
        if (this.f1231) {
            this.f1231 = false;
            C2933 r1 = this.f1215;
            if (r1 != null) {
                r1.setShowingForActionMode(false);
            }
            m1289(false);
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m1298() {
        if (!this.f1230) {
            this.f1230 = true;
            m1289(true);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1304() {
        if (this.f1215.f13636) {
            this.f1239 = true;
            this.f1215.setHideOnContentScrollEnabled(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private void m1289(boolean z) {
        if (this.f1231 || !this.f1230) {
            if (!this.f1224) {
                this.f1224 = true;
                m1283(z);
            }
        } else if (this.f1224) {
            this.f1224 = false;
            m1286(z);
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private void m1283(boolean z) {
        View view;
        View view2;
        C1608 r0 = this.f1227;
        if (r0 != null) {
            r0.m9338();
        }
        this.f1234.setVisibility(0);
        if (this.f1217 != 0 || (!this.f1229 && !z)) {
            this.f1234.setAlpha(1.0f);
            this.f1234.setTranslationY(0.0f);
            if (this.f1228 && (view = this.f1218) != null) {
                view.setTranslationY(0.0f);
            }
            this.f1225.m4277((View) null);
        } else {
            this.f1234.setTranslationY(0.0f);
            float f = (float) (-this.f1234.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f1234.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f1234.setTranslationY(f);
            C1608 r5 = new C1608();
            C0358 r2 = C0293.m4169(this.f1234).m4532(0.0f);
            r2.m4527(this.f1216);
            r5.m9331(r2);
            if (this.f1228 && (view2 = this.f1218) != null) {
                view2.setTranslationY(f);
                r5.m9331(C0293.m4169(this.f1218).m4532(0.0f));
            }
            r5.m9336(f1214);
            r5.m9335(250);
            r5.m9337(this.f1225);
            this.f1227 = r5;
            r5.m9332();
        }
        C2933 r52 = this.f1215;
        if (r52 != null) {
            C0293.m4154(r52);
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private void m1286(boolean z) {
        View view;
        C1608 r0 = this.f1227;
        if (r0 != null) {
            r0.m9338();
        }
        if (this.f1217 != 0 || (!this.f1229 && !z)) {
            this.f1222.m4277((View) null);
            return;
        }
        this.f1234.setAlpha(1.0f);
        this.f1234.setTransitioning(true);
        C1608 r02 = new C1608();
        float f = (float) (-this.f1234.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f1234.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0358 r5 = C0293.m4169(this.f1234).m4532(f);
        r5.m4527(this.f1216);
        r02.m9331(r5);
        if (this.f1228 && (view = this.f1218) != null) {
            r02.m9331(C0293.m4169(view).m4532(f));
        }
        r02.m9336(f1213);
        r02.m9335(250);
        r02.m9337(this.f1222);
        this.f1227 = r02;
        r02.m9332();
    }

    /* renamed from: І  reason: contains not printable characters */
    public final void m1308(boolean z) {
        C0358 r9;
        C0358 r0;
        if (z) {
            m1285();
        } else {
            m1290();
        }
        if (C0293.m4186(this.f1234)) {
            if (z) {
                r9 = this.f1221.m14422(4, 100);
                r0 = this.f1233.m4369(0, 200);
            } else {
                r0 = this.f1221.m14422(0, 200);
                r9 = this.f1233.m4369(8, 100);
            }
            C1608 r1 = new C1608();
            r1.m9333(r9, r0);
            r1.m9332();
        } else if (z) {
            this.f1221.m14426(4);
            this.f1233.setVisibility(0);
        } else {
            this.f1221.m14426(0);
            this.f1233.setVisibility(8);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Context m1300() {
        if (this.f1236 == null) {
            TypedValue typedValue = new TypedValue();
            this.f1226.getTheme().resolveAttribute(R.attr.f148212130968587, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1236 = new ContextThemeWrapper(this.f1226, i);
            } else {
                this.f1236 = this.f1226;
            }
        }
        return this.f1236;
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final void m1299() {
        C1608 r0 = this.f1227;
        if (r0 != null) {
            r0.m9338();
            this.f1227 = null;
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    public final boolean m1309() {
        C2717 r0 = this.f1221;
        if (r0 == null || !r0.m14423()) {
            return false;
        }
        this.f1221.m14441();
        return true;
    }

    /* renamed from: o.COn$if  reason: invalid class name */
    public class Cif extends C2407 implements C2328.Cif {

        /* renamed from: Ɩ  reason: contains not printable characters */
        private WeakReference<View> f1244;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Context f1245;

        /* renamed from: Ι  reason: contains not printable characters */
        final C2328 f1246;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private C2407.If f1247;

        public Cif(Context context, C2407.If ifR) {
            this.f1245 = context;
            this.f1247 = ifR;
            C2328 r1 = new C2328(context);
            r1.f10810 = 1;
            this.f1246 = r1;
            this.f1246.m12148((C2328.Cif) this);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final MenuInflater m1323() {
            return new C0491(this.f1245);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final Menu m1319() {
            return this.f1246;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m1316() {
            if (C3255COn.this.f1235 == this) {
                if (!C3255COn.m1288(C3255COn.this.f1230)) {
                    C3255COn cOn = C3255COn.this;
                    cOn.f1237 = this;
                    cOn.f1238 = this.f1247;
                } else {
                    this.f1247.m12450(this);
                }
                this.f1247 = null;
                C3255COn.this.m1308(false);
                C3255COn.this.f1233.m4367();
                C3255COn.this.f1221.m14437().sendAccessibilityEvent(32);
                C3255COn.this.f1215.setHideOnContentScrollEnabled(C3255COn.this.f1239);
                C3255COn.this.f1235 = null;
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m1325() {
            if (C3255COn.this.f1235 == this) {
                C2328 r0 = this.f1246;
                if (!r0.f10820) {
                    r0.f10820 = true;
                    r0.f10809 = false;
                    r0.f10811 = false;
                }
                try {
                    this.f1247.m12451((C2407) this, (Menu) this.f1246);
                } finally {
                    C2328 r1 = this.f1246;
                    r1.f10820 = false;
                    if (r1.f10809) {
                        r1.f10809 = false;
                        r1.m12149(r1.f10811);
                    }
                }
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m1314() {
            C2328 r0 = this.f1246;
            if (!r0.f10820) {
                r0.f10820 = true;
                r0.f10809 = false;
                r0.f10811 = false;
            }
            try {
                return this.f1247.m12449(this, this.f1246);
            } finally {
                C2328 r1 = this.f1246;
                r1.f10820 = false;
                if (r1.f10809) {
                    r1.f10809 = false;
                    r1.m12149(r1.f10811);
                }
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m1318(View view) {
            C3255COn.this.f1233.setCustomView(view);
            this.f1244 = new WeakReference<>(view);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1324(CharSequence charSequence) {
            C3255COn.this.f1233.setSubtitle(charSequence);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1313(CharSequence charSequence) {
            C3255COn.this.f1233.setTitle(charSequence);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m1317(int i) {
            C3255COn.this.f1233.setTitle(C3255COn.this.f1226.getResources().getString(i));
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m1320(int i) {
            C3255COn.this.f1233.setSubtitle(C3255COn.this.f1226.getResources().getString(i));
        }

        /* renamed from: і  reason: contains not printable characters */
        public final CharSequence m1329() {
            return C3255COn.this.f1233.f3609;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public final CharSequence m1315() {
            return C3255COn.this.f1233.f3612;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m1327(boolean z) {
            super.m12446(z);
            C3255COn.this.f1233.setTitleOptional(z);
        }

        /* renamed from: І  reason: contains not printable characters */
        public final boolean m1328() {
            return C3255COn.this.f1233.f3611;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final View m1322() {
            WeakReference<View> weakReference = this.f1244;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m1321(C2328 r1, MenuItem menuItem) {
            C2407.If ifR = this.f1247;
            if (ifR != null) {
                return ifR.m12452((C2407) this, menuItem);
            }
            return false;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m1326(C2328 r1) {
            if (this.f1247 != null) {
                m12445();
                C3255COn.this.f1233.m4371();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m1297(boolean z) {
        if (!this.f1232) {
            m1640(z);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m1295(int i, KeyEvent keyEvent) {
        C2328 r0;
        Cif ifVar = this.f1235;
        if (ifVar == null || (r0 = ifVar.f1246) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        r0.setQwertyMode(z);
        return r0.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m1303(boolean z) {
        int i = z ? 4 : 0;
        int r1 = this.f1221.m14436();
        this.f1232 = true;
        this.f1221.m14430((i & 4) | (r1 & -5));
    }
}
