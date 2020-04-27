package zendesk.support.guide;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import o.C;
import o.C0293;
import o.C0651;
import o.C1266;
import o.F;
import o.G;
import o.R;
import zendesk.support.ArticleVote;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.HelpCenterProvider;
import zendesk.support.UiUtils;

class ArticleVotingView extends RelativeLayout {
    /* access modifiers changed from: private */
    public Long articleId;
    /* access modifiers changed from: private */
    public ArticleVote articleVote;
    /* access modifiers changed from: private */
    public ArticleVoteStorage articleVoteStorage;
    private ImageButton downvoteButton;
    private ViewGroup downvoteButtonFrame;
    private HelpCenterProvider helpCenterProvider;
    private ImageButton upvoteButton;
    private ViewGroup upvoteButtonFrame;

    enum VoteState {
        UPVOTED,
        DOWNVOTED,
        NONE;

        static VoteState fromArticleVote(ArticleVote articleVote) {
            if (articleVote == null || articleVote.getValue() == null) {
                return NONE;
            }
            int intValue = articleVote.getValue().intValue();
            if (intValue > 0) {
                return UPVOTED;
            }
            if (intValue < 0) {
                return DOWNVOTED;
            }
            return NONE;
        }
    }

    public ArticleVotingView(Context context) {
        super(context);
        setupViews(context);
    }

