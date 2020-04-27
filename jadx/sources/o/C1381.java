package o;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Base64;
import java.util.concurrent.ExecutorService;
import o.B;

/* renamed from: o.ɪπ  reason: contains not printable characters */
public final class C1381 implements C1897 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Object f7602 = new Object();

    /* renamed from: Ι  reason: contains not printable characters */
    private static B f7603;

    /* renamed from: ı  reason: contains not printable characters */
    private final Context f7604;

    /* renamed from: ι  reason: contains not printable characters */
    private final ExecutorService f7605;

    public C1381(Context context, ExecutorService executorService) {
        this.f7604 = context;
        this.f7605 = executorService;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<Integer> m8530(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f7604;
        boolean z2 = (Build.VERSION.SDK_INT >= 26) && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        if (!z2 || z) {
            return C0309.m4375(this.f7605, new B.C0088(context, intent)).m4404(this.f7605, new B.C3252If(context, intent));
        }
        return m8528(context, "com.google.firebase.MESSAGING_EVENT").m1267(intent).m4418(C2324.m12102(), C2166.f10331);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static B m8528(Context context, String str) {
        B b;
        synchronized (f7602) {
            if (f7603 == null) {
                f7603 = new B(context, str);
            }
            b = f7603;
        }
        return b;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static final /* synthetic */ Integer m8529() {
        return -1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static final /* synthetic */ Integer m8527() {
        return 403;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final /* synthetic */ Integer m8526(Context context, Intent intent) {
        C1911 r0 = C1911.m10386();
        r0.f9656.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return Integer.valueOf(r0.m10388(context, intent2));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final /* synthetic */ C0329 m8525(Context context, Intent intent, C0329 r4) {
        return (!(Build.VERSION.SDK_INT >= 26) || ((Integer) r4.m4401()).intValue() != 402) ? r4 : m8528(context, "com.google.firebase.MESSAGING_EVENT").m1267(intent).m4418(C2324.m12102(), C2166.f10331).m4418(C2324.m12102(), C2308.f10720);
    }
}
