package zendesk.support.requestlist;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.C3349da;
import o.C3616p;
import zendesk.core.MemoryCache;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.requestlist.RequestInfoDataSource;

public class RequestListModule {
    private final RequestListActivity activity;
    private final RequestListUiConfig config;

    RequestListModule(RequestListActivity requestListActivity, RequestListUiConfig requestListUiConfig) {
        this.activity = requestListActivity;
        this.config = requestListUiConfig;
    }

    /* access modifiers changed from: package-private */
    public RequestListView view(C3616p pVar) {
        return new RequestListView(this.activity, this.config, pVar);
    }

    static RequestListPresenter presenter(RequestListView requestListView, RequestListModel requestListModel) {
        return new RequestListPresenter(requestListView, requestListModel);
    }

    static RequestInfoDataSource.Repository repository(RequestInfoDataSource.LocalDataSource localDataSource, SupportUiStorage supportUiStorage, RequestProvider requestProvider, @C3349da(m2095 = "SUPPORT_MAIN_THREAD_EXECUTOR") Executor executor, ExecutorService executorService) {
        return new RequestInfoDataSource.Repository(localDataSource, new RequestInfoDataSource.RemoteDataSource(new RequestInfoDataSource.Network(requestProvider), new RequestInfoDataSource.Disk(executor, executorService, supportUiStorage, "remote_request_infos")), new RequestInfoDataSource.Repository.Merger());
    }

    static RequestListModel model(RequestInfoDataSource.Repository repository, MemoryCache memoryCache, SupportBlipsProvider supportBlipsProvider, SupportSettingsProvider supportSettingsProvider) {
        return new RequestListModel(repository, memoryCache, supportBlipsProvider, supportSettingsProvider);
    }

    static RequestListSyncHandler refreshHandler(RequestListPresenter requestListPresenter) {
        return new RequestListSyncHandler(requestListPresenter);
    }
}
