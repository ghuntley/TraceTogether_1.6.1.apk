package o;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: o.bk  reason: case insensitive filesystem */
public final class C3300bk implements C3301bl {

    /* renamed from: ɩ  reason: contains not printable characters */
    private SSLSocketFactory f1765;

    /* renamed from: Ι  reason: contains not printable characters */
    private C3299bj f1766;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f1767;

    public C3300bk() {
        this((byte) 0);
    }

    public C3300bk(byte b) {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1817(C3299bj bjVar) {
        if (this.f1766 != bjVar) {
            this.f1766 = bjVar;
            m1815();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private synchronized void m1815() {
        this.f1767 = false;
        this.f1765 = null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C3298bi m1818(C3302bm bmVar, String str) {
        return m1819(bmVar, str, Collections.emptyMap());
    }

    /* renamed from: o.bk$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: ı  reason: contains not printable characters */
        static final /* synthetic */ int[] f1768 = new int[C3302bm.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                o.bm[] r0 = o.C3302bm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1768 = r0
                int[] r0 = f1768     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.bm r1 = o.C3302bm.GET     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f1768     // Catch:{ NoSuchFieldError -> 0x001f }
                o.bm r1 = o.C3302bm.POST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f1768     // Catch:{ NoSuchFieldError -> 0x002a }
                o.bm r1 = o.C3302bm.PUT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f1768     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.bm r1 = o.C3302bm.DELETE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3300bk.AnonymousClass3.<clinit>():void");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C3298bi m1819(C3302bm bmVar, String str, Map<String, String> map) {
        C3298bi biVar;
        SSLSocketFactory r4;
        int i = AnonymousClass3.f1768[bmVar.ordinal()];
        boolean z = true;
        if (i == 1) {
            biVar = C3298bi.m1794(str, map);
        } else if (i == 2) {
            biVar = C3298bi.m1786(str, map);
        } else if (i == 3) {
            biVar = C3298bi.m1790(str);
        } else if (i == 4) {
            biVar = C3298bi.m1785((CharSequence) str);
        } else {
            throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (str == null || !str.toLowerCase(Locale.US).startsWith("https")) {
            z = false;
        }
        if (!(!z || this.f1766 == null || (r4 = m1814()) == null)) {
            if (biVar.f1751 == null) {
                biVar.f1751 = biVar.m1802();
            }
            ((HttpsURLConnection) biVar.f1751).setSSLSocketFactory(r4);
        }
        return biVar;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private synchronized SSLSocketFactory m1814() {
        if (this.f1765 == null && !this.f1767) {
            this.f1765 = m1816();
        }
        return this.f1765;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private synchronized SSLSocketFactory m1816() {
        SSLContext instance;
        this.f1767 = true;
        try {
            C3299bj bjVar = this.f1766;
            instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, new TrustManager[]{new C3305bp(new C3307br(bjVar.m1811(), bjVar.m1812()), bjVar)}, (SecureRandom) null);
        } catch (Exception unused) {
            return null;
        }
        return instance.getSocketFactory();
    }
}
