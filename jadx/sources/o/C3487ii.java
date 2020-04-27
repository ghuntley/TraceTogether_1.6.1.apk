package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0010\u0018\u00002\u00020\u000b2\u00020\fB\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0002\u001a\u00020\u00018\u0011@\u0010X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00018Q@\u0010X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004"}, d2 = {"Lo/ii;", "", "ι", "Z", "()Z", "Ι", "ı", "Lo/id;", "p0", "<init>", "(Lo/id;)V", "Lo/ig;", "Lo/hj;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.ii  reason: case insensitive filesystem */
public class C3487ii extends C3485ig implements C3462hj {

    /* renamed from: ι  reason: contains not printable characters */
    private final boolean f2378 = m2773();

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m2774() {
        return true;
    }

    public C3487ii(C3483id idVar) {
        super(true);
        m2733(idVar);
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public boolean m2775() {
        return this.f2378;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final boolean m2773() {
        C3485ig igVar;
        C3456hd hdVar = this.parentHandle;
        if (!(hdVar instanceof C3459hg)) {
            hdVar = null;
        }
        C3459hg hgVar = (C3459hg) hdVar;
        if (!(hgVar == null || (igVar = (C3485ig) hgVar.f2377) == null)) {
            while (!igVar.m2754()) {
                C3456hd hdVar2 = igVar.parentHandle;
                if (!(hdVar2 instanceof C3459hg)) {
                    hdVar2 = null;
                }
                C3459hg hgVar2 = (C3459hg) hdVar2;
                if (hgVar2 != null) {
                    igVar = (C3485ig) hgVar2.f2377;
                    if (igVar == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
