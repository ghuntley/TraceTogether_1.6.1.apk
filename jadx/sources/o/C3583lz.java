package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import sg.gov.tech.bluetrace.status.persistence.StatusRecord;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\u0018\u00002\u00020\rB#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00018\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006"}, d2 = {"Lo/lz;", "", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;", "ɩ", "Ljava/util/List;", "ι", "()Ljava/util/List;", "ı", "Lsg/gov/tech/bluetrace/status/persistence/StatusRecord;", "p0", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.lz  reason: case insensitive filesystem */
public final class C3583lz {

    /* renamed from: ɩ  reason: contains not printable characters */
    private List<StreetPassRecord> f3034;

    /* renamed from: ι  reason: contains not printable characters */
    private List<StatusRecord> f3035;

    public C3583lz(List<StreetPassRecord> list, List<StatusRecord> list2) {
        fM.m2254(list, "");
        fM.m2254(list2, "");
        this.f3034 = list;
        this.f3035 = list2;
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final List<StreetPassRecord> m3718() {
        return this.f3034;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<StatusRecord> m3717() {
        return this.f3035;
    }
}
