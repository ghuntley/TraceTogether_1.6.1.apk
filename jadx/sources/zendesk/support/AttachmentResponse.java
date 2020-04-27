package zendesk.support;

import java.util.List;
import o.O;

class AttachmentResponse {
    private List<HelpCenterAttachment> articleAttachments;

    AttachmentResponse() {
    }

    /* access modifiers changed from: package-private */
    public List<HelpCenterAttachment> getArticleAttachments() {
        return O.m1393(this.articleAttachments);
    }
}
