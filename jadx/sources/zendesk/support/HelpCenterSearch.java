package zendesk.support;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import o.O;
import o.P;

public class HelpCenterSearch implements Serializable, Cloneable {
    /* access modifiers changed from: private */
    public String categoryIds;
    /* access modifiers changed from: private */
    public String include;
    /* access modifiers changed from: private */
    public String labelNames;
    /* access modifiers changed from: private */
    public Locale locale;
    /* access modifiers changed from: private */
    public Integer page;
    /* access modifiers changed from: private */
    public Integer perPage;
    /* access modifiers changed from: private */
    public String query;
    /* access modifiers changed from: private */
    public String sectionIds;

    private HelpCenterSearch() {
    }

    public String getQuery() {
        return this.query;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getInclude() {
        return this.include;
    }

    public String getLabelNames() {
        return this.labelNames;
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public String getSectionIds() {
        return this.sectionIds;
    }

    public Integer getPage() {
        return this.page;
    }

    public Integer getPerPage() {
        return this.perPage;
    }

    public static class Builder {
        private String categoryIds;
        private String[] include;
        private String[] labelNames;
        private Locale locale;
        private Integer page;
        private Integer perPage;
        private String query;
        private String sectionIds;

        public Builder withQuery(String str) {
            this.query = str;
            return this;
        }

        public Builder withLabelNames(String... strArr) {
            this.labelNames = strArr;
            return this;
        }

        public Builder withCategoryIds(List<Long> list) {
            this.categoryIds = P.m1405((List<? extends Number>) O.m1393(list));
            return this;
        }

        public Builder withSectionIds(List<Long> list) {
            this.sectionIds = P.m1405((List<? extends Number>) O.m1393(list));
            return this;
        }

        public HelpCenterSearch build() {
            HelpCenterSearch helpCenterSearch = new HelpCenterSearch();
            String unused = helpCenterSearch.query = this.query;
            Locale unused2 = helpCenterSearch.locale = this.locale;
            String unused3 = helpCenterSearch.include = P.m1407(this.include);
            String unused4 = helpCenterSearch.labelNames = P.m1407(this.labelNames);
            String unused5 = helpCenterSearch.categoryIds = this.categoryIds;
            String unused6 = helpCenterSearch.sectionIds = this.sectionIds;
            Integer unused7 = helpCenterSearch.page = this.page;
            Integer unused8 = helpCenterSearch.perPage = this.perPage;
            return helpCenterSearch;
        }
    }
}
