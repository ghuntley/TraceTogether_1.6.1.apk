package zendesk.core;

import android.content.Context;
import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory implements M<ZendeskSettingsProvider> {
    private final C3351dc<ApplicationConfiguration> configurationProvider;
    private final C3351dc<Context> contextProvider;
    private final C3351dc<CoreSettingsStorage> coreSettingsStorageProvider;
    private final C3351dc<SdkSettingsService> sdkSettingsServiceProvider;
    private final C3351dc<Serializer> serializerProvider;
    private final C3351dc<SettingsStorage> settingsStorageProvider;

    public ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(C3351dc<SdkSettingsService> dcVar, C3351dc<SettingsStorage> dcVar2, C3351dc<CoreSettingsStorage> dcVar3, C3351dc<Serializer> dcVar4, C3351dc<ApplicationConfiguration> dcVar5, C3351dc<Context> dcVar6) {
        this.sdkSettingsServiceProvider = dcVar;
        this.settingsStorageProvider = dcVar2;
        this.coreSettingsStorageProvider = dcVar3;
        this.serializerProvider = dcVar4;
        this.configurationProvider = dcVar5;
        this.contextProvider = dcVar6;
    }

    public final ZendeskSettingsProvider get() {
        ZendeskSettingsProvider provideZendeskSdkSettingsProvider = ZendeskProvidersModule.provideZendeskSdkSettingsProvider(this.sdkSettingsServiceProvider.get(), this.settingsStorageProvider.get(), this.coreSettingsStorageProvider.get(), this.serializerProvider.get(), this.configurationProvider.get(), this.contextProvider.get());
        if (provideZendeskSdkSettingsProvider != null) {
            return provideZendeskSdkSettingsProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskSettingsProvider> create(C3351dc<SdkSettingsService> dcVar, C3351dc<SettingsStorage> dcVar2, C3351dc<CoreSettingsStorage> dcVar3, C3351dc<Serializer> dcVar4, C3351dc<ApplicationConfiguration> dcVar5, C3351dc<Context> dcVar6) {
        return new ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(dcVar, dcVar2, dcVar3, dcVar4, dcVar5, dcVar6);
    }
}
