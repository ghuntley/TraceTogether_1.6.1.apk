package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: o.Ɨǃ  reason: contains not printable characters */
public class C0679 {
    /* renamed from: Ι  reason: contains not printable characters */
    public static ColorStateList m5552(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof C0902) {
            return ((C0902) imageView).m6683();
        }
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m5550(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C0902) {
            ((C0902) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static PorterDuff.Mode m5551(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof C0902) {
            return ((C0902) imageView).m6682();
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m5553(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C0902) {
            ((C0902) imageView).setSupportImageTintMode(mode);
        }
    }
}
