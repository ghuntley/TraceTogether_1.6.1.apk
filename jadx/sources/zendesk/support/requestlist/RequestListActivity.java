package zendesk.support.requestlist;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import o.C1459;
import o.C3350db;
import o.F;
import o.R;
import o.mZ;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.requestlist.RequestListUiConfig;

public class RequestListActivity extends C1459 {
    @C3350db
    ActionHandlerRegistry actionHandlerRegistry;
    @C3350db
    RequestListModel model;
    @C3350db
    RequestListPresenter presenter;
    @C3350db
    RequestListSyncHandler syncHandler;
    @C3350db
    RequestListView view;

    public static RequestListUiConfig.Builder builder() {
        return new RequestListUiConfig.Builder();
    }

    public static void refresh(Context context, ActionHandlerRegistry actionHandlerRegistry2) {
        ActionHandler handlerByAction = actionHandlerRegistry2.handlerByAction("request_list_refresh");
        if (handlerByAction != null) {
            handlerByAction.handle((Map<String, Object>) null, context);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        getTheme().applyStyle(R.style.f175302131952321, true);
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            F.m1358();
            finish();
            return;
        }
        RequestListUiConfig requestListUiConfig = (RequestListUiConfig) mZ.m3799(getIntent().getExtras(), RequestListUiConfig.class);
        if (requestListUiConfig == null) {
            F.m1358();
            finish();
            return;
        }
        SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().plus(new RequestListModule(this, requestListUiConfig)).inject(this);
        setContentView(this.view);
        RequestListPresenter requestListPresenter = this.presenter;
        if (bundle != null) {
            z = false;
        }
        requestListPresenter.onCreate(z);
        this.actionHandlerRegistry.add(this.syncHandler);
    }

    public void onStart() {
        super.onStart();
        this.view.onStart();
    }

    public void onResume() {
        super.onResume();
        this.syncHandler.setRunning(true);
    }

    public void onPause() {
        super.onPause();
        this.syncHandler.setRunning(false);
    }

    public void onStop() {
        super.onStop();
        this.view.onStop();
    }

    public void onDestroy() {
        super.onDestroy();
        ActionHandlerRegistry actionHandlerRegistry2 = this.actionHandlerRegistry;
        if (actionHandlerRegistry2 != null) {
            actionHandlerRegistry2.remove(this.syncHandler);
        }
        RequestListPresenter requestListPresenter = this.presenter;
        if (requestListPresenter != null) {
            requestListPresenter.onDestroy(isChangingConfigurations());
        }
    }
}
