package zendesk.support;

import java.util.Locale;
import o.C;
import o.F;
import o.G;
import zendesk.core.AuthenticationType;
import zendesk.core.SettingsPack;
import zendesk.core.SettingsProvider;

class ZendeskSupportSettingsProvider implements SupportSettingsProvider {
    private final Locale deviceLocale;
    private final HelpCenterLocaleConverter localeConverter;
    /* access modifiers changed from: private */
    public final SettingsProvider sdkSettingsProvider;

    ZendeskSupportSettingsProvider(SettingsProvider settingsProvider, HelpCenterLocaleConverter helpCenterLocaleConverter, Locale locale) {
        this.sdkSettingsProvider = settingsProvider;
        this.localeConverter = helpCenterLocaleConverter;
        this.deviceLocale = locale;
    }

    public void getSettings(G<SupportSdkSettings> g) {
        this.sdkSettingsProvider.getSettingsForSdk("support", SupportSettings.class, new LoadSupportSettings(g));
    }

    class LoadSupportSettings extends G<SettingsPack<SupportSettings>> {
        private final G<SupportSdkSettings> callback;

        LoadSupportSettings(G<SupportSdkSettings> g) {
            this.callback = g;
        }

        public void onSuccess(SettingsPack<SupportSettings> settingsPack) {
            ZendeskSupportSettingsProvider.this.sdkSettingsProvider.getSettingsForSdk("help_center", HelpCenterSettings.class, new LoadHelpCenterSettings(this.callback, settingsPack));
        }

        public void onError(C c) {
            if (this.callback != null) {
                F.m1359();
                this.callback.onSuccess(new SupportSdkSettings(SupportSettings.defaultSettings(), HelpCenterSettings.defaultSettings(), (AuthenticationType) null));
            }
        }
    }

    class LoadHelpCenterSettings extends G<SettingsPack<HelpCenterSettings>> {
        private final G<SupportSdkSettings> callback;
        private final SettingsPack<SupportSettings> supportSettingsPack;

        LoadHelpCenterSettings(G<SupportSdkSettings> g, SettingsPack<SupportSettings> settingsPack) {
            this.callback = g;
            this.supportSettingsPack = settingsPack;
        }

        public void onSuccess(SettingsPack<HelpCenterSettings> settingsPack) {
            HelpCenterSettings settings = settingsPack.getSettings();
            AuthenticationType authentication = settingsPack.getCoreSettings().getAuthentication();
            ZendeskSupportSettingsProvider.this.logIfLocaleNotAvailable(settings);
            F.m1359();
            G<SupportSdkSettings> g = this.callback;
            if (g != null) {
                g.onSuccess(new SupportSdkSettings(this.supportSettingsPack.getSettings(), settings, authentication));
            }
        }

        public void onError(C c) {
            if (this.callback != null) {
                F.m1359();
                this.callback.onSuccess(new SupportSdkSettings(this.supportSettingsPack.getSettings(), HelpCenterSettings.defaultSettings(), this.supportSettingsPack.getCoreSettings().getAuthentication()));
            }
        }
    }

    /* access modifiers changed from: private */
    public void logIfLocaleNotAvailable(HelpCenterSettings helpCenterSettings) {
        String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(this.deviceLocale);
        if (!helpCenterLocaleString.equals(helpCenterSettings.getLocale())) {
            Object[] objArr = {helpCenterLocaleString, Boolean.valueOf(helpCenterSettings.isEnabled())};
            F.m1361();
        }
    }
}
