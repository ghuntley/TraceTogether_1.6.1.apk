package zendesk.support.guide;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.C;
import o.F;
import o.G;
import zendesk.core.AuthenticationType;
import zendesk.core.NetworkAware;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.support.HelpCenterSettings;
import zendesk.support.SearchArticle;
import zendesk.support.SupportSdkSettings;
import zendesk.support.guide.HelpCenterMvp;

class HelpCenterPresenter implements HelpCenterMvp.Presenter, NetworkAware {
    private static final Integer NETWORK_AWARE_ID = 31;
    private static final Integer RETRY_ACTION_ID = 8642;
    /* access modifiers changed from: private */
    public HelpCenterUiConfig config;
    /* access modifiers changed from: private */
    public Set<RetryAction> internalRetryActions = new HashSet();
    /* access modifiers changed from: private */
    public SupportSdkSettings mobileSettings;
    private HelpCenterMvp.Model model;
    private NetworkInfoProvider networkInfoProvider;
    private boolean networkPreviouslyUnavailable;
    /* access modifiers changed from: private */
    public HelpCenterMvp.View view;

    HelpCenterPresenter(HelpCenterMvp.View view2, HelpCenterMvp.Model model2, NetworkInfoProvider networkInfoProvider2) {
        this.view = view2;
        this.model = model2;
        this.networkInfoProvider = networkInfoProvider2;
        this.mobileSettings = new SupportSdkSettings((SupportSettings) null, (HelpCenterSettings) null, (AuthenticationType) null);
    }

    public void onResume(HelpCenterMvp.View view2) {
        this.view = view2;
        this.networkInfoProvider.addNetworkAwareListener(NETWORK_AWARE_ID, this);
        this.networkInfoProvider.register();
        if (!this.networkInfoProvider.isNetworkAvailable()) {
            view2.showNoConnectionError();
            view2.hideLoadingState();
            this.networkPreviouslyUnavailable = true;
        }
        invokeRetryActions();
    }

    private void invokeRetryActions() {
        for (RetryAction onRetry : this.internalRetryActions) {
            onRetry.onRetry();
        }
        this.internalRetryActions.clear();
    }

    public void onPause() {
        this.view = null;
        this.networkInfoProvider.removeNetworkAwareListener(NETWORK_AWARE_ID);
        this.networkInfoProvider.removeRetryAction(RETRY_ACTION_ID);
        this.networkInfoProvider.unregister();
    }

    public void onSearchSubmit(final String str) {
        if (this.networkInfoProvider.isNetworkAvailable()) {
            this.view.dismissError();
            this.view.showLoadingState();
            this.view.clearSearchResults();
            this.model.search(this.config.getCategoryIds(), this.config.getSectionIds(), str, this.config.getLabelNames(), new ViewSafeRetryZendeskCallback(str));
            return;
        }
        this.networkInfoProvider.addRetryAction(RETRY_ACTION_ID, new RetryAction() {
            public void onRetry() {
                HelpCenterPresenter.this.onSearchSubmit(str);
            }
        });
    }

    class ViewSafeRetryZendeskCallback extends G<List<SearchArticle>> {
        /* access modifiers changed from: private */
        public String query;

        ViewSafeRetryZendeskCallback(String str) {
            this.query = str;
        }

