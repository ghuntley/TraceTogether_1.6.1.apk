package zendesk.support;

import o.C3351dc;
import o.M;
import zendesk.core.RestServiceProvider;

public final class ServiceModule_ProvidesUploadServiceFactory implements M<UploadService> {
    private final C3351dc<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesUploadServiceFactory(C3351dc<RestServiceProvider> dcVar) {
        this.restServiceProvider = dcVar;
    }

    public final UploadService get() {
        UploadService providesUploadService = ServiceModule.providesUploadService(this.restServiceProvider.get());
        if (providesUploadService != null) {
            return providesUploadService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<UploadService> create(C3351dc<RestServiceProvider> dcVar) {
        return new ServiceModule_ProvidesUploadServiceFactory(dcVar);
    }
}
