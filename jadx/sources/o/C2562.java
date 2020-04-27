package o;

import java.util.Arrays;
import java.util.Map;
import o.C0712;

/* renamed from: o.іŧ  reason: contains not printable characters */
public final class C2562 implements C0712.C0713 {

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C2562 f11679 = new C2562();

    private C2562() {
    }

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof C2562);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.FALSE, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, null, null, null, null});
    }

    /* renamed from: o.іŧ$ɩ  reason: contains not printable characters */
    public static final class C2563 implements C2443 {

        /* renamed from: ı  reason: contains not printable characters */
        private final int f11680;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Map<String, Integer> f11681;

        /* renamed from: Ι  reason: contains not printable characters */
        private final int f11682;

        public C2563() {
        }

        public C2563(int i, int i2, Map<String, Integer> map) {
            this.f11680 = "local".equals(C2745.m14518("firebear.preference")) ? 0 : i;
            this.f11682 = i2;
            if (map != null) {
                this.f11681 = map;
                "local".equals(C2745.m14518("firebear.preference"));
                return;
            }
            throw new NullPointerException("null reference");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m13643(String str) {
            int i = this.f11680;
            if (i == 0) {
                return true;
            }
            if (this.f11682 <= i) {
                return false;
            }
            Integer num = this.f11681.get(str);
            if (num == null) {
                num = 0;
            }
            if (num.intValue() <= this.f11680 || this.f11682 < num.intValue()) {
                return false;
            }
            return true;
        }
    }
}
