package zendesk.core;

import android.content.Context;
import java.util.Locale;
import o.L;
import o.P;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

class AcceptLanguageHeaderInterceptor implements Interceptor {
    private Context context;

    public AcceptLanguageHeaderInterceptor(Context context2) {
        this.context = context2;
    }

    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        Locale currentLocale = DeviceInfo.getCurrentLocale(this.context);
        if (!P.m1409(request.header("Accept-Language")) || currentLocale == null) {
            return chain.proceed(request);
        }
        return chain.proceed(request.newBuilder().addHeader("Accept-Language", L.m1389(currentLocale)).build());
    }
}
