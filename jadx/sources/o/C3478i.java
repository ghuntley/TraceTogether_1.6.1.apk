package o;

import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import o.C3348d;
import o.C3616p;
import o.C3618r;

/* renamed from: o.i  reason: case insensitive filesystem */
final class C3478i extends C3618r {

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3348d f2304;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3622v f2305;

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m2561() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final int m2562() {
        return 2;
    }

    public C3478i(C3348d dVar, C3622v vVar) {
        this.f2304 = dVar;
        this.f2305 = vVar;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m2563(C3617q qVar) {
        String scheme = qVar.f3474.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3618r.C0275 m2559(C3617q qVar) {
        C3348d.C0155 r8 = this.f2304.m2051(qVar.f3474, qVar.f3478);
        C3616p.C0272 r0 = r8.f2025 ? C3616p.C0272.DISK : C3616p.C0272.NETWORK;
        InputStream inputStream = r8.f2024;
        if (inputStream == null) {
            return null;
        }
        if (r0 == C3616p.C0272.DISK && r8.f2023 == 0) {
            C3626z.m4083(inputStream);
            throw new Cif("Received response with 0 content-length header.");
        }
        if (r0 == C3616p.C0272.NETWORK && r8.f2023 > 0) {
            C3622v vVar = this.f2305;
            vVar.f3510.sendMessage(vVar.f3510.obtainMessage(4, Long.valueOf(r8.f2023)));
        }
        return new C3618r.C0275(inputStream, r0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m2560(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* renamed from: o.i$if  reason: invalid class name */
    static class Cif extends IOException {
        public Cif(String str) {
            super(str);
        }
    }
}
