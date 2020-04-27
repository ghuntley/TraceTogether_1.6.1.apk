package o;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import sg.gov.tech.bluetrace.status.persistence.StatusRecord;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecordDatabase;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\u0018\u00002\u00020\u0013B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u000fJ\u001b\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0010R\u0015\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/lV;", "Landroid/content/Context;", "ι", "Landroid/content/Context;", "Lo/lX;", "ɩ", "Lo/lX;", "ǃ", "", "Lsg/gov/tech/bluetrace/status/persistence/StatusRecord;", "ı", "()Ljava/util/List;", "", "p0", "", "(JLo/er;)Ljava/lang/Object;", "(Lsg/gov/tech/bluetrace/status/persistence/StatusRecord;Lo/er;)Ljava/lang/Object;", "<init>", "(Landroid/content/Context;)V", ""}, k = 1, mv = {1, 1, 16})
public final class lV {

    /* renamed from: ɩ  reason: contains not printable characters */
    public final lX f2862 = StreetPassRecordDatabase.If.m16307(this.f2863).m16304();

    /* renamed from: ι  reason: contains not printable characters */
    public final Context f2863;

    public lV(Context context) {
        fM.m2254(context, "");
        this.f2863 = context;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Object m3528(StatusRecord statusRecord, C3390er<? super dF> erVar) {
        Object r2 = this.f2862.m3546(statusRecord, erVar);
        if (r2 == eF.m2136()) {
            return r2;
        }
        return dF.f2032;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final List<StatusRecord> m3526() {
        return this.f2862.m3544();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Object m3527(long j, C3390er<? super dF> erVar) {
        Object r2 = this.f2862.m3545(j, erVar);
        if (r2 == eF.m2136()) {
            return r2;
        }
        return dF.f2032;
    }
}
