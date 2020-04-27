package zendesk.support.request;

import o.C3351dc;
import o.M;
import o.nk;
import o.nu;

public final class RequestModule_ProvidesDispatcherFactory implements M<nk> {
    private final C3351dc<nu> storeProvider;

    public RequestModule_ProvidesDispatcherFactory(C3351dc<nu> dcVar) {
        this.storeProvider = dcVar;
    }

    public final nk get() {
        nk providesDispatcher = RequestModule.providesDispatcher(this.storeProvider.get());
        if (providesDispatcher != null) {
            return providesDispatcher;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<nk> create(C3351dc<nu> dcVar) {
        return new RequestModule_ProvidesDispatcherFactory(dcVar);
    }
}
