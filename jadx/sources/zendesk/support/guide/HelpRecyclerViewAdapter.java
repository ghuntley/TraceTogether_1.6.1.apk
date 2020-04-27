package zendesk.support.guide;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import o.C0651;
import o.C1266;
import o.C3273am;
import o.F;
import o.R;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.CategoryItem;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;
import zendesk.support.SeeAllArticlesItem;
import zendesk.support.UiUtils;
import zendesk.support.guide.HelpCenterMvp;
import zendesk.support.guide.HelpMvp;

class HelpRecyclerViewAdapter extends RecyclerView.C0035<HelpViewHolder> implements HelpMvp.View {
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */
    public int defaultCategoryTitleColour;
    /* access modifiers changed from: private */
    public final HelpCenterUiConfig helpCenterUiConfig;
    /* access modifiers changed from: private */
    public int highlightCategoryTitleColour;
    /* access modifiers changed from: private */
    public HelpMvp.Presenter presenter;

    HelpRecyclerViewAdapter(HelpCenterUiConfig helpCenterUiConfig2, HelpCenterProvider helpCenterProvider, NetworkInfoProvider networkInfoProvider) {
        this.presenter = new HelpAdapterPresenter(this, new HelpModel(helpCenterProvider), networkInfoProvider, helpCenterUiConfig2);
        this.helpCenterUiConfig = helpCenterUiConfig2;
    }

    /* access modifiers changed from: package-private */
    public void setContentUpdateListener(HelpCenterMvp.Presenter presenter2) {
        HelpMvp.Presenter presenter3 = this.presenter;
        if (presenter3 != null) {
            presenter3.setContentPresenter(presenter2);
        }
    }

    public void showItems(List<HelpItem> list) {
        notifyDataSetChanged();
    }

    public void addItem(int i, HelpItem helpItem) {
        notifyItemInserted(i);
    }

