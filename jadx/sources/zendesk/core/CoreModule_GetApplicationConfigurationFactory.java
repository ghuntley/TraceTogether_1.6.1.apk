package zendesk.core;

import o.M;

public final class CoreModule_GetApplicationConfigurationFactory implements M<ApplicationConfiguration> {
    private final CoreModule module;

    public CoreModule_GetApplicationConfigurationFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public final ApplicationConfiguration get() {
        ApplicationConfiguration applicationConfiguration = this.module.getApplicationConfiguration();
        if (applicationConfiguration != null) {
            return applicationConfiguration;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ApplicationConfiguration> create(CoreModule coreModule) {
        return new CoreModule_GetApplicationConfigurationFactory(coreModule);
    }

    public static ApplicationConfiguration proxyGetApplicationConfiguration(CoreModule coreModule) {
        return coreModule.getApplicationConfiguration();
    }
}
