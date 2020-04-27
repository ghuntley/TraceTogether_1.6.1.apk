package zendesk.support;

import o.M;

public final class StorageModule_ProvideHelpCenterSessionCacheFactory implements M<HelpCenterSessionCache> {
    private final StorageModule module;

    public StorageModule_ProvideHelpCenterSessionCacheFactory(StorageModule storageModule) {
        this.module = storageModule;
    }

    public final HelpCenterSessionCache get() {
        HelpCenterSessionCache provideHelpCenterSessionCache = this.module.provideHelpCenterSessionCache();
        if (provideHelpCenterSessionCache != null) {
            return provideHelpCenterSessionCache;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<HelpCenterSessionCache> create(StorageModule storageModule) {
        return new StorageModule_ProvideHelpCenterSessionCacheFactory(storageModule);
    }
}
