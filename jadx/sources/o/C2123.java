package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: o.υ  reason: contains not printable characters */
public final class C2123 extends Resources {

    /* renamed from: ı  reason: contains not printable characters */
    private final WeakReference<Context> f10264;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m11293() {
        return false;
    }

    public C2123(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f10264 = new WeakReference<>(context);
    }

    public final Drawable getDrawable(int i) {
        Context context = this.f10264.get();
        if (context != null) {
            return C0930.m6776().m6780(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Drawable m11294(int i) {
        return super.getDrawable(i);
    }
}
