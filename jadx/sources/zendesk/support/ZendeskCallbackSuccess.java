package zendesk.support;

import o.C;
import o.G;

abstract class ZendeskCallbackSuccess<E> extends G<E> {
    private final G callback;

    ZendeskCallbackSuccess(G g) {
        this.callback = g;
    }

    public void onError(C c) {
        G g = this.callback;
        if (g != null) {
            g.onError(c);
        }
    }
}
