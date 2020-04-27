package zendesk.support.request;

import java.io.Serializable;

class StateMessageStatus implements Serializable {
    private final String errorResponse;
    private final int status;

    static StateMessageStatus delivered() {
        return new StateMessageStatus(2, (String) null);
    }

    static StateMessageStatus pending() {
        return new StateMessageStatus(3, (String) null);
    }

    static StateMessageStatus error(String str) {
        return new StateMessageStatus(1, str);
    }

    private StateMessageStatus(int i, String str) {
        this.status = i;
        this.errorResponse = str;
    }

    /* access modifiers changed from: package-private */
    public int getStatus() {
        return this.status;
    }

    public String toString() {
        int i = this.status;
        String str = i != 1 ? i != 2 ? i != 3 ? "Unknown" : "Pending" : "Delivered" : "Error";
        StringBuilder sb = new StringBuilder("MessageState{status=");
        sb.append(str);
        sb.append(", errorResponse=");
        sb.append(this.errorResponse);
        sb.append('}');
        return sb.toString();
    }
}
