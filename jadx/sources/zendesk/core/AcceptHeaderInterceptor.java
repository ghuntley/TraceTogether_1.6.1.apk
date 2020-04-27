package zendesk.core;

import o.C3273am;
import okhttp3.Interceptor;
import okhttp3.Response;

class AcceptHeaderInterceptor implements Interceptor {
    AcceptHeaderInterceptor() {
    }

    public Response intercept(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().addHeader(C3273am.f1520, C3273am.f1530).build());
    }
}
