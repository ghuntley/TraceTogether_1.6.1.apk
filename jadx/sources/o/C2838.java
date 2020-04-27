package o;

import android.util.Log;

/* renamed from: o.Ӏч  reason: contains not printable characters */
final class C2838 extends C2781<Boolean> {
    C2838(C2941 r2, String str, Boolean bool) {
        super(r2, str, bool, (C2799) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final /* synthetic */ Object m14810(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C2524.f11456.matcher(str).matches()) {
                return true;
            }
            if (C2524.f11460.matcher(str).matches()) {
                return false;
            }
        }
        String r0 = super.m14686();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(r0).length() + 28 + valueOf.length());
        sb.append("Invalid boolean value for ");
        sb.append(r0);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
