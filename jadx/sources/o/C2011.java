package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.io.IOException;
import o.B;
import o.C3626z;

/* renamed from: o.ιʙ  reason: contains not printable characters */
public final class C2011 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final C3626z.C0279 f9964;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final PowerManager.WakeLock f9965 = ((PowerManager) this.f9966.f983.m1074().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: Ι  reason: contains not printable characters */
    final FirebaseInstanceId f9966;

    /* renamed from: ι  reason: contains not printable characters */
    private final long f9967;

    public C2011(FirebaseInstanceId firebaseInstanceId, C3626z.C0279 r2, long j) {
        this.f9966 = firebaseInstanceId;
        this.f9964 = r2;
        this.f9967 = j;
        this.f9965.setReferenceCounted(false);
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        if (C1911.m10386().m10389(this.f9966.f983.m1074())) {
            this.f9965.acquire();
        }
        try {
            boolean z = true;
            this.f9966.m1116(true);
            if (!(this.f9966.f981.m9979() != 0)) {
                this.f9966.m1116(false);
                if (C1911.m10386().m10389(this.f9966.f983.m1074())) {
                    this.f9965.release();
                    return;
                }
                return;
            }
            C1911 r1 = C1911.m10386();
            Context r3 = this.f9966.f983.m1074();
            if (r1.f9654 == null) {
                if (r3.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    z = false;
                }
                r1.f9654 = Boolean.valueOf(z);
            }
            if (!r1.f9654.booleanValue() || m10819()) {
                if (!m10818() || !this.f9964.m4104(this.f9966)) {
                    this.f9966.m1113(this.f9967);
                } else {
                    this.f9966.m1116(false);
                }
                if (C1911.m10386().m10389(this.f9966.f983.m1074())) {
                    this.f9965.release();
                    return;
                }
                return;
            }
            C1919 r12 = new C1919(this);
            FirebaseInstanceId.m1108();
            r12.f9679.f9966.f983.m1074().registerReceiver(r12, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            if (C1911.m10386().m10389(this.f9966.f983.m1074())) {
                this.f9965.release();
            }
        } catch (IOException e) {
            e.getMessage();
            this.f9966.m1116(false);
            if (C1911.m10386().m10389(this.f9966.f983.m1074())) {
                this.f9965.release();
            }
        } catch (Throwable th) {
            if (C1911.m10386().m10389(this.f9966.f983.m1074())) {
                this.f9965.release();
            }
            throw th;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean m10818() {
        C1918 r0 = FirebaseInstanceId.f978.m10280("", C1799.m9976(this.f9966.f983), "*");
        boolean z = true;
        if (!this.f9966.m1119(r0)) {
            return true;
        }
        try {
            FirebaseInstanceId firebaseInstanceId = this.f9966;
            String r5 = C1799.m9976(firebaseInstanceId.f983);
            if (Looper.getMainLooper() != Looper.myLooper()) {
                String r2 = FirebaseInstanceId.m1109("*");
                C0770 r6 = new C0770();
                r6.m6079(null);
                String r22 = ((C1086) firebaseInstanceId.m1114(r6.m4404(firebaseInstanceId.f987, new B.C0090(firebaseInstanceId, r5, r2)))).m7449();
                if (r22 == null) {
                    return false;
                }
                if ((r0 == null || !r22.equals(r0.f9678)) && "[DEFAULT]".equals(this.f9966.f983.m1076())) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        this.f9966.f983.m1076();
                    }
                    Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                    intent.putExtra("token", r22);
                    Context r23 = this.f9966.f983.m1074();
                    Intent intent2 = new Intent(r23, FirebaseInstanceIdReceiver.class);
                    intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                    intent2.putExtra("wrapped_intent", intent);
                    r23.sendBroadcast(intent2);
                }
                return true;
            }
            throw new IOException("MAIN_THREAD");
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                e.getMessage();
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m10819() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f9966.f983.m1074().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
