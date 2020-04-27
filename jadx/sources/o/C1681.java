package o;

import android.content.res.Resources;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import o.C1746;

/* renamed from: o.ʟȷ  reason: contains not printable characters */
public final class C1681 extends C1566 {

    /* renamed from: ı  reason: contains not printable characters */
    private View f8702;

    /* renamed from: ǃ  reason: contains not printable characters */
    private View f8703;

    /* renamed from: ı  reason: contains not printable characters */
    public final View m9558() {
        int i;
        int i2;
        this.f8702 = new View(this.f8319.getContext());
        boolean z = false;
        if (this.f8319.f8069 == 1) {
            i = 0;
        } else {
            i = this.f8319.getContext().getResources().getDimensionPixelSize(R.dimen.f158402131165334);
        }
        if (!(this.f8319.f8069 == 1)) {
            i2 = 0;
        } else {
            i2 = this.f8319.getContext().getResources().getDimensionPixelSize(R.dimen.f158402131165334);
        }
        InsetDrawable insetDrawable = new InsetDrawable(C0651.m5458(this.f8319.getContext(), R.drawable.f160992131230877), i2, i, i2, i);
        View view = this.f8702;
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(insetDrawable);
        } else {
            view.setBackgroundDrawable(insetDrawable);
        }
        Resources resources = this.f8319.getContext().getResources();
        boolean z2 = this.f8319.f8069 == 1;
        int i3 = R.dimen.f158382131165331;
        int dimensionPixelSize = resources.getDimensionPixelSize(z2 ? R.dimen.f158382131165331 : R.dimen.f158392131165333);
        Resources resources2 = this.f8319.getContext().getResources();
        if (this.f8319.f8069 == 1) {
            z = true;
        }
        if (z) {
            i3 = R.dimen.f158392131165333;
        }
        this.f8702.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, resources2.getDimensionPixelSize(i3)));
        return this.f8702;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final TextView m9560() {
        return (TextView) this.f8703;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final C1741 m9562() {
        return new C2317(new C1746.C1747(this.f8703).m9817().m9815().m9816());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final View m9559(ViewGroup viewGroup) {
        this.f8703 = LayoutInflater.from(this.f8319.getContext()).inflate(R.layout.f169162131558459, viewGroup, false);
        return this.f8703;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m9561() {
        float f;
        int i;
        boolean z = true;
        if (this.f8319.f8069 != 1) {
            z = false;
        }
        if (z) {
            f = ((float) this.f8702.getHeight()) / 2.0f;
            i = this.f8703.getHeight();
        } else {
            f = ((float) this.f8702.getWidth()) / 2.0f;
            i = this.f8703.getWidth();
        }
        return (int) (f - ((float) i));
    }
}
