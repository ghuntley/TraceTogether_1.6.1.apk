package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u00020\u00018\u0017@\u0016X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00078W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b"}, d2 = {"Lo/hM;", "", "ı", "Z", "ǃ", "()Z", "ɩ", "Lo/io;", "()Lo/io;", "", "toString", "()Ljava/lang/String;", "p0", "<init>", "(Z)V", "Lo/hW;"}, k = 1, mv = {1, 1, 15})
final class hM implements hW {

    /* renamed from: ı  reason: contains not printable characters */
    private final boolean f2270;

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3493io m2475() {
        return null;
    }

    public hM(boolean z) {
        this.f2270 = z;
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m2474() {
        return this.f2270;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(m2474() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
