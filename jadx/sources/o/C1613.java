package o;

import android.content.Intent;

/* renamed from: o.ʇı  reason: contains not printable characters */
final class C1613 extends C1201 {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ int f8524;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ Intent f8525;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C0485 f8526;

    C1613(Intent intent, C0485 r2, int i) {
        this.f8525 = intent;
        this.f8526 = r2;
        this.f8524 = i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9351() {
        Intent intent = this.f8525;
        if (intent != null) {
            this.f8526.startActivityForResult(intent, this.f8524);
        }
    }
}
