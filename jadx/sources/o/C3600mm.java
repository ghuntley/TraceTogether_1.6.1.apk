package o;

import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecordDatabase;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u00002\u00020\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00018\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/mm;", "Landroidx/lifecycle/LiveData;", "", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;", "ι", "Landroidx/lifecycle/LiveData;", "Ι", "()Landroidx/lifecycle/LiveData;", "ɩ", "Lo/mk;", "ı", "Lo/mk;", "Landroid/app/Application;", "p0", "<init>", "(Landroid/app/Application;)V", "Lo/ІƖ;"}, k = 1, mv = {1, 1, 16})
/* renamed from: o.mm  reason: case insensitive filesystem */
public final class C3600mm extends C2222 {

    /* renamed from: ı  reason: contains not printable characters */
    private C3598mk f3286;

    /* renamed from: ι  reason: contains not printable characters */
    private LiveData<List<StreetPassRecord>> f3287 = this.f3286.m3900();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3600mm(Application application) {
        super(application);
        fM.m2254(application, "");
        this.f3286 = new C3598mk(StreetPassRecordDatabase.If.m16307(application).m16303());
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final LiveData<List<StreetPassRecord>> m3910() {
        return this.f3287;
    }
}
