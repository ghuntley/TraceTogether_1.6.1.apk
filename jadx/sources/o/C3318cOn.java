package o;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* renamed from: o.cOn  reason: case insensitive filesystem */
final class C3318cOn {

    /* renamed from: ɩ  reason: contains not printable characters */
    static C3318cOn f1908;

    /* renamed from: ı  reason: contains not printable characters */
    final Cif f1909 = new Cif();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final LocationManager f1910;

    /* renamed from: ι  reason: contains not printable characters */
    final Context f1911;

    C3318cOn(Context context, LocationManager locationManager) {
        this.f1911 = context;
        this.f1910 = locationManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final Location m1919(String str) {
        try {
            if (this.f1910.isProviderEnabled(str)) {
                return this.f1910.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: o.cOn$if  reason: invalid class name */
    static class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        long f1912;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f1913;

        Cif() {
        }
    }
}
