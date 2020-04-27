package zendesk.support;

import java.util.Locale;
import o.C3351dc;
import o.M;
import zendesk.core.BlipsProvider;

public final class ProviderModule_ProvideSupportBlipsProviderFactory implements M<SupportBlipsProvider> {
    private final C3351dc<BlipsProvider> blipsProvider;
    private final C3351dc<Locale> localeProvider;
    private final ProviderModule module;

    public ProviderModule_ProvideSupportBlipsProviderFactory(ProviderModule providerModule, C3351dc<BlipsProvider> dcVar, C3351dc<Locale> dcVar2) {
        this.module = providerModule;
        this.blipsProvider = dcVar;
        this.localeProvider = dcVar2;
    }

    public final SupportBlipsProvider get() {
        SupportBlipsProvider provideSupportBlipsProvider = this.module.provideSupportBlipsProvider(this.blipsProvider.get(), this.localeProvider.get());
        if (provideSupportBlipsProvider != null) {
            return provideSupportBlipsProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SupportBlipsProvider> create(ProviderModule providerModule, C3351dc<BlipsProvider> dcVar, C3351dc<Locale> dcVar2) {
        return new ProviderModule_ProvideSupportBlipsProviderFactory(providerModule, dcVar, dcVar2);
    }
}
