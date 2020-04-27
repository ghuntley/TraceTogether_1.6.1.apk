package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProvideUserProviderFactory implements M<UserProvider> {
    private final C3351dc<UserService> userServiceProvider;

    public ZendeskProvidersModule_ProvideUserProviderFactory(C3351dc<UserService> dcVar) {
        this.userServiceProvider = dcVar;
    }

    public final UserProvider get() {
        UserProvider provideUserProvider = ZendeskProvidersModule.provideUserProvider(this.userServiceProvider.get());
        if (provideUserProvider != null) {
            return provideUserProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<UserProvider> create(C3351dc<UserService> dcVar) {
        return new ZendeskProvidersModule_ProvideUserProviderFactory(dcVar);
    }
}
