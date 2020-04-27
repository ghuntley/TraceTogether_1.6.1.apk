package o;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;

/* renamed from: o.kk  reason: case insensitive filesystem */
final class C3542kk extends C3546ko<Activity> {
    public C3542kk(Activity activity) {
        super(activity);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3280(int i, String... strArr) {
        C2944.m15207((Activity) this.f2669, strArr, i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m3279(String str) {
        return C2944.m15208((Activity) this.f2669, str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Context m3281() {
        return (Context) this.f2669;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3278(String str, String str2, String str3, int i, int i2, String... strArr) {
        FragmentManager fragmentManager = ((Activity) this.f2669).getFragmentManager();
        if (!(fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof C3543kl)) {
            C3543kl klVar = new C3543kl();
            klVar.setArguments(new C3539kh(str2, str3, str, i, i2, strArr).m3273());
            if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !klVar.f2662) {
                klVar.show(fragmentManager, "RationaleDialogFragment");
            }
        }
    }
}
