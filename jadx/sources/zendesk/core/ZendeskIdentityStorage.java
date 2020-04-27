package zendesk.core;

import java.util.UUID;
import o.F;
import o.P;

class ZendeskIdentityStorage implements IdentityStorage {
    private final BaseStorage identityStorage;

    ZendeskIdentityStorage(BaseStorage baseStorage) {
        this.identityStorage = baseStorage;
    }

    public void storeAccessToken(AccessToken accessToken) {
        if (accessToken != null) {
            this.identityStorage.put("stored_token", (Object) accessToken);
        }
    }

    public AccessToken getStoredAccessToken() {
        return (AccessToken) this.identityStorage.get("stored_token", AccessToken.class);
    }

    public void storeUserId(Long l) {
        if (l != null) {
            this.identityStorage.put("user_id", (Object) l);
        }
    }

    public Long getUserId() {
        return (Long) this.identityStorage.get("user_id", Long.class);
    }

    public String getUuid() {
        F.m1359();
        String str = this.identityStorage.get("uuid");
        return P.m1409(str) ? "" : str;
    }

    public void storeIdentity(Identity identity) {
        if (identity == null) {
            F.m1358();
            return;
        }
        String str = null;
        if (identity instanceof AnonymousIdentity) {
            F.m1359();
            str = AuthenticationType.ANONYMOUS.getAuthenticationType();
        } else if (identity instanceof JwtIdentity) {
            F.m1359();
            str = AuthenticationType.JWT.getAuthenticationType();
        } else {
            F.m1358();
        }
        if (str != null) {
            this.identityStorage.put("zendesk-identity", (Object) identity);
            this.identityStorage.put("zendesk-identity-type", str);
        }
    }

    public Identity getIdentity() {
        AuthenticationType authType;
        String str = this.identityStorage.get("zendesk-identity-type");
        if (P.m1406(str) && (authType = AuthenticationType.getAuthType(str)) != null) {
            int i = AnonymousClass1.$SwitchMap$zendesk$core$AuthenticationType[authType.ordinal()];
            if (i == 1) {
                F.m1359();
                return (Identity) this.identityStorage.get("zendesk-identity", JwtIdentity.class);
            } else if (i == 2) {
                F.m1359();
                return (Identity) this.identityStorage.get("zendesk-identity", AnonymousIdentity.class);
            }
        }
        return null;
    }

    /* renamed from: zendesk.core.ZendeskIdentityStorage$1  reason: invalid class name */
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
                zendesk.core.AuthenticationType r1 = zendesk.core.AuthenticationType.JWT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$core$AuthenticationType     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.core.AuthenticationType r1 = zendesk.core.AuthenticationType.ANONYMOUS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.core.ZendeskIdentityStorage.AnonymousClass1.<clinit>():void");
        }
    }

    public String updateBlipsUuid() {
        String obj = UUID.randomUUID().toString();
        F.m1359();
        this.identityStorage.put("blips_buid", obj);
        return obj;
    }

    public String getBlipsUuid() {
        return this.identityStorage.get("blips_buid");
    }

    public void clear() {
        this.identityStorage.clear();
    }

    public String updateSdkGuid() {
        String obj = UUID.randomUUID().toString();
        storeSdkGuid(obj);
        return obj;
    }

    public void storeSdkGuid(String str) {
        F.m1359();
        this.identityStorage.put("uuid", str);
    }
}
