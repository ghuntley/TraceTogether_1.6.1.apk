package zendesk.support;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateRequest {
    private Comment comment;
    private List<CustomField> customFields;
    private Map<String, Map<String, String>> metadata;
    private String subject;
    private List<String> tags;
    private Long ticketFormId;

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setDescription(String str) {
        if (this.comment == null) {
            this.comment = new Comment();
        }
        this.comment.setBody(str);
    }

    public void setAttachments(List<String> list) {
        if (this.comment == null) {
            this.comment = new Comment();
        }
        this.comment.setAttachments(list);
    }

    public void setSubject(String str) {
        this.subject = str;
    }

    public void setCustomFields(List<CustomField> list) {
        this.customFields = list;
    }

    public void setMetadata(Map<String, String> map) {
        this.metadata = new HashMap();
        this.metadata.put("sdk", map);
    }

    public void setTicketFormId(Long l) {
        this.ticketFormId = l;
    }
}
