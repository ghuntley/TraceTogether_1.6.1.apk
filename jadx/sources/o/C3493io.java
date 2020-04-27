package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00020\u000f2\u00020\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00018W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00008W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/io;", "", "ǃ", "()Z", "ı", "ɩ", "()Lo/io;", "Ι", "", "p0", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "<init>", "()V", "Lo/iR;", "Lo/hW;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.io  reason: case insensitive filesystem */
public final class C3493io extends iR implements hW {
    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m2788() {
        return true;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3493io m2789() {
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m2790(String str) {
        fM.m2254(str, "");
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object r7 = m2644();
        if (r7 != null) {
            boolean z = true;
            for (iQ iQVar = (iQ) r7; !fM.m2257(iQVar, this); iQVar = iQVar.m2646()) {
                if (iQVar instanceof C3486ih) {
                    C3486ih ihVar = (C3486ih) iQVar;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(ihVar);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            fM.m2252((Object) sb2, "");
            return sb2;
        }
        throw new dA("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    public final String toString() {
        return hA.m2426() ? m2790("Active") : super.toString();
    }
}
