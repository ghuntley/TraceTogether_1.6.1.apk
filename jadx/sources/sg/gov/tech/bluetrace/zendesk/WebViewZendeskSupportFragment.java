package sg.gov.tech.bluetrace.zendesk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C1269;
import o.C1277;
import o.R;
import o.dA;
import o.fL;
import o.fM;
import o.gK;
import o.mW;
import zendesk.support.CustomField;
import zendesk.support.request.RequestActivity;
import zendesk.support.requestlist.RequestListActivity;
import zendesk.support.requestlist.RequestListUiConfig;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00012\u00020$:\u0001\u0001B\u0007¢\u0006\u0004\b&\u0010\u0017J\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0015J\u000f\u0010\b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\b\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0019\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010\u0003\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010#J\u0017\u0010\u000f\u001a\u00020$2\b\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010%R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0004"}, d2 = {"Lsg/gov/tech/bluetrace/zendesk/WebViewZendeskSupportFragment;", "if", "", "ǃ", "Z", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "ɹ", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "ι", "Landroid/widget/ProgressBar;", "І", "Landroid/widget/ProgressBar;", "ı", "", "Ljava/lang/String;", "Ι", "Landroid/webkit/WebView;", "Landroid/webkit/WebView;", "()Landroid/webkit/WebView;", "ɩ", "і", "()Z", "", "()V", "Landroid/os/Bundle;", "p0", "onActivityCreated", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "(Landroid/webkit/WebView;Z)V", "Lo/ɩʟ;", "(Ljava/lang/String;)Lo/ɩʟ;", "<init>"}, k = 1, mv = {1, 1, 16})
public final class WebViewZendeskSupportFragment extends C1277 {

    /* renamed from: if  reason: not valid java name */
    public static final Cif f14734if = new Cif((fL) null);

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final String f14735;

    /* renamed from: ı  reason: contains not printable characters */
    private String f14736;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f14737 = true;

    /* renamed from: ɹ  reason: contains not printable characters */
    private FloatingActionButton f14738;

    /* renamed from: Ι  reason: contains not printable characters */
    private WebView f14739;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public boolean f14740;
    /* access modifiers changed from: private */

