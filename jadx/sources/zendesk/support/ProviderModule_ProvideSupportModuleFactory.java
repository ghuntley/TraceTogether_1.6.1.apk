package zendesk.support;

import o.C3351dc;
import o.M;
import zendesk.core.RestServiceProvider;

public final class ProviderModule_ProvideSupportModuleFactory implements M<SupportModule> {
    private final C3351dc<ArticleVoteStorage> articleVoteStorageProvider;
    private final C3351dc<SupportBlipsProvider> blipsProvider;
    private final C3351dc<HelpCenterProvider> helpCenterProvider;
    private final ProviderModule module;
    private final C3351dc<RequestProvider> requestProvider;
    private final C3351dc<RestServiceProvider> restServiceProvider;
    private final C3351dc<SupportSettingsProvider> settingsProvider;
    private final C3351dc<UploadProvider> uploadProvider;
    private final C3351dc<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideSupportModuleFactory(ProviderModule providerModule, C3351dc<RequestProvider> dcVar, C3351dc<UploadProvider> dcVar2, C3351dc<HelpCenterProvider> dcVar3, C3351dc<SupportSettingsProvider> dcVar4, C3351dc<RestServiceProvider> dcVar5, C3351dc<SupportBlipsProvider> dcVar6, C3351dc<ZendeskTracker> dcVar7, C3351dc<ArticleVoteStorage> dcVar8) {
        this.module = providerModule;
        this.requestProvider = dcVar;
        this.uploadProvider = dcVar2;
        this.helpCenterProvider = dcVar3;
        this.settingsProvider = dcVar4;
        this.restServiceProvider = dcVar5;
        this.blipsProvider = dcVar6;
        this.zendeskTrackerProvider = dcVar7;
        this.articleVoteStorageProvider = dcVar8;
    }

    public final SupportModule get() {
        SupportModule provideSupportModule = this.module.provideSupportModule(this.requestProvider.get(), this.uploadProvider.get(), this.helpCenterProvider.get(), this.settingsProvider.get(), this.restServiceProvider.get(), this.blipsProvider.get(), this.zendeskTrackerProvider.get(), this.articleVoteStorageProvider.get());
        if (provideSupportModule != null) {
            return provideSupportModule;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SupportModule> create(ProviderModule providerModule, C3351dc<RequestProvider> dcVar, C3351dc<UploadProvider> dcVar2, C3351dc<HelpCenterProvider> dcVar3, C3351dc<SupportSettingsProvider> dcVar4, C3351dc<RestServiceProvider> dcVar5, C3351dc<SupportBlipsProvider> dcVar6, C3351dc<ZendeskTracker> dcVar7, C3351dc<ArticleVoteStorage> dcVar8) {
        return new ProviderModule_ProvideSupportModuleFactory(providerModule, dcVar, dcVar2, dcVar3, dcVar4, dcVar5, dcVar6, dcVar7, dcVar8);
    }
}
