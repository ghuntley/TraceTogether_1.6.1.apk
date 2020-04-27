package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import o.mW;
import o.mZ;
import zendesk.support.Article;

public class ArticleUiConfig implements mW {
    private final ArticleViewModel article;
    private final long articleId;
    private final int configurationState;
    private final boolean contactUsVisible;
    private final List<mW> uiConfigs;

    private ArticleUiConfig(Builder builder) {
        this.configurationState = builder.configurationState;
        this.article = builder.article;
        this.articleId = builder.articleId;
        this.contactUsVisible = builder.contactUsVisible;
        this.uiConfigs = builder.uiConfigs;
    }

    /* access modifiers changed from: package-private */
    public int getConfigurationState() {
        return this.configurationState;
    }

    /* access modifiers changed from: package-private */
    public ArticleViewModel getArticle() {
        return this.article;
    }

    /* access modifiers changed from: package-private */
    public long getArticleId() {
        return this.articleId;
    }

    public boolean isContactUsButtonVisible() {
        return this.contactUsVisible;
    }

    @SuppressLint({"RestrictedApi"})
    public List<mW> getUiConfigs() {
        return mZ.m3800(this.uiConfigs, this);
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public ArticleViewModel article;
        /* access modifiers changed from: private */
        public long articleId;
        /* access modifiers changed from: private */
        public int configurationState;
        /* access modifiers changed from: private */
        public boolean contactUsVisible;
        /* access modifiers changed from: private */
        public List<mW> uiConfigs;

        public Builder(long j) {
            this.contactUsVisible = true;
            this.uiConfigs = new ArrayList();
            this.articleId = j;
            this.configurationState = 1;
        }

        public Builder(Article article2) {
            this.contactUsVisible = true;
            this.uiConfigs = new ArrayList();
            this.article = new ArticleViewModel(article2);
            this.configurationState = 2;
        }

        public Builder() {
            this.contactUsVisible = true;
            this.uiConfigs = new ArrayList();
            this.configurationState = -1;
        }

        private void setUiConfigs(List<mW> list) {
            this.uiConfigs = list;
            ArticleUiConfig articleUiConfig = (ArticleUiConfig) mZ.m3803(list, ArticleUiConfig.class);
            if (articleUiConfig != null) {
                this.contactUsVisible = articleUiConfig.isContactUsButtonVisible();
            }
        }

        public void show(Context context, List<mW> list) {
            context.startActivity(intent(context, list));
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<mW> list) {
            setUiConfigs(list);
            ArticleUiConfig articleUiConfig = new ArticleUiConfig(this);
            Intent intent = new Intent(context, ViewArticleActivity.class);
            mZ.m3801(intent, (mW) articleUiConfig);
            return intent;
        }
    }
}
