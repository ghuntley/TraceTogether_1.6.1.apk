package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: o.ʟ  reason: contains not printable characters */
public class C1678 extends Drawable implements Drawable.Callback {

    /* renamed from: ǃ  reason: contains not printable characters */
    public Drawable f8701;

    public C1678(Drawable drawable) {
        Drawable drawable2 = this.f8701;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f8701 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f8701.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f8701.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.f8701.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return this.f8701.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f8701.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f8701.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f8701.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f8701.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        return this.f8701.isStateful();
    }

    public boolean setState(int[] iArr) {
        return this.f8701.setState(iArr);
    }

    public int[] getState() {
        return this.f8701.getState();
    }

    public void jumpToCurrentState() {
        C1266.m8144(this.f8701);
    }

    public Drawable getCurrent() {
        return this.f8701.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f8701.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.f8701.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f8701.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f8701.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f8701.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f8701.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f8701.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f8701.getPadding(rect);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f8701.setLevel(i);
    }

    public void setAutoMirrored(boolean z) {
        C1266.m8154(this.f8701, z);
    }

    public boolean isAutoMirrored() {
        return C1266.m8142(this.f8701);
    }

    public void setTint(int i) {
        C1266.m8148(this.f8701, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C1266.m8152(this.f8701, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C1266.m8153(this.f8701, mode);
    }

    public void setHotspot(float f, float f2) {
        C1266.m8150(this.f8701, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C1266.m8151(this.f8701, i, i2, i3, i4);
    }
}
