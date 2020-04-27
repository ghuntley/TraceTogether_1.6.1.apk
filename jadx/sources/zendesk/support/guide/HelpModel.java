package zendesk.support.guide;

import java.util.ArrayList;
import java.util.List;
import o.C;
import o.D;
import o.G;
import o.P;
import zendesk.support.Article;
import zendesk.support.ArticleItem;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpItem;
import zendesk.support.HelpRequest;
import zendesk.support.SectionItem;
import zendesk.support.guide.HelpMvp;

class HelpModel implements HelpMvp.Model {
    private HelpCenterProvider provider;

    HelpModel(HelpCenterProvider helpCenterProvider) {
        this.provider = helpCenterProvider;
    }

    public void getArticles(List<Long> list, List<Long> list2, String[] strArr, G<List<HelpItem>> g) {
        this.provider.getHelp(new HelpRequest.Builder().withCategoryIds(list).withSectionIds(list2).withLabelNames(strArr).includeCategories().includeSections().build(), g);
    }

    public void getArticlesForSection(SectionItem sectionItem, String[] strArr, final G<List<ArticleItem>> g) {
        if (sectionItem == null || sectionItem.getId() == null) {
            g.onError(new D("SectionItem or its ID was null, cannot load more articles."));
        } else {
            this.provider.getArticles(sectionItem.getId(), P.m1407(strArr), new G<List<Article>>() {
                public void onSuccess(List<Article> list) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (Article access$000 : list) {
                        arrayList.add(HelpModel.this.convertArticle(access$000));
                    }
                    G g = g;
                    if (g != null) {
                        g.onSuccess(arrayList);
                    }
                }

                public void onError(C c) {
                    G g = g;
                    if (g != null) {
                        g.onError(c);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public ArticleItem convertArticle(Article article) {
        return new ArticleItem(article.getId(), article.getSectionId(), article.getTitle());
    }
}
