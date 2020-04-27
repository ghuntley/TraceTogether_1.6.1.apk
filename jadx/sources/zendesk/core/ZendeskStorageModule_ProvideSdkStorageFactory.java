package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvideSdkStorageFactory implements M<Storage> {
    private final C3351dc<MemoryCache> memoryCacheProvider;
    private final C3351dc<BaseStorage> sdkBaseStorageProvider;
    private final C3351dc<SessionStorage> sessionStorageProvider;
    private final C3351dc<SettingsStorage> settingsStorageProvider;

    public ZendeskStorageModule_ProvideSdkStorageFactory(C3351dc<SettingsStorage> dcVar, C3351dc<SessionStorage> dcVar2, C3351dc<BaseStorage> dcVar3, C3351dc<MemoryCache> dcVar4) {
        this.settingsStorageProvider = dcVar;
        this.sessionStorageProvider = dcVar2;
        this.sdkBaseStorageProvider = dcVar3;
        this.memoryCacheProvider = dcVar4;
    }

    public final Storage get() {
        Storage provideSdkStorage = ZendeskStorageModule.provideSdkStorage(this.settingsStorageProvider.get(), this.sessionStorageProvider.get(), this.sdkBaseStorageProvider.get(), this.memoryCacheProvider.get());
        if (provideSdkStorage != null) {
            return provideSdkStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<Storage> create(C3351dc<SettingsStorage> dcVar, C3351dc<SessionStorage> dcVar2, C3351dc<BaseStorage> dcVar3, C3351dc<MemoryCache> dcVar4) {
        return new ZendeskStorageModule_ProvideSdkStorageFactory(dcVar, dcVar2, dcVar3, dcVar4);
    }
}
