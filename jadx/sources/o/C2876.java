package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;
import o.C2895;

/* renamed from: o.ӏƖ  reason: contains not printable characters */
final class C2876 extends C2895.C2898 {

    /* renamed from: ɩ  reason: contains not printable characters */
    C2895.C3659aux f13405;

    /* renamed from: ι  reason: contains not printable characters */
    private final LinearLayoutManager f13406;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14940(int i) {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14941(int i) {
    }

    C2876(LinearLayoutManager linearLayoutManager) {
        this.f13406 = linearLayoutManager;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m14939(int i, float f, int i2) {
        if (this.f13405 != null) {
            int i3 = 0;
            while (i3 < this.f13406.m421()) {
                View r5 = this.f13406.m432(i3);
                if (r5 != null) {
                    LinearLayoutManager.m392(r5);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f13406.m421())}));
                }
            }
        }
    }
}
