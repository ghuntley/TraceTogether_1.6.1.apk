package zendesk.support;

public class HelpCenterAttachment {
    private String contentUrl;
    private String fileName;
    private Long size;

    public String getFileName() {
        return this.fileName;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public Long getSize() {
        return this.size;
    }
}
