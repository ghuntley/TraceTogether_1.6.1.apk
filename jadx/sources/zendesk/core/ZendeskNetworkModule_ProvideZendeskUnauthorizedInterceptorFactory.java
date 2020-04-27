package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory implements M<ZendeskUnauthorizedInterceptor> {
    private final C3351dc<SessionStorage> sessionStorageProvider;

    public ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory(C3351dc<SessionStorage> dcVar) {
        this.sessionStorageProvider = dcVar;
    }

    public final ZendeskUnauthorizedInterceptor get() {
        ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor = ZendeskNetworkModule.provideZendeskUnauthorizedInterceptor(this.sessionStorageProvider.get());
        if (provideZendeskUnauthorizedInterceptor != null) {
            return provideZendeskUnauthorizedInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskUnauthorizedInterceptor> create(C3351dc<SessionStorage> dcVar) {
        return new ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory(dcVar);
    }
}
