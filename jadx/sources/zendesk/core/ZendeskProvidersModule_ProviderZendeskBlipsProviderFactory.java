package zendesk.core;

import java.util.concurrent.ExecutorService;
import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory implements M<ZendeskBlipsProvider> {
    private final C3351dc<ApplicationConfiguration> applicationConfigurationProvider;
    private final C3351dc<BlipsService> blipsServiceProvider;
    private final C3351dc<CoreSettingsStorage> coreSettingsStorageProvider;
    private final C3351dc<DeviceInfo> deviceInfoProvider;
    private final C3351dc<ExecutorService> executorProvider;
    private final C3351dc<IdentityManager> identityManagerProvider;
    private final C3351dc<Serializer> serializerProvider;

    public ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(C3351dc<BlipsService> dcVar, C3351dc<DeviceInfo> dcVar2, C3351dc<Serializer> dcVar3, C3351dc<IdentityManager> dcVar4, C3351dc<ApplicationConfiguration> dcVar5, C3351dc<CoreSettingsStorage> dcVar6, C3351dc<ExecutorService> dcVar7) {
        this.blipsServiceProvider = dcVar;
        this.deviceInfoProvider = dcVar2;
        this.serializerProvider = dcVar3;
        this.identityManagerProvider = dcVar4;
        this.applicationConfigurationProvider = dcVar5;
        this.coreSettingsStorageProvider = dcVar6;
        this.executorProvider = dcVar7;
    }

    public final ZendeskBlipsProvider get() {
        ZendeskBlipsProvider providerZendeskBlipsProvider = ZendeskProvidersModule.providerZendeskBlipsProvider(this.blipsServiceProvider.get(), this.deviceInfoProvider.get(), this.serializerProvider.get(), this.identityManagerProvider.get(), this.applicationConfigurationProvider.get(), this.coreSettingsStorageProvider.get(), this.executorProvider.get());
        if (providerZendeskBlipsProvider != null) {
            return providerZendeskBlipsProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskBlipsProvider> create(C3351dc<BlipsService> dcVar, C3351dc<DeviceInfo> dcVar2, C3351dc<Serializer> dcVar3, C3351dc<IdentityManager> dcVar4, C3351dc<ApplicationConfiguration> dcVar5, C3351dc<CoreSettingsStorage> dcVar6, C3351dc<ExecutorService> dcVar7) {
        return new ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(dcVar, dcVar2, dcVar3, dcVar4, dcVar5, dcVar6, dcVar7);
    }
}
