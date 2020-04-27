package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory implements M<ZendeskAuthHeaderInterceptor> {
    private final C3351dc<IdentityManager> identityManagerProvider;

    public ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(C3351dc<IdentityManager> dcVar) {
        this.identityManagerProvider = dcVar;
    }

    public final ZendeskAuthHeaderInterceptor get() {
        ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor = ZendeskNetworkModule.provideAuthHeaderInterceptor(this.identityManagerProvider.get());
        if (provideAuthHeaderInterceptor != null) {
            return provideAuthHeaderInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskAuthHeaderInterceptor> create(C3351dc<IdentityManager> dcVar) {
        return new ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(dcVar);
    }
}
