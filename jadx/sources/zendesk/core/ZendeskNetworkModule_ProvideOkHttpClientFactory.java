package zendesk.core;

import o.C3351dc;
import o.M;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

public final class ZendeskNetworkModule_ProvideOkHttpClientFactory implements M<OkHttpClient> {
    private final C3351dc<AcceptHeaderInterceptor> acceptHeaderInterceptorProvider;
    private final C3351dc<ZendeskAccessInterceptor> accessInterceptorProvider;
    private final C3351dc<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final C3351dc<Cache> cacheProvider;
    private final C3351dc<OkHttpClient> okHttpClientProvider;
    private final C3351dc<ZendeskSettingsInterceptor> settingsInterceptorProvider;
    private final C3351dc<ZendeskUnauthorizedInterceptor> unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideOkHttpClientFactory(C3351dc<OkHttpClient> dcVar, C3351dc<ZendeskAccessInterceptor> dcVar2, C3351dc<ZendeskUnauthorizedInterceptor> dcVar3, C3351dc<ZendeskAuthHeaderInterceptor> dcVar4, C3351dc<ZendeskSettingsInterceptor> dcVar5, C3351dc<AcceptHeaderInterceptor> dcVar6, C3351dc<Cache> dcVar7) {
        this.okHttpClientProvider = dcVar;
        this.accessInterceptorProvider = dcVar2;
        this.unauthorizedInterceptorProvider = dcVar3;
        this.authHeaderInterceptorProvider = dcVar4;
        this.settingsInterceptorProvider = dcVar5;
        this.acceptHeaderInterceptorProvider = dcVar6;
        this.cacheProvider = dcVar7;
    }

    public final OkHttpClient get() {
        OkHttpClient provideOkHttpClient = ZendeskNetworkModule.provideOkHttpClient(this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get(), this.cacheProvider.get());
        if (provideOkHttpClient != null) {
            return provideOkHttpClient;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<OkHttpClient> create(C3351dc<OkHttpClient> dcVar, C3351dc<ZendeskAccessInterceptor> dcVar2, C3351dc<ZendeskUnauthorizedInterceptor> dcVar3, C3351dc<ZendeskAuthHeaderInterceptor> dcVar4, C3351dc<ZendeskSettingsInterceptor> dcVar5, C3351dc<AcceptHeaderInterceptor> dcVar6, C3351dc<Cache> dcVar7) {
        return new ZendeskNetworkModule_ProvideOkHttpClientFactory(dcVar, dcVar2, dcVar3, dcVar4, dcVar5, dcVar6, dcVar7);
    }
}
