package zendesk.support.request;

import o.P;
import o.nk;
import o.no;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Identity;
import zendesk.core.Zendesk;
import zendesk.support.request.AsyncMiddleware;

class ActionUpdateNameEmail implements AsyncMiddleware.AsyncAction {
    private final AuthenticationProvider authenticationProvider;
    private final String email;
    private final String name;

    /* renamed from: zendesk  reason: collision with root package name */
    private final Zendesk f17597zendesk;

    public void actionQueued(nk nkVar, no noVar) {
    }

    ActionUpdateNameEmail(String str, String str2, AuthenticationProvider authenticationProvider2, Zendesk zendesk2) {
        this.name = str;
        this.email = str2;
        this.authenticationProvider = authenticationProvider2;
        this.f17597zendesk = zendesk2;
    }

    public void execute(nk nkVar, no noVar, AsyncMiddleware.Callback callback) {
        Identity identity = this.authenticationProvider.getIdentity();
        if (identity instanceof AnonymousIdentity) {
            AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
            if (P.m1406(this.email) && !this.email.equals(anonymousIdentity.getEmail())) {
                anonymousIdentity = (AnonymousIdentity) new AnonymousIdentity.Builder().withEmailIdentifier(this.email).withNameIdentifier(anonymousIdentity.getName()).build();
            }
            if (P.m1406(this.name) && !this.name.equals(anonymousIdentity.getName())) {
                anonymousIdentity = (AnonymousIdentity) new AnonymousIdentity.Builder().withEmailIdentifier(anonymousIdentity.getEmail()).withNameIdentifier(this.name).build();
            }
            if (anonymousIdentity != identity) {
                this.f17597zendesk.setIdentity(anonymousIdentity);
            }
        }
        callback.done();
    }
}
