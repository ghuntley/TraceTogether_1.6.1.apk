package o;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: o.ѥı  reason: contains not printable characters */
public class C2639 extends RelativeLayout {

    /* renamed from: ͻ  reason: contains not printable characters */
    private static String f11998 = "http://schemas.android.com/apk/res/android";

    /* renamed from: с  reason: contains not printable characters */
    private static int f11999 = 91;

    /* renamed from: ı  reason: contains not printable characters */
    C2987 f12000;

    /* renamed from: ıı  reason: contains not printable characters */
    private boolean f12001 = false;

    /* renamed from: ıǃ  reason: contains not printable characters */
    private int f12002;

    /* renamed from: ŀ  reason: contains not printable characters */
    Typeface f12003;

    /* renamed from: ł  reason: contains not printable characters */
    String f12004;

    /* renamed from: ſ  reason: contains not printable characters */
    Cif f12005;

    /* renamed from: Ɩ  reason: contains not printable characters */
    boolean f12006 = true;

    /* renamed from: Ɨ  reason: contains not printable characters */
    List<C2987> f12007;

    /* renamed from: ƚ  reason: contains not printable characters */
    boolean f12008;

    /* renamed from: ǀ  reason: contains not printable characters */
    int f12009;

    /* renamed from: ǃ  reason: contains not printable characters */
    Context f12010;

    /* renamed from: ǃı  reason: contains not printable characters */
    private String f12011;

    /* renamed from: ǃǃ  reason: contains not printable characters */
    private int f12012;

    /* renamed from: ȷ  reason: contains not printable characters */
    boolean f12013 = false;

    /* renamed from: ɂ  reason: contains not printable characters */
    private String f12014;

    /* renamed from: Ɉ  reason: contains not printable characters */
    private int f12015;

    /* renamed from: ɉ  reason: contains not printable characters */
    private boolean f12016;

    /* renamed from: ɍ  reason: contains not printable characters */
    C2642 f12017;

    /* renamed from: ɔ  reason: contains not printable characters */
    int f12018;

    /* renamed from: ɟ  reason: contains not printable characters */
    int f12019;

    /* renamed from: ɨ  reason: contains not printable characters */
    boolean f12020 = false;

    /* renamed from: ɩ  reason: contains not printable characters */
    String f12021 = "CCP_PREF_FILE";

    /* renamed from: ɪ  reason: contains not printable characters */
    boolean f12022 = false;

    /* renamed from: ɭ  reason: contains not printable characters */
    private ImageView f12023;

    /* renamed from: ɹ  reason: contains not printable characters */
    boolean f12024 = true;

    /* renamed from: ɺ  reason: contains not printable characters */
    int f12025;

    /* renamed from: ɻ  reason: contains not printable characters */
    private C3649If f12026 = C3649If.SIM_NETWORK_LOCALE;

    /* renamed from: ɼ  reason: contains not printable characters */
    int f12027;

    /* renamed from: ɾ  reason: contains not printable characters */
    boolean f12028 = true;

    /* renamed from: ɿ  reason: contains not printable characters */
    int f12029;

    /* renamed from: ʃ  reason: contains not printable characters */
    private String f12030;

    /* renamed from: ʅ  reason: contains not printable characters */
    boolean f12031;

    /* renamed from: ʌ  reason: contains not printable characters */
    private String f12032;

    /* renamed from: ʏ  reason: contains not printable characters */
    private LinearLayout f12033;

    /* renamed from: ʔ  reason: contains not printable characters */
    private RelativeLayout f12034;

    /* renamed from: ʕ  reason: contains not printable characters */
    private boolean f12035 = true;

    /* renamed from: ʖ  reason: contains not printable characters */
    private boolean f12036 = true;

    /* renamed from: ʟ  reason: contains not printable characters */
    List<C2987> f12037;

    /* renamed from: ͼ  reason: contains not printable characters */
    private Cif f12038;

    /* renamed from: ͽ  reason: contains not printable characters */
    private boolean f12039;

    /* renamed from: Γ  reason: contains not printable characters */
    private boolean f12040 = true;

    /* renamed from: Ι  reason: contains not printable characters */
    C2639 f12041;

    /* renamed from: ι  reason: contains not printable characters */
    C2987 f12042;

    /* renamed from: τ  reason: contains not printable characters */
    private int f12043;

    /* renamed from: ϲ  reason: contains not printable characters */
    private int f12044;

    /* renamed from: ϳ  reason: contains not printable characters */
    private View f12045;

    /* renamed from: І  reason: contains not printable characters */
    boolean f12046 = true;

    /* renamed from: Ј  reason: contains not printable characters */
    private String f12047;

    /* renamed from: Г  reason: contains not printable characters */
    private boolean f12048 = true;

    /* renamed from: г  reason: contains not printable characters */
    int f12049;

    /* renamed from: т  reason: contains not printable characters */
    private TextView f12050;

    /* renamed from: х  reason: contains not printable characters */
    private ImageView f12051;

