package zendesk.support.requestlist;

import o.C3351dc;
import o.M;

public final class RequestListModule_PresenterFactory implements M<RequestListPresenter> {
    private final C3351dc<RequestListModel> modelProvider;
    private final C3351dc<RequestListView> viewProvider;

    public RequestListModule_PresenterFactory(C3351dc<RequestListView> dcVar, C3351dc<RequestListModel> dcVar2) {
        this.viewProvider = dcVar;
        this.modelProvider = dcVar2;
    }

    public final RequestListPresenter get() {
        RequestListPresenter presenter = RequestListModule.presenter(this.viewProvider.get(), this.modelProvider.get());
        if (presenter != null) {
            return presenter;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RequestListPresenter> create(C3351dc<RequestListView> dcVar, C3351dc<RequestListModel> dcVar2) {
        return new RequestListModule_PresenterFactory(dcVar, dcVar2);
    }
}
