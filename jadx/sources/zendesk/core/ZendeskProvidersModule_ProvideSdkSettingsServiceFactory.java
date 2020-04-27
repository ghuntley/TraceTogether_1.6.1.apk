package zendesk.core;

import o.C3351dc;
import o.M;
import o.kD;

public final class ZendeskProvidersModule_ProvideSdkSettingsServiceFactory implements M<SdkSettingsService> {
    private final C3351dc<kD> retrofitProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(C3351dc<kD> dcVar) {
        this.retrofitProvider = dcVar;
    }

    public final SdkSettingsService get() {
        SdkSettingsService provideSdkSettingsService = ZendeskProvidersModule.provideSdkSettingsService(this.retrofitProvider.get());
        if (provideSdkSettingsService != null) {
            return provideSdkSettingsService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SdkSettingsService> create(C3351dc<kD> dcVar) {
        return new ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(dcVar);
    }
}
