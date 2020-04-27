package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskNetworkModule_ProvideAccessInterceptorFactory implements M<ZendeskAccessInterceptor> {
    private final C3351dc<AccessProvider> accessProvider;
    private final C3351dc<CoreSettingsStorage> coreSettingsStorageProvider;
    private final C3351dc<IdentityManager> identityManagerProvider;
    private final C3351dc<Storage> storageProvider;

    public ZendeskNetworkModule_ProvideAccessInterceptorFactory(C3351dc<IdentityManager> dcVar, C3351dc<AccessProvider> dcVar2, C3351dc<Storage> dcVar3, C3351dc<CoreSettingsStorage> dcVar4) {
        this.identityManagerProvider = dcVar;
        this.accessProvider = dcVar2;
        this.storageProvider = dcVar3;
        this.coreSettingsStorageProvider = dcVar4;
    }

    public final ZendeskAccessInterceptor get() {
        ZendeskAccessInterceptor provideAccessInterceptor = ZendeskNetworkModule.provideAccessInterceptor(this.identityManagerProvider.get(), this.accessProvider.get(), this.storageProvider.get(), this.coreSettingsStorageProvider.get());
        if (provideAccessInterceptor != null) {
            return provideAccessInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskAccessInterceptor> create(C3351dc<IdentityManager> dcVar, C3351dc<AccessProvider> dcVar2, C3351dc<Storage> dcVar3, C3351dc<CoreSettingsStorage> dcVar4) {
        return new ZendeskNetworkModule_ProvideAccessInterceptorFactory(dcVar, dcVar2, dcVar3, dcVar4);
    }
}
