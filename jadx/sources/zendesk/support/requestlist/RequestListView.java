package zendesk.support.requestlist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import o.C0809;
import o.C0824;
import o.C0837;
import o.C0918;
import o.C1459;
import o.C1819;
import o.C1830;
import o.C1956;
import o.C1976;
import o.C2026;
import o.C2183;
import o.C2652;
import o.C3616p;
import o.F;
import o.O;
import o.P;
import o.R;
import zendesk.support.UiUtils;
import zendesk.support.request.RequestUiConfig;
import zendesk.support.request.ViewAlmostRealProgressBar;

@SuppressLint({"ViewConstructor"})
class RequestListView extends FrameLayout {
    private final C1459 activity;
    private final RequestListAdapter adapter;
    private final RequestListUiConfig config;
    private final FloatingActionButton createTicketFab;
    private final C1956 emptyScene;
    private final C1819 fade = new C1819();
    private boolean isLoading = false;
    private boolean isStopped = true;
    /* access modifiers changed from: private */
    public OnItemClick itemClickListener = null;
    private final C1956 listScene;
    private final View listSceneView;
    private final View logoImage;
    private final View logoImageEmpty;
    private final ViewAlmostRealProgressBar progressBar;
    private final RecyclerView recyclerView;
    private View.OnClickListener retryClickListener = null;
    private final ViewGroup rootLayout;
    private final ViewGroup sceneRoot;
    private SceneState sceneState = SceneState.NONE;
    C0809 snackbar;
    private final View startConversationButton;
    private final C1830 swipeRefreshLayout;
    private final C1830 swipeRefreshLayoutEmpty;
    private final C2026 toolbar;

    interface OnItemClick {
        void onClick(RequestListItem requestListItem);
    }

    enum SceneState {
        LIST,
        EMPTY,
        NONE
    }

    public RequestListView(C1459 r6, RequestListUiConfig requestListUiConfig, C3616p pVar) {
        super(r6);
        this.activity = r6;
        this.config = requestListUiConfig;
        setId(R.id.f166912131362272);
        inflate(r6, R.layout.f169662131558545, this);
        this.sceneRoot = (ViewGroup) findViewById(R.id.f166862131362267);
        LayoutInflater from = LayoutInflater.from(r6);
        this.listSceneView = from.inflate(R.layout.f169682131558547, this.sceneRoot, false);
        View inflate = from.inflate(R.layout.f169692131558548, this.sceneRoot, false);
        this.listScene = new C1956(this.sceneRoot, this.listSceneView);
        this.emptyScene = new C1956(this.sceneRoot, inflate);
        this.progressBar = (ViewAlmostRealProgressBar) findViewById(R.id.f166842131362265);
        this.toolbar = (C2026) findViewById(R.id.f166902131362271);
        this.rootLayout = (ViewGroup) findViewById(R.id.f166742131362255);
        this.createTicketFab = (FloatingActionButton) findViewById(R.id.f166752131362256);
        this.logoImage = this.listSceneView.findViewById(R.id.f166922131362273);
        this.recyclerView = (RecyclerView) this.listSceneView.findViewById(R.id.f166852131362266);
        this.swipeRefreshLayout = (C1830) this.listSceneView.findViewById(R.id.f166882131362269);
        this.startConversationButton = inflate.findViewById(R.id.f166772131362258);
        this.swipeRefreshLayoutEmpty = (C1830) inflate.findViewById(R.id.f166892131362270);
        this.logoImageEmpty = inflate.findViewById(R.id.f166932131362274);
        this.adapter = new RequestListAdapter(new OnItemClick() {
            public void onClick(RequestListItem requestListItem) {
                if (RequestListView.this.itemClickListener != null) {
                    RequestListView.this.itemClickListener.onClick(requestListItem);
                }
            }
        }, pVar);
        this.recyclerView.setAdapter(this.adapter);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.recyclerView.addItemDecoration(new C0918(r6, 1));
        this.recyclerView.setItemAnimator(new C0837());
        this.createTicketFab.m998();
        if (Build.VERSION.SDK_INT >= 21) {
            View findViewById = findViewById(R.id.f166732131362254);
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        }
        int themeAttributeToColor = UiUtils.themeAttributeToColor(R.attr.f150212130968801, getContext(), R.color.f157292131099926);
        this.swipeRefreshLayout.setColorSchemeColors(themeAttributeToColor);
        this.swipeRefreshLayoutEmpty.setColorSchemeColors(themeAttributeToColor);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("request_list_view_superstate", super.onSaveInstanceState());
        bundle.putBoolean("is_showing_snackbar", isShowingSnackBar());
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            boolean z = bundle.getBoolean("is_showing_snackbar");
            parcelable = bundle.getParcelable("request_list_view_superstate");
            if (z) {
                showErrorMessage();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onStart() {
        this.isStopped = false;
    }

    public void onStop() {
        this.isStopped = true;
        dismissSnackbar();
    }

    public void setItemClickListener(OnItemClick onItemClick) {
        this.itemClickListener = onItemClick;
    }

    public void setSwipeRefreshListener(C1830.Cif ifVar) {
        this.swipeRefreshLayout.setOnRefreshListener(ifVar);
        this.swipeRefreshLayoutEmpty.setOnRefreshListener(ifVar);
    }

    public void setBackClickListener(View.OnClickListener onClickListener) {
        this.toolbar.setNavigationOnClickListener(onClickListener);
    }

    public void setRetryClickListener(View.OnClickListener onClickListener) {
        this.retryClickListener = onClickListener;
    }

    public void setCreateRequestListener(View.OnClickListener onClickListener) {
        this.createTicketFab.setOnClickListener(onClickListener);
        this.startConversationButton.setOnClickListener(onClickListener);
    }

    public void setLogoClickListener(boolean z, View.OnClickListener onClickListener) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
            onClickListener = null;
        }
        this.logoImage.setVisibility(i);
        this.logoImageEmpty.setVisibility(i);
        this.logoImage.setOnClickListener(onClickListener);
        this.logoImageEmpty.setOnClickListener(onClickListener);
    }

