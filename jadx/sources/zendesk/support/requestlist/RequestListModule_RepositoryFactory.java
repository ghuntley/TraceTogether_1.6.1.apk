package zendesk.support.requestlist;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.C3351dc;
import o.M;
import zendesk.support.RequestProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.requestlist.RequestInfoDataSource;

public final class RequestListModule_RepositoryFactory implements M<RequestInfoDataSource.Repository> {
    private final C3351dc<ExecutorService> backgroundThreadExecutorProvider;
    private final C3351dc<RequestInfoDataSource.LocalDataSource> localDataSourceProvider;
    private final C3351dc<Executor> mainThreadExecutorProvider;
    private final C3351dc<RequestProvider> requestProvider;
    private final C3351dc<SupportUiStorage> supportUiStorageProvider;

    public RequestListModule_RepositoryFactory(C3351dc<RequestInfoDataSource.LocalDataSource> dcVar, C3351dc<SupportUiStorage> dcVar2, C3351dc<RequestProvider> dcVar3, C3351dc<Executor> dcVar4, C3351dc<ExecutorService> dcVar5) {
        this.localDataSourceProvider = dcVar;
        this.supportUiStorageProvider = dcVar2;
        this.requestProvider = dcVar3;
        this.mainThreadExecutorProvider = dcVar4;
        this.backgroundThreadExecutorProvider = dcVar5;
    }

    public final RequestInfoDataSource.Repository get() {
        RequestInfoDataSource.Repository repository = RequestListModule.repository(this.localDataSourceProvider.get(), this.supportUiStorageProvider.get(), this.requestProvider.get(), this.mainThreadExecutorProvider.get(), this.backgroundThreadExecutorProvider.get());
        if (repository != null) {
            return repository;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RequestInfoDataSource.Repository> create(C3351dc<RequestInfoDataSource.LocalDataSource> dcVar, C3351dc<SupportUiStorage> dcVar2, C3351dc<RequestProvider> dcVar3, C3351dc<Executor> dcVar4, C3351dc<ExecutorService> dcVar5) {
        return new RequestListModule_RepositoryFactory(dcVar, dcVar2, dcVar3, dcVar4, dcVar5);
    }
}
