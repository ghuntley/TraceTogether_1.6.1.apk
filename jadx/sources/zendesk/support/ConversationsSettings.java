package zendesk.support;

class ConversationsSettings {
    private static ConversationsSettings DEFAULT = new ConversationsSettings(false);
    private boolean enabled;

    static ConversationsSettings defaultSettings() {
        return DEFAULT;
    }

    ConversationsSettings(boolean z) {
        this.enabled = z;
    }

    ConversationsSettings() {
    }

    /* access modifiers changed from: package-private */
    public boolean isEnabled() {
        return this.enabled;
    }
}
