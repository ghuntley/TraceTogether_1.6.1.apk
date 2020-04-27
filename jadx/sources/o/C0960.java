package o;

import android.graphics.Color;

/* renamed from: o.ȷǃ  reason: contains not printable characters */
public final class C0960 {

    /* renamed from: ɩ  reason: contains not printable characters */
    public float f5964;

    /* renamed from: ι  reason: contains not printable characters */
    public int f5965;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m6875(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - alpha2;
        int i4 = 255 - (((255 - alpha) * i3) / 255);
        int i5 = 0;
        int red = i4 == 0 ? 0 : (((Color.red(i) * 255) * alpha2) + ((Color.red(i2) * alpha) * i3)) / (i4 * 255);
        int green = i4 == 0 ? 0 : (((Color.green(i) * 255) * alpha2) + ((Color.green(i2) * alpha) * i3)) / (i4 * 255);
        int blue = Color.blue(i);
        int blue2 = Color.blue(i2);
        if (i4 != 0) {
            i5 = (((blue * 255) * alpha2) + ((blue2 * alpha) * i3)) / (i4 * 255);
        }
        return Color.argb(i4, red, green, i5);
    }
}
