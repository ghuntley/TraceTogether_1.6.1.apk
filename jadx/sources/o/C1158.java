package o;

import android.content.Context;
import android.os.Bundle;

/* renamed from: o.ɟΙ  reason: contains not printable characters */
public class C1158 implements C1481 {

    /* renamed from: ι  reason: contains not printable characters */
    static final String f6701 = "io.fabric.unity.crashlytics.version";

    /* renamed from: ı  reason: contains not printable characters */
    private final String f6702;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Context f6703;

    public C1158(Context context, String str) {
        this.f6703 = context;
        this.f6702 = str;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public String m7627() {
        try {
            Bundle bundle = this.f6703.getPackageManager().getApplicationInfo(this.f6702, 128).metaData;
            if (bundle != null) {
                return bundle.getString(f6701);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