    public ArticleVotingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setupViews(context);
    }

    public ArticleVotingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setupViews(context);
    }

    public void bindTo(Long l, ArticleVoteStorage articleVoteStorage2, HelpCenterProvider helpCenterProvider2) {
        this.articleVoteStorage = articleVoteStorage2;
        this.helpCenterProvider = helpCenterProvider2;
        this.articleId = l;
        if (l != null) {
            this.articleVote = articleVoteStorage2.getStoredArticleVote(l);
            updateButtons(VoteState.fromArticleVote(this.articleVote));
        }
    }

    private void setupViews(Context context) {
        LayoutInflater.from(context).inflate(R.layout.f169952131558574, this);
        this.upvoteButtonFrame = (ViewGroup) findViewById(R.id.f168092131362434);
        this.upvoteButton = (ImageButton) findViewById(R.id.f168082131362433);
        this.downvoteButtonFrame = (ViewGroup) findViewById(R.id.f165122131362024);
        this.downvoteButton = (ImageButton) findViewById(R.id.f165112131362023);
        int themeAttributeToColor = UiUtils.themeAttributeToColor(R.attr.f150312130968815, getContext(), R.color.f157322131099929);
        themeVotingButton(this.upvoteButton, 2131231220, themeAttributeToColor);
        themeVotingButton(this.downvoteButton, 2131231219, themeAttributeToColor);
        this.upvoteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                VoteState voteState;
                ArticleVotingView.this.setVotingButtonsClickable(false);
                if (ArticleVotingView.this.articleVote == null || ArticleVotingView.this.articleVote.getValue() == null || !ArticleVotingView.this.articleVote.getValue().equals(1)) {
                    voteState = VoteState.UPVOTED;
                    ArticleVotingView.this.upvoteArticle();
                } else {
                    voteState = VoteState.NONE;
                    ArticleVotingView.this.removeVote();
                }
                ArticleVotingView.this.updateButtons(voteState);
            }
        });
        this.downvoteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                VoteState voteState;
                ArticleVotingView.this.setVotingButtonsClickable(false);
                if (ArticleVotingView.this.articleVote == null || ArticleVotingView.this.articleVote.getValue() == null || !ArticleVotingView.this.articleVote.getValue().equals(-1)) {
                    voteState = VoteState.DOWNVOTED;
                    ArticleVotingView.this.downvoteArticle();
                } else {
                    voteState = VoteState.NONE;
                    ArticleVotingView.this.removeVote();
                }
                ArticleVotingView.this.updateButtons(voteState);
            }
        });
    }

    /* access modifiers changed from: private */
    public void setVotingButtonsClickable(boolean z) {
        this.upvoteButton.setClickable(z);
        this.downvoteButton.setClickable(z);
    }

    private void themeVotingButton(ImageButton imageButton, int i, int i2) {
        C0293.m4199((View) imageButton, (Drawable) getVotingButtonBackground(i2));
        Drawable r3 = C1266.m8158(C0651.m5458(getContext(), i));
        C1266.m8152(r3, colorStateList(-1, i2));
        C1266.m8153(r3, PorterDuff.Mode.SRC_IN);
        imageButton.setImageDrawable(r3);
    }

    private StateListDrawable getVotingButtonBackground(int i) {
        GradientDrawable buildButtonBackground = buildButtonBackground(getContext(), i);
        GradientDrawable buildButtonBackground2 = buildButtonBackground(getContext(), -1);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518}, buildButtonBackground);
        stateListDrawable.addState(new int[]{16842919}, buildButtonBackground);
        stateListDrawable.addState(new int[0], buildButtonBackground2);
        return stateListDrawable;
    }

    private ColorStateList colorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{16843518}, new int[]{16842919}, new int[0]}, new int[]{i, i, i2});
    }

    private GradientDrawable buildButtonBackground(Context context, int i) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f159682131165578);
        int r1 = C0651.m5450(context, R.color.f157352131099933);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f159692131165579);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) dimensionPixelSize);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(dimensionPixelSize2, r1);
        return gradientDrawable;
    }

    /* access modifiers changed from: private */
    public void upvoteArticle() {
        Long l = this.articleId;
        if (l == null) {
            F.m1361();
        } else {
            this.helpCenterProvider.upvoteArticle(l, new G<ArticleVote>() {
                public void onSuccess(ArticleVote articleVote) {
                    F.m1359();
                    ArticleVote unused = ArticleVotingView.this.articleVote = articleVote;
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(R.string.f172012131886397));
                    ArticleVotingView.this.articleVoteStorage.storeArticleVote(ArticleVotingView.this.articleId, articleVote);
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }

                public void onError(C c) {
                    F.m1359();
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(R.string.f171992131886395));
                    ArticleVotingView articleVotingView2 = ArticleVotingView.this;
                    articleVotingView2.updateButtons(VoteState.fromArticleVote(articleVotingView2.articleVote));
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void downvoteArticle() {
        if (this.articleId == null) {
            F.m1361();
            return;
        }
        F.m1358();
        this.helpCenterProvider.downvoteArticle(this.articleId, new G<ArticleVote>() {
            public void onSuccess(ArticleVote articleVote) {
                F.m1359();
                ArticleVote unused = ArticleVotingView.this.articleVote = articleVote;
                ArticleVotingView articleVotingView = ArticleVotingView.this;
                articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(R.string.f172002131886396));
                ArticleVotingView.this.articleVoteStorage.storeArticleVote(ArticleVotingView.this.articleId, articleVote);
                ArticleVotingView.this.setVotingButtonsClickable(true);
            }

            public void onError(C c) {
                F.m1359();
                ArticleVotingView articleVotingView = ArticleVotingView.this;
                articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(R.string.f171992131886395));
                ArticleVotingView articleVotingView2 = ArticleVotingView.this;
                articleVotingView2.updateButtons(VoteState.fromArticleVote(articleVotingView2.articleVote));
                ArticleVotingView.this.setVotingButtonsClickable(true);
            }
        });
    }

    /* access modifiers changed from: private */
    public void removeVote() {
        if (this.articleId == null) {
            F.m1361();
        } else if (this.articleVote.getId() != null) {
            this.helpCenterProvider.deleteVote(this.articleVote.getId(), new G<Void>() {
                public void onSuccess(Void voidR) {
                    F.m1359();
                    ArticleVote unused = ArticleVotingView.this.articleVote = null;
                    ArticleVotingView.this.articleVoteStorage.removeStoredArticleVote(ArticleVotingView.this.articleId);
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }

                public void onError(C c) {
                    c.m1282();
                    c.m1279();
                    c.m1281();
                    F.m1359();
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.updateButtons(VoteState.fromArticleVote(articleVotingView.articleVote));
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void updateButtons(VoteState voteState) {
        if (voteState == VoteState.NONE) {
            this.upvoteButtonFrame.setActivated(false);
            this.downvoteButtonFrame.setActivated(false);
        } else if (voteState == VoteState.UPVOTED) {
            this.upvoteButtonFrame.setActivated(true);
            this.downvoteButtonFrame.setActivated(false);
        } else if (voteState == VoteState.DOWNVOTED) {
            this.upvoteButtonFrame.setActivated(false);
            this.downvoteButtonFrame.setActivated(true);
        }
        updateContentDesc(voteState);
    }

    /* renamed from: zendesk.support.guide.ArticleVotingView$6  reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState = new int[VoteState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                zendesk.support.guide.ArticleVotingView$VoteState[] r0 = zendesk.support.guide.ArticleVotingView.VoteState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState = r0
                int[] r0 = $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.support.guide.ArticleVotingView$VoteState r1 = zendesk.support.guide.ArticleVotingView.VoteState.NONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.support.guide.ArticleVotingView$VoteState r1 = zendesk.support.guide.ArticleVotingView.VoteState.UPVOTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState     // Catch:{ NoSuchFieldError -> 0x002a }
                zendesk.support.guide.ArticleVotingView$VoteState r1 = zendesk.support.guide.ArticleVotingView.VoteState.DOWNVOTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.guide.ArticleVotingView.AnonymousClass6.<clinit>():void");
        }
    }

    private void updateContentDesc(VoteState voteState) {
        int i = AnonymousClass6.$SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState[voteState.ordinal()];
        if (i == 1) {
            this.upvoteButton.setContentDescription(getResources().getString(R.string.f171972131886393));
            this.downvoteButton.setContentDescription(getResources().getString(R.string.f171952131886391));
        } else if (i == 2) {
            this.upvoteButton.setContentDescription(getResources().getString(R.string.f171982131886394));
            this.downvoteButton.setContentDescription(getResources().getString(R.string.f171952131886391));
        } else if (i != 3) {
            F.m1359();
        } else {
            this.upvoteButton.setContentDescription(getResources().getString(R.string.f171972131886393));
            this.downvoteButton.setContentDescription(getResources().getString(R.string.f171962131886392));
        }
    }
}
