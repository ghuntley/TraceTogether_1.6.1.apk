package zendesk.support.guide;

import android.annotation.SuppressLint;
import java.util.List;
import o.mW;
import o.mZ;

public class HelpCenterUiConfig implements mW {
    private final List<Long> categoryIds;
    private final boolean collapseCategories;
    private final boolean contactUsButtonVisibility;
    private final String[] labelNames;
    private final List<Long> sectionIds;
    private final boolean showConversationsMenuButton;
    private List<mW> uiConfigs;

    public List<Long> getCategoryIds() {
        return this.categoryIds;
    }

    public List<Long> getSectionIds() {
        return this.sectionIds;
    }

    public String[] getLabelNames() {
        return this.labelNames;
    }

    public boolean isContactUsButtonVisible() {
        return this.contactUsButtonVisibility;
    }

    public boolean isCollapseCategories() {
        return this.collapseCategories;
    }

    public boolean isShowConversationsMenuButton() {
        return this.showConversationsMenuButton;
    }

    @SuppressLint({"RestrictedApi"})
    public List<mW> getUiConfigs() {
        return mZ.m3800(this.uiConfigs, this);
    }
}
