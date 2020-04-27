package zendesk.support;

import java.util.List;
import o.O;

class ArticlesListResponse implements ArticlesResponse {
    private List<Article> articles;
    private List<Category> categories;
    private List<Section> sections;
    private List<User> users;

    ArticlesListResponse() {
    }

    public List<Article> getArticles() {
        return O.m1393(this.articles);
    }

    public List<Category> getCategories() {
        return O.m1393(this.categories);
    }

    public List<Section> getSections() {
        return O.m1393(this.sections);
    }

    public List<User> getUsers() {
        return O.m1393(this.users);
    }
}
