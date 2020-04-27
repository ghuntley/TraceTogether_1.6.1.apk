package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.ɍӏ  reason: contains not printable characters */
class C1085 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final IntentFilter f6474 = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final IntentFilter f6475 = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final IntentFilter f6476 = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final BroadcastReceiver f6477 = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            boolean unused = C1085.this.f6481 = true;
        }
    };

    /* renamed from: Ι  reason: contains not printable characters */
    private final AtomicBoolean f6478 = new AtomicBoolean(false);

    /* renamed from: ι  reason: contains not printable characters */
    private final Context f6479;

    /* renamed from: І  reason: contains not printable characters */
    private final BroadcastReceiver f6480 = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            boolean unused = C1085.this.f6481 = false;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: Ӏ  reason: contains not printable characters */
    public boolean f6481;

    public C1085(Context context) {
        this.f6479 = context;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m7445() {
        boolean z = true;
        if (!this.f6478.getAndSet(true)) {
            Intent registerReceiver = this.f6479.registerReceiver((BroadcastReceiver) null, f6475);
            int i = -1;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("status", -1);
            }
            if (!(i == 2 || i == 5)) {
                z = false;
            }
            this.f6481 = z;
            this.f6479.registerReceiver(this.f6477, f6476);
            this.f6479.registerReceiver(this.f6480, f6474);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m7447() {
        return this.f6481;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7446() {
        if (this.f6478.getAndSet(false)) {
            this.f6479.unregisterReceiver(this.f6477);
            this.f6479.unregisterReceiver(this.f6480);
        }
    }
}