    /* renamed from: І  reason: contains not printable characters */
    public ProgressBar f14741;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private HashMap f14742;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16338();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16338() {
        HashMap hashMap = this.f14742;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final WebView m16336() {
        return this.f14739;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        return layoutInflater.inflate(R.layout.f169172131558460, viewGroup, false);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1277 m16339(String str) {
        this.f14736 = str;
        return this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m16335() {
        View view = getView();
        if (view == null) {
            fM.m2256();
        }
        this.f14738 = (FloatingActionButton) view.findViewById(R.id.f165202131362045);
        FloatingActionButton floatingActionButton = this.f14738;
        if (floatingActionButton != null) {
            floatingActionButton.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: ɩ  reason: contains not printable characters */
                final /* synthetic */ WebViewZendeskSupportFragment f14743;

                {
                    this.f14743 = r1;
                }

                public final void onClick(View view) {
                    String str;
                    String str2 = Build.MANUFACTURER;
                    String str3 = Build.MODEL;
                    int i = Build.VERSION.SDK_INT;
                    fM.m2252((Object) str3, "");
                    fM.m2252((Object) str2, "");
                    if (!gK.m2345$default(str3, str2, false, 2, (Object) null)) {
                        str3 = str2 + ' ' + str3;
                    }
                    try {
                        C1269 activity = this.f14743.getActivity();
                        if (activity == null) {
                            fM.m2256();
                        }
                        fM.m2252((Object) activity, "");
                        PackageManager packageManager = activity.getPackageManager();
                        C1269 activity2 = this.f14743.getActivity();
                        if (activity2 == null) {
                            fM.m2256();
                        }
                        fM.m2252((Object) activity2, "");
                        str = packageManager.getPackageInfo(activity2.getPackageName(), 0).versionName;
                        fM.m2252((Object) str, "");
                    } catch (Throwable th) {
                        th.printStackTrace();
                        str = "";
                    }
                    mW config = RequestActivity.builder().withTags("Android").withCustomFields(Arrays.asList(new CustomField[]{new CustomField(360034523134L, str3), new CustomField(360034523154L, str), new CustomField(360034523174L, String.valueOf(i))})).config();
                    fM.m2252((Object) config, "");
                    RequestListUiConfig.Builder builder = RequestListActivity.builder();
                    C1269 activity3 = this.f14743.getActivity();
                    if (activity3 == null) {
                        fM.m2256();
                    }
                    builder.show((Context) activity3, config);
                }
            });
        }
        FloatingActionButton floatingActionButton2 = this.f14738;
        if (floatingActionButton2 != null) {
            floatingActionButton2.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.f156932131099884)));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m16340() {
        WebView webView = this.f14739;
        if (webView != null) {
            return webView.canGoBack();
        }
        return false;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = getView();
        if (view == null) {
            fM.m2256();
        }
        View findViewById = view.findViewById(R.id.f168272131362453);
        if (findViewById != null) {
            this.f14739 = (WebView) findViewById;
            View view2 = getView();
            if (view2 == null) {
                fM.m2256();
            }
            View findViewById2 = view2.findViewById(R.id.f166352131362214);
            if (findViewById2 != null) {
                this.f14741 = (ProgressBar) findViewById2;
                WebView webView = this.f14739;
                if (webView == null) {
                    fM.m2256();
                }
                WebSettings settings = webView.getSettings();
                fM.m2252((Object) settings, "");
                settings.setJavaScriptEnabled(true);
                WebView webView2 = this.f14739;
                if (webView2 == null) {
                    fM.m2256();
                }
                webView2.setWebViewClient(new C3233(this));
                m16337(this.f14739, false);
                WebView webView3 = this.f14739;
                if (webView3 == null) {
                    fM.m2256();
                }
                webView3.loadUrl(this.f14736);
                m16335();
                return;
            }
            throw new dA("null cannot be cast to non-null type android.widget.ProgressBar");
        }
        throw new dA("null cannot be cast to non-null type android.webkit.WebView");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u000fJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lsg/gov/tech/bluetrace/zendesk/WebViewZendeskSupportFragment$ǃ;", "Landroid/webkit/WebView;", "p0", "", "p1", "", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "p2", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Landroid/webkit/WebViewClient;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.zendesk.WebViewZendeskSupportFragment$ǃ  reason: contains not printable characters */
    public static final class C3233 extends WebViewClient {

        /* renamed from: ι  reason: contains not printable characters */
        final /* synthetic */ WebViewZendeskSupportFragment f14744;

        C3233(WebViewZendeskSupportFragment webViewZendeskSupportFragment) {
            this.f14744 = webViewZendeskSupportFragment;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            fM.m2254(webView, "");
            fM.m2254(str, "");
            if (!this.f14744.f14737) {
                this.f14744.f14740 = true;
            }
            this.f14744.f14737 = false;
            webView.loadUrl(str);
            return true;
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            fM.m2254(webView, "");
            fM.m2254(str, "");
            this.f14744.f14737 = false;
            ProgressBar r1 = this.f14744.f14741;
            if (r1 == null) {
                fM.m2256();
            }
            r1.setVisibility(0);
        }

        public final void onPageFinished(WebView webView, String str) {
            fM.m2254(webView, "");
            fM.m2254(str, "");
            if (!this.f14744.f14740) {
                this.f14744.f14737 = true;
            }
            if (!this.f14744.f14737 || this.f14744.f14740) {
                this.f14744.f14740 = false;
                return;
            }
            ProgressBar r2 = this.f14744.f14741;
            if (r2 == null) {
                fM.m2256();
            }
            r2.setVisibility(8);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m16337(WebView webView, boolean z) {
        if (webView == null) {
            fM.m2256();
        }
        WebSettings settings = webView.getSettings();
        fM.m2252((Object) settings, "");
        String userAgentString = settings.getUserAgentString();
        if (z) {
            try {
                WebSettings settings2 = webView.getSettings();
                fM.m2252((Object) settings2, "");
                String userAgentString2 = settings2.getUserAgentString();
                WebSettings settings3 = webView.getSettings();
                fM.m2252((Object) settings3, "");
                String userAgentString3 = settings3.getUserAgentString();
                fM.m2252((Object) userAgentString3, "");
                fM.m2252((Object) userAgentString2, "");
                int r5 = gK.m2363$default((CharSequence) userAgentString2, "(", 0, false, 6, (Object) null);
                int r3 = gK.m2363$default((CharSequence) userAgentString2, ")", 0, false, 6, (Object) null) + 1;
                if (userAgentString3 != null) {
                    String substring = userAgentString3.substring(r5, r3);
                    fM.m2252((Object) substring, "");
                    WebSettings settings4 = webView.getSettings();
                    fM.m2252((Object) settings4, "");
                    String userAgentString4 = settings4.getUserAgentString();
                    fM.m2252((Object) userAgentString4, "");
                    userAgentString = gK.m2343$default(userAgentString4, substring, "(X11; Linux x86_64)", false, 4, (Object) null);
                } else {
                    throw new dA("null cannot be cast to non-null type java.lang.String");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            userAgentString = null;
        }
        WebSettings settings5 = webView.getSettings();
        fM.m2252((Object) settings5, "");
        settings5.setUserAgentString(userAgentString);
        WebSettings settings6 = webView.getSettings();
        fM.m2252((Object) settings6, "");
        settings6.setUseWideViewPort(z);
        WebSettings settings7 = webView.getSettings();
        fM.m2252((Object) settings7, "");
        settings7.setLoadWithOverviewMode(z);
        webView.getSettings().setAppCacheEnabled(true);
        WebSettings settings8 = webView.getSettings();
        fM.m2252((Object) settings8, "");
        settings8.setCacheMode(1);
        webView.reload();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsg/gov/tech/bluetrace/zendesk/WebViewZendeskSupportFragment$if;", "", "Ɩ", "Ljava/lang/String;", "ı", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.zendesk.WebViewZendeskSupportFragment$if  reason: invalid class name */
    public static final class Cif {
        private Cif() {
        }

        public /* synthetic */ Cif(fL fLVar) {
            this();
        }
    }

    static {
        String simpleName = WebViewZendeskSupportFragment.class.getSimpleName();
        fM.m2252((Object) simpleName, "");
        f14735 = simpleName;
    }
}
