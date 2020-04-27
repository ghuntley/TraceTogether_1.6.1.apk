package zendesk.support.guide;

import java.util.List;
import o.G;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSearch;
import zendesk.support.SearchArticle;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.guide.HelpCenterMvp;

class HelpCenterModel implements HelpCenterMvp.Model {
    private final HelpCenterProvider provider;
    private final SupportSettingsProvider settingsProvider;

    HelpCenterModel(HelpCenterProvider helpCenterProvider, SupportSettingsProvider supportSettingsProvider) {
        this.provider = helpCenterProvider;
        this.settingsProvider = supportSettingsProvider;
    }

    public void search(List<Long> list, List<Long> list2, String str, String[] strArr, G<List<SearchArticle>> g) {
        this.provider.searchArticles(new HelpCenterSearch.Builder().withQuery(str).withCategoryIds(list).withSectionIds(list2).withLabelNames(strArr).build(), g);
    }

    public void getSettings(G<SupportSdkSettings> g) {
        this.settingsProvider.getSettings(g);
    }
}
