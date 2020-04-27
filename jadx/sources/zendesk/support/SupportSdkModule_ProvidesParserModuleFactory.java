package zendesk.support;

import java.util.List;
import o.M;
import zendesk.support.ZendeskDeepLinkParser;

public final class SupportSdkModule_ProvidesParserModuleFactory implements M<List<ZendeskDeepLinkParser.Module>> {
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesParserModuleFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public final List<ZendeskDeepLinkParser.Module> get() {
        List<ZendeskDeepLinkParser.Module> providesParserModule = this.module.providesParserModule();
        if (providesParserModule != null) {
            return providesParserModule;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<List<ZendeskDeepLinkParser.Module>> create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ProvidesParserModuleFactory(supportSdkModule);
    }
}
