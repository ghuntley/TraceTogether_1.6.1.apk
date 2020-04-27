package o;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0010J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0005H&¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/me;", "", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;", "ǃ", "()Ljava/util/List;", "Landroidx/lifecycle/LiveData;", "ι", "()Landroidx/lifecycle/LiveData;", "Ι", "p0", "", "ɩ", "(Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;Lo/er;)Ljava/lang/Object;", "()V", "", "(JLo/er;)Ljava/lang/Object;", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.me  reason: case insensitive filesystem */
public interface C3592me {
    /* renamed from: ǃ  reason: contains not printable characters */
    List<StreetPassRecord> m3822();

    /* renamed from: ɩ  reason: contains not printable characters */
    Object m3823(StreetPassRecord streetPassRecord, C3390er<? super dF> erVar);

    /* renamed from: ɩ  reason: contains not printable characters */
    void m3824();

    /* renamed from: Ι  reason: contains not printable characters */
    LiveData<List<StreetPassRecord>> m3825();

    /* renamed from: Ι  reason: contains not printable characters */
    Object m3826(long j, C3390er<? super dF> erVar);

    /* renamed from: ι  reason: contains not printable characters */
    LiveData<StreetPassRecord> m3827();
}
