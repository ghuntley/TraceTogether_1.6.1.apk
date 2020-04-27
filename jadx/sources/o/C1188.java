package o;

import android.util.LongSparseArray;
import androidx.lifecycle.LiveData;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: o.ɨ  reason: contains not printable characters */
public final class C1188 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static Class<?> f6799;

    /* renamed from: ǃ  reason: contains not printable characters */
    static Field f6800;

    /* renamed from: ɩ  reason: contains not printable characters */
    static boolean f6801;

    /* renamed from: ɹ  reason: contains not printable characters */
    private static boolean f6802;

    /* renamed from: Ι  reason: contains not printable characters */
    static Field f6803;

    /* renamed from: ι  reason: contains not printable characters */
    static boolean f6804;

    /* renamed from: І  reason: contains not printable characters */
    private static boolean f6805;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static Field f6806;

    /* renamed from: ı  reason: contains not printable characters */
    public final Set<LiveData> f6807;

    /* renamed from: і  reason: contains not printable characters */
    public final C1242 f6808;

    /* renamed from: ι  reason: contains not printable characters */
    static void m7725(Object obj) {
        LongSparseArray longSparseArray;
        if (!f6802) {
            try {
                f6799 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f6802 = true;
        }
        Class<?> cls = f6799;
        if (cls != null) {
            if (!f6805) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f6806 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                f6805 = true;
            }
            Field field = f6806;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException unused3) {
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    public C1188(C1242 r2) {
        this.f6807 = Collections.newSetFromMap(new IdentityHashMap());
        this.f6808 = r2;
    }

    protected C1188() {
    }
}
