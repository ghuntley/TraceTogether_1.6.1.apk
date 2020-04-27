package zendesk.core;

import java.io.IOException;
import o.F;
import o.P;
import o.kB;

class ZendeskAccessProvider implements AccessProvider {
    private final AccessService accessService;
    private final IdentityManager identityManager;

    ZendeskAccessProvider(IdentityManager identityManager2, AccessService accessService2) {
        this.identityManager = identityManager2;
        this.accessService = accessService2;
    }

    public AccessToken getAndStoreAuthTokenViaAnonymous(AnonymousIdentity anonymousIdentity) {
        kB<AuthenticationResponse> kBVar;
        F.m1359();
        AccessToken accessToken = null;
        try {
            AuthenticationRequestWrapper authenticationRequestWrapper = new AuthenticationRequestWrapper();
            authenticationRequestWrapper.setUser(new ApiAnonymousIdentity(anonymousIdentity, this.identityManager.getSdkGuid()));
            kBVar = this.accessService.getAuthTokenForAnonymous(authenticationRequestWrapper).m3314();
        } catch (IOException e) {
            e.getMessage();
            F.m1355();
            kBVar = null;
        }
        if (!(kBVar == null || kBVar.f2556 == null || (accessToken = ((AuthenticationResponse) kBVar.f2556).getAuthentication()) == null)) {
            storeAccessTokenAndUserId(accessToken);
        }
        return accessToken;
    }

    public AccessToken getAndStoreAuthTokenViaJwt(JwtIdentity jwtIdentity) {
        kB<AuthenticationResponse> kBVar;
        F.m1359();
        AccessToken accessToken = null;
        if (P.m1409(jwtIdentity.getJwtUserIdentifier())) {
            F.m1358();
            return null;
        }
        try {
            AuthenticationRequestWrapper authenticationRequestWrapper = new AuthenticationRequestWrapper();
            authenticationRequestWrapper.setUser(jwtIdentity);
            kBVar = this.accessService.getAuthTokenForJwt(authenticationRequestWrapper).m3314();
        } catch (IOException e) {
            e.getMessage();
            F.m1355();
            kBVar = null;
        }
        if (!(kBVar == null || kBVar.f2556 == null || (accessToken = ((AuthenticationResponse) kBVar.f2556).getAuthentication()) == null)) {
            storeAccessTokenAndUserId(accessToken);
        }
        return accessToken;
    }

    private void storeAccessTokenAndUserId(AccessToken accessToken) {
        this.identityManager.storeAccessToken(accessToken);
    }
}
