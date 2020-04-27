package zendesk.support.requestlist;

import java.util.List;
import o.C;
import o.C3623w;
import o.G;
import o.O;
import zendesk.core.MemoryCache;
import zendesk.support.AggregatedCallback;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;

class RequestListModel {
    private final SupportBlipsProvider blipsProvider;
    /* access modifiers changed from: private */
    public final MemoryCache cache;
    /* access modifiers changed from: private */
    public final C3623w<RequestInfo, RequestListItem> mapper = new C3623w<RequestInfo, RequestListItem>() {
        public RequestListItem apply(RequestInfo requestInfo) {
            return new RequestListItem(requestInfo);
        }
    };
    private final RequestInfoDataSource requestInfoDataSource;
    private final AggregatedCallback<SupportSdkSettings> settingsAggregatedCallback = new AggregatedCallback<>();
    private final SupportSettingsProvider settingsProvider;

    RequestListModel(RequestInfoDataSource requestInfoDataSource2, MemoryCache memoryCache, SupportBlipsProvider supportBlipsProvider, SupportSettingsProvider supportSettingsProvider) {
        this.requestInfoDataSource = requestInfoDataSource2;
        this.cache = memoryCache;
        this.blipsProvider = supportBlipsProvider;
        this.settingsProvider = supportSettingsProvider;
    }

    /* access modifiers changed from: package-private */
    public SupportSdkSettings getCachedSettings() {
        return (SupportSdkSettings) this.cache.get("request_list_settings");
    }

    /* access modifiers changed from: package-private */
    public void cacheSupportSdkSettings(SupportSdkSettings supportSdkSettings) {
        this.cache.put("request_list_settings", supportSdkSettings);
    }

    /* access modifiers changed from: package-private */
    public void cleanup() {
        this.cache.remove("request_list_settings");
        this.cache.remove("request_list_items");
    }

    /* access modifiers changed from: package-private */
    public void trackRequestListViewed() {
        this.blipsProvider.requestListViewed();
    }

    /* access modifiers changed from: package-private */
    public void loadSettings(G<SupportSdkSettings> g) {
        if (this.settingsAggregatedCallback.add(g)) {
            this.settingsProvider.getSettings(this.settingsAggregatedCallback);
        }
    }

    /* access modifiers changed from: package-private */
    public List<RequestListItem> getCachedRequestInfos() {
        return (List) this.cache.get("request_list_items");
    }

    /* access modifiers changed from: package-private */
    public void loadItems(boolean z, final SupportSdkSettings supportSdkSettings, final G<List<RequestListItem>> g) {
        if (z || getCachedRequestInfos() == null) {
            this.requestInfoDataSource.load(new G<List<RequestInfo>>() {
                public void onSuccess(List<RequestInfo> list) {
                    List r3 = O.m1392(RequestListModel.this.filterClosedRequests(list, supportSdkSettings.isShowClosedRequests()), RequestListModel.this.mapper);
                    RequestListModel.this.cache.put("request_list_items", r3);
                    g.onSuccess(r3);
                }

                public void onError(C c) {
                    g.onError(c);
                }
            });
        } else {
            g.onSuccess(getCachedRequestInfos());
        }
    }

    /* access modifiers changed from: private */
    public List<RequestInfo> filterClosedRequests(List<RequestInfo> list, boolean z) {
        return z ? list : O.m1402(list, new C3623w<RequestInfo, Boolean>() {
            public Boolean apply(RequestInfo requestInfo) {
                return Boolean.valueOf(!requestInfo.isClosed());
            }
        });
    }
}
