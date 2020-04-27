package zendesk.support.guide;

import java.util.ArrayList;
import java.util.List;
import o.C;
import o.F;
import o.G;
import o.O;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.support.ArticleItem;
import zendesk.support.CategoryItem;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;
import zendesk.support.SeeAllArticlesItem;
import zendesk.support.guide.HelpCenterMvp;
import zendesk.support.guide.HelpMvp;

class HelpAdapterPresenter implements HelpMvp.Presenter {
    private static final Integer RETRY_ACTION_ID = 5;
    private G<List<HelpItem>> callback = new G<List<HelpItem>>() {
        public void onSuccess(List<HelpItem> list) {
            boolean unused = HelpAdapterPresenter.this.hasError = false;
            List unused2 = HelpAdapterPresenter.this.helpItems = O.m1393(list);
            if (HelpAdapterPresenter.this.helpCenterUiConfig.isCollapseCategories()) {
                HelpAdapterPresenter helpAdapterPresenter = HelpAdapterPresenter.this;
                List unused3 = helpAdapterPresenter.filteredItems = helpAdapterPresenter.getCollapsedCategories(helpAdapterPresenter.helpItems);
            } else {
                HelpAdapterPresenter helpAdapterPresenter2 = HelpAdapterPresenter.this;
                List unused4 = helpAdapterPresenter2.filteredItems = O.m1393(helpAdapterPresenter2.helpItems);
            }
            HelpAdapterPresenter helpAdapterPresenter3 = HelpAdapterPresenter.this;
            boolean unused5 = helpAdapterPresenter3.noResults = O.m1399(helpAdapterPresenter3.filteredItems);
            HelpAdapterPresenter.this.view.showItems(HelpAdapterPresenter.this.filteredItems);
            HelpAdapterPresenter.this.contentPresenter.onLoad();
        }

        public void onError(C c) {
            HelpCenterMvp.ErrorType errorType;
            if (O.m1394(HelpAdapterPresenter.this.helpCenterUiConfig.getCategoryIds())) {
                errorType = HelpCenterMvp.ErrorType.CATEGORY_LOAD;
            } else if (O.m1394(HelpAdapterPresenter.this.helpCenterUiConfig.getSectionIds())) {
                errorType = HelpCenterMvp.ErrorType.SECTION_LOAD;
            } else {
                errorType = HelpCenterMvp.ErrorType.ARTICLES_LOAD;
            }
            HelpAdapterPresenter.this.contentPresenter.onErrorWithRetry(errorType, new RetryAction() {
                public void onRetry() {
                    boolean unused = HelpAdapterPresenter.this.hasError = false;
                    HelpAdapterPresenter.this.view.showItems(HelpAdapterPresenter.this.filteredItems);
                    HelpAdapterPresenter.this.requestHelpContent();
                }
            });
            boolean unused = HelpAdapterPresenter.this.hasError = true;
            HelpAdapterPresenter.this.view.showItems(HelpAdapterPresenter.this.filteredItems);
        }
    };
    /* access modifiers changed from: private */
    public HelpCenterMvp.Presenter contentPresenter;
    /* access modifiers changed from: private */
    public List<HelpItem> filteredItems = new ArrayList();
    /* access modifiers changed from: private */
    public boolean hasError;
    /* access modifiers changed from: private */
    public HelpCenterUiConfig helpCenterUiConfig;
    /* access modifiers changed from: private */
    public List<HelpItem> helpItems = new ArrayList();
    private HelpMvp.Model model;
    private NetworkInfoProvider networkInfoProvider;
    /* access modifiers changed from: private */
    public boolean noResults;
    private RetryAction retryAction;
    /* access modifiers changed from: private */
    public HelpMvp.View view;

    public HelpAdapterPresenter(HelpMvp.View view2, HelpMvp.Model model2, NetworkInfoProvider networkInfoProvider2, HelpCenterUiConfig helpCenterUiConfig2) {
        this.view = view2;
        this.model = model2;
        this.networkInfoProvider = networkInfoProvider2;
        this.helpCenterUiConfig = helpCenterUiConfig2;
    }

    public void setContentPresenter(HelpCenterMvp.Presenter presenter) {
        this.contentPresenter = presenter;
    }

    public void onAttached() {
        this.networkInfoProvider.register();
        if (O.m1399(this.helpItems)) {
            requestHelpContent();
        }
    }

    public void onDetached() {
        this.networkInfoProvider.removeRetryAction(RETRY_ACTION_ID);
        this.networkInfoProvider.unregister();
    }

    public boolean onCategoryClick(CategoryItem categoryItem, int i) {
        if (categoryItem == null) {
            return false;
        }
        boolean expanded = categoryItem.setExpanded(!categoryItem.isExpanded());
        if (expanded) {
            expandItem(categoryItem, this.filteredItems.indexOf(categoryItem));
        } else {
            collapseItem(this.filteredItems.indexOf(categoryItem));
        }
        return expanded;
    }

    public void onSeeAllClick(SeeAllArticlesItem seeAllArticlesItem) {
        loadMoreArticles(seeAllArticlesItem);
    }

