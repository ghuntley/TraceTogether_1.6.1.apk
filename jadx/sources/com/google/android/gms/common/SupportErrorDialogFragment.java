package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import o.C1550;

public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: ɪ  reason: contains not printable characters */
    private DialogInterface.OnCancelListener f526 = null;

    /* renamed from: ӏ  reason: contains not printable characters */
    private Dialog f527 = null;

    /* renamed from: Ι  reason: contains not printable characters */
    public Dialog m747(Bundle bundle) {
        if (this.f527 == null) {
            m177(false);
        }
        return this.f527;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f526;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static SupportErrorDialogFragment m745(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        if (dialog != null) {
            Dialog dialog2 = dialog;
            dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
            dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
            supportErrorDialogFragment.f527 = dialog2;
            if (onCancelListener != null) {
                supportErrorDialogFragment.f526 = onCancelListener;
            }
            return supportErrorDialogFragment;
        }
        throw new NullPointerException("Cannot display null dialog");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m746(C1550 r1, String str) {
        super.m171(r1, str);
    }
}
