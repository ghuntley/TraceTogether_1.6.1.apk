package zendesk.support;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.L;
import o.P;
import zendesk.core.BlipsGroup;
import zendesk.core.BlipsProvider;
import zendesk.core.PageView;
import zendesk.core.UserAction;

class ZendeskSupportBlipsProvider implements SupportBlipsProvider {
    private BlipsProvider blipsProvider;
    private Locale locale;

    ZendeskSupportBlipsProvider(BlipsProvider blipsProvider2, Locale locale2) {
        this.blipsProvider = blipsProvider2;
        this.locale = locale2;
    }

    public void helpCenterSearch(String str) {
        if (P.m1406(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("query", str);
            hashMap.put("code", "java");
            sendUserAction(BlipsGroup.PATHFINDER, "search", "helpCenterForm", hashMap);
        }
    }

    public void articleView(Article article) {
        if (article != null) {
            String htmlUrl = article.getHtmlUrl();
            String title = article.getTitle();
            if (P.m1411(htmlUrl, title)) {
                HashMap hashMap = new HashMap();
                hashMap.put("code", "java");
                this.blipsProvider.sendBlip(new PageView("2.2.1", "support_sdk", htmlUrl, L.m1389(this.locale), title, hashMap), BlipsGroup.PATHFINDER);
            }
        }
    }

    public void articleVote(Long l, int i) {
        if (l != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("articleId", l);
            hashMap.put("vote", Integer.valueOf(i));
            sendUserAction(BlipsGroup.BEHAVIOURAL, "articleVote", hashMap);
        }
    }

    public void requestCreated(String str) {
        if (!P.m1409(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("requestId", str);
            sendUserAction(BlipsGroup.BEHAVIOURAL, "requestCreated", hashMap);
        }
    }

    public void requestUpdated(String str) {
        if (!P.m1409(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("requestId", str);
            sendUserAction(BlipsGroup.BEHAVIOURAL, "requestUpdated", hashMap);
        }
    }

    public void requestViewed(String str) {
        if (!P.m1409(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("requestId", str);
            sendUserAction(BlipsGroup.BEHAVIOURAL, "requestViewed", hashMap);
        }
    }

    public void requestListViewed() {
        sendUserAction(BlipsGroup.BEHAVIOURAL, "requestListViewed");
    }

    private void sendUserAction(BlipsGroup blipsGroup, String str, String str2, Map<String, Object> map) {
        this.blipsProvider.sendBlip(new UserAction("2.2.1", "support_sdk", "SupportSDK", str, str2, map), blipsGroup);
    }

    private void sendUserAction(BlipsGroup blipsGroup, String str, Map<String, Object> map) {
        sendUserAction(blipsGroup, str, (String) null, map);
    }

    private void sendUserAction(BlipsGroup blipsGroup, String str) {
        sendUserAction(blipsGroup, str, (String) null, (Map<String, Object>) null);
    }
}
