package zendesk.support;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.C;
import o.G;
import o.J;

public final class AggregatedCallback<T> extends G<T> {
    private final Set<J<T>> callbackSet = Collections.synchronizedSet(new HashSet());

    public final void onSuccess(T t) {
        for (J<T> onSuccess : this.callbackSet) {
            onSuccess.onSuccess(t);
        }
        this.callbackSet.clear();
    }

    public final void onError(C c) {
        for (J<T> onError : this.callbackSet) {
            onError.onError(c);
        }
        this.callbackSet.clear();
    }

    public final boolean add(G<T> g) {
        boolean isEmpty = this.callbackSet.isEmpty();
        this.callbackSet.add(J.m1377(g));
        return isEmpty;
    }

    public final void cancel() {
        for (J<T> j : this.callbackSet) {
            j.f1270 = true;
        }
        this.callbackSet.clear();
    }
}
