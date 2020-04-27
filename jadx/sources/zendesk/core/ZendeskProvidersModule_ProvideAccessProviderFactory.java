package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProvideAccessProviderFactory implements M<AccessProvider> {
    private final C3351dc<AccessService> accessServiceProvider;
    private final C3351dc<IdentityManager> identityManagerProvider;

    public ZendeskProvidersModule_ProvideAccessProviderFactory(C3351dc<IdentityManager> dcVar, C3351dc<AccessService> dcVar2) {
        this.identityManagerProvider = dcVar;
        this.accessServiceProvider = dcVar2;
    }

    public final AccessProvider get() {
        AccessProvider provideAccessProvider = ZendeskProvidersModule.provideAccessProvider(this.identityManagerProvider.get(), this.accessServiceProvider.get());
        if (provideAccessProvider != null) {
            return provideAccessProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<AccessProvider> create(C3351dc<IdentityManager> dcVar, C3351dc<AccessService> dcVar2) {
        return new ZendeskProvidersModule_ProvideAccessProviderFactory(dcVar, dcVar2);
    }
}
