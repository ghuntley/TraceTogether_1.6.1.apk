package zendesk.support;

import java.util.List;
import o.P;

public class HelpRequest {
    private int articlesPerPageLimit;
    private String categoryIds;
    private String includes;
    private String[] labelNames;
    private String sectionIds;

    private HelpRequest(Builder builder) {
        this.categoryIds = builder.categoryIds;
        this.sectionIds = builder.sectionIds;
        this.includes = builder.includes;
        this.articlesPerPageLimit = builder.articlesPerSectionLimit;
        this.labelNames = builder.labelNames;
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public String getSectionIds() {
        return this.sectionIds;
    }

    public String getIncludes() {
        return this.includes;
    }

    public int getArticlesPerPageLimit() {
        return this.articlesPerPageLimit;
    }

    public String[] getLabelNames() {
        return this.labelNames;
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public int articlesPerSectionLimit = 5;
        /* access modifiers changed from: private */
        public String categoryIds;
        /* access modifiers changed from: private */
        public String includes;
        /* access modifiers changed from: private */
        public String[] labelNames;
        /* access modifiers changed from: private */
        public String sectionIds;

        public Builder withCategoryIds(List<Long> list) {
            this.categoryIds = P.m1405((List<? extends Number>) list);
            return this;
        }

        public Builder withSectionIds(List<Long> list) {
            this.sectionIds = P.m1405((List<? extends Number>) list);
            return this;
        }

        public Builder includeCategories() {
            if (P.m1409(this.includes)) {
                this.includes = "categories";
            } else if (this.includes.equals("sections")) {
                this.includes = "categories,sections";
            }
            return this;
        }

        public Builder includeSections() {
            if (P.m1409(this.includes)) {
                this.includes = "sections";
            } else if (this.includes.equals("categories")) {
                this.includes = "categories,sections";
            }
            return this;
        }

        public Builder withLabelNames(String... strArr) {
            this.labelNames = strArr;
            return this;
        }

        public HelpRequest build() {
            return new HelpRequest(this);
        }
    }
}
