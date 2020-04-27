package zendesk.core;

import okhttp3.Interceptor;
import okhttp3.Response;

class ZendeskUnauthorizedInterceptor implements Interceptor {
    private final SessionStorage sessionStorage;

    ZendeskUnauthorizedInterceptor(SessionStorage sessionStorage2) {
        this.sessionStorage = sessionStorage2;
    }

    public Response intercept(Interceptor.Chain chain) {
        Response proceed = chain.proceed(chain.request());
        if (!proceed.isSuccessful() && 401 == proceed.code()) {
            onHttpUnauthorized();
        }
        return proceed;
    }

    /* access modifiers changed from: package-private */
    public void onHttpUnauthorized() {
        this.sessionStorage.clear();
    }
}
