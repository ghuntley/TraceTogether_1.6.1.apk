package zendesk.support;

import o.C3162;
import o.C3351dc;
import o.M;
import zendesk.core.SessionStorage;

public final class SupportSdkModule_ProvidesRequestDiskLruCacheFactory implements M<C3162> {
    private final SupportSdkModule module;
    private final C3351dc<SessionStorage> sessionStorageProvider;

    public SupportSdkModule_ProvidesRequestDiskLruCacheFactory(SupportSdkModule supportSdkModule, C3351dc<SessionStorage> dcVar) {
        this.module = supportSdkModule;
        this.sessionStorageProvider = dcVar;
    }

    public final C3162 get() {
        C3162 providesRequestDiskLruCache = this.module.providesRequestDiskLruCache(this.sessionStorageProvider.get());
        if (providesRequestDiskLruCache != null) {
            return providesRequestDiskLruCache;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<C3162> create(SupportSdkModule supportSdkModule, C3351dc<SessionStorage> dcVar) {
        return new SupportSdkModule_ProvidesRequestDiskLruCacheFactory(supportSdkModule, dcVar);
    }
}
