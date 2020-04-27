package zendesk.core;

import o.F;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

class ZendeskAccessInterceptor implements Interceptor {
    private AccessProvider accessProvider;
    private CoreSettingsStorage coreSettingsStorage;
    private IdentityManager identityManager;
    private Storage storage;

    ZendeskAccessInterceptor(IdentityManager identityManager2, AccessProvider accessProvider2, Storage storage2, CoreSettingsStorage coreSettingsStorage2) {
        this.identityManager = identityManager2;
        this.accessProvider = accessProvider2;
        this.storage = storage2;
        this.coreSettingsStorage = coreSettingsStorage2;
    }

    public Response intercept(Interceptor.Chain chain) {
        Identity identity = this.identityManager.getIdentity();
        if (this.identityManager.getStoredAccessTokenAsBearerToken() == null) {
            F.m1359();
            AuthenticationType authentication = this.coreSettingsStorage.getCoreSettings().getAuthentication();
            if (AuthenticationType.ANONYMOUS == authentication && (identity instanceof AnonymousIdentity)) {
                F.m1359();
                this.accessProvider.getAndStoreAuthTokenViaAnonymous((AnonymousIdentity) identity);
            } else if (AuthenticationType.JWT != authentication || !(identity instanceof JwtIdentity)) {
                this.storage.clear();
                String errorLogMessage = getErrorLogMessage(authentication, identity);
                F.m1358();
                return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(400).message(errorLogMessage).body(ResponseBody.create(MediaType.parse("txt/json"), "{}")).build();
            } else {
                F.m1359();
                this.accessProvider.getAndStoreAuthTokenViaJwt((JwtIdentity) identity);
            }
        } else {
            F.m1359();
        }
        return chain.proceed(chain.request());
    }

    static String getErrorLogMessage(AuthenticationType authenticationType, Identity identity) {
        StringBuilder sb = new StringBuilder(160);
        sb.append("The expected type of authentication is ");
        if (authenticationType == null) {
            sb.append("null. Check that settings have been downloaded.");
        } else if (authenticationType == AuthenticationType.ANONYMOUS) {
            sb.append("anonymous.");
        } else if (authenticationType == AuthenticationType.JWT) {
            sb.append("jwt.");
        }
        sb.append(10);
        sb.append("The local identity is");
        if (identity == null) {
            sb.append(" not");
        }
        sb.append(" present.\n");
        if (identity != null) {
            sb.append("The local identity is ");
            if (identity instanceof AnonymousIdentity) {
                sb.append("anonymous.");
            } else if (identity instanceof JwtIdentity) {
                sb.append("jwt.");
            } else {
                sb.append("unknown.");
            }
        }
        return sb.toString();
    }
}
