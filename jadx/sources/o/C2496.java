package o;

import java.util.Map;
import o.C2572;

/* renamed from: o.ц  reason: contains not printable characters */
public final class C2496 extends C2572 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Map<C1766, C2572.If> f11303;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2693 f11304;

    public C2496(C2693 r1, Map<C1766, C2572.If> map) {
        if (r1 != null) {
            this.f11304 = r1;
            if (map != null) {
                this.f11303 = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final C2693 m13247() {
        return this.f11304;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final Map<C1766, C2572.If> m13248() {
        return this.f11303;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SchedulerConfig{clock=");
        sb.append(this.f11304);
        sb.append(", values=");
        sb.append(this.f11303);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2572) {
            C2572 r5 = (C2572) obj;
            return this.f11304.equals(r5.m13682()) && this.f11303.equals(r5.m13683());
        }
    }

    public final int hashCode() {
        return ((this.f11304.hashCode() ^ 1000003) * 1000003) ^ this.f11303.hashCode();
    }
}
