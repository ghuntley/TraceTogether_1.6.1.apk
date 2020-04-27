package o;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.UUID;
import o.C2319;
import o.C3169;

/* renamed from: o.łι  reason: contains not printable characters */
public final class C0546 implements C0350, C2416, C1568 {

    /* renamed from: ı  reason: contains not printable characters */
    public C2319.Cif f4423;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C2656 f4424;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Bundle f4425;

    /* renamed from: ɩ  reason: contains not printable characters */
    final C1554 f4426;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Context f4427;

    /* renamed from: Ι  reason: contains not printable characters */
    final C0593 f4428;

    /* renamed from: ι  reason: contains not printable characters */
    final UUID f4429;

    /* renamed from: І  reason: contains not printable characters */
    C2319.Cif f4430;

    /* renamed from: і  reason: contains not printable characters */
    private C3169.C3172 f4431;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C0512 f4432;

    C0546(Context context, C0593 r10, Bundle bundle, C2851 r12, C0512 r13) {
        this(context, r10, bundle, r12, r13, UUID.randomUUID(), (Bundle) null);
    }

    C0546(Context context, C0593 r3, Bundle bundle, C2851 r5, C0512 r6, UUID uuid, Bundle bundle2) {
        this.f4424 = new C2656(this);
        this.f4426 = C1554.m9161((C1568) this);
        this.f4423 = C2319.Cif.CREATED;
        this.f4430 = C2319.Cif.RESUMED;
        this.f4427 = context;
        this.f4429 = uuid;
        this.f4428 = r3;
        this.f4425 = bundle;
        this.f4432 = r6;
        this.f4426.m9164(bundle2);
        if (r5 != null) {
            this.f4423 = r5.getLifecycle().m12096();
        }
        m5133();
    }

    public final C2319 getLifecycle() {
        return this.f4424;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5133() {
        if (this.f4423.ordinal() < this.f4430.ordinal()) {
            this.f4424.m14067(this.f4423);
        } else {
            this.f4424.m14067(this.f4430);
        }
    }

    public final C0307 getViewModelStore() {
        C0512 r0 = this.f4432;
        if (r0 != null) {
            UUID uuid = this.f4429;
            C0307 r2 = r0.f4258.get(uuid);
            if (r2 != null) {
                return r2;
            }
            C0307 r22 = new C0307();
            r0.f4258.put(uuid, r22);
            return r22;
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final C3169.C3172 getDefaultViewModelProviderFactory() {
        if (this.f4431 == null) {
            this.f4431 = new C0333((Application) this.f4427.getApplicationContext(), this, this.f4425);
        }
        return this.f4431;
    }

    public final C1555 getSavedStateRegistry() {
        return this.f4426.f8295;
    }

    /* renamed from: o.łι$5  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final /* synthetic */ int[] f4433 = new int[C2319.C2320.values().length];

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
                f4433 = r0
                int[] r0 = f4433     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4433     // Catch:{ NoSuchFieldError -> 0x001f }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f4433     // Catch:{ NoSuchFieldError -> 0x002a }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_START     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f4433     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f4433     // Catch:{ NoSuchFieldError -> 0x0040 }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f4433     // Catch:{ NoSuchFieldError -> 0x004b }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f4433     // Catch:{ NoSuchFieldError -> 0x0056 }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0546.AnonymousClass5.<clinit>():void");
        }
    }
}
