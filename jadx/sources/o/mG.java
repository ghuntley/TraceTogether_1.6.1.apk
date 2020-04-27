package o;

import java.lang.reflect.Field;

public final class mG {
    mG() {
    }

    /* renamed from: o.mG$ɩ  reason: contains not printable characters */
    public static class C0235 {

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean f3095;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final String f3096;

        C0235() {
        }

        public C0235(String str, boolean z) {
            this.f3096 = str;
            this.f3095 = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0235 r5 = (C0235) obj;
            if (this.f3095 != r5.f3095) {
                return false;
            }
            String str = this.f3096;
            String str2 = r5.f3096;
            return str == null ? str2 == null : str.equals(str2);
        }

        public final int hashCode() {
            String str = this.f3096;
            return ((str != null ? str.hashCode() : 0) * 31) + (this.f3095 ? 1 : 0);
        }
    }

    public mG(Field field) {
        if (field == null) {
            throw new NullPointerException();
        }
    }
}
