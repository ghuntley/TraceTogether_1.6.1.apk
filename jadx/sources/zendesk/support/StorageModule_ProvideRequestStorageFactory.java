package zendesk.support;

import o.C3351dc;
import o.M;
import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;

public final class StorageModule_ProvideRequestStorageFactory implements M<RequestStorage> {
    private final C3351dc<SessionStorage> baseStorageProvider;
    private final C3351dc<MemoryCache> memoryCacheProvider;
    private final StorageModule module;
    private final C3351dc<RequestMigrator> requestMigratorProvider;

    public StorageModule_ProvideRequestStorageFactory(StorageModule storageModule, C3351dc<SessionStorage> dcVar, C3351dc<RequestMigrator> dcVar2, C3351dc<MemoryCache> dcVar3) {
        this.module = storageModule;
        this.baseStorageProvider = dcVar;
        this.requestMigratorProvider = dcVar2;
        this.memoryCacheProvider = dcVar3;
    }

    public final RequestStorage get() {
        RequestStorage provideRequestStorage = this.module.provideRequestStorage(this.baseStorageProvider.get(), this.requestMigratorProvider.get(), this.memoryCacheProvider.get());
        if (provideRequestStorage != null) {
            return provideRequestStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RequestStorage> create(StorageModule storageModule, C3351dc<SessionStorage> dcVar, C3351dc<RequestMigrator> dcVar2, C3351dc<MemoryCache> dcVar3) {
        return new StorageModule_ProvideRequestStorageFactory(storageModule, dcVar, dcVar2, dcVar3);
    }
}
