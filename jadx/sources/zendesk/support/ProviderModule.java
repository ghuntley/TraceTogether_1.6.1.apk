package zendesk.support;

import java.util.Locale;
import o.C3356di;
import zendesk.core.AuthenticationProvider;
import zendesk.core.BlipsProvider;
import zendesk.core.RestServiceProvider;
import zendesk.core.SettingsProvider;

class ProviderModule {
    ProviderModule() {
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public SupportSettingsProvider provideSdkSettingsProvider(SettingsProvider settingsProvider, Locale locale, HelpCenterLocaleConverter helpCenterLocaleConverter) {
        return new ZendeskSupportSettingsProvider(settingsProvider, helpCenterLocaleConverter, locale);
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public HelpCenterLocaleConverter provideHelpCenterLocaleConverter() {
        return new HelpCenterLocaleConverter();
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public HelpCenterProvider provideHelpCenterProvider(SupportSettingsProvider supportSettingsProvider, SupportBlipsProvider supportBlipsProvider, ZendeskHelpCenterService zendeskHelpCenterService, HelpCenterSessionCache helpCenterSessionCache, ZendeskTracker zendeskTracker) {
        return new ZendeskHelpCenterProvider(supportSettingsProvider, supportBlipsProvider, zendeskHelpCenterService, helpCenterSessionCache, zendeskTracker);
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public UploadProvider provideUploadProvider(ZendeskUploadService zendeskUploadService) {
        return new ZendeskUploadProvider(zendeskUploadService);
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public RequestProvider provideRequestProvider(SupportSettingsProvider supportSettingsProvider, AuthenticationProvider authenticationProvider, ZendeskRequestService zendeskRequestService, RequestStorage requestStorage, RequestSessionCache requestSessionCache, ZendeskTracker zendeskTracker, SupportSdkMetadata supportSdkMetadata, SupportBlipsProvider supportBlipsProvider) {
        return new ZendeskRequestProvider(supportSettingsProvider, zendeskRequestService, authenticationProvider, requestStorage, requestSessionCache, zendeskTracker, supportSdkMetadata, supportBlipsProvider);
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public SupportBlipsProvider provideSupportBlipsProvider(BlipsProvider blipsProvider, Locale locale) {
        return new ZendeskSupportBlipsProvider(blipsProvider, locale);
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public ProviderStore provideProviderStore(HelpCenterProvider helpCenterProvider, RequestProvider requestProvider, UploadProvider uploadProvider) {
        return new ZendeskProviderStore(helpCenterProvider, requestProvider, uploadProvider);
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public SupportModule provideSupportModule(RequestProvider requestProvider, UploadProvider uploadProvider, HelpCenterProvider helpCenterProvider, SupportSettingsProvider supportSettingsProvider, RestServiceProvider restServiceProvider, SupportBlipsProvider supportBlipsProvider, ZendeskTracker zendeskTracker, ArticleVoteStorage articleVoteStorage) {
        return new SupportModule(requestProvider, uploadProvider, helpCenterProvider, supportSettingsProvider, supportBlipsProvider, restServiceProvider.getMediaOkHttpClient(), zendeskTracker, articleVoteStorage);
    }
}
