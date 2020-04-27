package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import o.C0288;
import o.C2745;
import o.C3024;

/* renamed from: o.Ƹ  reason: contains not printable characters */
public final class C0812 extends C2730 implements C0288.C0290, C0288.C0289 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C3024.C3026<? extends C2879, C2562> f5299 = C2924.f13547;

    /* renamed from: ı  reason: contains not printable characters */
    private final C3024.C3026<? extends C2879, C2562> f5300;
    /* access modifiers changed from: private */

    /* renamed from: Ɩ  reason: contains not printable characters */
    public C0874 f5301;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Context f5302;

    /* renamed from: ɹ  reason: contains not printable characters */
    private C1273 f5303;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Handler f5304;

    /* renamed from: ι  reason: contains not printable characters */
    private Set<Scope> f5305;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C2879 f5306;

    public C0812(Context context, Handler handler, C1273 r4) {
        this(context, handler, r4, f5299);
    }

    public C0812(Context context, Handler handler, C1273 r3, C3024.C3026<? extends C2879, C2562> r4) {
        this.f5302 = context;
        this.f5304 = handler;
        this.f5303 = (C1273) C2745.C2746.m14559(r3, "ClientSettings must not be null");
        this.f5305 = r3.m8180();
        this.f5300 = r4;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6213(C0874 r10) {
        C2879 r0 = this.f5306;
        if (r0 != null) {
            r0.m15483();
        }
        this.f5303.m8176(Integer.valueOf(System.identityHashCode(this)));
        C3024.C3026<? extends C2879, C2562> r2 = this.f5300;
        Context context = this.f5302;
        Looper looper = this.f5304.getLooper();
        C1273 r5 = this.f5303;
        this.f5306 = (C2879) r2.m15479(context, looper, r5, r5.m8179(), (C0288.C0290) this, (C0288.C0289) this);
        this.f5301 = r10;
        Set<Scope> set = this.f5305;
        if (set == null || set.isEmpty()) {
            this.f5304.post(new C0762(this));
        } else {
            this.f5306.m14944();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6215() {
        C2879 r0 = this.f5306;
        if (r0 != null) {
            r0.m15483();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6216(Bundle bundle) {
        this.f5306.m14943(this);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6212(int i) {
        this.f5306.m15483();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6214(C2822 r2) {
        this.f5301.m6538(r2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6217(C2765 r3) {
        this.f5304.post(new C0841(this, r3));
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m6209(C2765 r4) {
        C2822 r0 = r4.m14628();
        if (r0.m14746()) {
            C1334 r42 = r4.m14629();
            C2822 r02 = r42.m8372();
            if (!r02.m14746()) {
                String valueOf = String.valueOf(r02);
                StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.f5301.m6538(r02);
                this.f5306.m15483();
                return;
            }
            this.f5301.m6539(r42.m8373(), this.f5305);
        } else {
            this.f5301.m6538(r0);
        }
        this.f5306.m15483();
    }
}
