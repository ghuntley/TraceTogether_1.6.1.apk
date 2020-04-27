package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvideCoreSettingsStorageFactory implements M<CoreSettingsStorage> {
    private final C3351dc<SettingsStorage> settingsStorageProvider;

    public ZendeskStorageModule_ProvideCoreSettingsStorageFactory(C3351dc<SettingsStorage> dcVar) {
        this.settingsStorageProvider = dcVar;
    }

    public final CoreSettingsStorage get() {
        CoreSettingsStorage provideCoreSettingsStorage = ZendeskStorageModule.provideCoreSettingsStorage(this.settingsStorageProvider.get());
        if (provideCoreSettingsStorage != null) {
            return provideCoreSettingsStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<CoreSettingsStorage> create(C3351dc<SettingsStorage> dcVar) {
        return new ZendeskStorageModule_ProvideCoreSettingsStorageFactory(dcVar);
    }
}
