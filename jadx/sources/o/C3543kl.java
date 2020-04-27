package o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import o.C3538kg;

/* renamed from: o.kl  reason: case insensitive filesystem */
public final class C3543kl extends DialogFragment {

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f2662 = false;

    /* renamed from: Ι  reason: contains not printable characters */
    private C3538kg.If f2663;

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (Build.VERSION.SDK_INT >= 17 && getParentFragment() != null) {
            if (getParentFragment() instanceof C3538kg.If) {
                this.f2663 = (C3538kg.If) getParentFragment();
            }
            if (getParentFragment() instanceof C3538kg.C0198) {
                getParentFragment();
            }
        }
        if (context instanceof C3538kg.If) {
            this.f2663 = (C3538kg.If) context;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f2662 = true;
        super.onSaveInstanceState(bundle);
    }

    public final void onDetach() {
        super.onDetach();
        this.f2663 = null;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder;
        setCancelable(false);
        C3539kh khVar = new C3539kh(getArguments());
        C3541kj kjVar = new C3541kj(this, khVar, this.f2663);
        Activity activity = getActivity();
        if (khVar.f2653 > 0) {
            builder = new AlertDialog.Builder(activity, khVar.f2653);
        } else {
            builder = new AlertDialog.Builder(activity);
        }
        return builder.setCancelable(false).setPositiveButton(khVar.f2656, kjVar).setNegativeButton(khVar.f2655, kjVar).setMessage(khVar.f2657).create();
    }
}
