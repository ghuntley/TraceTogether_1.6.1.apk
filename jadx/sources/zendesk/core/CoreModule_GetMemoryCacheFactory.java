package zendesk.core;

import o.M;

public final class CoreModule_GetMemoryCacheFactory implements M<MemoryCache> {
    private final CoreModule module;

    public CoreModule_GetMemoryCacheFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public final MemoryCache get() {
        MemoryCache memoryCache = this.module.getMemoryCache();
        if (memoryCache != null) {
            return memoryCache;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<MemoryCache> create(CoreModule coreModule) {
        return new CoreModule_GetMemoryCacheFactory(coreModule);
    }
}
