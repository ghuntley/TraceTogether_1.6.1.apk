package o;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class bH {

    /* renamed from: ı  reason: contains not printable characters */
    private final CountDownLatch f1598;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f1599;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final AtomicReference<bM> f1600;

    /* renamed from: ι  reason: contains not printable characters */
    private bK f1601;

    /* synthetic */ bH(byte b) {
        this();
    }

    /* renamed from: o.bH$ı  reason: contains not printable characters */
    public static class C0122 {
        /* access modifiers changed from: private */

        /* renamed from: ι  reason: contains not printable characters */
        public static final bH f1602 = new bH((byte) 0);

        C0122() {
        }
    }

    private bH() {
        this.f1600 = new AtomicReference<>();
        this.f1598 = new CountDownLatch(1);
        this.f1599 = false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized bH m1710(C3269ai aiVar, aD aDVar, C3301bl blVar, String str, String str2, String str3, C3281au auVar) {
        C3269ai aiVar2 = aiVar;
        aD aDVar2 = aDVar;
        synchronized (this) {
            if (this.f1599) {
                return this;
            }
            if (this.f1601 == null) {
                Context r3 = aiVar.m1589();
                String str4 = aDVar2.f1399;
                String r12 = C3276ap.m1615(r3);
                String r5 = aDVar2.f1393.m1482(aDVar2.f1391);
                aI aIVar = new aI();
                bF bFVar = new bF();
                bB bBVar = new bB(aiVar2);
                String r21 = C3285aw.m1680(r3);
                String str5 = str3;
                bC bCVar = new bC(aiVar2, str5, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{str4}), blVar);
                String r13 = aD.m1458();
                String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(aD.f1389, "");
                String replaceAll2 = Build.VERSION.RELEASE.replaceAll(aD.f1389, "");
                String r2 = aDVar.m1459();
                String str6 = replaceAll;
                String str7 = r2;
                this.f1601 = new bG(aiVar, new bQ(r12, r13, str6, replaceAll2, str7, C3285aw.m1676(C3285aw.m1678(r3)), str2, str, C3287ay.m1698(r5).f1575, r21), aIVar, bFVar, bBVar, bCVar, auVar);
            }
            this.f1599 = true;
            return this;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final bM m1709() {
        try {
            this.f1598.await();
            return this.f1600.get();
        } catch (InterruptedException unused) {
            C3263ac.m1563();
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized boolean m1712() {
        bM r0;
        r0 = this.f1601.m1714();
        this.f1600.set(r0);
        this.f1598.countDown();
        return r0 != null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized boolean m1711() {
        boolean z;
        bM r0 = this.f1601.m1715(bJ.SKIP_CACHE_LOOKUP);
        this.f1600.set(r0);
        this.f1598.countDown();
        if (r0 == null) {
            C3263ac.m1563();
        }
        if (r0 != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
