package o;

import pub.devrel.easypermissions.RationaleDialogFragmentCompat;

/* renamed from: o.kn  reason: case insensitive filesystem */
public abstract class C3545kn<T> extends C3546ko<T> {
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract C1550 m3291();

    public C3545kn(T t) {
        super(t);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3290(String str, String str2, String str3, int i, int i2, String... strArr) {
        C1550 r0 = m3291();
        if (!(r0.findFragmentByTag("RationaleDialogFragmentCompat") instanceof RationaleDialogFragmentCompat)) {
            RationaleDialogFragmentCompat r4 = RationaleDialogFragmentCompat.m16168(str, str2, str3, i, i2, strArr);
            if (!(r0.f8272 || r0.f8276)) {
                r4.m171(r0, "RationaleDialogFragmentCompat");
            }
        }
    }
}
