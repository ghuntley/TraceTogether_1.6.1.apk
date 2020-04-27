package o;

import android.content.Context;

public final class aF {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3272al<String> f1425 = new C3272al<>();

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3271ak<String> f1426 = new C3271ak<String>() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m1483(Context context) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    };

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m1482(Context context) {
        try {
            String r4 = this.f1425.m1609(context, this.f1426);
            if ("".equals(r4)) {
                return null;
            }
            return r4;
        } catch (Exception unused) {
            C3263ac.m1563();
            return null;
        }
    }
}
