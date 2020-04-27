package o;

import java.util.List;
import java.util.Map;
import o.C2745;

/* renamed from: o.Іԑ  reason: contains not printable characters */
final class C2323 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final Throwable f10755;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f10756;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2321 f10757;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f10758;

    /* renamed from: ι  reason: contains not printable characters */
    private final byte[] f10759;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Map<String, List<String>> f10760;

    private C2323(String str, C2321 r2, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C2745.C2746.m14555(r2);
        this.f10757 = r2;
        this.f10758 = i;
        this.f10755 = th;
        this.f10759 = bArr;
        this.f10756 = str;
        this.f10760 = map;
    }

    public final void run() {
        this.f10757.m12100(this.f10756, this.f10758, this.f10755, this.f10759, this.f10760);
    }
}
