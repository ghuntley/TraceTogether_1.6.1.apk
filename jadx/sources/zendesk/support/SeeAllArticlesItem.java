package zendesk.support;

public class SeeAllArticlesItem implements HelpItem {
    private boolean isLoading;
    private SectionItem section;

    public String getName() {
        return "";
    }

    public int getViewType() {
        return 4;
    }

    public SeeAllArticlesItem(SectionItem sectionItem) {
        this.section = sectionItem;
    }

    public Long getId() {
        return this.section.getId();
    }

    public SectionItem getSection() {
        return this.section;
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public void setLoading(boolean z) {
        this.isLoading = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SectionItem sectionItem = this.section;
            SectionItem sectionItem2 = ((SeeAllArticlesItem) obj).section;
            if (sectionItem != null) {
                return sectionItem.equals(sectionItem2);
            }
            if (sectionItem2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        SectionItem sectionItem = this.section;
        if (sectionItem != null) {
            return sectionItem.hashCode();
        }
        return 0;
    }
}
