package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import o.C2319;
import o.C2918;

/* renamed from: o.յ  reason: contains not printable characters */
public class C3137 implements C2851 {

    /* renamed from: і  reason: contains not printable characters */
    private static final C3137 f14303 = new C3137();

    /* renamed from: ı  reason: contains not printable characters */
    final C2656 f14304 = new C2656(this);

    /* renamed from: ǃ  reason: contains not printable characters */
    boolean f14305 = true;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f14306 = 0;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f14307 = true;

    /* renamed from: Ι  reason: contains not printable characters */
    int f14308 = 0;

    /* renamed from: ι  reason: contains not printable characters */
    Handler f14309;

    /* renamed from: І  reason: contains not printable characters */
    C2918.C2919 f14310 = new C2918.C2919() {
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m15899() {
            C3137.this.m15895();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m15898() {
            C3137.this.m15897();
        }
    };

    /* renamed from: Ӏ  reason: contains not printable characters */
    Runnable f14311 = new Runnable() {
        public final void run() {
            C3137 r0 = C3137.this;
            if (r0.f14306 == 0) {
                r0.f14305 = true;
                r0.f14304.m14067(C2656.m14063(C2319.C2320.ON_PAUSE));
            }
            C3137.this.m15896();
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    static void m15894(Context context) {
        C3137 r0 = f14303;
        r0.f14309 = new Handler();
        r0.f14304.m14066(C2319.C2320.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C2374() {
            public void onActivityPreCreated(Activity activity, Bundle bundle) {
                activity.registerActivityLifecycleCallbacks(new C2374() {
                    public final void onActivityPostStarted(Activity activity) {
                        C3137.this.m15895();
                    }

                    public final void onActivityPostResumed(Activity activity) {
                        C3137.this.m15897();
                    }
                });
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (Build.VERSION.SDK_INT < 29) {
                    ((C2918) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f13540 = C3137.this.f14310;
                }
            }

            public void onActivityPaused(Activity activity) {
                C3137 r4 = C3137.this;
                r4.f14306--;
                if (r4.f14306 == 0) {
                    r4.f14309.postDelayed(r4.f14311, 700);
                }
            }

            public void onActivityStopped(Activity activity) {
                C3137 r2 = C3137.this;
                r2.f14308--;
                r2.m15896();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m15895() {
        this.f14308++;
        if (this.f14308 == 1 && this.f14307) {
            this.f14304.m14067(C2656.m14063(C2319.C2320.ON_START));
            this.f14307 = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15897() {
        this.f14306++;
        if (this.f14306 != 1) {
            return;
        }
        if (this.f14305) {
            this.f14304.m14067(C2656.m14063(C2319.C2320.ON_RESUME));
            this.f14305 = false;
            return;
        }
        this.f14309.removeCallbacks(this.f14311);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15896() {
        if (this.f14308 == 0 && this.f14305) {
            this.f14304.m14067(C2656.m14063(C2319.C2320.ON_STOP));
            this.f14307 = true;
        }
    }

    private C3137() {
    }

    public C2319 getLifecycle() {
        return this.f14304;
    }
}
