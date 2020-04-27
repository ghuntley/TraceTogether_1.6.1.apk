package o;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.FirebaseApp;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o.C1298;

/* renamed from: o.вɩ  reason: contains not printable characters */
public final class C2400 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1799 f10960;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final FirebaseApp f10961;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Executor f10962;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1971 f10963;

    /* renamed from: ι  reason: contains not printable characters */
    public final C1917 f10964;

    /* renamed from: і  reason: contains not printable characters */
    private final C3035 f10965;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C1298 f10966;

    public C2400(FirebaseApp firebaseApp, C1799 r10, Executor executor, C1971 r12, C1298 r13, C3035 r14) {
        this(firebaseApp, r10, executor, new C1917(firebaseApp.m1074(), r10), r12, r13, r14);
    }

    private C2400(FirebaseApp firebaseApp, C1799 r2, Executor executor, C1917 r4, C1971 r5, C1298 r6, C3035 r7) {
        this.f10961 = firebaseApp;
        this.f10960 = r2;
        this.f10964 = r4;
        this.f10962 = executor;
        this.f10963 = r5;
        this.f10966 = r6;
        this.f10965 = r7;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0329<Bundle> m12423(String str, String str2, String str3, Bundle bundle) {
        C3203 r7 = new C3203();
        this.f10962.execute(new S(this, str, str2, str3, bundle, r7));
        return r7.f14555;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final String m12421() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.f10961.m1076().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Bundle m12422(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f10961.m1075().f8951);
        bundle.putString("gmsv", Integer.toString(this.f10960.m9980()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f10960.m9978());
        bundle.putString("app_ver_name", this.f10960.m9981());
        bundle.putString("firebase-app-name-hash", m12421());
        try {
            String r2 = ((C2942) C0309.m4376(this.f10965.m15501())).m15197();
            if (!TextUtils.isEmpty(r2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", r2);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        String r22 = C1335.f7361.m8374("firebase-iid");
        if ("UNKNOWN".equals(r22)) {
            int i = C2837.f13285;
            StringBuilder sb = new StringBuilder(19);
            sb.append("unknown_");
            sb.append(i);
            r22 = sb.toString();
        }
        String valueOf = String.valueOf(r22);
        bundle.putString("cliv", valueOf.length() != 0 ? "fiid-".concat(valueOf) : new String("fiid-"));
        C1298.C1299 r23 = this.f10966.m8241("fire-iid");
        if (r23 != C1298.C1299.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(r23.f7277));
            bundle.putString("Firebase-Client", this.f10963.m10705());
        }
        return bundle;
    }
}
