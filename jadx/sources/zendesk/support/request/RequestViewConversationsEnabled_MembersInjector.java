package zendesk.support.request;

import o.C3616p;
import o.nu;

public final class RequestViewConversationsEnabled_MembersInjector {
    public static void injectStore(RequestViewConversationsEnabled requestViewConversationsEnabled, nu nuVar) {
        requestViewConversationsEnabled.store = nuVar;
    }

    public static void injectAf(RequestViewConversationsEnabled requestViewConversationsEnabled, Object obj) {
        requestViewConversationsEnabled.af = (ActionFactory) obj;
    }

    public static void injectCellFactory(RequestViewConversationsEnabled requestViewConversationsEnabled, Object obj) {
        requestViewConversationsEnabled.cellFactory = (CellFactory) obj;
    }

    public static void injectPicasso(RequestViewConversationsEnabled requestViewConversationsEnabled, C3616p pVar) {
        requestViewConversationsEnabled.picasso = pVar;
    }
}
