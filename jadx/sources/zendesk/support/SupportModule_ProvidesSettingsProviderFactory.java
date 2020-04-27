package zendesk.support;

import o.M;

public final class SupportModule_ProvidesSettingsProviderFactory implements M<SupportSettingsProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesSettingsProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public final SupportSettingsProvider get() {
        SupportSettingsProvider providesSettingsProvider = this.module.providesSettingsProvider();
        if (providesSettingsProvider != null) {
            return providesSettingsProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SupportSettingsProvider> create(SupportModule supportModule) {
        return new SupportModule_ProvidesSettingsProviderFactory(supportModule);
    }
}
