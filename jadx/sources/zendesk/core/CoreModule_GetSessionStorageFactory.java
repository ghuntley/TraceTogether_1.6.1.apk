package zendesk.core;

import o.M;

public final class CoreModule_GetSessionStorageFactory implements M<SessionStorage> {
    private final CoreModule module;

    public CoreModule_GetSessionStorageFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public final SessionStorage get() {
        SessionStorage sessionStorage = this.module.getSessionStorage();
        if (sessionStorage != null) {
            return sessionStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SessionStorage> create(CoreModule coreModule) {
        return new CoreModule_GetSessionStorageFactory(coreModule);
    }
}
