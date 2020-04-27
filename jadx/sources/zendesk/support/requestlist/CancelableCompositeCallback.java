package zendesk.support.requestlist;

import java.util.HashSet;
import java.util.Set;
import o.J;

class CancelableCompositeCallback {
    private Set<J> zendeskCallbacks = new HashSet();

    CancelableCompositeCallback() {
    }

    public void add(J j) {
        this.zendeskCallbacks.add(j);
    }

    public void cancel() {
        for (J j : this.zendeskCallbacks) {
            j.f1270 = true;
        }
        this.zendeskCallbacks.clear();
    }
}
