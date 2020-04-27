package zendesk.support;

import o.M;

public final class SupportModule_ProvidesRequestProviderFactory implements M<RequestProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesRequestProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public final RequestProvider get() {
        RequestProvider providesRequestProvider = this.module.providesRequestProvider();
        if (providesRequestProvider != null) {
            return providesRequestProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RequestProvider> create(SupportModule supportModule) {
        return new SupportModule_ProvidesRequestProviderFactory(supportModule);
    }
}
