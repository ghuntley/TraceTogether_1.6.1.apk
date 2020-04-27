package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import o.C0904;
import o.C1929;

/* renamed from: o.ǃг  reason: contains not printable characters */
class C0924 extends C1317 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Method f5831;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Method f5832;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Constructor f5833;

    /* renamed from: ι  reason: contains not printable characters */
    private static final Class f5834;

    C0924() {
    }

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method2 = null;
            method = null;
        }
        f5833 = constructor;
        f5834 = cls;
        f5832 = method;
        f5831 = method2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m6755() {
        return f5832 != null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Object m6758() {
        try {
            return f5833.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m6756(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f5832.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static Typeface m6757(Object obj) {
        try {
            Object newInstance = Array.newInstance(f5834, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f5831.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public Typeface m6760(Context context, CancellationSignal cancellationSignal, C1929.If[] ifArr, int i) {
        Object r0 = m6758();
        if (r0 == null) {
            return null;
        }
        C0910 r2 = new C0910();
        for (C1929.If ifR : ifArr) {
            Uri r6 = ifR.m10547();
            ByteBuffer byteBuffer = (ByteBuffer) r2.get(r6);
            if (byteBuffer == null) {
                byteBuffer = C1189.m7729(context, cancellationSignal, r6);
                r2.put(r6, byteBuffer);
            }
            if (byteBuffer == null || !m6756(r0, byteBuffer, ifR.m10546(), ifR.m10548(), ifR.m10545())) {
                return null;
            }
        }
        Typeface r10 = m6757(r0);
        if (r10 == null) {
            return null;
        }
        return Typeface.create(r10, i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public Typeface m6759(Context context, C0904.C0907 r9, Resources resources, int i) {
        Object r11 = m6758();
        if (r11 == null) {
            return null;
        }
        for (C0904.C0906 r3 : r9.m6706()) {
            ByteBuffer r4 = C1189.m7726(context, resources, r3.m6701());
            if (r4 == null || !m6756(r11, r4, r3.m6703(), r3.m6704(), r3.m6702())) {
                return null;
            }
        }
        return m6757(r11);
    }
}
