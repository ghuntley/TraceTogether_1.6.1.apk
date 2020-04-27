package o;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00060\u0018j\u0002`\u00192\b\u0012\u0004\u0012\u00020\u00000\u001aB!\u0012\u0006\u0010\u0007\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00018\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/hZ;", "Lo/id;", "ɩ", "Lo/id;", "Ι", "()Lo/hZ;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lo/id;)V", "Ljava/util/concurrent/CancellationException;", "Lo/Ι;", "Lo/hn;"}, k = 1, mv = {1, 1, 15})
public final class hZ extends CancellationException implements C3466hn<hZ> {

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3483id f2280;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hZ(String str, Throwable th, C3483id idVar) {
        super(str);
        fM.m2254(str, "");
        fM.m2254(idVar, "");
        this.f2280 = idVar;
        if (th != null) {
            initCause(th);
        }
    }

    public final Throwable fillInStackTrace() {
        if (!hA.m2426()) {
            return this;
        }
        Throwable fillInStackTrace = super.fillInStackTrace();
        fM.m2252((Object) fillInStackTrace, "");
        return fillInStackTrace;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final hZ m2503() {
        if (!hA.m2426()) {
            return null;
        }
        String message = getMessage();
        if (message == null) {
            fM.m2256();
        }
        return new hZ(message, this, this.f2280);
    }

    public final String toString() {
        return super.toString() + "; job=" + this.f2280;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof hZ) {
                hZ hZVar = (hZ) obj;
                if (!fM.m2257(hZVar.getMessage(), getMessage()) || !fM.m2257(hZVar.f2280, this.f2280) || !fM.m2257(hZVar.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String message = getMessage();
        if (message == null) {
            fM.m2256();
        }
        int hashCode = ((message.hashCode() * 31) + this.f2280.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }
}
