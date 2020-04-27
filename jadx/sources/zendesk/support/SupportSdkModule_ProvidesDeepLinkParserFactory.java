package zendesk.support;

import java.util.List;
import o.C3351dc;
import o.M;
import zendesk.support.ZendeskDeepLinkParser;

public final class SupportSdkModule_ProvidesDeepLinkParserFactory implements M<ZendeskDeepLinkParser> {
    private final SupportSdkModule module;
    private final C3351dc<List<ZendeskDeepLinkParser.Module>> parserModulesProvider;
    private final C3351dc<String> zendeskUrlProvider;

    public SupportSdkModule_ProvidesDeepLinkParserFactory(SupportSdkModule supportSdkModule, C3351dc<String> dcVar, C3351dc<List<ZendeskDeepLinkParser.Module>> dcVar2) {
        this.module = supportSdkModule;
        this.zendeskUrlProvider = dcVar;
        this.parserModulesProvider = dcVar2;
    }

    public final ZendeskDeepLinkParser get() {
        ZendeskDeepLinkParser providesDeepLinkParser = this.module.providesDeepLinkParser(this.zendeskUrlProvider.get(), this.parserModulesProvider.get());
        if (providesDeepLinkParser != null) {
            return providesDeepLinkParser;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ZendeskDeepLinkParser> create(SupportSdkModule supportSdkModule, C3351dc<String> dcVar, C3351dc<List<ZendeskDeepLinkParser.Module>> dcVar2) {
        return new SupportSdkModule_ProvidesDeepLinkParserFactory(supportSdkModule, dcVar, dcVar2);
    }
}
