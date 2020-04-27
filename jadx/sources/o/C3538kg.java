package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.C2944;
import o.C3537kf;

/* renamed from: o.kg  reason: case insensitive filesystem */
public final class C3538kg implements C3149 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1513 f2651;

    /* renamed from: ι  reason: contains not printable characters */
    private final Intent f2652;

    /* renamed from: o.kg$If */
    public interface If extends C2944.C2946 {
    }

    /* renamed from: o.kg$ǃ  reason: contains not printable characters */
    public interface C0198 {
    }

    public C3538kg() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m3271(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (context != null) {
            for (String r4 : strArr) {
                if (C0651.m5452(context, r4) != 0) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Can't check permissions for null context");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m3264(Activity activity, String str, int i, String... strArr) {
        C3537kf.C0197 r0 = new C3537kf.C0197(activity, i, strArr);
        r0.f2647 = str;
        m3267(r0.m3263());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m3268(C1277 r0, String str, int i, String... strArr) {
        C3537kf.C0197 r2 = new C3537kf.C0197(r0, strArr);
        r2.f2647 = str;
        m3267(r2.m3263());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m3270(int i, String[] strArr, int[] iArr, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr[i2] == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        for (int i3 = 0; i3 <= 0; i3++) {
            Object obj = objArr[0];
            arrayList.isEmpty();
            arrayList2.isEmpty();
            if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                m3265(obj, i);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m3266(Object obj, int i, String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            iArr[i2] = 0;
        }
        m3270(i, strArr, iArr, obj);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m3265(Object obj, int i) {
        Class cls = obj.getClass();
        if (m3269(obj)) {
            cls = cls.getSuperclass();
        }
        while (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                C3532ka kaVar = (C3532ka) method.getAnnotation(C3532ka.class);
                if (kaVar != null && kaVar.m3258() == i) {
                    if (method.getParameterTypes().length <= 0) {
                        try {
                            if (!method.isAccessible()) {
                                method.setAccessible(true);
                            }
                            method.invoke(obj, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused) {
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Cannot execute method ");
                        sb.append(method.getName());
                        sb.append(" because it is non-void method and/or has input parameters.");
                        throw new RuntimeException(sb.toString());
                    }
                }
            }
            cls = cls.getSuperclass();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m3269(Object obj) {
        if (!obj.getClass().getSimpleName().endsWith(C3292bc.f1729)) {
            return false;
        }
        try {
            return Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m3267(C3537kf kfVar) {
        if (m3271(kfVar.f2637.m3297(), kfVar.m3262())) {
            m3266(kfVar.f2637.f2669, kfVar.f2639, kfVar.m3262());
            return;
        }
        C3546ko koVar = kfVar.f2637;
        String str = kfVar.f2641;
        String str2 = kfVar.f2638;
        String str3 = kfVar.f2642;
        int i = kfVar.f2640;
        int i2 = kfVar.f2639;
        String[] r8 = kfVar.m3262();
        if (koVar.m3295(r8)) {
            koVar.m3293(str, str2, str3, i, i2, r8);
        } else {
            koVar.m3296(i2, r8);
        }
    }

    public C3538kg(C1513 r1, Intent intent) {
        this.f2651 = r1;
        this.f2652 = intent;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3272(C0329 r3) {
        this.f2651.m8957(this.f2652, r3);
    }
}
