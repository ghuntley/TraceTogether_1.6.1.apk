package zendesk.core;

import o.P;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

class ZendeskOauthIdHeaderInterceptor implements Interceptor {
    private final String oauthId;

    public ZendeskOauthIdHeaderInterceptor(String str) {
        this.oauthId = str;
    }

    public Response intercept(Interceptor.Chain chain) {
        Request.Builder newBuilder = chain.request().newBuilder();
        if (P.m1406(this.oauthId)) {
            newBuilder.addHeader("Client-Identifier", this.oauthId);
        }
        return chain.proceed(newBuilder.build());
    }
}
