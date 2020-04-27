package zendesk.support;

final class RequestData {
    private final int commentCount;
    private final String id;
    private int readCommentCount;

    static RequestData create(Request request) {
        return new RequestData(request.getId(), request.getCommentCount().intValue(), 0);
    }

    static RequestData create(String str, int i, int i2) {
        return new RequestData(str, i, i2);
    }

    private RequestData(String str, int i, int i2) {
        this.commentCount = i;
        this.id = str;
        this.readCommentCount = i2;
    }

    /* access modifiers changed from: package-private */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.id;
            String str2 = ((RequestData) obj).id;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestData{commentCount=");
        sb.append(this.commentCount);
        sb.append("readCommentCount=");
        sb.append(this.readCommentCount);
        sb.append(", id='");
        sb.append(this.id);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final int getReadCommentCount() {
        return this.readCommentCount;
    }

    /* access modifiers changed from: package-private */
    public final int unreadComments() {
        return this.commentCount - this.readCommentCount;
    }
}
