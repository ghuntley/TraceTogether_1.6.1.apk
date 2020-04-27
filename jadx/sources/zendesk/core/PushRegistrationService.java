package zendesk.core;

import o.C3552ku;
import o.C3565le;
import o.kK;

interface PushRegistrationService {
    @kK(m3242 = "/api/mobile/push_notification_devices/{id}.json")
    C3552ku<Void> unregisterDevice(@C3565le(m3556 = "id") String str);
}
