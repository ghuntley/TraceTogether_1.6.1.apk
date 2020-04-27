package zendesk.support.request;

import android.app.Activity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.C0809;
import o.R;
import o.nk;
import o.nl;
import o.nq;
import o.nt;
import zendesk.support.request.StateError;

class ComponentError implements nl<ErrorStateModel> {
    /* access modifiers changed from: private */
    public final ActionFactory af;
    private final CoordinatorLayout container;
    /* access modifiers changed from: private */
    public final nk dispatcher;
    /* access modifiers changed from: private */
    public StateError.ErrorType errorState;
    private C0809 snackbar;

    static ComponentError create(Activity activity, nk nkVar, ActionFactory actionFactory) {
        return new ComponentError((CoordinatorLayout) activity.findViewById(R.id.f164422131361919), nkVar, actionFactory);
    }

    static nq<ErrorStateModel> getSelector() {
        return new ErrorStateSelector();
    }

    private ComponentError(CoordinatorLayout coordinatorLayout, nk nkVar, ActionFactory actionFactory) {
        this.container = coordinatorLayout;
        this.dispatcher = nkVar;
        this.af = actionFactory;
    }

    public void update(ErrorStateModel errorStateModel) {
        if (errorStateModel.errorState != this.errorState) {
            this.errorState = errorStateModel.errorState;
            if (errorStateModel.errorState != StateError.ErrorType.NoError) {
                this.snackbar = C0809.m6203(this.container, errorStateModel.getErrorMessage());
                int i = AnonymousClass2.$SwitchMap$zendesk$support$request$StateError$ErrorType[errorStateModel.getErrorState().ordinal()];
                if (i == 1) {
                    this.snackbar.m6205(R.string.f171142131886279);
                    this.snackbar.m6207(R.string.f171382131886305, new View.OnClickListener() {
                        public void onClick(View view) {
                            StateError.ErrorType unused = ComponentError.this.errorState = StateError.ErrorType.NoError;
                            ComponentError.this.dispatcher.m3992(ComponentError.this.af.initialLoadCommentsAsync());
                        }
                    });
                    this.snackbar.m1025();
                } else if (i == 2 && !errorStateModel.isConversationsEnabled()) {
                    this.snackbar.m6205(R.string.f171132131886278);
                    this.snackbar.m1025();
                }
            } else {
                C0809 r3 = this.snackbar;
                if (r3 != null) {
                    r3.m1023();
                }
            }
        }
    }

    /* renamed from: zendesk.support.request.ComponentError$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$request$StateError$ErrorType = new int[StateError.ErrorType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                zendesk.support.request.StateError$ErrorType[] r0 = zendesk.support.request.StateError.ErrorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$support$request$StateError$ErrorType = r0
                int[] r0 = $SwitchMap$zendesk$support$request$StateError$ErrorType     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.support.request.StateError$ErrorType r1 = zendesk.support.request.StateError.ErrorType.InitialGetComments     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$support$request$StateError$ErrorType     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.support.request.StateError$ErrorType r1 = zendesk.support.request.StateError.ErrorType.InputFormSubmission     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.ComponentError.AnonymousClass2.<clinit>():void");
        }
    }

    static class ErrorStateSelector implements nq<ErrorStateModel> {
        ErrorStateSelector() {
        }

        public ErrorStateModel selectData(nt ntVar) {
            StateError fromState = StateError.fromState(ntVar);
            return new ErrorStateModel(fromState.getState(), fromState.getMessage(), StateConfig.fromState(ntVar).getSettings().isConversationsEnabled());
        }
    }

    static class ErrorStateModel {
        private final boolean conversationsEnabled;
        private final String errorMessage;
        /* access modifiers changed from: private */
        public final StateError.ErrorType errorState;

        ErrorStateModel(StateError.ErrorType errorType, String str, boolean z) {
            this.errorState = errorType;
            this.errorMessage = str;
            this.conversationsEnabled = z;
        }

        /* access modifiers changed from: package-private */
        public StateError.ErrorType getErrorState() {
            return this.errorState;
        }

        /* access modifiers changed from: package-private */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /* access modifiers changed from: package-private */
        public boolean isConversationsEnabled() {
            return this.conversationsEnabled;
        }
    }
}
