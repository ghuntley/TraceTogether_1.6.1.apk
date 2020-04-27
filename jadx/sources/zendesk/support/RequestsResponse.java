package zendesk.support;

import java.util.List;
import o.O;

class RequestsResponse extends ResponseWrapper {
    private List<User> lastCommentingAgents;
    private List<Request> requests;

    RequestsResponse() {
    }

    /* access modifiers changed from: package-private */
    public List<Request> getRequests() {
        return O.m1393(this.requests);
    }

    /* access modifiers changed from: package-private */
    public List<User> getLastCommentingAgents() {
        return O.m1393(this.lastCommentingAgents);
    }
}
