package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvideIdentityManagerFactory implements M<IdentityManager> {
    private final C3351dc<IdentityStorage> identityStorageProvider;

    public ZendeskStorageModule_ProvideIdentityManagerFactory(C3351dc<IdentityStorage> dcVar) {
        this.identityStorageProvider = dcVar;
    }

    public final IdentityManager get() {
        IdentityManager provideIdentityManager = ZendeskStorageModule.provideIdentityManager(this.identityStorageProvider.get());
        if (provideIdentityManager != null) {
            return provideIdentityManager;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<IdentityManager> create(C3351dc<IdentityStorage> dcVar) {
        return new ZendeskStorageModule_ProvideIdentityManagerFactory(dcVar);
    }
}
