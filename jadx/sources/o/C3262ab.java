package o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.ab  reason: case insensitive filesystem */
public final class C3262ab {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Application f1479;

    /* renamed from: Ι  reason: contains not printable characters */
    public Cif f1480;

    /* renamed from: o.ab$ǃ  reason: contains not printable characters */
    public static abstract class C0117 {
        /* renamed from: ı  reason: contains not printable characters */
        public void m1550(Activity activity) {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m1551(Activity activity, Bundle bundle) {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m1552(Activity activity) {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m1553(Activity activity) {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m1554(Activity activity, Bundle bundle) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m1555(Activity activity) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m1556(Activity activity) {
        }
    }

    public C3262ab(Context context) {
        this.f1479 = (Application) context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 14) {
            this.f1480 = new Cif(this.f1479);
        }
    }

    /* renamed from: o.ab$if  reason: invalid class name */
    public static class Cif {

        /* renamed from: Ι  reason: contains not printable characters */
        public final Set<Application.ActivityLifecycleCallbacks> f1481 = new HashSet();

        /* renamed from: ι  reason: contains not printable characters */
        public final Application f1482;

        Cif(Application application) {
            this.f1482 = application;
        }

        @TargetApi(14)
        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m1549(final C0117 r2) {
            if (this.f1482 == null) {
                return false;
            }
            AnonymousClass4 r0 = new Application.ActivityLifecycleCallbacks() {
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    C0117.this.m1551(activity, bundle);
                }

                public final void onActivityStarted(Activity activity) {
                    C0117.this.m1553(activity);
                }

                public final void onActivityResumed(Activity activity) {
                    C0117.this.m1556(activity);
                }

                public final void onActivityPaused(Activity activity) {
                    C0117.this.m1550(activity);
                }

                public final void onActivityStopped(Activity activity) {
                    C0117.this.m1555(activity);
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    C0117.this.m1554(activity, bundle);
                }

                public final void onActivityDestroyed(Activity activity) {
                    C0117.this.m1552(activity);
                }
            };
            this.f1482.registerActivityLifecycleCallbacks(r0);
            this.f1481.add(r0);
            return true;
        }
    }
}