    /* renamed from: ч  reason: contains not printable characters */
    private View.OnClickListener f12052;

    /* renamed from: і  reason: contains not printable characters */
    boolean f12053 = true;

    /* renamed from: ј  reason: contains not printable characters */
    private LayoutInflater f12054;

    /* renamed from: ґ  reason: contains not printable characters */
    private LinearLayout f12055;

    /* renamed from: Ӏ  reason: contains not printable characters */
    boolean f12056 = true;

    /* renamed from: ӏ  reason: contains not printable characters */
    boolean f12057 = false;

    /* renamed from: ӷ  reason: contains not printable characters */
    private boolean f12058 = false;

    /* renamed from: o.ѥı$aux */
    public enum aux {
        MOBILE,
        FIXED_LINE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    /* renamed from: o.ѥı$iF  reason: case insensitive filesystem */
    public interface C3650iF {
    }

    /* renamed from: o.ѥı$ı  reason: contains not printable characters */
    public interface C2640 {
    }

    /* renamed from: o.ѥı$ǃ  reason: contains not printable characters */
    public interface C2641 {
    }

    /* renamed from: o.ѥı$ɩ  reason: contains not printable characters */
    public interface C2642 {
        /* renamed from: ı  reason: contains not printable characters */
        String m14001();

        /* renamed from: ǃ  reason: contains not printable characters */
        String m14002();

        /* renamed from: ι  reason: contains not printable characters */
        String m14003();
    }

    /* renamed from: o.ѥı$Ι  reason: contains not printable characters */
    public interface C2643 {
    }

    /* renamed from: І  reason: contains not printable characters */
    static /* synthetic */ View.OnClickListener m13989() {
        return null;
    }

    public void setAutoDetectionFailureListener(C2641 r1) {
    }

    public void setDetectCountryWithAreaCode(boolean z) {
    }

    public void setDialogEventsListener(C2640 r1) {
    }

    public void setHintExampleNumberEnabled(boolean z) {
    }

    public void setHintExampleNumberType(aux aux2) {
    }

    public void setInternationalFormattingOnly(boolean z) {
    }

    public void setNumberAutoFormattingEnabled(boolean z) {
    }

    public void setOnCountryChangeListener(C3650iF iFVar) {
    }

    public void setPhoneNumberValidityChangeListener(C2643 r1) {
    }

    public C2639(Context context) {
        super(context);
        aux aux2 = aux.MOBILE;
        this.f12004 = "ccp_last_selection";
        this.f12043 = -99;
        this.f12012 = -99;
        this.f12002 = 0;
        this.f12049 = 0;
        this.f12038 = Cif.ENGLISH;
        this.f12005 = Cif.ENGLISH;
        this.f12008 = true;
        this.f12031 = true;
        this.f12039 = false;
        this.f12016 = false;
        this.f12032 = "notSet";
        this.f12019 = 0;
        this.f12009 = 0;
        this.f12052 = new View.OnClickListener() {
            public final void onClick(View view) {
                C2639.m13989();
                if (!C2639.this.f12031) {
                    return;
                }
                if (C2639.this.f12020) {
                    C2639 r2 = C2639.this;
                    if (r2.f12042 == null) {
                        r2.m13994(r2.f12000);
                    }
                    C3128.m15861(r2.f12041, r2.f12042.f13769.toUpperCase());
                    return;
                }
                C3128.m15861(C2639.this.f12041, (String) null);
            }
        };
        this.f12010 = context;
        m13988((AttributeSet) null);
    }

    public C2639(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        aux aux2 = aux.MOBILE;
        this.f12004 = "ccp_last_selection";
        this.f12043 = -99;
        this.f12012 = -99;
        this.f12002 = 0;
        this.f12049 = 0;
        this.f12038 = Cif.ENGLISH;
        this.f12005 = Cif.ENGLISH;
        this.f12008 = true;
        this.f12031 = true;
        this.f12039 = false;
        this.f12016 = false;
        this.f12032 = "notSet";
        this.f12019 = 0;
        this.f12009 = 0;
        this.f12052 = new View.OnClickListener() {
            public final void onClick(View view) {
                C2639.m13989();
                if (!C2639.this.f12031) {
                    return;
                }
                if (C2639.this.f12020) {
                    C2639 r2 = C2639.this;
                    if (r2.f12042 == null) {
                        r2.m13994(r2.f12000);
                    }
                    C3128.m15861(r2.f12041, r2.f12042.f13769.toUpperCase());
                    return;
                }
                C3128.m15861(C2639.this.f12041, (String) null);
            }
        };
        this.f12010 = context;
        m13988(attributeSet);
    }

