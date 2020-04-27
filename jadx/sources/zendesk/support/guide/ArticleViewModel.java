package zendesk.support.guide;

import java.io.Serializable;
import java.util.Date;
import zendesk.support.Article;

class ArticleViewModel implements Serializable {
    private final String authorName;
    private final String body;
    private final Date createdAt;
    private final long id;
    private final String title;

    ArticleViewModel(Article article) {
        this.id = article.getId().longValue();
        this.title = article.getTitle();
        this.body = article.getBody();
        this.createdAt = article.getCreatedAt();
        this.authorName = article.getAuthor() == null ? null : article.getAuthor().getName();
    }

    /* access modifiers changed from: package-private */
    public long getId() {
        return this.id;
    }

    /* access modifiers changed from: package-private */
    public String getTitle() {
        return this.title;
    }

    /* access modifiers changed from: package-private */
    public String getBody() {
        return this.body;
    }

    /* access modifiers changed from: package-private */
    public String getAuthorName() {
        return this.authorName;
    }

    /* access modifiers changed from: package-private */
    public Date getCreatedAt() {
        return this.createdAt;
    }
}
