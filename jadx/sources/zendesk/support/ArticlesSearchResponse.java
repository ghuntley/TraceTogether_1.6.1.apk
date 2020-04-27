package zendesk.support;

import java.util.List;
import o.O;

class ArticlesSearchResponse implements ArticlesResponse {
    private List<Category> categories;
    private List<Article> results;
    private List<Section> sections;
    private List<User> users;

    ArticlesSearchResponse() {
    }

    public List<Article> getArticles() {
        return O.m1393(this.results);
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
