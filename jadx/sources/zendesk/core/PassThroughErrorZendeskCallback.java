package zendesk.core;

import o.C;
import o.G;

abstract class PassThroughErrorZendeskCallback<E> extends G<E> {
    private final G callback;

    PassThroughErrorZendeskCallback(G g) {
        this.callback = g;
    }

    public void onError(C c) {
        G g = this.callback;
        if (g != null) {
            g.onError(c);
        }
    }
}
