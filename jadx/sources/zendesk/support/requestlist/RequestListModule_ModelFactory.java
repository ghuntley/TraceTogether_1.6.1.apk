package zendesk.support.requestlist;

import o.C3351dc;
import o.M;
import zendesk.core.MemoryCache;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.requestlist.RequestInfoDataSource;

public final class RequestListModule_ModelFactory implements M<RequestListModel> {
    private final C3351dc<SupportBlipsProvider> blipsProvider;
    private final C3351dc<MemoryCache> memoryCacheProvider;
    private final C3351dc<RequestInfoDataSource.Repository> requestInfoDataSourceProvider;
    private final C3351dc<SupportSettingsProvider> settingsProvider;

    public RequestListModule_ModelFactory(C3351dc<RequestInfoDataSource.Repository> dcVar, C3351dc<MemoryCache> dcVar2, C3351dc<SupportBlipsProvider> dcVar3, C3351dc<SupportSettingsProvider> dcVar4) {
        this.requestInfoDataSourceProvider = dcVar;
        this.memoryCacheProvider = dcVar2;
        this.blipsProvider = dcVar3;
        this.settingsProvider = dcVar4;
    }

    public final RequestListModel get() {
        RequestListModel model = RequestListModule.model(this.requestInfoDataSourceProvider.get(), this.memoryCacheProvider.get(), this.blipsProvider.get(), this.settingsProvider.get());
        if (model != null) {
            return model;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RequestListModel> create(C3351dc<RequestInfoDataSource.Repository> dcVar, C3351dc<MemoryCache> dcVar2, C3351dc<SupportBlipsProvider> dcVar3, C3351dc<SupportSettingsProvider> dcVar4) {
        return new RequestListModule_ModelFactory(dcVar, dcVar2, dcVar3, dcVar4);
    }
}
