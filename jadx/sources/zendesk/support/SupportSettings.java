package zendesk.support;

import zendesk.core.Settings;

class SupportSettings implements Settings {
    private static SupportSettings DEFAULT = new SupportSettings(ConversationsSettings.defaultSettings(), ContactUsSettings.defaultSettings(), AttachmentSettings.defaultSettings(), TicketFormSettings.defaultSettings(), true, true, false, "", "");
    private final AttachmentSettings attachments;
    private final ContactUsSettings contactUs;
    private final ConversationsSettings conversations;
    private final boolean neverRequestEmail;
    private final String referrerUrl;
    private final boolean showClosedRequests;
    private final boolean showReferrerLogo;
    private final String systemMessage;
    private final TicketFormSettings ticketForms;

    static SupportSettings defaultSettings() {
        return DEFAULT;
    }

    SupportSettings(ConversationsSettings conversationsSettings, ContactUsSettings contactUsSettings, AttachmentSettings attachmentSettings, TicketFormSettings ticketFormSettings, boolean z, boolean z2, boolean z3, String str, String str2) {
        this.conversations = conversationsSettings;
        this.contactUs = contactUsSettings;
        this.attachments = attachmentSettings;
        this.ticketForms = ticketFormSettings;
        this.neverRequestEmail = z;
        this.showClosedRequests = z2;
        this.showReferrerLogo = z3;
        this.referrerUrl = str;
        this.systemMessage = str2;
    }

    /* access modifiers changed from: package-private */
    public ConversationsSettings getConversations() {
        return this.conversations;
    }

    /* access modifiers changed from: package-private */
    public ContactUsSettings getContactUs() {
        return this.contactUs;
    }

    /* access modifiers changed from: package-private */
    public AttachmentSettings getAttachments() {
        return this.attachments;
    }

    /* access modifiers changed from: package-private */
    public boolean isNeverRequestEmailOn() {
        return this.neverRequestEmail;
    }

    /* access modifiers changed from: package-private */
    public boolean isShowClosedRequests() {
        return this.showClosedRequests;
    }

    /* access modifiers changed from: package-private */
    public boolean isShowReferrerLogo() {
        return this.showReferrerLogo;
    }

    /* access modifiers changed from: package-private */
    public String getReferrerUrl() {
        return this.referrerUrl;
    }

    /* access modifiers changed from: package-private */
    public String getSystemMessage() {
        return this.systemMessage;
    }
}
