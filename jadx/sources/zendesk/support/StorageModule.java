package zendesk.support;

import android.content.Context;
import o.C3356di;
import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;

class StorageModule {
    StorageModule() {
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public RequestStorage provideRequestStorage(SessionStorage sessionStorage, RequestMigrator requestMigrator, MemoryCache memoryCache) {
        return new ZendeskRequestStorage(sessionStorage.getAdditionalSdkStorage(), requestMigrator, memoryCache);
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public HelpCenterSessionCache provideHelpCenterSessionCache() {
        return new ZendeskHelpCenterSessionCache();
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public RequestSessionCache provideRequestSessionCache() {
        return new ZendeskRequestSessionCache();
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public ArticleVoteStorage provideArticleVoteStorage(SessionStorage sessionStorage) {
        return new ZendeskArticleVoteStorage(sessionStorage.getAdditionalSdkStorage());
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public RequestMigrator provideRequestMigrator(Context context) {
        return new LegacyRequestMigrator(context.getSharedPreferences("zendesk-authorization", 0));
    }
}
