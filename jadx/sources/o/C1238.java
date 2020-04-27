package o;

import android.content.Context;
import o.C1242;
import o.C2691;

/* renamed from: o.ɩł  reason: contains not printable characters */
public final class C1238 implements C2691.C2692 {

    /* renamed from: ι  reason: contains not printable characters */
    private final C2499 f7014;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <T extends C1242> C1242.C1245<T> m7991(Context context, Class<T> cls, String str) {
        if (str.trim().length() != 0) {
            return new C1242.C1245<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    /* renamed from: ı  reason: contains not printable characters */
    static <T, C> T m7990(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(canonicalName.replace('.', '_'));
        sb.append(str);
        String obj = sb.toString();
        try {
            if (name.isEmpty()) {
                str2 = obj;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append(".");
                sb2.append(obj);
                str2 = sb2.toString();
            }
            return Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder("cannot find implementation for ");
            sb3.append(cls.getCanonicalName());
            sb3.append(". ");
            sb3.append(obj);
            sb3.append(" does not exist");
            throw new RuntimeException(sb3.toString());
        } catch (IllegalAccessException unused2) {
            StringBuilder sb4 = new StringBuilder("Cannot access the constructor");
            sb4.append(cls.getCanonicalName());
            throw new RuntimeException(sb4.toString());
        } catch (InstantiationException unused3) {
            StringBuilder sb5 = new StringBuilder("Failed to create an instance of ");
            sb5.append(cls.getCanonicalName());
            throw new RuntimeException(sb5.toString());
        }
    }

    @Deprecated
    public C1238() {
    }

    public C1238(C2499 r1) {
        this.f7014 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Object m7992() {
        C2499 r0 = this.f7014;
        for (C2291 r2 : r0.f11317.m13797()) {
            r0.f11316.m13832(r2, 1);
        }
        return null;
    }
}
