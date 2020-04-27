package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProviderBlipsProviderFactory implements M<BlipsProvider> {
    private final C3351dc<ZendeskBlipsProvider> zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsProviderFactory(C3351dc<ZendeskBlipsProvider> dcVar) {
        this.zendeskBlipsProvider = dcVar;
    }

    public final BlipsProvider get() {
        BlipsProvider providerBlipsProvider = ZendeskProvidersModule.providerBlipsProvider(this.zendeskBlipsProvider.get());
        if (providerBlipsProvider != null) {
            return providerBlipsProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<BlipsProvider> create(C3351dc<ZendeskBlipsProvider> dcVar) {
        return new ZendeskProvidersModule_ProviderBlipsProviderFactory(dcVar);
    }
}
