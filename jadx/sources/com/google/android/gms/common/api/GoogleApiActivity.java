package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepName;
import o.C0506;
import o.C2822;
import o.C2835;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f528 = 0;

    /* renamed from: ι  reason: contains not printable characters */
    public static Intent m748(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f528 = bundle.getInt("resolution");
        }
        if (this.f528 != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                    this.f528 = 1;
                } catch (IntentSender.SendIntentException unused) {
                    finish();
                }
            } else {
                C2835.f13281.m14791((Activity) this, num.intValue(), 2, (DialogInterface.OnCancelListener) this);
                this.f528 = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f528 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C0506 r4 = C0506.m4911(this);
                if (i2 == -1) {
                    r4.f4227.sendMessage(r4.f4227.obtainMessage(3));
                } else if (i2 == 0) {
                    C2822 r5 = new C2822(13, (PendingIntent) null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!r4.f4225.m14792(r4.f4216, r5, intExtra)) {
                        r4.f4227.sendMessage(r4.f4227.obtainMessage(5, intExtra, 0, r5));
                    }
                }
            }
        } else if (i == 2) {
            this.f528 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f528);
        super.onSaveInstanceState(bundle);
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f528 = 0;
        setResult(0);
        finish();
    }
}
