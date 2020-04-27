package zendesk.support.request;

import java.io.Serializable;
import o.nt;

class StateProgress implements Serializable {
    private final int runningRequests;

    static StateProgress fomState(nt ntVar) {
        Class<StateProgress> cls = StateProgress.class;
        Object obj = ntVar.f3432.get(cls.getSimpleName());
        if (!cls.isInstance(obj)) {
            obj = null;
        }
        StateProgress stateProgress = (StateProgress) obj;
        if (stateProgress != null) {
            return stateProgress;
        }
        return new StateProgress();
    }

    StateProgress() {
        this.runningRequests = 0;
    }

    StateProgress(int i) {
        this.runningRequests = i;
    }

    /* access modifiers changed from: package-private */
    public int getRunningRequests() {
        return this.runningRequests;
    }

    /* access modifiers changed from: package-private */
    public StateProgress increment() {
        return new StateProgress(this.runningRequests + 1);
    }

    /* access modifiers changed from: package-private */
    public StateProgress decrement() {
        int i = this.runningRequests;
        if (i > 0) {
            return new StateProgress(i - 1);
        }
        return new StateProgress(0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Progress{runningRequests=");
        sb.append(this.runningRequests);
        sb.append('}');
        return sb.toString();
    }
}
