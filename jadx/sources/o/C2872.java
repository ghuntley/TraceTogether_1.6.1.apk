package o;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: o.ӏŀ  reason: contains not printable characters */
public final class C2872 extends DialogFragment {

    /* renamed from: ı  reason: contains not printable characters */
    private Dialog f13396 = null;

    /* renamed from: Ι  reason: contains not printable characters */
    private DialogInterface.OnCancelListener f13397 = null;

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f13396 == null) {
            setShowsDialog(false);
        }
        return this.f13396;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13397;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2872 m14933(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C2872 r0 = new C2872();
        if (dialog != null) {
            Dialog dialog2 = dialog;
            dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
            dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
            r0.f13396 = dialog2;
            if (onCancelListener != null) {
                r0.f13397 = onCancelListener;
            }
            return r0;
        }
        throw new NullPointerException("Cannot display null dialog");
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
