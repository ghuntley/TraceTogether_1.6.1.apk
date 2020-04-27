package zendesk.support;

import o.C3351dc;
import o.M;
import zendesk.core.SessionStorage;

public final class StorageModule_ProvideArticleVoteStorageFactory implements M<ArticleVoteStorage> {
    private final C3351dc<SessionStorage> baseStorageProvider;
    private final StorageModule module;

    public StorageModule_ProvideArticleVoteStorageFactory(StorageModule storageModule, C3351dc<SessionStorage> dcVar) {
        this.module = storageModule;
        this.baseStorageProvider = dcVar;
    }

    public final ArticleVoteStorage get() {
        ArticleVoteStorage provideArticleVoteStorage = this.module.provideArticleVoteStorage(this.baseStorageProvider.get());
        if (provideArticleVoteStorage != null) {
            return provideArticleVoteStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ArticleVoteStorage> create(StorageModule storageModule, C3351dc<SessionStorage> dcVar) {
        return new StorageModule_ProvideArticleVoteStorageFactory(storageModule, dcVar);
    }
}
