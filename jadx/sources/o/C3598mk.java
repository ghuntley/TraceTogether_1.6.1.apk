package o;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\u0018\u00002\u00020\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR%\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n"}, d2 = {"Lo/mk;", "Landroidx/lifecycle/LiveData;", "", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;", "ı", "Landroidx/lifecycle/LiveData;", "ǃ", "()Landroidx/lifecycle/LiveData;", "ι", "Lo/me;", "Lo/me;", "p0", "<init>", "(Lo/me;)V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.mk  reason: case insensitive filesystem */
public final class C3598mk {

    /* renamed from: ı  reason: contains not printable characters */
    private final LiveData<List<StreetPassRecord>> f3275 = this.f3276.m3825();

    /* renamed from: ι  reason: contains not printable characters */
    private final C3592me f3276;

    public C3598mk(C3592me meVar) {
        fM.m2254(meVar, "");
        this.f3276 = meVar;
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final LiveData<List<StreetPassRecord>> m3900() {
        return this.f3275;
    }
}
