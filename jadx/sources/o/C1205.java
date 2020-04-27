package o;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.ɨǃ  reason: contains not printable characters */
public class C1205 extends C1240 {
    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public Typeface m7825(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f7021, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f7022.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: і  reason: contains not printable characters */
    public Method m7826(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
