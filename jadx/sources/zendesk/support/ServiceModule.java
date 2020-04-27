package zendesk.support;

import o.C3356di;
import zendesk.core.RestServiceProvider;

class ServiceModule {
    ServiceModule() {
    }

    @C3356di
    static ZendeskHelpCenterService provideZendeskHelpCenterService(HelpCenterService helpCenterService, HelpCenterLocaleConverter helpCenterLocaleConverter) {
        return new ZendeskHelpCenterService(helpCenterService, helpCenterLocaleConverter);
    }

    @C3356di
    static ZendeskRequestService provideZendeskRequestService(RequestService requestService) {
        return new ZendeskRequestService(requestService);
    }

    @C3356di
    static ZendeskUploadService provideZendeskUploadService(UploadService uploadService) {
        return new ZendeskUploadService(uploadService);
    }

    @C3356di
    static HelpCenterService providesHelpCenterService(RestServiceProvider restServiceProvider, HelpCenterCachingNetworkConfig helpCenterCachingNetworkConfig) {
        return (HelpCenterService) restServiceProvider.createRestService(HelpCenterService.class, "2.2.1", "Support", helpCenterCachingNetworkConfig);
    }

    @C3356di
    static RequestService providesRequestService(RestServiceProvider restServiceProvider) {
        return (RequestService) restServiceProvider.createRestService(RequestService.class, "2.2.1", "Support");
    }

    @C3356di
    static UploadService providesUploadService(RestServiceProvider restServiceProvider) {
        return (UploadService) restServiceProvider.createRestService(UploadService.class, "2.2.1", "Support");
    }

    static HelpCenterCachingNetworkConfig provideCustomNetworkConfig(HelpCenterCachingInterceptor helpCenterCachingInterceptor) {
        return new HelpCenterCachingNetworkConfig(helpCenterCachingInterceptor);
    }

    static HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor() {
        return new HelpCenterCachingInterceptor();
    }
}
