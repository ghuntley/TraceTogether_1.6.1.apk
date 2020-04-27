package zendesk.support;

import o.C3351dc;
import o.M;

public final class ServiceModule_ProvideZendeskHelpCenterServiceFactory implements M<ZendeskHelpCenterService> {
    private final C3351dc<HelpCenterService> helpCenterServiceProvider;
    private final C3351dc<HelpCenterLocaleConverter> localeConverterProvider;

    public ServiceModule_ProvideZendeskHelpCenterServiceFactory(C3351dc<HelpCenterService> dcVar, C3351dc<HelpCenterLocaleConverter> dcVar2) {
        this.helpCenterServiceProvider = dcVar;
        this.localeConverterProvider = dcVar2;
    }

    public final ZendeskHelpCenterService get() {
        ZendeskHelpCenterService provideZendeskHelpCenterService = ServiceModule.provideZendeskHelpCenterService(this.helpCenterServiceProvider.get(), this.localeConverterProvider.get());
        if (provideZendeskHelpCenterService != null) {
            return provideZendeskHelpCenterService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskHelpCenterService> create(C3351dc<HelpCenterService> dcVar, C3351dc<HelpCenterLocaleConverter> dcVar2) {
        return new ServiceModule_ProvideZendeskHelpCenterServiceFactory(dcVar, dcVar2);
    }
}
