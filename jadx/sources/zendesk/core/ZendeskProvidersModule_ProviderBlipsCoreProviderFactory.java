package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProviderBlipsCoreProviderFactory implements M<BlipsCoreProvider> {
    private final C3351dc<ZendeskBlipsProvider> zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(C3351dc<ZendeskBlipsProvider> dcVar) {
        this.zendeskBlipsProvider = dcVar;
    }

    public final BlipsCoreProvider get() {
        BlipsCoreProvider providerBlipsCoreProvider = ZendeskProvidersModule.providerBlipsCoreProvider(this.zendeskBlipsProvider.get());
        if (providerBlipsCoreProvider != null) {
            return providerBlipsCoreProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<BlipsCoreProvider> create(C3351dc<ZendeskBlipsProvider> dcVar) {
        return new ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(dcVar);
    }
}
