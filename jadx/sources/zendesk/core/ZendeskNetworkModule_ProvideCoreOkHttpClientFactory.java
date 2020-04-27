package zendesk.core;

import o.C3351dc;
import o.M;
import okhttp3.OkHttpClient;

public final class ZendeskNetworkModule_ProvideCoreOkHttpClientFactory implements M<OkHttpClient> {
    private final C3351dc<AcceptHeaderInterceptor> acceptHeaderInterceptorProvider;
    private final C3351dc<AcceptLanguageHeaderInterceptor> acceptLanguageHeaderInterceptorProvider;
    private final C3351dc<OkHttpClient> okHttpClientProvider;

    public ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(C3351dc<OkHttpClient> dcVar, C3351dc<AcceptLanguageHeaderInterceptor> dcVar2, C3351dc<AcceptHeaderInterceptor> dcVar3) {
        this.okHttpClientProvider = dcVar;
        this.acceptLanguageHeaderInterceptorProvider = dcVar2;
        this.acceptHeaderInterceptorProvider = dcVar3;
    }

    public final OkHttpClient get() {
        OkHttpClient provideCoreOkHttpClient = ZendeskNetworkModule.provideCoreOkHttpClient(this.okHttpClientProvider.get(), this.acceptLanguageHeaderInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get());
        if (provideCoreOkHttpClient != null) {
            return provideCoreOkHttpClient;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<OkHttpClient> create(C3351dc<OkHttpClient> dcVar, C3351dc<AcceptLanguageHeaderInterceptor> dcVar2, C3351dc<AcceptHeaderInterceptor> dcVar3) {
        return new ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(dcVar, dcVar2, dcVar3);
    }
}
