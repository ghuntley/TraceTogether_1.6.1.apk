package zendesk.support.request;

import java.io.Serializable;
import o.nt;

class StateAndroidLifecycle implements Serializable {
    private final int state;

    static StateAndroidLifecycle fromState(nt ntVar) {
        Class<StateAndroidLifecycle> cls = StateAndroidLifecycle.class;
        Object obj = ntVar.f3432.get(cls.getSimpleName());
        if (!cls.isInstance(obj)) {
            obj = null;
        }
        StateAndroidLifecycle stateAndroidLifecycle = (StateAndroidLifecycle) obj;
        if (stateAndroidLifecycle != null) {
            return stateAndroidLifecycle;
        }
        return new StateAndroidLifecycle();
    }

    public StateAndroidLifecycle() {
        this.state = 1;
    }

    public StateAndroidLifecycle(int i) {
        this.state = i;
    }

    public int getState() {
        return this.state;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidLifeCycle{state=");
        sb.append(this.state);
        sb.append('}');
        return sb.toString();
    }
}
