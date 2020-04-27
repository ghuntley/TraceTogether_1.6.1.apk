package zendesk.support;

import java.util.Date;
import java.util.List;
import o.C2709;
import o.O;

public class CommentResponse {
    private List<Attachment> attachments;
    private Long authorId;
    private String body;
    private Date createdAt;
    private String htmlBody;
    private Long id;
    @C2709(m14406 = "public")
    private boolean isPublic = true;

    public Long getId() {
        return this.id;
    }

    public String getBody() {
        return this.body;
    }

    public String getHtmlBody() {
        return this.htmlBody;
    }

    public Long getAuthorId() {
        return this.authorId;
    }

    public List<Attachment> getAttachments() {
        return O.m1393(this.attachments);
    }

    public Date getCreatedAt() {
        Date date = this.createdAt;
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }
}
