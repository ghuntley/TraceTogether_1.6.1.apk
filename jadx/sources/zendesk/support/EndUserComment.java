package zendesk.support;

import java.util.List;
import o.C2709;

public class EndUserComment {
    @C2709(m14406 = "uploads")
    private List<String> attachments;
    private String value;

    public void setValue(String str) {
        this.value = str;
    }

    public void setAttachments(List<String> list) {
        this.attachments = list;
    }
}
