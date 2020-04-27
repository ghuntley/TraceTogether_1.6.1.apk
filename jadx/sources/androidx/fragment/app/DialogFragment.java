package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import o.C1265;
import o.C1269;
import o.C1277;
import o.C1550;

public class DialogFragment extends C1277 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: ı  reason: contains not printable characters */
    DialogInterface.OnDismissListener f195 = new DialogInterface.OnDismissListener() {
        public final void onDismiss(DialogInterface dialogInterface) {
            if (DialogFragment.this.f201 != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onDismiss(dialogFragment.f201);
            }
        }
    };

    /* renamed from: Ɩ  reason: contains not printable characters */
    int f196 = -1;

    /* renamed from: ǃ  reason: contains not printable characters */
    boolean f197 = true;

    /* renamed from: ɨ  reason: contains not printable characters */
    boolean f198;

    /* renamed from: ɩ  reason: contains not printable characters */
    DialogInterface.OnCancelListener f199 = new DialogInterface.OnCancelListener() {
        public final void onCancel(DialogInterface dialogInterface) {
            if (DialogFragment.this.f201 != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onCancel(dialogFragment.f201);
            }
        }
    };

    /* renamed from: ɪ  reason: contains not printable characters */
    private Runnable f200 = new Runnable() {
        public final void run() {
            DialogFragment.this.f195.onDismiss(DialogFragment.this.f201);
        }
    };

    /* renamed from: ɹ  reason: contains not printable characters */
    Dialog f201;

    /* renamed from: Ι  reason: contains not printable characters */
    int f202 = 0;

    /* renamed from: ι  reason: contains not printable characters */
    int f203 = 0;

    /* renamed from: І  reason: contains not printable characters */
    boolean f204;

    /* renamed from: і  reason: contains not printable characters */
    boolean f205 = true;

    /* renamed from: Ӏ  reason: contains not printable characters */
    boolean f206;

    /* renamed from: ӏ  reason: contains not printable characters */
    private Handler f207;

    public void onCancel(DialogInterface dialogInterface) {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m174(int i, int i2) {
        this.f202 = i;
        int i3 = this.f202;
        if (i3 == 2 || i3 == 3) {
            this.f203 = 16973913;
        }
        if (i2 != 0) {
            this.f203 = i2;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m171(C1550 r4, String str) {
        this.f206 = false;
        this.f198 = true;
        C1265 r2 = new C1265(r4);
        r2.m9968(0, this, str, 1);
        r2.m9966();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m167() {
        m178(false, false);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m173() {
        m178(true, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m178(boolean z, boolean z2) {
        if (!this.f206) {
            this.f206 = true;
            this.f198 = false;
            Dialog dialog = this.f201;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f201.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f207.getLooper()) {
                        onDismiss(this.f201);
                    } else {
                        this.f207.post(this.f200);
                    }
                }
            }
            this.f204 = true;
            if (this.f196 >= 0) {
                C1550 parentFragmentManager = getParentFragmentManager();
                int i = this.f196;
                if (i >= 0) {
                    parentFragmentManager.m9092((C1550.C1553) new C1550.Cif((String) null, i, 1), false);
                    this.f196 = -1;
                    return;
                }
                throw new IllegalArgumentException("Bad id: ".concat(String.valueOf(i)));
            }
            C1265 r0 = new C1265(getParentFragmentManager());
            r0.m9965(this);
            if (z) {
                r0.m9957();
            } else {
                r0.m9966();
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public Dialog m168() {
        return this.f201;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Dialog m176() {
        Dialog r0 = m168();
        if (r0 != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public int m170() {
        return this.f203;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m169(boolean z) {
        this.f197 = z;
        Dialog dialog = this.f201;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m177(boolean z) {
        this.f205 = z;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (!this.f198) {
            this.f206 = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.f198 && !this.f206) {
            this.f206 = true;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f207 = new Handler();
        this.f205 = this.mContainerId == 0;
        if (bundle != null) {
            this.f202 = bundle.getInt("android:style", 0);
            this.f203 = bundle.getInt("android:theme", 0);
            this.f197 = bundle.getBoolean("android:cancelable", true);
            this.f205 = bundle.getBoolean("android:showsDialog", this.f205);
            this.f196 = bundle.getInt("android:backStackId", -1);
        }
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (!this.f205) {
            return super.onGetLayoutInflater(bundle);
        }
        this.f201 = m172(bundle);
        Dialog dialog = this.f201;
        if (dialog == null) {
            return (LayoutInflater) this.mHost.f7905.getSystemService("layout_inflater");
        }
        m175(dialog, this.f202);
        return (LayoutInflater) this.f201.getContext().getSystemService("layout_inflater");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m175(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public Dialog m172(Bundle bundle) {
        return new Dialog(requireContext(), m170());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f204) {
            m178(true, true);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        super.onActivityCreated(bundle);
        if (this.f205) {
            View view = getView();
            if (view != null) {
                if (view.getParent() == null) {
                    this.f201.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            C1269 activity = getActivity();
            if (activity != null) {
                this.f201.setOwnerActivity(activity);
            }
            this.f201.setCancelable(this.f197);
            this.f201.setOnCancelListener(this.f199);
            this.f201.setOnDismissListener(this.f195);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.f201.onRestoreInstanceState(bundle2);
            }
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.f201;
        if (dialog != null) {
            this.f204 = false;
            dialog.show();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f201;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f202;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f203;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f197;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f205;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f196;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.f201;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f201;
        if (dialog != null) {
            this.f204 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f201.dismiss();
            if (!this.f206) {
                onDismiss(this.f201);
            }
            this.f201 = null;
        }
    }
}
