package zendesk.support;

import o.C3351dc;
import o.M;
import zendesk.core.ActionHandlerRegistry;

public final class SupportSdkModule_ProvidesDeepLinkHelperFactory implements M<ZendeskDeepLinkHelper> {
    private final SupportSdkModule module;
    private final C3351dc<ZendeskDeepLinkParser> parserProvider;
    private final C3351dc<ActionHandlerRegistry> registryProvider;

    public SupportSdkModule_ProvidesDeepLinkHelperFactory(SupportSdkModule supportSdkModule, C3351dc<ActionHandlerRegistry> dcVar, C3351dc<ZendeskDeepLinkParser> dcVar2) {
        this.module = supportSdkModule;
        this.registryProvider = dcVar;
        this.parserProvider = dcVar2;
    }

    public final ZendeskDeepLinkHelper get() {
        ZendeskDeepLinkHelper providesDeepLinkHelper = this.module.providesDeepLinkHelper(this.registryProvider.get(), this.parserProvider.get());
        if (providesDeepLinkHelper != null) {
            return providesDeepLinkHelper;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskDeepLinkHelper> create(SupportSdkModule supportSdkModule, C3351dc<ActionHandlerRegistry> dcVar, C3351dc<ZendeskDeepLinkParser> dcVar2) {
        return new SupportSdkModule_ProvidesDeepLinkHelperFactory(supportSdkModule, dcVar, dcVar2);
    }
}
