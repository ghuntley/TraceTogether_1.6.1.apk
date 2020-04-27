package zendesk.support.guide;

import java.util.List;
import o.G;
import zendesk.support.ArticleItem;
import zendesk.support.CategoryItem;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;
import zendesk.support.SeeAllArticlesItem;
import zendesk.support.guide.HelpCenterMvp;

interface HelpMvp {

    public interface Model {
        void getArticles(List<Long> list, List<Long> list2, String[] strArr, G<List<HelpItem>> g);

        void getArticlesForSection(SectionItem sectionItem, String[] strArr, G<List<ArticleItem>> g);
    }

    public interface Presenter {
        int getItemCount();

        HelpItem getItemForBinding(int i);

        int getItemViewType(int i);

        void onAttached();

        boolean onCategoryClick(CategoryItem categoryItem, int i);

        void onDetached();

        void onSeeAllClick(SeeAllArticlesItem seeAllArticlesItem);

        void setContentPresenter(HelpCenterMvp.Presenter presenter);
    }

    public interface View {
        void addItem(int i, HelpItem helpItem);

        void removeItem(int i);

        void showItems(List<HelpItem> list);
    }
}
