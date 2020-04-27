package zendesk.support;

import o.C3351dc;
import o.M;
import zendesk.core.ApplicationConfiguration;

public final class SupportSdkModule_ProvidesZendeskUrlFactory implements M<String> {
    private final C3351dc<ApplicationConfiguration> applicationConfigurationProvider;
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesZendeskUrlFactory(SupportSdkModule supportSdkModule, C3351dc<ApplicationConfiguration> dcVar) {
        this.module = supportSdkModule;
        this.applicationConfigurationProvider = dcVar;
    }

    public final String get() {
        String providesZendeskUrl = this.module.providesZendeskUrl(this.applicationConfigurationProvider.get());
        if (providesZendeskUrl != null) {
            return providesZendeskUrl;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<String> create(SupportSdkModule supportSdkModule, C3351dc<ApplicationConfiguration> dcVar) {
        return new SupportSdkModule_ProvidesZendeskUrlFactory(supportSdkModule, dcVar);
    }
}
