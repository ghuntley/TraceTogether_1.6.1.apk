package zendesk.support;

import o.C3351dc;
import o.M;
import zendesk.core.AuthenticationProvider;

public final class ProviderModule_ProvideRequestProviderFactory implements M<RequestProvider> {
    private final C3351dc<AuthenticationProvider> authenticationProvider;
    private final C3351dc<SupportBlipsProvider> blipsProvider;
    private final ProviderModule module;
    private final C3351dc<ZendeskRequestService> requestServiceProvider;
    private final C3351dc<RequestSessionCache> requestSessionCacheProvider;
    private final C3351dc<RequestStorage> requestStorageProvider;
    private final C3351dc<SupportSettingsProvider> settingsProvider;
    private final C3351dc<SupportSdkMetadata> supportSdkMetadataProvider;
    private final C3351dc<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideRequestProviderFactory(ProviderModule providerModule, C3351dc<SupportSettingsProvider> dcVar, C3351dc<AuthenticationProvider> dcVar2, C3351dc<ZendeskRequestService> dcVar3, C3351dc<RequestStorage> dcVar4, C3351dc<RequestSessionCache> dcVar5, C3351dc<ZendeskTracker> dcVar6, C3351dc<SupportSdkMetadata> dcVar7, C3351dc<SupportBlipsProvider> dcVar8) {
        this.module = providerModule;
        this.settingsProvider = dcVar;
        this.authenticationProvider = dcVar2;
        this.requestServiceProvider = dcVar3;
        this.requestStorageProvider = dcVar4;
        this.requestSessionCacheProvider = dcVar5;
        this.zendeskTrackerProvider = dcVar6;
        this.supportSdkMetadataProvider = dcVar7;
        this.blipsProvider = dcVar8;
    }

    public final RequestProvider get() {
        RequestProvider provideRequestProvider = this.module.provideRequestProvider(this.settingsProvider.get(), this.authenticationProvider.get(), this.requestServiceProvider.get(), this.requestStorageProvider.get(), this.requestSessionCacheProvider.get(), this.zendeskTrackerProvider.get(), this.supportSdkMetadataProvider.get(), this.blipsProvider.get());
        if (provideRequestProvider != null) {
            return provideRequestProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<RequestProvider> create(ProviderModule providerModule, C3351dc<SupportSettingsProvider> dcVar, C3351dc<AuthenticationProvider> dcVar2, C3351dc<ZendeskRequestService> dcVar3, C3351dc<RequestStorage> dcVar4, C3351dc<RequestSessionCache> dcVar5, C3351dc<ZendeskTracker> dcVar6, C3351dc<SupportSdkMetadata> dcVar7, C3351dc<SupportBlipsProvider> dcVar8) {
        return new ProviderModule_ProvideRequestProviderFactory(providerModule, dcVar, dcVar2, dcVar3, dcVar4, dcVar5, dcVar6, dcVar7, dcVar8);
    }
}
