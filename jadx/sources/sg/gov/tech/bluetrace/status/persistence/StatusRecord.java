package sg.gov.tech.bluetrace.status.persistence;

import kotlin.Metadata;
import o.fM;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\u0018\u00002\u00020\u0018B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u000eR\"\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Lsg/gov/tech/bluetrace/status/persistence/StatusRecord;", "", "id", "I", "getId", "()I", "setId", "(I)V", "", "msg", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "", "timestamp", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "p0", "<init>", ""}, k = 1, mv = {1, 1, 16})
public final class StatusRecord {
    private int id;
    private String msg;
    private long timestamp = System.currentTimeMillis();

    public StatusRecord(String str) {
        fM.m2254(str, "");
        this.msg = str;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final void setMsg(String str) {
        fM.m2254(str, "");
        this.msg = str;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }
}
