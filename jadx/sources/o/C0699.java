package o;

import android.annotation.SuppressLint;
import java.util.HashMap;
import o.C0712;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* renamed from: o.Ɨι  reason: contains not printable characters */
public final class C0699 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final HashMap<Class<?>, String> f4880 = new HashMap<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    public final HashMap<String, C0712<? extends C0593>> f4881 = new HashMap<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m5751(String str) {
        return str != null && !str.isEmpty();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static String m5750(Class<? extends C0712> cls) {
        String str = f4880.get(cls);
        if (str == null) {
            C0712.Cif ifVar = (C0712.Cif) cls.getAnnotation(C0712.Cif.class);
            if (ifVar != null) {
                str = ifVar.m5830();
            } else {
                str = null;
            }
            if (str != null && !str.isEmpty()) {
                f4880.put(cls, str);
            } else {
                StringBuilder sb = new StringBuilder("No @Navigator.Name annotation found for ");
                sb.append(cls.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return str;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0712<? extends C0593> m5752(C0712<? extends C0593> r3) {
        String r0 = m5750((Class<? extends C0712>) r3.getClass());
        if (r0 != null && !r0.isEmpty()) {
            return this.f4881.put(r0, r3);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <T extends C0712<?>> T m5753(String str) {
        if (str != null && !str.isEmpty()) {
            T t = (C0712) this.f4881.get(str);
            if (t != null) {
                return t;
            }
            StringBuilder sb = new StringBuilder("Could not find Navigator with name \"");
            sb.append(str);
            sb.append("\". You must call NavController.addNavigator() for each navigation type.");
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