    public C2639(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aux aux2 = aux.MOBILE;
        this.f12004 = "ccp_last_selection";
        this.f12043 = -99;
        this.f12012 = -99;
        this.f12002 = 0;
        this.f12049 = 0;
        this.f12038 = Cif.ENGLISH;
        this.f12005 = Cif.ENGLISH;
        this.f12008 = true;
        this.f12031 = true;
        this.f12039 = false;
        this.f12016 = false;
        this.f12032 = "notSet";
        this.f12019 = 0;
        this.f12009 = 0;
        this.f12052 = new View.OnClickListener() {
            public final void onClick(View view) {
                C2639.m13989();
                if (!C2639.this.f12031) {
                    return;
                }
                if (C2639.this.f12020) {
                    C2639 r2 = C2639.this;
                    if (r2.f12042 == null) {
                        r2.m13994(r2.f12000);
                    }
                    C3128.m15861(r2.f12041, r2.f12042.f13769.toUpperCase());
                    return;
                }
                C3128.m15861(C2639.this.f12041, (String) null);
            }
        };
        this.f12010 = context;
        m13988(attributeSet);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m13988(AttributeSet attributeSet) {
        String str;
        this.f12054 = LayoutInflater.from(this.f12010);
        if (attributeSet != null) {
            this.f12032 = attributeSet.getAttributeValue(f11998, "layout_width");
        }
        removeAllViewsInLayout();
        if (attributeSet == null || (str = this.f12032) == null || (!str.equals("-1") && !this.f12032.equals("-1") && !this.f12032.equals("fill_parent") && !this.f12032.equals("match_parent"))) {
            this.f12045 = this.f12054.inflate(R.layout.f169312131558475, this, true);
        } else {
            this.f12045 = this.f12054.inflate(R.layout.f169322131558476, this, true);
        }
        this.f12050 = (TextView) this.f12045.findViewById(R.id.f167702131362384);
        this.f12045.findViewById(R.id.f164962131362000);
        this.f12051 = (ImageView) this.f12045.findViewById(R.id.f165432131362088);
        this.f12023 = (ImageView) this.f12045.findViewById(R.id.f165442131362089);
        this.f12033 = (LinearLayout) this.f12045.findViewById(R.id.f165652131362117);
        this.f12055 = (LinearLayout) this.f12045.findViewById(R.id.f165642131362116);
        this.f12034 = (RelativeLayout) this.f12045.findViewById(R.id.f167142131362299);
        this.f12041 = this;
        if (attributeSet != null) {
            m13982(attributeSet);
        }
        this.f12034.setOnClickListener(this.f12052);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0300 A[Catch:{ Exception -> 0x031d, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01dc A[Catch:{ Exception -> 0x031d, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01fb A[Catch:{ Exception -> 0x031d, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x021d A[Catch:{ Exception -> 0x031d, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0242 A[Catch:{ Exception -> 0x031d, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0285 A[Catch:{ Exception -> 0x031d, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x028c A[Catch:{ Exception -> 0x031d, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02a1 A[Catch:{ Exception -> 0x031d, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02aa A[Catch:{ Exception -> 0x031d, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02b1 A[Catch:{ Exception -> 0x031d, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02c6 A[Catch:{ Exception -> 0x031d, all -> 0x0318 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02ec A[Catch:{ Exception -> 0x031d, all -> 0x0318 }] */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13982(android.util.AttributeSet r8) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f12010
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = o.C3079.Cif.f14100
            r2 = 0
            android.content.res.TypedArray r8 = r0.obtainStyledAttributes(r8, r1, r2, r2)
            int r0 = o.C3079.Cif.f14093     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r1 = 1
            boolean r0 = r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12036 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14075     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14088     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12035 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14078     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r3 = r7.f12035     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r3)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12056 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14113     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12028 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14084     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12046 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14069     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12013 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14094     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12058 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14090     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12006 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14073     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12020 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14110     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12001 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14082     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12024 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14099     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getColor(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12049 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14112     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getColor(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12019 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14083     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getResourceId(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12009 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14074     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12039 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14070     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14111     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12022 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14102     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r8.getBoolean(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14101     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14098     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r8.getInt(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.C2639.aux.values()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14108     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12004 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.lang.String r0 = r7.f12004     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = "CCP_last_selection"
            r7.f12004 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x00bc:
            int r0 = o.C3079.Cif.f14092     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r3 = 123(0x7b, float:1.72E-43)
            int r0 = r8.getInt(r0, r3)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.ѥı$If r0 = o.C2639.C3649If.m14000(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12026 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14071     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12016 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14085     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12048 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r7.f12048     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 == 0) goto L_0x00e8
            android.widget.ImageView r0 = r7.f12051     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r0.setVisibility(r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            goto L_0x00ef
        L_0x00e8:
            android.widget.ImageView r0 = r7.f12051     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r3 = 8
            r0.setVisibility(r3)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x00ef:
            int r0 = o.C3079.Cif.f14109     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12057 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14107     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12040 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.m13986()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r7.isInEditMode()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x010d
            o.Ԟ r0 = r7.f12042     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.m13994((o.C2987) r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x010d:
            int r0 = o.C3079.Cif.f14086     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.setDialogKeyboardAutoPopup(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14076     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.ѥı$if r3 = o.C2639.Cif.ENGLISH     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r3 = r3.ordinal()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getInt(r0, r3)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.ѥı$if[] r3 = o.C2639.Cif.values()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r3 = r3.length     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 >= r3) goto L_0x0130
            o.ѥı$if[] r3 = o.C2639.Cif.values()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r0 = r3[r0]     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            goto L_0x0132
        L_0x0130:
            o.ѥı$if r0 = o.C2639.Cif.ENGLISH     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x0132:
            r7.f12038 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.m13998()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14081     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12011 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14106     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12030 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r7.isInEditMode()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x0150
            r7.m13999()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x0150:
            int r0 = o.C3079.Cif.f14080     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12014 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r7.isInEditMode()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x0161
            r7.m13993()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x0161:
            int r0 = o.C3079.Cif.f14096     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.hasValue(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 == 0) goto L_0x0171
            int r0 = o.C3079.Cif.f14096     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getInt(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12002 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x0171:
            int r0 = r7.f12002     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.m13980((int) r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14087     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12047 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.lang.String r0 = r7.f12047     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.lang.String r3 = "IN"
            if (r0 == 0) goto L_0x01e9
            java.lang.String r0 = r7.f12047     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 == 0) goto L_0x01e9
            boolean r0 = r7.isInEditMode()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x01c2
            android.content.Context r0 = r7.getContext()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.ѥı$if r4 = r7.f12005     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r4 != 0) goto L_0x019d
            r7.m13998()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x019d:
            o.ѥı$if r4 = r7.f12005     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.lang.String r5 = r7.f12047     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.Ԟ r0 = o.C2987.m15328(r0, r4, r5)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 == 0) goto L_0x01d9
            android.content.Context r0 = r7.getContext()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.ѥı$if r4 = r7.f12005     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r4 != 0) goto L_0x01b2
            r7.m13998()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x01b2:
            o.ѥı$if r4 = r7.f12005     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.lang.String r5 = r7.f12047     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.Ԟ r0 = o.C2987.m15328(r0, r4, r5)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12000 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.Ԟ r0 = r7.f12000     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.m13994((o.C2987) r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            goto L_0x01d7
        L_0x01c2:
            java.lang.String r0 = r7.f12047     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.Ԟ r0 = o.C2987.m15330(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = r7.f12047     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.Ԟ r0 = o.C2987.m15330(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12000 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.Ԟ r0 = r7.f12000     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.m13994((o.C2987) r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x01d7:
            r0 = 1
            goto L_0x01da
        L_0x01d9:
            r0 = 0
        L_0x01da:
            if (r0 != 0) goto L_0x01ea
            o.Ԟ r0 = o.C2987.m15330(r3)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12000 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.Ԟ r0 = r7.f12000     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.m13994((o.C2987) r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r0 = 1
            goto L_0x01ea
        L_0x01e9:
            r0 = 0
        L_0x01ea:
            int r4 = o.C3079.Cif.f14089     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r5 = -1
            int r4 = r8.getInteger(r4, r5)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x023e
            if (r4 == r5) goto L_0x023e
            boolean r0 = r7.isInEditMode()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x021d
            if (r4 == r5) goto L_0x0214
            android.content.Context r0 = r7.getContext()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.ѥı$if r5 = r7.f12005     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r5 != 0) goto L_0x0208
            r7.m13998()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x0208:
            o.ѥı$if r5 = r7.f12005     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.util.List<o.Ԟ> r6 = r7.f12037     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.Ԟ r0 = o.C2987.m15329(r0, r5, r6, r4)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x0214
            int r4 = f11999     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x0214:
            r7.setDefaultCountryUsingPhoneCode(r4)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.Ԟ r0 = r7.f12000     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.m13994((o.C2987) r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            goto L_0x023e
        L_0x021d:
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.Ԟ r0 = o.C2987.m15323(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x0239
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r0.<init>()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r4 = f11999     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r0.append(r4)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.Ԟ r0 = o.C2987.m15323(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x0239:
            r7.f12000 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.m13994((o.C2987) r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x023e:
            o.Ԟ r0 = r7.f12000     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x025a
            o.Ԟ r0 = o.C2987.m15330(r3)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12000 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            o.Ԟ r0 = r7.f12042     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x0251
            o.Ԟ r0 = r7.f12000     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.m13994((o.C2987) r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x0251:
            o.Ԟ r0 = r7.f12042     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x025a
            o.Ԟ r0 = r7.f12000     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.m13994((o.C2987) r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x025a:
            boolean r0 = r7.f12016     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 == 0) goto L_0x0267
            boolean r0 = r7.isInEditMode()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x0267
            r7.setAutoDetectedCountry(r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x0267:
            boolean r0 = r7.f12022     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 == 0) goto L_0x0274
            boolean r0 = r7.isInEditMode()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 != 0) goto L_0x0274
            r7.m13981()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x0274:
            int r0 = o.C3079.Cif.f14097     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r3 = -99
            int r0 = r8.getColor(r0, r3)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.setArrowColor(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r7.isInEditMode()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 == 0) goto L_0x028c
            int r0 = o.C3079.Cif.f14072     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getColor(r0, r3)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            goto L_0x029f
        L_0x028c:
            int r0 = o.C3079.Cif.f14072     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            android.content.Context r4 = r7.f12010     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r5 = 2131099713(0x7f060041, float:1.7811787E38)
            int r4 = r4.getColor(r5)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getColor(r0, r4)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x029f:
            if (r0 == r3) goto L_0x02a4
            r7.setContentColor(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x02a4:
            boolean r0 = r7.isInEditMode()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 == 0) goto L_0x02b1
            int r0 = o.C3079.Cif.f14104     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getColor(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            goto L_0x02c4
        L_0x02b1:
            int r0 = o.C3079.Cif.f14104     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            android.content.Context r3 = r7.f12010     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r4 = 2131099712(0x7f060040, float:1.7811785E38)
            int r3 = r3.getColor(r4)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getColor(r0, r3)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x02c4:
            if (r0 == 0) goto L_0x02c9
            r7.setFlagBorderColor(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x02c9:
            int r0 = o.C3079.Cif.f14068     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getColor(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.setDialogBackgroundColor(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14105     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getColor(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.setDialogTextColor(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14103     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getColor(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.setDialogSearchEditTextTintColor(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14095     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getDimensionPixelSize(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 <= 0) goto L_0x02f8
            android.widget.TextView r3 = r7.f12050     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            float r4 = (float) r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r3.setTextSize(r2, r4)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.setFlagSize(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.setArrowSize(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x02f8:
            int r0 = o.C3079.Cif.f14091     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = r8.getDimensionPixelSize(r0, r2)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            if (r0 <= 0) goto L_0x0303
            r7.setArrowSize(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
        L_0x0303:
            int r0 = o.C3079.Cif.f14077     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.f12053 = r0     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            int r0 = o.C3079.Cif.f14079     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            boolean r0 = r8.getBoolean(r0, r1)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r7.setCcpClickable(r0)     // Catch:{ Exception -> 0x031d, all -> 0x0318 }
            r8.recycle()
            return
        L_0x0318:
            r0 = move-exception
            r8.recycle()
            throw r0
        L_0x031d:
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2639.m13982(android.util.AttributeSet):void");
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private void m13981() {
        String string = this.f12010.getSharedPreferences(this.f12021, 0).getString(this.f12004, (String) null);
        if (string != null) {
            setCountryForNameCode(string);
        }
    }

    public void setCcpDialogShowPhoneCode(boolean z) {
        this.f12056 = z;
    }

    public void setCcpDialogShowNameCode(boolean z) {
        this.f12028 = z;
    }

    public void setCcpDialogShowTitle(boolean z) {
        this.f12046 = z;
    }

    public void setCcpDialogShowFlag(boolean z) {
        this.f12006 = z;
    }

    public void setShowPhoneCode(boolean z) {
        this.f12035 = z;
        m13994(this.f12042);
    }

    public void setFastScrollerBubbleTextAppearance(int i) {
        this.f12009 = i;
    }

    public void setFastScrollerHandleColor(int i) {
        this.f12019 = i;
    }

    public void setFastScrollerBubbleColor(int i) {
        this.f12049 = i;
    }

    public void setCurrentTextGravity(IF ifR) {
        m13980(ifR.f12064);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m13980(int i) {
        if (i == IF.LEFT.f12064) {
            this.f12050.setGravity(3);
        } else if (i == IF.CENTER.f12064) {
            this.f12050.setGravity(17);
        } else {
            this.f12050.setGravity(5);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m13998() {
        if (isInEditMode()) {
            Cif ifVar = this.f12038;
            if (ifVar != null) {
                this.f12005 = ifVar;
            } else {
                this.f12005 = Cif.ENGLISH;
            }
        } else if (this.f12039) {
            Cif r0 = m13991();
            if (r0 == null) {
                Cif ifVar2 = this.f12038;
                if (ifVar2 != null) {
                    this.f12005 = ifVar2;
                } else {
                    this.f12005 = Cif.ENGLISH;
                }
            } else {
                this.f12005 = r0;
            }
        } else {
            Cif ifVar3 = this.f12038;
            if (ifVar3 != null) {
                this.f12005 = ifVar3;
            } else {
                this.f12005 = Cif.ENGLISH;
            }
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private Cif m13991() {
        Locale locale = this.f12010.getResources().getConfiguration().locale;
        for (Cif ifVar : Cif.values()) {
            if (ifVar.f12130.equalsIgnoreCase(locale.getLanguage()) && (ifVar.f12131 == null || ifVar.f12131.equalsIgnoreCase(locale.getCountry()) || (Build.VERSION.SDK_INT >= 21 && (ifVar.f12129 == null || ifVar.f12129.equalsIgnoreCase(locale.getScript()))))) {
                return ifVar;
            }
        }
        return null;
    }

    public void setTextView_selectedCountry(TextView textView) {
        this.f12050 = textView;
    }

    public void setImageViewFlag(ImageView imageView) {
        this.f12023 = imageView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m13994(C2987 r5) {
        if (r5 == null) {
            Context context = getContext();
            if (this.f12005 == null) {
                m13998();
            }
            r5 = C2987.m15329(context, this.f12005, this.f12037, this.f12044);
            if (r5 == null) {
                return;
            }
        }
        this.f12042 = r5;
        String str = "";
        if (this.f12040 && this.f12013) {
            if (!isInEditMode()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(C2987.m15317(r5));
                sb.append("  ");
                str = sb.toString();
            } else if (this.f12058) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("🏁​ ");
                str = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(C2987.m15317(r5));
                sb3.append("​ ");
                str = sb3.toString();
            }
        }
        if (this.f12001) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(r5.f13772);
            str = sb4.toString();
        }
        if (this.f12036) {
            if (this.f12001) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" (");
                sb5.append(r5.f13769.toUpperCase());
                sb5.append(")");
                str = sb5.toString();
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" ");
                sb6.append(r5.f13769.toUpperCase());
                str = sb6.toString();
            }
        }
        if (this.f12035) {
            if (str.length() > 0) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append("  ");
                str = sb7.toString();
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str);
            sb8.append("+");
            sb8.append(r5.f13771);
            str = sb8.toString();
        }
        this.f12050.setText(str);
        if (!this.f12040 && str.length() == 0) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append("+");
            sb9.append(r5.f13771);
            this.f12050.setText(sb9.toString());
        }
        ImageView imageView = this.f12023;
        if (r5.f13773 == -99) {
            r5.f13773 = C2987.m15324(r5);
        }
        imageView.setImageResource(r5.f13773);
        C2714.m14417(m13992());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Cif m13995() {
        if (this.f12005 == null) {
            m13998();
        }
        return this.f12005;
    }

    public void setDialogKeyboardAutoPopup(boolean z) {
        this.f12008 = z;
    }

    public void setShowFastScroller(boolean z) {
        this.f12024 = z;
    }

    public void setDialogBackgroundColor(int i) {
        this.f12025 = i;
    }

    public void setDialogSearchEditTextTintColor(int i) {
        this.f12018 = i;
    }

    public void setDialogTextColor(int i) {
        this.f12027 = i;
    }

    public void setDialogTypeFace(Typeface typeface) {
        try {
            this.f12003 = typeface;
            this.f12029 = -99;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m13993() {
        String str = this.f12014;
        if (str == null || str.length() == 0) {
            this.f12037 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String r5 : this.f12014.split(",")) {
                C2987 r52 = C2987.m15313(getContext(), this.f12007, m13995(), r5);
                if (r52 != null && !m13985(r52, arrayList)) {
                    arrayList.add(r52);
                }
            }
            if (arrayList.size() == 0) {
                this.f12037 = null;
            } else {
                this.f12037 = arrayList;
            }
        }
        List<C2987> list = this.f12037;
        if (list != null) {
            Iterator<C2987> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m13999() {
        String str = this.f12011;
        if (str == null || str.length() == 0) {
            String str2 = this.f12030;
            if (str2 == null || str2.length() == 0) {
                this.f12007 = null;
            } else {
                this.f12030 = this.f12030.toLowerCase();
                Context context = this.f12010;
                if (this.f12005 == null) {
                    m13998();
                }
                List<C2987> r0 = C2987.m15325(context, this.f12005);
                ArrayList arrayList = new ArrayList();
                for (C2987 next : r0) {
                    if (!this.f12030.contains(next.f13769.toLowerCase())) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() > 0) {
                    this.f12007 = arrayList;
                } else {
                    this.f12007 = null;
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String r5 : this.f12011.split(",")) {
                C2987 r52 = C2987.m15328(getContext(), m13995(), r5);
                if (r52 != null && !m13985(r52, arrayList2)) {
                    arrayList2.add(r52);
                }
            }
            if (arrayList2.size() == 0) {
                this.f12007 = null;
            } else {
                this.f12007 = arrayList2;
            }
        }
        List<C2987> list = this.f12007;
        if (list != null) {
            Iterator<C2987> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setCustomMasterCountries(String str) {
        this.f12011 = str;
    }

    public void setExcludedCountries(String str) {
        this.f12030 = str;
        m13999();
    }

    public void setCcpClickable(boolean z) {
        this.f12031 = z;
        if (!z) {
            this.f12034.setOnClickListener((View.OnClickListener) null);
            this.f12034.setClickable(false);
            this.f12034.setEnabled(false);
            return;
        }
        this.f12034.setOnClickListener(this.f12052);
        this.f12034.setClickable(true);
        this.f12034.setEnabled(true);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m13985(C2987 r2, List<C2987> list) {
        if (r2 == null) {
            return false;
        }
        for (C2987 r0 : list) {
            if (r0.f13769.equalsIgnoreCase(r2.f13769)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public void setDefaultCountryUsingPhoneCode(int i) {
        Context context = getContext();
        if (this.f12005 == null) {
            m13998();
        }
        C2987 r0 = C2987.m15329(context, this.f12005, this.f12037, i);
        if (r0 != null) {
            this.f12044 = i;
            this.f12000 = r0;
        }
    }

    public void setDefaultCountryUsingNameCode(String str) {
        Context context = getContext();
        if (this.f12005 == null) {
            m13998();
        }
        C2987 r3 = C2987.m15328(context, this.f12005, str);
        if (r3 != null) {
            this.f12047 = r3.f13769;
            this.f12000 = r3;
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    private void m13990() {
        Context context = getContext();
        if (this.f12005 == null) {
            m13998();
        }
        this.f12000 = C2987.m15328(context, this.f12005, this.f12000.f13769.toUpperCase());
        m13994(this.f12000);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m13996() {
        StringBuilder sb = new StringBuilder("+");
        if (this.f12042 == null) {
            m13994(this.f12000);
        }
        sb.append(this.f12042.f13771);
        return sb.toString();
    }

    public void setCountryForPhoneCode(int i) {
        Context context = getContext();
        if (this.f12005 == null) {
            m13998();
        }
        C2987 r4 = C2987.m15329(context, this.f12005, this.f12037, i);
        if (r4 == null) {
            if (this.f12000 == null) {
                Context context2 = getContext();
                if (this.f12005 == null) {
                    m13998();
                }
                this.f12000 = C2987.m15329(context2, this.f12005, this.f12037, this.f12044);
            }
            m13994(this.f12000);
            return;
        }
        m13994(r4);
    }

    public void setCountryForNameCode(String str) {
        Context context = getContext();
        if (this.f12005 == null) {
            m13998();
        }
        C2987 r4 = C2987.m15328(context, this.f12005, str);
        if (r4 == null) {
            if (this.f12000 == null) {
                Context context2 = getContext();
                if (this.f12005 == null) {
                    m13998();
                }
                this.f12000 = C2987.m15329(context2, this.f12005, this.f12037, this.f12044);
            }
            m13994(this.f12000);
            return;
        }
        m13994(r4);
    }

    public void setFullNumber(String str) {
        Context context = getContext();
        if (this.f12005 == null) {
            m13998();
        }
        C2987 r4 = C2987.m15322(context, this.f12005, this.f12037, str);
        if (r4 == null) {
            r4 = this.f12000;
        }
        m13994(r4);
    }

    public void setContentColor(int i) {
        this.f12043 = i;
        this.f12050.setTextColor(this.f12043);
        if (this.f12012 == -99) {
            this.f12051.setColorFilter(this.f12043, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setArrowColor(int i) {
        this.f12012 = i;
        int i2 = this.f12012;
        if (i2 == -99) {
            int i3 = this.f12043;
            if (i3 != -99) {
                this.f12051.setColorFilter(i3, PorterDuff.Mode.SRC_IN);
                return;
            }
            return;
        }
        this.f12051.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
    }

    public void setFlagBorderColor(int i) {
        this.f12015 = i;
        this.f12055.setBackgroundColor(this.f12015);
    }

    public void setTextSize(int i) {
        if (i > 0) {
            this.f12050.setTextSize(0, (float) i);
            setArrowSize(i);
            setFlagSize(i);
        }
    }

    public void setArrowSize(int i) {
        if (i > 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12051.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.f12051.setLayoutParams(layoutParams);
        }
    }

    public void setCountryPreference(String str) {
        this.f12014 = str;
    }

    public void setTypeFace(Typeface typeface) {
        try {
            this.f12050.setTypeface(typeface);
            setDialogTypeFace(typeface);
        } catch (Exception unused) {
        }
    }

    public void setDialogTypeFace(Typeface typeface, int i) {
        try {
            this.f12003 = typeface;
        } catch (Exception unused) {
        }
    }

    public void setTypeFace(Typeface typeface, int i) {
        try {
            this.f12050.setTypeface(typeface, i);
            setDialogTypeFace(typeface, i);
        } catch (Exception unused) {
        }
    }

    public void setFlagSize(int i) {
        this.f12023.getLayoutParams().height = i;
        this.f12023.requestLayout();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    private void m13986() {
        if (!this.f12040 || this.f12013) {
            this.f12033.setVisibility(8);
        } else {
            this.f12033.setVisibility(0);
        }
    }

    public void setSearchAllowed(boolean z) {
        this.f12053 = z;
    }

    public void setCustomDialogTextProvider(C2642 r1) {
        this.f12017 = r1;
    }

    public void setAutoDetectedCountry(boolean z) {
        int i = 0;
        boolean z2 = false;
        while (i < this.f12026.f12081.length()) {
            try {
                switch (this.f12026.f12081.charAt(i)) {
                    case '1':
                        z2 = m13983();
                        break;
                    case '2':
                        z2 = m13987();
                        break;
                    case '3':
                        z2 = m13984();
                        break;
                }
                if (!z2) {
                    i++;
                } else if (!z2 && z) {
                    m13990();
                    return;
                }
            } catch (Exception e) {
                e.getMessage();
                if (z) {
                    m13990();
                    return;
                }
                return;
            }
        }
        if (!z2) {
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean m13983() {
        try {
            String simCountryIso = ((TelephonyManager) this.f12010.getSystemService("phone")).getSimCountryIso();
            if (simCountryIso == null) {
                return false;
            }
            if (simCountryIso.isEmpty()) {
                return false;
            }
            Context context = getContext();
            if (this.f12005 == null) {
                m13998();
            }
            m13994(C2987.m15328(context, this.f12005, simCountryIso));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    private boolean m13987() {
        try {
            String networkCountryIso = ((TelephonyManager) this.f12010.getSystemService("phone")).getNetworkCountryIso();
            if (networkCountryIso == null) {
                return false;
            }
            if (networkCountryIso.isEmpty()) {
                return false;
            }
            Context context = getContext();
            if (this.f12005 == null) {
                m13998();
            }
            m13994(C2987.m15328(context, this.f12005, networkCountryIso));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean m13984() {
        try {
            String country = this.f12010.getResources().getConfiguration().locale.getCountry();
            if (country == null) {
                return false;
            }
            if (country.isEmpty()) {
                return false;
            }
            Context context = getContext();
            if (this.f12005 == null) {
                m13998();
            }
            m13994(C2987.m15328(context, this.f12005, country));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void setCountryAutoDetectionPref(C3649If ifR) {
        this.f12026 = ifR;
    }

    /* renamed from: o.ѥı$if  reason: invalid class name */
    public enum Cif {
        AFRIKAANS("af"),
        ARABIC("ar"),
        BENGALI("bn"),
        CHINESE_SIMPLIFIED("zh", "CN", "Hans"),
        CHINESE_TRADITIONAL("zh", "TW", "Hant"),
        CZECH("cs"),
        DANISH("da"),
        DUTCH("nl"),
        ENGLISH("en"),
        FARSI("fa"),
        FRENCH("fr"),
        GERMAN("de"),
        GREEK("el"),
        GUJARATI("gu"),
        HEBREW("iw"),
        HINDI("hi"),
        INDONESIA("in"),
        ITALIAN("it"),
        JAPANESE("ja"),
        KAZAKH("kk"),
        KOREAN("ko"),
        POLISH("pl"),
        PORTUGUESE("pt"),
        PUNJABI("pa"),
        RUSSIAN("ru"),
        SLOVAK("sk"),
        SPANISH("es"),
        SWEDISH("sv"),
        TURKISH("tr"),
        UKRAINIAN("uk"),
        URDU("ur"),
        UZBEK("uz"),
        VIETNAMESE("vi");
        

        /* renamed from: ǃ  reason: contains not printable characters */
        String f12129;

        /* renamed from: ɩ  reason: contains not printable characters */
        String f12130;

        /* renamed from: Ι  reason: contains not printable characters */
        String f12131;

        private Cif(String str, String str2, String str3) {
            this.f12130 = str;
            this.f12131 = str2;
            this.f12129 = str3;
        }

        private Cif(String str) {
            this.f12130 = str;
        }
    }

    /* renamed from: o.ѥı$If  reason: case insensitive filesystem */
    public enum C3649If {
        SIM_ONLY("1"),
        NETWORK_ONLY("2"),
        LOCALE_ONLY("3"),
        SIM_NETWORK("12"),
        NETWORK_SIM("21"),
        SIM_LOCALE("13"),
        LOCALE_SIM("31"),
        NETWORK_LOCALE("23"),
        LOCALE_NETWORK(C2891.f13451),
        SIM_NETWORK_LOCALE("123"),
        SIM_LOCALE_NETWORK("132"),
        NETWORK_SIM_LOCALE("213"),
        NETWORK_LOCALE_SIM("231"),
        LOCALE_SIM_NETWORK("312"),
        LOCALE_NETWORK_SIM("321");
        

        /* renamed from: Ι  reason: contains not printable characters */
        String f12081;

        private C3649If(String str) {
            this.f12081 = str;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public static C3649If m14000(String str) {
            for (C3649If ifR : values()) {
                if (ifR.f12081.equals(str)) {
                    return ifR;
                }
            }
            return SIM_NETWORK_LOCALE;
        }
    }

    /* renamed from: o.ѥı$IF */
    public enum IF {
        LEFT(-1),
        CENTER(0),
        RIGHT(1);
        

        /* renamed from: ɩ  reason: contains not printable characters */
        int f12064;

        private IF(int i) {
            this.f12064 = i;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C3128.m15859();
        super.onDetachedFromWindow();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    private int m13992() {
        try {
            if (this.f12042 == null) {
                m13994(this.f12000);
            }
            return Integer.parseInt(this.f12042.f13771);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final String m13997() {
        if (this.f12042 == null) {
            m13994(this.f12000);
        }
        return this.f12042.f13769.toUpperCase();
    }
}
