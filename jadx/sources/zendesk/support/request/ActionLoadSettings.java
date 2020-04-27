package zendesk.support.request;

import o.C;
import o.F;
import o.G;
import o.P;
import o.nk;
import o.no;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Identity;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.request.AsyncMiddleware;

class ActionLoadSettings implements AsyncMiddleware.AsyncAction {
    /* access modifiers changed from: private */
    public final ActionFactory actionFactory;
    private final AuthenticationProvider authProvider;
    private final SupportSettingsProvider settingsProvider;

    ActionLoadSettings(ActionFactory actionFactory2, SupportSettingsProvider supportSettingsProvider, AuthenticationProvider authenticationProvider) {
        this.actionFactory = actionFactory2;
        this.settingsProvider = supportSettingsProvider;
        this.authProvider = authenticationProvider;
    }

    public void actionQueued(nk nkVar, no noVar) {
        nkVar.m3992(this.actionFactory.loadSettings());
    }

    public void execute(final nk nkVar, no noVar, final AsyncMiddleware.Callback callback) {
        this.settingsProvider.getSettings(new G<SupportSdkSettings>() {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                nkVar.m3992(ActionLoadSettings.this.actionFactory.loadSettingsSuccess(ActionLoadSettings.this.constructSettings(supportSdkSettings)));
                callback.done();
            }

            public void onError(C c) {
                new Object[1][0] = c.m1280();
                F.m1361();
                nkVar.m3992(ActionLoadSettings.this.actionFactory.loadSettingsError(c));
                callback.done();
            }
        });
    }

    /* access modifiers changed from: private */
    public StateSettings constructSettings(SupportSdkSettings supportSdkSettings) {
        Identity identity = this.authProvider.getIdentity();
        if (!(identity instanceof AnonymousIdentity)) {
            return StateSettings.fromSupportSettings(supportSdkSettings, true, true);
        }
        AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
        return StateSettings.fromSupportSettings(supportSdkSettings, P.m1406(anonymousIdentity.getEmail()), P.m1406(anonymousIdentity.getName()));
    }
}
