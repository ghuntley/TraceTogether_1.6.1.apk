package o;

import android.util.Log;

/* renamed from: o.ӀΞ  reason: contains not printable characters */
final class C2815 extends C2781<Double> {
    C2815(C2941 r2, String str, Double d) {
        super(r2, str, d, (C2799) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final Double m14734(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String r0 = super.m14686();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(r0).length() + 27 + valueOf.length());
        sb.append("Invalid double value for ");
        sb.append(r0);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
