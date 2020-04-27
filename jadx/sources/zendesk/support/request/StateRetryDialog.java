package zendesk.support.request;

import java.io.Serializable;
import java.util.List;
import zendesk.support.request.StateUi;

class StateRetryDialog implements StateUi.DialogState, Serializable {
    private final List<StateMessage> message;
    private final boolean visible;

    StateRetryDialog(List<StateMessage> list) {
        this(list, false);
    }

    private StateRetryDialog(List<StateMessage> list, boolean z) {
        this.message = list;
        this.visible = z;
    }

    /* access modifiers changed from: package-private */
    public List<StateMessage> getMessage() {
        return this.message;
    }
}
