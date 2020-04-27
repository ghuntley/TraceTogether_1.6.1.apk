package androidx.activity;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import o.C2456;

public final class ImmLeaksCleaner implements C2456 {

    /* renamed from: ı  reason: contains not printable characters */
    private static Field f86;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Field f87;

    /* renamed from: Ι  reason: contains not printable characters */
    private static int f88;

    /* renamed from: ι  reason: contains not printable characters */
    private static Field f89;

    /* renamed from: ǃ  reason: contains not printable characters */
    private Activity f90;

    public ImmLeaksCleaner(Activity activity) {
        this.f90 = activity;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0044 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x004a */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0044=Splitter:B:28:0x0044, B:35:0x004a=Splitter:B:35:0x004a} */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m94(o.C2851 r3, o.C2319.C2320 r4) {
        /*
            r2 = this;
            o.Іӏ$ǃ r3 = o.C2319.C2320.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f88
            if (r3 != 0) goto L_0x000c
            m93()
        L_0x000c:
            int r3 = f88
            r4 = 1
            if (r3 != r4) goto L_0x004e
            android.app.Activity r3 = r2.f90
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f87     // Catch:{ IllegalAccessException -> 0x004e }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x004e }
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f89     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            if (r0 != 0) goto L_0x0031
            monitor-exit(r4)
            return
        L_0x0031:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0039
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0039:
            java.lang.reflect.Field r0 = f86     // Catch:{ IllegalAccessException -> 0x0044 }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x0044 }
            monitor-exit(r4)
            r3.isActive()
            goto L_0x004e
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r3 = move-exception
            goto L_0x004c
        L_0x0048:
            monitor-exit(r4)
            return
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004c:
            monitor-exit(r4)
            throw r3
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.m94(o.Ӏӏ, o.Іӏ$ǃ):void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m93() {
        try {
            f88 = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f89 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f86 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f87 = declaredField3;
            declaredField3.setAccessible(true);
            f88 = 1;
        } catch (NoSuchFieldException unused) {
        }
    }
}
