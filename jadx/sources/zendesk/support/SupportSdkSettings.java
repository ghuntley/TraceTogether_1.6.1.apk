package zendesk.support;

import java.util.ArrayList;
import java.util.List;
import o.O;
import o.P;
import zendesk.core.AuthenticationType;

public class SupportSdkSettings {
    private final AuthenticationType authenticationType;
    private final HelpCenterSettings helpCenterSettings;
    private final SupportSettings mobileSettings;

    public SupportSdkSettings(SupportSettings supportSettings, HelpCenterSettings helpCenterSettings2, AuthenticationType authenticationType2) {
        this.mobileSettings = supportSettings;
        this.helpCenterSettings = helpCenterSettings2;
        this.authenticationType = authenticationType2;
    }

    public boolean isConversationsEnabled() {
        ConversationsSettings conversationsSettings = getConversationsSettings();
        return conversationsSettings != null && conversationsSettings.isEnabled();
    }

    public boolean isAttachmentsEnabled() {
        AttachmentSettings attachmentSettings = getAttachmentSettings();
        return attachmentSettings != null && attachmentSettings.isEnabled();
    }

    public long getMaxAttachmentSize() {
        AttachmentSettings attachmentSettings = getAttachmentSettings();
        if (attachmentSettings != null) {
            return attachmentSettings.getMaxAttachmentSize();
        }
        return 0;
    }

    public boolean hasHelpCenterSettings() {
        return this.helpCenterSettings != null;
    }

    public boolean isHelpCenterEnabled() {
        HelpCenterSettings helpCenterSettings2 = this.helpCenterSettings;
        return helpCenterSettings2 != null && helpCenterSettings2.isEnabled();
    }

    public boolean isHelpCenterArticleVotingEnabled() {
        return hasHelpCenterSettings() && this.helpCenterSettings.isArticleVotingEnabled();
    }

    public String getHelpCenterLocale() {
        HelpCenterSettings helpCenterSettings2 = this.helpCenterSettings;
        return helpCenterSettings2 != null && helpCenterSettings2.getLocale() != null ? this.helpCenterSettings.getLocale() : "";
    }

    private AttachmentSettings getAttachmentSettings() {
        SupportSettings supportSettings = this.mobileSettings;
        if ((supportSettings == null || supportSettings.getAttachments() == null) ? false : true) {
            return this.mobileSettings.getAttachments();
        }
        return null;
    }

    private ConversationsSettings getConversationsSettings() {
        SupportSettings supportSettings = this.mobileSettings;
        if ((supportSettings == null || supportSettings.getConversations() == null) ? false : true) {
            return this.mobileSettings.getConversations();
        }
        return null;
    }

    public List<String> getContactZendeskTags() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings != null && supportSettings.getContactUs() != null && O.m1394(this.mobileSettings.getContactUs().getTags()) ? this.mobileSettings.getContactUs().getTags() : new ArrayList();
    }

    public AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    public boolean isNeverAskForEmailEnabled() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings == null || supportSettings.isNeverRequestEmailOn();
    }

    public boolean isShowClosedRequests() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings == null || supportSettings.isShowClosedRequests();
    }

    public boolean isShowReferrerLogoEnabled() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings != null && supportSettings.isShowReferrerLogo();
    }

    public String getReferrerUrl() {
        SupportSettings supportSettings = this.mobileSettings;
        return (supportSettings == null || !P.m1406(supportSettings.getReferrerUrl())) ? "https://www.zendesk.com/embeddables" : this.mobileSettings.getReferrerUrl();
    }

    public String getRequestSystemMessage() {
        SupportSettings supportSettings = this.mobileSettings;
        return (supportSettings == null || !P.m1406(supportSettings.getSystemMessage())) ? "" : this.mobileSettings.getSystemMessage();
    }
}
