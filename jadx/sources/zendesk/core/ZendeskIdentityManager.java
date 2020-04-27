package zendesk.core;

import java.util.Locale;
import o.F;
import o.P;

class ZendeskIdentityManager implements IdentityManager {
    private final IdentityStorage identityStorage;

    ZendeskIdentityManager(IdentityStorage identityStorage2) {
        this.identityStorage = identityStorage2;
    }

    public boolean identityIsDifferent(Identity identity) {
        Identity identity2 = this.identityStorage.getIdentity();
        return identity2 == null || identity == null || !identity2.equals(identity);
    }

    public Identity updateAndPersistIdentity(Identity identity) {
        Identity identity2 = this.identityStorage.getIdentity();
        if (identity2 == null) {
            F.m1359();
            this.identityStorage.storeIdentity(identity);
            return identity;
        } else if (identity == null || !identityIsDifferent(identity)) {
            return identity2;
        } else {
            F.m1359();
            this.identityStorage.storeIdentity(identity);
            return identity;
        }
    }

    public String getSdkGuid() {
        String uuid = this.identityStorage.getUuid();
        return P.m1409(uuid) ? this.identityStorage.updateSdkGuid() : uuid;
    }

    public String getStoredAccessTokenAsBearerToken() {
        AccessToken storedAccessToken = this.identityStorage.getStoredAccessToken();
        if (storedAccessToken != null) {
            return String.format(Locale.US, "Bearer %s", new Object[]{storedAccessToken.getAccessToken()});
        }
        F.m1361();
        return null;
    }

    public Identity getIdentity() {
        Identity identity = this.identityStorage.getIdentity();
        if (!(identity instanceof AnonymousIdentity)) {
            return identity;
        }
        AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
        anonymousIdentity.setSdkGuid(getSdkGuid());
        return anonymousIdentity;
    }

    public String getBlipsUuid() {
        String blipsUuid = this.identityStorage.getBlipsUuid();
        return P.m1409(blipsUuid) ? this.identityStorage.updateBlipsUuid() : blipsUuid;
    }

    public void storeAccessToken(AccessToken accessToken) {
        if (accessToken == null) {
            F.m1361();
            return;
        }
        if (!P.m1409(accessToken.getAccessToken())) {
            this.identityStorage.storeAccessToken(accessToken);
        } else {
            F.m1361();
        }
        String userId = accessToken.getUserId();
        if (P.m1404(userId)) {
            this.identityStorage.storeUserId(Long.valueOf(userId));
        } else {
            F.m1361();
        }
    }

    public Long getUserId() {
        return this.identityStorage.getUserId();
    }
}
