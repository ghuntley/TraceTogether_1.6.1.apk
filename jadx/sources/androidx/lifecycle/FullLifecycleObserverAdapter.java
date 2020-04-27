package androidx.lifecycle;

import o.C2319;
import o.C2412;
import o.C2456;
import o.C2851;

public class FullLifecycleObserverAdapter implements C2456 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2412 f225;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2456 f226;

    public FullLifecycleObserverAdapter(C2412 r1, C2456 r2) {
        this.f225 = r1;
        this.f226 = r2;
    }

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: ɩ  reason: contains not printable characters */
        static final /* synthetic */ int[] f227 = new int[C2319.C2320.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                o.Іӏ$ǃ[] r0 = o.C2319.C2320.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f227 = r0
                int[] r0 = f227     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f227     // Catch:{ NoSuchFieldError -> 0x001f }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_START     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f227     // Catch:{ NoSuchFieldError -> 0x002a }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f227     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f227     // Catch:{ NoSuchFieldError -> 0x0040 }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f227     // Catch:{ NoSuchFieldError -> 0x004b }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f227     // Catch:{ NoSuchFieldError -> 0x0056 }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.AnonymousClass4.<clinit>():void");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m184(C2851 r3, C2319.C2320 r4) {
        switch (AnonymousClass4.f227[r4.ordinal()]) {
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                C2456 r0 = this.f226;
                if (r0 != null) {
                    r0.m12596(r3, r4);
                    return;
                }
                return;
        }
    }
}
