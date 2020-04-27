package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u00182\u00020\u0019B\u001d\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0002\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0002\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/iU;", "", "ǃ", "Ljava/lang/Throwable;", "", "ɩ", "Ljava/lang/String;", "Ι", "Lo/ex;", "p0", "Ljava/lang/Runnable;", "Lo/ɩ;", "p1", "", "ι", "(Lo/ex;Ljava/lang/Runnable;)Ljava/lang/Void;", "", "(Lo/ex;)Z", "ı", "()Ljava/lang/Void;", "toString", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "Lo/im;", "Lo/hD;"}, k = 1, mv = {1, 1, 15})
final class iU extends C3491im implements hD {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Throwable f2357;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f2358;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iU(Throwable th, String str, int i, fL fLVar) {
        this(th, (i & 2) != 0 ? null : str);
    }

    public iU(Throwable th, String str) {
        this.f2357 = th;
        this.f2358 = str;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m2658(C3396ex exVar) {
        fM.m2254(exVar, "");
        m2657();
        throw null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Void m2659(C3396ex exVar, Runnable runnable) {
        fM.m2254(exVar, "");
        fM.m2254(runnable, "");
        m2657();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 != null) goto L_0x0028;
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void m2657() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f2357
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f2358
            if (r1 == 0) goto L_0x0026
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            java.lang.String r1 = ""
        L_0x0028:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f2357
            r1.<init>(r0, r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android'"
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.iU.m2657():java.lang.Void");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Main[missing");
        if (this.f2357 != null) {
            str = ", cause=" + this.f2357;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
