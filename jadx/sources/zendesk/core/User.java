package zendesk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.O;

public class User {
    private final boolean agent = false;
    private final Long id = -1L;
    private final String name = "";
    private final Attachment photo = null;
    private final List<String> tags = new ArrayList();
    private final Map<String, String> userFields = new HashMap();

    public List<String> getTags() {
        return O.m1393(this.tags);
    }

    public Map<String, String> getUserFields() {
        return O.m1396(this.userFields);
    }
}
