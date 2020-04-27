package zendesk.core;

import android.content.Context;
import o.M;

public final class CoreModule_GetApplicationContextFactory implements M<Context> {
    private final CoreModule module;

    public CoreModule_GetApplicationContextFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public final Context get() {
        Context applicationContext = this.module.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<Context> create(CoreModule coreModule) {
        return new CoreModule_GetApplicationContextFactory(coreModule);
    }
}
