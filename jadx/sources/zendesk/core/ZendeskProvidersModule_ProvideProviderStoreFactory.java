package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProvideProviderStoreFactory implements M<ProviderStore> {
    private final C3351dc<PushRegistrationProvider> pushRegistrationProvider;
    private final C3351dc<UserProvider> userProvider;

    public ZendeskProvidersModule_ProvideProviderStoreFactory(C3351dc<UserProvider> dcVar, C3351dc<PushRegistrationProvider> dcVar2) {
        this.userProvider = dcVar;
        this.pushRegistrationProvider = dcVar2;
    }

    public final ProviderStore get() {
        ProviderStore provideProviderStore = ZendeskProvidersModule.provideProviderStore(this.userProvider.get(), this.pushRegistrationProvider.get());
        if (provideProviderStore != null) {
            return provideProviderStore;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ProviderStore> create(C3351dc<UserProvider> dcVar, C3351dc<PushRegistrationProvider> dcVar2) {
        return new ZendeskProvidersModule_ProvideProviderStoreFactory(dcVar, dcVar2);
    }
}
