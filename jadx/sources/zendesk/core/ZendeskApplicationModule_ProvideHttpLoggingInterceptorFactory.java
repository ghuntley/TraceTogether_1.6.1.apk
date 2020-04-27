package zendesk.core;

import o.M;
import okhttp3.logging.HttpLoggingInterceptor;

public final class ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory implements M<HttpLoggingInterceptor> {
    private static final ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory INSTANCE = new ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory();

    public final HttpLoggingInterceptor get() {
        HttpLoggingInterceptor provideHttpLoggingInterceptor = ZendeskApplicationModule.provideHttpLoggingInterceptor();
        if (provideHttpLoggingInterceptor != null) {
            return provideHttpLoggingInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<HttpLoggingInterceptor> create() {
        return INSTANCE;
    }
}
