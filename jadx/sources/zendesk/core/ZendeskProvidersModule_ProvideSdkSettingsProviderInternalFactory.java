package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory implements M<SdkSettingsProviderInternal> {
    private final C3351dc<ZendeskSettingsProvider> sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(C3351dc<ZendeskSettingsProvider> dcVar) {
        this.sdkSettingsProvider = dcVar;
    }

    public final SdkSettingsProviderInternal get() {
        SdkSettingsProviderInternal provideSdkSettingsProviderInternal = ZendeskProvidersModule.provideSdkSettingsProviderInternal(this.sdkSettingsProvider.get());
        if (provideSdkSettingsProviderInternal != null) {
            return provideSdkSettingsProviderInternal;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SdkSettingsProviderInternal> create(C3351dc<ZendeskSettingsProvider> dcVar) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(dcVar);
    }
}
