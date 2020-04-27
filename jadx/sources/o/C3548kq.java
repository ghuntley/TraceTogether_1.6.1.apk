package o;

import android.content.Context;

/* renamed from: o.kq  reason: case insensitive filesystem */
public final class C3548kq extends C3545kn<C1277> {
    public C3548kq(C1277 r1) {
        super(r1);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1550 m3303() {
        return ((C1277) this.f2669).getChildFragmentManager();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3304(int i, String... strArr) {
        ((C1277) this.f2669).requestPermissions(strArr, i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m3302(String str) {
        return ((C1277) this.f2669).shouldShowRequestPermissionRationale(str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Context m3305() {
        return ((C1277) this.f2669).getActivity();
    }
}
