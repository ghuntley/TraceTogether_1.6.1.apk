package zendesk.support.request;

import java.io.Serializable;

class StateUi implements Serializable {
    private final DialogState dialogState;

    interface DialogState {
    }

    StateUi(DialogState dialogState2) {
        this.dialogState = dialogState2;
    }

    StateUi() {
        this.dialogState = null;
    }

    /* access modifiers changed from: package-private */
    public DialogState getDialogState() {
        return this.dialogState;
    }

    /* access modifiers changed from: package-private */
    public StateUi setDialogState(DialogState dialogState2) {
        return new StateUi(dialogState2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UiState{dialogState=");
        sb.append(this.dialogState);
        sb.append('}');
        return sb.toString();
    }
}
