package zendesk.support;

import o.M;

public final class SupportApplicationModule_ProvidesZendeskTrackerFactory implements M<ZendeskTracker> {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvidesZendeskTrackerFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public final ZendeskTracker get() {
        ZendeskTracker providesZendeskTracker = this.module.providesZendeskTracker();
        if (providesZendeskTracker != null) {
            return providesZendeskTracker;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskTracker> create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvidesZendeskTrackerFactory(supportApplicationModule);
    }
}
