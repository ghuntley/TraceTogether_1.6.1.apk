package sg.gov.tech.bluetrace.idmanager;

import kotlin.Metadata;
import o.fL;
import o.fM;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\u0018\u0000 \u00012\u00020\u0019:\u0001\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lsg/gov/tech/bluetrace/idmanager/TemporaryID;", "Companion", "", "expiryTime", "J", "getExpiryTime", "()J", "startTime", "getStartTime", "", "tempID", "Ljava/lang/String;", "getTempID", "()Ljava/lang/String;", "", "isValidForCurrentTime", "()Z", "", "print", "()V", "p0", "p1", "p2", "<init>", "(JLjava/lang/String;J)V", ""}, k = 1, mv = {1, 1, 16})
public final class TemporaryID {
    public static final Companion Companion = new Companion((fL) null);
    private static final String TAG = "TempID";
    private final long expiryTime;
    private final long startTime;
    private final String tempID;

    public TemporaryID(long j, String str, long j2) {
        fM.m2254(str, "");
        this.startTime = j;
        this.tempID = str;
        this.expiryTime = j2;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTempID() {
        return this.tempID;
    }

    public final long getExpiryTime() {
        return this.expiryTime;
    }

    public final boolean isValidForCurrentTime() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = (long) 1000;
        return currentTimeMillis > this.startTime * j && currentTimeMillis < this.expiryTime * j;
    }

    public final void print() {
        long j = (long) 1000;
        long j2 = this.startTime * j;
        long j3 = this.expiryTime * j;
        lA.C0215 r2 = lA.f2728;
        r2.m3368(TAG, "[TempID] Start time: " + j2);
        lA.C0215 r0 = lA.f2728;
        r0.m3368(TAG, "[TempID] Expiry time: " + j3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsg/gov/tech/bluetrace/idmanager/TemporaryID$Companion;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(fL fLVar) {
            this();
        }
    }
}
