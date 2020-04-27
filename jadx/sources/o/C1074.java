package o;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ɍɪ  reason: contains not printable characters */
public abstract class C1074 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: ǃ  reason: contains not printable characters */
    protected final C2835 f6448;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Handler f6449;

    /* renamed from: Ι  reason: contains not printable characters */
    protected volatile boolean f6450;

    /* renamed from: ι  reason: contains not printable characters */
    protected final AtomicReference<C1069> f6451;

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m7418(C2822 r1, int i);

    /* access modifiers changed from: protected */
    /* renamed from: І  reason: contains not printable characters */
    public abstract void m7419();

    public void onCancel(DialogInterface dialogInterface) {
        m7418(new C2822(13, (PendingIntent) null), m7411(this.f6451.get()));
        m7420();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m7417(Bundle bundle) {
        super.m773(bundle);
        if (bundle != null) {
            this.f6451.set(bundle.getBoolean("resolving_error", false) ? new C1069(new C2822(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m7414(Bundle bundle) {
        super.m771(bundle);
        C1069 r0 = this.f6451.get();
        if (r0 != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", r0.m7398());
            bundle.putInt("failed_status", r0.m7399().m14747());
            bundle.putParcelable("failed_resolution", r0.m7399().m14748());
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m7416() {
        super.m772();
        this.f6450 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7413(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<o.ɍȷ> r0 = r4.f6451
            java.lang.Object r0 = r0.get()
            o.ɍȷ r0 = (o.C1069) r0
            r1 = 1
            r2 = 0
            if (r5 == r1) goto L_0x0030
            r6 = 2
            if (r5 == r6) goto L_0x0010
            goto L_0x005d
        L_0x0010:
            o.Ӏс r5 = r4.f6448
            android.app.Activity r6 = r4.m768()
            int r5 = r5.m14793(r6)
            if (r5 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            o.Ӏϲ r6 = r0.m7399()
            int r6 = r6.m14747()
            r7 = 18
            if (r6 != r7) goto L_0x005e
            if (r5 != r7) goto L_0x005e
            return
        L_0x0030:
            r5 = -1
            if (r6 != r5) goto L_0x0034
            goto L_0x005e
        L_0x0034:
            if (r6 != 0) goto L_0x005d
            r5 = 13
            if (r7 == 0) goto L_0x0040
            java.lang.String r6 = "<<ResolutionFailureErrorDetail>>"
            int r5 = r7.getIntExtra(r6, r5)
        L_0x0040:
            o.ɍȷ r6 = new o.ɍȷ
            o.Ӏϲ r7 = new o.Ӏϲ
            r1 = 0
            o.Ӏϲ r3 = r0.m7399()
            java.lang.String r3 = r3.toString()
            r7.<init>(r5, r1, r3)
            int r5 = m7411((o.C1069) r0)
            r6.<init>(r7, r5)
            java.util.concurrent.atomic.AtomicReference<o.ɍȷ> r5 = r4.f6451
            r5.set(r6)
            r0 = r6
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == 0) goto L_0x0064
            r4.m7420()
            return
        L_0x0064:
            if (r0 == 0) goto L_0x0071
            o.Ӏϲ r5 = r0.m7399()
            int r6 = r0.m7398()
            r4.m7418(r5, r6)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1074.m7413(int, int, android.content.Intent):void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m7412() {
        super.m769();
        this.f6450 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m7420() {
        this.f6451.set((Object) null);
        m7419();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m7415(C2822 r2, int i) {
        C1069 r0 = new C1069(r2, i);
        if (this.f6451.compareAndSet((Object) null, r0)) {
            this.f6449.post(new C1076(this, r0));
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m7411(C1069 r0) {
        if (r0 == null) {
            return -1;
        }
        return r0.m7398();
    }
}
