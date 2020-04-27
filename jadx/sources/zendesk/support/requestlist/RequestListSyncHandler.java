package zendesk.support.requestlist;

import android.content.Context;
import java.util.Map;
import zendesk.core.ActionHandler;

class RequestListSyncHandler implements ActionHandler {
    private boolean outdated = false;
    private final RequestListPresenter presenter;
    private boolean running = false;

    public int getPriority() {
        return 0;
    }

    RequestListSyncHandler(RequestListPresenter requestListPresenter) {
        this.presenter = requestListPresenter;
    }

    public boolean canHandle(String str) {
        return "request_list_refresh".equals(str);
    }

    public void handle(Map<String, Object> map, Context context) {
        if (this.running) {
            this.presenter.refresh();
            this.outdated = false;
            return;
        }
        this.outdated = true;
    }

    /* access modifiers changed from: package-private */
    public void setRunning(boolean z) {
        this.running = z;
        if (this.outdated) {
            this.presenter.refresh();
            this.outdated = false;
        }
    }
}
