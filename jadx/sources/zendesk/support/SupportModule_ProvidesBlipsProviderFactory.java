package zendesk.support;

import o.M;

public final class SupportModule_ProvidesBlipsProviderFactory implements M<SupportBlipsProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesBlipsProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public final SupportBlipsProvider get() {
        SupportBlipsProvider providesBlipsProvider = this.module.providesBlipsProvider();
        if (providesBlipsProvider != null) {
            return providesBlipsProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SupportBlipsProvider> create(SupportModule supportModule) {
        return new SupportModule_ProvidesBlipsProviderFactory(supportModule);
    }
}
