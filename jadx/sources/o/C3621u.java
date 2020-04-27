package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import o.C3616p;
import o.C3618r;

/* renamed from: o.u  reason: case insensitive filesystem */
final class C3621u extends C3618r {

    /* renamed from: ı  reason: contains not printable characters */
    private final Context f3500;

    C3621u(Context context) {
        this.f3500 = context;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m4078(C3617q qVar) {
        if (qVar.f3476 != 0) {
            return true;
        }
        return "android.resource".equals(qVar.f3474.getScheme());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3618r.C0275 m4077(C3617q qVar) {
        Resources r0 = C3626z.m4091(this.f3500, qVar);
        int r1 = C3626z.m4081(r0, qVar);
        BitmapFactory.Options r3 = m4067(qVar);
        if (r3 != null && r3.inJustDecodeBounds) {
            BitmapFactory.decodeResource(r0, r1, r3);
            C3618r.m4068(qVar.f3479, qVar.f3481, r3.outWidth, r3.outHeight, r3);
        }
        return new C3618r.C0275(BitmapFactory.decodeResource(r0, r1, r3), C3616p.C0272.DISK);
    }
}
