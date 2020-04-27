package o;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import sg.gov.tech.bluetrace.status.persistence.StatusRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u000fJ\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0003\u0010\bJ\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/lX;", "", "Lsg/gov/tech/bluetrace/status/persistence/StatusRecord;", "ı", "()Ljava/util/List;", "", "p0", "Landroidx/lifecycle/LiveData;", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "", "ι", "(Lsg/gov/tech/bluetrace/status/persistence/StatusRecord;Lo/er;)Ljava/lang/Object;", "", "ɩ", "(JLo/er;)Ljava/lang/Object;", ""}, k = 1, mv = {1, 1, 16})
public interface lX {
    /* renamed from: ı  reason: contains not printable characters */
    LiveData<StatusRecord> m3543(String str);

    /* renamed from: ı  reason: contains not printable characters */
    List<StatusRecord> m3544();

    /* renamed from: ɩ  reason: contains not printable characters */
    Object m3545(long j, C3390er<? super dF> erVar);

    /* renamed from: ι  reason: contains not printable characters */
    Object m3546(StatusRecord statusRecord, C3390er<? super dF> erVar);
}
