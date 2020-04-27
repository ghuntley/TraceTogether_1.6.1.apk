package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.util.List;
import java.util.Locale;
import o.C;
import o.C0809;
import o.C1459;
import o.C1644;
import o.C2026;
import o.C3282auX;
import o.C3350db;
import o.F;
import o.G;
import o.J;
import o.P;
import o.R;
import o.mZ;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.NetworkAware;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.AggregatedCallback;
import zendesk.support.Article;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.AttachmentType;
import zendesk.support.HelpCenterAttachment;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.UiUtils;
import zendesk.support.ZendeskDeepLinkHelper;
import zendesk.support.guide.ArticleUiConfig;
import zendesk.support.request.RequestActivity;

public class ViewArticleActivity extends C1459 implements AdapterView.OnItemClickListener {
    private static final Integer NETWORK_AWARE_ID = 57564;
    /* access modifiers changed from: private */
    public ArticleAttachmentAdapter adapter;
    @C3350db
    ApplicationConfiguration applicationConfiguration;
    /* access modifiers changed from: private */
    public ArticleViewModel article;
    private WebView articleContentWebView;
    /* access modifiers changed from: private */
    public Long articleId;
    @C3350db
    ArticleVoteStorage articleVoteStorage;
    /* access modifiers changed from: private */
    public ArticleVotingView articleVotingView;
    /* access modifiers changed from: private */
    public ListView attachmentListView;
    private J<List<HelpCenterAttachment>> attachmentRequestCallback;
    /* access modifiers changed from: private */
    public ArticleUiConfig config;
    /* access modifiers changed from: private */
    public CoordinatorLayout coordinatorLayout;
    @C3350db
    ZendeskDeepLinkHelper deepLinkHelper;
    private final Handler handler = new Handler();
    @C3350db
    HelpCenterProvider helpCenterProvider;
    private final NetworkAware networkConnectionCallbacks = new NetworkAware() {
        boolean connected = true;

        public void onNetworkAvailable() {
            if (NetworkUtils.isConnectedOrConnecting(ViewArticleActivity.this)) {
                ViewArticleActivity.this.dimissSnackBar();
                this.connected = true;
                if (ViewArticleActivity.this.articleId != null && ViewArticleActivity.this.article == null) {
                    ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                    viewArticleActivity.fetchArticle(viewArticleActivity.articleId.longValue());
                } else if (ViewArticleActivity.this.article != null) {
                    ViewArticleActivity viewArticleActivity2 = ViewArticleActivity.this;
                    viewArticleActivity2.fetchAttachmentsForArticle(viewArticleActivity2.article.getId());
                }
            }
        }

        @SuppressLint({"MissingPermission"})
        public void onNetworkUnavailable() {
            if (!NetworkUtils.isConnectedOrConnecting(ViewArticleActivity.this) && this.connected) {
                this.connected = false;
                ViewArticleActivity.this.dimissSnackBar();
                ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                C0809 unused = viewArticleActivity.snackbar = C0809.m6202(viewArticleActivity.coordinatorLayout, R.string.f171652131886359);
                ViewArticleActivity.this.snackbar.m1025();
            }
        }
    };
    @C3350db
    NetworkInfoProvider networkInfoProvider;
    @C3350db
    OkHttpClient okHttpClient;
    private ProgressBar progressView;
    private final AggregatedCallback<SupportSdkSettings> settingsAggregatedCallback = new AggregatedCallback<>();
    /* access modifiers changed from: private */
    public C0809 snackbar;
    @C3350db
    SupportSettingsProvider supportSettingsProvider;

    enum LoadingState {
        LOADING,
        DISPLAYING,
        ERRORED
    }

    public static ArticleUiConfig.Builder builder(Article article2) {
        return new ArticleUiConfig.Builder(article2);
    }

    public static ArticleUiConfig.Builder builder(long j) {
        return new ArticleUiConfig.Builder(j);
    }

