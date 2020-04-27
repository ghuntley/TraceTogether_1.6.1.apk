package zendesk.core;

import o.M;

public final class CoreModule_GetRestServiceProviderFactory implements M<RestServiceProvider> {
    private final CoreModule module;

    public CoreModule_GetRestServiceProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public final RestServiceProvider get() {
        RestServiceProvider restServiceProvider = this.module.getRestServiceProvider();
        if (restServiceProvider != null) {
            return restServiceProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RestServiceProvider> create(CoreModule coreModule) {
        return new CoreModule_GetRestServiceProviderFactory(coreModule);
    }
}
