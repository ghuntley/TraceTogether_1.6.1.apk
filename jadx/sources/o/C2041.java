package o;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import o.C2383;

/* renamed from: o.ιϳ  reason: contains not printable characters */
final class C2041 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2383.C2385 f10084 = C2383.C2385.m12397("x", "y");

    /* renamed from: ɩ  reason: contains not printable characters */
    static int m10925(C2383 r6) {
        r6.m12388();
        int r0 = (int) (r6.m12387() * 255.0d);
        int r1 = (int) (r6.m12387() * 255.0d);
        int r2 = (int) (r6.m12387() * 255.0d);
        while (r6.m12383()) {
            r6.m12396();
        }
        r6.m12386();
        return Color.argb(255, r0, r1, r2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static List<PointF> m10926(C2383 r3, float f) {
        ArrayList arrayList = new ArrayList();
        r3.m12388();
        while (r3.m12390() == C2383.C2384.BEGIN_ARRAY) {
            r3.m12388();
            arrayList.add(m10923(r3, f));
            r3.m12386();
        }
        r3.m12386();
        return arrayList;
    }

    /* renamed from: o.ιϳ$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: ɩ  reason: contains not printable characters */
        static final /* synthetic */ int[] f10085 = new int[C2383.C2384.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                o.а$ǃ[] r0 = o.C2383.C2384.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10085 = r0
                int[] r0 = f10085     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.а$ǃ r1 = o.C2383.C2384.NUMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10085     // Catch:{ NoSuchFieldError -> 0x001f }
                o.а$ǃ r1 = o.C2383.C2384.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10085     // Catch:{ NoSuchFieldError -> 0x002a }
                o.а$ǃ r1 = o.C2383.C2384.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2041.AnonymousClass4.<clinit>():void");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    static PointF m10923(C2383 r2, float f) {
        int i = AnonymousClass4.f10085[r2.m12390().ordinal()];
        if (i == 1) {
            return m10927(r2, f);
        }
        if (i == 2) {
            return m10924(r2, f);
        }
        if (i == 3) {
            return m10929(r2, f);
        }
        StringBuilder sb = new StringBuilder("Unknown point starts with ");
        sb.append(r2.m12390());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static PointF m10927(C2383 r3, float f) {
        float r0 = (float) r3.m12387();
        float r1 = (float) r3.m12387();
        while (r3.m12383()) {
            r3.m12396();
        }
        return new PointF(r0 * f, r1 * f);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static PointF m10924(C2383 r4, float f) {
        r4.m12388();
        float r0 = (float) r4.m12387();
        float r1 = (float) r4.m12387();
        while (r4.m12390() != C2383.C2384.END_ARRAY) {
            r4.m12396();
        }
        r4.m12386();
        return new PointF(r0 * f, r1 * f);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static PointF m10929(C2383 r4, float f) {
        r4.m12391();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (r4.m12383()) {
            int r2 = r4.m12385(f10084);
            if (r2 == 0) {
                f2 = m10928(r4);
            } else if (r2 != 1) {
                r4.m12393();
                r4.m12396();
            } else {
                f3 = m10928(r4);
            }
        }
        r4.m12392();
        return new PointF(f2 * f, f3 * f);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static float m10928(C2383 r3) {
        C2383.C2384 r0 = r3.m12390();
        int i = AnonymousClass4.f10085[r0.ordinal()];
        if (i == 1) {
            return (float) r3.m12387();
        }
        if (i == 2) {
            r3.m12388();
            float r02 = (float) r3.m12387();
            while (r3.m12383()) {
                r3.m12396();
            }
            r3.m12386();
            return r02;
        }
        throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(r0)));
    }
}
