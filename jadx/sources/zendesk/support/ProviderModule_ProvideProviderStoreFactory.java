package zendesk.support;

import o.C3351dc;
import o.M;

public final class ProviderModule_ProvideProviderStoreFactory implements M<ProviderStore> {
    private final C3351dc<HelpCenterProvider> helpCenterProvider;
    private final ProviderModule module;
    private final C3351dc<RequestProvider> requestProvider;
    private final C3351dc<UploadProvider> uploadProvider;

    public ProviderModule_ProvideProviderStoreFactory(ProviderModule providerModule, C3351dc<HelpCenterProvider> dcVar, C3351dc<RequestProvider> dcVar2, C3351dc<UploadProvider> dcVar3) {
        this.module = providerModule;
        this.helpCenterProvider = dcVar;
        this.requestProvider = dcVar2;
        this.uploadProvider = dcVar3;
    }

    public final ProviderStore get() {
        ProviderStore provideProviderStore = this.module.provideProviderStore(this.helpCenterProvider.get(), this.requestProvider.get(), this.uploadProvider.get());
        if (provideProviderStore != null) {
            return provideProviderStore;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ProviderStore> create(ProviderModule providerModule, C3351dc<HelpCenterProvider> dcVar, C3351dc<RequestProvider> dcVar2, C3351dc<UploadProvider> dcVar3) {
        return new ProviderModule_ProvideProviderStoreFactory(providerModule, dcVar, dcVar2, dcVar3);
    }
}
