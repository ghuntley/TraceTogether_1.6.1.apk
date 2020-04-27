package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import o.C0904;
import o.C1929;

/* renamed from: o.ɩӏ  reason: contains not printable characters */
class C1317 {

    /* renamed from: ı  reason: contains not printable characters */
    private ConcurrentHashMap<Long, C0904.C0907> f7319 = new ConcurrentHashMap<>();

    /* renamed from: o.ɩӏ$ı  reason: contains not printable characters */
    interface C1318<T> {
        /* renamed from: ǃ  reason: contains not printable characters */
        int m8310(T t);

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean m8311(T t);
    }

    C1317() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static <T> T m8292(T[] tArr, int i, C1318<T> r12) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(r12.m8310(t2) - i2) << 1) + (r12.m8311(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static long m8293(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public C1929.If m8297(C1929.If[] ifArr, int i) {
        return (C1929.If) m8292(ifArr, i, new C1318<C1929.If>() {
            /* renamed from: ι  reason: contains not printable characters */
            public int m8306(C1929.If ifR) {
                return ifR.m10548();
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public boolean m8308(C1929.If ifR) {
                return ifR.m10545();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public Typeface m8300(Context context, InputStream inputStream) {
        File r2 = C1189.m7728(context);
        if (r2 == null) {
            return null;
        }
        try {
            if (!C1189.m7730(r2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(r2.getPath());
            r2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            r2.delete();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public Typeface m8299(Context context, CancellationSignal cancellationSignal, C1929.If[] ifArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (ifArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(m8297(ifArr, i).m10547());
            try {
                Typeface r2 = m8300(context, inputStream);
                C1189.m7732(inputStream);
                return r2;
            } catch (IOException unused) {
                C1189.m7732(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C1189.m7732(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C1189.m7732(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C1189.m7732(inputStream2);
            throw th;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private C0904.C0906 m8295(C0904.C0907 r2, int i) {
        return (C0904.C0906) m8292(r2.m6706(), i, new C1318<C0904.C0906>() {
            /* renamed from: Ι  reason: contains not printable characters */
            public int m8303(C0904.C0906 r1) {
                return r1.m6704();
            }

            /* renamed from: ı  reason: contains not printable characters */
            public boolean m8304(C0904.C0906 r1) {
                return r1.m6702();
            }
        });
    }

    /* renamed from: ı  reason: contains not printable characters */
    public Typeface m8296(Context context, C0904.C0907 r4, Resources resources, int i) {
        C0904.C0906 r0 = m8295(r4, i);
        if (r0 == null) {
            return null;
        }
        Typeface r3 = C1173.m7687(context, resources, r0.m6701(), r0.m6705(), i);
        m8294(r3, r4);
        return r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public Typeface m8298(Context context, Resources resources, int i, String str, int i2) {
        File r1 = C1189.m7728(context);
        if (r1 == null) {
            return null;
        }
        try {
            if (!C1189.m7731(r1, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(r1.getPath());
            r1.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            r1.delete();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public C0904.C0907 m8301(Typeface typeface) {
        long r0 = m8293(typeface);
        if (r0 == 0) {
            return null;
        }
        return this.f7319.get(Long.valueOf(r0));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m8294(Typeface typeface, C0904.C0907 r6) {
        long r0 = m8293(typeface);
        if (r0 != 0) {
            this.f7319.put(Long.valueOf(r0), r6);
        }
    }
}
