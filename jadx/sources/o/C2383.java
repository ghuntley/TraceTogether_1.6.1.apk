package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: o.а  reason: contains not printable characters */
public abstract class C2383 implements Closeable {

    /* renamed from: ı  reason: contains not printable characters */
    private static final String[] f10916 = new String[128];

    /* renamed from: ǃ  reason: contains not printable characters */
    String[] f10917 = new String[32];

    /* renamed from: ɩ  reason: contains not printable characters */
    int f10918;

    /* renamed from: Ι  reason: contains not printable characters */
    int[] f10919 = new int[32];

    /* renamed from: ι  reason: contains not printable characters */
    int[] f10920 = new int[32];

    /* renamed from: o.а$ǃ  reason: contains not printable characters */
    public enum C2384 {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* renamed from: ı  reason: contains not printable characters */
    public abstract boolean m12383();

    /* renamed from: Ɩ  reason: contains not printable characters */
    public abstract String m12384();

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract int m12385(C2385 r1);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m12386();

    /* renamed from: ɨ  reason: contains not printable characters */
    public abstract double m12387();

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m12388();

    /* renamed from: ɪ  reason: contains not printable characters */
    public abstract int m12389();

    /* renamed from: ɹ  reason: contains not printable characters */
    public abstract C2384 m12390();

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m12391();

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m12392();

    /* renamed from: І  reason: contains not printable characters */
    public abstract void m12393();

    /* renamed from: і  reason: contains not printable characters */
    public abstract boolean m12394();

    /* renamed from: Ӏ  reason: contains not printable characters */
    public abstract String m12395();

    /* renamed from: ӏ  reason: contains not printable characters */
    public abstract void m12396();

    static {
        for (int i = 0; i <= 31; i++) {
            f10916[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f10916;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C2383 m12379(jI jIVar) {
        return new C2420(jIVar);
    }

    C2383() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m12382(int i) {
        int i2 = this.f10918;
        int[] iArr = this.f10920;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f10920 = Arrays.copyOf(iArr, iArr.length << 1);
                String[] strArr = this.f10917;
                this.f10917 = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
                int[] iArr2 = this.f10919;
                this.f10919 = Arrays.copyOf(iArr2, iArr2.length << 1);
            } else {
                StringBuilder sb = new StringBuilder("Nesting too deep at ");
                sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
                throw new C2224(sb.toString());
            }
        }
        int[] iArr3 = this.f10920;
        int i3 = this.f10918;
        this.f10918 = i3 + 1;
        iArr3[i3] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final C2354 m12381(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
        throw new C2354(sb.toString());
    }

    /* renamed from: o.а$ɩ  reason: contains not printable characters */
    public static final class C2385 {

        /* renamed from: Ι  reason: contains not printable characters */
        final String[] f10932;

        /* renamed from: ι  reason: contains not printable characters */
        final jN f10933;

        private C2385(String[] strArr, jN jNVar) {
            this.f10932 = strArr;
            this.f10933 = jNVar;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public static C2385 m12397(String... strArr) {
            try {
                jM[] jMVarArr = new jM[strArr.length];
                jH jHVar = new jH();
                for (int i = 0; i < strArr.length; i++) {
                    C2383.m12380(jHVar, strArr[i]);
                    jHVar.m2868();
                    jMVarArr[i] = new jM(jHVar.m2893());
                }
                return new C2385((String[]) strArr.clone(), jN.m2968(jMVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static /* synthetic */ void m12380(jK jKVar, String str) {
        String str2;
        String[] strArr = f10916;
        jKVar.m2945(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                jKVar.m2943(str, i, i2);
            }
            jKVar.m2942(str2);
            i = i2 + 1;
        }
        if (i < length) {
            jKVar.m2943(str, i, length);
        }
        jKVar.m2945(34);
    }
}
