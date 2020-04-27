package zendesk.core;

import java.util.concurrent.TimeUnit;
import o.F;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Response;

class ZendeskSettingsInterceptor implements Interceptor {
    private final SdkSettingsProviderInternal provider;
    private SettingsStorage settingsStorage;

    ZendeskSettingsInterceptor(SdkSettingsProviderInternal sdkSettingsProviderInternal, SettingsStorage settingsStorage2) {
        this.provider = sdkSettingsProviderInternal;
        this.settingsStorage = settingsStorage2;
    }

    public Response intercept(Interceptor.Chain chain) {
        if (!this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            F.m1359();
            if (this.provider.getCoreSettings() == null) {
                F.m1359();
                return new Response.Builder().protocol(Protocol.HTTP_2).request(chain.request()).message(chain.request().method()).code(404).build();
            }
        }
        F.m1359();
        return chain.proceed(chain.request());
    }
}