    public void removeItem(int i) {
        notifyItemRemoved(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.context = recyclerView.getContext();
        this.highlightCategoryTitleColour = UiUtils.themeAttributeToColor(R.attr.f150312130968815, this.context, R.color.f157322131099929);
        this.defaultCategoryTitleColour = C0651.m5450(this.context, R.color.f157332131099931);
        this.presenter.onAttached();
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.presenter.onDetached();
        this.context = null;
    }

    public HelpViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new CategoryViewHolder(inflateView(viewGroup, R.layout.f169892131558568));
            case 2:
                return new SectionViewHolder(inflateView(viewGroup, R.layout.f169942131558573));
            case 3:
                return new ArticleViewHolder(inflateView(viewGroup, R.layout.f169872131558566));
            case 4:
                return new SeeAllViewHolder(inflateView(viewGroup, R.layout.f169862131558565));
            case 5:
                return new LoadingViewHolder(inflateView(viewGroup, R.layout.f169902131558569));
            case 7:
                return new NoResultsViewHolder(inflateView(viewGroup, R.layout.f169912131558570));
            case 8:
                return new ExtraPaddingViewHolder(inflateView(viewGroup, R.layout.f169922131558571));
            default:
                F.m1361();
                return null;
        }
    }

    private View inflateView(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    public int getItemCount() {
        return this.presenter.getItemCount();
    }

    public void onBindViewHolder(HelpViewHolder helpViewHolder, int i) {
        if (helpViewHolder == null) {
            F.m1361();
        } else {
            helpViewHolder.bindTo(this.presenter.getItemForBinding(i), i);
        }
    }

    public int getItemViewType(int i) {
        return this.presenter.getItemViewType(i);
    }

    class CategoryViewHolder extends HelpViewHolder {
        /* access modifiers changed from: private */
        public boolean expanded;
        /* access modifiers changed from: private */
        public Drawable expanderDrawable;

        CategoryViewHolder(View view) {
            super(view);
            this.textView = (TextView) view;
            this.expanderDrawable = C1266.m8158(C0651.m5458(view.getContext(), R.drawable.f163792131231214)).mutate();
            C1266.m8148(this.expanderDrawable, UiUtils.themeAttributeToColor(16842808, HelpRecyclerViewAdapter.this.context, R.color.f157322131099929));
            C1266.m8153(this.expanderDrawable, PorterDuff.Mode.SRC_IN);
            TextView textView = (TextView) view;
            if (Build.VERSION.SDK_INT >= 17) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.expanderDrawable, (Drawable) null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.expanderDrawable, (Drawable) null);
            }
        }

        public void bindTo(HelpItem helpItem, final int i) {
            if (helpItem == null) {
                F.m1358();
                return;
            }
            this.textView.setText(UiUtils.decodeHtmlEntities(helpItem.getName()));
            final CategoryItem categoryItem = (CategoryItem) helpItem;
            this.expanded = categoryItem.isExpanded();
            this.expanderDrawable.setLevel(this.expanded ? C3273am.f1527 : 0);
            setHighlightColor(categoryItem.isExpanded());
            this.textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    CategoryViewHolder categoryViewHolder = CategoryViewHolder.this;
                    boolean unused = categoryViewHolder.expanded = HelpRecyclerViewAdapter.this.presenter.onCategoryClick(categoryItem, i);
                    Drawable access$300 = CategoryViewHolder.this.expanderDrawable;
                    int[] iArr = new int[2];
                    boolean access$100 = CategoryViewHolder.this.expanded;
                    int i = C3273am.f1527;
                    iArr[0] = access$100 ? 0 : C3273am.f1527;
                    if (!CategoryViewHolder.this.expanded) {
                        i = 0;
                    }
                    iArr[1] = i;
                    ObjectAnimator.ofInt(access$300, "level", iArr).start();
                    CategoryViewHolder categoryViewHolder2 = CategoryViewHolder.this;
                    categoryViewHolder2.setHighlightColor(categoryViewHolder2.expanded);
                }
            });
        }

        /* access modifiers changed from: private */
        public void setHighlightColor(boolean z) {
            if (z) {
                this.textView.setTextColor(HelpRecyclerViewAdapter.this.highlightCategoryTitleColour);
                this.expanderDrawable.setColorFilter(HelpRecyclerViewAdapter.this.highlightCategoryTitleColour, PorterDuff.Mode.SRC_IN);
                return;
            }
            this.textView.setTextColor(HelpRecyclerViewAdapter.this.defaultCategoryTitleColour);
            this.expanderDrawable.setColorFilter(HelpRecyclerViewAdapter.this.defaultCategoryTitleColour, PorterDuff.Mode.SRC_IN);
        }

        public boolean isExpanded() {
            return this.expanded;
        }
    }

    class SectionViewHolder extends HelpViewHolder {
        SectionViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.f167362131362326);
        }

        public void bindTo(HelpItem helpItem, int i) {
            if (helpItem == null) {
                F.m1358();
            } else {
                this.textView.setText(UiUtils.decodeHtmlEntities(helpItem.getName()));
            }
        }
    }

    class ArticleViewHolder extends HelpViewHolder {
        ArticleViewHolder(View view) {
            super(view);
            this.textView = (TextView) view;
        }

        public void bindTo(final HelpItem helpItem, int i) {
            if (helpItem == null || helpItem.getId() == null) {
                F.m1358();
                return;
            }
            this.textView.setText(UiUtils.decodeHtmlEntities(helpItem.getName()));
            this.textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ViewArticleActivity.builder(helpItem.getId().longValue()).show(HelpRecyclerViewAdapter.this.context, HelpRecyclerViewAdapter.this.helpCenterUiConfig.getUiConfigs());
                }
            });
        }
    }

    class SeeAllViewHolder extends HelpViewHolder {
        /* access modifiers changed from: private */
        public ProgressBar progressBar;

        SeeAllViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.f165392131362078);
            this.progressBar = (ProgressBar) view.findViewById(R.id.f165402131362079);
        }

        public void bindTo(final HelpItem helpItem, int i) {
            String str;
            if (!(helpItem instanceof SeeAllArticlesItem)) {
                F.m1358();
                return;
            }
            final SeeAllArticlesItem seeAllArticlesItem = (SeeAllArticlesItem) helpItem;
            if (seeAllArticlesItem.isLoading()) {
                this.textView.setVisibility(8);
                this.progressBar.setVisibility(0);
            } else {
                this.textView.setVisibility(0);
                this.progressBar.setVisibility(8);
            }
            SectionItem section = seeAllArticlesItem.getSection();
            if (section != null) {
                str = HelpRecyclerViewAdapter.this.context.getString(R.string.f171532131886332, new Object[]{Integer.valueOf(section.getTotalArticlesCount())});
            } else {
                str = HelpRecyclerViewAdapter.this.context.getString(R.string.f171522131886331);
            }
            this.textView.setText(str);
            this.textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    SeeAllViewHolder.this.textView.setVisibility(8);
                    SeeAllViewHolder.this.progressBar.setVisibility(0);
                    HelpRecyclerViewAdapter.this.presenter.onSeeAllClick((SeeAllArticlesItem) helpItem);
                    seeAllArticlesItem.setLoading(true);
                }
            });
        }
    }

    class LoadingViewHolder extends HelpViewHolder {
        public void bindTo(HelpItem helpItem, int i) {
        }

        LoadingViewHolder(View view) {
            super(view);
        }
    }

    class NoResultsViewHolder extends HelpViewHolder {
        public void bindTo(HelpItem helpItem, int i) {
        }

        NoResultsViewHolder(View view) {
            super(view);
        }
    }

    class ExtraPaddingViewHolder extends HelpViewHolder {
        public void bindTo(HelpItem helpItem, int i) {
        }

        ExtraPaddingViewHolder(View view) {
            super(view);
        }
    }

    static abstract class HelpViewHolder extends RecyclerView.con {
        TextView textView;

        public abstract void bindTo(HelpItem helpItem, int i);

        HelpViewHolder(View view) {
            super(view);
        }
    }
}
