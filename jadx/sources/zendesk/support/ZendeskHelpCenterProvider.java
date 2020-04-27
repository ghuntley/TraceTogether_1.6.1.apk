package zendesk.support;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import o.C;
import o.D;
import o.F;
import o.G;
import o.L;
import o.O;
import o.P;

class ZendeskHelpCenterProvider implements HelpCenterProvider {
    /* access modifiers changed from: private */
    public final SupportBlipsProvider blipsProvider;
    /* access modifiers changed from: private */
    public final ZendeskHelpCenterService helpCenterService;
    /* access modifiers changed from: private */
    public final HelpCenterSessionCache helpCenterSessionCache;
    private final SupportSettingsProvider settingsProvider;
    /* access modifiers changed from: private */
    public final ZendeskTracker zendeskTracker;

    ZendeskHelpCenterProvider(SupportSettingsProvider supportSettingsProvider, SupportBlipsProvider supportBlipsProvider, ZendeskHelpCenterService zendeskHelpCenterService, HelpCenterSessionCache helpCenterSessionCache2, ZendeskTracker zendeskTracker2) {
        this.settingsProvider = supportSettingsProvider;
        this.blipsProvider = supportBlipsProvider;
        this.helpCenterService = zendeskHelpCenterService;
        this.helpCenterSessionCache = helpCenterSessionCache2;
        this.zendeskTracker = zendeskTracker2;
    }

