package o;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ƀ  reason: contains not printable characters */
public final class C0601 extends C2185 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final AtomicReference<Bundle> f4568 = new AtomicReference<>();

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f4569;

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5307(Bundle bundle) {
        synchronized (this.f4568) {
            try {
                this.f4568.set(bundle);
                this.f4569 = true;
                this.f4568.notify();
            } catch (Throwable th) {
                this.f4568.notify();
                throw th;
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m5309(long j) {
        return (String) m5306(m5308(j), String.class);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Bundle m5308(long j) {
        Bundle bundle;
        synchronized (this.f4568) {
            if (!this.f4569) {
                try {
                    this.f4568.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f4568.get();
        }
        return bundle;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <T> T m5306(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), new Object[]{canonicalName, canonicalName2}), e);
            throw e;
        }
    }
}
