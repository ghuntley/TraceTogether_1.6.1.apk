package zendesk.support;

public final class DeepLinkingBroadcastReceiver_MembersInjector {
    public static void injectDeepLinkHelper(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver, ZendeskDeepLinkHelper zendeskDeepLinkHelper) {
        deepLinkingBroadcastReceiver.deepLinkHelper = zendeskDeepLinkHelper;
    }
}
