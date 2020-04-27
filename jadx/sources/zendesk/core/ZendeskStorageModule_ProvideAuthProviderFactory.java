package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvideAuthProviderFactory implements M<AuthenticationProvider> {
    private final C3351dc<IdentityManager> identityManagerProvider;

    public ZendeskStorageModule_ProvideAuthProviderFactory(C3351dc<IdentityManager> dcVar) {
        this.identityManagerProvider = dcVar;
    }

    public final AuthenticationProvider get() {
        AuthenticationProvider provideAuthProvider = ZendeskStorageModule.provideAuthProvider(this.identityManagerProvider.get());
        if (provideAuthProvider != null) {
            return provideAuthProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<AuthenticationProvider> create(C3351dc<IdentityManager> dcVar) {
        return new ZendeskStorageModule_ProvideAuthProviderFactory(dcVar);
    }
}
