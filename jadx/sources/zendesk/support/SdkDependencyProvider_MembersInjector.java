package zendesk.support;

import java.util.List;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;

public final class SdkDependencyProvider_MembersInjector {
    public static void injectRegistry(SdkDependencyProvider sdkDependencyProvider, ActionHandlerRegistry actionHandlerRegistry) {
        sdkDependencyProvider.registry = actionHandlerRegistry;
    }

    public static void injectActionHandlers(SdkDependencyProvider sdkDependencyProvider, List<ActionHandler> list) {
        sdkDependencyProvider.actionHandlers = list;
    }
}
