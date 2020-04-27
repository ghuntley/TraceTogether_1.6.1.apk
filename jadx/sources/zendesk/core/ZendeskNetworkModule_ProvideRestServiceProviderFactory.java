package zendesk.core;

import o.C3351dc;
import o.M;
import o.kD;
import okhttp3.OkHttpClient;

public final class ZendeskNetworkModule_ProvideRestServiceProviderFactory implements M<RestServiceProvider> {
    private final C3351dc<OkHttpClient> mediaOkHttpClientProvider;
    private final C3351dc<kD> retrofitProvider;
    private final C3351dc<OkHttpClient> standardOkHttpClientProvider;

    public ZendeskNetworkModule_ProvideRestServiceProviderFactory(C3351dc<kD> dcVar, C3351dc<OkHttpClient> dcVar2, C3351dc<OkHttpClient> dcVar3) {
        this.retrofitProvider = dcVar;
        this.mediaOkHttpClientProvider = dcVar2;
        this.standardOkHttpClientProvider = dcVar3;
    }

    public final RestServiceProvider get() {
        RestServiceProvider provideRestServiceProvider = ZendeskNetworkModule.provideRestServiceProvider(this.retrofitProvider.get(), this.mediaOkHttpClientProvider.get(), this.standardOkHttpClientProvider.get());
        if (provideRestServiceProvider != null) {
            return provideRestServiceProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RestServiceProvider> create(C3351dc<kD> dcVar, C3351dc<OkHttpClient> dcVar2, C3351dc<OkHttpClient> dcVar3) {
        return new ZendeskNetworkModule_ProvideRestServiceProviderFactory(dcVar, dcVar2, dcVar3);
    }
}
