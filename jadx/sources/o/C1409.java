package o;

import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;

/* renamed from: o.ɪլ  reason: contains not printable characters */
public final /* synthetic */ class C1409 implements C2313 {

    /* renamed from: ι  reason: contains not printable characters */
    public static final C2313 f7707 = new C1409();

    private C1409() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m8594(C2298 r6) {
        FirebaseApp firebaseApp = (FirebaseApp) r6.m11973(FirebaseApp.class);
        r6.m11973(FirebaseInstanceId.class);
        C1757 r62 = (C1757) r6.m11973(C1757.class);
        if (r62 == null || !C1758.f9067.contains(new C1733("json"))) {
            r62 = new FirebaseMessagingRegistrar.C0078();
        }
        return new FirebaseMessaging(firebaseApp, r62);
    }
}
