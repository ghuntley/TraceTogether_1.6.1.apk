package zendesk.support;

import o.C3351dc;
import o.M;
import zendesk.core.RestServiceProvider;

public final class ServiceModule_ProvidesRequestServiceFactory implements M<RequestService> {
    private final C3351dc<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesRequestServiceFactory(C3351dc<RestServiceProvider> dcVar) {
        this.restServiceProvider = dcVar;
    }

    public final RequestService get() {
        RequestService providesRequestService = ServiceModule.providesRequestService(this.restServiceProvider.get());
        if (providesRequestService != null) {
            return providesRequestService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RequestService> create(C3351dc<RestServiceProvider> dcVar) {
        return new ServiceModule_ProvidesRequestServiceFactory(dcVar);
    }
}
