package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskApplicationModule_ProvideZendeskFactory implements M<ZendeskShadow> {
    private final C3351dc<BlipsCoreProvider> blipsCoreProvider;
    private final C3351dc<CoreModule> coreModuleProvider;
    private final C3351dc<IdentityManager> identityManagerProvider;
    private final C3351dc<LegacyIdentityMigrator> legacyIdentityMigratorProvider;
    private final C3351dc<ProviderStore> providerStoreProvider;
    private final C3351dc<PushRegistrationProvider> pushRegistrationProvider;
    private final C3351dc<Storage> storageProvider;

    public ZendeskApplicationModule_ProvideZendeskFactory(C3351dc<Storage> dcVar, C3351dc<LegacyIdentityMigrator> dcVar2, C3351dc<IdentityManager> dcVar3, C3351dc<BlipsCoreProvider> dcVar4, C3351dc<PushRegistrationProvider> dcVar5, C3351dc<CoreModule> dcVar6, C3351dc<ProviderStore> dcVar7) {
        this.storageProvider = dcVar;
        this.legacyIdentityMigratorProvider = dcVar2;
        this.identityManagerProvider = dcVar3;
        this.blipsCoreProvider = dcVar4;
        this.pushRegistrationProvider = dcVar5;
        this.coreModuleProvider = dcVar6;
        this.providerStoreProvider = dcVar7;
    }

    public final ZendeskShadow get() {
        ZendeskShadow provideZendesk = ZendeskApplicationModule.provideZendesk(this.storageProvider.get(), this.legacyIdentityMigratorProvider.get(), this.identityManagerProvider.get(), this.blipsCoreProvider.get(), this.pushRegistrationProvider.get(), this.coreModuleProvider.get(), this.providerStoreProvider.get());
        if (provideZendesk != null) {
            return provideZendesk;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskShadow> create(C3351dc<Storage> dcVar, C3351dc<LegacyIdentityMigrator> dcVar2, C3351dc<IdentityManager> dcVar3, C3351dc<BlipsCoreProvider> dcVar4, C3351dc<PushRegistrationProvider> dcVar5, C3351dc<CoreModule> dcVar6, C3351dc<ProviderStore> dcVar7) {
        return new ZendeskApplicationModule_ProvideZendeskFactory(dcVar, dcVar2, dcVar3, dcVar4, dcVar5, dcVar6, dcVar7);
    }
}
