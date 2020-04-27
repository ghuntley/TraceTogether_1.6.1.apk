package o;

/* renamed from: o.ɼι  reason: contains not printable characters */
public final class C1501 implements C1455 {

    /* renamed from: ı  reason: contains not printable characters */
    public final C1502 f8006;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean f8007;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f8008;

    /* renamed from: o.ɼι$ɩ  reason: contains not printable characters */
    public enum C1502 {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: Ι  reason: contains not printable characters */
        public static C1502 m8919(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public C1501(String str, C1502 r2, boolean z) {
        this.f8008 = str;
        this.f8006 = r2;
        this.f8007 = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        sb.append(this.f8006);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0550 m8918(C0379 r1, C1578 r2) {
        if (r1.f3883) {
            return new C0698(this);
        }
        C2414.m12460("Animation contains merge paths but they are disabled.");
        return null;
    }
}
