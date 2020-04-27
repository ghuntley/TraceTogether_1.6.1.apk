package zendesk.support;

import java.util.List;
import o.O;

class ArticleResponse {
    private Article article;
    private List<User> users;

    ArticleResponse() {
    }

    /* access modifiers changed from: package-private */
    public Article getArticle() {
        return this.article;
    }

    /* access modifiers changed from: package-private */
    public List<User> getUsers() {
        return O.m1393(this.users);
    }
}
