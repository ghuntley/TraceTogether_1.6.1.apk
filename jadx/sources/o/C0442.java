package o;

import java.math.BigDecimal;

/* renamed from: o.ıҝ  reason: contains not printable characters */
public final class C0442 extends Number {

    /* renamed from: ι  reason: contains not printable characters */
    private final String f4032;

    public C0442(String str) {
        this.f4032 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f4032);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f4032).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f4032     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f4032     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f4032
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0442.intValue():int");
    }

    public final long longValue() {
        try {
            return Long.parseLong(this.f4032);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f4032).longValue();
        }
    }

    public final float floatValue() {
        return Float.parseFloat(this.f4032);
    }

    public final double doubleValue() {
        return Double.parseDouble(this.f4032);
    }

    public final String toString() {
        return this.f4032;
    }

    private Object writeReplace() {
        return new BigDecimal(this.f4032);
    }

    public final int hashCode() {
        return this.f4032.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0442)) {
            return false;
        }
        String str = this.f4032;
        String str2 = ((C0442) obj).f4032;
        return str == str2 || str.equals(str2);
    }
}
