package zendesk.support;

import o.M;

public final class ProviderModule_ProvideHelpCenterLocaleConverterFactory implements M<HelpCenterLocaleConverter> {
    private final ProviderModule module;

    public ProviderModule_ProvideHelpCenterLocaleConverterFactory(ProviderModule providerModule) {
        this.module = providerModule;
    }

    public final HelpCenterLocaleConverter get() {
        HelpCenterLocaleConverter provideHelpCenterLocaleConverter = this.module.provideHelpCenterLocaleConverter();
        if (provideHelpCenterLocaleConverter != null) {
            return provideHelpCenterLocaleConverter;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<HelpCenterLocaleConverter> create(ProviderModule providerModule) {
        return new ProviderModule_ProvideHelpCenterLocaleConverterFactory(providerModule);
    }
}
