package pub.devrel.easypermissions;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;
import o.C0638;
import o.C3538kg;
import o.C3539kh;
import o.C3541kj;

public class RationaleDialogFragmentCompat extends AppCompatDialogFragment {

    /* renamed from: ӏ  reason: contains not printable characters */
    private C3538kg.If f14584;

    /* renamed from: ι  reason: contains not printable characters */
    public static RationaleDialogFragmentCompat m16168(String str, String str2, String str3, int i, int i2, String[] strArr) {
        RationaleDialogFragmentCompat rationaleDialogFragmentCompat = new RationaleDialogFragmentCompat();
        rationaleDialogFragmentCompat.setArguments(new C3539kh(str2, str3, str, i, i2, strArr).m3273());
        return rationaleDialogFragmentCompat;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof C3538kg.If) {
                this.f14584 = (C3538kg.If) getParentFragment();
            }
            if (getParentFragment() instanceof C3538kg.C0198) {
                getParentFragment();
            }
        }
        if (context instanceof C3538kg.If) {
            this.f14584 = (C3538kg.If) context;
        }
    }

    public void onDetach() {
        super.onDetach();
        this.f14584 = null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public Dialog m16169(Bundle bundle) {
        C0638.Cif ifVar;
        m169(false);
        C3539kh khVar = new C3539kh(getArguments());
        C3541kj kjVar = new C3541kj(this, khVar, this.f14584);
        Context context = getContext();
        if (khVar.f2653 > 0) {
            ifVar = new C0638.Cif(context, khVar.f2653);
        } else {
            ifVar = new C0638.Cif(context);
        }
        ifVar.f4628.f1171 = false;
        ifVar.f4628.f1169 = khVar.f2656;
        ifVar.f4628.f1180 = kjVar;
        ifVar.f4628.f1181 = khVar.f2655;
        ifVar.f4628.f1179 = kjVar;
        ifVar.f4628.f1175 = khVar.f2657;
        return ifVar.m5399();
    }
}
