package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvideLegacyIdentityStorageFactory implements M<LegacyIdentityMigrator> {
    private final C3351dc<IdentityManager> identityManagerProvider;
    private final C3351dc<IdentityStorage> identityStorageProvider;
    private final C3351dc<SharedPreferencesStorage> legacyIdentityBaseStorageProvider;
    private final C3351dc<SharedPreferencesStorage> legacyPushBaseStorageProvider;
    private final C3351dc<PushDeviceIdStorage> pushDeviceIdStorageProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(C3351dc<SharedPreferencesStorage> dcVar, C3351dc<SharedPreferencesStorage> dcVar2, C3351dc<IdentityStorage> dcVar3, C3351dc<IdentityManager> dcVar4, C3351dc<PushDeviceIdStorage> dcVar5) {
        this.legacyIdentityBaseStorageProvider = dcVar;
        this.legacyPushBaseStorageProvider = dcVar2;
        this.identityStorageProvider = dcVar3;
        this.identityManagerProvider = dcVar4;
        this.pushDeviceIdStorageProvider = dcVar5;
    }

    public final LegacyIdentityMigrator get() {
        LegacyIdentityMigrator provideLegacyIdentityStorage = ZendeskStorageModule.provideLegacyIdentityStorage(this.legacyIdentityBaseStorageProvider.get(), this.legacyPushBaseStorageProvider.get(), this.identityStorageProvider.get(), this.identityManagerProvider.get(), this.pushDeviceIdStorageProvider.get());
        if (provideLegacyIdentityStorage != null) {
            return provideLegacyIdentityStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<LegacyIdentityMigrator> create(C3351dc<SharedPreferencesStorage> dcVar, C3351dc<SharedPreferencesStorage> dcVar2, C3351dc<IdentityStorage> dcVar3, C3351dc<IdentityManager> dcVar4, C3351dc<PushDeviceIdStorage> dcVar5) {
        return new ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(dcVar, dcVar2, dcVar3, dcVar4, dcVar5);
    }
}
