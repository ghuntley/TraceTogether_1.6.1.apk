package zendesk.support;

import java.util.ArrayList;
import java.util.List;
import o.C2709;

public class SectionItem implements HelpItem {
    private List<ArticleItem> articles;
    @C2709(m14406 = "category_id")
    private Long categoryId;
    @C2709(m14406 = "name")
    private String name;
    @C2709(m14406 = "id")
    private Long sectionId;
    @C2709(m14406 = "article_count")
    private int totalArticlesCount;

    public int getViewType() {
        return 2;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public Long getId() {
        return this.sectionId;
    }

    public List<HelpItem> getChildren() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.articles);
        if (this.articles.size() < this.totalArticlesCount) {
            arrayList.add(new SeeAllArticlesItem(this));
        }
        return arrayList;
    }

    public void addArticle(ArticleItem articleItem) {
        if (this.articles == null) {
            this.articles = new ArrayList();
        }
        this.articles.add(articleItem);
    }

    public int getTotalArticlesCount() {
        return this.totalArticlesCount;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SectionItem sectionItem = (SectionItem) obj;
            Long l = this.sectionId;
            if (l == null ? sectionItem.sectionId != null : !l.equals(sectionItem.sectionId)) {
                return false;
            }
            Long l2 = this.categoryId;
            Long l3 = sectionItem.categoryId;
            if (l2 != null) {
                return l2.equals(l3);
            }
            if (l3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Long l = this.sectionId;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.categoryId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }
}
