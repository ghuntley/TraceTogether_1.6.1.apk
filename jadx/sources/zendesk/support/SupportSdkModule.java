package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.C2664;
import o.C3122;
import o.C3162;
import o.C3349da;
import o.C3356di;
import o.C3616p;
import okhttp3.OkHttpClient;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.SessionStorage;
import zendesk.support.ZendeskDeepLinkParser;
import zendesk.support.requestlist.RequestInfoDataSource;

class SupportSdkModule {
    SupportSdkModule() {
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public C3616p providesPicasso(Context context, OkHttpClient okHttpClient, ExecutorService executorService) {
        C3616p.If ifR = new C3616p.If(context);
        if (executorService == null) {
            throw new IllegalArgumentException("Executor service must not be null.");
        } else if (ifR.f3457 == null) {
            ifR.f3457 = executorService;
            Bitmap.Config config = Bitmap.Config.RGB_565;
            if (config != null) {
                ifR.f3458 = config;
                C2664 r2 = new C2664(okHttpClient);
                if (ifR.f3455 == null) {
                    ifR.f3455 = r2;
                    return ifR.m4047();
                }
                throw new IllegalStateException("Downloader already set.");
            }
            throw new IllegalArgumentException("Bitmap config must not be null.");
        } else {
            throw new IllegalStateException("Executor service already set.");
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"RestrictedApi"})
    @C3356di
    public String providesZendeskUrl(ApplicationConfiguration applicationConfiguration) {
        return applicationConfiguration.getZendeskUrl();
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public List<ZendeskDeepLinkParser.Module> providesParserModule() {
        return Collections.singletonList(new ViewArticleDeepLinkParser());
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public ZendeskDeepLinkParser providesDeepLinkParser(String str, List<ZendeskDeepLinkParser.Module> list) {
        return new ZendeskDeepLinkParser(str, list);
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public ZendeskDeepLinkHelper providesDeepLinkHelper(ActionHandlerRegistry actionHandlerRegistry, ZendeskDeepLinkParser zendeskDeepLinkParser) {
        return new ZendeskDeepLinkHelper(actionHandlerRegistry, zendeskDeepLinkParser);
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public List<ActionHandler> providesActionHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ViewArticleActionHandler());
        arrayList.add(new DeepLinkToRequestActionHandler());
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public C3162 providesRequestDiskLruCache(SessionStorage sessionStorage) {
        try {
            return C3162.m15995(new File(sessionStorage.getZendeskDataDir(), "request"), 20971520);
        } catch (IOException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public C3122 provides() {
        return new C3122();
    }

    /* access modifiers changed from: package-private */
    @C3349da(m2095 = "SUPPORT_MAIN_THREAD_EXECUTOR")
    @C3356di
    public Executor mainThreadExecutor() {
        return new Executor() {
            Handler handler = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.handler.post(runnable);
            }
        };
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public SupportUiStorage supportUIStorage(C3162 r2, C3122 r3) {
        return new SupportUiStorage(r2, r3);
    }

    /* access modifiers changed from: package-private */
    public RequestInfoDataSource.LocalDataSource requestInfoDataSource(SupportUiStorage supportUiStorage, @C3349da(m2095 = "SUPPORT_MAIN_THREAD_EXECUTOR") Executor executor, ExecutorService executorService) {
        return new RequestInfoDataSource.LocalDataSource(new RequestInfoDataSource.Disk(executor, executorService, supportUiStorage, "local_request_infos"));
    }
}
