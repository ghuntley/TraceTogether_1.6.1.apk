package zendesk.support;

public class UploadResponse {
    private Attachment attachment;
    private String token;

    public String getToken() {
        return this.token;
    }

    public Attachment getAttachment() {
        return this.attachment;
    }
}
