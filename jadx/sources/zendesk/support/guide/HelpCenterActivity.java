package zendesk.support.guide;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import o.C0809;
import o.C1265;
import o.C1277;
import o.C1459;
import o.C1550;
import o.C2026;
import o.C3282auX;
import o.C3350db;
import o.F;
import o.R;
import o.mZ;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.SearchArticle;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.guide.HelpCenterMvp;
import zendesk.support.request.RequestActivity;
import zendesk.support.requestlist.RequestListActivity;

public class HelpCenterActivity extends C1459 implements HelpCenterMvp.View {
    private FloatingActionButton contactUsButton;
    private MenuItem conversationsMenuItem;
    /* access modifiers changed from: private */
    public C0809 errorSnackbar;
    @C3350db
    HelpCenterProvider helpCenterProvider;
    private HelpCenterUiConfig helpCenterUiConfig;
    private View loadingView;
    @C3350db
    NetworkInfoProvider networkInfoProvider;
    /* access modifiers changed from: private */
    public HelpCenterMvp.Presenter presenter;
    private MenuItem searchViewMenuItem;
    @C3350db
    SupportSettingsProvider settingsProvider;
    /* access modifiers changed from: private */
    public SnackbarStatus snackbarStatus = SnackbarStatus.NONE;

    enum SnackbarStatus {
        NO_CONNECTION,
        NONE,
        CONTENT_ERROR
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Resources.Theme theme = getTheme();
        theme.applyStyle(R.style.f175302131952321, true);
        theme.applyStyle(R.style.f175672131952364, false);
        setContentView(R.layout.f169642131558543);
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            F.m1358();
            finish();
            return;
        }
        this.helpCenterUiConfig = (HelpCenterUiConfig) mZ.m3799(getIntent().getExtras(), HelpCenterUiConfig.class);
        if (this.helpCenterUiConfig == null) {
            F.m1358();
            finish();
            return;
        }
        SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().inject(this);
        initToolbar().m1640(true);
        this.loadingView = findViewById(R.id.f165782131362131);
        this.contactUsButton = (FloatingActionButton) findViewById(R.id.f164912131361995);
        this.contactUsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HelpCenterActivity.this.showContactZendesk();
            }
        });
        this.presenter = new HelpCenterPresenter(this, new HelpCenterModel(this.helpCenterProvider, this.settingsProvider), this.networkInfoProvider);
        this.presenter.init(this.helpCenterUiConfig);
        addOnBackStackChangedListener();
    }

    private C3282auX initToolbar() {
        C2026 r0 = (C2026) findViewById(R.id.f167542131362361);
        if (Build.VERSION.SDK_INT >= 21) {
            findViewById(R.id.f167532131362360).setVisibility(8);
        }
        setSupportActionBar(r0);
        return getSupportActionBar();
    }

    private void addOnBackStackChangedListener() {
        C1550 supportFragmentManager = getSupportFragmentManager();
        AnonymousClass2 r1 = new C1550.C1552() {
            public void onBackStackChanged() {
                if (HelpCenterActivity.this.getCurrentFragment().isHidden()) {
                    new C1265(HelpCenterActivity.this.getSupportFragmentManager()).m9969(HelpCenterActivity.this.getCurrentFragment()).m9966();
                    if (HelpCenterActivity.this.getCurrentFragment() instanceof HelpCenterFragment) {
                        ((HelpCenterFragment) HelpCenterActivity.this.getCurrentFragment()).setPresenter(HelpCenterActivity.this.presenter);
                    }
                }
            }
        };
        if (supportFragmentManager.f8278 == null) {
            supportFragmentManager.f8278 = new ArrayList<>();
        }
        supportFragmentManager.f8278.add(r1);
    }

    private boolean noFragmentAdded() {
        return getCurrentFragment() == null;
    }

    public void onStart() {
        C0809 r0;
        super.onStart();
        if (this.snackbarStatus != SnackbarStatus.NONE && (r0 = this.errorSnackbar) != null) {
            r0.m1025();
        }
    }

    public void onResume() {
        super.onResume();
        HelpCenterMvp.Presenter presenter2 = this.presenter;
        if (presenter2 != null) {
            presenter2.onResume(this);
        }
    }

    public void onPause() {
        super.onPause();
        HelpCenterMvp.Presenter presenter2 = this.presenter;
        if (presenter2 != null) {
            presenter2.onPause();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f170052131623937, menu);
        this.conversationsMenuItem = menu.findItem(R.id.f165322131362066);
        this.searchViewMenuItem = menu.findItem(R.id.f165332131362067);
        if (this.searchViewMenuItem == null) {
            return true;
        }
        if (!this.networkInfoProvider.isNetworkAvailable()) {
            this.searchViewMenuItem.setEnabled(false);
        }
        SearchView searchView = (SearchView) this.searchViewMenuItem.getActionView();
        searchView.setImeOptions(searchView.getImeOptions() | 268435456);
        searchView.setOnQueryTextListener(new SearchView.Cif() {
            public boolean onQueryTextChange(String str) {
                return false;
            }

            public boolean onQueryTextSubmit(String str) {
                if (HelpCenterActivity.this.presenter == null) {
                    return false;
                }
                HelpCenterActivity.this.presenter.onSearchSubmit(str);
                return true;
            }
        });
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItem;
        MenuItem menuItem2;
        HelpCenterMvp.Presenter presenter2 = this.presenter;
        if (!(presenter2 == null || (menuItem2 = this.searchViewMenuItem) == null)) {
            menuItem2.setVisible(presenter2.shouldShowSearchMenuItem());
        }
        HelpCenterMvp.Presenter presenter3 = this.presenter;
        if (!(presenter3 == null || (menuItem = this.conversationsMenuItem) == null)) {
            menuItem.setVisible(presenter3.shouldShowConversationsMenuItem());
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.f165322131362066) {
            return false;
        } else {
            showRequestList();
            return true;
        }
    }

    public void showContactUsButton() {
        this.contactUsButton.setVisibility(0);
    }

    public void showHelp(HelpCenterUiConfig helpCenterUiConfig2) {
        if (noFragmentAdded()) {
            HelpCenterFragment newInstance = HelpCenterFragment.newInstance(helpCenterUiConfig2);
            newInstance.setPresenter(this.presenter);
            addFragment(newInstance);
        } else if (getCurrentFragment() instanceof HelpCenterFragment) {
            ((HelpCenterFragment) getCurrentFragment()).setPresenter(this.presenter);
        }
        invalidateOptionsMenu();
    }

    private void addFragment(C1277 r5) {
        C1265 r1 = new C1265(getSupportFragmentManager());
        r1.m9968(R.id.f165302131362064, r5, r5.getClass().getSimpleName(), 1);
        r1.m9966();
    }

    public void showLoadingState() {
        C1277 currentFragment = getCurrentFragment();
        if (currentFragment != null && currentFragment.isVisible()) {
            new C1265(getSupportFragmentManager()).m9962(getCurrentFragment()).m9966();
        }
        this.loadingView.setVisibility(0);
    }

    public void hideLoadingState() {
        this.loadingView.setVisibility(8);
    }

    public void showSearchResults(List<SearchArticle> list, String str) {
        getSearchFragment().updateResults(list, str);
    }

    /* access modifiers changed from: private */
    public C1277 getCurrentFragment() {
        return getSupportFragmentManager().findFragmentById(R.id.f165302131362064);
    }

    private HelpSearchFragment getSearchFragment() {
        if (getCurrentFragment() instanceof HelpSearchFragment) {
            F.m1359();
            return (HelpSearchFragment) getCurrentFragment();
        }
        HelpSearchFragment newInstance = HelpSearchFragment.newInstance(this.helpCenterUiConfig, this.helpCenterProvider);
        C1265 r2 = new C1265(getSupportFragmentManager());
        r2.m9968(R.id.f165302131362064, newInstance, (String) null, 2);
        if (r2.f9218) {
            r2.f9211 = true;
            r2.f9212 = null;
            r2.m9966();
            return newInstance;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public void clearSearchResults() {
        if (getCurrentFragment() instanceof HelpSearchFragment) {
            ((HelpSearchFragment) getCurrentFragment()).clearResults();
        }
    }

    public void setSearchEnabled(boolean z) {
        this.searchViewMenuItem.setEnabled(z);
    }

    public boolean isShowingHelp() {
        return getCurrentFragment() instanceof HelpCenterFragment;
    }

    public void showRequestList() {
        RequestListActivity.builder().show((Context) this, this.helpCenterUiConfig.getUiConfigs());
    }

    public void showContactZendesk() {
        RequestActivity.builder().show((Context) this, this.helpCenterUiConfig.getUiConfigs());
    }

    public void showLoadArticleErrorWithRetry(HelpCenterMvp.ErrorType errorType, final RetryAction retryAction) {
        String str;
        if (errorType == null) {
            F.m1361();
            str = getString(R.string.f171662131886360);
        } else {
            int i = AnonymousClass5.$SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType[errorType.ordinal()];
            if (i == 1) {
                str = getString(R.string.f171492131886328);
            } else if (i == 2) {
                str = getString(R.string.f171542131886333);
            } else if (i != 3) {
                F.m1361();
                StringBuilder sb = new StringBuilder();
                sb.append(getString(R.string.f171512131886330));
                sb.append(" ");
                sb.append(errorType.name());
                str = sb.toString();
            } else {
                str = getString(R.string.f171482131886326);
            }
        }
        if (this.snackbarStatus == SnackbarStatus.NONE) {
            this.errorSnackbar = C0809.m6203(this.contactUsButton, str);
            this.errorSnackbar.m6207(R.string.f171662131886360, new View.OnClickListener() {
                public void onClick(View view) {
                    HelpCenterActivity.this.errorSnackbar.m1023();
                    SnackbarStatus unused = HelpCenterActivity.this.snackbarStatus = SnackbarStatus.NONE;
                    retryAction.onRetry();
                }
            });
            this.errorSnackbar.m1025();
            this.snackbarStatus = SnackbarStatus.CONTENT_ERROR;
        }
    }

    /* renamed from: zendesk.support.guide.HelpCenterActivity$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType = new int[HelpCenterMvp.ErrorType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                zendesk.support.guide.HelpCenterMvp$ErrorType[] r0 = zendesk.support.guide.HelpCenterMvp.ErrorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType = r0
                int[] r0 = $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.support.guide.HelpCenterMvp$ErrorType r1 = zendesk.support.guide.HelpCenterMvp.ErrorType.CATEGORY_LOAD     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.support.guide.HelpCenterMvp$ErrorType r1 = zendesk.support.guide.HelpCenterMvp.ErrorType.SECTION_LOAD     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType     // Catch:{ NoSuchFieldError -> 0x002a }
                zendesk.support.guide.HelpCenterMvp$ErrorType r1 = zendesk.support.guide.HelpCenterMvp.ErrorType.ARTICLES_LOAD     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.guide.HelpCenterActivity.AnonymousClass5.<clinit>():void");
        }
    }

    public void showNoConnectionError() {
        if (this.snackbarStatus != SnackbarStatus.NO_CONNECTION) {
            this.errorSnackbar = C0809.m6202(this.contactUsButton, R.string.f171652131886359);
            this.errorSnackbar.m1025();
            this.snackbarStatus = SnackbarStatus.NO_CONNECTION;
        }
    }

    public void dismissError() {
        C0809 r0 = this.errorSnackbar;
        if (r0 != null) {
            r0.m1023();
        }
        this.snackbarStatus = SnackbarStatus.NONE;
    }

    public void exitActivity() {
        finish();
    }

    public void announceContentLoaded() {
        this.contactUsButton.announceForAccessibility(getString(R.string.f171682131886363));
    }
}
