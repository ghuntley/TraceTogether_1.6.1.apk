package zendesk.core;

import o.M;

public final class CoreModule_GetBlipsProviderFactory implements M<BlipsProvider> {
    private final CoreModule module;

    public CoreModule_GetBlipsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public final BlipsProvider get() {
        BlipsProvider blipsProvider = this.module.getBlipsProvider();
        if (blipsProvider != null) {
            return blipsProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<BlipsProvider> create(CoreModule coreModule) {
        return new CoreModule_GetBlipsProviderFactory(coreModule);
    }
}
