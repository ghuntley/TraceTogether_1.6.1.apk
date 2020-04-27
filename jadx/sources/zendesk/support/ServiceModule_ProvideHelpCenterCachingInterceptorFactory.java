package zendesk.support;

import o.M;

public final class ServiceModule_ProvideHelpCenterCachingInterceptorFactory implements M<HelpCenterCachingInterceptor> {
    private static final ServiceModule_ProvideHelpCenterCachingInterceptorFactory INSTANCE = new ServiceModule_ProvideHelpCenterCachingInterceptorFactory();

    public final HelpCenterCachingInterceptor get() {
        HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor = ServiceModule.provideHelpCenterCachingInterceptor();
        if (provideHelpCenterCachingInterceptor != null) {
            return provideHelpCenterCachingInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<HelpCenterCachingInterceptor> create() {
        return INSTANCE;
    }
}
