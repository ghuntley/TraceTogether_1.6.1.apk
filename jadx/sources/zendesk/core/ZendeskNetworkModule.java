package zendesk.core;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import o.C3122;
import o.C3349da;
import o.C3356di;
import o.kC;
import o.kD;
import o.kE;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

class ZendeskNetworkModule {
    ZendeskNetworkModule() {
    }

    /* access modifiers changed from: package-private */
    public ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ApplicationConfiguration applicationConfiguration) {
        return new ZendeskOauthIdHeaderInterceptor(applicationConfiguration.getOauthClientId());
    }

    /* access modifiers changed from: package-private */
    public UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor() {
        return new UserAgentAndClientHeadersInterceptor("2.0.1", "Core");
    }

    static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        return new AcceptHeaderInterceptor();
    }

    static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage) {
        return new ZendeskUnauthorizedInterceptor(sessionStorage);
    }

    static ZendeskSettingsInterceptor provideSettingsInterceptor(SdkSettingsProviderInternal sdkSettingsProviderInternal, SettingsStorage settingsStorage) {
        return new ZendeskSettingsInterceptor(sdkSettingsProviderInternal, settingsStorage);
    }

    static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(@C3349da(m2095 = "application_context") Context context) {
        return new AcceptLanguageHeaderInterceptor(context);
    }

    static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(IdentityManager identityManager) {
        return new ZendeskAuthHeaderInterceptor(identityManager);
    }

    static ZendeskAccessInterceptor provideAccessInterceptor(IdentityManager identityManager, AccessProvider accessProvider, Storage storage, CoreSettingsStorage coreSettingsStorage) {
        return new ZendeskAccessInterceptor(identityManager, accessProvider, storage, coreSettingsStorage);
    }

    static CachingInterceptor provideCachingInterceptor(@C3349da(m2095 = "base_storage_disk_lru") BaseStorage baseStorage) {
        return new CachingInterceptor(baseStorage);
    }

    /* access modifiers changed from: package-private */
    @C3349da(m2095 = "BaseOkHttp")
    @C3356di
    public OkHttpClient provideBaseOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, ZendeskOauthIdHeaderInterceptor zendeskOauthIdHeaderInterceptor, UserAgentAndClientHeadersInterceptor userAgentAndClientHeadersInterceptor, ExecutorService executorService) {
        return Tls12SocketFactory.enableTls12OnPreLollipop(new OkHttpClient.Builder()).addInterceptor(zendeskOauthIdHeaderInterceptor).addInterceptor(httpLoggingInterceptor).addInterceptor(userAgentAndClientHeadersInterceptor).connectTimeout(30, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).writeTimeout(30, TimeUnit.SECONDS).dispatcher(new Dispatcher(executorService)).build();
    }

    @C3349da(m2095 = "CoreOkHttp")
    @C3356di
    static OkHttpClient provideCoreOkHttpClient(@C3349da(m2095 = "BaseOkHttp") OkHttpClient okHttpClient, AcceptLanguageHeaderInterceptor acceptLanguageHeaderInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor) {
        return okHttpClient.newBuilder().addInterceptor(acceptLanguageHeaderInterceptor).addInterceptor(acceptHeaderInterceptor).build();
    }

    @C3349da(m2095 = "MediaOkHttp")
    @C3356di
    static OkHttpClient provideMediaOkHttpClient(@C3349da(m2095 = "BaseOkHttp") OkHttpClient okHttpClient, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, CachingInterceptor cachingInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor) {
        return okHttpClient.newBuilder().addInterceptor(zendeskSettingsInterceptor).addInterceptor(cachingInterceptor).addInterceptor(zendeskAccessInterceptor).addInterceptor(zendeskAuthHeaderInterceptor).addInterceptor(zendeskUnauthorizedInterceptor).build();
    }

    @C3349da(m2095 = "StandardOkHttp")
    @C3356di
    static OkHttpClient provideOkHttpClient(@C3349da(m2095 = "BaseOkHttp") OkHttpClient okHttpClient, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor, Cache cache) {
        return okHttpClient.newBuilder().addInterceptor(zendeskSettingsInterceptor).addInterceptor(zendeskAccessInterceptor).addInterceptor(zendeskAuthHeaderInterceptor).addInterceptor(zendeskUnauthorizedInterceptor).addInterceptor(acceptHeaderInterceptor).cache(cache).build();
    }

    @C3349da(m2095 = "Retrofit")
    @C3356di
    static kD provideRetrofit(ApplicationConfiguration applicationConfiguration, C3122 r3, @C3349da(m2095 = "StandardOkHttp") OkHttpClient okHttpClient) {
        kD.C0196 r2 = new kD.C0196().m3222(applicationConfiguration.getZendeskUrl());
        if (r3 != null) {
            r2.f2575.add(kC.m3212(new kE(r3), "factory == null"));
            r2.f2574 = (Call.Factory) kC.m3212((Call.Factory) kC.m3212(okHttpClient, "client == null"), "factory == null");
            return r2.m3223();
        }
        throw new NullPointerException("gson == null");
    }

    @C3349da(m2095 = "CoreRetrofit")
    @C3356di
    static kD provideCoreRetrofit(ApplicationConfiguration applicationConfiguration, C3122 r3, @C3349da(m2095 = "CoreOkHttp") OkHttpClient okHttpClient) {
        kD.C0196 r2 = new kD.C0196().m3222(applicationConfiguration.getZendeskUrl());
        if (r3 != null) {
            r2.f2575.add(kC.m3212(new kE(r3), "factory == null"));
            r2.f2574 = (Call.Factory) kC.m3212((Call.Factory) kC.m3212(okHttpClient, "client == null"), "factory == null");
            return r2.m3223();
        }
        throw new NullPointerException("gson == null");
    }

    @C3356di
    static RestServiceProvider provideRestServiceProvider(@C3349da(m2095 = "Retrofit") kD kDVar, @C3349da(m2095 = "MediaOkHttp") OkHttpClient okHttpClient, @C3349da(m2095 = "StandardOkHttp") OkHttpClient okHttpClient2) {
        return new ZendeskRestServiceProvider(kDVar, okHttpClient, okHttpClient2);
    }
}
