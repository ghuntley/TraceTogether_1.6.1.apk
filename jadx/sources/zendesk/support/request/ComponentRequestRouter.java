package zendesk.support.request;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReference;
import o.C1459;
import o.C1819;
import o.C1976;
import o.C2183;
import o.F;
import o.P;
import o.R;
import o.nl;
import o.nq;
import o.nt;
import zendesk.support.request.StateError;

class ComponentRequestRouter implements nl<RequestScreen> {
    private final C1459 activity;
    private final RequestComponent component;
    private RequestView currentScreen;
    private final RequestViewConversationsDisabled disabledView;
    private final RequestViewConversationsEnabled enabledView;
    private final boolean isCleanStart;
    private final RequestViewLoading loadingView;
    private final ViewGroup root;
    private final AtomicReference<RequestScreen> screen = new AtomicReference<>();

    enum RequestScreen {
        Loading,
        EmailForm,
        Conversation,
        Fin
    }

    static ComponentRequestRouter create(C1459 r9, boolean z, RequestComponent requestComponent) {
        return new ComponentRequestRouter(r9, (ViewGroup) r9.findViewById(R.id.f164512131361928), (RequestViewConversationsDisabled) r9.findViewById(R.id.f164462131361923), (RequestViewConversationsEnabled) r9.findViewById(R.id.f164452131361922), (RequestViewLoading) r9.findViewById(R.id.f164472131361924), requestComponent, z);
    }

    ComponentRequestRouter(C1459 r1, ViewGroup viewGroup, RequestViewConversationsDisabled requestViewConversationsDisabled, RequestViewConversationsEnabled requestViewConversationsEnabled, RequestViewLoading requestViewLoading, RequestComponent requestComponent, boolean z) {
        this.activity = r1;
        this.root = viewGroup;
        this.disabledView = requestViewConversationsDisabled;
        this.enabledView = requestViewConversationsEnabled;
        this.loadingView = requestViewLoading;
        this.component = requestComponent;
        this.isCleanStart = z;
    }

    /* access modifiers changed from: package-private */
    public RequestView getCurrentScreen() {
        return this.currentScreen;
    }

    public void update(RequestScreen requestScreen) {
        if (this.screen.getAndSet(requestScreen) != requestScreen) {
            int i = AnonymousClass1.$SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen[requestScreen.ordinal()];
            if (i == 1) {
                F.m1359();
                RequestViewLoading requestViewLoading = this.loadingView;
                this.currentScreen = requestViewLoading;
                displayView(requestViewLoading, this.disabledView, this.enabledView);
            } else if (i == 2) {
                F.m1359();
                RequestViewConversationsDisabled requestViewConversationsDisabled = this.disabledView;
                this.currentScreen = requestViewConversationsDisabled;
                displayView(requestViewConversationsDisabled, this.enabledView, this.loadingView);
                this.disabledView.init(this.component);
            } else if (i == 3) {
                F.m1359();
                RequestViewConversationsEnabled requestViewConversationsEnabled = this.enabledView;
                this.currentScreen = requestViewConversationsEnabled;
                displayView(requestViewConversationsEnabled, this.disabledView, this.loadingView);
                this.enabledView.init(this.component, this.isCleanStart);
            } else if (i == 4) {
                F.m1359();
                this.activity.finish();
            }
        }
    }

    /* renamed from: zendesk.support.request.ComponentRequestRouter$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen = new int[RequestScreen.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                zendesk.support.request.ComponentRequestRouter$RequestScreen[] r0 = zendesk.support.request.ComponentRequestRouter.RequestScreen.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen = r0
                int[] r0 = $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.support.request.ComponentRequestRouter$RequestScreen r1 = zendesk.support.request.ComponentRequestRouter.RequestScreen.Loading     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.support.request.ComponentRequestRouter$RequestScreen r1 = zendesk.support.request.ComponentRequestRouter.RequestScreen.EmailForm     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen     // Catch:{ NoSuchFieldError -> 0x002a }
                zendesk.support.request.ComponentRequestRouter$RequestScreen r1 = zendesk.support.request.ComponentRequestRouter.RequestScreen.Conversation     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen     // Catch:{ NoSuchFieldError -> 0x0035 }
                zendesk.support.request.ComponentRequestRouter$RequestScreen r1 = zendesk.support.request.ComponentRequestRouter.RequestScreen.Fin     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.ComponentRequestRouter.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public nq<RequestScreen> getSelector() {
        return new RequestRouterSelector();
    }

    private void displayView(View view, View... viewArr) {
        C2183.m11566(this.root, (C1976) new C1819());
        view.setVisibility(0);
        for (View visibility : viewArr) {
            visibility.setVisibility(8);
        }
        this.activity.invalidateOptionsMenu();
        C2183.m11570(this.root);
    }

    static class RequestRouterSelector implements nq<RequestScreen> {
        RequestRouterSelector() {
        }

        public RequestScreen selectData(nt ntVar) {
            StateConfig fromState = StateConfig.fromState(ntVar);
            StateConversation fromState2 = StateConversation.fromState(ntVar);
            StateSettings settings = fromState.getSettings();
            StateError fromState3 = StateError.fromState(ntVar);
            boolean hasSettings = settings.hasSettings();
            boolean r1 = P.m1406(fromState2.getRemoteId());
            boolean isConversationsEnabled = settings.isConversationsEnabled();
            boolean hasIdentityEmailAddress = settings.hasIdentityEmailAddress();
            boolean isNeverRequestEmailOn = settings.isNeverRequestEmailOn();
            if (fromState3.getState() == StateError.ErrorType.NoAccess) {
                new Object[1][0] = fromState3.getMessage();
                F.m1358();
                return RequestScreen.Fin;
            } else if (!hasSettings) {
                return RequestScreen.Loading;
            } else {
                if (isConversationsEnabled) {
                    return RequestScreen.Conversation;
                }
                if (r1) {
                    F.m1361();
                    return RequestScreen.Fin;
                } else if (hasIdentityEmailAddress || !isNeverRequestEmailOn) {
                    return RequestScreen.EmailForm;
                } else {
                    F.m1361();
                    return RequestScreen.Fin;
                }
            }
        }
    }
}
