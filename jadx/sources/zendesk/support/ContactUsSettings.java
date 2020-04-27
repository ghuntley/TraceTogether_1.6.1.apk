package zendesk.support;

import java.util.Collections;
import java.util.List;
import o.O;

class ContactUsSettings {
    private static ContactUsSettings DEFAULT = new ContactUsSettings(Collections.emptyList());
    private List<String> tags;

    static ContactUsSettings defaultSettings() {
        return DEFAULT;
    }

    ContactUsSettings(List<String> list) {
        this.tags = list;
    }

    ContactUsSettings() {
    }

    public List<String> getTags() {
        return O.m1393(this.tags);
    }
}
