package zendesk.core;

import o.M;

public final class ZendeskApplicationModule_ProvideApplicationConfigurationFactory implements M<ApplicationConfiguration> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationConfigurationFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public final ApplicationConfiguration get() {
        ApplicationConfiguration provideApplicationConfiguration = this.module.provideApplicationConfiguration();
        if (provideApplicationConfiguration != null) {
            return provideApplicationConfiguration;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ApplicationConfiguration> create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationConfigurationFactory(zendeskApplicationModule);
    }
}
