package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.C0904;

/* renamed from: o.ǃʟ  reason: contains not printable characters */
class C0915 extends C1317 {

    /* renamed from: ı  reason: contains not printable characters */
    private static Method f5800 = null;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Constructor f5801 = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Class f5802 = null;

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean f5803 = false;

    /* renamed from: ι  reason: contains not printable characters */
    private static Method f5804;

    C0915() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m6739() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f5803) {
            f5803 = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
                cls = null;
                method = null;
            }
            f5801 = constructor;
            f5802 = cls;
            f5804 = method;
            f5800 = method2;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private File m6742(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Object m6740() {
        m6739();
        try {
            return f5801.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static Typeface m6741(Object obj) {
        m6739();
        try {
            Object newInstance = Array.newInstance(f5802, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f5800.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m6743(Object obj, String str, int i, boolean z) {
        m6739();
        try {
            return ((Boolean) f5804.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r3.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0053, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0056, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x005f, code lost:
        throw r5;
     */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface m6745(android.content.Context r3, android.os.CancellationSignal r4, o.C1929.If[] r5, int r6) {
        /*
            r2 = this;
            int r0 = r5.length
            r1 = 0
            if (r0 > 0) goto L_0x0005
            return r1
        L_0x0005:
            o.γ$If r5 = r2.m8297(r5, r6)
            android.content.ContentResolver r6 = r3.getContentResolver()
            android.net.Uri r5 = r5.m10547()     // Catch:{ IOException -> 0x0060 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r4 = r6.openFileDescriptor(r5, r0, r4)     // Catch:{ IOException -> 0x0060 }
            if (r4 != 0) goto L_0x001f
            if (r4 == 0) goto L_0x001e
            r4.close()     // Catch:{ IOException -> 0x0060 }
        L_0x001e:
            return r1
        L_0x001f:
            java.io.File r5 = r2.m6742((android.os.ParcelFileDescriptor) r4)     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x0034
            boolean r6 = r5.canRead()     // Catch:{ all -> 0x0054 }
            if (r6 != 0) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r5)     // Catch:{ all -> 0x0054 }
            r4.close()     // Catch:{ IOException -> 0x0060 }
            return r3
        L_0x0034:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0054 }
            java.io.FileDescriptor r6 = r4.getFileDescriptor()     // Catch:{ all -> 0x0054 }
            r5.<init>(r6)     // Catch:{ all -> 0x0054 }
            android.graphics.Typeface r3 = super.m8300((android.content.Context) r3, (java.io.InputStream) r5)     // Catch:{ all -> 0x0048 }
            r5.close()     // Catch:{ all -> 0x0054 }
            r4.close()     // Catch:{ IOException -> 0x0060 }
            return r3
        L_0x0048:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x004a }
        L_0x004a:
            r6 = move-exception
            r5.close()     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r5 = move-exception
            r3.addSuppressed(r5)     // Catch:{ all -> 0x0054 }
        L_0x0053:
            throw r6     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r5 = move-exception
            r4.close()     // Catch:{ all -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch:{ IOException -> 0x0060 }
        L_0x005f:
            throw r5     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0915.m6745(android.content.Context, android.os.CancellationSignal, o.γ$If[], int):android.graphics.Typeface");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public Typeface m6744(Context context, C0904.C0907 r9, Resources resources, int i) {
        Object r11 = m6740();
        C0904.C0906[] r92 = r9.m6706();
        int length = r92.length;
        int i2 = 0;
        while (i2 < length) {
            C0904.C0906 r2 = r92[i2];
            File r3 = C1189.m7728(context);
            if (r3 == null) {
                return null;
            }
            try {
                if (!C1189.m7731(r3, resources, r2.m6701())) {
                    r3.delete();
                    return null;
                } else if (!m6743(r11, r3.getPath(), r2.m6704(), r2.m6702())) {
                    return null;
                } else {
                    r3.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                r3.delete();
            }
        }
        return m6741(r11);
    }
}
