package zendesk.support;

import java.util.List;
import o.O;

public class Attachment {
    private String contentType;
    private String contentUrl;
    private String fileName;
    private Long height;
    private Long id;
    private Long size;
    private List<Attachment> thumbnails;
    private Long width;

    public Long getId() {
        return this.id;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public String getContentType() {
        return this.contentType;
    }

    public Long getSize() {
        return this.size;
    }

    public Long getWidth() {
        return this.width;
    }

    public Long getHeight() {
        return this.height;
    }

    public List<Attachment> getThumbnails() {
        return O.m1393(this.thumbnails);
    }
}
