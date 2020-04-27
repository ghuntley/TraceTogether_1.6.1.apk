package o;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: o.ɼյ  reason: contains not printable characters */
public abstract class C1513 extends Service {

    /* renamed from: ı  reason: contains not printable characters */
    private final ExecutorService f8084;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Object f8085;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f8086;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f8087;

    /* renamed from: ι  reason: contains not printable characters */
    private Binder f8088;

    public C1513() {
        C1755 r0 = C1752.m9828();
        String simpleName = getClass().getSimpleName();
        this.f8084 = r0.m9833(new C1252(simpleName.length() != 0 ? "Firebase-".concat(simpleName) : new String("Firebase-"), (byte) 0), C1778.f9108);
        this.f8085 = new Object();
        this.f8086 = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public Intent m8955(Intent intent) {
        return intent;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m8956(Intent intent);

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m8958(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f8088 == null) {
            this.f8088 = new C2006(new fU(this));
        }
        return this.f8088;
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<Void> m8959(Intent intent) {
        if (m8958(intent)) {
            return C0309.m4374(null);
        }
        C3203 r0 = new C3203();
        this.f8084.execute(new cX(this, intent, r0));
        return r0.m16152();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f8085) {
            this.f8087 = i2;
            this.f8086++;
        }
        Intent r3 = m8955(intent);
        if (r3 == null) {
            m8954(intent);
            return 2;
        }
        C0329<Void> r32 = m8959(r3);
        if (r32.m4415()) {
            m8954(intent);
            return 2;
        }
        r32.m4407(C1587.f8432, (C3149<Void>) new C3538kg(this, intent));
        return 3;
    }

    public void onDestroy() {
        this.f8084.shutdown();
        super.onDestroy();
    }

    /* renamed from: І  reason: contains not printable characters */
    private final void m8954(Intent intent) {
        if (intent != null) {
            C2046.m10937(intent);
        }
        synchronized (this.f8085) {
            this.f8086--;
            if (this.f8086 == 0) {
                stopSelfResult(this.f8087);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ void m8957(Intent intent, C0329 r2) {
        m8954(intent);
    }
}
