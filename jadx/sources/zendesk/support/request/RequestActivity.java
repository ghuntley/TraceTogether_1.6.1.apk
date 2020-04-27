package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Map;
import o.C0638;
import o.C0809;
import o.C1459;
import o.C2026;
import o.C3350db;
import o.C3604mq;
import o.C3616p;
import o.F;
import o.R;
import o.mZ;
import o.ne;
import o.nt;
import o.nu;
import o.nx;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.request.RequestUiConfig;

public class RequestActivity extends C1459 {
    private RequestAccessibilityHerald accessibilityHerald;
    @C3350db
    ActionHandlerRegistry actionHandlerRegistry;
    @C3350db
    ActionFactory af;
    @C3350db
    HeadlessComponentListener headlessComponentListener;
    @C3350db
    C3616p picasso;
    private RefreshRequestActionHandler refreshActionHandler;
    private RequestComponent requestComponent;
    private ComponentRequestRouter requestRouter;
    @C3350db
    nu store;
    private nx subscription;

    public static RequestUiConfig.Builder builder() {
        return new RequestUiConfig.Builder();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(R.style.f175302131952321, true);
        setContentView(R.layout.f169652131558544);
        C3604mq.m3914(this);
        initViews();
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            F.m1358();
            finish();
            return;
        }
        RequestUiConfig requestUiConfig = (RequestUiConfig) mZ.m3799(getIntent().getExtras(), RequestUiConfig.class);
        if (requestUiConfig == null) {
            F.m1358();
            finish();
            return;
        }
        this.refreshActionHandler = new RefreshRequestActionHandler(requestUiConfig.getRequestId());
        boolean initializeStoreAndDependencies = initializeStoreAndDependencies(bundle, requestUiConfig);
        if (initializeStoreAndDependencies) {
            this.headlessComponentListener.startListening(this.store);
            this.store.m3992(this.af.installStartConfigAsync(requestUiConfig));
            this.store.m3992(this.af.loadSettingsAsync());
        }
        this.subscription = bindComponents(initializeStoreAndDependencies);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        return currentScreen != null && currentScreen.inflateMenu(getMenuInflater(), menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen != null) {
            return currentScreen.onOptionsItemClicked(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        this.store.m3992(this.af.androidOnResume());
        this.subscription.m4034();
        this.subscription.m4035();
        this.actionHandlerRegistry.add(this.refreshActionHandler);
    }

    public void onPause() {
        super.onPause();
        nu nuVar = this.store;
        if (nuVar != null) {
            nuVar.m3992(this.af.androidOnPause());
        }
        nx nxVar = this.subscription;
        if (nxVar != null) {
            nxVar.m4033();
        }
        ActionHandlerRegistry actionHandlerRegistry2 = this.actionHandlerRegistry;
        if (actionHandlerRegistry2 != null) {
            actionHandlerRegistry2.remove(this.refreshActionHandler);
        }
    }

    public void onBackPressed() {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen == null || !currentScreen.hasUnsavedInput()) {
            super.onBackPressed();
            return;
        }
        C0638.Cif ifVar = new C0638.Cif(this);
        ifVar.f4628.f1167 = ifVar.f4628.f1177.getText(R.string.f171112131886276);
        ifVar.f4628.f1175 = ifVar.f4628.f1177.getText(R.string.f171082131886273);
        AnonymousClass2 r1 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                RequestActivity.super.onBackPressed();
            }
        };
        ifVar.f4628.f1169 = ifVar.f4628.f1177.getText(R.string.f171102131886275);
        ifVar.f4628.f1180 = r1;
        AnonymousClass1 r12 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        };
        ifVar.f4628.f1181 = ifVar.f4628.f1177.getText(R.string.f171092131886274);
        ifVar.f4628.f1179 = r12;
        ifVar.m5401();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("saved_state", this.store.m4002());
        super.onSaveInstanceState(bundle);
    }

    private nx bindComponents(boolean z) {
        ComponentToolbar bindToolbar = bindToolbar();
        ComponentError create = ComponentError.create(this, this.store, this.af);
        this.requestRouter = ComponentRequestRouter.create(this, z, this.requestComponent);
        this.accessibilityHerald = RequestAccessibilityHerald.create(this);
        return ne.m3982(this.store.m4031(bindToolbar.getToolbarSelector(), bindToolbar), this.store.m4031(this.requestRouter.getSelector(), this.requestRouter), this.store.m4031(ComponentError.getSelector(), create), this.store.m4030(this.accessibilityHerald));
    }

    private boolean initializeStoreAndDependencies(Bundle bundle, RequestUiConfig requestUiConfig) {
        if (!injectDependencies(requestUiConfig)) {
            nt restoreState = restoreState(bundle);
            if (restoreState == null) {
                return true;
            }
            this.store.m4032(restoreState);
        }
        return false;
    }

    private nt restoreState(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("saved_state")) {
            return null;
        }
        return (nt) bundle.getSerializable("saved_state");
    }

    private boolean injectDependencies(RequestUiConfig requestUiConfig) {
        boolean z;
        this.requestComponent = (RequestComponent) HeadlessFragment.getData(getSupportFragmentManager());
        if (this.requestComponent == null) {
            z = false;
            this.requestComponent = SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().plus(new RequestModule(requestUiConfig));
            HeadlessFragment.install(getSupportFragmentManager(), this.requestComponent);
        } else {
            z = true;
        }
        this.requestComponent.inject(this);
        return z;
    }

    @SuppressLint({"PrivateResource"})
    private ComponentToolbar bindToolbar() {
        C2026 r0 = (C2026) findViewById(R.id.f164522131361929);
        ViewAlmostRealProgressBar viewAlmostRealProgressBar = (ViewAlmostRealProgressBar) findViewById(R.id.f164492131361926);
        setSupportActionBar(r0);
        r0.setNavigationOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RequestActivity.this.onBackPressed();
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            findViewById(R.id.f164442131361921).setVisibility(8);
        }
        return new ComponentToolbar(this.picasso, r0, viewAlmostRealProgressBar);
    }

    private void initViews() {
        ((CoordinatorLayout.C0016) findViewById(R.id.f164512131361928).getLayoutParams()).m157(new MoveUpWithSnackbarBehaviour());
    }

    static class MoveUpWithSnackbarBehaviour extends AppBarLayout.ScrollingViewBehavior {
        MoveUpWithSnackbarBehaviour() {
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return super.layoutDependsOn(coordinatorLayout, view, view2) || (view2 instanceof C0809.C0810);
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean onDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!(view2 instanceof C0809.C0810)) {
                return onDependentViewChanged;
            }
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) Math.abs(Math.min(0.0f, view2.getTranslationY() - ((float) view2.getHeight()))));
            return true;
        }
    }

    final class RefreshRequestActionHandler implements ActionHandler {
        private final String requestId;

        public final int getPriority() {
            return 0;
        }

        RefreshRequestActionHandler(String str) {
            this.requestId = str;
        }

        public final boolean canHandle(String str) {
            return str.contains("request_conversation_refresh") && str.contains(this.requestId);
        }

        public final void handle(Map<String, Object> map, Context context) {
            RequestActivity.this.store.m3992(RequestActivity.this.af.updateCommentsAsync());
        }
    }
}
