package zendesk.support;

import o.C3351dc;
import o.M;

public final class ServiceModule_ProvideZendeskRequestServiceFactory implements M<ZendeskRequestService> {
    private final C3351dc<RequestService> requestServiceProvider;

    public ServiceModule_ProvideZendeskRequestServiceFactory(C3351dc<RequestService> dcVar) {
        this.requestServiceProvider = dcVar;
    }

    public final ZendeskRequestService get() {
        ZendeskRequestService provideZendeskRequestService = ServiceModule.provideZendeskRequestService(this.requestServiceProvider.get());
        if (provideZendeskRequestService != null) {
            return provideZendeskRequestService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskRequestService> create(C3351dc<RequestService> dcVar) {
        return new ServiceModule_ProvideZendeskRequestServiceFactory(dcVar);
    }
}
