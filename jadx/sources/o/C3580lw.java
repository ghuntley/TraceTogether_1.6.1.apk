package o;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import sg.gov.tech.bluetrace.BuildConfig;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u00002\u00020\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0014¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/lw;", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "<init>", "()V", "Lo/ɩɿ;"}, k = 1, mv = {1, 1, 16})
/* renamed from: o.lw  reason: case insensitive filesystem */
public final class C3580lw extends C1269 {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f169632131558542);
        WebView webView = (WebView) findViewById(R.id.f168262131362452);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(BuildConfig.PRIVACY_URL);
        webView.setWebChromeClient(new C0230());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0006J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/lw$ı;", "Landroid/webkit/WebView;", "p0", "", "onCloseWindow", "(Landroid/webkit/WebView;)V", "Landroid/webkit/WebChromeClient;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lw$ı  reason: contains not printable characters */
    public static final class C0230 extends WebChromeClient {
        C0230() {
        }

        public final void onCloseWindow(WebView webView) {
            fM.m2254(webView, "");
            lA.f2728.m3368("WebViewActivity", "Window trying to close");
        }
    }
}
