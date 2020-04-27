package zendesk.support;

import o.C3351dc;
import o.M;

public final class ProviderModule_ProvideUploadProviderFactory implements M<UploadProvider> {
    private final ProviderModule module;
    private final C3351dc<ZendeskUploadService> uploadServiceProvider;

    public ProviderModule_ProvideUploadProviderFactory(ProviderModule providerModule, C3351dc<ZendeskUploadService> dcVar) {
        this.module = providerModule;
        this.uploadServiceProvider = dcVar;
    }

    public final UploadProvider get() {
        UploadProvider provideUploadProvider = this.module.provideUploadProvider(this.uploadServiceProvider.get());
        if (provideUploadProvider != null) {
            return provideUploadProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<UploadProvider> create(ProviderModule providerModule, C3351dc<ZendeskUploadService> dcVar) {
        return new ProviderModule_ProvideUploadProviderFactory(providerModule, dcVar);
    }
}
