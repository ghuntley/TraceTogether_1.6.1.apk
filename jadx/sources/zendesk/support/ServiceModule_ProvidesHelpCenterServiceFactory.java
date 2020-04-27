package zendesk.support;

import o.C3351dc;
import o.M;
import zendesk.core.RestServiceProvider;

public final class ServiceModule_ProvidesHelpCenterServiceFactory implements M<HelpCenterService> {
    private final C3351dc<HelpCenterCachingNetworkConfig> helpCenterCachingNetworkConfigProvider;
    private final C3351dc<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesHelpCenterServiceFactory(C3351dc<RestServiceProvider> dcVar, C3351dc<HelpCenterCachingNetworkConfig> dcVar2) {
        this.restServiceProvider = dcVar;
        this.helpCenterCachingNetworkConfigProvider = dcVar2;
    }

    public final HelpCenterService get() {
        HelpCenterService providesHelpCenterService = ServiceModule.providesHelpCenterService(this.restServiceProvider.get(), this.helpCenterCachingNetworkConfigProvider.get());
        if (providesHelpCenterService != null) {
            return providesHelpCenterService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<HelpCenterService> create(C3351dc<RestServiceProvider> dcVar, C3351dc<HelpCenterCachingNetworkConfig> dcVar2) {
        return new ServiceModule_ProvidesHelpCenterServiceFactory(dcVar, dcVar2);
    }
}
