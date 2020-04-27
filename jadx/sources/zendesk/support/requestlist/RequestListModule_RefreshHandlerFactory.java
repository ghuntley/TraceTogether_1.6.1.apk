package zendesk.support.requestlist;

import o.C3351dc;
import o.M;

public final class RequestListModule_RefreshHandlerFactory implements M<RequestListSyncHandler> {
    private final C3351dc<RequestListPresenter> presenterProvider;

    public RequestListModule_RefreshHandlerFactory(C3351dc<RequestListPresenter> dcVar) {
        this.presenterProvider = dcVar;
    }

    public final RequestListSyncHandler get() {
        RequestListSyncHandler refreshHandler = RequestListModule.refreshHandler(this.presenterProvider.get());
        if (refreshHandler != null) {
            return refreshHandler;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RequestListSyncHandler> create(C3351dc<RequestListPresenter> dcVar) {
        return new RequestListModule_RefreshHandlerFactory(dcVar);
    }
}
