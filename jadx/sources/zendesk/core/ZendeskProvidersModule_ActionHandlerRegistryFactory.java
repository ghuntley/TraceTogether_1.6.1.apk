package zendesk.core;

import o.M;

public final class ZendeskProvidersModule_ActionHandlerRegistryFactory implements M<ActionHandlerRegistry> {
    private static final ZendeskProvidersModule_ActionHandlerRegistryFactory INSTANCE = new ZendeskProvidersModule_ActionHandlerRegistryFactory();

    public final ActionHandlerRegistry get() {
        ActionHandlerRegistry actionHandlerRegistry = ZendeskProvidersModule.actionHandlerRegistry();
        if (actionHandlerRegistry != null) {
            return actionHandlerRegistry;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ActionHandlerRegistry> create() {
        return INSTANCE;
    }
}
