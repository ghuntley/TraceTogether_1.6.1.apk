package o;

import android.content.Context;

/* renamed from: o.Іј  reason: contains not printable characters */
public final class C2312 extends C2338 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2693 f10735;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f10736;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Context f10737;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2693 f10738;

    public C2312(Context context, C2693 r2, C2693 r3, String str) {
        if (context != null) {
            this.f10737 = context;
            if (r2 != null) {
                this.f10735 = r2;
                if (r3 != null) {
                    this.f10738 = r3;
                    if (str != null) {
                        this.f10736 = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Context m12058() {
        return this.f10737;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2693 m12060() {
        return this.f10735;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2693 m12059() {
        return this.f10738;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m12061() {
        return this.f10736;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f10737);
        sb.append(", wallClock=");
        sb.append(this.f10735);
        sb.append(", monotonicClock=");
        sb.append(this.f10738);
        sb.append(", backendName=");
        sb.append(this.f10736);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2338) {
            C2338 r5 = (C2338) obj;
            return this.f10737.equals(r5.m12193()) && this.f10735.equals(r5.m12195()) && this.f10738.equals(r5.m12194()) && this.f10736.equals(r5.m12196());
        }
    }

    public final int hashCode() {
        return ((((((this.f10737.hashCode() ^ 1000003) * 1000003) ^ this.f10735.hashCode()) * 1000003) ^ this.f10738.hashCode()) * 1000003) ^ this.f10736.hashCode();
    }
}
