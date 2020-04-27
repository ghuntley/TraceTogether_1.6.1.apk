package zendesk.support;

import java.util.List;
import o.M;
import zendesk.core.ActionHandler;

public final class SupportSdkModule_ProvidesActionHandlersFactory implements M<List<ActionHandler>> {
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesActionHandlersFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public final List<ActionHandler> get() {
        List<ActionHandler> providesActionHandlers = this.module.providesActionHandlers();
        if (providesActionHandlers != null) {
            return providesActionHandlers;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<List<ActionHandler>> create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ProvidesActionHandlersFactory(supportSdkModule);
    }
}
