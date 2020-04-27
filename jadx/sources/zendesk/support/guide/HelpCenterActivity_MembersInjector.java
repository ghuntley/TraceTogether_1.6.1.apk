package zendesk.support.guide;

import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SupportSettingsProvider;

public final class HelpCenterActivity_MembersInjector {
    public static void injectHelpCenterProvider(HelpCenterActivity helpCenterActivity, HelpCenterProvider helpCenterProvider) {
        helpCenterActivity.helpCenterProvider = helpCenterProvider;
    }

    public static void injectSettingsProvider(HelpCenterActivity helpCenterActivity, SupportSettingsProvider supportSettingsProvider) {
        helpCenterActivity.settingsProvider = supportSettingsProvider;
    }

    public static void injectNetworkInfoProvider(HelpCenterActivity helpCenterActivity, NetworkInfoProvider networkInfoProvider) {
        helpCenterActivity.networkInfoProvider = networkInfoProvider;
    }
}
