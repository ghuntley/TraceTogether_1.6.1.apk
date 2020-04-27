package zendesk.support;

import java.util.List;
import o.C2709;
import o.O;

public class CategoryItem implements HelpItem {
    private boolean expanded = true;
    @C2709(m14406 = "id")
    private Long id;
    @C2709(m14406 = "name")
    private String name;
    private List<SectionItem> sections;

    public int getViewType() {
        return 1;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public Long getId() {
        return this.id;
    }

    public List<SectionItem> getSections() {
        return O.m1393(this.sections);
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean setExpanded(boolean z) {
        this.expanded = z;
        return this.expanded;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Long l = this.id;
            Long l2 = ((CategoryItem) obj).id;
            if (l != null) {
                return l.equals(l2);
            }
            if (l2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Long l = this.id;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }
}
