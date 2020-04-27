package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;

/* renamed from: o.ɵı  reason: contains not printable characters */
final class C1456 {

    /* renamed from: ɩ  reason: contains not printable characters */
    static final boolean f7822 = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: ı  reason: contains not printable characters */
    int f7823;

    /* renamed from: ŀ  reason: contains not printable characters */
    boolean f7824;

    /* renamed from: Ɩ  reason: contains not printable characters */
    int f7825;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f7826;

    /* renamed from: ȷ  reason: contains not printable characters */
    Drawable f7827;

    /* renamed from: ɨ  reason: contains not printable characters */
    ColorStateList f7828;

    /* renamed from: ɪ  reason: contains not printable characters */
    boolean f7829 = false;

    /* renamed from: ɹ  reason: contains not printable characters */
    PorterDuff.Mode f7830;

    /* renamed from: ɾ  reason: contains not printable characters */
    ColorStateList f7831;

    /* renamed from: ɿ  reason: contains not printable characters */
    boolean f7832 = false;

    /* renamed from: ʟ  reason: contains not printable characters */
    boolean f7833 = false;

    /* renamed from: Ι  reason: contains not printable characters */
    C0785 f7834;

    /* renamed from: ι  reason: contains not printable characters */
    final C1579 f7835;

    /* renamed from: І  reason: contains not printable characters */
    int f7836;

    /* renamed from: г  reason: contains not printable characters */
    LayerDrawable f7837;

    /* renamed from: і  reason: contains not printable characters */
    int f7838;

    /* renamed from: Ӏ  reason: contains not printable characters */
    int f7839;

    /* renamed from: ӏ  reason: contains not printable characters */
    ColorStateList f7840;

    C1456(C1579 r2, C0785 r3) {
        this.f7835 = r2;
        this.f7834 = r3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final C0671 m8718(boolean z) {
        LayerDrawable layerDrawable = this.f7837;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f7822) {
            return (C0671) ((LayerDrawable) ((InsetDrawable) this.f7837.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (C0671) this.f7837.getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private C0710 m8717() {
        LayerDrawable layerDrawable = this.f7837;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f7837.getNumberOfLayers() > 2) {
            return (C0710) this.f7837.getDrawable(2);
        }
        return (C0710) this.f7837.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m8720() {
        int i = 0;
        C0671 r1 = m8718(false);
        C0671 r2 = m8718(true);
        if (r1 != null) {
            r1.m5525((float) this.f7825, this.f7828);
            if (r2 != null) {
                float f = (float) this.f7825;
                if (this.f7829) {
                    C1579 r0 = this.f7835;
                    i = C0328.m4398(r0.getContext(), (int) R.attr.f150352130968822, r0.getClass().getCanonicalName());
                }
                r2.m5532(f, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m8719(C0785 r3) {
        if (m8718(false) != null) {
            m8718(false).setShapeAppearanceModel(r3);
        }
        if (m8718(true) != null) {
            m8718(true).setShapeAppearanceModel(r3);
        }
        if (m8717() != null) {
            m8717().setShapeAppearanceModel(r3);
        }
    }
}