    public int getItemCount() {
        if (this.hasError) {
            return 0;
        }
        return Math.max(this.filteredItems.size() + getPaddingItemCount(), 1);
    }

    private int getPaddingItemCount() {
        return this.helpCenterUiConfig.isContactUsButtonVisible() ? 1 : 0;
    }

    public int getItemViewType(int i) {
        if (this.noResults) {
            return 7;
        }
        if (this.filteredItems.size() <= 0) {
            return 5;
        }
        if (i == this.filteredItems.size()) {
            return 8;
        }
        return this.filteredItems.get(i).getViewType();
    }

    public HelpItem getItemForBinding(int i) {
        if (this.filteredItems.size() <= 0 || i >= this.filteredItems.size()) {
            return null;
        }
        return this.filteredItems.get(i);
    }

    /* access modifiers changed from: private */
    public void requestHelpContent() {
        if (!this.networkInfoProvider.isNetworkAvailable()) {
            this.retryAction = new RetryAction() {
                public void onRetry() {
                    HelpAdapterPresenter.this.requestHelpContent();
                }
            };
            this.networkInfoProvider.addRetryAction(RETRY_ACTION_ID, this.retryAction);
        }
        this.model.getArticles(this.helpCenterUiConfig.getCategoryIds(), this.helpCenterUiConfig.getSectionIds(), this.helpCenterUiConfig.getLabelNames(), this.callback);
    }

    /* access modifiers changed from: private */
    public List<HelpItem> getCollapsedCategories(List<HelpItem> list) {
        ArrayList arrayList = new ArrayList();
        if (!(list == null || list.size() == 0)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (1 == list.get(i).getViewType()) {
                    arrayList.add(list.get(i));
                    ((CategoryItem) list.get(i)).setExpanded(false);
                }
            }
        }
        return arrayList;
    }

    private void expandItem(CategoryItem categoryItem, int i) {
        int i2 = i + 1;
        for (HelpItem next : categoryItem.getSections()) {
            addItem(i2, next);
            i2++;
            try {
                for (HelpItem addItem : ((SectionItem) next).getChildren()) {
                    addItem(i2, addItem);
                    i2++;
                }
            } catch (ClassCastException unused) {
                F.m1355();
            }
        }
    }

    private void collapseItem(int i) {
        if (i < getItemCount() - 1) {
            int i2 = i + 1;
            while (i2 < this.filteredItems.size() && 1 != this.filteredItems.get(i2).getViewType()) {
                removeItem(i2);
            }
        }
    }

    private void addItem(int i, HelpItem helpItem) {
        this.filteredItems.add(i, helpItem);
        this.view.addItem(i, helpItem);
    }

    private void removeItem(int i) {
        this.filteredItems.remove(i);
        this.view.removeItem(i);
    }

    /* access modifiers changed from: private */
    public void loadMoreArticles(final SeeAllArticlesItem seeAllArticlesItem) {
        final SectionItem section = seeAllArticlesItem.getSection();
        final AnonymousClass3 r1 = new RetryAction() {
            public void onRetry() {
                HelpAdapterPresenter.this.loadMoreArticles(seeAllArticlesItem);
            }
        };
        if (this.networkInfoProvider.isNetworkAvailable()) {
            this.model.getArticlesForSection(section, this.helpCenterUiConfig.getLabelNames(), new G<List<ArticleItem>>() {
                public void onSuccess(List<ArticleItem> list) {
                    int indexOf = HelpAdapterPresenter.this.helpItems.indexOf(seeAllArticlesItem);
                    int indexOf2 = HelpAdapterPresenter.this.filteredItems.indexOf(seeAllArticlesItem);
                    for (ArticleItem next : list) {
                        if (!HelpAdapterPresenter.this.helpItems.contains(next)) {
                            int i = indexOf + 1;
                            HelpAdapterPresenter.this.helpItems.add(indexOf, next);
                            section.addArticle(next);
                            if (indexOf2 != -1) {
                                HelpAdapterPresenter.this.filteredItems.add(indexOf2, next);
                                HelpAdapterPresenter.this.view.addItem(indexOf2, next);
                                indexOf2++;
                            }
                            indexOf = i;
                        }
                    }
                    HelpAdapterPresenter.this.helpItems.remove(seeAllArticlesItem);
                    int indexOf3 = HelpAdapterPresenter.this.filteredItems.indexOf(seeAllArticlesItem);
                    HelpAdapterPresenter.this.filteredItems.remove(seeAllArticlesItem);
                    HelpAdapterPresenter.this.view.removeItem(indexOf3);
                }

                public void onError(C c) {
                    HelpAdapterPresenter.this.helpItems.remove(seeAllArticlesItem);
                    new Object[1][0] = c;
                    F.m1358();
                    HelpAdapterPresenter.this.contentPresenter.onErrorWithRetry(HelpCenterMvp.ErrorType.ARTICLES_LOAD, r1);
                }
            });
            return;
        }
        this.retryAction = r1;
        this.networkInfoProvider.addRetryAction(RETRY_ACTION_ID, this.retryAction);
    }
}
