package zendesk.core;

import android.content.Context;
import o.M;

public final class ZendeskApplicationModule_ProvideApplicationContextFactory implements M<Context> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationContextFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public final Context get() {
        Context provideApplicationContext = this.module.provideApplicationContext();
        if (provideApplicationContext != null) {
            return provideApplicationContext;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<Context> create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationContextFactory(zendeskApplicationModule);
    }
}
