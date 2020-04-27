package sg.gov.tech.bluetrace.streetpass.persistence;

import kotlin.Metadata;
import o.fM;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u0000\u0018\u00002\u00020/BA\u0012\u0006\u0010&\u001a\u00020\u0001\u0012\u0006\u0010'\u001a\u00020\b\u0012\u0006\u0010(\u001a\u00020\b\u0012\u0006\u0010)\u001a\u00020\b\u0012\u0006\u0010*\u001a\u00020\b\u0012\u0006\u0010+\u001a\u00020\u0001\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b-\u0010.R\"\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\b8\u0006@\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u00020\b8\u0006@\u0007¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u0012R\u0019\u0010\u0016\u001a\u00020\u00018\u0006@\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0017\u0010\u0005R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00018\u0006@\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0003\u001a\u0004\b$\u0010\u0005\"\u0004\b%\u0010\u0007"}, d2 = {"Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;", "", "id", "I", "getId", "()I", "setId", "(I)V", "", "modelC", "Ljava/lang/String;", "getModelC", "()Ljava/lang/String;", "modelP", "getModelP", "msg", "getMsg", "setMsg", "(Ljava/lang/String;)V", "org", "getOrg", "setOrg", "rssi", "getRssi", "", "timestamp", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "txPower", "Ljava/lang/Integer;", "getTxPower", "()Ljava/lang/Integer;", "v", "getV", "setV", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", ""}, k = 1, mv = {1, 1, 16})
public final class StreetPassRecord {
    private int id;
    private final String modelC;
    private final String modelP;
    private String msg;
    private String org;
    private final int rssi;
    private long timestamp = System.currentTimeMillis();
    private final Integer txPower;
    private int v;

    public StreetPassRecord(int i, String str, String str2, String str3, String str4, int i2, Integer num) {
        fM.m2254(str, "");
        fM.m2254(str2, "");
        fM.m2254(str3, "");
        fM.m2254(str4, "");
        this.v = i;
        this.msg = str;
        this.org = str2;
        this.modelP = str3;
        this.modelC = str4;
        this.rssi = i2;
        this.txPower = num;
    }

    public final int getV() {
        return this.v;
    }

    public final void setV(int i) {
        this.v = i;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final void setMsg(String str) {
        fM.m2254(str, "");
        this.msg = str;
    }

    public final String getOrg() {
        return this.org;
    }

    public final void setOrg(String str) {
        fM.m2254(str, "");
        this.org = str;
    }

    public final String getModelP() {
        return this.modelP;
    }

    public final String getModelC() {
        return this.modelC;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public final Integer getTxPower() {
        return this.txPower;
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
