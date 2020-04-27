package zendesk.support;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.C3351dc;
import o.M;
import zendesk.support.requestlist.RequestInfoDataSource;

public final class SupportSdkModule_RequestInfoDataSourceFactory implements M<RequestInfoDataSource.LocalDataSource> {
    private final C3351dc<ExecutorService> backgroundThreadExecutorProvider;
    private final C3351dc<Executor> mainThreadExecutorProvider;
    private final SupportSdkModule module;
    private final C3351dc<SupportUiStorage> supportUiStorageProvider;

    public SupportSdkModule_RequestInfoDataSourceFactory(SupportSdkModule supportSdkModule, C3351dc<SupportUiStorage> dcVar, C3351dc<Executor> dcVar2, C3351dc<ExecutorService> dcVar3) {
        this.module = supportSdkModule;
        this.supportUiStorageProvider = dcVar;
        this.mainThreadExecutorProvider = dcVar2;
        this.backgroundThreadExecutorProvider = dcVar3;
    }

    public final RequestInfoDataSource.LocalDataSource get() {
        RequestInfoDataSource.LocalDataSource requestInfoDataSource = this.module.requestInfoDataSource(this.supportUiStorageProvider.get(), this.mainThreadExecutorProvider.get(), this.backgroundThreadExecutorProvider.get());
        if (requestInfoDataSource != null) {
            return requestInfoDataSource;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RequestInfoDataSource.LocalDataSource> create(SupportSdkModule supportSdkModule, C3351dc<SupportUiStorage> dcVar, C3351dc<Executor> dcVar2, C3351dc<ExecutorService> dcVar3) {
        return new SupportSdkModule_RequestInfoDataSourceFactory(supportSdkModule, dcVar, dcVar2, dcVar3);
    }
}
