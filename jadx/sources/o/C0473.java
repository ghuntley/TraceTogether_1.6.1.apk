package o;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.ĸı  reason: contains not printable characters */
public final class C0473 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: ι  reason: contains not printable characters */
    public static final C0473 f4096 = new C0473();

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f4097 = false;

    /* renamed from: ǃ  reason: contains not printable characters */
    final AtomicBoolean f4098 = new AtomicBoolean();

    /* renamed from: ɩ  reason: contains not printable characters */
    final AtomicBoolean f4099 = new AtomicBoolean();

    /* renamed from: Ι  reason: contains not printable characters */
    public final ArrayList<C0474> f4100 = new ArrayList<>();

    /* renamed from: o.ĸı$ǃ  reason: contains not printable characters */
    public interface C0474 {
        /* renamed from: ı  reason: contains not printable characters */
        void m4806(boolean z);
    }

    private C0473() {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m4804(Application application) {
        synchronized (f4096) {
            if (!f4096.f4097) {
                application.registerActivityLifecycleCallbacks(f4096);
                application.registerComponentCallbacks(f4096);
                f4096.f4097 = true;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f4098.compareAndSet(true, false);
        this.f4099.set(true);
        if (compareAndSet) {
            m4805(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f4098.compareAndSet(true, false);
        this.f4099.set(true);
        if (compareAndSet) {
            m4805(false);
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f4098.compareAndSet(false, true)) {
            this.f4099.set(true);
            m4805(true);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m4805(boolean z) {
        synchronized (f4096) {
            ArrayList arrayList = this.f4100;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C0474) obj).m4806(z);
            }
        }
    }
}
