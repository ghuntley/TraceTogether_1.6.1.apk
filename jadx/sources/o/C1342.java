package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: o.ɪǃ  reason: contains not printable characters */
class C1342 extends Drawable implements Drawable.Callback, C1465, C1328 {

    /* renamed from: ı  reason: contains not printable characters */
    static final PorterDuff.Mode f7458 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f7459;

    /* renamed from: ɩ  reason: contains not printable characters */
    private PorterDuff.Mode f7460;

    /* renamed from: Ι  reason: contains not printable characters */
    C1538 f7461;

    /* renamed from: ι  reason: contains not printable characters */
    Drawable f7462;

    /* renamed from: і  reason: contains not printable characters */
    private boolean f7463;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f7464;

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public boolean m8425() {
        return true;
    }

    C1342(C1538 r1, Resources resources) {
        this.f7461 = r1;
        m8423(resources);
    }

    C1342(Drawable drawable) {
        this.f7461 = m8424();
        m8427(drawable);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m8423(Resources resources) {
        C1538 r0 = this.f7461;
        if (r0 != null && r0.f8204 != null) {
            m8427(this.f7461.f8204.newDrawable(resources));
        }
    }

    public void jumpToCurrentState() {
        this.f7462.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.f7462.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7462;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.f7462.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C1538 r1 = this.f7461;
        return changingConfigurations | (r1 != null ? r1.getChangingConfigurations() : 0) | this.f7462.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f7462.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f7462.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f7462.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f7462.setColorFilter(colorFilter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f7461;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.m8425()
            if (r0 == 0) goto L_0x000d
            o.ɾı r0 = r1.f7461
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f8206
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f7462
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            return r0
        L_0x0020:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1342.isStateful():boolean");
    }

    public boolean setState(int[] iArr) {
        return m8422(iArr) || this.f7462.setState(iArr);
    }

    public int[] getState() {
        return this.f7462.getState();
    }

    public Drawable getCurrent() {
        return this.f7462.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f7462.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.f7462.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f7462.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f7462.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f7462.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f7462.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f7462.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f7462.getPadding(rect);
    }

    public void setAutoMirrored(boolean z) {
        this.f7462.setAutoMirrored(z);
    }

    public boolean isAutoMirrored() {
        return this.f7462.isAutoMirrored();
    }

    public Drawable.ConstantState getConstantState() {
        C1538 r0 = this.f7461;
        if (r0 == null) {
            return null;
        }
        if (!(r0.f8204 != null)) {
            return null;
        }
        this.f7461.f8205 = getChangingConfigurations();
        return this.f7461;
    }

    public Drawable mutate() {
        if (!this.f7463 && super.mutate() == this) {
            this.f7461 = m8424();
            Drawable drawable = this.f7462;
            if (drawable != null) {
                drawable.mutate();
            }
            C1538 r0 = this.f7461;
            if (r0 != null) {
                Drawable drawable2 = this.f7462;
                r0.f8204 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f7463 = true;
        }
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private C1538 m8424() {
        return new C1538(this.f7461);
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
        return this.f7462.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f7461.f8206 = colorStateList;
        m8422(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f7461.f8203 = mode;
        m8422(getState());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m8422(int[] iArr) {
        if (!m8425()) {
            return false;
        }
        ColorStateList colorStateList = this.f7461.f8206;
        PorterDuff.Mode mode = this.f7461.f8203;
        if (colorStateList == null || mode == null) {
            this.f7464 = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f7464 && colorForState == this.f7459 && mode == this.f7460)) {
                setColorFilter(colorForState, mode);
                this.f7459 = colorForState;
                this.f7460 = mode;
                this.f7464 = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Drawable m8426() {
        return this.f7462;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8427(Drawable drawable) {
        Drawable drawable2 = this.f7462;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f7462 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C1538 r0 = this.f7461;
            if (r0 != null) {
                r0.f8204 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
