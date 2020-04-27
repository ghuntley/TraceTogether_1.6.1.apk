package zendesk.support;

import o.C2709;
import zendesk.core.Settings;

public class HelpCenterSettings implements Settings {
    private static HelpCenterSettings DEFAULT = new HelpCenterSettings();
    @C2709(m14406 = "help_center_article_voting_enabled")
    private boolean articleVotingEnabled;
    private boolean enabled;
    private String locale;

    static HelpCenterSettings defaultSettings() {
        return DEFAULT;
    }

    HelpCenterSettings() {
    }

    /* access modifiers changed from: package-private */
    public boolean isEnabled() {
        return this.enabled;
    }

    public String getLocale() {
        return this.locale;
    }

    /* access modifiers changed from: package-private */
    public boolean isArticleVotingEnabled() {
        return this.articleVotingEnabled;
    }
}
