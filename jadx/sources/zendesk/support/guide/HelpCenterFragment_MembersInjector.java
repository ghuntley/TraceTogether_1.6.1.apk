package zendesk.support.guide;

import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;

public final class HelpCenterFragment_MembersInjector {
    public static void injectHelpCenterProvider(HelpCenterFragment helpCenterFragment, HelpCenterProvider helpCenterProvider) {
        helpCenterFragment.helpCenterProvider = helpCenterProvider;
    }

    public static void injectNetworkInfoProvider(HelpCenterFragment helpCenterFragment, NetworkInfoProvider networkInfoProvider) {
        helpCenterFragment.networkInfoProvider = networkInfoProvider;
    }
}
