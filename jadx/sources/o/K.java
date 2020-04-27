package o;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class K implements C {

    /* renamed from: ı  reason: contains not printable characters */
    private Throwable f1271;

    /* renamed from: ι  reason: contains not printable characters */
    private kB f1272;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static K m1378(Throwable th) {
        return new K(th);
    }

    private K(Throwable th) {
        this.f1271 = th;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static K m1379(kB kBVar) {
        return new K(kBVar);
    }

    private K(kB kBVar) {
        this.f1272 = kBVar;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m1382() {
        Throwable th = this.f1271;
        return th != null && (th instanceof IOException);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f1272;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m1381() {
        /*
            r1 = this;
            java.lang.Throwable r0 = r1.f1271
            if (r0 != 0) goto L_0x0012
            o.kB r0 = r1.f1272
            if (r0 == 0) goto L_0x0012
            okhttp3.Response r0 = r0.f2555
            boolean r0 = r0.isSuccessful()
            if (r0 != 0) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.K.m1381():boolean");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m1384() {
        Throwable th = this.f1271;
        if (th != null) {
            return th.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        kB kBVar = this.f1272;
        if (kBVar != null) {
            if (P.m1406(kBVar.f2555.message())) {
                sb.append(this.f1272.f2555.message());
            } else {
                sb.append(this.f1272.f2555.code());
            }
        }
        return sb.toString();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m1380() {
        kB kBVar = this.f1272;
        if (kBVar != null) {
            return kBVar.f2555.code();
        }
        return -1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m1385() {
        kB kBVar = this.f1272;
        return (kBVar == null || kBVar.f2555.request() == null || this.f1272.f2555.request().url() == null) ? "" : this.f1272.f2555.request().url().toString();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final String m1386() {
        kB kBVar = this.f1272;
        if (!(kBVar == null || kBVar.f2554 == null)) {
            try {
                return new String(this.f1272.f2554.bytes(), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                throw new AssertionError("UTF-8 must be supported");
            } catch (IOException unused2) {
            }
        }
        return "";
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final String m1383() {
        kB kBVar = this.f1272;
        return (kBVar == null || kBVar.f2554 == null) ? "" : this.f1272.f2554.contentType().toString();
    }
}
