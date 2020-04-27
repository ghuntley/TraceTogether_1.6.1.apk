package zendesk.support;

import java.util.Locale;
import o.C3351dc;
import o.M;
import zendesk.core.SettingsProvider;

public final class ProviderModule_ProvideSdkSettingsProviderFactory implements M<SupportSettingsProvider> {
    private final C3351dc<HelpCenterLocaleConverter> helpCenterLocaleConverterProvider;
    private final C3351dc<Locale> localeProvider;
    private final ProviderModule module;
    private final C3351dc<SettingsProvider> sdkSettingsProvider;

    public ProviderModule_ProvideSdkSettingsProviderFactory(ProviderModule providerModule, C3351dc<SettingsProvider> dcVar, C3351dc<Locale> dcVar2, C3351dc<HelpCenterLocaleConverter> dcVar3) {
        this.module = providerModule;
        this.sdkSettingsProvider = dcVar;
        this.localeProvider = dcVar2;
        this.helpCenterLocaleConverterProvider = dcVar3;
    }

    public final SupportSettingsProvider get() {
        SupportSettingsProvider provideSdkSettingsProvider = this.module.provideSdkSettingsProvider(this.sdkSettingsProvider.get(), this.localeProvider.get(), this.helpCenterLocaleConverterProvider.get());
        if (provideSdkSettingsProvider != null) {
            return provideSdkSettingsProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SupportSettingsProvider> create(ProviderModule providerModule, C3351dc<SettingsProvider> dcVar, C3351dc<Locale> dcVar2, C3351dc<HelpCenterLocaleConverter> dcVar3) {
        return new ProviderModule_ProvideSdkSettingsProviderFactory(providerModule, dcVar, dcVar2, dcVar3);
    }
}
