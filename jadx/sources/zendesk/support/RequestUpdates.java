package zendesk.support;

import java.util.Collections;
import java.util.Map;

public final class RequestUpdates {
    private final Map<String, Integer> requestIds;

    public RequestUpdates(Map<String, Integer> map) {
        if (map == null) {
            this.requestIds = Collections.emptyMap();
        } else {
            this.requestIds = map;
        }
    }

    public final boolean isRequestUnread(String str) {
        return this.requestIds.containsKey(str) && this.requestIds.get(str).intValue() > 0;
    }
}
