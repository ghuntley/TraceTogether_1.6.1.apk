package zendesk.support;

import java.util.HashMap;
import java.util.Map;
import zendesk.core.BaseStorage;

class ZendeskArticleVoteStorage implements ArticleVoteStorage {
    private final BaseStorage baseStorage;

    ZendeskArticleVoteStorage(BaseStorage baseStorage2) {
        this.baseStorage = baseStorage2;
    }

    public void storeArticleVote(Long l, ArticleVote articleVote) {
        Map storedArticleVotes = getStoredArticleVotes();
        if (storedArticleVotes == null) {
            storedArticleVotes = new HashMap();
        }
        if (articleVote != null) {
            storedArticleVotes.put(l, articleVote);
            storeArticleVoteHolder(storedArticleVotes);
        }
    }

    public ArticleVote getStoredArticleVote(Long l) {
        Map<Long, ArticleVote> storedArticleVotes = getStoredArticleVotes();
        if (storedArticleVotes == null || !storedArticleVotes.containsKey(l)) {
            return null;
        }
        return storedArticleVotes.get(l);
    }

    public void removeStoredArticleVote(Long l) {
        Map<Long, ArticleVote> storedArticleVotes;
        if (l != null && (storedArticleVotes = getStoredArticleVotes()) != null && storedArticleVotes.containsKey(l)) {
            storedArticleVotes.remove(l);
            storeArticleVoteHolder(storedArticleVotes);
        }
    }

    private Map<Long, ArticleVote> getStoredArticleVotes() {
        ArticleVoteMapWrapper articleVoteMapWrapper = (ArticleVoteMapWrapper) this.baseStorage.get("help_center_stored_article_votes", ArticleVoteMapWrapper.class);
        if (articleVoteMapWrapper != null) {
            return articleVoteMapWrapper.map;
        }
        return null;
    }

    private void storeArticleVoteHolder(Map<Long, ArticleVote> map) {
        ArticleVoteMapWrapper articleVoteMapWrapper = new ArticleVoteMapWrapper();
        articleVoteMapWrapper.map = map;
        this.baseStorage.put("help_center_stored_article_votes", (Object) articleVoteMapWrapper);
    }

    static class ArticleVoteMapWrapper {
        Map<Long, ArticleVote> map;

        ArticleVoteMapWrapper() {
        }
    }
}
