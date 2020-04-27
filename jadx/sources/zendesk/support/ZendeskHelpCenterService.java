package zendesk.support;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o.D;
import o.F;
import o.G;
import o.I;
import o.O;

class ZendeskHelpCenterService {
    private final HelpCenterService helpCenterService;
    private final HelpCenterLocaleConverter localeConverter;

    ZendeskHelpCenterService(HelpCenterService helpCenterService2, HelpCenterLocaleConverter helpCenterLocaleConverter) {
        this.helpCenterService = helpCenterService2;
        this.localeConverter = helpCenterLocaleConverter;
    }

    /* access modifiers changed from: package-private */
    public void getHelp(Locale locale, String str, String str2, String str3, int i, String str4, G<HelpResponse> g) {
        Locale locale2 = locale;
        this.helpCenterService.getHelp(this.localeConverter.toHelpCenterLocaleString(locale), str, str2, str3, i, str4, 1000, SortBy.CREATED_AT.getApiValue(), SortOrder.DESCENDING.getApiValue()).m3316(new I(g));
    }

    /* access modifiers changed from: package-private */
    public void getArticlesForSection(Long l, Locale locale, String str, String str2, G<List<Article>> g) {
        this.helpCenterService.getArticles(this.localeConverter.toHelpCenterLocaleString(locale), l, str2, str, 1000).m3316(new I(g, new I.Cif<ArticlesListResponse, List<Article>>() {
            public List<Article> extract(ArticlesListResponse articlesListResponse) {
                return ZendeskHelpCenterService.this.matchArticlesWithUsers(articlesListResponse.getUsers(), articlesListResponse.getArticles());
            }
        }));
    }

    /* access modifiers changed from: package-private */
    public List<Article> matchArticlesWithUsers(List<User> list, List<Article> list2) {
        HashMap hashMap = new HashMap();
        for (User next : list) {
            hashMap.put(next.getId(), next);
        }
        ArrayList arrayList = new ArrayList();
        for (Article next2 : list2) {
            User user = (User) hashMap.get(next2.getAuthorId());
            if (user != null) {
                next2.setAuthor(user);
            }
            arrayList.add(next2);
        }
        return arrayList;
    }

    public void searchArticles(String str, Locale locale, String str2, String str3, String str4, String str5, Integer num, Integer num2, G<ArticlesSearchResponse> g) {
        Locale locale2 = locale;
        this.helpCenterService.searchArticles(str, this.localeConverter.toHelpCenterLocaleString(locale), str2, str3, str4, str5, num, num2).m3316(new I(g));
    }

    public void getArticle(Long l, Locale locale, String str, G<Article> g) {
        this.helpCenterService.getArticle(this.localeConverter.toHelpCenterLocaleString(locale), l, str).m3316(new I(g, new I.Cif<ArticleResponse, Article>() {
            public Article extract(ArticleResponse articleResponse) {
                return ZendeskHelpCenterService.this.matchArticleWithUsers(articleResponse.getArticle(), O.m1403(articleResponse.getUsers()));
            }
        }));
    }

    /* access modifiers changed from: package-private */
    public Article matchArticleWithUsers(Article article, List<User> list) {
        if (article == null) {
            return new Article();
        }
        Iterator<User> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            User next = it.next();
            if (next.getId() != null && next.getId().equals(article.getAuthorId())) {
                article.setAuthor(next);
                break;
            }
        }
        return article;
    }

    public void getAttachments(Locale locale, Long l, AttachmentType attachmentType, G<List<HelpCenterAttachment>> g) {
        if (attachmentType == null) {
            F.m1358();
            if (g != null) {
                g.onError(new D("getAttachments() was called with null attachment type"));
                return;
            }
            return;
        }
        this.helpCenterService.getAttachments(this.localeConverter.toHelpCenterLocaleString(locale), l, attachmentType.getAttachmentType()).m3316(new I(g, new I.Cif<AttachmentResponse, List<HelpCenterAttachment>>() {
            public List<HelpCenterAttachment> extract(AttachmentResponse attachmentResponse) {
                return attachmentResponse.getArticleAttachments();
            }
        }));
    }

    public void upvoteArticle(Long l, String str, G<ArticleVoteResponse> g) {
        if (l == null) {
            F.m1358();
            if (g != null) {
                g.onError(new D("The article id was null, can not create up vote"));
                return;
            }
            return;
        }
        this.helpCenterService.upvoteArticle(l, str).m3316(new I(g));
    }

    public void downvoteArticle(Long l, String str, G<ArticleVoteResponse> g) {
        if (l == null) {
            F.m1358();
            if (g != null) {
                g.onError(new D("The article id was null, can not create down vote"));
                return;
            }
            return;
        }
        this.helpCenterService.downvoteArticle(l, str).m3316(new I(g));
    }

    public void deleteVote(Long l, G<Void> g) {
        if (l == null) {
            F.m1358();
            if (g != null) {
                g.onError(new D("The vote id was null, can not delete the vote"));
                return;
            }
            return;
        }
        this.helpCenterService.deleteVote(l).m3316(new I(g));
    }

    public void submitRecordArticleView(Long l, Locale locale, RecordArticleViewRequest recordArticleViewRequest, G<Void> g) {
        this.helpCenterService.submitRecordArticleView(l, this.localeConverter.toHelpCenterLocaleString(locale), recordArticleViewRequest).m3316(new I(g));
    }
}
