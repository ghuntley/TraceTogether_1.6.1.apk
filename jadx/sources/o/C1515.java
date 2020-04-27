package o;

import android.content.Intent;

/* renamed from: o.ɽı  reason: contains not printable characters */
final class C1515 extends C1201 {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ int f8089;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C1277 f8090;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ Intent f8091;

    C1515(Intent intent, C1277 r2, int i) {
        this.f8091 = intent;
        this.f8090 = r2;
        this.f8089 = i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8960() {
        Intent intent = this.f8091;
        if (intent != null) {
            this.f8090.startActivityForResult(intent, this.f8089);
        }
    }
}
