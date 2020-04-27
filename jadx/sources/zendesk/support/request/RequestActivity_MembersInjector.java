package zendesk.support.request;

import o.C3616p;
import o.nu;
import zendesk.core.ActionHandlerRegistry;

public final class RequestActivity_MembersInjector {
    public static void injectStore(RequestActivity requestActivity, nu nuVar) {
        requestActivity.store = nuVar;
    }

    public static void injectAf(RequestActivity requestActivity, Object obj) {
        requestActivity.af = (ActionFactory) obj;
    }

    public static void injectHeadlessComponentListener(RequestActivity requestActivity, Object obj) {
        requestActivity.headlessComponentListener = (HeadlessComponentListener) obj;
    }

    public static void injectPicasso(RequestActivity requestActivity, C3616p pVar) {
        requestActivity.picasso = pVar;
    }

    public static void injectActionHandlerRegistry(RequestActivity requestActivity, ActionHandlerRegistry actionHandlerRegistry) {
        requestActivity.actionHandlerRegistry = actionHandlerRegistry;
    }
}
