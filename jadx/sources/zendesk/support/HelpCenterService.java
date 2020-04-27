package zendesk.support;

import o.C3552ku;
import o.C3562lb;
import o.C3565le;
import o.kJ;
import o.kK;
import o.kP;
import o.kY;

interface HelpCenterService {
    @kK(m3242 = "/api/v2/help_center/votes/{vote_id}.json")
    C3552ku<Void> deleteVote(@C3565le(m3556 = "vote_id") Long l);

    @kY(m3255 = "/api/v2/help_center/articles/{article_id}/down.json")
    C3552ku<ArticleVoteResponse> downvoteArticle(@C3565le(m3556 = "article_id") Long l, @kJ String str);

    @kP(m3248 = "/api/v2/help_center/{locale}/articles/{article_id}.json?respect_sanitization_settings=true")
    C3552ku<ArticleResponse> getArticle(@C3565le(m3556 = "locale") String str, @C3565le(m3556 = "article_id") Long l, @C3562lb(m3552 = "include") String str2);

    @kP(m3248 = "/api/v2/help_center/{locale}/sections/{id}/articles.json?respect_sanitization_settings=true")
    C3552ku<ArticlesListResponse> getArticles(@C3565le(m3556 = "locale") String str, @C3565le(m3556 = "id") Long l, @C3562lb(m3552 = "label_names") String str2, @C3562lb(m3552 = "include") String str3, @C3562lb(m3552 = "per_page") int i);

    @kP(m3248 = "/api/v2/help_center/{locale}/articles/{article_id}/attachments/{attachment_type}.json")
    C3552ku<AttachmentResponse> getAttachments(@C3565le(m3556 = "locale") String str, @C3565le(m3556 = "article_id") Long l, @C3565le(m3556 = "attachment_type") String str2);

    @kP(m3248 = "/hc/api/mobile/{locale}/article_tree.json")
    C3552ku<HelpResponse> getHelp(@C3565le(m3556 = "locale") String str, @C3562lb(m3552 = "category_ids") String str2, @C3562lb(m3552 = "section_ids") String str3, @C3562lb(m3552 = "include") String str4, @C3562lb(m3552 = "limit") int i, @C3562lb(m3552 = "article_labels") String str5, @C3562lb(m3552 = "per_page") int i2, @C3562lb(m3552 = "sort_by") String str6, @C3562lb(m3552 = "sort_order") String str7);

    @kP(m3248 = "/api/v2/help_center/articles/search.json?respect_sanitization_settings=true&origin=mobile_sdk")
    C3552ku<ArticlesSearchResponse> searchArticles(@C3562lb(m3552 = "query") String str, @C3562lb(m3552 = "locale") String str2, @C3562lb(m3552 = "include") String str3, @C3562lb(m3552 = "label_names") String str4, @C3562lb(m3552 = "category") String str5, @C3562lb(m3552 = "section") String str6, @C3562lb(m3552 = "page") Integer num, @C3562lb(m3552 = "per_page") Integer num2);

    @kY(m3255 = "/api/v2/help_center/{locale}/articles/{article_id}/stats/view.json")
    C3552ku<Void> submitRecordArticleView(@C3565le(m3556 = "article_id") Long l, @C3565le(m3556 = "locale") String str, @kJ RecordArticleViewRequest recordArticleViewRequest);

    @kY(m3255 = "/api/v2/help_center/articles/{article_id}/up.json")
    C3552ku<ArticleVoteResponse> upvoteArticle(@C3565le(m3556 = "article_id") Long l, @kJ String str);
}
