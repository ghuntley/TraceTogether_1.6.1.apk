package zendesk.core;

import o.M;

public final class ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory implements M<UserAgentAndClientHeadersInterceptor> {
    private final ZendeskNetworkModule module;

    public ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(ZendeskNetworkModule zendeskNetworkModule) {
        this.module = zendeskNetworkModule;
    }

    public final UserAgentAndClientHeadersInterceptor get() {
        UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor = this.module.providesUserAgentHeaderInterceptor();
        if (providesUserAgentHeaderInterceptor != null) {
            return providesUserAgentHeaderInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<UserAgentAndClientHeadersInterceptor> create(ZendeskNetworkModule zendeskNetworkModule) {
        return new ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(zendeskNetworkModule);
    }
}
