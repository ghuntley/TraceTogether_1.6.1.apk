package zendesk.support.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o.nt;

class StateConfig implements Serializable {
    private final StateSettings settings;
    private final String subject;
    private final List<String> tags;
    private final StateRequestTicketForm ticketForm;

    static StateConfig fromState(nt ntVar) {
        Class<StateConfig> cls = StateConfig.class;
        Object obj = ntVar.f3432.get(cls.getSimpleName());
        if (!cls.isInstance(obj)) {
            obj = null;
        }
        StateConfig stateConfig = (StateConfig) obj;
        if (stateConfig != null) {
            return stateConfig;
        }
        return new StateConfig();
    }

    private StateConfig(StateSettings stateSettings, List<String> list, String str, StateRequestTicketForm stateRequestTicketForm) {
        this.settings = stateSettings;
        this.tags = list;
        this.subject = str;
        this.ticketForm = stateRequestTicketForm;
    }

    StateConfig() {
        this.settings = new StateSettings();
        this.tags = new ArrayList();
        this.subject = "";
        this.ticketForm = null;
    }

    /* access modifiers changed from: package-private */
    public StateSettings getSettings() {
        return this.settings;
    }

    /* access modifiers changed from: package-private */
    public List<String> getTags() {
        return this.tags;
    }

    /* access modifiers changed from: package-private */
    public String getSubject() {
        return this.subject;
    }

    /* access modifiers changed from: package-private */
    public StateRequestTicketForm getTicketForm() {
        return this.ticketForm;
    }

    /* access modifiers changed from: package-private */
    public Builder newBuilder() {
        return new Builder(this.settings, this.tags, this.subject, this.ticketForm);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Config{settings=");
        sb.append(this.settings);
        sb.append(", subject='");
        sb.append(this.subject);
        sb.append('\'');
        sb.append(", ticketForm=");
        sb.append(this.ticketForm);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append('}');
        return sb.toString();
    }

    static class Builder {
        private StateSettings settings;
        private String subject;
        private List<String> tags;
        private StateRequestTicketForm ticketForm;

        private Builder(StateSettings stateSettings, List<String> list, String str, StateRequestTicketForm stateRequestTicketForm) {
            this.settings = stateSettings;
            this.tags = list;
            this.subject = str;
            this.ticketForm = stateRequestTicketForm;
        }

        /* access modifiers changed from: package-private */
        public Builder setSettings(StateSettings stateSettings) {
            this.settings = stateSettings;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setTags(List<String> list) {
            this.tags = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setSubject(String str) {
            this.subject = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setTicketForm(StateRequestTicketForm stateRequestTicketForm) {
            this.ticketForm = stateRequestTicketForm;
            return this;
        }

        /* access modifiers changed from: package-private */
        public StateConfig build() {
            return new StateConfig(this.settings, this.tags, this.subject, this.ticketForm);
        }
    }
}
