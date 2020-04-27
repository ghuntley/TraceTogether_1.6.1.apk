package o;

import java.util.ArrayList;

/* renamed from: o.Ѫ  reason: contains not printable characters */
public final class C2645 extends C3011<Object> {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C2638 f12132 = new C2638() {
        /* renamed from: ı  reason: contains not printable characters */
        public final <T> C3011<T> m14006(C3122 r2, C3101<T> r3) {
            if (r3.getRawType() == Object.class) {
                return new C2645(r2);
            }
            return null;
        }
    };

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3122 f12133;

    C2645(C3122 r1) {
        this.f12133 = r1;
    }

    /* renamed from: o.Ѫ$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: ι  reason: contains not printable characters */
        static final /* synthetic */ int[] f12134 = new int[C0313.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                o.ıȶ[] r0 = o.C0313.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12134 = r0
                int[] r0 = f12134     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ıȶ r1 = o.C0313.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f12134     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ıȶ r1 = o.C0313.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f12134     // Catch:{ NoSuchFieldError -> 0x002a }
                o.ıȶ r1 = o.C0313.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f12134     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.ıȶ r1 = o.C0313.NUMBER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f12134     // Catch:{ NoSuchFieldError -> 0x0040 }
                o.ıȶ r1 = o.C0313.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f12134     // Catch:{ NoSuchFieldError -> 0x004b }
                o.ıȶ r1 = o.C0313.NULL     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2645.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m14004(C0995 r4) {
        switch (AnonymousClass2.f12134[r4.m7095().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                r4.m7099();
                while (r4.m7092()) {
                    arrayList.add(m15434(r4));
                }
                r4.m7104();
                return arrayList;
            case 2:
                C3095 r0 = new C3095();
                r4.m7096();
                while (r4.m7092()) {
                    r0.put(r4.m7107(), m15434(r4));
                }
                r4.m7103();
                return r0;
            case 3:
                return r4.m7101();
            case 4:
                return Double.valueOf(r4.m7098());
            case 5:
                return Boolean.valueOf(r4.m7106());
            case 6:
                r4.m7105();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14005(C0815 r3, Object obj) {
        if (obj == null) {
            r3.m6224();
            return;
        }
        C3011<?> r0 = this.f12133.m15830(C3101.get(obj.getClass()));
        if (r0 instanceof C2645) {
            r3.m6234();
            r3.m6225(3, 5, "}");
            return;
        }
        r0.m15435(r3, obj);
    }
}