    public void getHelp(final HelpRequest helpRequest, final G<List<HelpItem>> g) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(g, supportSdkSettings)) {
                    ZendeskHelpCenterProvider.this.helpCenterService.getHelp(ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), helpRequest.getCategoryIds(), helpRequest.getSectionIds(), helpRequest.getIncludes(), helpRequest.getArticlesPerPageLimit(), P.m1407(helpRequest.getLabelNames()), new ZendeskCallbackSuccess<HelpResponse>(g) {
                        public void onSuccess(HelpResponse helpResponse) {
                            ZendeskHelpCenterProvider.this.zendeskTracker.helpCenterLoaded();
                            if (g != null) {
                                g.onSuccess(ZendeskHelpCenterProvider.this.convert(helpResponse));
                            }
                        }
                    });
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public List<HelpItem> convert(HelpResponse helpResponse) {
        if (helpResponse == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (CategoryItem next : helpResponse.getCategories()) {
            arrayList.add(next);
            for (SectionItem next2 : next.getSections()) {
                arrayList.add(next2);
                arrayList.addAll(next2.getChildren());
            }
        }
        return arrayList;
    }

    public void getArticles(Long l, String str, G<List<Article>> g) {
        if (!sanityCheck(g, l)) {
            final G<List<Article>> g2 = g;
            final Long l2 = l;
            final String str2 = str;
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(g2, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getArticlesForSection(l2, ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), "users", str2, g2);
                    }
                }
            });
        }
    }

    public void searchArticles(final HelpCenterSearch helpCenterSearch, final G<List<SearchArticle>> g) {
        if (!sanityCheck(g, helpCenterSearch)) {
            this.blipsProvider.helpCenterSearch(helpCenterSearch.getQuery());
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    String str;
                    String str2;
                    Locale locale;
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(g, supportSdkSettings)) {
                        if (P.m1409(helpCenterSearch.getInclude())) {
                            str = P.m1407("categories", "sections", "users");
                        } else {
                            str = P.m1407(helpCenterSearch.getInclude());
                        }
                        String str3 = str;
                        if (P.m1409(helpCenterSearch.getLabelNames())) {
                            str2 = null;
                        } else {
                            str2 = P.m1407(helpCenterSearch.getLabelNames());
                        }
                        String str4 = str2;
                        if (helpCenterSearch.getLocale() == null) {
                            locale = ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings);
                        } else {
                            locale = helpCenterSearch.getLocale();
                        }
                        ZendeskHelpCenterProvider.this.helpCenterService.searchArticles(helpCenterSearch.getQuery(), locale, str3, str4, helpCenterSearch.getCategoryIds(), helpCenterSearch.getSectionIds(), helpCenterSearch.getPage(), helpCenterSearch.getPerPage(), new ZendeskCallbackSuccess<ArticlesSearchResponse>(g) {
                            public void onSuccess(ArticlesSearchResponse articlesSearchResponse) {
                                ZendeskHelpCenterProvider.this.zendeskTracker.helpCenterSearched(helpCenterSearch.getQuery());
                                ZendeskHelpCenterProvider.this.helpCenterSessionCache.setLastSearch(helpCenterSearch.getQuery(), (articlesSearchResponse == null || !O.m1394(articlesSearchResponse.getArticles())) ? 0 : articlesSearchResponse.getArticles().size());
                                List<SearchArticle> asSearchArticleList = ZendeskHelpCenterProvider.this.asSearchArticleList(articlesSearchResponse);
                                if (g != null) {
                                    g.onSuccess(asSearchArticleList);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void getArticle(final Long l, final G<Article> g) {
        if (!sanityCheck(g, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(g, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getArticle(l, ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), "users", new ZendeskCallbackSuccess<Article>(g) {
                            public void onSuccess(Article article) {
                                ZendeskHelpCenterProvider.this.submitRecordArticleView(article, L.m1387(article.getLocale()), new G<Void>() {
                                    public void onSuccess(Void voidR) {
                                    }

                                    public void onError(C c) {
                                        Object[] objArr = {c.m1280(), Boolean.valueOf(c.m1278()), Integer.valueOf(c.m1276())};
                                        F.m1358();
                                    }
                                });
                                if (g != null) {
                                    g.onSuccess(article);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void getAttachments(Long l, AttachmentType attachmentType, G<List<HelpCenterAttachment>> g) {
        if (!sanityCheck(g, l, attachmentType)) {
            final G<List<HelpCenterAttachment>> g2 = g;
            final Long l2 = l;
            final AttachmentType attachmentType2 = attachmentType;
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(g2, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.getAttachments(ZendeskHelpCenterProvider.this.getLocale(supportSdkSettings), l2, attachmentType2, g2);
                    }
                }
            });
        }
    }

    public void upvoteArticle(final Long l, final G<ArticleVote> g) {
        if (!sanityCheck(g, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(g, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.upvoteArticle(l, "{}", new ZendeskCallbackSuccess<ArticleVoteResponse>(g) {
                            public void onSuccess(ArticleVoteResponse articleVoteResponse) {
                                if (g != null) {
                                    g.onSuccess(articleVoteResponse.getVote());
                                }
                                ZendeskHelpCenterProvider.this.blipsProvider.articleVote(l, 1);
                            }
                        });
                    }
                }
            });
        }
    }

    public void downvoteArticle(final Long l, final G<ArticleVote> g) {
        if (!sanityCheck(g, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(g, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.downvoteArticle(l, "{}", new ZendeskCallbackSuccess<ArticleVoteResponse>(g) {
                            public void onSuccess(ArticleVoteResponse articleVoteResponse) {
                                if (g != null) {
                                    g.onSuccess(articleVoteResponse.getVote());
                                }
                                ZendeskHelpCenterProvider.this.blipsProvider.articleVote(l, -1);
                            }
                        });
                    }
                }
            });
        }
    }

    public void deleteVote(final Long l, final G<Void> g) {
        if (!sanityCheck(g, l)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(g, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.deleteVote(l, new ZendeskCallbackSuccess<Void>(g) {
                            public void onSuccess(Void voidR) {
                                if (g != null) {
                                    g.onSuccess(voidR);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void submitRecordArticleView(Article article, Locale locale, G<Void> g) {
        if (!sanityCheck(g, article)) {
            this.zendeskTracker.helpCenterArticleViewed();
            this.blipsProvider.articleView(article);
            final G<Void> g2 = g;
            final Article article2 = article;
            final Locale locale2 = locale;
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(g2, supportSdkSettings)) {
                        ZendeskHelpCenterProvider.this.helpCenterService.submitRecordArticleView(article2.getId(), locale2, new RecordArticleViewRequest(ZendeskHelpCenterProvider.this.helpCenterSessionCache.getLastSearch(), ZendeskHelpCenterProvider.this.helpCenterSessionCache.isUniqueSearchResultClick()), new ZendeskCallbackSuccess<Void>(g2) {
                            public void onSuccess(Void voidR) {
                                ZendeskHelpCenterProvider.this.helpCenterSessionCache.unsetUniqueSearchResultClick();
                                if (g2 != null) {
                                    g2.onSuccess(voidR);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public Locale getLocale(SupportSdkSettings supportSdkSettings) {
        if (Support.INSTANCE.getHelpCenterLocaleOverride() != null) {
            return Support.INSTANCE.getHelpCenterLocaleOverride();
        }
        String helpCenterLocale = supportSdkSettings != null ? supportSdkSettings.getHelpCenterLocale() : "";
        return P.m1409(helpCenterLocale) ? Locale.getDefault() : L.m1387(helpCenterLocale);
    }

    /* access modifiers changed from: package-private */
    public boolean sanityCheck(G<?> g, Object... objArr) {
        if (objArr != null) {
            boolean z = true;
            for (Object obj : objArr) {
                if (obj == null) {
                    z = false;
                }
            }
            if (!z) {
                F.m1358();
                if (g != null) {
                    g.onError(new D("One or more provided parameters are null."));
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean sanityCheckHelpCenterSettings(G<?> g, SupportSdkSettings supportSdkSettings) {
        if (!supportSdkSettings.hasHelpCenterSettings()) {
            F.m1358();
            if (g != null) {
                g.onError(new D("Help Center settings are null. Can not continue with the call"));
            }
            return true;
        } else if (supportSdkSettings.isHelpCenterEnabled()) {
            return false;
        } else {
            F.m1358();
            if (g != null) {
                g.onError(new D("Help Center is disabled in your app's settings. Can not continue with the call"));
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    public boolean checkSettingsAndVotingEnabled(G<?> g, SupportSdkSettings supportSdkSettings) {
        if (!sanityCheckHelpCenterSettings(g, supportSdkSettings)) {
            if (supportSdkSettings.isHelpCenterArticleVotingEnabled()) {
                return true;
            }
            F.m1358();
            if (g != null) {
                g.onError(new D("Help Center voting is disabled in your app's settings. Can not continue with the call"));
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"UseSparseArrays"})
    public List<SearchArticle> asSearchArticleList(ArticlesResponse articlesResponse) {
        Section section;
        ArrayList arrayList = new ArrayList();
        if (articlesResponse == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        List<Type> r4 = O.m1403(articlesResponse.getArticles());
        List<Type> r5 = O.m1403(articlesResponse.getSections());
        List<Type> r6 = O.m1403(articlesResponse.getCategories());
        List<Type> r10 = O.m1403(articlesResponse.getUsers());
        for (Type type : r5) {
            if (type.getId() != null) {
                hashMap.put(type.getId(), type);
            }
        }
        for (Type type2 : r6) {
            if (type2.getId() != null) {
                hashMap2.put(type2.getId(), type2);
            }
        }
        for (Type type3 : r10) {
            if (type3.getId() != null) {
                hashMap3.put(type3.getId(), type3);
            }
        }
        for (Type type4 : r4) {
            Category category = null;
            if (type4.getSectionId() != null) {
                section = (Section) hashMap.get(type4.getSectionId());
            } else {
                F.m1361();
                section = null;
            }
            if (section == null || section.getCategoryId() == null) {
                F.m1361();
            } else {
                category = (Category) hashMap2.get(section.getCategoryId());
            }
            if (type4.getAuthorId() != null) {
                type4.setAuthor((User) hashMap3.get(type4.getAuthorId()));
            } else {
                F.m1361();
            }
            arrayList.add(new SearchArticle(type4, section, category));
        }
        return arrayList;
    }
}
