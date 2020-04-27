package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskNetworkModule_ProvideCachingInterceptorFactory implements M<CachingInterceptor> {
    private final C3351dc<BaseStorage> mediaCacheProvider;

    public ZendeskNetworkModule_ProvideCachingInterceptorFactory(C3351dc<BaseStorage> dcVar) {
        this.mediaCacheProvider = dcVar;
    }

    public final CachingInterceptor get() {
        CachingInterceptor provideCachingInterceptor = ZendeskNetworkModule.provideCachingInterceptor(this.mediaCacheProvider.get());
        if (provideCachingInterceptor != null) {
            return provideCachingInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<CachingInterceptor> create(C3351dc<BaseStorage> dcVar) {
        return new ZendeskNetworkModule_ProvideCachingInterceptorFactory(dcVar);
    }
}
