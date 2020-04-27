package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: o.Ιǃ  reason: contains not printable characters */
final class C1804 extends C0916 {

    /* renamed from: ı  reason: contains not printable characters */
    private final WeakReference<Context> f9242;

    public C1804(Context context, Resources resources) {
        super(resources);
        this.f9242 = new WeakReference<>(context);
    }

    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f9242.get();
        if (!(drawable == null || context == null)) {
            C0930 r2 = C0930.m6776();
            if (r2.f5896 != null) {
                r2.f5896.m6792(context, i, drawable);
            }
        }
        return drawable;
    }
}