    @SuppressLint({"SetJavaScriptEnabled", "RestrictedApi"})
    @TargetApi(21)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(R.style.f175302131952321, true);
        setContentView(R.layout.f169702131558549);
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            F.m1358();
            finish();
            return;
        }
        C3282auX initToolbar = initToolbar();
        this.config = (ArticleUiConfig) mZ.m3799(getIntent().getExtras(), ArticleUiConfig.class);
        ArticleUiConfig articleUiConfig = this.config;
        if (articleUiConfig == null || articleUiConfig.getConfigurationState() == -1) {
            F.m1358();
            finish();
            return;
        }
        this.attachmentListView = (ListView) findViewById(R.id.f168142131362440);
        this.adapter = new ArticleAttachmentAdapter(this);
        this.attachmentListView.setAdapter(this.adapter);
        this.attachmentListView.setOnItemClickListener(this);
        if (initToolbar != null) {
            initToolbar.m1640(true);
        }
        SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().inject(this);
        this.articleContentWebView = (WebView) findViewById(R.id.f168162131362442);
        this.articleContentWebView.setWebChromeClient(new WebChromeClient());
        this.articleContentWebView.getSettings().setJavaScriptEnabled(true);
        setupRequestInterceptor();
        if (Build.VERSION.SDK_INT >= 21) {
            this.articleContentWebView.getSettings().setMixedContentMode(0);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        this.progressView = (ProgressBar) findViewById(R.id.f168172131362443);
        this.coordinatorLayout = (CoordinatorLayout) findViewById(R.id.f168132131362439);
        if (this.config.getConfigurationState() == 2) {
            this.article = this.config.getArticle();
            ArticleViewModel articleViewModel = this.article;
            if (articleViewModel != null) {
                this.articleId = Long.valueOf(articleViewModel.getId());
            }
            loadArticleBody();
        } else {
            fetchArticle(this.config.getArticleId());
            this.articleId = Long.valueOf(this.config.getArticleId());
        }
        if (this.config.isContactUsButtonVisible()) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.f164912131361995);
            floatingActionButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ViewArticleActivity.this.startRequestActivity();
                }
            });
            floatingActionButton.setVisibility(0);
        }
        this.articleVotingView = (ArticleVotingView) findViewById(R.id.f164622131361944);
        this.articleVotingView.bindTo(this.articleId, this.articleVoteStorage, this.helpCenterProvider);
        this.articleVotingView.setVisibility(8);
        applyVoteButtonSettings();
    }

    private C3282auX initToolbar() {
        C2026 r0 = (C2026) findViewById(R.id.f168182131362444);
        if (Build.VERSION.SDK_INT >= 21) {
            findViewById(R.id.f168152131362441).setVisibility(8);
        }
        setSupportActionBar(r0);
        return getSupportActionBar();
    }

    /* access modifiers changed from: private */
    public void startRequestActivity() {
        RequestActivity.builder().show((Context) this, this.config.getUiConfigs());
    }

    private void setupRequestInterceptor() {
        WebView webView = this.articleContentWebView;
        if (webView == null) {
            F.m1361();
        } else {
            webView.setWebViewClient(new WebViewClient() {
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    String str2;
                    InputStream inputStream;
                    String str3;
                    String zendeskUrl = ViewArticleActivity.this.applicationConfiguration.getZendeskUrl();
                    if (P.m1409(zendeskUrl) || !str.startsWith(zendeskUrl)) {
                        F.m1361();
                        return super.shouldInterceptRequest(webView, str);
                    }
                    String str4 = null;
                    try {
                        Response execute = ViewArticleActivity.this.okHttpClient.newCall(new Request.Builder().url(str).build()).execute();
                        if (execute == null || !execute.isSuccessful() || execute.body() == null) {
                            str2 = null;
                            inputStream = null;
                            return new WebResourceResponse(str4, str2, inputStream);
                        }
                        inputStream = execute.body().byteStream();
                        try {
                            MediaType contentType = execute.body().contentType();
                            if (contentType != null) {
                                if (!P.m1406(contentType.type()) || !P.m1406(contentType.subtype())) {
                                    str3 = null;
                                } else {
                                    str3 = String.format(Locale.US, "%s/%s", new Object[]{contentType.type(), contentType.subtype()});
                                }
                                try {
                                    Charset charset = contentType.charset();
                                    if (charset != null) {
                                        str4 = charset.name();
                                    }
                                } catch (Exception unused) {
                                    F.m1355();
                                    str2 = str4;
                                    str4 = str3;
                                    return new WebResourceResponse(str4, str2, inputStream);
                                }
                                str2 = str4;
                                str4 = str3;
                                return new WebResourceResponse(str4, str2, inputStream);
                            }
                            str2 = null;
                            return new WebResourceResponse(str4, str2, inputStream);
                        } catch (Exception unused2) {
                            str3 = null;
                            F.m1355();
                            str2 = str4;
                            str4 = str3;
                            return new WebResourceResponse(str4, str2, inputStream);
                        }
                    } catch (Exception unused3) {
                        inputStream = null;
                        str3 = null;
                        F.m1355();
                        str2 = str4;
                        str4 = str3;
                        return new WebResourceResponse(str4, str2, inputStream);
                    }
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    return ViewArticleActivity.this.deepLinkHelper.launch(str, ViewArticleActivity.this.config, webView.getContext());
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter adapter2 = listView.getAdapter();
        if (adapter2 != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 0);
            View view = null;
            int i = 0;
            for (int i2 = 0; i2 < adapter2.getCount(); i2++) {
                view = adapter2.getView(i2, view, listView);
                if (i2 == 0) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(makeMeasureSpec, -2));
                }
                view.measure(makeMeasureSpec, 0);
                i += view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = i + (listView.getDividerHeight() * (adapter2.getCount() - 1));
            listView.setLayoutParams(layoutParams);
            listView.requestLayout();
        }
    }

    public void onStart() {
        super.onStart();
        this.attachmentRequestCallback = J.m1377(new AttachmentRequestCallback());
        this.networkInfoProvider.addNetworkAwareListener(NETWORK_AWARE_ID, this.networkConnectionCallbacks);
        this.networkInfoProvider.register();
    }

    public void onStop() {
        super.onStop();
        J<List<HelpCenterAttachment>> j = this.attachmentRequestCallback;
        if (j != null) {
            j.f1270 = true;
            this.attachmentRequestCallback = null;
        }
        this.networkInfoProvider.removeNetworkAwareListener(NETWORK_AWARE_ID);
        this.networkInfoProvider.unregister();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: private */
    public void fetchAttachmentsForArticle(long j) {
        setLoadingState(LoadingState.LOADING);
        this.helpCenterProvider.getAttachments(Long.valueOf(j), AttachmentType.BLOCK, this.attachmentRequestCallback);
    }

    /* access modifiers changed from: private */
    public void fetchArticle(long j) {
        setLoadingState(LoadingState.LOADING);
        this.helpCenterProvider.getArticle(Long.valueOf(j), new G<Article>() {
            public void onSuccess(Article article) {
                ArticleViewModel unused = ViewArticleActivity.this.article = new ArticleViewModel(article);
                ViewArticleActivity.this.loadArticleBody();
            }

            public void onError(C c) {
                ViewArticleActivity.this.setLoadingState(LoadingState.ERRORED);
            }
        });
    }

    /* access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public void loadArticleBody() {
        String str;
        setTitle(getString(R.string.f171932131886389, new Object[]{this.article.getTitle()}));
        setLoadingState(LoadingState.DISPLAYING);
        C3282auX supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.m1642(UiUtils.decodeHtmlEntities(this.article.getTitle()));
        }
        String str2 = null;
        String authorName = this.article.getAuthorName();
        if (this.article.getCreatedAt() != null) {
            str2 = DateFormat.getDateInstance(1, C1644.m9466(getResources().getConfiguration()).m10210(0)).format(this.article.getCreatedAt());
        }
        if (str2 == null || authorName == null) {
            str = "";
        } else {
            str = String.format(Locale.US, "%s %s %s", new Object[]{authorName, "•", str2});
        }
        this.articleContentWebView.loadDataWithBaseURL(this.applicationConfiguration.getZendeskUrl(), getString(R.string.f171622131886355, new Object[]{"file:///android_asset/help_center_article_style.css", this.article.getTitle(), this.article.getBody(), str}), "text/html", "UTF-8", (String) null);
        this.handler.postDelayed(new Runnable() {
            public void run() {
                ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                viewArticleActivity.fetchAttachmentsForArticle(viewArticleActivity.article.getId());
                ViewArticleActivity.this.applyVoteButtonSettings();
            }
        }, 250);
    }

    /* access modifiers changed from: protected */
    public void setLoadingState(LoadingState loadingState) {
        if (loadingState == null) {
            F.m1361();
            return;
        }
        int i = AnonymousClass8.$SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState[loadingState.ordinal()];
        if (i == 1) {
            UiUtils.setVisibility(this.progressView, 0);
            UiUtils.setVisibility(this.attachmentListView, 8);
        } else if (i == 2) {
            UiUtils.setVisibility(this.progressView, 8);
            UiUtils.setVisibility(this.attachmentListView, 0);
        } else if (i == 3) {
            UiUtils.setVisibility(this.progressView, 8);
            UiUtils.setVisibility(this.attachmentListView, 8);
            dimissSnackBar();
            this.snackbar = C0809.m6202(this.coordinatorLayout, R.string.f171612131886354).m6207(R.string.f171662131886360, new View.OnClickListener() {
                public void onClick(View view) {
                    if (ViewArticleActivity.this.articleId != null && ViewArticleActivity.this.article == null) {
                        ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                        viewArticleActivity.fetchArticle(viewArticleActivity.articleId.longValue());
                    } else if (ViewArticleActivity.this.article != null) {
                        ViewArticleActivity viewArticleActivity2 = ViewArticleActivity.this;
                        viewArticleActivity2.fetchAttachmentsForArticle(viewArticleActivity2.article.getId());
                    }
                    ViewArticleActivity.this.dimissSnackBar();
                }
            });
            this.snackbar.m1025();
        }
    }

    /* renamed from: zendesk.support.guide.ViewArticleActivity$8  reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState = new int[LoadingState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                zendesk.support.guide.ViewArticleActivity$LoadingState[] r0 = zendesk.support.guide.ViewArticleActivity.LoadingState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState = r0
                int[] r0 = $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.support.guide.ViewArticleActivity$LoadingState r1 = zendesk.support.guide.ViewArticleActivity.LoadingState.LOADING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.support.guide.ViewArticleActivity$LoadingState r1 = zendesk.support.guide.ViewArticleActivity.LoadingState.DISPLAYING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState     // Catch:{ NoSuchFieldError -> 0x002a }
                zendesk.support.guide.ViewArticleActivity$LoadingState r1 = zendesk.support.guide.ViewArticleActivity.LoadingState.ERRORED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.guide.ViewArticleActivity.AnonymousClass8.<clinit>():void");
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        if (itemAtPosition instanceof HelpCenterAttachment) {
            HelpCenterAttachment helpCenterAttachment = (HelpCenterAttachment) itemAtPosition;
            if (helpCenterAttachment.getContentUrl() != null) {
                Uri parse = Uri.parse(helpCenterAttachment.getContentUrl());
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(parse);
                startActivity(intent);
                return;
            }
            F.m1361();
        }
    }

    /* access modifiers changed from: private */
    public void dimissSnackBar() {
        C0809 r0 = this.snackbar;
        if (r0 != null) {
            r0.m1023();
            this.snackbar = null;
        }
    }

    class AttachmentRequestCallback extends G<List<HelpCenterAttachment>> {
        AttachmentRequestCallback() {
        }

        public void onSuccess(List<HelpCenterAttachment> list) {
            ViewArticleActivity.this.adapter.clear();
            ViewArticleActivity.this.adapter.addAll(list);
            ViewArticleActivity.setListViewHeightBasedOnChildren(ViewArticleActivity.this.attachmentListView);
            ViewArticleActivity.this.setLoadingState(LoadingState.DISPLAYING);
        }

        public void onError(C c) {
            ViewArticleActivity.this.adapter.clear();
            ViewArticleActivity.this.setLoadingState(LoadingState.ERRORED);
            F.m1357(c);
        }
    }

    static class ArticleAttachmentAdapter extends ArrayAdapter<HelpCenterAttachment> {
        ArticleAttachmentAdapter(Context context) {
            super(context, R.layout.f169882131558567);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            ArticleAttachmentRow articleAttachmentRow;
            if (view instanceof ArticleAttachmentRow) {
                articleAttachmentRow = (ArticleAttachmentRow) view;
            } else {
                articleAttachmentRow = new ArticleAttachmentRow(getContext());
            }
            articleAttachmentRow.bind((HelpCenterAttachment) getItem(i));
            return articleAttachmentRow;
        }
    }

    static class ArticleAttachmentRow extends RelativeLayout {
        private final TextView mFileName = ((TextView) findViewById(R.id.f164592131361941));
        private final TextView mFileSize = ((TextView) findViewById(R.id.f164602131361942));

        public ArticleAttachmentRow(Context context) {
            super(context);
            inflate(context, R.layout.f169882131558567, this);
        }

        public void bind(HelpCenterAttachment helpCenterAttachment) {
            String str;
            this.mFileName.setText(helpCenterAttachment.getFileName());
            TextView textView = this.mFileSize;
            Long size = helpCenterAttachment.getSize();
            if (size == null || size.longValue() < 0) {
                str = "";
            } else if (size.longValue() < 1000) {
                StringBuilder sb = new StringBuilder();
                sb.append(size);
                sb.append(" B");
                str = sb.toString();
            } else {
                int log = (int) (Math.log((double) size.longValue()) / Math.log(1000.0d));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("kMGTPE".charAt(log - 1));
                String obj = sb2.toString();
                str = String.format(Locale.US, "%.1f %sB", new Object[]{Double.valueOf(((double) size.longValue()) / Math.pow(1000.0d, (double) log)), obj});
            }
            textView.setText(str);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.settingsAggregatedCallback.cancel();
        WebView webView = this.articleContentWebView;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void loadSettings(G<SupportSdkSettings> g) {
        if (this.settingsAggregatedCallback.add(g)) {
            this.supportSettingsProvider.getSettings(this.settingsAggregatedCallback);
        }
    }

    /* access modifiers changed from: private */
    public void applyVoteButtonSettings() {
        loadSettings(new G<SupportSdkSettings>() {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings.isHelpCenterArticleVotingEnabled()) {
                    ViewArticleActivity.this.articleVotingView.setVisibility(0);
                } else {
                    ViewArticleActivity.this.articleVotingView.setVisibility(8);
                }
            }

            public void onError(C c) {
                ViewArticleActivity.this.articleVotingView.setVisibility(8);
            }
        });
    }
}
