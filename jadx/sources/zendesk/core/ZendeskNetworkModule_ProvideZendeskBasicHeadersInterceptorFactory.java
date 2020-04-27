package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory implements M<ZendeskOauthIdHeaderInterceptor> {
    private final C3351dc<ApplicationConfiguration> configurationProvider;
    private final ZendeskNetworkModule module;

    public ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory(ZendeskNetworkModule zendeskNetworkModule, C3351dc<ApplicationConfiguration> dcVar) {
        this.module = zendeskNetworkModule;
        this.configurationProvider = dcVar;
    }

    public final ZendeskOauthIdHeaderInterceptor get() {
        ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor = this.module.provideZendeskBasicHeadersInterceptor(this.configurationProvider.get());
        if (provideZendeskBasicHeadersInterceptor != null) {
            return provideZendeskBasicHeadersInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskOauthIdHeaderInterceptor> create(ZendeskNetworkModule zendeskNetworkModule, C3351dc<ApplicationConfiguration> dcVar) {
        return new ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory(zendeskNetworkModule, dcVar);
    }
}
