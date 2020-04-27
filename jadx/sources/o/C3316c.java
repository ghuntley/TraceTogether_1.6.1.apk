package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import java.io.InputStream;
import o.C3616p;
import o.C3618r;

/* renamed from: o.c  reason: case insensitive filesystem */
final class C3316c extends C2668 {
    C3316c(Context context) {
        super(context);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m1844(C3617q qVar) {
        return "file".equals(qVar.f3474.getScheme());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3618r.C0275 m1843(C3617q qVar) {
        InputStream openInputStream = this.f12288.getContentResolver().openInputStream(qVar.f3474);
        C3616p.C0272 r2 = C3616p.C0272.DISK;
        int attributeInt = new ExifInterface(qVar.f3474.getPath()).getAttributeInt("Orientation", 1);
        return new C3618r.C0275((Bitmap) null, openInputStream, r2, attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0 : 270 : 90 : 180);
    }
}
