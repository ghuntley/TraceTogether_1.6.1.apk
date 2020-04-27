package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import o.C0956;

public class AppCompatDialogFragment extends DialogFragment {
    /* renamed from: Ι  reason: contains not printable characters */
    public Dialog m100(Bundle bundle) {
        return new C0956(getContext(), m170());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m101(Dialog dialog, int i) {
        if (dialog instanceof C0956) {
            C0956 r0 = (C0956) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            r0.supportRequestWindowFeature(1);
            return;
        }
        super.m175(dialog, i);
    }
}
