package o;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import com.google.firebase.iid.FirebaseInstanceId;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C1582;
import o.lA;
import sg.gov.tech.bluetrace.BuildConfig;
import sg.gov.tech.bluetrace.fragment.ForUseByMOHFragment;
import sg.gov.tech.bluetrace.fragment.HomeFragment;
import sg.gov.tech.bluetrace.zendesk.WebViewZendeskSupportFragment;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u0018\u00002\u00020\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u0012J\u000f\u0010\u0002\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0002\u0010\u0012J\r\u0010\f\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\f\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\u001cR\u001c\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\t8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0003R\u0016\u0010\n\u001a\u00020\r8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0003"}, d2 = {"Lo/lo;", "", "ɩ", "I", "Ι", "()I", "", "Ljava/lang/String;", "ι", "Lsg/gov/tech/bluetrace/zendesk/WebViewZendeskSupportFragment;", "ǃ", "Lsg/gov/tech/bluetrace/zendesk/WebViewZendeskSupportFragment;", "ı", "Lo/ʀǃ;", "Lo/ʀǃ;", "І", "і", "", "()V", "onBackPressed", "Landroid/os/Bundle;", "p0", "onCreate", "(Landroid/os/Bundle;)V", "Lo/ɩʟ;", "p1", "p2", "p3", "(ILo/ɩʟ;Ljava/lang/String;I)V", "<init>", "Lo/ɹ;"}, k = 1, mv = {1, 1, 16})
/* renamed from: o.lo  reason: case insensitive filesystem */
public final class C3573lo extends C1459 {

    /* renamed from: ı  reason: contains not printable characters */
    private C1582 f2939;

    /* renamed from: ǃ  reason: contains not printable characters */
    private WebViewZendeskSupportFragment f2940;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f2941;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final String f2942 = "NewMainActivity";

    /* renamed from: ι  reason: contains not printable characters */
    private int f2943;
    /* access modifiers changed from: private */

    /* renamed from: І  reason: contains not printable characters */
    public int f2944;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final /* synthetic */ WebViewZendeskSupportFragment m3635(C3573lo loVar) {
        WebViewZendeskSupportFragment webViewZendeskSupportFragment = loVar.f2940;
        if (webViewZendeskSupportFragment == null) {
            fM.m2253("mFragment");
        }
        return webViewZendeskSupportFragment;
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final int m3641() {
        return this.f2941;
    }

    public final void onCreate(Bundle bundle) {
        Throwable cause;
        super.onCreate(bundle);
        setContentView((int) R.layout.f168872131558428);
        Context context = this;
        try {
            if (!((Boolean) ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ɩ", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{context})).booleanValue()) {
                try {
                    ((Class) C3166.m16013(4, 12, 45444)).getMethod("ɩ", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{context});
                } catch (Throwable th) {
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                try {
                    ((Class) C3166.m16013(4, 12, 45444)).getMethod("І", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{context});
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            this.f2940 = new WebViewZendeskSupportFragment();
            View findViewById = findViewById(R.id.f166142131362177);
            fM.m2252((Object) findViewById, "");
            this.f2939 = (C1582) findViewById;
            this.f2941 = R.id.f164932131361997;
            C1582.C1584 r14 = new C1582.C1584(this) {

                /* renamed from: ι  reason: contains not printable characters */
                final /* synthetic */ C3573lo f2946;

                {
                    this.f2946 = r1;
                }

                /* renamed from: ɩ  reason: contains not printable characters */
                public final boolean m3643(MenuItem menuItem) {
                    fM.m2254(menuItem, "");
                    switch (menuItem.getItemId()) {
                        case R.id.f166162131362179:
                            if (this.f2946.f2944 != R.id.f166162131362179) {
                                C3573lo.m3635(this.f2946).m16339(BuildConfig.ZENDESK_URL);
                                C3573lo loVar = this.f2946;
                                String name = WebViewZendeskSupportFragment.class.getName();
                                fM.m2252((Object) name, "");
                                loVar.m3640(loVar.m3641(), C3573lo.m3635(this.f2946), name, 0);
                            }
                            this.f2946.f2944 = R.id.f166162131362179;
                            return true;
                        case R.id.f166172131362180:
                            if (this.f2946.f2944 != R.id.f166172131362180) {
                                C3573lo loVar2 = this.f2946;
                                String name2 = HomeFragment.class.getName();
                                fM.m2252((Object) name2, "");
                                loVar2.m3640(loVar2.m3641(), new HomeFragment(), name2, 0);
                            }
                            this.f2946.f2944 = R.id.f166172131362180;
                            return true;
                        case R.id.f166182131362181:
                            if (this.f2946.f2944 != R.id.f166182131362181) {
                                C3573lo loVar3 = this.f2946;
                                String name3 = ForUseByMOHFragment.class.getName();
                                fM.m2252((Object) name3, "");
                                loVar3.m3640(loVar3.m3641(), new ForUseByMOHFragment(), name3, 0);
                            }
                            this.f2946.f2944 = R.id.f166182131362181;
                            return true;
                        default:
                            return false;
                    }
                }
            };
            C1582 r0 = this.f2939;
            if (r0 == null) {
                fM.m2253("navView");
            }
            r0.setOnNavigationItemSelectedListener(r14);
            m3639();
            m3636();
        } finally {
            cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m3636() {
        FirebaseInstanceId r0 = FirebaseInstanceId.m1106();
        fM.m2252((Object) r0, "");
        r0.m1117().m4409(new C3149<C1086>(this) {

            /* renamed from: ɩ  reason: contains not printable characters */
            final /* synthetic */ C3573lo f2945;

            {
                this.f2945 = r1;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m3642(C0329<C1086> r5) {
                fM.m2254(r5, "");
                if (!r5.m4421()) {
                    lA.C0215 r0 = lA.f2728;
                    String r1 = this.f2945.f2942;
                    r0.m3372(r1, "failed to get fcm token " + r5.m4406());
                    return;
                }
                C1086 r52 = r5.m4401();
                String r53 = r52 != null ? r52.m7449() : null;
                lA.C0215 r02 = lA.f2728;
                String r12 = this.f2945.f2942;
                r02.m3368(r12, "FCM token: " + r53);
            }
        });
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3639() {
        C1582 r0 = this.f2939;
        if (r0 == null) {
            fM.m2253("navView");
        }
        r0.setSelectedItemId(R.id.f166172131362180);
    }

    public final void onBackPressed() {
        WebViewZendeskSupportFragment webViewZendeskSupportFragment = this.f2940;
        if (webViewZendeskSupportFragment == null) {
            fM.m2253("mFragment");
        }
        if (webViewZendeskSupportFragment.m16340()) {
            WebViewZendeskSupportFragment webViewZendeskSupportFragment2 = this.f2940;
            if (webViewZendeskSupportFragment2 == null) {
                fM.m2253("mFragment");
            }
            WebView r0 = webViewZendeskSupportFragment2.m16336();
            if (r0 != null) {
                r0.goBack();
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3640(int i, C1277 r5, String str, int i2) {
        fM.m2254(r5, "");
        fM.m2254(str, "");
        try {
            getSupportFragmentManager().m9138(this.f2941, 1);
            this.f2943 = 0;
            C1795 r0 = getSupportFragmentManager().m9099();
            fM.m2252((Object) r0, "");
            r0.m9964(i, r5, str);
            r0.m9966();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
