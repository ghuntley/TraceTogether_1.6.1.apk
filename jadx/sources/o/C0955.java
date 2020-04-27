package o;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: o.ȶ  reason: contains not printable characters */
public final class C0955 extends Property<Drawable, Integer> {

    /* renamed from: ı  reason: contains not printable characters */
    public static final Property<Drawable, Integer> f5951 = new C0955();

    /* renamed from: ι  reason: contains not printable characters */
    private final WeakHashMap<Drawable, Integer> f5952 = new WeakHashMap<>();

    public final /* synthetic */ Object get(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f5952.containsKey(drawable)) {
            return this.f5952.get(drawable);
        }
        return 255;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        Integer num = (Integer) obj2;
        if (Build.VERSION.SDK_INT < 19) {
            this.f5952.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }

    private C0955() {
        super(Integer.class, "drawableAlphaCompat");
    }
}
