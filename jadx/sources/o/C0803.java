package o;

import android.util.Property;
import android.view.ViewGroup;

/* renamed from: o.ƶɩ  reason: contains not printable characters */
public final class C0803 extends Property<ViewGroup, Float> {

    /* renamed from: ı  reason: contains not printable characters */
    public static final Property<ViewGroup, Float> f5282 = new C0803("childrenAlpha");

    public final /* synthetic */ Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(R.id.f166052131362164);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(R.id.f166052131362164, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }

    private C0803(String str) {
        super(Float.class, str);
    }
}
