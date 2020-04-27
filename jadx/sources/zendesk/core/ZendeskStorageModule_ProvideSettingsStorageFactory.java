package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvideSettingsStorageFactory implements M<SettingsStorage> {
    private final C3351dc<BaseStorage> baseStorageProvider;

    public ZendeskStorageModule_ProvideSettingsStorageFactory(C3351dc<BaseStorage> dcVar) {
        this.baseStorageProvider = dcVar;
    }

    public final SettingsStorage get() {
        SettingsStorage provideSettingsStorage = ZendeskStorageModule.provideSettingsStorage(this.baseStorageProvider.get());
        if (provideSettingsStorage != null) {
            return provideSettingsStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SettingsStorage> create(C3351dc<BaseStorage> dcVar) {
        return new ZendeskStorageModule_ProvideSettingsStorageFactory(dcVar);
    }
}
