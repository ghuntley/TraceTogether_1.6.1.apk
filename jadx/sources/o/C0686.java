package o;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: o.Ɨɩ  reason: contains not printable characters */
public abstract class C0686<T> {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static C0686<float[]> f4832 = new C0686<float[]>() {
        /* renamed from: ι  reason: contains not printable characters */
        public final String m5607() {
            return "float[]";
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5606(Bundle bundle, String str, Object obj) {
            bundle.putFloatArray(str, (float[]) obj);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m5604(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5605(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }
    };

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C0686<Boolean> f4833 = new C0686<Boolean>() {
        /* renamed from: ι  reason: contains not printable characters */
        public final String m5599() {
            return "boolean";
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5598(Bundle bundle, String str, Object obj) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m5596(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5597(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C0686<Float> f4834 = new C0686<Float>() {
        /* renamed from: ι  reason: contains not printable characters */
        public final String m5603() {
            return "float";
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5602(Bundle bundle, String str, Object obj) {
            bundle.putFloat(str, ((Float) obj).floatValue());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m5600(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5601(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }
    };

    /* renamed from: ɹ  reason: contains not printable characters */
    private static C0686<long[]> f4835 = new C0686<long[]>() {
        /* renamed from: ι  reason: contains not printable characters */
        public final String m5575() {
            return "long[]";
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5574(Bundle bundle, String str, Object obj) {
            bundle.putLongArray(str, (long[]) obj);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m5572(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5573(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }
    };

    /* renamed from: ɾ  reason: contains not printable characters */
    private static C0686<String[]> f4836 = new C0686<String[]>() {
        /* renamed from: ι  reason: contains not printable characters */
        public final String m5571() {
            return "string[]";
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5570(Bundle bundle, String str, Object obj) {
            bundle.putStringArray(str, (String[]) obj);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m5568(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5569(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }
    };

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C0686<Integer> f4837 = new C0686<Integer>() {
        /* renamed from: ι  reason: contains not printable characters */
        public final String m5595() {
            return "reference";
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5594(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m5592(String str) {
            throw new UnsupportedOperationException("References don't support parsing string values.");
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5593(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    public static final C0686<Integer> f4838 = new C0686<Integer>() {
        /* renamed from: ι  reason: contains not printable characters */
        public final String m5583() {
            return "integer";
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5582(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m5580(String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5581(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }
    };

    /* renamed from: І  reason: contains not printable characters */
    private static C0686<int[]> f4839 = new C0686<int[]>() {
        /* renamed from: ι  reason: contains not printable characters */
        public final String m5591() {
            return "integer[]";
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5590(Bundle bundle, String str, Object obj) {
            bundle.putIntArray(str, (int[]) obj);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m5588(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5589(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }
    };

    /* renamed from: і  reason: contains not printable characters */
    public static final C0686<String> f4840 = new C0686<String>() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ Object m5584(String str) {
            return str;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m5587() {
            return "string";
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5586(Bundle bundle, String str, Object obj) {
            bundle.putString(str, (String) obj);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5585(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }
    };

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static C0686<Long> f4841 = new C0686<Long>() {
        /* renamed from: ι  reason: contains not printable characters */
        public final String m5611() {
            return "long";
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5610(Bundle bundle, String str, Object obj) {
            bundle.putLong(str, ((Long) obj).longValue());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m5608(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.startsWith("0x")) {
                return Long.valueOf(Long.parseLong(str.substring(2), 16));
            }
            return Long.valueOf(Long.parseLong(str));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5609(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }
    };

    /* renamed from: ӏ  reason: contains not printable characters */
    private static C0686<boolean[]> f4842 = new C0686<boolean[]>() {
        /* renamed from: ι  reason: contains not printable characters */
        public final String m5579() {
            return "boolean[]";
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5578(Bundle bundle, String str, Object obj) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m5576(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5577(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    final boolean f4843;

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract T m5564(String str);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract T m5565(Bundle bundle, String str);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m5566(Bundle bundle, String str, T t);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract String m5567();

    C0686(boolean z) {
        this.f4843 = z;
    }

    public String toString() {
        return m5567();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C0686<?> m5563(String str, String str2) {
        String str3;
        if (f4838.m5567().equals(str)) {
            return f4838;
        }
        if (f4839.m5567().equals(str)) {
            return f4839;
        }
        if (f4841.m5567().equals(str)) {
            return f4841;
        }
        if (f4835.m5567().equals(str)) {
            return f4835;
        }
        if (f4833.m5567().equals(str)) {
            return f4833;
        }
        if (f4842.m5567().equals(str)) {
            return f4842;
        }
        if (f4840.m5567().equals(str)) {
            return f4840;
        }
        if (f4836.m5567().equals(str)) {
            return f4836;
        }
        if (f4834.m5567().equals(str)) {
            return f4834;
        }
        if (f4832.m5567().equals(str)) {
            return f4832;
        }
        if (f4837.m5567().equals(str)) {
            return f4837;
        }
        if (str == null || str.isEmpty()) {
            return f4840;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                str3 = str;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                str3 = sb.toString();
            }
            if (str.endsWith("[]")) {
                str3 = str3.substring(0, str3.length() - 2);
                Class<?> cls = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new C0688(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new C0689(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new Cif(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new C0687(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new If(cls2);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(" is not Serializable or Parcelable.");
            throw new IllegalArgumentException(sb2.toString());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [o.Ɨɩ, o.Ɨɩ<java.lang.Float>] */
    /* JADX WARNING: type inference failed for: r1v7, types: [o.Ɨɩ<java.lang.Long>, o.Ɨɩ] */
    /* JADX WARNING: type inference failed for: r1v8, types: [o.Ɨɩ<java.lang.Integer>, o.Ɨɩ] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        f4833.m5564(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return f4833;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return f4840;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        f4841.m5564(r1);
        r1 = f4841;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        f4834.m5564(r1);
        r1 = f4834;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static o.C0686 m5562(java.lang.String r1) {
        /*
            o.Ɨɩ<java.lang.Integer> r0 = f4838     // Catch:{ IllegalArgumentException -> 0x0008 }
            r0.m5564(r1)     // Catch:{ IllegalArgumentException -> 0x0008 }
            o.Ɨɩ<java.lang.Integer> r1 = f4838     // Catch:{ IllegalArgumentException -> 0x0008 }
            return r1
        L_0x0008:
            o.Ɨɩ<java.lang.Long> r0 = f4841     // Catch:{ IllegalArgumentException -> 0x0010 }
            r0.m5564(r1)     // Catch:{ IllegalArgumentException -> 0x0010 }
            o.Ɨɩ<java.lang.Long> r1 = f4841     // Catch:{ IllegalArgumentException -> 0x0010 }
            return r1
        L_0x0010:
            o.Ɨɩ<java.lang.Float> r0 = f4834     // Catch:{ IllegalArgumentException -> 0x0018 }
            r0.m5564(r1)     // Catch:{ IllegalArgumentException -> 0x0018 }
            o.Ɨɩ<java.lang.Float> r1 = f4834     // Catch:{ IllegalArgumentException -> 0x0018 }
            return r1
        L_0x0018:
            o.Ɨɩ<java.lang.Boolean> r0 = f4833     // Catch:{ IllegalArgumentException -> 0x0020 }
            r0.m5564(r1)     // Catch:{ IllegalArgumentException -> 0x0020 }
            o.Ɨɩ<java.lang.Boolean> r1 = f4833     // Catch:{ IllegalArgumentException -> 0x0020 }
            return r1
        L_0x0020:
            o.Ɨɩ<java.lang.String> r1 = f4840
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0686.m5562(java.lang.String):o.Ɨɩ");
    }

    /* renamed from: ı  reason: contains not printable characters */
    static C0686 m5561(Object obj) {
        if (obj instanceof Integer) {
            return f4838;
        }
        if (obj instanceof int[]) {
            return f4839;
        }
        if (obj instanceof Long) {
            return f4841;
        }
        if (obj instanceof long[]) {
            return f4835;
        }
        if (obj instanceof Float) {
            return f4834;
        }
        if (obj instanceof float[]) {
            return f4832;
        }
        if (obj instanceof Boolean) {
            return f4833;
        }
        if (obj instanceof boolean[]) {
            return f4842;
        }
        if ((obj instanceof String) || obj == null) {
            return f4840;
        }
        if (obj instanceof String[]) {
            return f4836;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new C0688(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new C0689(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new Cif(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new C0687(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new If(obj.getClass());
        }
        StringBuilder sb = new StringBuilder("Object of type ");
        sb.append(obj.getClass().getName());
        sb.append(" is not supported for navigation arguments.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: o.Ɨɩ$if  reason: invalid class name */
    public static final class Cif<D> extends C0686<D> {

        /* renamed from: І  reason: contains not printable characters */
        private final Class<D> f4845;

        public Cif(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f4845 = cls;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            sb.append(" does not implement Parcelable or Serializable.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m5619(Bundle bundle, String str, D d) {
            this.f4845.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final D m5618(Bundle bundle, String str) {
            return bundle.get(str);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final D m5617(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m5620() {
            return this.f4845.getName();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f4845.equals(((Cif) obj).f4845);
        }

        public final int hashCode() {
            return this.f4845.hashCode();
        }
    }

    /* renamed from: o.Ɨɩ$ǃ  reason: contains not printable characters */
    public static final class C0688<D extends Parcelable> extends C0686<D[]> {

        /* renamed from: Ɩ  reason: contains not printable characters */
        private final Class<D[]> f4847;

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5627(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            this.f4847.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public C0688(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    StringBuilder sb = new StringBuilder("[L");
                    sb.append(cls.getName());
                    sb.append(";");
                    this.f4847 = Class.forName(sb.toString());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls);
                sb2.append(" does not implement Parcelable.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m5628() {
            return this.f4847.getName();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f4847.equals(((C0688) obj).f4847);
        }

        public final int hashCode() {
            return this.f4847.hashCode();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m5625(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5626(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }
    }

    /* renamed from: o.Ɨɩ$If */
    public static class If<D extends Serializable> extends C0686<D> {

        /* renamed from: І  reason: contains not printable characters */
        private final Class<D> f4844;

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5615(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            this.f4844.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        public If(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls);
                sb.append(" does not implement Serializable.");
                throw new IllegalArgumentException(sb.toString());
            } else if (!cls.isEnum()) {
                this.f4844 = cls;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls);
                sb2.append(" is an Enum. You should use EnumType instead.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        If(Class<D> cls, byte b) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f4844 = cls;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            sb.append(" does not implement Serializable.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public D m5612(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public String m5616() {
            return this.f4844.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof If)) {
                return false;
            }
            return this.f4844.equals(((If) obj).f4844);
        }

        public int hashCode() {
            return this.f4844.hashCode();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5614(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }
    }

    /* renamed from: o.Ɨɩ$ı  reason: contains not printable characters */
    public static final class C0687<D extends Enum> extends If<D> {

        /* renamed from: Ɩ  reason: contains not printable characters */
        private final Class<D> f4846;

        public C0687(Class<D> cls) {
            super(cls, (byte) 0);
            if (cls.isEnum()) {
                this.f4846 = cls;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            sb.append(" is not an Enum type.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public D m5623(String str) {
            for (D d : (Enum[]) this.f4846.getEnumConstants()) {
                D d2 = (Enum) d;
                if (d2.name().equals(str)) {
                    return d2;
                }
            }
            StringBuilder sb = new StringBuilder("Enum value ");
            sb.append(str);
            sb.append(" not found for type ");
            sb.append(this.f4846.getName());
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m5624() {
            return this.f4846.getName();
        }
    }

    /* renamed from: o.Ɨɩ$ɩ  reason: contains not printable characters */
    public static final class C0689<D extends Serializable> extends C0686<D[]> {

        /* renamed from: ɹ  reason: contains not printable characters */
        private final Class<D[]> f4848;

        /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m5631(Bundle bundle, String str, Object obj) {
            ? r4 = (Serializable[]) obj;
            this.f4848.cast(r4);
            bundle.putSerializable(str, r4);
        }

        public C0689(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    StringBuilder sb = new StringBuilder("[L");
                    sb.append(cls.getName());
                    sb.append(";");
                    this.f4848 = Class.forName(sb.toString());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls);
                sb2.append(" does not implement Serializable.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m5632() {
            return this.f4848.getName();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f4848.equals(((C0689) obj).f4848);
        }

        public final int hashCode() {
            return this.f4848.hashCode();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m5629(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m5630(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }
    }
}
