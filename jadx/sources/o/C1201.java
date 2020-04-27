package o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* renamed from: o.ɨƗ  reason: contains not printable characters */
public abstract class C1201 implements DialogInterface.OnClickListener {
    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m7815();

    /* renamed from: ι  reason: contains not printable characters */
    public static C1201 m7814(Activity activity, Intent intent, int i) {
        return new C1610(intent, activity, i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1201 m7812(C1277 r1, Intent intent, int i) {
        return new C1515(intent, r1, i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C1201 m7813(C0485 r1, Intent intent, int i) {
        return new C1613(intent, r1, i);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            m7815();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
