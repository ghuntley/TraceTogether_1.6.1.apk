package zendesk.support.request;

import o.C3616p;
import o.nu;

public final class RequestViewConversationsDisabled_MembersInjector {
    public static void injectStore(RequestViewConversationsDisabled requestViewConversationsDisabled, nu nuVar) {
        requestViewConversationsDisabled.store = nuVar;
    }

    public static void injectAf(RequestViewConversationsDisabled requestViewConversationsDisabled, Object obj) {
        requestViewConversationsDisabled.af = (ActionFactory) obj;
    }

    public static void injectPicasso(RequestViewConversationsDisabled requestViewConversationsDisabled, C3616p pVar) {
        requestViewConversationsDisabled.picasso = pVar;
    }
}
