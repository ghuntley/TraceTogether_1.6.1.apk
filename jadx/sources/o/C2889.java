package o;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.C0496;

/* renamed from: o.ӏɨ  reason: contains not printable characters */
class C2889 implements C0509 {

    /* renamed from: ı  reason: contains not printable characters */
    static final int f13433 = -1;

    /* renamed from: ŀ  reason: contains not printable characters */
    private final AtomicReference<ScheduledFuture<?>> f13434 = new AtomicReference<>();

    /* renamed from: Ɩ  reason: contains not printable characters */
    boolean f13435 = false;

    /* renamed from: ǃ  reason: contains not printable characters */
    C2908 f13436 = new C2936();

    /* renamed from: ȷ  reason: contains not printable characters */
    private final C0470 f13437;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final ScheduledExecutorService f13438;

    /* renamed from: ɩ  reason: contains not printable characters */
    C3276ap f13439 = new C3276ap();

    /* renamed from: ɪ  reason: contains not printable characters */
    private final C3269ai f13440;

    /* renamed from: ɹ  reason: contains not printable characters */
    boolean f13441 = true;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final Context f13442;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final C2914 f13443;

    /* renamed from: Ι  reason: contains not printable characters */
    final C0519 f13444;

    /* renamed from: ι  reason: contains not printable characters */
    C3296bg f13445;

    /* renamed from: І  reason: contains not printable characters */
    boolean f13446 = true;

    /* renamed from: і  reason: contains not printable characters */
    boolean f13447 = false;

    /* renamed from: Ӏ  reason: contains not printable characters */
    volatile int f13448 = -1;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final C3301bl f13449;

    public C2889(C3269ai aiVar, Context context, ScheduledExecutorService scheduledExecutorService, C0470 r5, C3301bl blVar, C0519 r7, C2914 r8) {
        this.f13440 = aiVar;
        this.f13442 = context;
        this.f13438 = scheduledExecutorService;
        this.f13437 = r5;
        this.f13449 = blVar;
        this.f13444 = r7;
        this.f13443 = r8;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m14972(C3310bu buVar, String str) {
        this.f13445 = C2758.m14600(new C0471(this.f13440, str, buVar.f1799, this.f13449, C3276ap.m1615(this.f13442)));
        this.f13437.m4802(buVar);
        this.f13447 = buVar.f1797;
        this.f13435 = buVar.f1806;
        C3263ac.m1563();
        C3263ac.m1563();
        this.f13446 = buVar.f1804;
        C3263ac.m1563();
        this.f13441 = buVar.f1801;
        C3263ac.m1563();
        if (buVar.f1805 > 1) {
            C3263ac.m1563();
            this.f13436 = new C0378(buVar.f1805);
        }
        this.f13448 = buVar.f1802;
        m14966(0, (long) this.f13448);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m14967(C0496.If ifR) {
        C0496 r4 = ifR.m4879(this.f13444);
        if (!this.f13446 && C0496.C0497.CUSTOM.equals(r4.f4169)) {
            C3263ac.m1563();
        } else if (!this.f13441 && C0496.C0497.PREDEFINED.equals(r4.f4169)) {
            C3263ac.m1563();
        } else if (this.f13436.m15066(r4)) {
            C3263ac.m1563();
        } else {
            try {
                this.f13437.m1757(r4);
            } catch (IOException unused) {
                C3263ac.m1563();
            }
            m14971();
            boolean z = C0496.C0497.CUSTOM.equals(r4.f4169) || C0496.C0497.PREDEFINED.equals(r4.f4169);
            boolean equals = "purchase".equals(r4.f4170);
            if (this.f13447 && z) {
                if (!equals || this.f13435) {
                    try {
                        this.f13443.m15073(r4);
                    } catch (Exception unused2) {
                        C3263ac.m1563();
                    }
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m14971() {
        if (this.f13448 != -1) {
            m14966((long) this.f13448, (long) this.f13448);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m14965() {
        if (this.f13445 == null) {
            C3285aw.m1690(this.f13442);
            return;
        }
        C3285aw.m1690(this.f13442);
        List<File> r0 = this.f13437.m1755();
        int i = 0;
        while (r0.size() > 0) {
            try {
                Context context = this.f13442;
                new Object[1][0] = Integer.valueOf(r0.size());
                C3285aw.m1690(context);
                boolean r3 = this.f13445.m1779(r0);
                if (r3) {
                    i += r0.size();
                    this.f13437.m1761(r0);
                }
                if (!r3) {
                    break;
                }
                r0 = this.f13437.m1755();
            } catch (Exception e) {
                Context context2 = this.f13442;
                e.getMessage();
                C3285aw.m1663(context2);
            }
        }
        if (i == 0) {
            this.f13437.m1765();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m14968() {
        if (this.f13434.get() != null) {
            C3285aw.m1690(this.f13442);
            this.f13434.get().cancel(false);
            this.f13434.set((Object) null);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m14970() {
        this.f13437.m1764();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m14969() {
        try {
            return this.f13437.m1763();
        } catch (IOException unused) {
            C3285aw.m1663(this.f13442);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m14966(long j, long j2) {
        if (this.f13434.get() == null) {
            C3297bh bhVar = new C3297bh(this.f13442, this);
            C3285aw.m1690(this.f13442);
            try {
                this.f13434.set(this.f13438.scheduleAtFixedRate(bhVar, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException unused) {
                C3285aw.m1663(this.f13442);
            }
        }
    }
}
