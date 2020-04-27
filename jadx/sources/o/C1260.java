package o;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import o.C0712;
import o.C2177;

/* renamed from: o.ɩɨ  reason: contains not printable characters */
public final class C1260 implements C2436 {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C1260 f7100 = new C1260();

    /* renamed from: o.ɩɨ$ǃ  reason: contains not printable characters */
    public static final class C1262 {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int f7104 = 1;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static final int f7105 = 1;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int[] f7106 = {16842755, 16842961};

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int[] f7107 = {16842755, 16842960, 16842961};

        /* renamed from: Ι  reason: contains not printable characters */
        public static final int f7108 = 0;

        /* renamed from: ι  reason: contains not printable characters */
        public static final int f7109 = 2;

        /* renamed from: і  reason: contains not printable characters */
        public static final int f7110 = 0;
    }

    /* renamed from: o.ɩɨ$ɩ  reason: contains not printable characters */
    public static final class C1263 implements C0712.C0713 {

        /* renamed from: ı  reason: contains not printable characters */
        public static final C1263 f7111 = new C1263();

        private C1263() {
        }
    }

    private C1260() {
    }

    /* renamed from: o.ɩɨ$ı  reason: contains not printable characters */
    public static final class C1261 implements C1757 {

        /* renamed from: ı  reason: contains not printable characters */
        private final C2258 f7101;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C2291 f7102;

        /* renamed from: ι  reason: contains not printable characters */
        private final Set<C1733> f7103;

        public C1261(Set<C1733> set, C2291 r2, C2258 r3) {
            this.f7103 = set;
            this.f7102 = r2;
            this.f7101 = r3;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final <T> C1781<T> m8099(String str, Class<T> cls, C1733 r9, C1748<T, byte[]> r10) {
            if (this.f7103.contains(r9)) {
                return new C2272(this.f7102, str, r9, r10, this.f7101);
            }
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{r9, this.f7103}));
        }

        C1261() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static <T> List<T> m8098(T[] tArr) {
            return Arrays.asList(tArr);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m8097(Object obj, Object obj2) {
        C2177.If ifR = (C2177.If) obj;
        C2177.Cif ifVar = (C2177.Cif) obj2;
        URL url = ifVar.f10367;
        if (url == null) {
            return null;
        }
        new Object[1][0] = url;
        return new C2177.If(ifVar.f10367, ifR.f10364, ifR.f10363);
    }
}
