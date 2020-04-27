package zendesk.core;

import o.C3351dc;
import o.M;
import o.kD;

public final class ZendeskProvidersModule_ProvideAccessServiceFactory implements M<AccessService> {
    private final C3351dc<kD> retrofitProvider;

    public ZendeskProvidersModule_ProvideAccessServiceFactory(C3351dc<kD> dcVar) {
        this.retrofitProvider = dcVar;
    }

    public final AccessService get() {
        AccessService provideAccessService = ZendeskProvidersModule.provideAccessService(this.retrofitProvider.get());
        if (provideAccessService != null) {
            return provideAccessService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<AccessService> create(C3351dc<kD> dcVar) {
        return new ZendeskProvidersModule_ProvideAccessServiceFactory(dcVar);
    }
}
