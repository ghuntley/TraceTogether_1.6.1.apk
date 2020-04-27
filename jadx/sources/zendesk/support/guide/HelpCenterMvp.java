package zendesk.support.guide;

import java.util.List;
import o.G;
import zendesk.core.RetryAction;
import zendesk.support.SearchArticle;
import zendesk.support.SupportSdkSettings;

interface HelpCenterMvp {

    public enum ErrorType {
        CATEGORY_LOAD,
        SECTION_LOAD,
        ARTICLES_LOAD
    }

    public interface Model {
        void getSettings(G<SupportSdkSettings> g);

        void search(List<Long> list, List<Long> list2, String str, String[] strArr, G<List<SearchArticle>> g);
    }

    public interface Presenter {
        void init(HelpCenterUiConfig helpCenterUiConfig);

        void onErrorWithRetry(ErrorType errorType, RetryAction retryAction);

        void onLoad();

        void onPause();

        void onResume(View view);

        void onSearchSubmit(String str);

        boolean shouldShowConversationsMenuItem();

        boolean shouldShowSearchMenuItem();
    }

    public interface View {
        void announceContentLoaded();

        void clearSearchResults();

        void dismissError();

        void exitActivity();

        void hideLoadingState();

        boolean isShowingHelp();

        void setSearchEnabled(boolean z);

        void showContactUsButton();

        void showContactZendesk();

        void showHelp(HelpCenterUiConfig helpCenterUiConfig);

        void showLoadArticleErrorWithRetry(ErrorType errorType, RetryAction retryAction);

        void showLoadingState();

        void showNoConnectionError();

        void showRequestList();

        void showSearchResults(List<SearchArticle> list, String str);
    }
}
