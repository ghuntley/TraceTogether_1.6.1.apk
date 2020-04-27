package zendesk.core;

import java.util.Date;
import o.F;

class ZendeskCoreSettingsStorage implements CoreSettingsStorage {
    static final BlipsSettings DEFAULT_BLIPS_SETTINGS = new BlipsSettings(new BlipsPermissions());
    static final CoreSettings DEFAULT_CORE_SETTINGS = new CoreSettings(new Date(0), (AuthenticationType) null);
    private final SettingsStorage settingsStorage;

    ZendeskCoreSettingsStorage(SettingsStorage settingsStorage2) {
        this.settingsStorage = settingsStorage2;
    }

    public CoreSettings getCoreSettings() {
        CoreSettings coreSettings = (CoreSettings) this.settingsStorage.getSettings("core", CoreSettings.class);
        if (coreSettings != null) {
            return coreSettings;
        }
        F.m1359();
        return DEFAULT_CORE_SETTINGS;
    }

    public BlipsSettings getBlipsSettings() {
        BlipsSettings blipsSettings = (BlipsSettings) this.settingsStorage.getSettings("blips", BlipsSettings.class);
        if (blipsSettings != null) {
            return blipsSettings;
        }
        F.m1359();
        return DEFAULT_BLIPS_SETTINGS;
    }
}
