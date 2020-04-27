package zendesk.core;

import android.content.Context;
import o.C3351dc;
import o.M;

public final class ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory implements M<AcceptLanguageHeaderInterceptor> {
    private final C3351dc<Context> contextProvider;

    public ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory(C3351dc<Context> dcVar) {
        this.contextProvider = dcVar;
    }

    public final AcceptLanguageHeaderInterceptor get() {
        AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor = ZendeskNetworkModule.provideAcceptLanguageHeaderInterceptor(this.contextProvider.get());
        if (provideAcceptLanguageHeaderInterceptor != null) {
            return provideAcceptLanguageHeaderInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<AcceptLanguageHeaderInterceptor> create(C3351dc<Context> dcVar) {
        return new ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory(dcVar);
    }
}
