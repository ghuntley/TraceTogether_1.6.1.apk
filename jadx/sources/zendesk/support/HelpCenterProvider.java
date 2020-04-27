package zendesk.support;

import java.util.List;
import java.util.Locale;
import o.G;

public interface HelpCenterProvider {
    void deleteVote(Long l, G<Void> g);

    void downvoteArticle(Long l, G<ArticleVote> g);

    void getArticle(Long l, G<Article> g);

    void getArticles(Long l, String str, G<List<Article>> g);

    void getAttachments(Long l, AttachmentType attachmentType, G<List<HelpCenterAttachment>> g);

    void getHelp(HelpRequest helpRequest, G<List<HelpItem>> g);

    void searchArticles(HelpCenterSearch helpCenterSearch, G<List<SearchArticle>> g);

    void submitRecordArticleView(Article article, Locale locale, G<Void> g);

    void upvoteArticle(Long l, G<ArticleVote> g);
}
