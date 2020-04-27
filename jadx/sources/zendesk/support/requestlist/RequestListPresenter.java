package zendesk.support.requestlist;

import android.view.View;
import java.util.List;
import o.C;
import o.C1830;
import o.G;
import o.J;
import zendesk.support.SupportSdkSettings;
import zendesk.support.request.RequestActivity;
import zendesk.support.requestlist.RequestListView;

class RequestListPresenter {
    private final CancelableCompositeCallback callbacks = new CancelableCompositeCallback();
    /* access modifiers changed from: private */
    public final RequestListModel model;
    /* access modifiers changed from: private */
    public final RequestListView view;

    interface SettingsCallback {
        void onSettings(SupportSdkSettings supportSdkSettings);
    }

    public RequestListPresenter(RequestListView requestListView, RequestListModel requestListModel) {
        this.view = requestListView;
        this.model = requestListModel;
    }

    /* access modifiers changed from: package-private */
    public void onCreate(final boolean z) {
        itemClicks(this.view);
        pullToRefresh(this.view);
        navigationClicks(this.view);
        errorClicks(this.view);
        createTicketClicks(this.view);
        loadSettings(new SettingsCallback() {
            public void onSettings(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings == null || !supportSdkSettings.isConversationsEnabled()) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                    return;
                }
                RequestListPresenter requestListPresenter = RequestListPresenter.this;
                requestListPresenter.logoClicks(requestListPresenter.view, supportSdkSettings.isShowReferrerLogoEnabled(), supportSdkSettings.getReferrerUrl());
                RequestListPresenter.this.loadItems(z, supportSdkSettings);
                if (z) {
                    RequestListPresenter.this.model.trackRequestListViewed();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void refresh() {
        loadSettings(new SettingsCallback() {
            public void onSettings(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings == null || !supportSdkSettings.isConversationsEnabled()) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                } else {
                    RequestListPresenter.this.loadItems(true, supportSdkSettings);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void onDestroy(boolean z) {
        if (!z) {
            this.model.cleanup();
        }
        this.callbacks.cancel();
    }

    /* access modifiers changed from: private */
    public void loadItems(boolean z, SupportSdkSettings supportSdkSettings) {
        AnonymousClass3 r0 = new G<List<RequestListItem>>() {
            public void onSuccess(List<RequestListItem> list) {
                RequestListPresenter.this.view.showRequestList(list);
                RequestListPresenter.this.view.setLoading(false);
            }

            public void onError(C c) {
                RequestListPresenter.this.view.setLoading(false);
                RequestListPresenter.this.view.showErrorMessage();
            }
        };
        this.callbacks.add(J.m1377(r0));
        this.view.setLoading(true);
        this.model.loadItems(z, supportSdkSettings, r0);
    }

    private void loadSettings(SettingsCallback settingsCallback) {
        SupportSdkSettings cachedSettings = this.model.getCachedSettings();
        if (cachedSettings == null) {
            networkSettings(settingsCallback);
        } else {
            settingsCallback.onSettings(cachedSettings);
        }
    }

    private void networkSettings(final SettingsCallback settingsCallback) {
        J r3 = J.m1377(new G<SupportSdkSettings>() {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                RequestListPresenter.this.model.cacheSupportSdkSettings(supportSdkSettings);
                settingsCallback.onSettings(supportSdkSettings);
            }

            public void onError(C c) {
                settingsCallback.onSettings((SupportSdkSettings) null);
                RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
            }
        });
        this.callbacks.add(r3);
        this.view.setLoading(true);
        this.model.loadSettings(r3);
    }

    private void navigationClicks(final RequestListView requestListView) {
        requestListView.setBackClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                requestListView.finish();
            }
        });
    }

    private void errorClicks(RequestListView requestListView) {
        requestListView.setRetryClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RequestListPresenter.this.refresh();
            }
        });
    }

    private void itemClicks(final RequestListView requestListView) {
        requestListView.setItemClickListener(new RequestListView.OnItemClick() {
            public void onClick(RequestListItem requestListItem) {
                requestListView.startRequestActivity(requestListItem.configure(RequestActivity.builder()));
            }
        });
    }

    private void pullToRefresh(RequestListView requestListView) {
        requestListView.setSwipeRefreshListener(new C1830.Cif() {
            public void onRefresh() {
                RequestListPresenter.this.refresh();
            }
        });
    }

    private void createTicketClicks(final RequestListView requestListView) {
        requestListView.setCreateRequestListener(new View.OnClickListener() {
            public void onClick(View view) {
                requestListView.startRequestActivity(RequestActivity.builder());
            }
        });
    }

    /* access modifiers changed from: private */
    public void logoClicks(final RequestListView requestListView, boolean z, final String str) {
        requestListView.setLogoClickListener(z, new View.OnClickListener() {
            public void onClick(View view) {
                requestListView.startReferrerPage(str);
            }
        });
    }
}
