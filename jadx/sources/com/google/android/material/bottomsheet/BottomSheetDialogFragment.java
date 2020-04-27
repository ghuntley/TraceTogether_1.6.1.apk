package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import o.C1411;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean f759;

    /* renamed from: Ι  reason: contains not printable characters */
    public Dialog m930(Bundle bundle) {
        return new C1411(getContext(), m170());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m929() {
        if (!m928(false)) {
            super.m167();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m931() {
        if (!m928(true)) {
            super.m173();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m928(boolean z) {
        Dialog r0 = m168();
        if (!(r0 instanceof C1411)) {
            return false;
        }
        C1411 r02 = (C1411) r0;
        BottomSheetBehavior<FrameLayout> behavior = r02.getBehavior();
        if (!behavior.f738 || !r02.getDismissWithAnimation()) {
            return false;
        }
        m926(behavior, z);
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m926(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.f759 = z;
        if (bottomSheetBehavior.f721 != 5) {
            if (m168() instanceof C1411) {
                ((C1411) m168()).removeDefaultCallback();
            }
            Cif ifVar = new Cif(this, (byte) 0);
            if (!bottomSheetBehavior.f736.contains(ifVar)) {
                bottomSheetBehavior.f736.add(ifVar);
            }
            bottomSheetBehavior.m909(5);
        } else if (this.f759) {
            super.m173();
        } else {
            super.m167();
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialogFragment$if  reason: invalid class name */
    class Cif extends BottomSheetBehavior.C0064 {
        private Cif() {
        }

        /* synthetic */ Cif(BottomSheetDialogFragment bottomSheetDialogFragment, byte b) {
            this();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m932(int i) {
            if (i == 5) {
                BottomSheetDialogFragment.m927(BottomSheetDialogFragment.this);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static /* synthetic */ void m927(BottomSheetDialogFragment bottomSheetDialogFragment) {
        if (bottomSheetDialogFragment.f759) {
            super.m173();
        } else {
            super.m167();
        }
    }
}
