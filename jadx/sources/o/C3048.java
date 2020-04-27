package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import o.C2745;
import o.C2771;

/* renamed from: o.Ս  reason: contains not printable characters */
public final class C3048 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int f13966 = 1;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final Map<String, C0518<C0343>> f13967 = new HashMap();

    /* renamed from: Ι  reason: contains not printable characters */
    private static int f13968;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C0518<C0343> m15549(final Context context, final String str) {
        final String concat = "url_".concat(String.valueOf(str));
        return m15550(concat, (Callable<C0364<C0343>>) new Callable<C0364<C0343>>() {
            /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object call() {
                /*
                    r4 = this;
                    android.content.Context r0 = r1
                    java.lang.String r1 = r2
                    java.lang.String r2 = r3
                    o.ǃȷ r3 = new o.ǃȷ
                    r3.<init>(r0, r1, r2)
                    o.ıɨ r0 = r3.f5742
                    if (r0 == 0) goto L_0x0040
                    o.ıɨ r0 = r3.f5742
                    java.lang.String r1 = r3.f5743
                    o.Іі r0 = r0.m4444(r1)
                    if (r0 == 0) goto L_0x0040
                    F r1 = r0.f10733
                    o.ͻɩ r1 = (o.C1738) r1
                    S r0 = r0.f10734
                    java.io.InputStream r0 = (java.io.InputStream) r0
                    o.ͻɩ r2 = o.C1738.ZIP
                    if (r1 != r2) goto L_0x0031
                    java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream
                    r1.<init>(r0)
                    java.lang.String r0 = r3.f5743
                    o.ıʏ r0 = o.C3048.m15547((java.util.zip.ZipInputStream) r1, (java.lang.String) r0)
                    goto L_0x0037
                L_0x0031:
                    java.lang.String r1 = r3.f5743
                    o.ıʏ r0 = o.C3048.m15546((java.io.InputStream) r0, (java.lang.String) r1)
                L_0x0037:
                    V r1 = r0.f3823
                    if (r1 == 0) goto L_0x0040
                    V r0 = r0.f3823
                    o.ıɭ r0 = (o.C0343) r0
                    goto L_0x0041
                L_0x0040:
                    r0 = 0
                L_0x0041:
                    if (r0 == 0) goto L_0x0049
                    o.ıʏ r1 = new o.ıʏ
                    r1.<init>(r0)
                    return r1
                L_0x0049:
                    o.C2414.m12459()
                    o.ıʏ r0 = r3.m6670()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C3048.AnonymousClass4.call():java.lang.Object");
            }
        });
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0518<C0343> m15553(final Context context, final String str, final String str2) {
        return m15550(str2, (Callable<C0364<C0343>>) new Callable<C0364<C0343>>() {
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object call() {
                /*
                    r4 = this;
                    android.content.Context r0 = r1
                    java.lang.String r1 = r2
                    java.lang.String r2 = r3
                    o.ǃȷ r3 = new o.ǃȷ
                    r3.<init>(r0, r1, r2)
                    o.ıɨ r0 = r3.f5742
                    if (r0 == 0) goto L_0x0040
                    o.ıɨ r0 = r3.f5742
                    java.lang.String r1 = r3.f5743
                    o.Іі r0 = r0.m4444(r1)
                    if (r0 == 0) goto L_0x0040
                    F r1 = r0.f10733
                    o.ͻɩ r1 = (o.C1738) r1
                    S r0 = r0.f10734
                    java.io.InputStream r0 = (java.io.InputStream) r0
                    o.ͻɩ r2 = o.C1738.ZIP
                    if (r1 != r2) goto L_0x0031
                    java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream
                    r1.<init>(r0)
                    java.lang.String r0 = r3.f5743
                    o.ıʏ r0 = o.C3048.m15547((java.util.zip.ZipInputStream) r1, (java.lang.String) r0)
                    goto L_0x0037
                L_0x0031:
                    java.lang.String r1 = r3.f5743
                    o.ıʏ r0 = o.C3048.m15546((java.io.InputStream) r0, (java.lang.String) r1)
                L_0x0037:
                    V r1 = r0.f3823
                    if (r1 == 0) goto L_0x0040
                    V r0 = r0.f3823
                    o.ıɭ r0 = (o.C0343) r0
                    goto L_0x0041
                L_0x0040:
                    r0 = 0
                L_0x0041:
                    if (r0 == 0) goto L_0x0049
                    o.ıʏ r1 = new o.ıʏ
                    r1.<init>(r0)
                    return r1
                L_0x0049:
                    o.C2414.m12459()
                    o.ıʏ r0 = r3.m6670()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C3048.AnonymousClass4.call():java.lang.Object");
            }
        });
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0518<C0343> m15552(Context context, final String str) {
        final String concat = "asset_".concat(String.valueOf(str));
        final Context applicationContext = context.getApplicationContext();
        return m15550(concat, (Callable<C0364<C0343>>) new Callable<C0364<C0343>>() {
            public final /* synthetic */ Object call() {
                return C3048.m15545(r2, r3, null);
            }
        });
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0518<C0343> m15558(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        return m15550((String) null, (Callable<C0364<C0343>>) new Callable<C0364<C0343>>((String) null) {
            public final /* synthetic */ Object call() {
                return C3048.m15545(applicationContext, str, null);
            }
        });
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C0364<C0343> m15545(Context context, String str, String str2) {
        int i = f13966 + 75;
        f13968 = i % 128;
        int i2 = i % 2;
        int i3 = f13968 + C2745.aux.f12996;
        f13966 = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (((Boolean) String.class.getMethod("endsWith", new Class[]{String.class}).invoke(str, new Object[]{".zip"})).booleanValue()) {
                AssetManager assets = context.getAssets();
                Object[] objArr = new Object[2];
                objArr[1] = str;
                objArr[0] = assets;
                return m15547(new ZipInputStream((InputStream) ((Class) C1534.m8995(0, 0, 4)).getMethod("ǃ", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr)), str2);
            }
            AssetManager assets2 = context.getAssets();
            Object[] objArr2 = new Object[2];
            objArr2[1] = str;
            objArr2[0] = assets2;
            return m15542((InputStream) ((Class) C1534.m8995(0, 0, 4)).getMethod("ǃ", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr2), str2);
        } catch (IOException e) {
            return new C0364<>((Throwable) e);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C0518<C0343> m15548(Context context, final int i) {
        String r0 = m15541(context, i);
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return m15550(r0, (Callable<C0364<C0343>>) new Callable<C0364<C0343>>() {
            public final /* synthetic */ Object call() {
                Context context = (Context) r0.get();
                if (context == null) {
                    context = r2;
                }
                return C3048.m15543(context, r3);
            }
        });
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0518<C0343> m15551(Context context, final int i) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return m15550((String) null, (Callable<C0364<C0343>>) new Callable<C0364<C0343>>() {
            public final /* synthetic */ Object call() {
                Context context = (Context) weakReference.get();
                if (context == null) {
                    context = applicationContext;
                }
                return C3048.m15543(context, i);
            }
        });
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C0364<C0343> m15543(Context context, int i) {
        return m15544(context, i, m15541(context, i));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C0364<C0343> m15544(Context context, int i, String str) {
        try {
            return m15542(context.getResources().openRawResource(i), str);
        } catch (Resources.NotFoundException e) {
            return new C0364<>((Throwable) e);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m15541(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0518<C0343> m15554(final InputStream inputStream, final String str) {
        return m15550(str, (Callable<C0364<C0343>>) new Callable<C0364<C0343>>() {
            public final /* synthetic */ Object call() {
                return C3048.m15546(inputStream, str);
            }
        });
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C0364<C0343> m15546(InputStream inputStream, String str) {
        return m15542(inputStream, str);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static C0364<C0343> m15542(InputStream inputStream, String str) {
        try {
            return m15557(C2383.m12379(jP.m2972(jP.m2974(inputStream))), str, true);
        } finally {
            C2467.m12716((Closeable) inputStream);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static C0364<C0343> m15557(C2383 r2, String str, boolean z) {
        try {
            C0343 r0 = C2057.m10954(r2);
            if (str != null) {
                C1200.m7811().f6856.m6123(str, r0);
            }
            C0364<C0343> r3 = new C0364<>(r0);
            if (z) {
                C2467.m12716((Closeable) r2);
            }
            return r3;
        } catch (Exception e) {
            C0364<C0343> r02 = new C0364<>((Throwable) e);
            if (z) {
                C2467.m12716((Closeable) r2);
            }
            return r02;
        } catch (Throwable th) {
            if (z) {
                C2467.m12716((Closeable) r2);
            }
            throw th;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C0364<C0343> m15547(ZipInputStream zipInputStream, String str) {
        try {
            return m15556(zipInputStream, str);
        } finally {
            C2467.m12716((Closeable) zipInputStream);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static C0364<C0343> m15556(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C0343 r3 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        r3 = (C0343) m15557(C2383.m12379(jP.m2972(jP.m2974((InputStream) zipInputStream))), (String) null, false).f3823;
                    } else if (name.contains(".png") || name.contains(".webp")) {
                        String[] split = name.split("/");
                        hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (r3 == null) {
                return new C0364<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C2771.If r1 = m15559(r3, (String) entry.getKey());
                if (r1 != null) {
                    r1.f13119 = C2467.m12720((Bitmap) entry.getValue(), r1.f13120, r1.f13121);
                }
            }
            for (Map.Entry next : r3.f3724.entrySet()) {
                if (((C2771.If) next.getValue()).f13119 == null) {
                    StringBuilder sb = new StringBuilder("There is no image for ");
                    sb.append(((C2771.If) next.getValue()).f13118);
                    return new C0364<>((Throwable) new IllegalStateException(sb.toString()));
                }
            }
            if (str != null) {
                C1200.m7811().f6856.m6123(str, r3);
            }
            return new C0364<>(r3);
        } catch (IOException e) {
            return new C0364<>((Throwable) e);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C0518<C0343> m15550(final String str, Callable<C0364<C0343>> callable) {
        final C0343 r0;
        if (str == null) {
            r0 = null;
        } else {
            r0 = C1200.m7811().f6856.m6126(str);
        }
        if (r0 != null) {
            return new C0518<>(new Callable<C0364<C0343>>() {
                public final /* synthetic */ Object call() {
                    return new C0364(C0343.this);
                }
            });
        }
        if (str != null && f13967.containsKey(str)) {
            return f13967.get(str);
        }
        C0518<C0343> r02 = new C0518<>(callable);
        if (str != null) {
            r02.m4987(new C0406<C0343>() {
                /* renamed from: Ι  reason: contains not printable characters */
                public final /* synthetic */ void m15560(Object obj) {
                    C3048.f13967.remove(str);
                }
            });
            r02.m4986(new C0406<Throwable>() {
                /* renamed from: Ι  reason: contains not printable characters */
                public final /* synthetic */ void m15561(Object obj) {
                    C3048.f13967.remove(str);
                }
            });
            f13967.put(str, r02);
        }
        return r02;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static C2771.If m15559(C0343 r2, String str) {
        for (C2771.If next : r2.f3724.values()) {
            if (next.f13118.equals(str)) {
                return next;
            }
        }
        return null;
    }
}
