package o;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecordDatabase;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0000\u0018\u00002\u00020\u0015B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0006\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\rJ\u001b\u0010\n\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u00020\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0002\u001a\u00020\u00058\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/mi;", "Landroid/content/Context;", "ı", "Landroid/content/Context;", "ǃ", "Lo/me;", "ɩ", "Lo/me;", "", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;", "ι", "()Ljava/util/List;", "", "()V", "", "p0", "(JLo/er;)Ljava/lang/Object;", "Ι", "(Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;Lo/er;)Ljava/lang/Object;", "<init>", "(Landroid/content/Context;)V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.mi  reason: case insensitive filesystem */
public final class C3596mi {

    /* renamed from: ı  reason: contains not printable characters */
    public final Context f3261;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3592me f3262 = StreetPassRecordDatabase.If.m16307(this.f3261).m16303();

    public C3596mi(Context context) {
        fM.m2254(context, "");
        this.f3261 = context;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Object m3880(StreetPassRecord streetPassRecord, C3390er<? super dF> erVar) {
        Object r2 = this.f3262.m3823(streetPassRecord, erVar);
        if (r2 == eF.m2136()) {
            return r2;
        }
        return dF.f2032;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3879() {
        this.f3262.m3824();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final List<StreetPassRecord> m3882() {
        return this.f3262.m3822();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Object m3881(long j, C3390er<? super dF> erVar) {
        Object r2 = this.f3262.m3826(j, erVar);
        if (r2 == eF.m2136()) {
            return r2;
        }
        return dF.f2032;
    }
}
