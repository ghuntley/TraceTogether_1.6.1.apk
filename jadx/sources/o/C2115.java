package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: o.ς  reason: contains not printable characters */
public class C2115 extends ImageButton implements C0291, C0902 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1044 f10241;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0337 f10242;

    public C2115(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2115(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f151982130968991);
    }

    public C2115(Context context, AttributeSet attributeSet, int i) {
        super(C1786.m9912(context), attributeSet, i);
        this.f10241 = new C1044(this);
        this.f10241.m7293(attributeSet, i);
        this.f10242 = new C0337(this);
        this.f10242.m4449(attributeSet, i);
    }

    public void setImageResource(int i) {
        this.f10242.m4448(i);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0337 r1 = this.f10242;
        if (r1 != null) {
            r1.m4450();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0337 r1 = this.f10242;
        if (r1 != null) {
            r1.m4450();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0337 r1 = this.f10242;
        if (r1 != null) {
            r1.m4450();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1044 r0 = this.f10241;
        if (r0 != null) {
            r0.m7294(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1044 r0 = this.f10241;
        if (r0 != null) {
            r0.m7297(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1044 r0 = this.f10241;
        if (r0 != null) {
            r0.m7291(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1044 r0 = this.f10241;
        if (r0 != null) {
            return r0.m7289();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1044 r0 = this.f10241;
        if (r0 != null) {
            r0.m7292(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1044 r0 = this.f10241;
        if (r0 != null) {
            return r0.m7295();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0337 r0 = this.f10242;
        if (r0 != null) {
            r0.m4452(colorStateList);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public ColorStateList m11271() {
        C0337 r0 = this.f10242;
        if (r0 != null) {
            return r0.m4447();
        }
        return null;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0337 r0 = this.f10242;
        if (r0 != null) {
            r0.m4453(mode);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public PorterDuff.Mode m11270() {
        C0337 r0 = this.f10242;
        if (r0 != null) {
            return r0.m4451();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1044 r0 = this.f10241;
        if (r0 != null) {
            r0.m7296();
        }
        C0337 r02 = this.f10242;
        if (r02 != null) {
            r02.m4450();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f10242.m4454() && super.hasOverlappingRendering();
    }
}
