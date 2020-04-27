package zendesk.support.requestlist;

import o.C3351dc;
import o.C3616p;
import o.M;

public final class RequestListModule_ViewFactory implements M<RequestListView> {
    private final RequestListModule module;
    private final C3351dc<C3616p> picassoProvider;

    public RequestListModule_ViewFactory(RequestListModule requestListModule, C3351dc<C3616p> dcVar) {
        this.module = requestListModule;
        this.picassoProvider = dcVar;
    }

    public final RequestListView get() {
        RequestListView view = this.module.view(this.picassoProvider.get());
        if (view != null) {
            return view;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RequestListView> create(RequestListModule requestListModule, C3351dc<C3616p> dcVar) {
        return new RequestListModule_ViewFactory(requestListModule, dcVar);
    }
}
