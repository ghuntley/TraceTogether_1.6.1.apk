package zendesk.core;

import o.M;

public final class ZendeskStorageModule_ProvideMemoryCacheFactory implements M<MemoryCache> {
    private static final ZendeskStorageModule_ProvideMemoryCacheFactory INSTANCE = new ZendeskStorageModule_ProvideMemoryCacheFactory();

    public final MemoryCache get() {
        MemoryCache provideMemoryCache = ZendeskStorageModule.provideMemoryCache();
        if (provideMemoryCache != null) {
            return provideMemoryCache;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<MemoryCache> create() {
        return INSTANCE;
    }
}
