package o;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.InputStream;
import o.C3616p;
import o.C3618r;

/* renamed from: o.h  reason: case insensitive filesystem */
final class C3452h extends C2668 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final String[] f2238 = {"orientation"};

    C3452h(Context context) {
        super(context);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m2422(C3617q qVar) {
        Uri uri = qVar.f3474;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3618r.C0275 m2421(C3617q qVar) {
        If ifR;
        Bitmap bitmap;
        ContentResolver contentResolver = this.f12288.getContentResolver();
        int r1 = m2420(contentResolver, qVar.f3474);
        String type = contentResolver.getType(qVar.f3474);
        boolean z = false;
        int i = 1;
        boolean z2 = type != null && type.startsWith("video/");
        if (!(qVar.f3479 == 0 && qVar.f3481 == 0)) {
            z = true;
        }
        if (z) {
            int i2 = qVar.f3479;
            int i3 = qVar.f3481;
            if (i2 <= If.MICRO.f2245 && i3 <= If.MICRO.f2243) {
                ifR = If.MICRO;
            } else if (i2 > If.MINI.f2245 || i3 > If.MINI.f2243) {
                ifR = If.FULL;
            } else {
                ifR = If.MINI;
            }
            if (!z2 && ifR == If.FULL) {
                return new C3618r.C0275((Bitmap) null, this.f12288.getContentResolver().openInputStream(qVar.f3474), C3616p.C0272.DISK, r1);
            }
            long parseId = ContentUris.parseId(qVar.f3474);
            BitmapFactory.Options r8 = m4067(qVar);
            r8.inJustDecodeBounds = true;
            m4068(qVar.f3479, qVar.f3481, ifR.f2245, ifR.f2243, r8);
            if (z2) {
                if (ifR != If.FULL) {
                    i = ifR.f2244;
                }
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, i, r8);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, ifR.f2244, r8);
            }
            if (bitmap != null) {
                return new C3618r.C0275(bitmap, (InputStream) null, C3616p.C0272.DISK, r1);
            }
        }
        return new C3618r.C0275((Bitmap) null, this.f12288.getContentResolver().openInputStream(qVar.f3474), C3616p.C0272.DISK, r1);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m2420(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f2238, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    query.close();
                    return i;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: o.h$If */
    enum If {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: ɹ  reason: contains not printable characters */
        final int f2243;

        /* renamed from: Ι  reason: contains not printable characters */
        final int f2244;

        /* renamed from: ι  reason: contains not printable characters */
        final int f2245;

        private If(int i, int i2, int i3) {
            this.f2244 = i;
            this.f2245 = i2;
            this.f2243 = i3;
        }
    }
}
