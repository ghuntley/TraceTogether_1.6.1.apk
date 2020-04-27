package zendesk.core;

import java.util.Map;
import o.C2709;

class BlipsRequest {
    @C2709(m14406 = "appId")
    private String appId;
    private String channel;
    @C2709(m14406 = "pageView")
    private ApiPageView pageView;
    @C2709(m14406 = "schemaVersion")
    private String schemaVersion = "1";
    private String timestamp;
    private String url;
    @C2709(m14406 = "userAction")
    private ApiUserAction userAction;
    @C2709(m14406 = "userId")
    private Long userId;
    private String uuid;
    private String version;

    static BlipsRequest buildUserAction(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, Object> map) {
        BlipsRequest blipsRequest = new BlipsRequest();
        blipsRequest.uuid = str;
        blipsRequest.timestamp = str2;
        blipsRequest.userId = l;
        blipsRequest.appId = str3;
        blipsRequest.version = str4;
        blipsRequest.channel = str5;
        blipsRequest.userAction = new ApiUserAction(str6, str7, str8, map);
        return blipsRequest;
    }

    static BlipsRequest buildPageView(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, Object> map) {
        BlipsRequest blipsRequest = new BlipsRequest();
        blipsRequest.uuid = str;
        blipsRequest.timestamp = str2;
        blipsRequest.userId = l;
        blipsRequest.appId = str3;
        blipsRequest.version = str4;
        blipsRequest.channel = str5;
        blipsRequest.url = str6;
        blipsRequest.pageView = new ApiPageView(str7, str8, map);
        return blipsRequest;
    }

    private BlipsRequest() {
    }

    static class ApiUserAction {
        private String action;
        private String category;
        private String label;
        private Map<String, Object> value;

        ApiUserAction(String str, String str2, String str3, Map<String, Object> map) {
            this.category = str;
            this.action = str2;
            this.label = str3;
            this.value = map;
        }
    }

    static class ApiPageView {
        @C2709(m14406 = "navigatorLanguage")
        private String navigatorLanguage;
        @C2709(m14406 = "pageTitle")
        private String pageTitle;
        private Map<String, Object> value;

        ApiPageView(String str, String str2, Map<String, Object> map) {
            this.navigatorLanguage = str;
            this.pageTitle = str2;
            this.value = map;
        }
    }
}
