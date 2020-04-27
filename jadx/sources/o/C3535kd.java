package o;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import o.C0638;

/* renamed from: o.kd  reason: case insensitive filesystem */
public class C3535kd extends C1459 implements DialogInterface.OnClickListener {

    /* renamed from: ı  reason: contains not printable characters */
    private int f2627;

    /* renamed from: Ι  reason: contains not printable characters */
    private C0638 f2628;

    public void onCreate(Bundle bundle) {
        C0638.Cif ifVar;
        super.onCreate(bundle);
        C3536ke r4 = C3536ke.m3261(getIntent(), this);
        this.f2627 = r4.f2636;
        if (r4.f2634 != -1) {
            ifVar = new C0638.Cif(r4.f2633, r4.f2634);
        } else {
            ifVar = new C0638.Cif(r4.f2633);
        }
        ifVar.f4628.f1171 = false;
        ifVar.f4628.f1167 = r4.f2635;
        ifVar.f4628.f1175 = r4.f2629;
        ifVar.f4628.f1169 = r4.f2631;
        ifVar.f4628.f1180 = this;
        ifVar.f4628.f1181 = r4.f2632;
        ifVar.f4628.f1179 = this;
        this.f2628 = ifVar.m5401();
    }

    public void onDestroy() {
        super.onDestroy();
        C0638 r0 = this.f2628;
        if (r0 != null && r0.isShowing()) {
            this.f2628.dismiss();
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), (String) null));
            data.addFlags(this.f2627);
            startActivityForResult(data, 7534);
        } else if (i == -2) {
            setResult(0);
            finish();
        } else {
            throw new IllegalStateException("Unknown button type: ".concat(String.valueOf(i)));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }
}
