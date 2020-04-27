package zendesk.core;

import java.io.File;
import o.C3351dc;
import o.M;
import okhttp3.Cache;

public final class ZendeskStorageModule_ProvideCacheFactory implements M<Cache> {
    private final C3351dc<File> fileProvider;

    public ZendeskStorageModule_ProvideCacheFactory(C3351dc<File> dcVar) {
        this.fileProvider = dcVar;
    }

    public final Cache get() {
        Cache provideCache = ZendeskStorageModule.provideCache(this.fileProvider.get());
        if (provideCache != null) {
            return provideCache;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<Cache> create(C3351dc<File> dcVar) {
        return new ZendeskStorageModule_ProvideCacheFactory(dcVar);
    }
}
