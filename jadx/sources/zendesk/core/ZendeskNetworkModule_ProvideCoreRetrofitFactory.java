package zendesk.core;

import o.C3122;
import o.C3351dc;
import o.M;
import o.kD;
import okhttp3.OkHttpClient;

public final class ZendeskNetworkModule_ProvideCoreRetrofitFactory implements M<kD> {
    private final C3351dc<ApplicationConfiguration> configurationProvider;
    private final C3351dc<C3122> gsonProvider;
    private final C3351dc<OkHttpClient> okHttpClientProvider;

    public ZendeskNetworkModule_ProvideCoreRetrofitFactory(C3351dc<ApplicationConfiguration> dcVar, C3351dc<C3122> dcVar2, C3351dc<OkHttpClient> dcVar3) {
        this.configurationProvider = dcVar;
        this.gsonProvider = dcVar2;
        this.okHttpClientProvider = dcVar3;
    }

    public final kD get() {
        kD provideCoreRetrofit = ZendeskNetworkModule.provideCoreRetrofit(this.configurationProvider.get(), this.gsonProvider.get(), this.okHttpClientProvider.get());
        if (provideCoreRetrofit != null) {
            return provideCoreRetrofit;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<kD> create(C3351dc<ApplicationConfiguration> dcVar, C3351dc<C3122> dcVar2, C3351dc<OkHttpClient> dcVar3) {
        return new ZendeskNetworkModule_ProvideCoreRetrofitFactory(dcVar, dcVar2, dcVar3);
    }
}
