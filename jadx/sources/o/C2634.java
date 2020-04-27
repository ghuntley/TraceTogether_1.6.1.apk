package o;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;

/* renamed from: o.ћ  reason: contains not printable characters */
final class C2634 implements C2538 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static C2634 f11976;

    /* renamed from: ı  reason: contains not printable characters */
    private final Context f11977;

    /* renamed from: ι  reason: contains not printable characters */
    private final ContentObserver f11978;

    /* renamed from: ǃ  reason: contains not printable characters */
    static C2634 m13955(Context context) {
        C2634 r2;
        synchronized (C2634.class) {
            if (f11976 == null) {
                f11976 = C2745.m14504(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C2634(context) : new C2634();
            }
            r2 = f11976;
        }
        return r2;
    }

    private C2634(Context context) {
        this.f11977 = context;
        this.f11978 = new C2644(this, (Handler) null);
        context.getContentResolver().registerContentObserver(C2524.f11463, true, this.f11978);
    }

    private C2634() {
        this.f11977 = null;
        this.f11978 = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m13958(String str) {
        if (this.f11977 == null) {
            return null;
        }
        try {
            return (String) C2779.m14670(new C2780(this, str));
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    static synchronized void m13954() {
        synchronized (C2634.class) {
            if (!(f11976 == null || f11976.f11977 == null || f11976.f11978 == null)) {
                f11976.f11977.getContentResolver().unregisterContentObserver(f11976.f11978);
            }
            f11976 = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ String m13957(String str) {
        return C2524.m13408(this.f11977.getContentResolver(), str, (String) null);
    }
}
