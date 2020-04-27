package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: o.Іɨ  reason: contains not printable characters */
class C2251 implements C2260 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final ViewGroupOverlay f10573;

    C2251(ViewGroup viewGroup) {
        this.f10573 = viewGroup.getOverlay();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m11788(View view) {
        this.f10573.add(view);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m11789(View view) {
        this.f10573.remove(view);
    }
}
