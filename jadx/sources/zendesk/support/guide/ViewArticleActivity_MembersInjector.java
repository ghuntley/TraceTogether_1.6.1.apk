package zendesk.support.guide;

import okhttp3.OkHttpClient;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.ZendeskDeepLinkHelper;

public final class ViewArticleActivity_MembersInjector {
    public static void injectOkHttpClient(ViewArticleActivity viewArticleActivity, OkHttpClient okHttpClient) {
        viewArticleActivity.okHttpClient = okHttpClient;
    }

    public static void injectApplicationConfiguration(ViewArticleActivity viewArticleActivity, ApplicationConfiguration applicationConfiguration) {
        viewArticleActivity.applicationConfiguration = applicationConfiguration;
    }

    public static void injectHelpCenterProvider(ViewArticleActivity viewArticleActivity, HelpCenterProvider helpCenterProvider) {
        viewArticleActivity.helpCenterProvider = helpCenterProvider;
    }

    public static void injectArticleVoteStorage(ViewArticleActivity viewArticleActivity, ArticleVoteStorage articleVoteStorage) {
        viewArticleActivity.articleVoteStorage = articleVoteStorage;
    }

    public static void injectDeepLinkHelper(ViewArticleActivity viewArticleActivity, ZendeskDeepLinkHelper zendeskDeepLinkHelper) {
        viewArticleActivity.deepLinkHelper = zendeskDeepLinkHelper;
    }

    public static void injectNetworkInfoProvider(ViewArticleActivity viewArticleActivity, NetworkInfoProvider networkInfoProvider) {
        viewArticleActivity.networkInfoProvider = networkInfoProvider;
    }

    public static void injectSupportSettingsProvider(ViewArticleActivity viewArticleActivity, SupportSettingsProvider supportSettingsProvider) {
        viewArticleActivity.supportSettingsProvider = supportSettingsProvider;
    }
}
