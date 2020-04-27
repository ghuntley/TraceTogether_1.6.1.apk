package zendesk.core;

import java.util.concurrent.ExecutorService;
import o.C3351dc;
import o.M;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public final class ZendeskNetworkModule_ProvideBaseOkHttpClientFactory implements M<OkHttpClient> {
    private final C3351dc<ExecutorService> executorServiceProvider;
    private final C3351dc<HttpLoggingInterceptor> loggingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final C3351dc<ZendeskOauthIdHeaderInterceptor> oauthIdHeaderInterceptorProvider;
    private final C3351dc<UserAgentAndClientHeadersInterceptor> userAgentAndClientHeadersInterceptorProvider;

    public ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, C3351dc<HttpLoggingInterceptor> dcVar, C3351dc<ZendeskOauthIdHeaderInterceptor> dcVar2, C3351dc<UserAgentAndClientHeadersInterceptor> dcVar3, C3351dc<ExecutorService> dcVar4) {
        this.module = zendeskNetworkModule;
        this.loggingInterceptorProvider = dcVar;
        this.oauthIdHeaderInterceptorProvider = dcVar2;
        this.userAgentAndClientHeadersInterceptorProvider = dcVar3;
        this.executorServiceProvider = dcVar4;
    }

    public final OkHttpClient get() {
        OkHttpClient provideBaseOkHttpClient = this.module.provideBaseOkHttpClient(this.loggingInterceptorProvider.get(), this.oauthIdHeaderInterceptorProvider.get(), this.userAgentAndClientHeadersInterceptorProvider.get(), this.executorServiceProvider.get());
        if (provideBaseOkHttpClient != null) {
            return provideBaseOkHttpClient;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<OkHttpClient> create(ZendeskNetworkModule zendeskNetworkModule, C3351dc<HttpLoggingInterceptor> dcVar, C3351dc<ZendeskOauthIdHeaderInterceptor> dcVar2, C3351dc<UserAgentAndClientHeadersInterceptor> dcVar3, C3351dc<ExecutorService> dcVar4) {
        return new ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(zendeskNetworkModule, dcVar, dcVar2, dcVar3, dcVar4);
    }
}
