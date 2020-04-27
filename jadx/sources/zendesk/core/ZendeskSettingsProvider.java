package zendesk.core;

import android.content.Context;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C;
import o.C1367;
import o.F;
import o.G;
import o.I;
import o.L;
import o.kB;

class ZendeskSettingsProvider implements SettingsProvider, SdkSettingsProviderInternal {
    private final String applicationId;
    private final Context context;
    /* access modifiers changed from: private */
    public final CoreSettingsStorage coreSettingsStorage;
    /* access modifiers changed from: private */
    public final Serializer serializer;
    private final SdkSettingsService settingsService;
    /* access modifiers changed from: private */
    public final SettingsStorage settingsStorage;

    ZendeskSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage2, CoreSettingsStorage coreSettingsStorage2, Serializer serializer2, String str, Context context2) {
        this.settingsService = sdkSettingsService;
        this.settingsStorage = settingsStorage2;
        this.coreSettingsStorage = coreSettingsStorage2;
        this.serializer = serializer2;
        this.applicationId = str;
        this.context = context2;
    }

    public CoreSettings getCoreSettings() {
        if (this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            return this.coreSettingsStorage.getCoreSettings();
        }
        Map<String, C1367> settingsInternal = getSettingsInternal(DeviceInfo.getCurrentLocale(this.context));
        if (settingsInternal.isEmpty()) {
            return new CoreSettings(new Date(0), (AuthenticationType) null);
        }
        this.settingsStorage.storeRawSettings(settingsInternal);
        return extractCoreSettings(settingsInternal);
    }

    public <E extends Settings> void getSettingsForSdk(final String str, final Class<E> cls, final G<SettingsPack<E>> g) {
        if (!this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new G<Map<String, C1367>>() {
                public void onSuccess(Map<String, C1367> map) {
                    ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                    if (g != null) {
                        g.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.extractCoreSettings(map), (Settings) ZendeskSettingsProvider.this.serializer.deserialize(map.get(str), cls)));
                    }
                }

                public void onError(C c) {
                    if (g != null) {
                        if (ZendeskSettingsProvider.this.settingsStorage.hasStoredSettings()) {
                            g.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings(), (Settings) ZendeskSettingsProvider.this.settingsStorage.getSettings(str, cls)));
                            return;
                        }
                        g.onError(c);
                    }
                }
            });
        } else if (g != null) {
            g.onSuccess(new SettingsPack(this.coreSettingsStorage.getCoreSettings(), (Settings) this.settingsStorage.getSettings(str, cls)));
        }
    }

    private void getSettingsInternal(Locale locale, G<Map<String, C1367>> g) {
        this.settingsService.getSettings(L.m1389(locale), this.applicationId).m3316(new I(g));
    }

    private Map<String, C1367> getSettingsInternal(Locale locale) {
        try {
            kB<Map<String, C1367>> r4 = this.settingsService.getSettings(L.m1389(locale), this.applicationId).m3314();
            if (r4.f2556 != null) {
                return new HashMap((Map) r4.f2556);
            }
            return new HashMap(0);
        } catch (IOException unused) {
            F.m1358();
            return new HashMap(0);
        }
    }

    /* access modifiers changed from: package-private */
    public CoreSettings extractCoreSettings(Map<String, C1367> map) {
        CoreSettings coreSettings = (CoreSettings) this.serializer.deserialize(map == null ? null : map.get("core"), CoreSettings.class);
        if (coreSettings != null) {
            return coreSettings;
        }
        return ZendeskCoreSettingsStorage.DEFAULT_CORE_SETTINGS;
    }
}