    public void showErrorMessage() {
        if (!this.isStopped && !isShowingSnackBar()) {
            announceAccessibility(R.string.f171792131886375);
            this.snackbar = C0809.m6202(this.rootLayout, R.string.f171192131886284).m6207(R.string.f171662131886360, this.retryClickListener);
            this.snackbar.m1025();
        }
    }

    public void setLoading(boolean z) {
        dismissSnackbar();
        if (this.isLoading != z) {
            if (z) {
                if (!this.swipeRefreshLayout.f9376 && !this.swipeRefreshLayoutEmpty.f9376) {
                    announceAccessibility(R.string.f171822131886378);
                    this.progressBar.start(ViewAlmostRealProgressBar.DONT_STOP_MOVING);
                }
            } else if (this.swipeRefreshLayout.f9376 || this.swipeRefreshLayoutEmpty.f9376) {
                this.swipeRefreshLayout.setRefreshing(false);
                this.swipeRefreshLayoutEmpty.setRefreshing(false);
            } else {
                this.progressBar.stop(300);
            }
        }
        this.isLoading = z;
    }

    private boolean isShowingSnackBar() {
        C0809 r0 = this.snackbar;
        if (r0 == null) {
            return false;
        }
        if (C0824.f5366 == null) {
            C0824.f5366 = new C0824();
        }
        return C0824.f5366.m6248(r0.f882);
    }

    private void dismissSnackbar() {
        C0809 r0 = this.snackbar;
        if (r0 != null) {
            r0.m1023();
        }
        this.snackbar = null;
    }

    public void finish(String str) {
        if (P.m1406(str)) {
            F.m1359();
        }
        finish();
    }

    public void finish() {
        if (!this.activity.isFinishing()) {
            this.activity.finish();
        }
    }

    public void startReferrerPage(String str) {
        this.activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public void startRequestActivity(RequestUiConfig.Builder builder) {
        builder.show((Context) this.activity, this.config.getUiConfigs());
    }

    public void showRequestList(List<RequestListItem> list) {
        dismissSnackbar();
        this.progressBar.stop(300);
        if (!O.m1399(list)) {
            this.adapter.swapRequests(list);
            this.progressBar.stop(300);
            if (this.sceneState != SceneState.LIST) {
                FloatingActionButton floatingActionButton = this.createTicketFab;
                if (floatingActionButton.f859 == null) {
                    floatingActionButton.f859 = floatingActionButton.m997();
                }
                floatingActionButton.f859.m14028((C2652.C2653) null, true);
                if (this.listSceneView.getParent() == null) {
                    C2183.m11567(this.listScene, (C1976) this.fade);
                }
                announceAccessibility(R.string.f171802131886376);
                this.sceneState = SceneState.LIST;
            }
        } else if (this.sceneState != SceneState.EMPTY) {
            FloatingActionButton floatingActionButton2 = this.createTicketFab;
            if (floatingActionButton2.f859 == null) {
                floatingActionButton2.f859 = floatingActionButton2.m997();
            }
            floatingActionButton2.f859.m14043((C2652.C2653) null, true);
            C2183.m11567(this.emptyScene, (C1976) this.fade);
            announceAccessibility(R.string.f171812131886377);
            this.sceneState = SceneState.EMPTY;
        }
    }

    public void announceAccessibility(int i) {
        announceForAccessibility(getResources().getString(i));
    }
}
