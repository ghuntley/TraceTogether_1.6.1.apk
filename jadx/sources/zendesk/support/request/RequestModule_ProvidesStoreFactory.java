package zendesk.support.request;

import java.util.List;
import o.C3351dc;
import o.M;
import o.np;
import o.nu;

public final class RequestModule_ProvidesStoreFactory implements M<nu> {
    private final C3351dc<AsyncMiddleware> asyncMiddlewareProvider;
    private final C3351dc<List<np>> reducersProvider;

    public RequestModule_ProvidesStoreFactory(C3351dc<List<np>> dcVar, C3351dc<AsyncMiddleware> dcVar2) {
        this.reducersProvider = dcVar;
        this.asyncMiddlewareProvider = dcVar2;
    }

    public final nu get() {
        nu providesStore = RequestModule.providesStore(this.reducersProvider.get(), this.asyncMiddlewareProvider.get());
        if (providesStore != null) {
            return providesStore;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<nu> create(C3351dc<List<np>> dcVar, C3351dc<AsyncMiddleware> dcVar2) {
        return new RequestModule_ProvidesStoreFactory(dcVar, dcVar2);
    }
}
