package zendesk.support;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private User author;
    private Long authorId;
    private String body;
    private Date createdAt;
    private String htmlUrl;
    private Long id;
    private String locale;
    private Long sectionId;
    private String title;

    public Long getId() {
        return this.id;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public Long getAuthorId() {
        return this.authorId;
    }

    public Long getSectionId() {
        return this.sectionId;
    }

    public Date getCreatedAt() {
        Date date = this.createdAt;
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    public String getTitle() {
        return this.title;
    }

    public String getBody() {
        return this.body;
    }

    public String getLocale() {
        return this.locale;
    }

    public User getAuthor() {
        return this.author;
    }

    public void setAuthor(User user) {
        this.author = user;
    }
}
