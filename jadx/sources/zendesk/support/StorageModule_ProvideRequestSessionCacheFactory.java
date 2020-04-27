package zendesk.support;

import o.M;

public final class StorageModule_ProvideRequestSessionCacheFactory implements M<RequestSessionCache> {
    private final StorageModule module;

    public StorageModule_ProvideRequestSessionCacheFactory(StorageModule storageModule) {
        this.module = storageModule;
    }

    public final RequestSessionCache get() {
        RequestSessionCache provideRequestSessionCache = this.module.provideRequestSessionCache();
        if (provideRequestSessionCache != null) {
            return provideRequestSessionCache;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RequestSessionCache> create(StorageModule storageModule) {
        return new StorageModule_ProvideRequestSessionCacheFactory(storageModule);
    }
}
