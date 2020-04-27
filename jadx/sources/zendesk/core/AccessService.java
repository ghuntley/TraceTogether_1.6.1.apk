package zendesk.core;

import o.C3552ku;
import o.kJ;
import o.kY;

interface AccessService {
    @kY(m3255 = "/access/sdk/anonymous")
    C3552ku<AuthenticationResponse> getAuthTokenForAnonymous(@kJ AuthenticationRequestWrapper authenticationRequestWrapper);

    @kY(m3255 = "/access/sdk/jwt")
    C3552ku<AuthenticationResponse> getAuthTokenForJwt(@kJ AuthenticationRequestWrapper authenticationRequestWrapper);
}
