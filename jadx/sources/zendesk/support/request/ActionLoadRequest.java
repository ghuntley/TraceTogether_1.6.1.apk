package zendesk.support.request;

import o.C;
import o.F;
import o.G;
import o.P;
import o.nk;
import o.no;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.request.AsyncMiddleware;

class ActionLoadRequest implements AsyncMiddleware.AsyncAction {
    /* access modifiers changed from: private */
    public final ActionFactory af;
    private final RequestProvider requestProvider;

    ActionLoadRequest(ActionFactory actionFactory, RequestProvider requestProvider2) {
        this.af = actionFactory;
        this.requestProvider = requestProvider2;
    }

    public void actionQueued(nk nkVar, no noVar) {
        nkVar.m3992(this.af.loadRequest());
    }

    public void execute(final nk nkVar, no noVar, final AsyncMiddleware.Callback callback) {
        StateConversation fromState = StateConversation.fromState(noVar.m4002());
        String remoteId = fromState.getRemoteId();
        if (!P.m1406(remoteId)) {
            F.m1359();
            nkVar.m3992(this.af.skipAction());
            callback.done();
        } else if (fromState.getStatus() != null) {
            F.m1359();
            nkVar.m3992(this.af.skipAction());
            callback.done();
        } else {
            this.requestProvider.getRequest(remoteId, new G<Request>() {
                public void onSuccess(Request request) {
                    nkVar.m3992(ActionLoadRequest.this.af.loadRequestSuccess(request));
                    callback.done();
                }

                public void onError(C c) {
                    new Object[1][0] = c.m1280();
                    F.m1361();
                    nkVar.m3992(ActionLoadRequest.this.af.loadRequestError(c));
                    callback.done();
                }
            });
        }
    }
}
