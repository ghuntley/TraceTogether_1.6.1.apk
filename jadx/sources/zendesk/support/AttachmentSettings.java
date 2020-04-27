package zendesk.support;

class AttachmentSettings {
    private static AttachmentSettings DEFAULT = new AttachmentSettings(false, 0);
    private boolean enabled;
    private long maxAttachmentSize;

    static AttachmentSettings defaultSettings() {
        return DEFAULT;
    }

    AttachmentSettings(boolean z, long j) {
        this.enabled = z;
        this.maxAttachmentSize = j;
    }

    AttachmentSettings() {
    }

    /* access modifiers changed from: package-private */
    public boolean isEnabled() {
        return this.enabled;
    }

    /* access modifiers changed from: package-private */
    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }
}
