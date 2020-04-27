package o;

import android.content.Context;
import android.graphics.BitmapFactory;

public final class bE {

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int f1586;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f1587;

    /* renamed from: Ι  reason: contains not printable characters */
    public final int f1588;

    /* renamed from: ι  reason: contains not printable characters */
    public final int f1589;

    private bE(String str, int i, int i2, int i3) {
        this.f1587 = str;
        this.f1586 = i;
        this.f1589 = i2;
        this.f1588 = i3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static bE m1704(Context context, String str) {
        if (str != null) {
            try {
                int r0 = C3285aw.m1696(context);
                C3263ac.m1563();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), r0, options);
                return new bE(str, r0, options.outWidth, options.outHeight);
            } catch (Exception unused) {
                C3263ac.m1563();
            }
        }
        return null;
    }
}
