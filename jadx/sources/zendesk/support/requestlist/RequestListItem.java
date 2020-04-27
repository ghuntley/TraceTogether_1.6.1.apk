package zendesk.support.requestlist;

import java.util.Date;
import java.util.List;
import o.C3623w;
import o.O;
import o.P;
import zendesk.support.request.RequestUiConfig;
import zendesk.support.requestlist.RequestInfo;

class RequestListItem {
    private final RequestInfo requestInfo;

    RequestListItem(RequestInfo requestInfo2) {
        this.requestInfo = requestInfo2;
    }

    /* access modifiers changed from: package-private */
    public boolean isFailed() {
        return O.m1394(this.requestInfo.getFailedMessageIds());
    }

    /* access modifiers changed from: package-private */
    public boolean isClosed() {
        return this.requestInfo.isClosed();
    }

    /* access modifiers changed from: package-private */
    public boolean isUnread() {
        return this.requestInfo.isUnread();
    }

    /* access modifiers changed from: package-private */
    public String getFirstMessage() {
        return this.requestInfo.getFirstMessageInfo().getBody();
    }

    /* access modifiers changed from: package-private */
    public String getLastMessage() {
        return this.requestInfo.getLastMessageInfo().getBody();
    }

    /* access modifiers changed from: package-private */
    public Date getLastUpdated() {
        return this.requestInfo.getLastUpdated();
    }

    /* access modifiers changed from: package-private */
    public boolean hasAgentReplied() {
        return O.m1394(this.requestInfo.getAgentInfos());
    }

    /* access modifiers changed from: package-private */
    public List<String> getLastCommentingAgentNames() {
        return O.m1392(this.requestInfo.getAgentInfos(), new C3623w<RequestInfo.AgentInfo, String>() {
            public String apply(RequestInfo.AgentInfo agentInfo) {
                return agentInfo.getName();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public String getAvatar() {
        return hasAgentReplied() ? this.requestInfo.getAgentInfos().get(0).getAvatar() : "";
    }

    /* access modifiers changed from: package-private */
    public long getItemId() {
        int hashCode;
        String localId = this.requestInfo.getLocalId();
        String remoteId = this.requestInfo.getRemoteId();
        if (P.m1406(localId)) {
            hashCode = localId.hashCode();
        } else {
            hashCode = remoteId.hashCode();
        }
        return (long) hashCode;
    }

    /* access modifiers changed from: package-private */
    public RequestUiConfig.Builder configure(RequestUiConfig.Builder builder) {
        return builder.withRequestInfo(this.requestInfo);
    }
}
