package o;

import android.os.Bundle;

/* renamed from: o.ıс  reason: contains not printable characters */
public final class C0420 {

    /* renamed from: ı  reason: contains not printable characters */
    final Object f3993;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C0686 f3994;

    /* renamed from: ɩ  reason: contains not printable characters */
    final boolean f3995;

    /* renamed from: ι  reason: contains not printable characters */
    final boolean f3996;

    C0420(C0686<?> r2, boolean z, Object obj, boolean z2) {
        if (!r2.f4843 && z) {
            StringBuilder sb = new StringBuilder();
            sb.append(r2.m5567());
            sb.append(" does not allow nullable values");
            throw new IllegalArgumentException(sb.toString());
        } else if (z || !z2 || obj != null) {
            this.f3994 = r2;
            this.f3996 = z;
            this.f3993 = obj;
            this.f3995 = z2;
        } else {
            StringBuilder sb2 = new StringBuilder("Argument with type ");
            sb2.append(r2.m5567());
            sb2.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m4711(String str, Bundle bundle) {
        if (!this.f3996 && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f3994.m5565(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0420 r5 = (C0420) obj;
            if (this.f3996 != r5.f3996 || this.f3995 != r5.f3995 || !this.f3994.equals(r5.f3994)) {
                return false;
            }
            Object obj2 = this.f3993;
            Object obj3 = r5.f3993;
            if (obj2 != null) {
                return obj2.equals(obj3);
            }
            if (obj3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f3994.hashCode() * 31) + (this.f3996 ? 1 : 0)) * 31) + (this.f3995 ? 1 : 0)) * 31;
        Object obj = this.f3993;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    /* renamed from: o.ıс$If */
    public static final class If {

        /* renamed from: ı  reason: contains not printable characters */
        boolean f3997 = false;

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean f3998 = false;

        /* renamed from: Ι  reason: contains not printable characters */
        Object f3999;

        /* renamed from: ι  reason: contains not printable characters */
        C0686<?> f4000;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C0420 m4712() {
            if (this.f4000 == null) {
                this.f4000 = C0686.m5561(this.f3999);
            }
            return new C0420(this.f4000, this.f3997, this.f3999, this.f3998);
        }
    }
}
