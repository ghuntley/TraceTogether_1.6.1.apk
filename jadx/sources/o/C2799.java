package o;

import android.util.Log;

/* renamed from: o.Ӏʃ  reason: contains not printable characters */
final class C2799 extends C2781<Long> {
    C2799(C2941 r2, String str, Long l) {
        super(r2, str, l, (C2799) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final Long m14712(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String r0 = super.m14686();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(r0).length() + 25 + valueOf.length());
        sb.append("Invalid long value for ");
        sb.append(r0);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
