package zendesk.support.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import o.C;
import o.C2311;
import o.P;
import zendesk.support.Attachment;
import zendesk.support.CommentResponse;
import zendesk.support.IdUtil;

class StateMessage implements Serializable {
    private final List<StateRequestAttachment> attachments;
    private final Date date;
    private final String htmlBody;
    private final long id;
    private final String plainBody;
    private final StateMessageStatus state;
    private final long userId;

    static C2311<List<StateMessage>, StateIdMapper> convert(List<CommentResponse> list, StateIdMapper stateIdMapper, Map<Long, StateRequestAttachment> map) {
        long j;
        Map<Long, StateRequestAttachment> map2 = map;
        ArrayList arrayList = new ArrayList(list.size());
        StateIdMapper stateIdMapper2 = stateIdMapper;
        for (CommentResponse next : list) {
            Long id2 = next.getId();
            Long authorId = next.getAuthorId();
            if (!(id2 == null || authorId == null)) {
                ArrayList arrayList2 = new ArrayList();
                for (Attachment next2 : next.getAttachments()) {
                    if (map2.containsKey(next2.getId())) {
                        arrayList2.add(map2.get(next2.getId()));
                    }
                }
                if (stateIdMapper2.hasLocalId(id2)) {
                    j = stateIdMapper2.getLocalId(id2).longValue();
                } else {
                    j = IdUtil.newLongId();
                    stateIdMapper2 = stateIdMapper2.addIdMapping(id2, Long.valueOf(j));
                }
                arrayList.add(new StateMessage(next.getHtmlBody(), next.getBody(), next.getCreatedAt(), j, authorId.longValue(), StateMessageStatus.delivered(), arrayList2));
            }
        }
        return C2311.m12057(arrayList, stateIdMapper2.copy());
    }

    StateMessage(String str, List<StateRequestAttachment> list) {
        this.htmlBody = null;
        this.plainBody = str;
        this.date = new Date();
        this.id = IdUtil.newLongId();
        this.userId = -1;
        this.state = StateMessageStatus.pending();
        this.attachments = list;
    }

    StateMessage(String str, String str2, Date date2, long j, long j2, StateMessageStatus stateMessageStatus, List<StateRequestAttachment> list) {
        this.htmlBody = str;
        this.plainBody = str2;
        this.date = date2;
        this.id = j;
        this.userId = j2;
        this.state = stateMessageStatus;
        this.attachments = list;
    }

    /* access modifiers changed from: package-private */
    public String getHtmlBody() {
        return this.htmlBody;
    }

    /* access modifiers changed from: package-private */
    public String getPlainBody() {
        return this.plainBody;
    }

    /* access modifiers changed from: package-private */
    public String getBody() {
        return P.m1406(this.plainBody) ? this.plainBody : UtilsAttachment.getMessageBodyForAttachments(getAttachments());
    }

    /* access modifiers changed from: package-private */
    public Date getDate() {
        return this.date;
    }

    /* access modifiers changed from: package-private */
    public long getId() {
        return this.id;
    }

    /* access modifiers changed from: package-private */
    public long getUserId() {
        return this.userId;
    }

    /* access modifiers changed from: package-private */
    public StateMessageStatus getState() {
        return this.state;
    }

    /* access modifiers changed from: package-private */
    public List<StateRequestAttachment> getAttachments() {
        return this.attachments;
    }

    /* access modifiers changed from: package-private */
    public StateMessage withAttachments(List<StateRequestAttachment> list) {
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.id, this.userId, this.state, list);
    }

    /* access modifiers changed from: package-private */
    public StateMessage withDelivered() {
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.id, this.userId, StateMessageStatus.delivered(), this.attachments);
    }

    /* access modifiers changed from: package-private */
    public StateMessage withError(C c) {
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.id, this.userId, StateMessageStatus.error(c.m1280()), this.attachments);
    }

    /* access modifiers changed from: package-private */
    public StateMessage withPending() {
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.id, this.userId, StateMessageStatus.pending(), this.attachments);
    }

    /* access modifiers changed from: package-private */
    public StateMessage withUpdatedAttachment(StateRequestAttachment stateRequestAttachment) {
        ArrayList arrayList = new ArrayList(this.attachments.size());
        for (StateRequestAttachment next : this.attachments) {
            if (next.getId() == stateRequestAttachment.getId()) {
                next = stateRequestAttachment;
            }
            arrayList.add(next);
        }
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.id, this.userId, this.state, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StateMessage stateMessage = (StateMessage) obj;
            if (this.id != stateMessage.id || this.userId != stateMessage.userId) {
                return false;
            }
            String str = this.htmlBody;
            if (str == null ? stateMessage.htmlBody != null : !str.equals(stateMessage.htmlBody)) {
                return false;
            }
            String str2 = this.plainBody;
            if (str2 == null ? stateMessage.plainBody != null : !str2.equals(stateMessage.plainBody)) {
                return false;
            }
            Date date2 = this.date;
            if (date2 == null ? stateMessage.date != null : !date2.equals(stateMessage.date)) {
                return false;
            }
            StateMessageStatus stateMessageStatus = this.state;
            if (stateMessageStatus == null ? stateMessage.state != null : !stateMessageStatus.equals(stateMessage.state)) {
                return false;
            }
            List<StateRequestAttachment> list = this.attachments;
            List<StateRequestAttachment> list2 = stateMessage.attachments;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.htmlBody, this.plainBody, this.date, Long.valueOf(this.id), Long.valueOf(this.userId), this.state, this.attachments});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Message{htmlBody='");
        sb.append(this.htmlBody);
        sb.append('\'');
        sb.append(", plainBody='");
        sb.append(this.plainBody);
        sb.append('\'');
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", state=");
        sb.append(this.state);
        sb.append('}');
        return sb.toString();
    }
}
