package zendesk.core;

import o.C3351dc;
import o.M;
import o.kD;

public final class ZendeskProvidersModule_ProvideUserServiceFactory implements M<UserService> {
    private final C3351dc<kD> retrofitProvider;

    public ZendeskProvidersModule_ProvideUserServiceFactory(C3351dc<kD> dcVar) {
        this.retrofitProvider = dcVar;
    }

    public final UserService get() {
        UserService provideUserService = ZendeskProvidersModule.provideUserService(this.retrofitProvider.get());
        if (provideUserService != null) {
            return provideUserService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<UserService> create(C3351dc<kD> dcVar) {
        return new ZendeskProvidersModule_ProvideUserServiceFactory(dcVar);
    }
}
