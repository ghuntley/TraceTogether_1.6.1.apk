package o;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import o.C0496;

/* renamed from: o.џ  reason: contains not printable characters */
class C2635 implements aZ {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final C3269ai f11979;
    /* access modifiers changed from: private */

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C2914 f11980;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Context f11981;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2710 f11982;

    /* renamed from: Ι  reason: contains not printable characters */
    final ScheduledExecutorService f11983;

    /* renamed from: ι  reason: contains not printable characters */
    C0509 f11984 = new C2782();
    /* access modifiers changed from: private */

    /* renamed from: і  reason: contains not printable characters */
    public final C3301bl f11985;
    /* access modifiers changed from: private */

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final C0600 f11986;

    public C2635(C3269ai aiVar, Context context, C2710 r4, C0600 r5, C3301bl blVar, ScheduledExecutorService scheduledExecutorService, C2914 r8) {
        this.f11979 = aiVar;
        this.f11981 = context;
        this.f11982 = r4;
        this.f11986 = r5;
        this.f11985 = blVar;
        this.f11983 = scheduledExecutorService;
        this.f11980 = r8;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m13972(C0496.If ifR) {
        m13968(ifR, false, false);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m13974(C0496.If ifR) {
        m13968(ifR, false, true);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m13971(C0496.If ifR) {
        m13968(ifR, true, false);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m13973(final C3310bu buVar, final String str) {
        m13962((Runnable) new Runnable() {
            public void run() {
                try {
                    C2635.this.f11984.m4953(buVar, str);
                } catch (Exception unused) {
                    C3263ac.m1563();
                }
            }
        });
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m13969() {
        m13962((Runnable) new Runnable() {
            public void run() {
                try {
                    C0509 r0 = C2635.this.f11984;
                    C2635.this.f11984 = new C2782();
                    r0.m4952();
                } catch (Exception unused) {
                    C3263ac.m1563();
                }
            }
        });
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m13970(String str) {
        m13962((Runnable) new Runnable() {
            public void run() {
                try {
                    C2635.this.f11984.m4950();
                } catch (Exception unused) {
                    C3263ac.m1563();
                }
            }
        });
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m13967() {
        m13962((Runnable) new Runnable() {
            public void run() {
                try {
                    C0519 r7 = C2635.this.f11986.m5305();
                    C0470 r5 = C2635.this.f11982.m14407();
                    r5.m1762((aZ) C2635.this);
                    C2635.this.f11984 = new C2889(C2635.this.f11979, C2635.this.f11981, C2635.this.f11983, r5, C2635.this.f11985, r7, C2635.this.f11980);
                } catch (Exception unused) {
                    C3263ac.m1563();
                }
            }
        });
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m13975() {
        m13962((Runnable) new Runnable() {
            public void run() {
                try {
                    C2635.this.f11984.m1777();
                } catch (Exception unused) {
                    C3263ac.m1563();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m13968(final C0496.If ifR, boolean z, final boolean z2) {
        AnonymousClass7 r0 = new Runnable() {
            public void run() {
                try {
                    C2635.this.f11984.m4951(ifR);
                    if (z2) {
                        C2635.this.f11984.m1777();
                    }
                } catch (Exception unused) {
                    C3263ac.m1563();
                }
            }
        };
        if (z) {
            m13964((Runnable) r0);
        } else {
            m13962((Runnable) r0);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m13964(Runnable runnable) {
        try {
            this.f11983.submit(runnable).get();
        } catch (Exception unused) {
            C3263ac.m1563();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m13962(Runnable runnable) {
        try {
            this.f11983.submit(runnable);
        } catch (Exception unused) {
            C3263ac.m1563();
        }
    }
}
