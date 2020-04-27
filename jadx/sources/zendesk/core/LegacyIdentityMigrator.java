package zendesk.core;

import java.io.Reader;
import java.io.StringReader;
import o.C1367;
import o.C1389;
import o.C1700;
import o.C1701;
import o.F;
import o.P;
import zendesk.core.AnonymousIdentity;

class LegacyIdentityMigrator {
    private IdentityManager identityManager;
    private IdentityStorage identityStorage;
    private SharedPreferencesStorage legacyIdentityStorage;
    private SharedPreferencesStorage legacyPushStorage;
    private PushDeviceIdStorage pushDeviceIdStorage;

    LegacyIdentityMigrator(SharedPreferencesStorage sharedPreferencesStorage, SharedPreferencesStorage sharedPreferencesStorage2, IdentityStorage identityStorage2, IdentityManager identityManager2, PushDeviceIdStorage pushDeviceIdStorage2) {
        this.legacyIdentityStorage = sharedPreferencesStorage;
        this.legacyPushStorage = sharedPreferencesStorage2;
        this.identityStorage = identityStorage2;
        this.identityManager = identityManager2;
        this.pushDeviceIdStorage = pushDeviceIdStorage2;
    }

    /* access modifiers changed from: package-private */
    public void checkAndMigrateIdentity() {
        Identity legacyIdentity = getLegacyIdentity();
        if (legacyIdentity != null) {
            this.identityStorage.storeIdentity(legacyIdentity);
            long legacyUserId = getLegacyUserId();
            if (legacyUserId != 0) {
                this.identityStorage.storeUserId(Long.valueOf(legacyUserId));
            }
            AccessToken legacyAccessToken = getLegacyAccessToken();
            if (legacyAccessToken != null) {
                this.identityManager.storeAccessToken(legacyAccessToken);
            }
            if (getLegacyIdentityType() == AuthenticationType.ANONYMOUS) {
                String legacySdkGuid = getLegacySdkGuid();
                if (P.m1406(legacySdkGuid)) {
                    this.identityStorage.storeSdkGuid(legacySdkGuid);
                }
            }
            String legacyPushId = getLegacyPushId();
            if (P.m1406(legacyPushId)) {
                this.pushDeviceIdStorage.storePushDeviceId(legacyPushId);
            }
            clear();
        }
    }

    private Identity getLegacyIdentity() {
        AuthenticationType legacyIdentityType = getLegacyIdentityType();
        if (legacyIdentityType == null) {
            return null;
        }
        int i = AnonymousClass1.$SwitchMap$zendesk$core$AuthenticationType[legacyIdentityType.ordinal()];
        if (i == 1) {
            return readLegacyAnonymousIdentity();
        }
        if (i != 2) {
            return null;
        }
        return readLegacyJwtIdentity();
    }

    /* renamed from: zendesk.core.LegacyIdentityMigrator$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$core$AuthenticationType = new int[AuthenticationType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                zendesk.core.AuthenticationType[] r0 = zendesk.core.AuthenticationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$core$AuthenticationType = r0
                int[] r0 = $SwitchMap$zendesk$core$AuthenticationType     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.core.AuthenticationType r1 = zendesk.core.AuthenticationType.ANONYMOUS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$core$AuthenticationType     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.core.AuthenticationType r1 = zendesk.core.AuthenticationType.JWT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.core.LegacyIdentityMigrator.AnonymousClass1.<clinit>():void");
        }
    }

    private AnonymousIdentity readLegacyAnonymousIdentity() {
        String str = this.legacyIdentityStorage.get("zendesk-identity");
        if (P.m1409(str)) {
            return null;
        }
        try {
            C1367 r0 = C1700.m9668((Reader) new StringReader(str));
            if (r0 != null) {
                if (r0 instanceof C1389) {
                    if (r0 instanceof C1389) {
                        C1389 r02 = (C1389) r0;
                        AnonymousIdentity.Builder builder = new AnonymousIdentity.Builder();
                        C1367 r3 = r02.f7635.get("email");
                        if (r3 != null) {
                            builder.withEmailIdentifier(r3.m8483());
                        }
                        C1367 r03 = r02.f7635.get("name");
                        if (r03 != null) {
                            builder.withNameIdentifier(r03.m8483());
                        }
                        return (AnonymousIdentity) builder.build();
                    }
                    throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(r0)));
                }
            }
            return null;
        } catch (C1701 unused) {
            F.m1356();
            return null;
        }
    }

    private JwtIdentity readLegacyJwtIdentity() {
        String str = this.legacyIdentityStorage.get("zendesk-identity");
        if (P.m1409(str)) {
            return null;
        }
        try {
            C1367 r0 = C1700.m9668((Reader) new StringReader(str));
            if (r0 == null) {
                return null;
            }
            if (r0 instanceof C1389) {
                C1367 r02 = ((C1389) r0).f7635.get("token");
                if (r02 != null) {
                    return new JwtIdentity(r02.m8483());
                }
                return null;
            }
            throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(r0)));
        } catch (C1701 unused) {
            F.m1356();
            return null;
        }
    }

    private AuthenticationType getLegacyIdentityType() {
        return AuthenticationType.getAuthType(this.legacyIdentityStorage.get("zendesk-identity-type"));
    }

    private AccessToken getLegacyAccessToken() {
        String str = this.legacyIdentityStorage.get("stored_token");
        if (P.m1409(str)) {
            return null;
        }
        try {
            C1367 r0 = C1700.m9668((Reader) new StringReader(str));
            if (r0 != null) {
                if (r0 instanceof C1389) {
                    if (r0 instanceof C1389) {
                        C1389 r02 = (C1389) r0;
                        C1367 r1 = r02.f7635.get("access_token");
                        C1367 r03 = r02.f7635.get("user_id");
                        if (r1 == null || r03 == null) {
                            return null;
                        }
                        return new AccessToken(r1.m8483(), r03.m8483());
                    }
                    throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(r0)));
                }
            }
            return null;
        } catch (C1701 unused) {
            F.m1356();
            return null;
        }
    }

    private String getLegacySdkGuid() {
        return this.legacyIdentityStorage.get("uuid");
    }

    private long getLegacyUserId() {
        return this.legacyIdentityStorage.getLong("user_id");
    }

    private String getLegacyPushId() {
        String str = this.legacyPushStorage.get("pushRegResponseIdentifier");
        if (P.m1406(str)) {
            try {
                C1367 r0 = C1700.m9668((Reader) new StringReader(str));
                if (r0 != null) {
                    if (r0 instanceof C1389) {
                        if (r0 instanceof C1389) {
                            C1367 r02 = ((C1389) r0).f7635.get("identifier");
                            if (r02 != null) {
                                return r02.m8483();
                            }
                        } else {
                            throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(r0)));
                        }
                    }
                }
                return null;
            } catch (C1701 unused) {
                F.m1356();
            }
        }
        return null;
    }

    private void clear() {
        this.legacyIdentityStorage.remove("zendesk-identity-type");
        this.legacyIdentityStorage.remove("zendesk-identity");
        this.legacyIdentityStorage.remove("stored_token");
        this.legacyIdentityStorage.remove("uuid");
        this.legacyIdentityStorage.remove("user_id");
        this.legacyPushStorage.remove("pushRegResponseIdentifier");
    }
}
