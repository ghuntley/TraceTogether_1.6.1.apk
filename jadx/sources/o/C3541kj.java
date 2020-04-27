package o;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import java.util.Arrays;
import o.C3538kg;
import pub.devrel.easypermissions.RationaleDialogFragmentCompat;

/* renamed from: o.kj  reason: case insensitive filesystem */
public final class C3541kj implements DialogInterface.OnClickListener {

    /* renamed from: ı  reason: contains not printable characters */
    private Object f2659;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3539kh f2660;

    /* renamed from: Ι  reason: contains not printable characters */
    private C3538kg.If f2661;

    public C3541kj(RationaleDialogFragmentCompat rationaleDialogFragmentCompat, C3539kh khVar, C3538kg.If ifR) {
        Object obj;
        if (rationaleDialogFragmentCompat.getParentFragment() != null) {
            obj = rationaleDialogFragmentCompat.getParentFragment();
        } else {
            obj = rationaleDialogFragmentCompat.getActivity();
        }
        this.f2659 = obj;
        this.f2660 = khVar;
        this.f2661 = ifR;
    }

    C3541kj(C3543kl klVar, C3539kh khVar, C3538kg.If ifR) {
        this.f2659 = klVar.getActivity();
        this.f2660 = khVar;
        this.f2661 = ifR;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3546ko koVar;
        int i2 = this.f2660.f2654;
        if (i == -1) {
            String[] strArr = this.f2660.f2658;
            Object obj = this.f2659;
            if (obj instanceof C1277) {
                C1277 r0 = (C1277) obj;
                if (Build.VERSION.SDK_INT < 23) {
                    koVar = new C3547kp(r0);
                } else {
                    koVar = new C3548kq(r0);
                }
                koVar.m3296(i2, strArr);
            } else if (obj instanceof Activity) {
                C3546ko.m3292((Activity) obj).m3296(i2, strArr);
            } else {
                throw new RuntimeException("Host must be an Activity or Fragment!");
            }
        } else if (this.f2661 != null) {
            Arrays.asList(this.f2660.f2658);
        }
    }
}
