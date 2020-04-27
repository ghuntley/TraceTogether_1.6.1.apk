package zendesk.support;

import java.util.Date;
import java.util.List;
import o.C2709;

public class Comment {
    @C2709(m14406 = "uploads")
    private List<String> attachments;
    private String body;
    private Date createdAt;
    private Long id;
    @C2709(m14406 = "public")
    private boolean isPublic = true;

    public Long getId() {
        return this.id;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setAttachments(List<String> list) {
        this.attachments = list;
    }

    public Date getCreatedAt() {
        Date date = this.createdAt;
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }
}
