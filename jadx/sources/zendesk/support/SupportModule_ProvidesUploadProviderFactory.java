package zendesk.support;

import o.M;

public final class SupportModule_ProvidesUploadProviderFactory implements M<UploadProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesUploadProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public final UploadProvider get() {
        UploadProvider providesUploadProvider = this.module.providesUploadProvider();
        if (providesUploadProvider != null) {
            return providesUploadProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<UploadProvider> create(SupportModule supportModule) {
        return new SupportModule_ProvidesUploadProviderFactory(supportModule);
    }
}
