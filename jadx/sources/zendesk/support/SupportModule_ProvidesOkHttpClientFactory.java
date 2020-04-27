package zendesk.support;

import o.M;
import okhttp3.OkHttpClient;

public final class SupportModule_ProvidesOkHttpClientFactory implements M<OkHttpClient> {
    private final SupportModule module;

    public SupportModule_ProvidesOkHttpClientFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public final OkHttpClient get() {
        OkHttpClient providesOkHttpClient = this.module.providesOkHttpClient();
        if (providesOkHttpClient != null) {
            return providesOkHttpClient;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<OkHttpClient> create(SupportModule supportModule) {
        return new SupportModule_ProvidesOkHttpClientFactory(supportModule);
    }
}
