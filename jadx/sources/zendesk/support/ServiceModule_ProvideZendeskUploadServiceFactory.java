package zendesk.support;

import o.C3351dc;
import o.M;

public final class ServiceModule_ProvideZendeskUploadServiceFactory implements M<ZendeskUploadService> {
    private final C3351dc<UploadService> uploadServiceProvider;

    public ServiceModule_ProvideZendeskUploadServiceFactory(C3351dc<UploadService> dcVar) {
        this.uploadServiceProvider = dcVar;
    }

    public final ZendeskUploadService get() {
        ZendeskUploadService provideZendeskUploadService = ServiceModule.provideZendeskUploadService(this.uploadServiceProvider.get());
        if (provideZendeskUploadService != null) {
            return provideZendeskUploadService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskUploadService> create(C3351dc<UploadService> dcVar) {
        return new ServiceModule_ProvideZendeskUploadServiceFactory(dcVar);
    }
}
