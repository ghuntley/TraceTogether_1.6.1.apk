package zendesk.support;

import java.util.Locale;

class ApplicationScope {
    private final Locale locale;
    private final ZendeskTracker zendeskTracker;

    private ApplicationScope(Builder builder) {
        this.locale = builder.locale;
        this.zendeskTracker = builder.zendeskTracker;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public ZendeskTracker getZendeskTracker() {
        return this.zendeskTracker;
    }

    static class Builder {
        /* access modifiers changed from: private */
        public Locale locale = Locale.getDefault();
        /* access modifiers changed from: private */
        public ZendeskTracker zendeskTracker = new AnswersTracker();

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public Builder zendeskTracker(ZendeskTracker zendeskTracker2) {
            this.zendeskTracker = zendeskTracker2;
            return this;
        }

        /* access modifiers changed from: package-private */
        public ApplicationScope build() {
            return new ApplicationScope(this);
        }
    }
}
