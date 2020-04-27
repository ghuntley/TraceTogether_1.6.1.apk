package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import o.C0904;
import o.C0913;
import o.C1929;

/* renamed from: o.ɢ  reason: contains not printable characters */
public class C1173 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C1317 f6768;

    /* renamed from: ι  reason: contains not printable characters */
    private static final C0783<String, Typeface> f6769 = new C0783<>(16);

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            f6768 = new C1205();
        } else if (Build.VERSION.SDK_INT >= 26) {
            f6768 = new C1240();
        } else if (Build.VERSION.SDK_INT >= 24 && C0924.m6755()) {
            f6768 = new C0924();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f6768 = new C0915();
        } else {
            f6768 = new C1317();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Typeface m7686(Resources resources, int i, int i2) {
        return f6769.m6126(m7690(resources, i, i2));
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static String m7690(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static Typeface m7689(Context context, C0904.C0905 r8, Resources resources, int i, int i2, C0913.If ifR, Handler handler, boolean z) {
        Typeface typeface;
        if (r8 instanceof C0904.Cif) {
            C0904.Cif ifVar = (C0904.Cif) r8;
            boolean z2 = false;
            if (!z ? ifR == null : ifVar.m6698() == 0) {
                z2 = true;
            }
            typeface = C1929.m10536(context, ifVar.m6697(), ifR, handler, z2, z ? ifVar.m6699() : -1, i2);
        } else {
            typeface = f6768.m8296(context, (C0904.C0907) r8, resources, i2);
            if (ifR != null) {
                if (typeface != null) {
                    ifR.m6733(typeface, handler);
                } else {
                    ifR.m6736(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f6769.m6123(m7690(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Typeface m7687(Context context, Resources resources, int i, String str, int i2) {
        Typeface r6 = f6768.m8298(context, resources, i, str, i2);
        if (r6 != null) {
            f6769.m6123(m7690(resources, i, i2), r6);
        }
        return r6;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Typeface m7684(Context context, CancellationSignal cancellationSignal, C1929.If[] ifArr, int i) {
        return f6768.m8299(context, cancellationSignal, ifArr, i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static Typeface m7688(Context context, Typeface typeface, int i) {
        C0904.C0907 r3 = f6768.m8301(typeface);
        if (r3 == null) {
            return null;
        }
        return f6768.m8296(context, r3, context.getResources(), i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Typeface m7685(Context context, Typeface typeface, int i) {
        Typeface r2;
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (Build.VERSION.SDK_INT >= 21 || (r2 = m7688(context, typeface, i)) == null) {
            return Typeface.create(typeface, i);
        } else {
            return r2;
        }
    }
}
