package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.InputStream;
import o.C3616p;

/* renamed from: o.r  reason: case insensitive filesystem */
public abstract class C3618r {
    /* renamed from: ı  reason: contains not printable characters */
    public abstract C0275 m4069(C3617q qVar);

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m4070(NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m4071() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public int m4072() {
        return 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public abstract boolean m4073(C3617q qVar);

    /* renamed from: o.r$ǃ  reason: contains not printable characters */
    public static final class C0275 {

        /* renamed from: ǃ  reason: contains not printable characters */
        final InputStream f3490;

        /* renamed from: ɩ  reason: contains not printable characters */
        final int f3491;

        /* renamed from: Ι  reason: contains not printable characters */
        final Bitmap f3492;

        /* renamed from: ι  reason: contains not printable characters */
        final C3616p.C0272 f3493;

        public C0275(Bitmap bitmap, C3616p.C0272 r4) {
            this((Bitmap) C3626z.m4093(bitmap, "bitmap == null"), (InputStream) null, r4, 0);
        }

        public C0275(InputStream inputStream, C3616p.C0272 r4) {
            this((Bitmap) null, (InputStream) C3626z.m4093(inputStream, "stream == null"), r4, 0);
        }

        C0275(Bitmap bitmap, InputStream inputStream, C3616p.C0272 r6, int i) {
            boolean z = true;
            if ((inputStream == null ? false : z) ^ (bitmap != null)) {
                this.f3492 = bitmap;
                this.f3490 = inputStream;
                this.f3493 = (C3616p.C0272) C3626z.m4093(r6, "loadedFrom == null");
                this.f3491 = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m4068(int i, int i2, int i3, int i4, BitmapFactory.Options options) {
        int i5;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                floor = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                i5 = Math.min((int) Math.floor((double) (((float) i4) / ((float) i2))), (int) Math.floor((double) (((float) i3) / ((float) i))));
            }
            i5 = (int) floor;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static BitmapFactory.Options m4067(C3617q qVar) {
        boolean z = false;
        boolean z2 = (qVar.f3479 == 0 && qVar.f3481 == 0) ? false : true;
        if (qVar.f3477 != null) {
            z = true;
        }
        BitmapFactory.Options options = null;
        if (z2 || z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = z2;
            if (z) {
                options.inPreferredConfig = qVar.f3477;
            }
        }
        return options;
    }
}
