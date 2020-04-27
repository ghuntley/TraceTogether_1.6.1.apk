package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C2319;
import o.C2452;
import o.C2456;
import o.C2851;
import o.C3396ex;
import o.fM;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00020\u00122\u00020\u0013J\u001f\u0010\u0006\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0006\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00018\u0017@\u0016X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\n\u001a\u00020\u00078\u0011@\u0010X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Lo/ex;", "ι", "Lo/ex;", "R_", "()Lo/ex;", "ɩ", "Lo/Іӏ;", "ǃ", "Lo/Іӏ;", "Ι", "()Lo/Іӏ;", "Lo/Ӏӏ;", "p0", "Lo/Іӏ$ǃ;", "p1", "", "(Lo/Ӏӏ;Lo/Іӏ$ǃ;)V", "Lo/н;", "Lo/п;"}, k = 1, mv = {1, 1, 15})
public final class LifecycleCoroutineScopeImpl extends C2452 implements C2456 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2319 f230;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3396ex f231;

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final C2319 m187() {
        return this.f230;
    }

    @JvmName(name = "R_")
    public final C3396ex R_() {
        return this.f231;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m186(C2851 r2, C2319.C2320 r3) {
        fM.m2254(r2, "");
        fM.m2254(r3, "");
        if (m187().m12096().compareTo(C2319.Cif.DESTROYED) <= 0) {
            m187().m12097(this);
            C3488ij.m2779$default(R_(), (CancellationException) null, 1, (Object) null);
        }
    }
}
