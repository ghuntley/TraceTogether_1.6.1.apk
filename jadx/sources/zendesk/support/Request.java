package zendesk.support;

import java.util.Date;
import java.util.List;
import o.O;

public class Request {
    private EndUserComment comment;
    private Integer commentCount;
    private Comment firstComment;
    private String id;
    private Comment lastComment;
    private List<User> lastCommentingAgents;
    private List<Long> lastCommentingAgentsIds;
    private Date publicUpdatedAt;
    private RequestStatus status;
    private Date updatedAt;

    public String getId() {
        return this.id;
    }

    public RequestStatus getStatus() {
        return this.status;
    }

    public Date getUpdatedAt() {
        Date date = this.updatedAt;
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    public Date getPublicUpdatedAt() {
        Date date = this.publicUpdatedAt;
        if (date == null) {
            return getUpdatedAt();
        }
        return new Date(date.getTime());
    }

    public void setComment(EndUserComment endUserComment) {
        this.comment = endUserComment;
    }

    public Integer getCommentCount() {
        return this.commentCount;
    }

    public Comment getLastComment() {
        return this.lastComment;
    }

    public Comment getFirstComment() {
        return this.firstComment;
    }

    public List<User> getLastCommentingAgents() {
        return O.m1393(this.lastCommentingAgents);
    }

    /* access modifiers changed from: package-private */
    public List<Long> getLastCommentingAgentsIds() {
        return O.m1393(this.lastCommentingAgentsIds);
    }

    /* access modifiers changed from: package-private */
    public void setLastCommentingAgents(List<User> list) {
        this.lastCommentingAgents = list;
    }
}
