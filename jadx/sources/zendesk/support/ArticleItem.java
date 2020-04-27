package zendesk.support;

import o.C2709;

public class ArticleItem implements HelpItem {
    private Long id;
    private String name;
    @C2709(m14406 = "section_id")
    private Long sectionId;

    public int getViewType() {
        return 3;
    }

    public ArticleItem(Long l, Long l2, String str) {
        this.id = l;
        this.sectionId = l2;
        this.name = str;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public Long getId() {
        return this.id;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ArticleItem articleItem = (ArticleItem) obj;
            Long l = this.id;
            if (l == null ? articleItem.id != null : !l.equals(articleItem.id)) {
                return false;
            }
            Long l2 = this.sectionId;
            Long l3 = articleItem.sectionId;
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
        Long l = this.id;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.sectionId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }
}
