package zendesk.core;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

class ZendeskAuthHeaderInterceptor implements Interceptor {
    private IdentityManager identityManager;

    ZendeskAuthHeaderInterceptor(IdentityManager identityManager2) {
        this.identityManager = identityManager2;
    }

    public Response intercept(Interceptor.Chain chain) {
        Request.Builder newBuilder = chain.request().newBuilder();
        String storedAccessTokenAsBearerToken = this.identityManager.getStoredAccessTokenAsBearerToken();
        if (storedAccessTokenAsBearerToken != null) {
            newBuilder.addHeader("Authorization", storedAccessTokenAsBearerToken);
        }
        return chain.proceed(newBuilder.build());
    }
}
