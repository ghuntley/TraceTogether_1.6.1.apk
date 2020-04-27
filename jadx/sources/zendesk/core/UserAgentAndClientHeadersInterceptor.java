package zendesk.core;

import android.os.Build;
import java.util.Locale;
import o.C3273am;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

class UserAgentAndClientHeadersInterceptor implements Interceptor {
    private final String userAgent;
    private final String version;
    private final String xZendeskClient;

    public UserAgentAndClientHeadersInterceptor(String str, String str2) {
        this.userAgent = String.format(Locale.US, "Zendesk-SDK/%s Android/%d Variant/%s", new Object[]{str, Integer.valueOf(Build.VERSION.SDK_INT), str2});
        this.xZendeskClient = String.format(Locale.US, "mobile/android/sdk/%s", new Object[]{str2.toLowerCase()});
        this.version = str;
    }

    public Response intercept(Interceptor.Chain chain) {
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.removeHeader(C3273am.f1522);
        newBuilder.addHeader(C3273am.f1522, this.userAgent);
        newBuilder.removeHeader("X-Zendesk-Client");
        newBuilder.addHeader("X-Zendesk-Client", this.xZendeskClient);
        newBuilder.removeHeader("X-Zendesk-Client-Version");
        newBuilder.addHeader("X-Zendesk-Client-Version", this.version);
        return chain.proceed(newBuilder.build());
    }
}
