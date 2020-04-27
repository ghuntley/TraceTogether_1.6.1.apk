package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskNetworkModule_ProvideSettingsInterceptorFactory implements M<ZendeskSettingsInterceptor> {
    private final C3351dc<SdkSettingsProviderInternal> sdkSettingsProvider;
    private final C3351dc<SettingsStorage> settingsStorageProvider;

    public ZendeskNetworkModule_ProvideSettingsInterceptorFactory(C3351dc<SdkSettingsProviderInternal> dcVar, C3351dc<SettingsStorage> dcVar2) {
        this.sdkSettingsProvider = dcVar;
        this.settingsStorageProvider = dcVar2;
    }

    public final ZendeskSettingsInterceptor get() {
        ZendeskSettingsInterceptor provideSettingsInterceptor = ZendeskNetworkModule.provideSettingsInterceptor(this.sdkSettingsProvider.get(), this.settingsStorageProvider.get());
        if (provideSettingsInterceptor != null) {
            return provideSettingsInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskSettingsInterceptor> create(C3351dc<SdkSettingsProviderInternal> dcVar, C3351dc<SettingsStorage> dcVar2) {
        return new ZendeskNetworkModule_ProvideSettingsInterceptorFactory(dcVar, dcVar2);
    }
}
