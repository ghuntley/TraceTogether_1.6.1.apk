package zendesk.support;

import java.util.HashMap;
import java.util.Map;

class ZendeskRequestSessionCache implements RequestSessionCache {
    private final Map<Long, Object> cachedTicketForms = new HashMap();

    ZendeskRequestSessionCache() {
    }
}
