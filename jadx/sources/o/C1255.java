package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import o.C2771;

/* renamed from: o.ɩɔ  reason: contains not printable characters */
public final class C1255 {

    /* renamed from: ɹ  reason: contains not printable characters */
    private static int f7088 = 1;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Object f7089 = new Object();

    /* renamed from: І  reason: contains not printable characters */
    private static int f7090;

    /* renamed from: ı  reason: contains not printable characters */
    private String f7091;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Context f7092;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2998 f7093;

    /* renamed from: ι  reason: contains not printable characters */
    private final Map<String, C2771.If> f7094;

    public C1255(Drawable.Callback callback, String str, C2998 r5, Map<String, C2771.If> map) {
        this.f7091 = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f7091;
            if (str2.charAt(str2.length() - 1) != '/') {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f7091);
                sb.append('/');
                this.f7091 = sb.toString();
            }
        }
        if (!(callback instanceof View)) {
            C2414.m12460("LottieDrawable must be inside of a view for images to work.");
            this.f7094 = new HashMap();
            this.f7092 = null;
            return;
        }
        this.f7092 = ((View) callback).getContext();
        this.f7094 = map;
        this.f7093 = r5;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Bitmap m8087(String str) {
        Throwable cause;
        C2771.If ifR = this.f7094.get(str);
        if (ifR == null) {
            return null;
        }
        Bitmap bitmap = ifR.f13119;
        if (bitmap != null) {
            return bitmap;
        }
        try {
            if (this.f7093 != null) {
                Bitmap r0 = this.f7093.m15350();
                if (r0 != null) {
                    m8086(str, r0);
                }
                return r0;
            }
            String str2 = ifR.f13118;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            try {
                if ((((Boolean) String.class.getMethod("startsWith", new Class[]{String.class}).invoke(str2, new Object[]{"data:"})).booleanValue() ? 10 : 'O') == 10) {
                    try {
                        if (((Integer) String.class.getMethod("indexOf", new Class[]{String.class}).invoke(str2, new Object[]{"base64,"})).intValue() > 0) {
                            int i = f7088 + 37;
                            f7090 = i % 128;
                            try {
                                byte[] decode = Base64.decode((String) String.class.getMethod("substring", new Class[]{Integer.TYPE}).invoke(str2, new Object[]{Integer.valueOf(((Integer) String.class.getMethod("indexOf", new Class[]{Integer.TYPE}).invoke(str2, new Object[]{Integer.valueOf(i % 2 != 0 ? 64 : 44)})).intValue() + 1)}), 0);
                                int i2 = f7088 + 33;
                                f7090 = i2 % 128;
                                if (i2 % 2 == 0) {
                                }
                                return m8086(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                            } catch (IllegalArgumentException unused) {
                                C2414.m12462("data URL did not have correct base64 format.");
                                return null;
                            } catch (Throwable th) {
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                    } finally {
                        cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                    }
                }
                try {
                    if (!TextUtils.isEmpty(this.f7091)) {
                        AssetManager assets = this.f7092.getAssets();
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f7091);
                        sb.append(str2);
                        String obj = sb.toString();
                        Object[] objArr = new Object[2];
                        objArr[1] = obj;
                        objArr[0] = assets;
                        InputStream inputStream = (InputStream) ((Class) C1534.m8995(0, 0, 4)).getMethod("ǃ", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr);
                        int i3 = f7088 + 43;
                        f7090 = i3 % 128;
                        int i4 = i3 % 2;
                        return m8086(str, C2467.m12720(BitmapFactory.decodeStream(inputStream, (Rect) null, options), ifR.f13120, ifR.f13121));
                    }
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                } catch (IOException unused2) {
                    C2414.m12462("Unable to open asset.");
                    return null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } finally {
                Throwable cause3 = th.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private Bitmap m8086(String str, Bitmap bitmap) {
        synchronized (f7089) {
            this.f7094.get(str).f13119 = bitmap;
        }
        return bitmap;
    }
}
