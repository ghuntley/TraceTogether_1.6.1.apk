package zendesk.core;

import o.F;
import o.P;

class ApiAnonymousIdentity implements Identity {
    private String email;
    private String name;
    private String sdkGuid;

    ApiAnonymousIdentity(AnonymousIdentity anonymousIdentity, String str) {
        if (P.m1409(str)) {
            this.sdkGuid = "";
            F.m1361();
        } else {
            this.sdkGuid = str;
        }
        if (anonymousIdentity == null) {
            F.m1361();
            return;
        }
        this.email = anonymousIdentity.getEmail();
        this.name = anonymousIdentity.getName();
    }
}
