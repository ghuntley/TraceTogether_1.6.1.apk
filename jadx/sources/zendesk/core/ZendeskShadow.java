package zendesk.core;

import o.F;
import o.G;
import o.P;

final class ZendeskShadow {
    private final BlipsCoreProvider blipsCoreProvider;
    private final CoreModule coreModule;
    private final IdentityManager identityManager;
    private final LegacyIdentityMigrator legacyIdentityMigrator;
    private final ProviderStore providerStore;
    private final PushRegistrationProvider pushRegistrationProvider;
    private final Storage storage;

    ZendeskShadow(Storage storage2, LegacyIdentityMigrator legacyIdentityMigrator2, IdentityManager identityManager2, BlipsCoreProvider blipsCoreProvider2, PushRegistrationProvider pushRegistrationProvider2, CoreModule coreModule2, ProviderStore providerStore2) {
        this.storage = storage2;
        this.legacyIdentityMigrator = legacyIdentityMigrator2;
        this.identityManager = identityManager2;
        this.blipsCoreProvider = blipsCoreProvider2;
        this.pushRegistrationProvider = pushRegistrationProvider2;
        this.coreModule = coreModule2;
        this.providerStore = providerStore2;
    }

    /* access modifiers changed from: package-private */
    public final void init(ApplicationConfiguration applicationConfiguration, boolean z) {
        if (this.storage.hasSdkConfigChanged(applicationConfiguration)) {
            F.m1359();
            this.storage.clear();
            this.storage.storeSdkHash(applicationConfiguration);
        } else if (z) {
            F.m1363();
            return;
        }
        this.blipsCoreProvider.coreInitialized();
    }

    /* access modifiers changed from: package-private */
    public final void cleanupIfNewConfig(ApplicationConfiguration applicationConfiguration) {
        if (this.storage.hasSdkConfigChanged(applicationConfiguration)) {
            this.pushRegistrationProvider.unregisterDevice((G<Void>) null);
        }
    }

    public final void setIdentity(Identity identity) {
        if (checkIdentityValid(identity)) {
            this.legacyIdentityMigrator.checkAndMigrateIdentity();
            if (this.identityManager.identityIsDifferent(identity)) {
                this.pushRegistrationProvider.unregisterDevice((G<Void>) null);
                this.storage.getSessionStorage().clear();
                this.identityManager.updateAndPersistIdentity(identity);
                return;
            }
            F.m1363();
        }
    }

    public final CoreModule coreModule() {
        return this.coreModule;
    }

    private static boolean checkIdentityValid(Identity identity) {
        if (identity == null) {
            F.m1361();
            return false;
        } else if (!(identity instanceof AnonymousIdentity) && !(identity instanceof JwtIdentity)) {
            F.m1361();
            return false;
        } else if (!(identity instanceof JwtIdentity) || !P.m1409(((JwtIdentity) identity).getJwtUserIdentifier())) {
            return true;
        } else {
            F.m1361();
            return false;
        }
    }
}
