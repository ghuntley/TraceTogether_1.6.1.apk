package zendesk.support;

import o.P;
import okhttp3.Interceptor;
import okhttp3.Response;

class HelpCenterCachingInterceptor implements Interceptor {
    HelpCenterCachingInterceptor() {
    }

    public Response intercept(Interceptor.Chain chain) {
        Response proceed = chain.proceed(chain.request());
        return P.m1406(proceed.headers().get("X-ZD-Cache-Control")) ? proceed.newBuilder().header("Cache-Control", proceed.header("X-ZD-Cache-Control")).build() : proceed;
    }
}
