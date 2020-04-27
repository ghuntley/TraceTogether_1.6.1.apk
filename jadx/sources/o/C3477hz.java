package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3396ex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\b\u0018\u0000 \u00012\u00020\u0010:\u0001\u0001J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0005\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/hz;", "If", "", "ɩ", "Ljava/lang/String;", "ι", "()Ljava/lang/String;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lo/ev;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.hz  reason: case insensitive filesystem */
public final class C3477hz extends C3394ev {
    public static final If If = new If((fL) null);

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f2303;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C3477hz) && fM.m2257(this.f2303, ((C3477hz) obj).f2303);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f2303;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final String m2558() {
        return this.f2303;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00040\u0003B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/hz$If;", "<init>", "()V", "Lo/ex$ǃ;", "Lo/hz;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.hz$If */
    public static final class If implements C3396ex.C0170<C3477hz> {
        private If() {
        }

        public /* synthetic */ If(fL fLVar) {
            this();
        }
    }

    public final String toString() {
        return "CoroutineName(" + this.f2303 + ')';
    }
}
