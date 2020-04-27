package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvideIdentityStorageFactory implements M<IdentityStorage> {
    private final C3351dc<BaseStorage> baseStorageProvider;

    public ZendeskStorageModule_ProvideIdentityStorageFactory(C3351dc<BaseStorage> dcVar) {
        this.baseStorageProvider = dcVar;
    }

    public final IdentityStorage get() {
        IdentityStorage provideIdentityStorage = ZendeskStorageModule.provideIdentityStorage(this.baseStorageProvider.get());
        if (provideIdentityStorage != null) {
            return provideIdentityStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<IdentityStorage> create(C3351dc<BaseStorage> dcVar) {
        return new ZendeskStorageModule_ProvideIdentityStorageFactory(dcVar);
    }
}
