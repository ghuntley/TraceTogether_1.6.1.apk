package zendesk.core;

import o.C2709;

class PushRegistrationResponseWrapper {
    @C2709(m14406 = "push_notification_device")
    private PushRegistrationResponse registrationResponse;

    PushRegistrationResponseWrapper() {
    }

    /* access modifiers changed from: package-private */
    public PushRegistrationResponse getRegistrationResponse() {
        return this.registrationResponse;
    }
}
