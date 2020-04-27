package zendesk.core;

import o.M;

public final class ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory implements M<AcceptHeaderInterceptor> {
    private static final ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory INSTANCE = new ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory();

    public final AcceptHeaderInterceptor get() {
        AcceptHeaderInterceptor providesAcceptHeaderInterceptor = ZendeskNetworkModule.providesAcceptHeaderInterceptor();
        if (providesAcceptHeaderInterceptor != null) {
            return providesAcceptHeaderInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<AcceptHeaderInterceptor> create() {
        return INSTANCE;
    }
}
