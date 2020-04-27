package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import o.C0858;

/* renamed from: o.Ɍ  reason: contains not printable characters */
public final class C1057 extends View {

    /* renamed from: ı  reason: contains not printable characters */
    public final Drawable f6327;

    /* renamed from: Ι  reason: contains not printable characters */
    public final CharSequence f6328;

    /* renamed from: ι  reason: contains not printable characters */
    public final int f6329;

    public C1057(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1057(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1992 r1 = new C1992(context, context.obtainStyledAttributes(attributeSet, C0858.Aux.f5615));
        this.f6328 = r1.f9934.getText(2);
        this.f6327 = r1.m10793(0);
        this.f6329 = r1.f9934.getResourceId(1, 0);
        r1.f9934.recycle();
    }
}
