package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProvideSdkSettingsProviderFactory implements M<SettingsProvider> {
    private final C3351dc<ZendeskSettingsProvider> sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(C3351dc<ZendeskSettingsProvider> dcVar) {
        this.sdkSettingsProvider = dcVar;
    }

    public final SettingsProvider get() {
        SettingsProvider provideSdkSettingsProvider = ZendeskProvidersModule.provideSdkSettingsProvider(this.sdkSettingsProvider.get());
        if (provideSdkSettingsProvider != null) {
            return provideSdkSettingsProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SettingsProvider> create(C3351dc<ZendeskSettingsProvider> dcVar) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(dcVar);
    }
}
