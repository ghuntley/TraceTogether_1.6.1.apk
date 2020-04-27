package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;

/* renamed from: o.ıɴ  reason: contains not printable characters */
public final class C0344 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Context f3737;

    /* renamed from: ı  reason: contains not printable characters */
    public static ColorStateList m4473(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList r1;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (r1 = C3257Con.m1342(context, resourceId)) != null) {
            return r1;
        }
        if (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i, -1)) == -1) {
            return typedArray.getColorStateList(i);
        }
        return ColorStateList.valueOf(color);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Drawable m4474(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable r1;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (r1 = C3257Con.m1345(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m4475(Context context, TypedArray typedArray, int i) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, -1);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static ColorStateList m4476(Context context, C1992 r3, int i) {
        int color;
        int resourceId;
        ColorStateList r2;
        if (r3.f9934.hasValue(i) && (resourceId = r3.f9934.getResourceId(i, 0)) != 0 && (r2 = C3257Con.m1342(context, resourceId)) != null) {
            return r2;
        }
        if (Build.VERSION.SDK_INT > 15 || (color = r3.f9934.getColor(i, -1)) == -1) {
            return r3.m10792(i);
        }
        return ColorStateList.valueOf(color);
    }

    public C0344(Context context) {
        this.f3737 = context;
    }

    public final void run() {
        C0452.m4771(this.f3737);
    }
}
