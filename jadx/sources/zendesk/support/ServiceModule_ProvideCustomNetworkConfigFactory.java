package zendesk.support;

import o.C3351dc;
import o.M;

public final class ServiceModule_ProvideCustomNetworkConfigFactory implements M<HelpCenterCachingNetworkConfig> {
    private final C3351dc<HelpCenterCachingInterceptor> helpCenterCachingInterceptorProvider;

    public ServiceModule_ProvideCustomNetworkConfigFactory(C3351dc<HelpCenterCachingInterceptor> dcVar) {
        this.helpCenterCachingInterceptorProvider = dcVar;
    }

    public final HelpCenterCachingNetworkConfig get() {
        HelpCenterCachingNetworkConfig provideCustomNetworkConfig = ServiceModule.provideCustomNetworkConfig(this.helpCenterCachingInterceptorProvider.get());
        if (provideCustomNetworkConfig != null) {
            return provideCustomNetworkConfig;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<HelpCenterCachingNetworkConfig> create(C3351dc<HelpCenterCachingInterceptor> dcVar) {
        return new ServiceModule_ProvideCustomNetworkConfigFactory(dcVar);
    }
}
