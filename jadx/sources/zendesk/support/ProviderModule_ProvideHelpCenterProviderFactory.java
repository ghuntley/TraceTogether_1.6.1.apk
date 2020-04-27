package zendesk.support;

import o.C3351dc;
import o.M;

public final class ProviderModule_ProvideHelpCenterProviderFactory implements M<HelpCenterProvider> {
    private final C3351dc<ZendeskHelpCenterService> helpCenterServiceProvider;
    private final C3351dc<HelpCenterSessionCache> helpCenterSessionCacheProvider;
    private final ProviderModule module;
    private final C3351dc<SupportSettingsProvider> settingsProvider;
    private final C3351dc<SupportBlipsProvider> supportBlipsProvider;
    private final C3351dc<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideHelpCenterProviderFactory(ProviderModule providerModule, C3351dc<SupportSettingsProvider> dcVar, C3351dc<SupportBlipsProvider> dcVar2, C3351dc<ZendeskHelpCenterService> dcVar3, C3351dc<HelpCenterSessionCache> dcVar4, C3351dc<ZendeskTracker> dcVar5) {
        this.module = providerModule;
        this.settingsProvider = dcVar;
        this.supportBlipsProvider = dcVar2;
        this.helpCenterServiceProvider = dcVar3;
        this.helpCenterSessionCacheProvider = dcVar4;
        this.zendeskTrackerProvider = dcVar5;
    }

    public final HelpCenterProvider get() {
        HelpCenterProvider provideHelpCenterProvider = this.module.provideHelpCenterProvider(this.settingsProvider.get(), this.supportBlipsProvider.get(), this.helpCenterServiceProvider.get(), this.helpCenterSessionCacheProvider.get(), this.zendeskTrackerProvider.get());
        if (provideHelpCenterProvider != null) {
            return provideHelpCenterProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<HelpCenterProvider> create(ProviderModule providerModule, C3351dc<SupportSettingsProvider> dcVar, C3351dc<SupportBlipsProvider> dcVar2, C3351dc<ZendeskHelpCenterService> dcVar3, C3351dc<HelpCenterSessionCache> dcVar4, C3351dc<ZendeskTracker> dcVar5) {
        return new ProviderModule_ProvideHelpCenterProviderFactory(providerModule, dcVar, dcVar2, dcVar3, dcVar4, dcVar5);
    }
}
