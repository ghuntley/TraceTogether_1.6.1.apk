package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;
import o.C3616p;
import o.C3618r;

/* renamed from: o.Ҝ  reason: contains not printable characters */
final class C2697 extends C3618r {

    /* renamed from: ı  reason: contains not printable characters */
    private static int f12441 = 0;

    /* renamed from: ι  reason: contains not printable characters */
    private static int f12442 = 1;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final AssetManager f12443;

    public C2697(Context context) {
        this.f12443 = context.getAssets();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m14312(C3617q qVar) {
        Uri uri = qVar.f3474;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3618r.C0275 m14311(C3617q qVar) {
        AssetManager assetManager = this.f12443;
        try {
            Object[] objArr = new Object[2];
            objArr[1] = qVar.f3474.toString().substring(22);
            objArr[0] = assetManager;
            C3618r.C0275 r2 = new C3618r.C0275((InputStream) ((Class) C1534.m8995(0, 0, 4)).getMethod("ǃ", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr), C3616p.C0272.DISK);
            int i = f12441 + 41;
            f12442 = i % 128;
            if (!(i % 2 == 0)) {
                return r2;
            }
            int i2 = 60 / 0;
            return r2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
