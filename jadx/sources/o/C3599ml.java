package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\u0018\u00002\u00020\u001cB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u001bR\u0019\u0010\u0006\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0019\u0010\b\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\u0007\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\u0006\u0010\u0005R\u0019\u0010\u0002\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0003\u001a\u0004\b\u000e\u0010\u0005R\u0019\u0010\f\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0013\u001a\u00020\u00108\u0007@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0002\u0010\u0012R\u001b\u0010\n\u001a\u0004\u0018\u00010\t8\u0007@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u000f\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\b\u0010\r"}, d2 = {"Lo/ml;", "", "Ι", "Ljava/lang/String;", "ı", "()Ljava/lang/String;", "ɩ", "ι", "ǃ", "", "Ӏ", "I", "І", "()I", "і", "Ɩ", "", "J", "()J", "ɹ", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;", "p0", "<init>", "(Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;)V", "p1", "(Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;I)V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.ml  reason: case insensitive filesystem */
public final class C3599ml {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f3277;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f3278;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f3279;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Integer f3280;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f3281;

    /* renamed from: ι  reason: contains not printable characters */
    private final long f3282;

    /* renamed from: І  reason: contains not printable characters */
    private final String f3283;

    /* renamed from: і  reason: contains not printable characters */
    private final int f3284;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final int f3285;

    public C3599ml(StreetPassRecord streetPassRecord, int i) {
        fM.m2254(streetPassRecord, "");
        this.f3285 = i;
        this.f3279 = streetPassRecord.getV();
        this.f3281 = streetPassRecord.getModelC();
        this.f3277 = streetPassRecord.getModelP();
        this.f3278 = streetPassRecord.getMsg();
        this.f3282 = streetPassRecord.getTimestamp();
        this.f3284 = streetPassRecord.getRssi();
        this.f3280 = streetPassRecord.getTxPower();
        this.f3283 = streetPassRecord.getOrg();
    }

    @JvmName(name = "І")
    /* renamed from: І  reason: contains not printable characters */
    public final int m3908() {
        return this.f3285;
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m3903() {
        return this.f3279;
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final String m3901() {
        return this.f3281;
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final String m3907() {
        return this.f3277;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m3904() {
        return this.f3278;
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final long m3906() {
        return this.f3282;
    }

    @JvmName(name = "Ɩ")
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final int m3902() {
        return this.f3284;
    }

    @JvmName(name = "ɹ")
    /* renamed from: ɹ  reason: contains not printable characters */
    public final Integer m3905() {
        return this.f3280;
    }

    @JvmName(name = "і")
    /* renamed from: і  reason: contains not printable characters */
    public final String m3909() {
        return this.f3283;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3599ml(StreetPassRecord streetPassRecord) {
        this(streetPassRecord, 1);
        fM.m2254(streetPassRecord, "");
    }
}
