package o;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.firebase.FirebaseApp;
import o.C2887;

/* renamed from: o.ıв  reason: contains not printable characters */
public final class C0408 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2887.Cif f3968 = new C2887.Cif("TokenRefresher", "FirebaseAuth:");

    /* renamed from: ı  reason: contains not printable characters */
    public Handler f3969;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private HandlerThread f3970;

    /* renamed from: ɩ  reason: contains not printable characters */
    public volatile long f3971;

    /* renamed from: Ι  reason: contains not printable characters */
    public Runnable f3972;

    /* renamed from: ι  reason: contains not printable characters */
    public volatile long f3973;

    /* renamed from: І  reason: contains not printable characters */
    private final FirebaseApp f3974;

    public C0408(FirebaseApp firebaseApp) {
        if (firebaseApp != null) {
            this.f3974 = firebaseApp;
            this.f3970 = new HandlerThread("TokenRefresher", 10);
            this.f3970.start();
            this.f3969 = new C1603(this.f3970.getLooper());
            this.f3972 = new C1315(this, this.f3974.m1076());
            return;
        }
        throw new NullPointerException("null reference");
    }
}
