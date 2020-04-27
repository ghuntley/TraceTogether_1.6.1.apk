package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* renamed from: o.Іı  reason: contains not printable characters */
final class C2212 {

    /* renamed from: ı  reason: contains not printable characters */
    final Rect f10475 = new Rect();

    /* renamed from: ǃ  reason: contains not printable characters */
    final TextView f10476;

    /* renamed from: ɩ  reason: contains not printable characters */
    final Context f10477;

    /* renamed from: Ι  reason: contains not printable characters */
    final View f10478;

    /* renamed from: ι  reason: contains not printable characters */
    final WindowManager.LayoutParams f10479 = new WindowManager.LayoutParams();

    /* renamed from: І  reason: contains not printable characters */
    final int[] f10480 = new int[2];

    /* renamed from: Ӏ  reason: contains not printable characters */
    final int[] f10481 = new int[2];

    C2212(Context context) {
        this.f10477 = context;
        this.f10478 = LayoutInflater.from(this.f10477).inflate(R.layout.f168862131558427, (ViewGroup) null);
        this.f10476 = (TextView) this.f10478.findViewById(R.id.f165812131362137);
        this.f10479.setTitle(getClass().getSimpleName());
        this.f10479.packageName = this.f10477.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f10479;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.f172122131951621;
        layoutParams.flags = 24;
    }
}
