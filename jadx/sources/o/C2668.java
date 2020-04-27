package o;

import android.content.Context;
import o.C3616p;
import o.C3618r;

/* renamed from: o.ҎӀ  reason: contains not printable characters */
class C2668 extends C3618r {

    /* renamed from: Ι  reason: contains not printable characters */
    final Context f12288;

    C2668(Context context) {
        this.f12288 = context;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m14151(C3617q qVar) {
        return "content".equals(qVar.f3474.getScheme());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public C3618r.C0275 m14150(C3617q qVar) {
        return new C3618r.C0275(this.f12288.getContentResolver().openInputStream(qVar.f3474), C3616p.C0272.DISK);
    }
}
