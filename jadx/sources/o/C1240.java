package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import o.C0904;

/* renamed from: o.ɩƖ  reason: contains not printable characters */
public class C1240 extends C0915 {

    /* renamed from: ı  reason: contains not printable characters */
    protected final Method f7016;

    /* renamed from: ǃ  reason: contains not printable characters */
    protected final Method f7017;

    /* renamed from: ɩ  reason: contains not printable characters */
    protected final Constructor f7018;

    /* renamed from: ɹ  reason: contains not printable characters */
    protected final Method f7019;

    /* renamed from: Ι  reason: contains not printable characters */
    protected final Method f7020;

    /* renamed from: ι  reason: contains not printable characters */
    protected final Class f7021;

    /* renamed from: і  reason: contains not printable characters */
    protected final Method f7022;

    public C1240() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class r1 = m8002();
            constructor = m8003(r1);
            method4 = m8001(r1);
            method3 = m8009(r1);
            method2 = m8008(r1);
            method = m8005(r1);
            Class cls2 = r1;
            method5 = m8010(r1);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f7021 = cls;
        this.f7018 = constructor;
        this.f7016 = method4;
        this.f7017 = method3;
        this.f7020 = method2;
        this.f7019 = method;
        this.f7022 = method5;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m7994() {
        return this.f7016 != null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private Object m7999() {
        try {
            return this.f7018.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m7997(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f7016.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m7998(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f7017.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public Typeface m8004(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f7021, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f7022.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m7995(Object obj) {
        try {
            return ((Boolean) this.f7020.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m7996(Object obj) {
        try {
            this.f7019.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public Typeface m8000(Context context, C0904.C0907 r12, Resources resources, int i) {
        if (!m7994()) {
            return super.m6744(context, r12, resources, i);
        }
        Object r13 = m7999();
        if (r13 == null) {
            return null;
        }
        for (C0904.C0906 r0 : r12.m6706()) {
            if (!m7997(context, r13, r0.m6705(), r0.m6703(), r0.m6704(), r0.m6702() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(r0.m6700()))) {
                m7996(r13);
                return null;
            }
        }
        if (!m7995(r13)) {
            return null;
        }
        return m8004(r13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        throw r12;
     */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface m8007(android.content.Context r10, android.os.CancellationSignal r11, o.C1929.If[] r12, int r13) {
        /*
            r9 = this;
            int r0 = r12.length
            r1 = 0
            if (r0 > 0) goto L_0x0005
            return r1
        L_0x0005:
            boolean r0 = r9.m7994()
            if (r0 != 0) goto L_0x0053
            o.γ$If r12 = r9.m8297(r12, r13)
            android.content.ContentResolver r10 = r10.getContentResolver()
            android.net.Uri r13 = r12.m10547()     // Catch:{ IOException -> 0x0052 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r13, r0, r11)     // Catch:{ IOException -> 0x0052 }
            if (r10 != 0) goto L_0x0025
            if (r10 == 0) goto L_0x0024
            r10.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0024:
            return r1
        L_0x0025:
            android.graphics.Typeface$Builder r11 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0046 }
            java.io.FileDescriptor r13 = r10.getFileDescriptor()     // Catch:{ all -> 0x0046 }
            r11.<init>(r13)     // Catch:{ all -> 0x0046 }
            int r13 = r12.m10548()     // Catch:{ all -> 0x0046 }
            android.graphics.Typeface$Builder r11 = r11.setWeight(r13)     // Catch:{ all -> 0x0046 }
            boolean r12 = r12.m10545()     // Catch:{ all -> 0x0046 }
            android.graphics.Typeface$Builder r11 = r11.setItalic(r12)     // Catch:{ all -> 0x0046 }
            android.graphics.Typeface r11 = r11.build()     // Catch:{ all -> 0x0046 }
            r10.close()     // Catch:{ IOException -> 0x0052 }
            return r11
        L_0x0046:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r12 = move-exception
            r10.close()     // Catch:{ all -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r10 = move-exception
            r11.addSuppressed(r10)     // Catch:{ IOException -> 0x0052 }
        L_0x0051:
            throw r12     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        L_0x0053:
            java.util.Map r10 = o.C1929.m10538(r10, r12, r11)
            java.lang.Object r11 = r9.m7999()
            if (r11 != 0) goto L_0x005e
            return r1
        L_0x005e:
            int r0 = r12.length
            r2 = 0
            r8 = 0
        L_0x0061:
            if (r8 >= r0) goto L_0x008d
            r3 = r12[r8]
            android.net.Uri r4 = r3.m10547()
            java.lang.Object r4 = r10.get(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            if (r4 == 0) goto L_0x008a
            int r5 = r3.m10546()
            int r6 = r3.m10548()
            boolean r7 = r3.m10545()
            r2 = r9
            r3 = r11
            boolean r2 = r2.m7998((java.lang.Object) r3, (java.nio.ByteBuffer) r4, (int) r5, (int) r6, (int) r7)
            if (r2 != 0) goto L_0x0089
            r9.m7996((java.lang.Object) r11)
            return r1
        L_0x0089:
            r2 = 1
        L_0x008a:
            int r8 = r8 + 1
            goto L_0x0061
        L_0x008d:
            if (r2 != 0) goto L_0x0093
            r9.m7996((java.lang.Object) r11)
            return r1
        L_0x0093:
            boolean r10 = r9.m7995((java.lang.Object) r11)
            if (r10 != 0) goto L_0x009a
            return r1
        L_0x009a:
            android.graphics.Typeface r10 = r9.m8004((java.lang.Object) r11)
            if (r10 != 0) goto L_0x00a1
            return r1
        L_0x00a1:
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1240.m8007(android.content.Context, android.os.CancellationSignal, o.γ$If[], int):android.graphics.Typeface");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public Typeface m8006(Context context, Resources resources, int i, String str, int i2) {
        if (!m7994()) {
            return super.m8298(context, resources, i, str, i2);
        }
        Object r10 = m7999();
        if (r10 == null) {
            return null;
        }
        if (!m7997(context, r10, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m7996(r10);
            return null;
        } else if (!m7995(r10)) {
            return null;
        } else {
            return m8004(r10);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public Class m8002() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public Constructor m8003(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public Method m8001(Class cls) {
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public Method m8009(Class cls) {
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public Method m8008(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public Method m8005(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: і  reason: contains not printable characters */
    public Method m8010(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
