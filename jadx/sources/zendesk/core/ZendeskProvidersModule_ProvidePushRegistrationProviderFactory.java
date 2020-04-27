package zendesk.core;

import android.content.Context;
import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProvidePushRegistrationProviderFactory implements M<PushRegistrationProvider> {
    private final C3351dc<BlipsCoreProvider> blipsProvider;
    private final C3351dc<Context> contextProvider;
    private final C3351dc<IdentityManager> identityManagerProvider;
    private final C3351dc<PushDeviceIdStorage> pushDeviceIdStorageProvider;
    private final C3351dc<PushRegistrationService> pushRegistrationServiceProvider;
    private final C3351dc<SettingsProvider> settingsProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(C3351dc<PushRegistrationService> dcVar, C3351dc<IdentityManager> dcVar2, C3351dc<SettingsProvider> dcVar3, C3351dc<BlipsCoreProvider> dcVar4, C3351dc<PushDeviceIdStorage> dcVar5, C3351dc<Context> dcVar6) {
        this.pushRegistrationServiceProvider = dcVar;
        this.identityManagerProvider = dcVar2;
        this.settingsProvider = dcVar3;
        this.blipsProvider = dcVar4;
        this.pushDeviceIdStorageProvider = dcVar5;
        this.contextProvider = dcVar6;
    }

    public final PushRegistrationProvider get() {
        PushRegistrationProvider providePushRegistrationProvider = ZendeskProvidersModule.providePushRegistrationProvider(this.pushRegistrationServiceProvider.get(), this.identityManagerProvider.get(), this.settingsProvider.get(), this.blipsProvider.get(), this.pushDeviceIdStorageProvider.get(), this.contextProvider.get());
        if (providePushRegistrationProvider != null) {
            return providePushRegistrationProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<PushRegistrationProvider> create(C3351dc<PushRegistrationService> dcVar, C3351dc<IdentityManager> dcVar2, C3351dc<SettingsProvider> dcVar3, C3351dc<BlipsCoreProvider> dcVar4, C3351dc<PushDeviceIdStorage> dcVar5, C3351dc<Context> dcVar6) {
        return new ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(dcVar, dcVar2, dcVar3, dcVar4, dcVar5, dcVar6);
    }
}
