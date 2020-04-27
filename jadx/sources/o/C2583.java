package o;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import o.C2512;

/* renamed from: o.іɩ  reason: contains not printable characters */
public final class C2583 extends C2107 {
    public C2583(Context context) {
        super(context);
    }

    public C2583(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C2583(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m13724(AttributeSet attributeSet) {
        super.m11259(attributeSet);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m13722(C2512 r8) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f10219; i++) {
            View view = r8.f11352.get(this.f10221[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    view.setElevation(elevation);
                }
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m13723() {
        C2512.C2513 r0 = (C2512.C2513) getLayoutParams();
        r0.f11409.m9645(0);
        r0.f11409.m9651(0);
    }
}
