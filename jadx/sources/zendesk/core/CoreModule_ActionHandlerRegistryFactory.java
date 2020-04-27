package zendesk.core;

import o.M;

public final class CoreModule_ActionHandlerRegistryFactory implements M<ActionHandlerRegistry> {
    private final CoreModule module;

    public CoreModule_ActionHandlerRegistryFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public final ActionHandlerRegistry get() {
        ActionHandlerRegistry actionHandlerRegistry = this.module.actionHandlerRegistry();
        if (actionHandlerRegistry != null) {
            return actionHandlerRegistry;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ActionHandlerRegistry> create(CoreModule coreModule) {
        return new CoreModule_ActionHandlerRegistryFactory(coreModule);
    }

    public static ActionHandlerRegistry proxyActionHandlerRegistry(CoreModule coreModule) {
        return coreModule.actionHandlerRegistry();
    }
}
