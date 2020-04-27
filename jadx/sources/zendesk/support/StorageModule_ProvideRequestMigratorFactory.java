package zendesk.support;

import android.content.Context;
import o.C3351dc;
import o.M;

public final class StorageModule_ProvideRequestMigratorFactory implements M<RequestMigrator> {
    private final C3351dc<Context> contextProvider;
    private final StorageModule module;

    public StorageModule_ProvideRequestMigratorFactory(StorageModule storageModule, C3351dc<Context> dcVar) {
        this.module = storageModule;
        this.contextProvider = dcVar;
    }

    public final RequestMigrator get() {
        RequestMigrator provideRequestMigrator = this.module.provideRequestMigrator(this.contextProvider.get());
        if (provideRequestMigrator != null) {
            return provideRequestMigrator;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RequestMigrator> create(StorageModule storageModule, C3351dc<Context> dcVar) {
        return new StorageModule_ProvideRequestMigratorFactory(storageModule, dcVar);
    }
}
