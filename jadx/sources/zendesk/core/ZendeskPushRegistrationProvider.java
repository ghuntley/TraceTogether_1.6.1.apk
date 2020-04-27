package zendesk.core;

import java.util.Locale;
import o.G;
import o.I;
import o.P;

class ZendeskPushRegistrationProvider implements PushRegistrationProvider {
    private static final I.Cif<PushRegistrationResponseWrapper, String> PUSH_RESPONSE_EXTRACTOR = new I.Cif<PushRegistrationResponseWrapper, String>() {
        public final String extract(PushRegistrationResponseWrapper pushRegistrationResponseWrapper) {
            return (pushRegistrationResponseWrapper == null || pushRegistrationResponseWrapper.getRegistrationResponse() == null || !P.m1406(pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier())) ? "" : pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier();
        }
    };
    /* access modifiers changed from: private */
    public final BlipsCoreProvider blipsProvider;
    private final IdentityManager identityManager;
    private final Locale locale;
    /* access modifiers changed from: private */
    public final PushDeviceIdStorage pushIdStorage;
    private final PushRegistrationService pushService;
    private final SettingsProvider settingsProvider;

    ZendeskPushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager2, SettingsProvider settingsProvider2, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, Locale locale2) {
        this.pushService = pushRegistrationService;
        this.identityManager = identityManager2;
        this.settingsProvider = settingsProvider2;
        this.blipsProvider = blipsCoreProvider;
        this.pushIdStorage = pushDeviceIdStorage;
        this.locale = locale2;
    }

    public void unregisterDevice(final G<Void> g) {
        String pushDeviceId = this.pushIdStorage.getPushDeviceId();
        final Long userId = this.identityManager.getUserId();
        if (pushDeviceId != null) {
            this.pushService.unregisterDevice(pushDeviceId).m3316(new I(new PassThroughErrorZendeskCallback<Void>(g) {
                public void onSuccess(Void voidR) {
                    ZendeskPushRegistrationProvider.this.pushIdStorage.removePushDeviceId();
                    ZendeskPushRegistrationProvider.this.blipsProvider.corePushDisabled(userId);
                    G g = g;
                    if (g != null) {
                        g.onSuccess(voidR);
                    }
                }
            }));
        }
    }
}
