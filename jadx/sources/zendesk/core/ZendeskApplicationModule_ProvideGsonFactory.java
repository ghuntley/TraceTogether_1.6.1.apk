package zendesk.core;

import o.C3122;
import o.M;

public final class ZendeskApplicationModule_ProvideGsonFactory implements M<C3122> {
    private static final ZendeskApplicationModule_ProvideGsonFactory INSTANCE = new ZendeskApplicationModule_ProvideGsonFactory();

    public final C3122 get() {
        C3122 provideGson = ZendeskApplicationModule.provideGson();
        if (provideGson != null) {
            return provideGson;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<C3122> create() {
        return INSTANCE;
    }
}
