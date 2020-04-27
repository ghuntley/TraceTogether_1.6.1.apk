package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: o.ւɿ  reason: contains not printable characters */
public class C3206 extends ImageButton {

    /* renamed from: і  reason: contains not printable characters */
    public int f14562;

    public C3206(Context context) {
        this(context, (AttributeSet) null);
    }

    public C3206(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3206(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14562 = getVisibility();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16155(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f14562 = i;
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f14562 = i;
    }
}
