package o;

import android.util.Log;
import o.C0506;

/* renamed from: o.Ɨɪ  reason: contains not printable characters */
final class C0690 implements Runnable {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C0506.Cif f4849;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C2822 f4850;

    C0690(C0506.Cif ifVar, C2822 r2) {
        this.f4849 = ifVar;
        this.f4850 = r2;
    }

    public final void run() {
        C0506.C0507 r0 = (C0506.C0507) C0506.this.f4221.get(this.f4849.f4230);
        if (r0 != null) {
            if (this.f4850.m14746()) {
                boolean unused = this.f4849.f4233 = true;
                if (this.f4849.f4228.m15481()) {
                    C0506.Cif.m4919(this.f4849);
                    return;
                }
                try {
                    this.f4849.f4228.m15486((C1304) null, this.f4849.f4228.m15490());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    r0.m4944(new C2822(10));
                }
            } else {
                r0.m4944(this.f4850);
            }
        }
    }
}
