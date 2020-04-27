package zendesk.core;

import java.util.Map;
import o.C1367;
import o.C3552ku;
import o.C3565le;
import o.kP;
import o.kT;

interface SdkSettingsService {
    @kP(m3248 = "/api/private/mobile_sdk/settings/{applicationId}.json")
    C3552ku<Map<String, C1367>> getSettings(@kT(m3251 = "Accept-Language") String str, @C3565le(m3556 = "applicationId") String str2);
}
