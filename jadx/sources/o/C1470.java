package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: o.ɹι  reason: contains not printable characters */
class C1470 extends C1342 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Method f7903;

    C1470(Drawable drawable) {
        super(drawable);
        m8799();
    }

    C1470(C1538 r1, Resources resources) {
        super(r1, resources);
        m8799();
    }

    public void setHotspot(float f, float f2) {
        this.f7462.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f7462.setHotspotBounds(i, i2, i3, i4);
    }

    public void getOutline(Outline outline) {
        this.f7462.getOutline(outline);
    }

    public Rect getDirtyBounds() {
        return this.f7462.getDirtyBounds();
    }

    public void setTintList(ColorStateList colorStateList) {
        if (m8800()) {
            super.setTintList(colorStateList);
        } else {
            this.f7462.setTintList(colorStateList);
        }
    }

    public void setTint(int i) {
        if (m8800()) {
            super.setTint(i);
        } else {
            this.f7462.setTint(i);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (m8800()) {
            super.setTintMode(mode);
        } else {
            this.f7462.setTintMode(mode);
        }
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public boolean m8800() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f7462;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public boolean isProjected() {
        Method method;
        if (!(this.f7462 == null || (method = f7903) == null)) {
            try {
                return ((Boolean) method.invoke(this.f7462, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m8799() {
        if (f7903 == null) {
            try {
                f7903 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }
}
