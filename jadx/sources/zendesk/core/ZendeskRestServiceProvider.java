package zendesk.core;

import o.kC;
import o.kD;
import okhttp3.Call;
import okhttp3.OkHttpClient;

class ZendeskRestServiceProvider implements RestServiceProvider {
    private final OkHttpClient mediaHttpClient;
    private final kD retrofit;
    private final OkHttpClient standardOkHttpClient;

    ZendeskRestServiceProvider(kD kDVar, OkHttpClient okHttpClient, OkHttpClient okHttpClient2) {
        this.retrofit = kDVar;
        this.mediaHttpClient = okHttpClient;
        this.standardOkHttpClient = okHttpClient2;
    }

    public <E> E createRestService(Class<E> cls, String str, String str2) {
        kD.C0196 r1 = new kD.C0196(this.retrofit);
        r1.f2574 = (Call.Factory) kC.m3212((Call.Factory) kC.m3212(this.standardOkHttpClient.newBuilder().addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2)).build(), "client == null"), "factory == null");
        return r1.m3223().m3219(cls);
    }

    public <E> E createRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig) {
        OkHttpClient.Builder newBuilder = this.standardOkHttpClient.newBuilder();
        customNetworkConfig.configureOkHttpClient(newBuilder);
        newBuilder.addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2));
        kD.C0196 r5 = new kD.C0196(this.retrofit);
        customNetworkConfig.configureRetrofit(r5);
        r5.f2574 = (Call.Factory) kC.m3212((Call.Factory) kC.m3212(newBuilder.build(), "client == null"), "factory == null");
        return r5.m3223().m3219(cls);
    }

    public OkHttpClient getMediaOkHttpClient() {
        return this.mediaHttpClient;
    }
}
