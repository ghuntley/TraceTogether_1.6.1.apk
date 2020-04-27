package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: o.ɾı  reason: contains not printable characters */
final class C1538 extends Drawable.ConstantState {

    /* renamed from: ı  reason: contains not printable characters */
    PorterDuff.Mode f8203 = C1342.f7458;

    /* renamed from: ǃ  reason: contains not printable characters */
    Drawable.ConstantState f8204;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f8205;

    /* renamed from: Ι  reason: contains not printable characters */
    ColorStateList f8206 = null;

    C1538(C1538 r2) {
        if (r2 != null) {
            this.f8205 = r2.f8205;
            this.f8204 = r2.f8204;
            this.f8206 = r2.f8206;
            this.f8203 = r2.f8203;
        }
    }

    public final Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public final Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C1470(this, resources);
        }
        return new C1342(this, resources);
    }

    public final int getChangingConfigurations() {
        int i = this.f8205;
        Drawable.ConstantState constantState = this.f8204;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }
}
