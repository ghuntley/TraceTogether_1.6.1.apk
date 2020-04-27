package zendesk.support;

import java.util.List;
import o.O;

class HelpResponse {
    private List<CategoryItem> categories;

    HelpResponse() {
    }

    public List<CategoryItem> getCategories() {
        return O.m1393(this.categories);
    }
}
