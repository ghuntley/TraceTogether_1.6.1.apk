package zendesk.support.request;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import java.util.List;
import o.nk;
import o.nl;
import zendesk.support.UiUtils;
import zendesk.support.request.RetryDialog;
import zendesk.support.request.StateUi;

class ComponentDialog implements nl<StateUi> {
    private final Activity activity;
    private final ActionFactory af;
    private Dialog dialog;
    private final nk dispatcher;

    ComponentDialog(Activity activity2, ActionFactory actionFactory, nk nkVar) {
        this.activity = activity2;
        this.af = actionFactory;
        this.dispatcher = nkVar;
    }

    private Dialog getDialogForState(StateUi.DialogState dialogState) {
        if (!(dialogState instanceof StateRetryDialog)) {
            return null;
        }
        RetryDialog retryDialog = new RetryDialog(this.activity, ((StateRetryDialog) dialogState).getMessage());
        retryDialog.setListener(new RetryDialogListener(this.af, this.dispatcher));
        return retryDialog;
    }

    public void update(StateUi stateUi) {
        StateUi.DialogState dialogState = stateUi.getDialogState();
        if (dialogState != null) {
            Dialog dialog2 = this.dialog;
            if (dialog2 == null || !dialog2.isShowing()) {
                UiUtils.dismissKeyboard(this.activity);
                this.dialog = getDialogForState(dialogState);
                this.dialog.setOnDismissListener(new OnDismissedListener(this.af, this.dispatcher));
                this.dialog.show();
            }
        }
    }

    static class RetryDialogListener implements RetryDialog.Listener {
        private final ActionFactory af;
        private final nk dispatcher;

        RetryDialogListener(ActionFactory actionFactory, nk nkVar) {
            this.af = actionFactory;
            this.dispatcher = nkVar;
        }

        public void onDeleteMessage(List<StateMessage> list) {
            for (StateMessage deleteMessage : list) {
                this.dispatcher.m3992(this.af.deleteMessage(deleteMessage));
            }
        }

        public void onRetryMessage(List<StateMessage> list) {
            onDeleteMessage(list);
            for (StateMessage resendCommentAsync : list) {
                this.dispatcher.m3992(this.af.resendCommentAsync(resendCommentAsync));
                this.dispatcher.m3992(this.af.updateCommentsAsync());
            }
        }
    }

    static class OnDismissedListener implements DialogInterface.OnDismissListener {
        private final ActionFactory af;
        private final nk dispatcher;

        OnDismissedListener(ActionFactory actionFactory, nk nkVar) {
            this.af = actionFactory;
            this.dispatcher = nkVar;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.dispatcher.m3992(this.af.onDialogDismissed());
        }
    }
}
