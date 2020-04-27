package zendesk.core;

import o.C3351dc;
import o.M;
import o.kD;

public final class ZendeskProvidersModule_ProvideBlipsServiceFactory implements M<BlipsService> {
    private final C3351dc<kD> retrofitProvider;

    public ZendeskProvidersModule_ProvideBlipsServiceFactory(C3351dc<kD> dcVar) {
        this.retrofitProvider = dcVar;
    }

    public final BlipsService get() {
        BlipsService provideBlipsService = ZendeskProvidersModule.provideBlipsService(this.retrofitProvider.get());
        if (provideBlipsService != null) {
            return provideBlipsService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<BlipsService> create(C3351dc<kD> dcVar) {
        return new ZendeskProvidersModule_ProvideBlipsServiceFactory(dcVar);
    }
}
