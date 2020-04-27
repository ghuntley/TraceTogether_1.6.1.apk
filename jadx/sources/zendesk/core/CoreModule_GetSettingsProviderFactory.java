package zendesk.core;

import o.M;

public final class CoreModule_GetSettingsProviderFactory implements M<SettingsProvider> {
    private final CoreModule module;

    public CoreModule_GetSettingsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public final SettingsProvider get() {
        SettingsProvider settingsProvider = this.module.getSettingsProvider();
        if (settingsProvider != null) {
            return settingsProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SettingsProvider> create(CoreModule coreModule) {
        return new CoreModule_GetSettingsProviderFactory(coreModule);
    }
}
