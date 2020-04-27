package o;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import o.C2887;

/* renamed from: o.Գ  reason: contains not printable characters */
public final class C3013 extends C1202<C3151> implements C2972 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final Context f13902;

    /* renamed from: І  reason: contains not printable characters */
    private final C3167 f13903;

    public C3013(Context context, Looper looper, C1273 r10, C3167 r11, C0484 r12, C0586 r13) {
        super(context, looper, 112, r10, r12, r13);
        if (context != null) {
            this.f13902 = context;
            this.f13903 = r11;
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final String m15440() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final int m15445() {
        return C2877.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final String m15446() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final String m15439() {
        return this.f13903.f10754 ? this.f13902.getPackageName() : "com.google.android.gms";
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m15444() {
        return DynamiteModule.m798(this.f13902, "com.google.firebase.auth") == 0;
    }

    /* renamed from: ʟ  reason: contains not printable characters */
    public final Bundle m15442() {
        Bundle r0 = super.m7777();
        if (r0 == null) {
            r0 = new Bundle();
        }
        C3167 r1 = this.f13903;
        if (r1 != null) {
            r0.putString("com.google.firebase.auth.API_KEY", r1.f14422);
        }
        String r12 = C1335.f7361.m8374("firebase-auth");
        if (TextUtils.isEmpty(r12) || r12.equals("UNKNOWN")) {
            r12 = "-1";
        }
        r0.putString("com.google.firebase.auth.LIBRARY_VERSION", r12);
        return r0;
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    public final C2847[] m15441() {
        return C1272.f7175;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ IInterface m15443(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        if (queryLocalInterface instanceof C3151) {
            return (C3151) queryLocalInterface;
        }
        return new C3106(iBinder);
    }

    public final /* synthetic */ C3151 H_() {
        return (C3151) super.m7768();
    }

    static {
        new C2887.Cif("FirebaseAuth", "FirebaseAuth:");
    }
}
