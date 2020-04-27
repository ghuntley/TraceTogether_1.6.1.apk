package zendesk.support;

import java.util.UUID;
import okhttp3.OkHttpClient;

public class SupportModule {
    private final ArticleVoteStorage articleVoteStorage;
    private final SupportBlipsProvider blipsProvider;
    private final HelpCenterProvider helpCenterProvider;
    private final UUID id = UUID.randomUUID();
    private final OkHttpClient okHttpClient;
    private final RequestProvider requestProvider;
    private final SupportSettingsProvider settingsProvider;
    private final UploadProvider uploadProvider;
    private final ZendeskTracker zendeskTracker;

    public SupportModule(RequestProvider requestProvider2, UploadProvider uploadProvider2, HelpCenterProvider helpCenterProvider2, SupportSettingsProvider supportSettingsProvider, SupportBlipsProvider supportBlipsProvider, OkHttpClient okHttpClient2, ZendeskTracker zendeskTracker2, ArticleVoteStorage articleVoteStorage2) {
        this.requestProvider = requestProvider2;
        this.uploadProvider = uploadProvider2;
        this.helpCenterProvider = helpCenterProvider2;
        this.settingsProvider = supportSettingsProvider;
        this.blipsProvider = supportBlipsProvider;
        this.okHttpClient = okHttpClient2;
        this.zendeskTracker = zendeskTracker2;
        this.articleVoteStorage = articleVoteStorage2;
    }

    /* access modifiers changed from: package-private */
    public RequestProvider providesRequestProvider() {
        return this.requestProvider;
    }

    /* access modifiers changed from: package-private */
    public UploadProvider providesUploadProvider() {
        return this.uploadProvider;
    }

    /* access modifiers changed from: package-private */
    public HelpCenterProvider providesHelpCenterProvider() {
        return this.helpCenterProvider;
    }

    /* access modifiers changed from: package-private */
    public SupportSettingsProvider providesSettingsProvider() {
        return this.settingsProvider;
    }

    /* access modifiers changed from: package-private */
    public OkHttpClient providesOkHttpClient() {
        return this.okHttpClient;
    }

    /* access modifiers changed from: package-private */
    public ZendeskTracker providesZendeskTracker() {
        return this.zendeskTracker;
    }

    /* access modifiers changed from: package-private */
    public ArticleVoteStorage providesArticleVoteStorage() {
        return this.articleVoteStorage;
    }

    /* access modifiers changed from: package-private */
    public SupportBlipsProvider providesBlipsProvider() {
        return this.blipsProvider;
    }

    public UUID getId() {
        return this.id;
    }
}
