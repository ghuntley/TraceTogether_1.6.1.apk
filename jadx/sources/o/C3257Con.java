package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* renamed from: o.Con  reason: case insensitive filesystem */
public final class C3257Con {

    /* renamed from: ı  reason: contains not printable characters */
    private static final ThreadLocal<TypedValue> f1251 = new ThreadLocal<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Object f1252 = new Object();

    /* renamed from: Ι  reason: contains not printable characters */
    private static final WeakHashMap<Context, SparseArray<C0093>> f1253 = new WeakHashMap<>(0);

    /* renamed from: ǃ  reason: contains not printable characters */
    public static ColorStateList m1342(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList r0 = m1341(context, i);
        if (r0 != null) {
            return r0;
        }
        ColorStateList r02 = m1344(context, i);
        if (r02 == null) {
            return C0651.m5454(context, i);
        }
        m1343(context, i, r02);
        return r02;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Drawable m1345(Context context, int i) {
        return C0930.m6776().m6782(context, i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static ColorStateList m1344(Context context, int i) {
        if (m1347(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0763.m6040(resources, resources.getXml(i), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m1341(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f1252
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<o.Con$ɩ>> r1 = f1253     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            o.Con$ɩ r2 = (o.C3257Con.C0093) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f1254     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f1255     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3257Con.m1341(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m1343(Context context, int i, ColorStateList colorStateList) {
        synchronized (f1252) {
            SparseArray sparseArray = f1253.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f1253.put(context, sparseArray);
            }
            sparseArray.append(i, new C0093(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m1347(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue r0 = m1346();
        resources.getValue(i, r0, true);
        if (r0.type < 28 || r0.type > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static TypedValue m1346() {
        TypedValue typedValue = f1251.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1251.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: o.Con$ɩ  reason: contains not printable characters */
    static class C0093 {

        /* renamed from: ɩ  reason: contains not printable characters */
        final Configuration f1254;

        /* renamed from: Ι  reason: contains not printable characters */
        final ColorStateList f1255;

        C0093(ColorStateList colorStateList, Configuration configuration) {
            this.f1255 = colorStateList;
            this.f1254 = configuration;
        }
    }
}
