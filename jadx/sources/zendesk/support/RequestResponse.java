package zendesk.support;

import java.util.List;
import o.O;

class RequestResponse {
    private List<User> lastCommentingAgents;
    private Request request;

    RequestResponse() {
    }

    /* access modifiers changed from: package-private */
    public Request getRequest() {
        return this.request;
    }

    /* access modifiers changed from: package-private */
    public List<User> getLastCommentingAgents() {
        return O.m1393(this.lastCommentingAgents);
    }
}