        public void onSuccess(final List<SearchArticle> list) {
            if (HelpCenterPresenter.this.view != null) {
                HelpCenterPresenter.this.view.hideLoadingState();
                HelpCenterPresenter.this.view.showSearchResults(list, this.query);
                if (HelpCenterPresenter.this.config.isContactUsButtonVisible()) {
                    HelpCenterPresenter.this.view.showContactUsButton();
                    return;
                }
                return;
            }
            HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                public void onRetry() {
                    ViewSafeRetryZendeskCallback.this.onSuccess((List<SearchArticle>) list);
                }
            });
        }

        public void onError(final C c) {
            if (HelpCenterPresenter.this.view != null) {
                HelpCenterPresenter.this.view.hideLoadingState();
                HelpCenterPresenter.this.view.showLoadArticleErrorWithRetry(HelpCenterMvp.ErrorType.ARTICLES_LOAD, new RetryAction() {
                    public void onRetry() {
                        HelpCenterPresenter.this.onSearchSubmit(ViewSafeRetryZendeskCallback.this.query);
                    }
                });
                return;
            }
            HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                public void onRetry() {
                    ViewSafeRetryZendeskCallback.this.onError(c);
                }
            });
        }
    }

    public void onLoad() {
        if (this.config.isContactUsButtonVisible()) {
            HelpCenterMvp.View view2 = this.view;
            if (view2 != null) {
                view2.showContactUsButton();
            } else {
                this.internalRetryActions.add(new RetryAction() {
                    public void onRetry() {
                        HelpCenterPresenter.this.view.showContactUsButton();
                    }
                });
            }
        }
        HelpCenterMvp.View view3 = this.view;
        if (view3 != null) {
            view3.announceContentLoaded();
        }
    }

    public void onErrorWithRetry(final HelpCenterMvp.ErrorType errorType, final RetryAction retryAction) {
        HelpCenterMvp.View view2 = this.view;
        if (view2 == null) {
            this.internalRetryActions.add(new RetryAction() {
                public void onRetry() {
                    if (HelpCenterPresenter.this.view != null && HelpCenterPresenter.this.view.isShowingHelp()) {
                        HelpCenterPresenter.this.view.hideLoadingState();
                        HelpCenterPresenter.this.view.showLoadArticleErrorWithRetry(errorType, retryAction);
                    }
                }
            });
        } else if (view2.isShowingHelp()) {
            this.view.hideLoadingState();
            this.view.showLoadArticleErrorWithRetry(errorType, retryAction);
        }
    }

    public void onNetworkAvailable() {
        F.m1359();
        if (!this.networkPreviouslyUnavailable) {
            F.m1359();
            return;
        }
        this.networkPreviouslyUnavailable = false;
        HelpCenterMvp.View view2 = this.view;
        if (view2 != null) {
            view2.setSearchEnabled(true);
            this.view.dismissError();
            return;
        }
        this.internalRetryActions.add(new RetryAction() {
            public void onRetry() {
                HelpCenterPresenter.this.view.dismissError();
            }
        });
    }

    public void onNetworkUnavailable() {
        F.m1359();
        this.networkPreviouslyUnavailable = true;
        HelpCenterMvp.View view2 = this.view;
        if (view2 != null) {
            view2.setSearchEnabled(false);
            this.view.showNoConnectionError();
            this.view.hideLoadingState();
        }
    }

    public void init(final HelpCenterUiConfig helpCenterUiConfig) {
        this.config = helpCenterUiConfig;
        this.view.showLoadingState();
        this.model.getSettings(new G<SupportSdkSettings>() {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (HelpCenterPresenter.this.view != null) {
                    HelpCenterPresenter.this.view.hideLoadingState();
                } else {
                    HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                        public void onRetry() {
                            HelpCenterPresenter.this.view.hideLoadingState();
                        }
                    });
                }
                SupportSdkSettings unused = HelpCenterPresenter.this.mobileSettings = supportSdkSettings;
                if (supportSdkSettings.isHelpCenterEnabled()) {
                    F.m1359();
                    if (HelpCenterPresenter.this.view != null) {
                        HelpCenterPresenter.this.view.showHelp(HelpCenterPresenter.this.config);
                    } else {
                        HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                            public void onRetry() {
                                HelpCenterPresenter.this.view.showHelp(HelpCenterPresenter.this.config);
                            }
                        });
                    }
                    if (helpCenterUiConfig.isContactUsButtonVisible()) {
                        F.m1359();
                        if (HelpCenterPresenter.this.view != null) {
                            HelpCenterPresenter.this.view.showContactUsButton();
                        } else {
                            HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                                public void onRetry() {
                                    HelpCenterPresenter.this.view.showContactUsButton();
                                }
                            });
                        }
                    }
                } else {
                    F.m1359();
                    if (supportSdkSettings.isConversationsEnabled()) {
                        F.m1359();
                        if (HelpCenterPresenter.this.view != null) {
                            HelpCenterPresenter.this.view.showRequestList();
                            HelpCenterPresenter.this.view.exitActivity();
                            return;
                        }
                        HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                            public void onRetry() {
                                HelpCenterPresenter.this.view.showRequestList();
                                HelpCenterPresenter.this.view.exitActivity();
                            }
                        });
                        return;
                    }
                    F.m1359();
                    if (HelpCenterPresenter.this.view != null) {
                        HelpCenterPresenter.this.view.showContactZendesk();
                        HelpCenterPresenter.this.view.exitActivity();
                        return;
                    }
                    HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                        public void onRetry() {
                            HelpCenterPresenter.this.view.showContactZendesk();
                            HelpCenterPresenter.this.view.exitActivity();
                        }
                    });
                }
            }

            public void onError(C c) {
                F.m1358();
                F.m1357(c);
                if (HelpCenterPresenter.this.view != null) {
                    HelpCenterPresenter.this.view.hideLoadingState();
                    HelpCenterPresenter.this.view.exitActivity();
                    return;
                }
                HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() {
                    public void onRetry() {
                        HelpCenterPresenter.this.view.hideLoadingState();
                        HelpCenterPresenter.this.view.exitActivity();
                    }
                });
            }
        });
    }

    public boolean shouldShowConversationsMenuItem() {
        return this.mobileSettings.isConversationsEnabled() && this.config.isShowConversationsMenuButton();
    }

    public boolean shouldShowSearchMenuItem() {
        return this.mobileSettings.hasHelpCenterSettings();
    }
}
