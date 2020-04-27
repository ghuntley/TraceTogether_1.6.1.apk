package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: o.ıΣ  reason: contains not printable characters */
public final class C0385 extends Drawable implements C0710, C1328 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private C0386 f3942;

    public final boolean isStateful() {
        return true;
    }

    /* synthetic */ C0385(C0386 r1, byte b) {
        this(r1);
    }

    public C0385(C0785 r3) {
        this(new C0386(new C0671(r3)));
    }

    private C0385(C0386 r1) {
        this.f3942 = r1;
    }

    public final void setTint(int i) {
        this.f3942.f3943.setTint(i);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f3942.f3943.setTintMode(mode);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f3942.f3943.setTintList(colorStateList);
    }

    public final void setShapeAppearanceModel(C0785 r2) {
        this.f3942.f3943.setShapeAppearanceModel(r2);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f3942.f3943.setState(iArr)) {
            onStateChange = true;
        }
        boolean r4 = C0410.m4697(iArr);
        if (this.f3942.f3944 == r4) {
            return onStateChange;
        }
        this.f3942.f3944 = r4;
        return true;
    }

    public final void draw(Canvas canvas) {
        if (this.f3942.f3944) {
            this.f3942.f3943.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3942.f3943.setBounds(rect);
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f3942;
    }

    public final void setAlpha(int i) {
        this.f3942.f3943.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3942.f3943.setColorFilter(colorFilter);
    }

    public final int getOpacity() {
        return this.f3942.f3943.getOpacity();
    }

    /* renamed from: o.ıΣ$ɩ  reason: contains not printable characters */
    static final class C0386 extends Drawable.ConstantState {

        /* renamed from: ɩ  reason: contains not printable characters */
        C0671 f3943;

        /* renamed from: Ι  reason: contains not printable characters */
        boolean f3944;

        public final int getChangingConfigurations() {
            return 0;
        }

        public C0386(C0671 r1) {
            this.f3943 = r1;
            this.f3944 = false;
        }

        public C0386(C0386 r2) {
            this.f3943 = (C0671) r2.f3943.getConstantState().newDrawable();
            this.f3944 = r2.f3944;
        }

        public final /* synthetic */ Drawable newDrawable() {
            return new C0385(new C0386(this), (byte) 0);
        }
    }

    public final /* synthetic */ Drawable mutate() {
        this.f3942 = new C0386(this.f3942);
        return this;
    }
}
