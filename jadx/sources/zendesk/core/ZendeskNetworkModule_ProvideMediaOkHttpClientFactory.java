package zendesk.core;

import o.C3351dc;
import o.M;
import okhttp3.OkHttpClient;

public final class ZendeskNetworkModule_ProvideMediaOkHttpClientFactory implements M<OkHttpClient> {
    private final C3351dc<ZendeskAccessInterceptor> accessInterceptorProvider;
    private final C3351dc<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final C3351dc<CachingInterceptor> cachingInterceptorProvider;
    private final C3351dc<OkHttpClient> okHttpClientProvider;
    private final C3351dc<ZendeskSettingsInterceptor> settingsInterceptorProvider;
    private final C3351dc<ZendeskUnauthorizedInterceptor> unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(C3351dc<OkHttpClient> dcVar, C3351dc<ZendeskAccessInterceptor> dcVar2, C3351dc<ZendeskAuthHeaderInterceptor> dcVar3, C3351dc<ZendeskSettingsInterceptor> dcVar4, C3351dc<CachingInterceptor> dcVar5, C3351dc<ZendeskUnauthorizedInterceptor> dcVar6) {
        this.okHttpClientProvider = dcVar;
        this.accessInterceptorProvider = dcVar2;
        this.authHeaderInterceptorProvider = dcVar3;
        this.settingsInterceptorProvider = dcVar4;
        this.cachingInterceptorProvider = dcVar5;
        this.unauthorizedInterceptorProvider = dcVar6;
    }

    public final OkHttpClient get() {
        OkHttpClient provideMediaOkHttpClient = ZendeskNetworkModule.provideMediaOkHttpClient(this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.cachingInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get());
        if (provideMediaOkHttpClient != null) {
            return provideMediaOkHttpClient;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<OkHttpClient> create(C3351dc<OkHttpClient> dcVar, C3351dc<ZendeskAccessInterceptor> dcVar2, C3351dc<ZendeskAuthHeaderInterceptor> dcVar3, C3351dc<ZendeskSettingsInterceptor> dcVar4, C3351dc<CachingInterceptor> dcVar5, C3351dc<ZendeskUnauthorizedInterceptor> dcVar6) {
        return new ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(dcVar, dcVar2, dcVar3, dcVar4, dcVar5, dcVar6);
    }
}
