package o;

import dalvik.system.PathClassLoader;

/* renamed from: o.ӏґ  reason: contains not printable characters */
public final class C2917 extends PathClassLoader {
    public C2917(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    /* access modifiers changed from: protected */
    public final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
